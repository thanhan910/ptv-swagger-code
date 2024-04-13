# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.v3_error_response import V3ErrorResponse  # noqa: E501
from swagger_server.models.v3_search_result import V3SearchResult  # noqa: E501
from swagger_server.test import BaseTestCase


class TestSearchController(BaseTestCase):
    """SearchController integration test stubs"""

    def test_search_search(self):
        """Test case for search_search

        View stops, routes and myki ticket outlets that match the search term
        """
        query_string = [('route_types', 56),
                        ('latitude', 3.4),
                        ('longitude', 3.4),
                        ('max_distance', 3.4),
                        ('include_addresses', true),
                        ('include_outlets', true),
                        ('match_stop_by_suburb', true),
                        ('match_route_by_suburb', true),
                        ('match_stop_by_gtfs_stop_id', true),
                        ('token', 'token_example'),
                        ('devid', 'devid_example'),
                        ('signature', 'signature_example')]
        response = self.client.open(
            '//v3/search/{search_term}'.format(search_term='search_term_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
