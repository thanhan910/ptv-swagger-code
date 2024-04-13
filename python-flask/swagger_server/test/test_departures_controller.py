# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.v3_departures_response import V3DeparturesResponse  # noqa: E501
from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestDeparturesController(BaseTestCase):
    """DeparturesController integration test stubs"""

    def test_departures_get_for_stop(self):
        """Test case for departures_get_for_stop

        View departures for all routes from a stop
        """
        query_string = [('platform_numbers', 56),
                        ('direction_id', 56),
                        ('gtfs', true),
                        ('date_utc', '2013-10-20T19:20:30+01:00'),
                        ('max_results', 56),
                        ('include_cancelled', true),
                        ('look_backwards', true),
                        ('expand', 'expand_example'),
                        ('include_geopath', true),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/departures/route_type/{route_type}/stop/{stop_id}'.format(route_type=56, stop_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_departures_get_for_stop_and_route(self):
        """Test case for departures_get_for_stop_and_route

        View departures for a specific route from a stop
        """
        query_string = [('direction_id', 56),
                        ('gtfs', true),
                        ('date_utc', '2013-10-20T19:20:30+01:00'),
                        ('max_results', 56),
                        ('include_cancelled', true),
                        ('look_backwards', true),
                        ('expand', 'expand_example'),
                        ('include_geopath', true),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id}'.format(route_type=56, stop_id=56, route_id='route_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
