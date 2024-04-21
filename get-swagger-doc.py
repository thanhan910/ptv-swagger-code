import requests
import json
import os

if __name__ == "__main__":

    current_dir = os.path.dirname(os.path.realpath(__file__))
    # output_dir = os.path.join(current_dir, "../swagger-codegen")
    output_dir = current_dir
    os.makedirs(output_dir, exist_ok=True)

    swagger_file = os.path.join(output_dir, "swagger.json")
    swagger_url = "https://timetableapi.ptv.vic.gov.au/swagger/docs/v3"

    docs: dict[str, dict] = requests.get(swagger_url).json()

    for path, path_obj in docs["paths"].items():
        # assert path_obj['get']['responses']['200']['schema']['$ref'] exist
        assert (
            "get" in path_obj
            and "responses" in path_obj["get"]
            and "200" in path_obj["get"]["responses"]
            and "schema" in path_obj["get"]["responses"]["200"]
            and "$ref" in path_obj["get"]["responses"]["200"]["schema"]
        ), f"Missing ['get']['responses']['200']['schema']['$ref'] for {path}"
        returntype = path_obj["get"]["responses"]["200"]["schema"]["$ref"].split(
            "#/definitions/", 1
        )[1]
        if returntype not in docs["definitions"]:
            assert (
                path == "/v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone}"
            ) and (
                returntype == "V3.FareEstimateResponse"
            ), f"Unknown return type {returntype} for {path}"
            # del docs["paths"][path]['get']['responses']['200']['schema']['$ref']
            # print(f"Updated {path} to use type object instead of $ref {returntype}")
            new_schema = {
                "V3.FareEstimateResponse": {
                    "type": "object",
                    "properties": {
                        "FareEstimateResultStatus": {
                            "$ref": "#/definitions/V3.FareEstimateResultStatus"
                        },
                        "FareEstimateResult": {
                            "$ref": "#/definitions/V3.FareEstimateResult"
                        },
                    },
                },
                "V3.FareEstimateResultStatus": {
                    "type": "object",
                    "properties": {
                        "StatusCode": {"type": "integer"},
                        "Message": {"type": "string"},
                    },
                },
                "V3.FareEstimateResult": {
                    "type": "object",
                    "properties": {
                        "IsEarlyBird": {"type": "boolean"},
                        "IsJourneyInFreeTramZone": {"type": "boolean"},
                        "IsThisWeekendJourney": {"type": "boolean"},
                        "ZoneInfo": {"$ref": "#/definitions/V3.ZoneInfo"},
                        "PassengerFares": {
                            "type": "array",
                            "items": {"$ref": "#/definitions/V3.PassengerFare"},
                        },
                    },
                },
                "V3.ZoneInfo": {
                    "type": "object",
                    "properties": {
                        "MinZone": {"type": "integer"},
                        "MaxZone": {"type": "integer"},
                        "UniqueZones": {"type": "array", "items": {"type": "integer"}},
                    },
                },
                "V3.PassengerFare": {
                    "type": "object",
                    "properties": {
                        "PassengerType": {"type": "string"},
                        "Fare2HourPeak": {"type": "number"},
                        "Fare2HourOffPeak": {"type": "number"},
                        "FareDailyPeak": {"type": "number"},
                        "FareDailyOffPeak": {"type": "number"},
                        "Pass7Days": {"type": "number"},
                        "Pass28To69DayPerDay": {"type": "number"},
                        "Pass70PlusDayPerDay": {"type": "number"},
                        "WeekendCap": {"type": "number"},
                        "HolidayCap": {"type": "number"},
                    },
                },
            }
            assert all(
                key not in docs["definitions"] for key in new_schema
            ), f"Duplicate key in definitions {new_schema.keys()}"
            docs["definitions"].update(new_schema)

    with open(swagger_file, "w") as f:
        json.dump(docs, f, indent=2)
