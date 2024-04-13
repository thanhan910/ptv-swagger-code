# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.v3_disruption_modes_response import V3DisruptionModesResponse  # noqa: E501
from swagger_server.models.v3_disruption_response import V3DisruptionResponse  # noqa: E501
from swagger_server.models.v3_disruptions_response import V3DisruptionsResponse  # noqa: E501
from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestDisruptionsController(BaseTestCase):
    """DisruptionsController integration test stubs"""

    def test_disruptions_get_all_disruptions(self):
        """Test case for disruptions_get_all_disruptions

        View all disruptions for all route types
        """
        query_string = [('route_types', 56),
                        ('disruption_modes', 56),
                        ('disruption_status', 'disruption_status_example'),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/disruptions',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_disruptions_get_disruption_by_id(self):
        """Test case for disruptions_get_disruption_by_id

        View a specific disruption
        """
        query_string = [('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/disruptions/{disruption_id}'.format(disruption_id=789),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_disruptions_get_disruption_modes(self):
        """Test case for disruptions_get_disruption_modes

        Get all disruption modes
        """
        query_string = [('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/disruptions/modes',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_disruptions_get_disruptions_by_route(self):
        """Test case for disruptions_get_disruptions_by_route

        View all disruptions for a particular route
        """
        query_string = [('disruption_status', 'disruption_status_example'),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/disruptions/route/{route_id}'.format(route_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_disruptions_get_disruptions_by_route_and_stop(self):
        """Test case for disruptions_get_disruptions_by_route_and_stop

        View all disruptions for a particular route and stop
        """
        query_string = [('disruption_status', 'disruption_status_example'),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/disruptions/route/{route_id}/stop/{stop_id}'.format(route_id=56, stop_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_disruptions_get_disruptions_by_stop(self):
        """Test case for disruptions_get_disruptions_by_stop

        View all disruptions for a particular stop
        """
        query_string = [('disruption_status', 'disruption_status_example'),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/disruptions/stop/{stop_id}'.format(stop_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
