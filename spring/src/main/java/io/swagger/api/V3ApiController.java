package io.swagger.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.model.V3DeparturesResponse;
import io.swagger.model.V3DirectionsResponse;
import io.swagger.model.V3DisruptionModesResponse;
import io.swagger.model.V3DisruptionResponse;
import io.swagger.model.V3DisruptionsResponse;
import io.swagger.model.V3ErrorResponse;
import io.swagger.model.V3FareEstimateResponse;
import io.swagger.model.V3OutletGeolocationResponse;
import io.swagger.model.V3OutletResponse;
import io.swagger.model.V3RouteResponse;
import io.swagger.model.V3RouteTypesResponse;
import io.swagger.model.V3RunResponse;
import io.swagger.model.V3RunsResponse;
import io.swagger.model.V3SearchResult;
import io.swagger.model.V3StopResponse;
import io.swagger.model.V3StoppingPattern;
import io.swagger.model.V3StopsByDistanceResponse;
import io.swagger.model.V3StopsOnRouteResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")
@RestController
public class V3ApiController implements V3Api {

    private static final Logger log = LoggerFactory.getLogger(V3ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V3ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<V3DeparturesResponse> departuresGetForStop(@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API", required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @PathVariable("route_type") Integer routeType
,@Parameter(in = ParameterIn.PATH, description = "Identifier of stop; values returned by Stops API", required=true, schema=@Schema()) @PathVariable("stop_id") Integer stopId
,@Parameter(in = ParameterIn.QUERY, description = "Filter by platform number at stop" ,schema=@Schema()) @Valid @RequestParam(value = "platform_numbers", required = false) List<Integer> platformNumbers
,@Parameter(in = ParameterIn.QUERY, description = "Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}" ,schema=@Schema()) @Valid @RequestParam(value = "direction_id", required = false) Integer directionId
,@Parameter(in = ParameterIn.QUERY, description = "Indicates that stop_id parameter will accept \"GTFS stop_id\" data" ,schema=@Schema()) @Valid @RequestParam(value = "gtfs", required = false) Boolean gtfs
,@Parameter(in = ParameterIn.QUERY, description = "Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)" ,schema=@Schema()) @Valid @RequestParam(value = "date_utc", required = false) OffsetDateTime dateUtc
,@Parameter(in = ParameterIn.QUERY, description = "Maximum number of results returned" ,schema=@Schema()) @Valid @RequestParam(value = "max_results", required = false) Integer maxResults
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only" ,schema=@Schema()) @Valid @RequestParam(value = "include_cancelled", required = false) Boolean includeCancelled
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0." ,schema=@Schema()) @Valid @RequestParam(value = "look_backwards", required = false) Boolean lookBackwards
,@Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information." ,schema=@Schema(allowableValues={ "All", "Stop", "Route", "Run", "Direction", "Disruption", "VehicleDescriptor", "VehiclePosition", "None" }
)) @Valid @RequestParam(value = "expand", required = false) List<String> expand
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if the route geopath should be returned" ,schema=@Schema()) @Valid @RequestParam(value = "include_geopath", required = false) Boolean includeGeopath
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3DeparturesResponse>(objectMapper.readValue("{\r\n  \"routes\" : {\r\n    \"key\" : { }\r\n  },\r\n  \"directions\" : {\r\n    \"key\" : {\r\n      \"direction_id\" : 9,\r\n      \"route_id\" : 6,\r\n      \"route_type\" : 3,\r\n      \"direction_name\" : \"direction_name\"\r\n    }\r\n  },\r\n  \"disruptions\" : {\r\n    \"key\" : {\r\n      \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_type\" : \"disruption_type\",\r\n      \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"description\" : \"description\",\r\n      \"display_on_board\" : true,\r\n      \"title\" : \"title\",\r\n      \"url\" : \"url\",\r\n      \"routes\" : [ {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      }, {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      } ],\r\n      \"disruption_id\" : 6,\r\n      \"colour\" : \"colour\",\r\n      \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_status\" : \"disruption_status\",\r\n      \"stops\" : [ {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      }, {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      } ],\r\n      \"display_status\" : true\r\n    }\r\n  },\r\n  \"stops\" : {\r\n    \"key\" : {\r\n      \"stop_longitude\" : 4.145608,\r\n      \"stop_sequence\" : 7,\r\n      \"stop_id\" : 9,\r\n      \"route_type\" : 3,\r\n      \"stop_landmark\" : \"stop_landmark\",\r\n      \"stop_suburb\" : \"stop_suburb\",\r\n      \"stop_distance\" : 7.0614014,\r\n      \"stop_name\" : \"stop_name\",\r\n      \"stop_latitude\" : 2.027123\r\n    }\r\n  },\r\n  \"departures\" : [ {\r\n    \"scheduled_departure_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"direction_id\" : 5,\r\n    \"route_id\" : 6,\r\n    \"run_id\" : 1,\r\n    \"estimated_departure_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"departure_sequence\" : 2,\r\n    \"stop_id\" : 0,\r\n    \"run_ref\" : \"run_ref\",\r\n    \"platform_number\" : \"platform_number\",\r\n    \"flags\" : \"flags\",\r\n    \"disruption_ids\" : [ 5, 5 ],\r\n    \"at_platform\" : true\r\n  }, {\r\n    \"scheduled_departure_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"direction_id\" : 5,\r\n    \"route_id\" : 6,\r\n    \"run_id\" : 1,\r\n    \"estimated_departure_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"departure_sequence\" : 2,\r\n    \"stop_id\" : 0,\r\n    \"run_ref\" : \"run_ref\",\r\n    \"platform_number\" : \"platform_number\",\r\n    \"flags\" : \"flags\",\r\n    \"disruption_ids\" : [ 5, 5 ],\r\n    \"at_platform\" : true\r\n  } ],\r\n  \"runs\" : {\r\n    \"key\" : {\r\n      \"run_id\" : 1,\r\n      \"route_id\" : 1,\r\n      \"final_stop_id\" : 6,\r\n      \"destination_name\" : \"destination_name\",\r\n      \"vehicle_descriptor\" : {\r\n        \"low_floor\" : true,\r\n        \"air_conditioned\" : true,\r\n        \"supplier\" : \"supplier\",\r\n        \"length\" : \"length\",\r\n        \"description\" : \"description\",\r\n        \"id\" : \"id\",\r\n        \"operator\" : \"operator\"\r\n      },\r\n      \"run_sequence\" : 1,\r\n      \"direction_id\" : 7,\r\n      \"run_ref\" : \"run_ref\",\r\n      \"route_type\" : 1,\r\n      \"vehicle_position\" : {\r\n        \"easting\" : 9.369310271410669,\r\n        \"bearing\" : 8.762042012749001,\r\n        \"datetime_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n        \"latitude\" : 5.025004791520295,\r\n        \"supplier\" : \"supplier\",\r\n        \"expiry_time\" : \"2000-01-23T04:56:07.000+00:00\",\r\n        \"northing\" : 6.683562403749608,\r\n        \"longitude\" : 9.965781217890562,\r\n        \"direction\" : \"direction\"\r\n      },\r\n      \"express_stop_count\" : 4,\r\n      \"geopath\" : [ { }, { } ],\r\n      \"status\" : \"status\"\r\n    }\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3DeparturesResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3DeparturesResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3DeparturesResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3DeparturesResponse> departuresGetForStopAndRoute(@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API", required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @PathVariable("route_type") Integer routeType
,@Parameter(in = ParameterIn.PATH, description = "Identifier of stop; values returned by Stops API", required=true, schema=@Schema()) @PathVariable("stop_id") Integer stopId
,@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes", required=true, schema=@Schema()) @PathVariable("route_id") String routeId
,@Parameter(in = ParameterIn.QUERY, description = "Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}" ,schema=@Schema()) @Valid @RequestParam(value = "direction_id", required = false) Integer directionId
,@Parameter(in = ParameterIn.QUERY, description = "Indicates that stop_id parameter will accept \"GTFS stop_id\" data" ,schema=@Schema()) @Valid @RequestParam(value = "gtfs", required = false) Boolean gtfs
,@Parameter(in = ParameterIn.QUERY, description = "Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)" ,schema=@Schema()) @Valid @RequestParam(value = "date_utc", required = false) OffsetDateTime dateUtc
,@Parameter(in = ParameterIn.QUERY, description = "Maximum number of results returned" ,schema=@Schema()) @Valid @RequestParam(value = "max_results", required = false) Integer maxResults
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only" ,schema=@Schema()) @Valid @RequestParam(value = "include_cancelled", required = false) Boolean includeCancelled
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0." ,schema=@Schema()) @Valid @RequestParam(value = "look_backwards", required = false) Boolean lookBackwards
,@Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information." ,schema=@Schema(allowableValues={ "All", "Stop", "Route", "Run", "Direction", "Disruption", "VehicleDescriptor", "VehiclePosition", "None" }
)) @Valid @RequestParam(value = "expand", required = false) List<String> expand
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if the route geopath should be returned" ,schema=@Schema()) @Valid @RequestParam(value = "include_geopath", required = false) Boolean includeGeopath
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3DeparturesResponse>(objectMapper.readValue("{\r\n  \"routes\" : {\r\n    \"key\" : { }\r\n  },\r\n  \"directions\" : {\r\n    \"key\" : {\r\n      \"direction_id\" : 9,\r\n      \"route_id\" : 6,\r\n      \"route_type\" : 3,\r\n      \"direction_name\" : \"direction_name\"\r\n    }\r\n  },\r\n  \"disruptions\" : {\r\n    \"key\" : {\r\n      \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_type\" : \"disruption_type\",\r\n      \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"description\" : \"description\",\r\n      \"display_on_board\" : true,\r\n      \"title\" : \"title\",\r\n      \"url\" : \"url\",\r\n      \"routes\" : [ {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      }, {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      } ],\r\n      \"disruption_id\" : 6,\r\n      \"colour\" : \"colour\",\r\n      \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_status\" : \"disruption_status\",\r\n      \"stops\" : [ {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      }, {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      } ],\r\n      \"display_status\" : true\r\n    }\r\n  },\r\n  \"stops\" : {\r\n    \"key\" : {\r\n      \"stop_longitude\" : 4.145608,\r\n      \"stop_sequence\" : 7,\r\n      \"stop_id\" : 9,\r\n      \"route_type\" : 3,\r\n      \"stop_landmark\" : \"stop_landmark\",\r\n      \"stop_suburb\" : \"stop_suburb\",\r\n      \"stop_distance\" : 7.0614014,\r\n      \"stop_name\" : \"stop_name\",\r\n      \"stop_latitude\" : 2.027123\r\n    }\r\n  },\r\n  \"departures\" : [ {\r\n    \"scheduled_departure_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"direction_id\" : 5,\r\n    \"route_id\" : 6,\r\n    \"run_id\" : 1,\r\n    \"estimated_departure_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"departure_sequence\" : 2,\r\n    \"stop_id\" : 0,\r\n    \"run_ref\" : \"run_ref\",\r\n    \"platform_number\" : \"platform_number\",\r\n    \"flags\" : \"flags\",\r\n    \"disruption_ids\" : [ 5, 5 ],\r\n    \"at_platform\" : true\r\n  }, {\r\n    \"scheduled_departure_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"direction_id\" : 5,\r\n    \"route_id\" : 6,\r\n    \"run_id\" : 1,\r\n    \"estimated_departure_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"departure_sequence\" : 2,\r\n    \"stop_id\" : 0,\r\n    \"run_ref\" : \"run_ref\",\r\n    \"platform_number\" : \"platform_number\",\r\n    \"flags\" : \"flags\",\r\n    \"disruption_ids\" : [ 5, 5 ],\r\n    \"at_platform\" : true\r\n  } ],\r\n  \"runs\" : {\r\n    \"key\" : {\r\n      \"run_id\" : 1,\r\n      \"route_id\" : 1,\r\n      \"final_stop_id\" : 6,\r\n      \"destination_name\" : \"destination_name\",\r\n      \"vehicle_descriptor\" : {\r\n        \"low_floor\" : true,\r\n        \"air_conditioned\" : true,\r\n        \"supplier\" : \"supplier\",\r\n        \"length\" : \"length\",\r\n        \"description\" : \"description\",\r\n        \"id\" : \"id\",\r\n        \"operator\" : \"operator\"\r\n      },\r\n      \"run_sequence\" : 1,\r\n      \"direction_id\" : 7,\r\n      \"run_ref\" : \"run_ref\",\r\n      \"route_type\" : 1,\r\n      \"vehicle_position\" : {\r\n        \"easting\" : 9.369310271410669,\r\n        \"bearing\" : 8.762042012749001,\r\n        \"datetime_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n        \"latitude\" : 5.025004791520295,\r\n        \"supplier\" : \"supplier\",\r\n        \"expiry_time\" : \"2000-01-23T04:56:07.000+00:00\",\r\n        \"northing\" : 6.683562403749608,\r\n        \"longitude\" : 9.965781217890562,\r\n        \"direction\" : \"direction\"\r\n      },\r\n      \"express_stop_count\" : 4,\r\n      \"geopath\" : [ { }, { } ],\r\n      \"status\" : \"status\"\r\n    }\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3DeparturesResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3DeparturesResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3DeparturesResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3DirectionsResponse> directionsForDirection(@Parameter(in = ParameterIn.PATH, description = "Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}", required=true, schema=@Schema()) @PathVariable("direction_id") Integer directionId
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3DirectionsResponse>(objectMapper.readValue("{\r\n  \"directions\" : [ {\r\n    \"direction_id\" : 0,\r\n    \"route_id\" : 6,\r\n    \"route_type\" : 1,\r\n    \"direction_name\" : \"direction_name\",\r\n    \"route_direction_description\" : \"route_direction_description\"\r\n  }, {\r\n    \"direction_id\" : 0,\r\n    \"route_id\" : 6,\r\n    \"route_type\" : 1,\r\n    \"direction_name\" : \"direction_name\",\r\n    \"route_direction_description\" : \"route_direction_description\"\r\n  } ],\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3DirectionsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3DirectionsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3DirectionsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3DirectionsResponse> directionsForDirectionAndType(@Parameter(in = ParameterIn.PATH, description = "Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}", required=true, schema=@Schema()) @PathVariable("direction_id") Integer directionId
,@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API", required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @PathVariable("route_type") Integer routeType
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3DirectionsResponse>(objectMapper.readValue("{\r\n  \"directions\" : [ {\r\n    \"direction_id\" : 0,\r\n    \"route_id\" : 6,\r\n    \"route_type\" : 1,\r\n    \"direction_name\" : \"direction_name\",\r\n    \"route_direction_description\" : \"route_direction_description\"\r\n  }, {\r\n    \"direction_id\" : 0,\r\n    \"route_id\" : 6,\r\n    \"route_type\" : 1,\r\n    \"direction_name\" : \"direction_name\",\r\n    \"route_direction_description\" : \"route_direction_description\"\r\n  } ],\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3DirectionsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3DirectionsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3DirectionsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3DirectionsResponse> directionsForRoute(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes", required=true, schema=@Schema()) @PathVariable("route_id") Integer routeId
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3DirectionsResponse>(objectMapper.readValue("{\r\n  \"directions\" : [ {\r\n    \"direction_id\" : 0,\r\n    \"route_id\" : 6,\r\n    \"route_type\" : 1,\r\n    \"direction_name\" : \"direction_name\",\r\n    \"route_direction_description\" : \"route_direction_description\"\r\n  }, {\r\n    \"direction_id\" : 0,\r\n    \"route_id\" : 6,\r\n    \"route_type\" : 1,\r\n    \"direction_name\" : \"direction_name\",\r\n    \"route_direction_description\" : \"route_direction_description\"\r\n  } ],\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3DirectionsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3DirectionsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3DirectionsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3DisruptionsResponse> disruptionsGetAllDisruptions(@Parameter(in = ParameterIn.QUERY, description = "Filter by route_type; values returned via RouteTypes API" ,schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @Valid @RequestParam(value = "route_types", required = false) List<Integer> routeTypes
,@Parameter(in = ParameterIn.QUERY, description = "Filter by disruption_mode; values returned via v3/disruptions/modes API" ,schema=@Schema(allowableValues={ "1", "2", "3", "4", "5", "7", "8", "9", "10", "11", "12", "13", "14", "100" }
)) @Valid @RequestParam(value = "disruption_modes", required = false) List<Integer> disruptionModes
,@Parameter(in = ParameterIn.QUERY, description = "Filter by status of disruption" ,schema=@Schema(allowableValues={ "current", "planned" }
)) @Valid @RequestParam(value = "disruption_status", required = false) String disruptionStatus
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3DisruptionsResponse>(objectMapper.readValue("{\r\n  \"disruptions\" : {\r\n    \"metro_bus\" : [ null, null ],\r\n    \"skybus\" : [ null, null ],\r\n    \"metro_train\" : [ null, null ],\r\n    \"regional_coach\" : [ null, null ],\r\n    \"regional_bus\" : [ null, null ],\r\n    \"taxi\" : [ null, null ],\r\n    \"regional_train\" : [ null, null ],\r\n    \"general\" : [ {\r\n      \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_type\" : \"disruption_type\",\r\n      \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"description\" : \"description\",\r\n      \"display_on_board\" : true,\r\n      \"title\" : \"title\",\r\n      \"url\" : \"url\",\r\n      \"routes\" : [ {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      }, {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      } ],\r\n      \"disruption_id\" : 6,\r\n      \"colour\" : \"colour\",\r\n      \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_status\" : \"disruption_status\",\r\n      \"stops\" : [ {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      }, {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      } ],\r\n      \"display_status\" : true\r\n    }, {\r\n      \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_type\" : \"disruption_type\",\r\n      \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"description\" : \"description\",\r\n      \"display_on_board\" : true,\r\n      \"title\" : \"title\",\r\n      \"url\" : \"url\",\r\n      \"routes\" : [ {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      }, {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      } ],\r\n      \"disruption_id\" : 6,\r\n      \"colour\" : \"colour\",\r\n      \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_status\" : \"disruption_status\",\r\n      \"stops\" : [ {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      }, {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      } ],\r\n      \"display_status\" : true\r\n    } ],\r\n    \"night_bus\" : [ null, null ],\r\n    \"interstate_train\" : [ null, null ],\r\n    \"ferry\" : [ null, null ],\r\n    \"telebus\" : [ null, null ],\r\n    \"metro_tram\" : [ null, null ],\r\n    \"school_bus\" : [ null, null ]\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3DisruptionsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3DisruptionsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3DisruptionsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3DisruptionResponse> disruptionsGetDisruptionById(@Parameter(in = ParameterIn.PATH, description = "Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id}", required=true, schema=@Schema()) @PathVariable("disruption_id") Long disruptionId
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3DisruptionResponse>(objectMapper.readValue("{\r\n  \"disruption\" : {\r\n    \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"disruption_type\" : \"disruption_type\",\r\n    \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"description\" : \"description\",\r\n    \"display_on_board\" : true,\r\n    \"title\" : \"title\",\r\n    \"url\" : \"url\",\r\n    \"routes\" : [ {\r\n      \"route_id\" : 2,\r\n      \"route_name\" : \"route_name\",\r\n      \"route_type\" : 1,\r\n      \"route_number\" : \"route_number\",\r\n      \"route_gtfs_id\" : \"route_gtfs_id\",\r\n      \"direction\" : {\r\n        \"service_time\" : \"service_time\",\r\n        \"direction_id\" : 6,\r\n        \"direction_name\" : \"direction_name\",\r\n        \"route_direction_id\" : 6\r\n      }\r\n    }, {\r\n      \"route_id\" : 2,\r\n      \"route_name\" : \"route_name\",\r\n      \"route_type\" : 1,\r\n      \"route_number\" : \"route_number\",\r\n      \"route_gtfs_id\" : \"route_gtfs_id\",\r\n      \"direction\" : {\r\n        \"service_time\" : \"service_time\",\r\n        \"direction_id\" : 6,\r\n        \"direction_name\" : \"direction_name\",\r\n        \"route_direction_id\" : 6\r\n      }\r\n    } ],\r\n    \"disruption_id\" : 6,\r\n    \"colour\" : \"colour\",\r\n    \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"disruption_status\" : \"disruption_status\",\r\n    \"stops\" : [ {\r\n      \"stop_id\" : 5,\r\n      \"stop_name\" : \"stop_name\"\r\n    }, {\r\n      \"stop_id\" : 5,\r\n      \"stop_name\" : \"stop_name\"\r\n    } ],\r\n    \"display_status\" : true\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3DisruptionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3DisruptionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3DisruptionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3DisruptionModesResponse> disruptionsGetDisruptionModes(@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3DisruptionModesResponse>(objectMapper.readValue("{\r\n  \"disruption_modes\" : [ {\r\n    \"disruption_mode_name\" : \"disruption_mode_name\",\r\n    \"disruption_mode\" : 0\r\n  }, {\r\n    \"disruption_mode_name\" : \"disruption_mode_name\",\r\n    \"disruption_mode\" : 0\r\n  } ],\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3DisruptionModesResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3DisruptionModesResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3DisruptionModesResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3DisruptionsResponse> disruptionsGetDisruptionsByRoute(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes", required=true, schema=@Schema()) @PathVariable("route_id") Integer routeId
,@Parameter(in = ParameterIn.QUERY, description = "Filter by status of disruption" ,schema=@Schema(allowableValues={ "current", "planned" }
)) @Valid @RequestParam(value = "disruption_status", required = false) String disruptionStatus
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3DisruptionsResponse>(objectMapper.readValue("{\r\n  \"disruptions\" : {\r\n    \"metro_bus\" : [ null, null ],\r\n    \"skybus\" : [ null, null ],\r\n    \"metro_train\" : [ null, null ],\r\n    \"regional_coach\" : [ null, null ],\r\n    \"regional_bus\" : [ null, null ],\r\n    \"taxi\" : [ null, null ],\r\n    \"regional_train\" : [ null, null ],\r\n    \"general\" : [ {\r\n      \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_type\" : \"disruption_type\",\r\n      \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"description\" : \"description\",\r\n      \"display_on_board\" : true,\r\n      \"title\" : \"title\",\r\n      \"url\" : \"url\",\r\n      \"routes\" : [ {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      }, {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      } ],\r\n      \"disruption_id\" : 6,\r\n      \"colour\" : \"colour\",\r\n      \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_status\" : \"disruption_status\",\r\n      \"stops\" : [ {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      }, {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      } ],\r\n      \"display_status\" : true\r\n    }, {\r\n      \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_type\" : \"disruption_type\",\r\n      \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"description\" : \"description\",\r\n      \"display_on_board\" : true,\r\n      \"title\" : \"title\",\r\n      \"url\" : \"url\",\r\n      \"routes\" : [ {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      }, {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      } ],\r\n      \"disruption_id\" : 6,\r\n      \"colour\" : \"colour\",\r\n      \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_status\" : \"disruption_status\",\r\n      \"stops\" : [ {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      }, {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      } ],\r\n      \"display_status\" : true\r\n    } ],\r\n    \"night_bus\" : [ null, null ],\r\n    \"interstate_train\" : [ null, null ],\r\n    \"ferry\" : [ null, null ],\r\n    \"telebus\" : [ null, null ],\r\n    \"metro_tram\" : [ null, null ],\r\n    \"school_bus\" : [ null, null ]\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3DisruptionsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3DisruptionsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3DisruptionsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3DisruptionsResponse> disruptionsGetDisruptionsByRouteAndStop(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes", required=true, schema=@Schema()) @PathVariable("route_id") Integer routeId
,@Parameter(in = ParameterIn.PATH, description = "Identifier of stop; values returned by Stops API - v3/stops", required=true, schema=@Schema()) @PathVariable("stop_id") Integer stopId
,@Parameter(in = ParameterIn.QUERY, description = "Filter by status of disruption" ,schema=@Schema(allowableValues={ "current", "planned" }
)) @Valid @RequestParam(value = "disruption_status", required = false) String disruptionStatus
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3DisruptionsResponse>(objectMapper.readValue("{\r\n  \"disruptions\" : {\r\n    \"metro_bus\" : [ null, null ],\r\n    \"skybus\" : [ null, null ],\r\n    \"metro_train\" : [ null, null ],\r\n    \"regional_coach\" : [ null, null ],\r\n    \"regional_bus\" : [ null, null ],\r\n    \"taxi\" : [ null, null ],\r\n    \"regional_train\" : [ null, null ],\r\n    \"general\" : [ {\r\n      \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_type\" : \"disruption_type\",\r\n      \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"description\" : \"description\",\r\n      \"display_on_board\" : true,\r\n      \"title\" : \"title\",\r\n      \"url\" : \"url\",\r\n      \"routes\" : [ {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      }, {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      } ],\r\n      \"disruption_id\" : 6,\r\n      \"colour\" : \"colour\",\r\n      \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_status\" : \"disruption_status\",\r\n      \"stops\" : [ {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      }, {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      } ],\r\n      \"display_status\" : true\r\n    }, {\r\n      \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_type\" : \"disruption_type\",\r\n      \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"description\" : \"description\",\r\n      \"display_on_board\" : true,\r\n      \"title\" : \"title\",\r\n      \"url\" : \"url\",\r\n      \"routes\" : [ {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      }, {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      } ],\r\n      \"disruption_id\" : 6,\r\n      \"colour\" : \"colour\",\r\n      \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_status\" : \"disruption_status\",\r\n      \"stops\" : [ {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      }, {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      } ],\r\n      \"display_status\" : true\r\n    } ],\r\n    \"night_bus\" : [ null, null ],\r\n    \"interstate_train\" : [ null, null ],\r\n    \"ferry\" : [ null, null ],\r\n    \"telebus\" : [ null, null ],\r\n    \"metro_tram\" : [ null, null ],\r\n    \"school_bus\" : [ null, null ]\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3DisruptionsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3DisruptionsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3DisruptionsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3DisruptionsResponse> disruptionsGetDisruptionsByStop(@Parameter(in = ParameterIn.PATH, description = "Identifier of stop; values returned by Stops API - v3/stops", required=true, schema=@Schema()) @PathVariable("stop_id") Integer stopId
,@Parameter(in = ParameterIn.QUERY, description = "Filter by status of disruption" ,schema=@Schema(allowableValues={ "current", "planned" }
)) @Valid @RequestParam(value = "disruption_status", required = false) String disruptionStatus
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3DisruptionsResponse>(objectMapper.readValue("{\r\n  \"disruptions\" : {\r\n    \"metro_bus\" : [ null, null ],\r\n    \"skybus\" : [ null, null ],\r\n    \"metro_train\" : [ null, null ],\r\n    \"regional_coach\" : [ null, null ],\r\n    \"regional_bus\" : [ null, null ],\r\n    \"taxi\" : [ null, null ],\r\n    \"regional_train\" : [ null, null ],\r\n    \"general\" : [ {\r\n      \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_type\" : \"disruption_type\",\r\n      \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"description\" : \"description\",\r\n      \"display_on_board\" : true,\r\n      \"title\" : \"title\",\r\n      \"url\" : \"url\",\r\n      \"routes\" : [ {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      }, {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      } ],\r\n      \"disruption_id\" : 6,\r\n      \"colour\" : \"colour\",\r\n      \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_status\" : \"disruption_status\",\r\n      \"stops\" : [ {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      }, {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      } ],\r\n      \"display_status\" : true\r\n    }, {\r\n      \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_type\" : \"disruption_type\",\r\n      \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"description\" : \"description\",\r\n      \"display_on_board\" : true,\r\n      \"title\" : \"title\",\r\n      \"url\" : \"url\",\r\n      \"routes\" : [ {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      }, {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      } ],\r\n      \"disruption_id\" : 6,\r\n      \"colour\" : \"colour\",\r\n      \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_status\" : \"disruption_status\",\r\n      \"stops\" : [ {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      }, {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      } ],\r\n      \"display_status\" : true\r\n    } ],\r\n    \"night_bus\" : [ null, null ],\r\n    \"interstate_train\" : [ null, null ],\r\n    \"ferry\" : [ null, null ],\r\n    \"telebus\" : [ null, null ],\r\n    \"metro_tram\" : [ null, null ],\r\n    \"school_bus\" : [ null, null ]\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3DisruptionsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3DisruptionsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3DisruptionsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3FareEstimateResponse> fareEstimateGetFareEstimateByZone(@Parameter(in = ParameterIn.PATH, description = "Minimum Zone travelled through ie. 1", required=true, schema=@Schema()) @PathVariable("minZone") Integer minZone
,@Parameter(in = ParameterIn.PATH, description = "Maximum Zone travelled through id. 6", required=true, schema=@Schema()) @PathVariable("maxZone") Integer maxZone
,@Parameter(in = ParameterIn.QUERY, description = "JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53)." ,schema=@Schema()) @Valid @RequestParam(value = "journey_touch_on_utc", required = false) OffsetDateTime journeyTouchOnUtc
,@Parameter(in = ParameterIn.QUERY, description = "JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53)." ,schema=@Schema()) @Valid @RequestParam(value = "journey_touch_off_utc", required = false) OffsetDateTime journeyTouchOffUtc
,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "is_journey_in_free_tram_zone", required = false) Boolean isJourneyInFreeTramZone
,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @Valid @RequestParam(value = "travelled_route_types", required = false) List<Integer> travelledRouteTypes
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3FareEstimateResponse>(objectMapper.readValue("{\r\n  \"FareEstimateResultStatus\" : {\r\n    \"Message\" : \"Message\",\r\n    \"StatusCode\" : 0\r\n  },\r\n  \"FareEstimateResult\" : {\r\n    \"IsEarlyBird\" : true,\r\n    \"IsJourneyInFreeTramZone\" : true,\r\n    \"PassengerFares\" : [ {\r\n      \"PassengerType\" : \"PassengerType\",\r\n      \"Pass70PlusDayPerDay\" : 4.145608029883936,\r\n      \"Fare2HourOffPeak\" : 2.3021358869347655,\r\n      \"FareDailyPeak\" : 7.061401241503109,\r\n      \"WeekendCap\" : 7.386281948385884,\r\n      \"Fare2HourPeak\" : 5.637376656633329,\r\n      \"Pass28To69DayPerDay\" : 2.027123023002322,\r\n      \"Pass7Days\" : 3.616076749251911,\r\n      \"FareDailyOffPeak\" : 9.301444243932576,\r\n      \"HolidayCap\" : 1.2315135367772556\r\n    }, {\r\n      \"PassengerType\" : \"PassengerType\",\r\n      \"Pass70PlusDayPerDay\" : 4.145608029883936,\r\n      \"Fare2HourOffPeak\" : 2.3021358869347655,\r\n      \"FareDailyPeak\" : 7.061401241503109,\r\n      \"WeekendCap\" : 7.386281948385884,\r\n      \"Fare2HourPeak\" : 5.637376656633329,\r\n      \"Pass28To69DayPerDay\" : 2.027123023002322,\r\n      \"Pass7Days\" : 3.616076749251911,\r\n      \"FareDailyOffPeak\" : 9.301444243932576,\r\n      \"HolidayCap\" : 1.2315135367772556\r\n    } ],\r\n    \"IsThisWeekendJourney\" : true,\r\n    \"ZoneInfo\" : {\r\n      \"UniqueZones\" : [ 5, 5 ],\r\n      \"MinZone\" : 6,\r\n      \"MaxZone\" : 1\r\n    }\r\n  }\r\n}", V3FareEstimateResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3FareEstimateResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3FareEstimateResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3OutletResponse> outletsGetAllOutlets(@Parameter(in = ParameterIn.QUERY, description = "Maximum number of results returned (default = 30)" ,schema=@Schema()) @Valid @RequestParam(value = "max_results", required = false) Integer maxResults
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3OutletResponse>(objectMapper.readValue("{\r\n  \"outlets\" : [ {\r\n    \"outlet_business_hour_thur\" : \"outlet_business_hour_thur\",\r\n    \"outlet_postcode\" : 1,\r\n    \"outlet_business_hour_fri\" : \"outlet_business_hour_fri\",\r\n    \"outlet_business_hour_wed\" : \"outlet_business_hour_wed\",\r\n    \"outlet_suburb\" : \"outlet_suburb\",\r\n    \"outlet_longitude\" : 6.0274563,\r\n    \"outlet_name\" : \"outlet_name\",\r\n    \"outlet_business\" : \"outlet_business\",\r\n    \"outlet_business_hour_mon\" : \"outlet_business_hour_mon\",\r\n    \"outlet_business_hour_sun\" : \"outlet_business_hour_sun\",\r\n    \"outlet_slid_spid\" : \"outlet_slid_spid\",\r\n    \"outlet_business_hour_sat\" : \"outlet_business_hour_sat\",\r\n    \"outlet_notes\" : \"outlet_notes\",\r\n    \"outlet_business_hour_tue\" : \"outlet_business_hour_tue\",\r\n    \"outlet_latitude\" : 0.8008282\r\n  }, {\r\n    \"outlet_business_hour_thur\" : \"outlet_business_hour_thur\",\r\n    \"outlet_postcode\" : 1,\r\n    \"outlet_business_hour_fri\" : \"outlet_business_hour_fri\",\r\n    \"outlet_business_hour_wed\" : \"outlet_business_hour_wed\",\r\n    \"outlet_suburb\" : \"outlet_suburb\",\r\n    \"outlet_longitude\" : 6.0274563,\r\n    \"outlet_name\" : \"outlet_name\",\r\n    \"outlet_business\" : \"outlet_business\",\r\n    \"outlet_business_hour_mon\" : \"outlet_business_hour_mon\",\r\n    \"outlet_business_hour_sun\" : \"outlet_business_hour_sun\",\r\n    \"outlet_slid_spid\" : \"outlet_slid_spid\",\r\n    \"outlet_business_hour_sat\" : \"outlet_business_hour_sat\",\r\n    \"outlet_notes\" : \"outlet_notes\",\r\n    \"outlet_business_hour_tue\" : \"outlet_business_hour_tue\",\r\n    \"outlet_latitude\" : 0.8008282\r\n  } ],\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3OutletResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3OutletResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3OutletResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3OutletGeolocationResponse> outletsGetOutletsByGeolocation(@Parameter(in = ParameterIn.PATH, description = "Geographic coordinate of latitude", required=true, schema=@Schema()) @PathVariable("latitude") Float latitude
,@Parameter(in = ParameterIn.PATH, description = "Geographic coordinate of longitude", required=true, schema=@Schema()) @PathVariable("longitude") Float longitude
,@Parameter(in = ParameterIn.QUERY, description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)" ,schema=@Schema()) @Valid @RequestParam(value = "max_distance", required = false) Double maxDistance
,@Parameter(in = ParameterIn.QUERY, description = "Maximum number of results returned (default = 30)" ,schema=@Schema()) @Valid @RequestParam(value = "max_results", required = false) Integer maxResults
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3OutletGeolocationResponse>(objectMapper.readValue("{\r\n  \"outlets\" : [ {\r\n    \"outlet_business_hour_thur\" : \"outlet_business_hour_thur\",\r\n    \"outlet_postcode\" : 5,\r\n    \"outlet_business_hour_fri\" : \"outlet_business_hour_fri\",\r\n    \"outlet_business_hour_wed\" : \"outlet_business_hour_wed\",\r\n    \"outlet_suburb\" : \"outlet_suburb\",\r\n    \"outlet_longitude\" : 1.4658129,\r\n    \"outlet_name\" : \"outlet_name\",\r\n    \"outlet_distance\" : 0.8008282,\r\n    \"outlet_business\" : \"outlet_business\",\r\n    \"outlet_business_hour_mon\" : \"outlet_business_hour_mon\",\r\n    \"outlet_business_hour_sun\" : \"outlet_business_hour_sun\",\r\n    \"outlet_slid_spid\" : \"outlet_slid_spid\",\r\n    \"outlet_business_hour_sat\" : \"outlet_business_hour_sat\",\r\n    \"outlet_notes\" : \"outlet_notes\",\r\n    \"outlet_business_hour_tue\" : \"outlet_business_hour_tue\",\r\n    \"outlet_latitude\" : 6.0274563\r\n  }, {\r\n    \"outlet_business_hour_thur\" : \"outlet_business_hour_thur\",\r\n    \"outlet_postcode\" : 5,\r\n    \"outlet_business_hour_fri\" : \"outlet_business_hour_fri\",\r\n    \"outlet_business_hour_wed\" : \"outlet_business_hour_wed\",\r\n    \"outlet_suburb\" : \"outlet_suburb\",\r\n    \"outlet_longitude\" : 1.4658129,\r\n    \"outlet_name\" : \"outlet_name\",\r\n    \"outlet_distance\" : 0.8008282,\r\n    \"outlet_business\" : \"outlet_business\",\r\n    \"outlet_business_hour_mon\" : \"outlet_business_hour_mon\",\r\n    \"outlet_business_hour_sun\" : \"outlet_business_hour_sun\",\r\n    \"outlet_slid_spid\" : \"outlet_slid_spid\",\r\n    \"outlet_business_hour_sat\" : \"outlet_business_hour_sat\",\r\n    \"outlet_notes\" : \"outlet_notes\",\r\n    \"outlet_business_hour_tue\" : \"outlet_business_hour_tue\",\r\n    \"outlet_latitude\" : 6.0274563\r\n  } ],\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3OutletGeolocationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3OutletGeolocationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3OutletGeolocationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3StoppingPattern> patternsGetPatternByRun(@Parameter(in = ParameterIn.PATH, description = "The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.", required=true, schema=@Schema()) @PathVariable("run_ref") String runRef
,@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API", required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @PathVariable("route_type") Integer routeType
,@NotNull @Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information." ,required=true,schema=@Schema(allowableValues={ "All", "Stop", "Route", "Run", "Direction", "Disruption", "VehicleDescriptor", "VehiclePosition", "None" }
)) @Valid @RequestParam(value = "expand", required = true) List<String> expand
,@Parameter(in = ParameterIn.QUERY, description = "Filter by stop_id; values returned by Stops API" ,schema=@Schema()) @Valid @RequestParam(value = "stop_id", required = false) Integer stopId
,@Parameter(in = ParameterIn.QUERY, description = "Filter by the date and time of the request (ISO 8601 UTC format)" ,schema=@Schema()) @Valid @RequestParam(value = "date_utc", required = false) OffsetDateTime dateUtc
,@Parameter(in = ParameterIn.QUERY, description = "Include any skipped stops in a stopping pattern. Defaults to false." ,schema=@Schema()) @Valid @RequestParam(value = "include_skipped_stops", required = false) Boolean includeSkippedStops
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if geopath data will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "include_geopath", required = false) Boolean includeGeopath
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3StoppingPattern>(objectMapper.readValue("{\r\n  \"routes\" : {\r\n    \"key\" : { }\r\n  },\r\n  \"disruptions\" : [ {\r\n    \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"disruption_type\" : \"disruption_type\",\r\n    \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"description\" : \"description\",\r\n    \"display_on_board\" : true,\r\n    \"title\" : \"title\",\r\n    \"url\" : \"url\",\r\n    \"routes\" : [ {\r\n      \"route_id\" : 2,\r\n      \"route_name\" : \"route_name\",\r\n      \"route_type\" : 1,\r\n      \"route_number\" : \"route_number\",\r\n      \"route_gtfs_id\" : \"route_gtfs_id\",\r\n      \"direction\" : {\r\n        \"service_time\" : \"service_time\",\r\n        \"direction_id\" : 6,\r\n        \"direction_name\" : \"direction_name\",\r\n        \"route_direction_id\" : 6\r\n      }\r\n    }, {\r\n      \"route_id\" : 2,\r\n      \"route_name\" : \"route_name\",\r\n      \"route_type\" : 1,\r\n      \"route_number\" : \"route_number\",\r\n      \"route_gtfs_id\" : \"route_gtfs_id\",\r\n      \"direction\" : {\r\n        \"service_time\" : \"service_time\",\r\n        \"direction_id\" : 6,\r\n        \"direction_name\" : \"direction_name\",\r\n        \"route_direction_id\" : 6\r\n      }\r\n    } ],\r\n    \"disruption_id\" : 6,\r\n    \"colour\" : \"colour\",\r\n    \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"disruption_status\" : \"disruption_status\",\r\n    \"stops\" : [ {\r\n      \"stop_id\" : 5,\r\n      \"stop_name\" : \"stop_name\"\r\n    }, {\r\n      \"stop_id\" : 5,\r\n      \"stop_name\" : \"stop_name\"\r\n    } ],\r\n    \"display_status\" : true\r\n  }, {\r\n    \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"disruption_type\" : \"disruption_type\",\r\n    \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"description\" : \"description\",\r\n    \"display_on_board\" : true,\r\n    \"title\" : \"title\",\r\n    \"url\" : \"url\",\r\n    \"routes\" : [ {\r\n      \"route_id\" : 2,\r\n      \"route_name\" : \"route_name\",\r\n      \"route_type\" : 1,\r\n      \"route_number\" : \"route_number\",\r\n      \"route_gtfs_id\" : \"route_gtfs_id\",\r\n      \"direction\" : {\r\n        \"service_time\" : \"service_time\",\r\n        \"direction_id\" : 6,\r\n        \"direction_name\" : \"direction_name\",\r\n        \"route_direction_id\" : 6\r\n      }\r\n    }, {\r\n      \"route_id\" : 2,\r\n      \"route_name\" : \"route_name\",\r\n      \"route_type\" : 1,\r\n      \"route_number\" : \"route_number\",\r\n      \"route_gtfs_id\" : \"route_gtfs_id\",\r\n      \"direction\" : {\r\n        \"service_time\" : \"service_time\",\r\n        \"direction_id\" : 6,\r\n        \"direction_name\" : \"direction_name\",\r\n        \"route_direction_id\" : 6\r\n      }\r\n    } ],\r\n    \"disruption_id\" : 6,\r\n    \"colour\" : \"colour\",\r\n    \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"disruption_status\" : \"disruption_status\",\r\n    \"stops\" : [ {\r\n      \"stop_id\" : 5,\r\n      \"stop_name\" : \"stop_name\"\r\n    }, {\r\n      \"stop_id\" : 5,\r\n      \"stop_name\" : \"stop_name\"\r\n    } ],\r\n    \"display_status\" : true\r\n  } ],\r\n  \"directions\" : {\r\n    \"key\" : {\r\n      \"direction_id\" : 9,\r\n      \"route_id\" : 6,\r\n      \"route_type\" : 3,\r\n      \"direction_name\" : \"direction_name\"\r\n    }\r\n  },\r\n  \"stops\" : {\r\n    \"key\" : {\r\n      \"stop_ticket\" : {\r\n        \"ticket_type\" : \"ticket_type\",\r\n        \"vline_reservation\" : true,\r\n        \"zone\" : \"zone\",\r\n        \"ticket_machine\" : true,\r\n        \"ticket_zones\" : [ 7, 7 ],\r\n        \"is_free_fare_zone\" : true,\r\n        \"ticket_checks\" : true\r\n      },\r\n      \"stop_longitude\" : 7.386282,\r\n      \"stop_sequence\" : 1,\r\n      \"stop_id\" : 3,\r\n      \"route_type\" : 2,\r\n      \"stop_landmark\" : \"stop_landmark\",\r\n      \"stop_suburb\" : \"stop_suburb\",\r\n      \"stop_distance\" : 9.301444,\r\n      \"stop_name\" : \"stop_name\",\r\n      \"stop_latitude\" : 4.145608\r\n    }\r\n  },\r\n  \"departures\" : [ {\r\n    \"route_id\" : 6,\r\n    \"run_id\" : 1,\r\n    \"estimated_departure_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"departure_sequence\" : 2,\r\n    \"flags\" : \"flags\",\r\n    \"skipped_stops\" : [ {\r\n      \"stop_longitude\" : 4.145608,\r\n      \"stop_sequence\" : 7,\r\n      \"stop_id\" : 9,\r\n      \"route_type\" : 3,\r\n      \"stop_landmark\" : \"stop_landmark\",\r\n      \"stop_suburb\" : \"stop_suburb\",\r\n      \"stop_distance\" : 7.0614014,\r\n      \"stop_name\" : \"stop_name\",\r\n      \"stop_latitude\" : 2.027123\r\n    }, {\r\n      \"stop_longitude\" : 4.145608,\r\n      \"stop_sequence\" : 7,\r\n      \"stop_id\" : 9,\r\n      \"route_type\" : 3,\r\n      \"stop_landmark\" : \"stop_landmark\",\r\n      \"stop_suburb\" : \"stop_suburb\",\r\n      \"stop_distance\" : 7.0614014,\r\n      \"stop_name\" : \"stop_name\",\r\n      \"stop_latitude\" : 2.027123\r\n    } ],\r\n    \"disruption_ids\" : [ 5, 5 ],\r\n    \"at_platform\" : true,\r\n    \"scheduled_departure_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"direction_id\" : 5,\r\n    \"stop_id\" : 0,\r\n    \"run_ref\" : \"run_ref\",\r\n    \"platform_number\" : \"platform_number\"\r\n  }, {\r\n    \"route_id\" : 6,\r\n    \"run_id\" : 1,\r\n    \"estimated_departure_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"departure_sequence\" : 2,\r\n    \"flags\" : \"flags\",\r\n    \"skipped_stops\" : [ {\r\n      \"stop_longitude\" : 4.145608,\r\n      \"stop_sequence\" : 7,\r\n      \"stop_id\" : 9,\r\n      \"route_type\" : 3,\r\n      \"stop_landmark\" : \"stop_landmark\",\r\n      \"stop_suburb\" : \"stop_suburb\",\r\n      \"stop_distance\" : 7.0614014,\r\n      \"stop_name\" : \"stop_name\",\r\n      \"stop_latitude\" : 2.027123\r\n    }, {\r\n      \"stop_longitude\" : 4.145608,\r\n      \"stop_sequence\" : 7,\r\n      \"stop_id\" : 9,\r\n      \"route_type\" : 3,\r\n      \"stop_landmark\" : \"stop_landmark\",\r\n      \"stop_suburb\" : \"stop_suburb\",\r\n      \"stop_distance\" : 7.0614014,\r\n      \"stop_name\" : \"stop_name\",\r\n      \"stop_latitude\" : 2.027123\r\n    } ],\r\n    \"disruption_ids\" : [ 5, 5 ],\r\n    \"at_platform\" : true,\r\n    \"scheduled_departure_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"direction_id\" : 5,\r\n    \"stop_id\" : 0,\r\n    \"run_ref\" : \"run_ref\",\r\n    \"platform_number\" : \"platform_number\"\r\n  } ],\r\n  \"runs\" : {\r\n    \"key\" : {\r\n      \"run_id\" : 1,\r\n      \"route_id\" : 1,\r\n      \"final_stop_id\" : 6,\r\n      \"destination_name\" : \"destination_name\",\r\n      \"vehicle_descriptor\" : {\r\n        \"low_floor\" : true,\r\n        \"air_conditioned\" : true,\r\n        \"supplier\" : \"supplier\",\r\n        \"length\" : \"length\",\r\n        \"description\" : \"description\",\r\n        \"id\" : \"id\",\r\n        \"operator\" : \"operator\"\r\n      },\r\n      \"run_sequence\" : 1,\r\n      \"direction_id\" : 7,\r\n      \"run_ref\" : \"run_ref\",\r\n      \"route_type\" : 1,\r\n      \"vehicle_position\" : {\r\n        \"easting\" : 9.369310271410669,\r\n        \"bearing\" : 8.762042012749001,\r\n        \"datetime_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n        \"latitude\" : 5.025004791520295,\r\n        \"supplier\" : \"supplier\",\r\n        \"expiry_time\" : \"2000-01-23T04:56:07.000+00:00\",\r\n        \"northing\" : 6.683562403749608,\r\n        \"longitude\" : 9.965781217890562,\r\n        \"direction\" : \"direction\"\r\n      },\r\n      \"express_stop_count\" : 4,\r\n      \"geopath\" : [ { }, { } ],\r\n      \"status\" : \"status\"\r\n    }\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3StoppingPattern.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3StoppingPattern>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3StoppingPattern>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3RouteTypesResponse> routeTypesGetRouteTypes(@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3RouteTypesResponse>(objectMapper.readValue("{\r\n  \"route_types\" : [ {\r\n    \"route_type_name\" : \"route_type_name\",\r\n    \"route_type\" : 0\r\n  }, {\r\n    \"route_type_name\" : \"route_type_name\",\r\n    \"route_type\" : 0\r\n  } ],\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3RouteTypesResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3RouteTypesResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3RouteTypesResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3RouteResponse> routesOneOrMoreRoutes(@Parameter(in = ParameterIn.QUERY, description = "Filter by route_type; values returned via RouteTypes API" ,schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @Valid @RequestParam(value = "route_types", required = false) List<Integer> routeTypes
,@Parameter(in = ParameterIn.QUERY, description = "Filter by name  of route (accepts partial route name matches)" ,schema=@Schema()) @Valid @RequestParam(value = "route_name", required = false) String routeName
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3RouteResponse>(objectMapper.readValue("{\r\n  \"route\" : {\r\n    \"route_service_status\" : {\r\n      \"description\" : \"description\",\r\n      \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\r\n    },\r\n    \"route_id\" : 6,\r\n    \"route_name\" : \"route_name\",\r\n    \"route_type\" : 0,\r\n    \"route_number\" : \"route_number\",\r\n    \"route_gtfs_id\" : \"route_gtfs_id\",\r\n    \"geopath\" : [ { }, { } ]\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3RouteResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3RouteResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3RouteResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3RouteResponse> routesRouteFromId(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Departures, Directions and Disruptions APIs", required=true, schema=@Schema()) @PathVariable("route_id") Integer routeId
,@Parameter(in = ParameterIn.QUERY, description = "Indicates kif geopath data will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "include_geopath", required = false) Boolean includeGeopath
,@Parameter(in = ParameterIn.QUERY, description = "Filter geopaths by date (ISO 8601 UTC format) (default = current date)" ,schema=@Schema()) @Valid @RequestParam(value = "geopath_utc", required = false) OffsetDateTime geopathUtc
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3RouteResponse>(objectMapper.readValue("{\r\n  \"route\" : {\r\n    \"route_service_status\" : {\r\n      \"description\" : \"description\",\r\n      \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\r\n    },\r\n    \"route_id\" : 6,\r\n    \"route_name\" : \"route_name\",\r\n    \"route_type\" : 0,\r\n    \"route_number\" : \"route_number\",\r\n    \"route_gtfs_id\" : \"route_gtfs_id\",\r\n    \"geopath\" : [ { }, { } ]\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3RouteResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3RouteResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3RouteResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3RunsResponse> runsForRoute(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes.", required=true, schema=@Schema()) @PathVariable("route_id") Integer routeId
,@Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None." ,schema=@Schema(allowableValues={ "All", "VehicleDescriptor", "VehiclePosition", "None" }
)) @Valid @RequestParam(value = "expand", required = false) List<String> expand
,@Parameter(in = ParameterIn.QUERY, description = "Date of the request. (optional - defaults to now)" ,schema=@Schema()) @Valid @RequestParam(value = "date_utc", required = false) OffsetDateTime dateUtc
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3RunsResponse>(objectMapper.readValue("{\r\n  \"runs\" : [ {\r\n    \"run_id\" : 1,\r\n    \"route_id\" : 1,\r\n    \"final_stop_id\" : 6,\r\n    \"destination_name\" : \"destination_name\",\r\n    \"vehicle_descriptor\" : {\r\n      \"low_floor\" : true,\r\n      \"air_conditioned\" : true,\r\n      \"supplier\" : \"supplier\",\r\n      \"length\" : \"length\",\r\n      \"description\" : \"description\",\r\n      \"id\" : \"id\",\r\n      \"operator\" : \"operator\"\r\n    },\r\n    \"run_sequence\" : 1,\r\n    \"direction_id\" : 7,\r\n    \"run_ref\" : \"run_ref\",\r\n    \"route_type\" : 1,\r\n    \"vehicle_position\" : {\r\n      \"easting\" : 9.369310271410669,\r\n      \"bearing\" : 8.762042012749001,\r\n      \"datetime_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"latitude\" : 5.025004791520295,\r\n      \"supplier\" : \"supplier\",\r\n      \"expiry_time\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"northing\" : 6.683562403749608,\r\n      \"longitude\" : 9.965781217890562,\r\n      \"direction\" : \"direction\"\r\n    },\r\n    \"express_stop_count\" : 4,\r\n    \"geopath\" : [ { }, { } ],\r\n    \"status\" : \"status\"\r\n  }, {\r\n    \"run_id\" : 1,\r\n    \"route_id\" : 1,\r\n    \"final_stop_id\" : 6,\r\n    \"destination_name\" : \"destination_name\",\r\n    \"vehicle_descriptor\" : {\r\n      \"low_floor\" : true,\r\n      \"air_conditioned\" : true,\r\n      \"supplier\" : \"supplier\",\r\n      \"length\" : \"length\",\r\n      \"description\" : \"description\",\r\n      \"id\" : \"id\",\r\n      \"operator\" : \"operator\"\r\n    },\r\n    \"run_sequence\" : 1,\r\n    \"direction_id\" : 7,\r\n    \"run_ref\" : \"run_ref\",\r\n    \"route_type\" : 1,\r\n    \"vehicle_position\" : {\r\n      \"easting\" : 9.369310271410669,\r\n      \"bearing\" : 8.762042012749001,\r\n      \"datetime_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"latitude\" : 5.025004791520295,\r\n      \"supplier\" : \"supplier\",\r\n      \"expiry_time\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"northing\" : 6.683562403749608,\r\n      \"longitude\" : 9.965781217890562,\r\n      \"direction\" : \"direction\"\r\n    },\r\n    \"express_stop_count\" : 4,\r\n    \"geopath\" : [ { }, { } ],\r\n    \"status\" : \"status\"\r\n  } ],\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3RunsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3RunsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3RunsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3RunsResponse> runsForRouteAndRouteType(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes.", required=true, schema=@Schema()) @PathVariable("route_id") Integer routeId
,@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API", required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @PathVariable("route_type") Integer routeType
,@NotNull @Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All." ,required=true,schema=@Schema(allowableValues={ "All", "VehicleDescriptor", "VehiclePosition", "None" }
)) @Valid @RequestParam(value = "expand", required = true) List<String> expand
,@Parameter(in = ParameterIn.QUERY, description = "Date of the request. (optional - defaults to now)" ,schema=@Schema()) @Valid @RequestParam(value = "date_utc", required = false) OffsetDateTime dateUtc
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3RunsResponse>(objectMapper.readValue("{\r\n  \"runs\" : [ {\r\n    \"run_id\" : 1,\r\n    \"route_id\" : 1,\r\n    \"final_stop_id\" : 6,\r\n    \"destination_name\" : \"destination_name\",\r\n    \"vehicle_descriptor\" : {\r\n      \"low_floor\" : true,\r\n      \"air_conditioned\" : true,\r\n      \"supplier\" : \"supplier\",\r\n      \"length\" : \"length\",\r\n      \"description\" : \"description\",\r\n      \"id\" : \"id\",\r\n      \"operator\" : \"operator\"\r\n    },\r\n    \"run_sequence\" : 1,\r\n    \"direction_id\" : 7,\r\n    \"run_ref\" : \"run_ref\",\r\n    \"route_type\" : 1,\r\n    \"vehicle_position\" : {\r\n      \"easting\" : 9.369310271410669,\r\n      \"bearing\" : 8.762042012749001,\r\n      \"datetime_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"latitude\" : 5.025004791520295,\r\n      \"supplier\" : \"supplier\",\r\n      \"expiry_time\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"northing\" : 6.683562403749608,\r\n      \"longitude\" : 9.965781217890562,\r\n      \"direction\" : \"direction\"\r\n    },\r\n    \"express_stop_count\" : 4,\r\n    \"geopath\" : [ { }, { } ],\r\n    \"status\" : \"status\"\r\n  }, {\r\n    \"run_id\" : 1,\r\n    \"route_id\" : 1,\r\n    \"final_stop_id\" : 6,\r\n    \"destination_name\" : \"destination_name\",\r\n    \"vehicle_descriptor\" : {\r\n      \"low_floor\" : true,\r\n      \"air_conditioned\" : true,\r\n      \"supplier\" : \"supplier\",\r\n      \"length\" : \"length\",\r\n      \"description\" : \"description\",\r\n      \"id\" : \"id\",\r\n      \"operator\" : \"operator\"\r\n    },\r\n    \"run_sequence\" : 1,\r\n    \"direction_id\" : 7,\r\n    \"run_ref\" : \"run_ref\",\r\n    \"route_type\" : 1,\r\n    \"vehicle_position\" : {\r\n      \"easting\" : 9.369310271410669,\r\n      \"bearing\" : 8.762042012749001,\r\n      \"datetime_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"latitude\" : 5.025004791520295,\r\n      \"supplier\" : \"supplier\",\r\n      \"expiry_time\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"northing\" : 6.683562403749608,\r\n      \"longitude\" : 9.965781217890562,\r\n      \"direction\" : \"direction\"\r\n    },\r\n    \"express_stop_count\" : 4,\r\n    \"geopath\" : [ { }, { } ],\r\n    \"status\" : \"status\"\r\n  } ],\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3RunsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3RunsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3RunsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3RunsResponse> runsForRun(@Parameter(in = ParameterIn.PATH, description = "The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.", required=true, schema=@Schema()) @PathVariable("run_ref") String runRef
,@NotNull @Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None." ,required=true,schema=@Schema(allowableValues={ "All", "VehicleDescriptor", "VehiclePosition", "None" }
)) @Valid @RequestParam(value = "expand", required = true) List<String> expand
,@Parameter(in = ParameterIn.QUERY, description = "Date of the request. (optional - defaults to now)" ,schema=@Schema()) @Valid @RequestParam(value = "date_utc", required = false) OffsetDateTime dateUtc
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if geopath data will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "include_geopath", required = false) Boolean includeGeopath
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3RunsResponse>(objectMapper.readValue("{\r\n  \"runs\" : [ {\r\n    \"run_id\" : 1,\r\n    \"route_id\" : 1,\r\n    \"final_stop_id\" : 6,\r\n    \"destination_name\" : \"destination_name\",\r\n    \"vehicle_descriptor\" : {\r\n      \"low_floor\" : true,\r\n      \"air_conditioned\" : true,\r\n      \"supplier\" : \"supplier\",\r\n      \"length\" : \"length\",\r\n      \"description\" : \"description\",\r\n      \"id\" : \"id\",\r\n      \"operator\" : \"operator\"\r\n    },\r\n    \"run_sequence\" : 1,\r\n    \"direction_id\" : 7,\r\n    \"run_ref\" : \"run_ref\",\r\n    \"route_type\" : 1,\r\n    \"vehicle_position\" : {\r\n      \"easting\" : 9.369310271410669,\r\n      \"bearing\" : 8.762042012749001,\r\n      \"datetime_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"latitude\" : 5.025004791520295,\r\n      \"supplier\" : \"supplier\",\r\n      \"expiry_time\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"northing\" : 6.683562403749608,\r\n      \"longitude\" : 9.965781217890562,\r\n      \"direction\" : \"direction\"\r\n    },\r\n    \"express_stop_count\" : 4,\r\n    \"geopath\" : [ { }, { } ],\r\n    \"status\" : \"status\"\r\n  }, {\r\n    \"run_id\" : 1,\r\n    \"route_id\" : 1,\r\n    \"final_stop_id\" : 6,\r\n    \"destination_name\" : \"destination_name\",\r\n    \"vehicle_descriptor\" : {\r\n      \"low_floor\" : true,\r\n      \"air_conditioned\" : true,\r\n      \"supplier\" : \"supplier\",\r\n      \"length\" : \"length\",\r\n      \"description\" : \"description\",\r\n      \"id\" : \"id\",\r\n      \"operator\" : \"operator\"\r\n    },\r\n    \"run_sequence\" : 1,\r\n    \"direction_id\" : 7,\r\n    \"run_ref\" : \"run_ref\",\r\n    \"route_type\" : 1,\r\n    \"vehicle_position\" : {\r\n      \"easting\" : 9.369310271410669,\r\n      \"bearing\" : 8.762042012749001,\r\n      \"datetime_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"latitude\" : 5.025004791520295,\r\n      \"supplier\" : \"supplier\",\r\n      \"expiry_time\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"northing\" : 6.683562403749608,\r\n      \"longitude\" : 9.965781217890562,\r\n      \"direction\" : \"direction\"\r\n    },\r\n    \"express_stop_count\" : 4,\r\n    \"geopath\" : [ { }, { } ],\r\n    \"status\" : \"status\"\r\n  } ],\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3RunsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3RunsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3RunsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3RunResponse> runsForRunAndRouteType(@Parameter(in = ParameterIn.PATH, description = "The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.", required=true, schema=@Schema()) @PathVariable("run_ref") String runRef
,@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API", required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @PathVariable("route_type") Integer routeType
,@NotNull @Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None." ,required=true,schema=@Schema(allowableValues={ "All", "VehicleDescriptor", "VehiclePosition", "None" }
)) @Valid @RequestParam(value = "expand", required = true) List<String> expand
,@Parameter(in = ParameterIn.QUERY, description = "Date of the request. (optional - defaults to now)" ,schema=@Schema()) @Valid @RequestParam(value = "date_utc", required = false) OffsetDateTime dateUtc
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if geopath data will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "include_geopath", required = false) Boolean includeGeopath
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3RunResponse>(objectMapper.readValue("{\r\n  \"run\" : {\r\n    \"run_id\" : 1,\r\n    \"route_id\" : 1,\r\n    \"final_stop_id\" : 6,\r\n    \"destination_name\" : \"destination_name\",\r\n    \"vehicle_descriptor\" : {\r\n      \"low_floor\" : true,\r\n      \"air_conditioned\" : true,\r\n      \"supplier\" : \"supplier\",\r\n      \"length\" : \"length\",\r\n      \"description\" : \"description\",\r\n      \"id\" : \"id\",\r\n      \"operator\" : \"operator\"\r\n    },\r\n    \"run_sequence\" : 1,\r\n    \"direction_id\" : 7,\r\n    \"run_ref\" : \"run_ref\",\r\n    \"route_type\" : 1,\r\n    \"vehicle_position\" : {\r\n      \"easting\" : 9.369310271410669,\r\n      \"bearing\" : 8.762042012749001,\r\n      \"datetime_utc\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"latitude\" : 5.025004791520295,\r\n      \"supplier\" : \"supplier\",\r\n      \"expiry_time\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"northing\" : 6.683562403749608,\r\n      \"longitude\" : 9.965781217890562,\r\n      \"direction\" : \"direction\"\r\n    },\r\n    \"express_stop_count\" : 4,\r\n    \"geopath\" : [ { }, { } ],\r\n    \"status\" : \"status\"\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3RunResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3RunResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3RunResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3SearchResult> searchSearch(@Parameter(in = ParameterIn.PATH, description = "Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes)", required=true, schema=@Schema()) @PathVariable("search_term") String searchTerm
,@Parameter(in = ParameterIn.QUERY, description = "Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)" ,schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @Valid @RequestParam(value = "route_types", required = false) List<Integer> routeTypes
,@Parameter(in = ParameterIn.QUERY, description = "Filter by geographic coordinate of latitude" ,schema=@Schema()) @Valid @RequestParam(value = "latitude", required = false) Float latitude
,@Parameter(in = ParameterIn.QUERY, description = "Filter by geographic coordinate of longitude" ,schema=@Schema()) @Valid @RequestParam(value = "longitude", required = false) Float longitude
,@Parameter(in = ParameterIn.QUERY, description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters" ,schema=@Schema()) @Valid @RequestParam(value = "max_distance", required = false) Float maxDistance
,@Parameter(in = ParameterIn.QUERY, description = "Placeholder for future development; currently unavailable" ,schema=@Schema()) @Valid @RequestParam(value = "include_addresses", required = false) Boolean includeAddresses
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if outlets will be returned in response (default = true)" ,schema=@Schema()) @Valid @RequestParam(value = "include_outlets", required = false) Boolean includeOutlets
,@Parameter(in = ParameterIn.QUERY, description = "Indicates whether to find stops by suburbs in the search term (default = true)" ,schema=@Schema()) @Valid @RequestParam(value = "match_stop_by_suburb", required = false) Boolean matchStopBySuburb
,@Parameter(in = ParameterIn.QUERY, description = "Indicates whether to find routes by suburbs in the search term (default = true)" ,schema=@Schema()) @Valid @RequestParam(value = "match_route_by_suburb", required = false) Boolean matchRouteBySuburb
,@Parameter(in = ParameterIn.QUERY, description = "Indicates whether to search for stops according to a metlink stop ID (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "match_stop_by_gtfs_stop_id", required = false) Boolean matchStopByGtfsStopId
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3SearchResult>(objectMapper.readValue("{\r\n  \"routes\" : [ null, null ],\r\n  \"outlets\" : [ {\r\n    \"outlet_business_hour_thur\" : \"outlet_business_hour_thur\",\r\n    \"outlet_postcode\" : 7,\r\n    \"outlet_business_hour_fri\" : \"outlet_business_hour_fri\",\r\n    \"outlet_business_hour_wed\" : \"outlet_business_hour_wed\",\r\n    \"outlet_suburb\" : \"outlet_suburb\",\r\n    \"outlet_longitude\" : 4.145608,\r\n    \"outlet_name\" : \"outlet_name\",\r\n    \"outlet_distance\" : 3.6160767,\r\n    \"outlet_business\" : \"outlet_business\",\r\n    \"outlet_business_hour_mon\" : \"outlet_business_hour_mon\",\r\n    \"outlet_business_hour_sun\" : \"outlet_business_hour_sun\",\r\n    \"outlet_slid_spid\" : \"outlet_slid_spid\",\r\n    \"outlet_business_hour_sat\" : \"outlet_business_hour_sat\",\r\n    \"outlet_notes\" : \"outlet_notes\",\r\n    \"outlet_business_hour_tue\" : \"outlet_business_hour_tue\",\r\n    \"outlet_latitude\" : 2.027123\r\n  }, {\r\n    \"outlet_business_hour_thur\" : \"outlet_business_hour_thur\",\r\n    \"outlet_postcode\" : 7,\r\n    \"outlet_business_hour_fri\" : \"outlet_business_hour_fri\",\r\n    \"outlet_business_hour_wed\" : \"outlet_business_hour_wed\",\r\n    \"outlet_suburb\" : \"outlet_suburb\",\r\n    \"outlet_longitude\" : 4.145608,\r\n    \"outlet_name\" : \"outlet_name\",\r\n    \"outlet_distance\" : 3.6160767,\r\n    \"outlet_business\" : \"outlet_business\",\r\n    \"outlet_business_hour_mon\" : \"outlet_business_hour_mon\",\r\n    \"outlet_business_hour_sun\" : \"outlet_business_hour_sun\",\r\n    \"outlet_slid_spid\" : \"outlet_slid_spid\",\r\n    \"outlet_business_hour_sat\" : \"outlet_business_hour_sat\",\r\n    \"outlet_notes\" : \"outlet_notes\",\r\n    \"outlet_business_hour_tue\" : \"outlet_business_hour_tue\",\r\n    \"outlet_latitude\" : 2.027123\r\n  } ],\r\n  \"stops\" : [ {\r\n    \"routes\" : [ {\r\n      \"route_service_status\" : {\r\n        \"description\" : \"description\",\r\n        \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\r\n      },\r\n      \"route_id\" : 5,\r\n      \"route_name\" : \"route_name\",\r\n      \"route_type\" : 1,\r\n      \"route_number\" : \"route_number\",\r\n      \"route_gtfs_id\" : \"route_gtfs_id\"\r\n    }, {\r\n      \"route_service_status\" : {\r\n        \"description\" : \"description\",\r\n        \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\r\n      },\r\n      \"route_id\" : 5,\r\n      \"route_name\" : \"route_name\",\r\n      \"route_type\" : 1,\r\n      \"route_number\" : \"route_number\",\r\n      \"route_gtfs_id\" : \"route_gtfs_id\"\r\n    } ],\r\n    \"stop_longitude\" : 2.302136,\r\n    \"stop_sequence\" : 7,\r\n    \"route_type\" : 6,\r\n    \"stop_id\" : 9,\r\n    \"stop_landmark\" : \"stop_landmark\",\r\n    \"stop_suburb\" : \"stop_suburb\",\r\n    \"stop_distance\" : 0.8008282,\r\n    \"stop_name\" : \"stop_name\",\r\n    \"stop_latitude\" : 5.637377\r\n  }, {\r\n    \"routes\" : [ {\r\n      \"route_service_status\" : {\r\n        \"description\" : \"description\",\r\n        \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\r\n      },\r\n      \"route_id\" : 5,\r\n      \"route_name\" : \"route_name\",\r\n      \"route_type\" : 1,\r\n      \"route_number\" : \"route_number\",\r\n      \"route_gtfs_id\" : \"route_gtfs_id\"\r\n    }, {\r\n      \"route_service_status\" : {\r\n        \"description\" : \"description\",\r\n        \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\r\n      },\r\n      \"route_id\" : 5,\r\n      \"route_name\" : \"route_name\",\r\n      \"route_type\" : 1,\r\n      \"route_number\" : \"route_number\",\r\n      \"route_gtfs_id\" : \"route_gtfs_id\"\r\n    } ],\r\n    \"stop_longitude\" : 2.302136,\r\n    \"stop_sequence\" : 7,\r\n    \"route_type\" : 6,\r\n    \"stop_id\" : 9,\r\n    \"stop_landmark\" : \"stop_landmark\",\r\n    \"stop_suburb\" : \"stop_suburb\",\r\n    \"stop_distance\" : 0.8008282,\r\n    \"stop_name\" : \"stop_name\",\r\n    \"stop_latitude\" : 5.637377\r\n  } ],\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3SearchResult.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3SearchResult>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3SearchResult>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3StopResponse> stopsStopDetails(@Parameter(in = ParameterIn.PATH, description = "Identifier of stop; values returned by Stops API", required=true, schema=@Schema()) @PathVariable("stop_id") Integer stopId
,@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API", required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @PathVariable("route_type") Integer routeType
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop location information will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "stop_location", required = false) Boolean stopLocation
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop amenity information will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "stop_amenities", required = false) Boolean stopAmenities
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop accessibility information will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "stop_accessibility", required = false) Boolean stopAccessibility
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop contact information will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "stop_contact", required = false) Boolean stopContact
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop ticket information will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "stop_ticket", required = false) Boolean stopTicket
,@Parameter(in = ParameterIn.QUERY, description = "Incdicates whether the stop_id is a GTFS ID or not" ,schema=@Schema()) @Valid @RequestParam(value = "gtfs", required = false) Boolean gtfs
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop staffing information will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "stop_staffing", required = false) Boolean stopStaffing
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop disruption information will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "stop_disruptions", required = false) Boolean stopDisruptions
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3StopResponse>(objectMapper.readValue("{\r\n  \"stop\" : {\r\n    \"station_description\" : \"station_description\",\r\n    \"routes\" : [ { }, { } ],\r\n    \"stop_amenities\" : {\r\n      \"taxi_rank\" : true,\r\n      \"toilet\" : true,\r\n      \"car_parking\" : \"car_parking\",\r\n      \"cctv\" : true\r\n    },\r\n    \"route_type\" : 6,\r\n    \"stop_staffing\" : {\r\n      \"sun_am_to\" : \"sun_am_to\",\r\n      \"sun_am_from\" : \"sun_am_from\",\r\n      \"sun_pm_to\" : \"sun_pm_to\",\r\n      \"tue_am_from\" : \"tue_am_from\",\r\n      \"ph_from\" : \"ph_from\",\r\n      \"sat_am_from\" : \"sat_am_from\",\r\n      \"wed_am_from\" : \"wed_am_from\",\r\n      \"ph_additional_text\" : \"ph_additional_text\",\r\n      \"sun_pm_from\" : \"sun_pm_from\",\r\n      \"thu_pm_to\" : \"thu_pm_to\",\r\n      \"fri_am_to\" : \"fri_am_to\",\r\n      \"fri_pm_from\" : \"fri_pm_from\",\r\n      \"sat_pm_from\" : \"sat_pm_from\",\r\n      \"tue_am_to\" : \"tue_am_to\",\r\n      \"tue_pm_from\" : \"tue_pm_from\",\r\n      \"sat_am_to\" : \"sat_am_to\",\r\n      \"thu_pm_from\" : \"thu_pm_from\",\r\n      \"mon_am_to\" : \"mon_am_to\",\r\n      \"mon_pm_to\" : \"mon_pm_to\",\r\n      \"fri_am_from\" : \"fri_am_from\",\r\n      \"fri_pm_to\" : \"fri_pm_to\",\r\n      \"thu_am_from\" : \"thu_am_from\",\r\n      \"thu_am_to\" : \"thu_am_to\",\r\n      \"mon_pm_from\" : \"mon_pm_from\",\r\n      \"sat_pm_to\" : \"sat_pm_to\",\r\n      \"tue_pm_to\" : \"tue_pm_to\",\r\n      \"ph_to\" : \"ph_to\",\r\n      \"wed_pm_from\" : \"wed_pm_from\",\r\n      \"wed_pm_To\" : \"wed_pm_To\",\r\n      \"mon_am_from\" : \"mon_am_from\",\r\n      \"wed_am_to\" : \"wed_am_to\"\r\n    },\r\n    \"stop_id\" : 2,\r\n    \"stop_location\" : {\r\n      \"gps\" : {\r\n        \"latitude\" : 1.4658129,\r\n        \"longitude\" : 5.962134\r\n      }\r\n    },\r\n    \"stop_accessibility\" : {\r\n      \"wheelchair\" : {\r\n        \"parking\" : true,\r\n        \"raised_platform_shelther\" : true,\r\n        \"toilet\" : true,\r\n        \"low_ticket_counter\" : true,\r\n        \"ramp\" : true,\r\n        \"accessible_ramp\" : true,\r\n        \"manouvering\" : true,\r\n        \"steep_ramp\" : true,\r\n        \"telephone\" : true,\r\n        \"secondary_path\" : true,\r\n        \"raised_platform\" : true\r\n      },\r\n      \"escalator\" : true,\r\n      \"hearing_loop\" : true,\r\n      \"waiting_room\" : true,\r\n      \"stairs\" : true,\r\n      \"platform_number\" : 5,\r\n      \"lift\" : true,\r\n      \"tactile_ground_surface_indicator\" : true,\r\n      \"lighting\" : true,\r\n      \"stop_accessible\" : true,\r\n      \"audio_customer_information\" : true\r\n    },\r\n    \"stop_landmark\" : \"stop_landmark\",\r\n    \"station_type\" : \"station_type\",\r\n    \"disruption_ids\" : [ 0, 0 ],\r\n    \"stop_name\" : \"stop_name\"\r\n  },\r\n  \"disruptions\" : {\r\n    \"key\" : {\r\n      \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_type\" : \"disruption_type\",\r\n      \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"description\" : \"description\",\r\n      \"display_on_board\" : true,\r\n      \"title\" : \"title\",\r\n      \"url\" : \"url\",\r\n      \"routes\" : [ {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      }, {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      } ],\r\n      \"disruption_id\" : 6,\r\n      \"colour\" : \"colour\",\r\n      \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_status\" : \"disruption_status\",\r\n      \"stops\" : [ {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      }, {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      } ],\r\n      \"display_status\" : true\r\n    }\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3StopResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3StopResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3StopResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3StopsByDistanceResponse> stopsStopsByGeolocation(@Parameter(in = ParameterIn.PATH, description = "Geographic coordinate of latitude", required=true, schema=@Schema()) @PathVariable("latitude") Float latitude
,@Parameter(in = ParameterIn.PATH, description = "Geographic coordinate of longitude", required=true, schema=@Schema()) @PathVariable("longitude") Float longitude
,@Parameter(in = ParameterIn.QUERY, description = "Filter by route_type; values returned via RouteTypes API" ,schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @Valid @RequestParam(value = "route_types", required = false) List<Integer> routeTypes
,@Parameter(in = ParameterIn.QUERY, description = "Maximum number of results returned (default = 30)" ,schema=@Schema()) @Valid @RequestParam(value = "max_results", required = false) Integer maxResults
,@Parameter(in = ParameterIn.QUERY, description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)" ,schema=@Schema()) @Valid @RequestParam(value = "max_distance", required = false) Double maxDistance
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop disruption information will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "stop_disruptions", required = false) Boolean stopDisruptions
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3StopsByDistanceResponse>(objectMapper.readValue("{\r\n  \"disruptions\" : {\r\n    \"key\" : {\r\n      \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_type\" : \"disruption_type\",\r\n      \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"description\" : \"description\",\r\n      \"display_on_board\" : true,\r\n      \"title\" : \"title\",\r\n      \"url\" : \"url\",\r\n      \"routes\" : [ {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      }, {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      } ],\r\n      \"disruption_id\" : 6,\r\n      \"colour\" : \"colour\",\r\n      \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_status\" : \"disruption_status\",\r\n      \"stops\" : [ {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      }, {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      } ],\r\n      \"display_status\" : true\r\n    }\r\n  },\r\n  \"stops\" : [ {\r\n    \"routes\" : [ { }, { } ],\r\n    \"stop_longitude\" : 2.302136,\r\n    \"stop_sequence\" : 7,\r\n    \"stop_id\" : 1,\r\n    \"route_type\" : 5,\r\n    \"stop_landmark\" : \"stop_landmark\",\r\n    \"stop_suburb\" : \"stop_suburb\",\r\n    \"disruption_ids\" : [ 0, 0 ],\r\n    \"stop_distance\" : 6.0274563,\r\n    \"stop_name\" : \"stop_name\",\r\n    \"stop_latitude\" : 5.637377\r\n  }, {\r\n    \"routes\" : [ { }, { } ],\r\n    \"stop_longitude\" : 2.302136,\r\n    \"stop_sequence\" : 7,\r\n    \"stop_id\" : 1,\r\n    \"route_type\" : 5,\r\n    \"stop_landmark\" : \"stop_landmark\",\r\n    \"stop_suburb\" : \"stop_suburb\",\r\n    \"disruption_ids\" : [ 0, 0 ],\r\n    \"stop_distance\" : 6.0274563,\r\n    \"stop_name\" : \"stop_name\",\r\n    \"stop_latitude\" : 5.637377\r\n  } ],\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3StopsByDistanceResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3StopsByDistanceResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3StopsByDistanceResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<V3StopsOnRouteResponse> stopsStopsForRoute(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes", required=true, schema=@Schema()) @PathVariable("route_id") Integer routeId
,@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API", required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @PathVariable("route_type") Integer routeType
,@Parameter(in = ParameterIn.QUERY, description = "An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response." ,schema=@Schema()) @Valid @RequestParam(value = "direction_id", required = false) Integer directionId
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop disruption information will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "stop_disruptions", required = false) Boolean stopDisruptions
,@Parameter(in = ParameterIn.QUERY, description = "Indicates if geopath data will be returned (default = false)" ,schema=@Schema()) @Valid @RequestParam(value = "include_geopath", required = false) Boolean includeGeopath
,@Parameter(in = ParameterIn.QUERY, description = "Filter geopaths by date (ISO 8601 UTC format) (default = current date)" ,schema=@Schema()) @Valid @RequestParam(value = "geopath_utc", required = false) OffsetDateTime geopathUtc
,@Parameter(in = ParameterIn.QUERY, description = "Please ignore" ,schema=@Schema()) @Valid @RequestParam(value = "token", required = false) String token
,@Parameter(in = ParameterIn.QUERY, description = "Your developer id" ,schema=@Schema()) @Valid @RequestParam(value = "devid", required = false) String devid
,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request" ,schema=@Schema()) @Valid @RequestParam(value = "signature", required = false) String signature
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<V3StopsOnRouteResponse>(objectMapper.readValue("{\r\n  \"disruptions\" : {\r\n    \"key\" : {\r\n      \"last_updated\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"from_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_type\" : \"disruption_type\",\r\n      \"published_on\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"description\" : \"description\",\r\n      \"display_on_board\" : true,\r\n      \"title\" : \"title\",\r\n      \"url\" : \"url\",\r\n      \"routes\" : [ {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      }, {\r\n        \"route_id\" : 2,\r\n        \"route_name\" : \"route_name\",\r\n        \"route_type\" : 1,\r\n        \"route_number\" : \"route_number\",\r\n        \"route_gtfs_id\" : \"route_gtfs_id\",\r\n        \"direction\" : {\r\n          \"service_time\" : \"service_time\",\r\n          \"direction_id\" : 6,\r\n          \"direction_name\" : \"direction_name\",\r\n          \"route_direction_id\" : 6\r\n        }\r\n      } ],\r\n      \"disruption_id\" : 6,\r\n      \"colour\" : \"colour\",\r\n      \"to_date\" : \"2000-01-23T04:56:07.000+00:00\",\r\n      \"disruption_status\" : \"disruption_status\",\r\n      \"stops\" : [ {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      }, {\r\n        \"stop_id\" : 5,\r\n        \"stop_name\" : \"stop_name\"\r\n      } ],\r\n      \"display_status\" : true\r\n    }\r\n  },\r\n  \"stops\" : [ {\r\n    \"stop_ticket\" : {\r\n      \"ticket_type\" : \"ticket_type\",\r\n      \"vline_reservation\" : true,\r\n      \"zone\" : \"zone\",\r\n      \"ticket_machine\" : true,\r\n      \"ticket_zones\" : [ 7, 7 ],\r\n      \"is_free_fare_zone\" : true,\r\n      \"ticket_checks\" : true\r\n    },\r\n    \"stop_longitude\" : 5.962134,\r\n    \"stop_sequence\" : 5,\r\n    \"route_type\" : 6,\r\n    \"stop_id\" : 2,\r\n    \"stop_landmark\" : \"stop_landmark\",\r\n    \"stop_suburb\" : \"stop_suburb\",\r\n    \"disruption_ids\" : [ 0, 0 ],\r\n    \"stop_name\" : \"stop_name\",\r\n    \"stop_latitude\" : 1.4658129\r\n  }, {\r\n    \"stop_ticket\" : {\r\n      \"ticket_type\" : \"ticket_type\",\r\n      \"vline_reservation\" : true,\r\n      \"zone\" : \"zone\",\r\n      \"ticket_machine\" : true,\r\n      \"ticket_zones\" : [ 7, 7 ],\r\n      \"is_free_fare_zone\" : true,\r\n      \"ticket_checks\" : true\r\n    },\r\n    \"stop_longitude\" : 5.962134,\r\n    \"stop_sequence\" : 5,\r\n    \"route_type\" : 6,\r\n    \"stop_id\" : 2,\r\n    \"stop_landmark\" : \"stop_landmark\",\r\n    \"stop_suburb\" : \"stop_suburb\",\r\n    \"disruption_ids\" : [ 0, 0 ],\r\n    \"stop_name\" : \"stop_name\",\r\n    \"stop_latitude\" : 1.4658129\r\n  } ],\r\n  \"geopath\" : [ { }, { } ],\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}", V3StopsOnRouteResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<V3StopsOnRouteResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<V3StopsOnRouteResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
