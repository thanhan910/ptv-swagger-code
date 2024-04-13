# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.models.v3_outlet_geolocation_response import V3OutletGeolocationResponse  # noqa: E501
from swagger_server.models.v3_outlet_response import V3OutletResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestOutletsController(BaseTestCase):
    """OutletsController integration test stubs"""

    def test_outlets_get_all_outlets(self):
        """Test case for outlets_get_all_outlets

        List all ticket outlets
        """
        query_string = [('max_results', 56),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/outlets',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_outlets_get_outlets_by_geolocation(self):
        """Test case for outlets_get_outlets_by_geolocation

        List ticket outlets near a specific location
        """
        query_string = [('max_distance', 1.2),
                        ('max_results', 56),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/outlets/location/{latitude},{longitude}'.format(latitude=3.4, longitude=3.4),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
