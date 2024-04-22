# coding: utf-8

"""
    PTV Timetable API - Version 3

    The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.    # noqa: E501

    OpenAPI spec version: v3
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class RoutesApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def routes_one_or_more_routes(self, **kwargs):  # noqa: E501
        """View route names and numbers for all routes  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.routes_one_or_more_routes(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param list[int] route_types: Filter by route_type; values returned via RouteTypes API
        :param str route_name: Filter by name  of route (accepts partial route name matches)
        :param str token: Please ignore
        :param str devid: Your developer id
        :param str signature: Authentication signature for request
        :return: V3RouteResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.routes_one_or_more_routes_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.routes_one_or_more_routes_with_http_info(**kwargs)  # noqa: E501
            return data

    def routes_one_or_more_routes_with_http_info(self, **kwargs):  # noqa: E501
        """View route names and numbers for all routes  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.routes_one_or_more_routes_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param list[int] route_types: Filter by route_type; values returned via RouteTypes API
        :param str route_name: Filter by name  of route (accepts partial route name matches)
        :param str token: Please ignore
        :param str devid: Your developer id
        :param str signature: Authentication signature for request
        :return: V3RouteResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['route_types', 'route_name', 'token', 'devid', 'signature']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method routes_one_or_more_routes" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'route_types' in params:
            query_params.append(('route_types', params['route_types']))  # noqa: E501
            collection_formats['route_types'] = 'multi'  # noqa: E501
        if 'route_name' in params:
            query_params.append(('route_name', params['route_name']))  # noqa: E501
        if 'token' in params:
            query_params.append(('token', params['token']))  # noqa: E501
        if 'devid' in params:
            query_params.append(('devid', params['devid']))  # noqa: E501
        if 'signature' in params:
            query_params.append(('signature', params['signature']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'text/json', 'text/html'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/v3/routes', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='V3RouteResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def routes_route_from_id(self, route_id, **kwargs):  # noqa: E501
        """View route name and number for specific route ID  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.routes_route_from_id(route_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int route_id: Identifier of route; values returned by Departures, Directions and Disruptions APIs (required)
        :param bool include_geopath: Indicates kif geopath data will be returned (default = false)
        :param datetime geopath_utc: Filter geopaths by date (ISO 8601 UTC format) (default = current date)
        :param str token: Please ignore
        :param str devid: Your developer id
        :param str signature: Authentication signature for request
        :return: V3RouteResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.routes_route_from_id_with_http_info(route_id, **kwargs)  # noqa: E501
        else:
            (data) = self.routes_route_from_id_with_http_info(route_id, **kwargs)  # noqa: E501
            return data

    def routes_route_from_id_with_http_info(self, route_id, **kwargs):  # noqa: E501
        """View route name and number for specific route ID  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.routes_route_from_id_with_http_info(route_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int route_id: Identifier of route; values returned by Departures, Directions and Disruptions APIs (required)
        :param bool include_geopath: Indicates kif geopath data will be returned (default = false)
        :param datetime geopath_utc: Filter geopaths by date (ISO 8601 UTC format) (default = current date)
        :param str token: Please ignore
        :param str devid: Your developer id
        :param str signature: Authentication signature for request
        :return: V3RouteResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['route_id', 'include_geopath', 'geopath_utc', 'token', 'devid', 'signature']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method routes_route_from_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'route_id' is set
        if self.api_client.client_side_validation and ('route_id' not in params or
                                                       params['route_id'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `route_id` when calling `routes_route_from_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'route_id' in params:
            path_params['route_id'] = params['route_id']  # noqa: E501

        query_params = []
        if 'include_geopath' in params:
            query_params.append(('include_geopath', params['include_geopath']))  # noqa: E501
        if 'geopath_utc' in params:
            query_params.append(('geopath_utc', params['geopath_utc']))  # noqa: E501
        if 'token' in params:
            query_params.append(('token', params['token']))  # noqa: E501
        if 'devid' in params:
            query_params.append(('devid', params['devid']))  # noqa: E501
        if 'signature' in params:
            query_params.append(('signature', params['signature']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'text/json', 'text/html'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/v3/routes/{route_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='V3RouteResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
