# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.models.v3_stopping_pattern import V3StoppingPattern  # noqa: E501
from swagger_server.test import BaseTestCase


class TestPatternsController(BaseTestCase):
    """PatternsController integration test stubs"""

    def test_patterns_get_pattern_by_run(self):
        """Test case for patterns_get_pattern_by_run

        View the stopping pattern for a specific trip/service run
        """
        query_string = [('expand', 'expand_example'),
                        ('stop_id', 56),
                        ('date_utc', '2013-10-20T19:20:30+01:00'),
                        ('include_skipped_stops', true),
                        ('include_geopath', true),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/pattern/run/{run_ref}/route_type/{route_type}'.format(run_ref='run_ref_example', route_type=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
