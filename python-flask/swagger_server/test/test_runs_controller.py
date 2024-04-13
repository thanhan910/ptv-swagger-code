# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.models.v3_run_response import V3RunResponse  # noqa: E501
from swagger_server.models.v3_runs_response import V3RunsResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestRunsController(BaseTestCase):
    """RunsController integration test stubs"""

    def test_runs_for_route(self):
        """Test case for runs_for_route

        View all trip/service runs for a specific route ID
        """
        query_string = [('expand', 'expand_example'),
                        ('date_utc', '2013-10-20T19:20:30+01:00'),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/runs/route/{route_id}'.format(route_id=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_runs_for_route_and_route_type(self):
        """Test case for runs_for_route_and_route_type

        View all trip/service runs for a specific route ID and route type
        """
        query_string = [('expand', 'expand_example'),
                        ('date_utc', '2013-10-20T19:20:30+01:00'),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/runs/route/{route_id}/route_type/{route_type}'.format(route_id=56, route_type=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_runs_for_run(self):
        """Test case for runs_for_run

        View all trip/service runs for a specific run_ref
        """
        query_string = [('expand', 'expand_example'),
                        ('date_utc', '2013-10-20T19:20:30+01:00'),
                        ('include_geopath', true),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/runs/{run_ref}'.format(run_ref='run_ref_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_runs_for_run_and_route_type(self):
        """Test case for runs_for_run_and_route_type

        View the trip/service run for a specific run_ref and route type
        """
        query_string = [('expand', 'expand_example'),
                        ('date_utc', '2013-10-20T19:20:30+01:00'),
                        ('include_geopath', true),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/runs/{run_ref}/route_type/{route_type}'.format(run_ref='run_ref_example', route_type=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
