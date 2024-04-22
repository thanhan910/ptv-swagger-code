# coding: utf-8

"""
    PTV Timetable API - Version 3

    The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  

    The version of the OpenAPI document: v3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ptv_api_client.models.v3_bulk_departures_request import V3BulkDeparturesRequest

class TestV3BulkDeparturesRequest(unittest.TestCase):
    """V3BulkDeparturesRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> V3BulkDeparturesRequest:
        """Test V3BulkDeparturesRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `V3BulkDeparturesRequest`
        """
        model = V3BulkDeparturesRequest()
        if include_optional:
            return V3BulkDeparturesRequest(
                requests = [
                    ptv_api_client.models.v3/stop_departure_request.V3.StopDepartureRequest(
                        route_type = 0, 
                        stop_id = 0, 
                        max_results = 0, 
                        gtfs = True, 
                        route_directions = [
                            ptv_api_client.models.v3/stop_departure_request_route_direction.V3.StopDepartureRequestRouteDirection(
                                route_id = '', 
                                direction_id = 0, 
                                direction_name = '', )
                            ], )
                    ],
                date_utc = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                look_backwards = True,
                include_cancelled = True,
                include_geopath = True,
                expand = [
                    'All'
                    ]
            )
        else:
            return V3BulkDeparturesRequest(
                requests = [
                    ptv_api_client.models.v3/stop_departure_request.V3.StopDepartureRequest(
                        route_type = 0, 
                        stop_id = 0, 
                        max_results = 0, 
                        gtfs = True, 
                        route_directions = [
                            ptv_api_client.models.v3/stop_departure_request_route_direction.V3.StopDepartureRequestRouteDirection(
                                route_id = '', 
                                direction_id = 0, 
                                direction_name = '', )
                            ], )
                    ],
        )
        """

    def testV3BulkDeparturesRequest(self):
        """Test V3BulkDeparturesRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()