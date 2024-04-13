# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.models.v3_route_types_response import V3RouteTypesResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestRouteTypesController(BaseTestCase):
    """RouteTypesController integration test stubs"""

    def test_route_types_get_route_types(self):
        """Test case for route_types_get_route_types

        View all route types and their names
        """
        query_string = [('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/route_types',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
