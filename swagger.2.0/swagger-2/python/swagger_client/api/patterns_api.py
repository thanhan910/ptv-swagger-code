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


class PatternsApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def patterns_get_pattern_by_run(self, run_ref, route_type, expand, **kwargs):  # noqa: E501
        """View the stopping pattern for a specific trip/service run  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.patterns_get_pattern_by_run(run_ref, route_type, expand, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str run_ref: The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead. (required)
        :param int route_type: Number identifying transport mode; values returned via RouteTypes API (required)
        :param list[str] expand: List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (required)
        :param int stop_id: Filter by stop_id; values returned by Stops API
        :param datetime date_utc: Filter by the date and time of the request (ISO 8601 UTC format)
        :param bool include_skipped_stops: Include any skipped stops in a stopping pattern. Defaults to false.
        :param bool include_geopath: Indicates if geopath data will be returned (default = false)
        :param str token: Please ignore
        :param str devid: Your developer id
        :param str signature: Authentication signature for request
        :return: V3StoppingPattern
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.patterns_get_pattern_by_run_with_http_info(run_ref, route_type, expand, **kwargs)  # noqa: E501
        else:
            (data) = self.patterns_get_pattern_by_run_with_http_info(run_ref, route_type, expand, **kwargs)  # noqa: E501
            return data

    def patterns_get_pattern_by_run_with_http_info(self, run_ref, route_type, expand, **kwargs):  # noqa: E501
        """View the stopping pattern for a specific trip/service run  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.patterns_get_pattern_by_run_with_http_info(run_ref, route_type, expand, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str run_ref: The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead. (required)
        :param int route_type: Number identifying transport mode; values returned via RouteTypes API (required)
        :param list[str] expand: List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (required)
        :param int stop_id: Filter by stop_id; values returned by Stops API
        :param datetime date_utc: Filter by the date and time of the request (ISO 8601 UTC format)
        :param bool include_skipped_stops: Include any skipped stops in a stopping pattern. Defaults to false.
        :param bool include_geopath: Indicates if geopath data will be returned (default = false)
        :param str token: Please ignore
        :param str devid: Your developer id
        :param str signature: Authentication signature for request
        :return: V3StoppingPattern
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['run_ref', 'route_type', 'expand', 'stop_id', 'date_utc', 'include_skipped_stops', 'include_geopath', 'token', 'devid', 'signature']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method patterns_get_pattern_by_run" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'run_ref' is set
        if self.api_client.client_side_validation and ('run_ref' not in params or
                                                       params['run_ref'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `run_ref` when calling `patterns_get_pattern_by_run`")  # noqa: E501
        # verify the required parameter 'route_type' is set
        if self.api_client.client_side_validation and ('route_type' not in params or
                                                       params['route_type'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `route_type` when calling `patterns_get_pattern_by_run`")  # noqa: E501
        # verify the required parameter 'expand' is set
        if self.api_client.client_side_validation and ('expand' not in params or
                                                       params['expand'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `expand` when calling `patterns_get_pattern_by_run`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'run_ref' in params:
            path_params['run_ref'] = params['run_ref']  # noqa: E501
        if 'route_type' in params:
            path_params['route_type'] = params['route_type']  # noqa: E501

        query_params = []
        if 'expand' in params:
            query_params.append(('expand', params['expand']))  # noqa: E501
            collection_formats['expand'] = 'multi'  # noqa: E501
        if 'stop_id' in params:
            query_params.append(('stop_id', params['stop_id']))  # noqa: E501
        if 'date_utc' in params:
            query_params.append(('date_utc', params['date_utc']))  # noqa: E501
        if 'include_skipped_stops' in params:
            query_params.append(('include_skipped_stops', params['include_skipped_stops']))  # noqa: E501
        if 'include_geopath' in params:
            query_params.append(('include_geopath', params['include_geopath']))  # noqa: E501
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
            '/v3/pattern/run/{run_ref}/route_type/{route_type}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='V3StoppingPattern',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)