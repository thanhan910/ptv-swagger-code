# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.models.v3_fare_estimate_response import V3FareEstimateResponse  # noqa: E501
from swagger_server.test import BaseTestCase


class TestFareEstimateController(BaseTestCase):
    """FareEstimateController integration test stubs"""

    def test_fare_estimate_get_fare_estimate_by_zone(self):
        """Test case for fare_estimate_get_fare_estimate_by_zone

        Estimate a fare by zone
        """
        query_string = [('journey_touch_on_utc', '2013-10-20T19:20:30+01:00'),
                        ('journey_touch_off_utc', '2013-10-20T19:20:30+01:00'),
                        ('is_journey_in_free_tram_zone', true),
                        ('travelled_route_types', 56),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone}'.format(min_zone=56, max_zone=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
