# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.models.v3_route_response import V3RouteResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestRoutesController(BaseTestCase):
    """RoutesController integration test stubs"""

    def test_routes_one_or_more_routes(self):
        """Test case for routes_one_or_more_routes

        View route names and numbers for all routes
        """
        query_string = [('route_types', 56),
                        ('route_name', 'route_name_example'),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/routes',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_routes_route_from_id(self):
        """Test case for routes_route_from_id

        View route name and number for specific route ID
        """
        query_string = [('include_geopath', true),
                        ('geopath_utc', '2013-10-20T19:20:30+01:00'),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/routes/{route_id}'.format(route_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
