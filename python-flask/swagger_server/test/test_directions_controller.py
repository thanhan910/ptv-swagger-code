# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.v3_directions_response import V3DirectionsResponse  # noqa: E501
from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestDirectionsController(BaseTestCase):
    """DirectionsController integration test stubs"""

    def test_directions_for_direction(self):
        """Test case for directions_for_direction

        View all routes for a direction of travel
        """
        query_string = [('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/directions/{direction_id}'.format(direction_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_directions_for_direction_and_type(self):
        """Test case for directions_for_direction_and_type

        View all routes of a particular type for a direction of travel
        """
        query_string = [('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/directions/{direction_id}/route_type/{route_type}'.format(direction_id=56, route_type=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_directions_for_route(self):
        """Test case for directions_for_route

        View directions that a route travels in
        """
        query_string = [('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/directions/route/{route_id}'.format(route_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
