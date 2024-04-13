# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.models.v3_stop_response import V3StopResponse  # noqa: E501
from swagger_server.models.v3_stops_by_distance_response import V3StopsByDistanceResponse  # noqa: E501
from swagger_server.models.v3_stops_on_route_response import V3StopsOnRouteResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestStopsController(BaseTestCase):
    """StopsController integration test stubs"""

    def test_stops_stop_details(self):
        """Test case for stops_stop_details

        View facilities at a specific stop (Metro and V/Line stations only)
        """
        query_string = [('stop_location', true),
                        ('stop_amenities', true),
                        ('stop_accessibility', true),
                        ('stop_contact', true),
                        ('stop_ticket', true),
                        ('gtfs', true),
                        ('stop_staffing', true),
                        ('stop_disruptions', true),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/stops/{stop_id}/route_type/{route_type}'.format(stop_id=56, route_type=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_stops_stops_by_geolocation(self):
        """Test case for stops_stops_by_geolocation

        View all stops near a specific location
        """
        query_string = [('route_types', 56),
                        ('max_results', 56),
                        ('max_distance', 1.2),
                        ('stop_disruptions', true),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/stops/location/{latitude},{longitude}'.format(latitude=3.4, longitude=3.4),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_stops_stops_for_route(self):
        """Test case for stops_stops_for_route

        View all stops on a specific route
        """
        query_string = [('direction_id', 56),
                        ('stop_disruptions', true),
                        ('include_geopath', true),
                        ('geopath_utc', '2013-10-20T19:20:30+01:00'),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/stops/route/{route_id}/route_type/{route_type}'.format(route_id=56, route_type=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
