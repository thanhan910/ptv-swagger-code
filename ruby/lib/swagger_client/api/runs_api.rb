=begin
#PTV Timetable API - Version 3

#The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  

OpenAPI spec version: v3

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.52
=end

module SwaggerClient
  class RunsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # View all trip/service runs for a specific route ID
    # @param route_id Identifier of route; values returned by Routes API - v3/routes.
    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :expand List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
    # @option opts [DateTime] :date_utc Date of the request. (optional - defaults to now)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [V3RunsResponse]
    def runs_for_route(route_id, opts = {})
      data, _status_code, _headers = runs_for_route_with_http_info(route_id, opts)
      data
    end

    # View all trip/service runs for a specific route ID
    # @param route_id Identifier of route; values returned by Routes API - v3/routes.
    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :expand List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
    # @option opts [DateTime] :date_utc Date of the request. (optional - defaults to now)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [Array<(V3RunsResponse, Integer, Hash)>] V3RunsResponse data, response status code and response headers
    def runs_for_route_with_http_info(route_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RunsApi.runs_for_route ...'
      end
      # verify the required parameter 'route_id' is set
      if @api_client.config.client_side_validation && route_id.nil?
        fail ArgumentError, "Missing the required parameter 'route_id' when calling RunsApi.runs_for_route"
      end
      if @api_client.config.client_side_validation && opts[:'expand'] && !opts[:'expand'].all? { |item| ['All', 'VehicleDescriptor', 'VehiclePosition', 'None'].include?(item) }
        fail ArgumentError, 'invalid value for "expand", must include one of All, VehicleDescriptor, VehiclePosition, None'
      end
      # resource path
      local_var_path = '/v3/runs/route/{route_id}'.sub('{' + 'route_id' + '}', route_id.to_s)

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'expand'] = @api_client.build_collection_param(opts[:'expand'], :multi) if !opts[:'expand'].nil?
      query_params[:'date_utc'] = opts[:'date_utc'] if !opts[:'date_utc'].nil?
      query_params[:'token'] = opts[:'token'] if !opts[:'token'].nil?
      query_params[:'devid'] = opts[:'devid'] if !opts[:'devid'].nil?
      query_params[:'signature'] = opts[:'signature'] if !opts[:'signature'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'text/json', 'text/html'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'V3RunsResponse' 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RunsApi#runs_for_route\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # View all trip/service runs for a specific route ID and route type
    # @param route_id Identifier of route; values returned by Routes API - v3/routes.
    # @param route_type Number identifying transport mode; values returned via RouteTypes API
    # @param expand List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.
    # @param [Hash] opts the optional parameters
    # @option opts [DateTime] :date_utc Date of the request. (optional - defaults to now)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [V3RunsResponse]
    def runs_for_route_and_route_type(route_id, route_type, expand, opts = {})
      data, _status_code, _headers = runs_for_route_and_route_type_with_http_info(route_id, route_type, expand, opts)
      data
    end

    # View all trip/service runs for a specific route ID and route type
    # @param route_id Identifier of route; values returned by Routes API - v3/routes.
    # @param route_type Number identifying transport mode; values returned via RouteTypes API
    # @param expand List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.
    # @param [Hash] opts the optional parameters
    # @option opts [DateTime] :date_utc Date of the request. (optional - defaults to now)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [Array<(V3RunsResponse, Integer, Hash)>] V3RunsResponse data, response status code and response headers
    def runs_for_route_and_route_type_with_http_info(route_id, route_type, expand, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RunsApi.runs_for_route_and_route_type ...'
      end
      # verify the required parameter 'route_id' is set
      if @api_client.config.client_side_validation && route_id.nil?
        fail ArgumentError, "Missing the required parameter 'route_id' when calling RunsApi.runs_for_route_and_route_type"
      end
      # verify the required parameter 'route_type' is set
      if @api_client.config.client_side_validation && route_type.nil?
        fail ArgumentError, "Missing the required parameter 'route_type' when calling RunsApi.runs_for_route_and_route_type"
      end
      # verify enum value
      if @api_client.config.client_side_validation && !['0', '1', '2', '3', '4'].include?(route_type)
        fail ArgumentError, "invalid value for 'route_type', must be one of 0, 1, 2, 3, 4"
      end
      # verify the required parameter 'expand' is set
      if @api_client.config.client_side_validation && expand.nil?
        fail ArgumentError, "Missing the required parameter 'expand' when calling RunsApi.runs_for_route_and_route_type"
      end
      # resource path
      local_var_path = '/v3/runs/route/{route_id}/route_type/{route_type}'.sub('{' + 'route_id' + '}', route_id.to_s).sub('{' + 'route_type' + '}', route_type.to_s)

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'expand'] = @api_client.build_collection_param(expand, :multi)
      query_params[:'date_utc'] = opts[:'date_utc'] if !opts[:'date_utc'].nil?
      query_params[:'token'] = opts[:'token'] if !opts[:'token'].nil?
      query_params[:'devid'] = opts[:'devid'] if !opts[:'devid'].nil?
      query_params[:'signature'] = opts[:'signature'] if !opts[:'signature'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'text/json', 'text/html'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'V3RunsResponse' 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RunsApi#runs_for_route_and_route_type\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # View all trip/service runs for a specific run_ref
    # @param run_ref The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
    # @param expand List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
    # @param [Hash] opts the optional parameters
    # @option opts [DateTime] :date_utc Date of the request. (optional - defaults to now)
    # @option opts [BOOLEAN] :include_geopath Indicates if geopath data will be returned (default &#x3D; false)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [V3RunsResponse]
    def runs_for_run(run_ref, expand, opts = {})
      data, _status_code, _headers = runs_for_run_with_http_info(run_ref, expand, opts)
      data
    end

    # View all trip/service runs for a specific run_ref
    # @param run_ref The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
    # @param expand List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
    # @param [Hash] opts the optional parameters
    # @option opts [DateTime] :date_utc Date of the request. (optional - defaults to now)
    # @option opts [BOOLEAN] :include_geopath Indicates if geopath data will be returned (default &#x3D; false)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [Array<(V3RunsResponse, Integer, Hash)>] V3RunsResponse data, response status code and response headers
    def runs_for_run_with_http_info(run_ref, expand, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RunsApi.runs_for_run ...'
      end
      # verify the required parameter 'run_ref' is set
      if @api_client.config.client_side_validation && run_ref.nil?
        fail ArgumentError, "Missing the required parameter 'run_ref' when calling RunsApi.runs_for_run"
      end
      # verify the required parameter 'expand' is set
      if @api_client.config.client_side_validation && expand.nil?
        fail ArgumentError, "Missing the required parameter 'expand' when calling RunsApi.runs_for_run"
      end
      # resource path
      local_var_path = '/v3/runs/{run_ref}'.sub('{' + 'run_ref' + '}', run_ref.to_s)

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'expand'] = @api_client.build_collection_param(expand, :multi)
      query_params[:'date_utc'] = opts[:'date_utc'] if !opts[:'date_utc'].nil?
      query_params[:'include_geopath'] = opts[:'include_geopath'] if !opts[:'include_geopath'].nil?
      query_params[:'token'] = opts[:'token'] if !opts[:'token'].nil?
      query_params[:'devid'] = opts[:'devid'] if !opts[:'devid'].nil?
      query_params[:'signature'] = opts[:'signature'] if !opts[:'signature'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'text/json', 'text/html'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'V3RunsResponse' 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RunsApi#runs_for_run\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # View the trip/service run for a specific run_ref and route type
    # @param run_ref The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
    # @param route_type Number identifying transport mode; values returned via RouteTypes API
    # @param expand List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
    # @param [Hash] opts the optional parameters
    # @option opts [DateTime] :date_utc Date of the request. (optional - defaults to now)
    # @option opts [BOOLEAN] :include_geopath Indicates if geopath data will be returned (default &#x3D; false)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [V3RunResponse]
    def runs_for_run_and_route_type(run_ref, route_type, expand, opts = {})
      data, _status_code, _headers = runs_for_run_and_route_type_with_http_info(run_ref, route_type, expand, opts)
      data
    end

    # View the trip/service run for a specific run_ref and route type
    # @param run_ref The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
    # @param route_type Number identifying transport mode; values returned via RouteTypes API
    # @param expand List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
    # @param [Hash] opts the optional parameters
    # @option opts [DateTime] :date_utc Date of the request. (optional - defaults to now)
    # @option opts [BOOLEAN] :include_geopath Indicates if geopath data will be returned (default &#x3D; false)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [Array<(V3RunResponse, Integer, Hash)>] V3RunResponse data, response status code and response headers
    def runs_for_run_and_route_type_with_http_info(run_ref, route_type, expand, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RunsApi.runs_for_run_and_route_type ...'
      end
      # verify the required parameter 'run_ref' is set
      if @api_client.config.client_side_validation && run_ref.nil?
        fail ArgumentError, "Missing the required parameter 'run_ref' when calling RunsApi.runs_for_run_and_route_type"
      end
      # verify the required parameter 'route_type' is set
      if @api_client.config.client_side_validation && route_type.nil?
        fail ArgumentError, "Missing the required parameter 'route_type' when calling RunsApi.runs_for_run_and_route_type"
      end
      # verify enum value
      if @api_client.config.client_side_validation && !['0', '1', '2', '3', '4'].include?(route_type)
        fail ArgumentError, "invalid value for 'route_type', must be one of 0, 1, 2, 3, 4"
      end
      # verify the required parameter 'expand' is set
      if @api_client.config.client_side_validation && expand.nil?
        fail ArgumentError, "Missing the required parameter 'expand' when calling RunsApi.runs_for_run_and_route_type"
      end
      # resource path
      local_var_path = '/v3/runs/{run_ref}/route_type/{route_type}'.sub('{' + 'run_ref' + '}', run_ref.to_s).sub('{' + 'route_type' + '}', route_type.to_s)

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'expand'] = @api_client.build_collection_param(expand, :multi)
      query_params[:'date_utc'] = opts[:'date_utc'] if !opts[:'date_utc'].nil?
      query_params[:'include_geopath'] = opts[:'include_geopath'] if !opts[:'include_geopath'].nil?
      query_params[:'token'] = opts[:'token'] if !opts[:'token'].nil?
      query_params[:'devid'] = opts[:'devid'] if !opts[:'devid'].nil?
      query_params[:'signature'] = opts[:'signature'] if !opts[:'signature'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'text/json', 'text/html'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'V3RunResponse' 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RunsApi#runs_for_run_and_route_type\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
