=begin
#PTV Timetable API - Version 3

#The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  

OpenAPI spec version: v3

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.52
=end

module SwaggerClient
  class StopsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # View facilities at a specific stop (Metro and V/Line stations only)
    # @param stop_id Identifier of stop; values returned by Stops API
    # @param route_type Number identifying transport mode; values returned via RouteTypes API
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :stop_location Indicates if stop location information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :stop_amenities Indicates if stop amenity information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :stop_accessibility Indicates if stop accessibility information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :stop_contact Indicates if stop contact information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :stop_ticket Indicates if stop ticket information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :gtfs Incdicates whether the stop_id is a GTFS ID or not
    # @option opts [BOOLEAN] :stop_staffing Indicates if stop staffing information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :stop_disruptions Indicates if stop disruption information will be returned (default &#x3D; false)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [V3StopResponse]
    def stops_stop_details(stop_id, route_type, opts = {})
      data, _status_code, _headers = stops_stop_details_with_http_info(stop_id, route_type, opts)
      data
    end

    # View facilities at a specific stop (Metro and V/Line stations only)
    # @param stop_id Identifier of stop; values returned by Stops API
    # @param route_type Number identifying transport mode; values returned via RouteTypes API
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :stop_location Indicates if stop location information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :stop_amenities Indicates if stop amenity information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :stop_accessibility Indicates if stop accessibility information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :stop_contact Indicates if stop contact information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :stop_ticket Indicates if stop ticket information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :gtfs Incdicates whether the stop_id is a GTFS ID or not
    # @option opts [BOOLEAN] :stop_staffing Indicates if stop staffing information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :stop_disruptions Indicates if stop disruption information will be returned (default &#x3D; false)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [Array<(V3StopResponse, Integer, Hash)>] V3StopResponse data, response status code and response headers
    def stops_stop_details_with_http_info(stop_id, route_type, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: StopsApi.stops_stop_details ...'
      end
      # verify the required parameter 'stop_id' is set
      if @api_client.config.client_side_validation && stop_id.nil?
        fail ArgumentError, "Missing the required parameter 'stop_id' when calling StopsApi.stops_stop_details"
      end
      # verify the required parameter 'route_type' is set
      if @api_client.config.client_side_validation && route_type.nil?
        fail ArgumentError, "Missing the required parameter 'route_type' when calling StopsApi.stops_stop_details"
      end
      # verify enum value
      if @api_client.config.client_side_validation && !['0', '1', '2', '3', '4'].include?(route_type)
        fail ArgumentError, "invalid value for 'route_type', must be one of 0, 1, 2, 3, 4"
      end
      # resource path
      local_var_path = '/v3/stops/{stop_id}/route_type/{route_type}'.sub('{' + 'stop_id' + '}', stop_id.to_s).sub('{' + 'route_type' + '}', route_type.to_s)

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'stop_location'] = opts[:'stop_location'] if !opts[:'stop_location'].nil?
      query_params[:'stop_amenities'] = opts[:'stop_amenities'] if !opts[:'stop_amenities'].nil?
      query_params[:'stop_accessibility'] = opts[:'stop_accessibility'] if !opts[:'stop_accessibility'].nil?
      query_params[:'stop_contact'] = opts[:'stop_contact'] if !opts[:'stop_contact'].nil?
      query_params[:'stop_ticket'] = opts[:'stop_ticket'] if !opts[:'stop_ticket'].nil?
      query_params[:'gtfs'] = opts[:'gtfs'] if !opts[:'gtfs'].nil?
      query_params[:'stop_staffing'] = opts[:'stop_staffing'] if !opts[:'stop_staffing'].nil?
      query_params[:'stop_disruptions'] = opts[:'stop_disruptions'] if !opts[:'stop_disruptions'].nil?
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

      return_type = opts[:return_type] || 'V3StopResponse' 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: StopsApi#stops_stop_details\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # View all stops near a specific location
    # @param latitude Geographic coordinate of latitude
    # @param longitude Geographic coordinate of longitude
    # @param [Hash] opts the optional parameters
    # @option opts [Array<Integer>] :route_types Filter by route_type; values returned via RouteTypes API
    # @option opts [Integer] :max_results Maximum number of results returned (default &#x3D; 30)
    # @option opts [Float] :max_distance Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300)
    # @option opts [BOOLEAN] :stop_disruptions Indicates if stop disruption information will be returned (default &#x3D; false)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [V3StopsByDistanceResponse]
    def stops_stops_by_geolocation(latitude, longitude, opts = {})
      data, _status_code, _headers = stops_stops_by_geolocation_with_http_info(latitude, longitude, opts)
      data
    end

    # View all stops near a specific location
    # @param latitude Geographic coordinate of latitude
    # @param longitude Geographic coordinate of longitude
    # @param [Hash] opts the optional parameters
    # @option opts [Array<Integer>] :route_types Filter by route_type; values returned via RouteTypes API
    # @option opts [Integer] :max_results Maximum number of results returned (default &#x3D; 30)
    # @option opts [Float] :max_distance Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300)
    # @option opts [BOOLEAN] :stop_disruptions Indicates if stop disruption information will be returned (default &#x3D; false)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [Array<(V3StopsByDistanceResponse, Integer, Hash)>] V3StopsByDistanceResponse data, response status code and response headers
    def stops_stops_by_geolocation_with_http_info(latitude, longitude, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: StopsApi.stops_stops_by_geolocation ...'
      end
      # verify the required parameter 'latitude' is set
      if @api_client.config.client_side_validation && latitude.nil?
        fail ArgumentError, "Missing the required parameter 'latitude' when calling StopsApi.stops_stops_by_geolocation"
      end
      # verify the required parameter 'longitude' is set
      if @api_client.config.client_side_validation && longitude.nil?
        fail ArgumentError, "Missing the required parameter 'longitude' when calling StopsApi.stops_stops_by_geolocation"
      end
      if @api_client.config.client_side_validation && opts[:'route_types'] && !opts[:'route_types'].all? { |item| ['0', '1', '2', '3', '4'].include?(item) }
        fail ArgumentError, 'invalid value for "route_types", must include one of 0, 1, 2, 3, 4'
      end
      # resource path
      local_var_path = '/v3/stops/location/{latitude},{longitude}'.sub('{' + 'latitude' + '}', latitude.to_s).sub('{' + 'longitude' + '}', longitude.to_s)

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'route_types'] = @api_client.build_collection_param(opts[:'route_types'], :multi) if !opts[:'route_types'].nil?
      query_params[:'max_results'] = opts[:'max_results'] if !opts[:'max_results'].nil?
      query_params[:'max_distance'] = opts[:'max_distance'] if !opts[:'max_distance'].nil?
      query_params[:'stop_disruptions'] = opts[:'stop_disruptions'] if !opts[:'stop_disruptions'].nil?
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

      return_type = opts[:return_type] || 'V3StopsByDistanceResponse' 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: StopsApi#stops_stops_by_geolocation\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # View all stops on a specific route
    # @param route_id Identifier of route; values returned by Routes API - v3/routes
    # @param route_type Number identifying transport mode; values returned via RouteTypes API
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :direction_id An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response.
    # @option opts [BOOLEAN] :stop_disruptions Indicates if stop disruption information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :include_geopath Indicates if geopath data will be returned (default &#x3D; false)
    # @option opts [DateTime] :geopath_utc Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [V3StopsOnRouteResponse]
    def stops_stops_for_route(route_id, route_type, opts = {})
      data, _status_code, _headers = stops_stops_for_route_with_http_info(route_id, route_type, opts)
      data
    end

    # View all stops on a specific route
    # @param route_id Identifier of route; values returned by Routes API - v3/routes
    # @param route_type Number identifying transport mode; values returned via RouteTypes API
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :direction_id An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response.
    # @option opts [BOOLEAN] :stop_disruptions Indicates if stop disruption information will be returned (default &#x3D; false)
    # @option opts [BOOLEAN] :include_geopath Indicates if geopath data will be returned (default &#x3D; false)
    # @option opts [DateTime] :geopath_utc Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date)
    # @option opts [String] :token Please ignore
    # @option opts [String] :devid Your developer id
    # @option opts [String] :signature Authentication signature for request
    # @return [Array<(V3StopsOnRouteResponse, Integer, Hash)>] V3StopsOnRouteResponse data, response status code and response headers
    def stops_stops_for_route_with_http_info(route_id, route_type, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: StopsApi.stops_stops_for_route ...'
      end
      # verify the required parameter 'route_id' is set
      if @api_client.config.client_side_validation && route_id.nil?
        fail ArgumentError, "Missing the required parameter 'route_id' when calling StopsApi.stops_stops_for_route"
      end
      # verify the required parameter 'route_type' is set
      if @api_client.config.client_side_validation && route_type.nil?
        fail ArgumentError, "Missing the required parameter 'route_type' when calling StopsApi.stops_stops_for_route"
      end
      # verify enum value
      if @api_client.config.client_side_validation && !['0', '1', '2', '3', '4'].include?(route_type)
        fail ArgumentError, "invalid value for 'route_type', must be one of 0, 1, 2, 3, 4"
      end
      # resource path
      local_var_path = '/v3/stops/route/{route_id}/route_type/{route_type}'.sub('{' + 'route_id' + '}', route_id.to_s).sub('{' + 'route_type' + '}', route_type.to_s)

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'direction_id'] = opts[:'direction_id'] if !opts[:'direction_id'].nil?
      query_params[:'stop_disruptions'] = opts[:'stop_disruptions'] if !opts[:'stop_disruptions'].nil?
      query_params[:'include_geopath'] = opts[:'include_geopath'] if !opts[:'include_geopath'].nil?
      query_params[:'geopath_utc'] = opts[:'geopath_utc'] if !opts[:'geopath_utc'].nil?
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

      return_type = opts[:return_type] || 'V3StopsOnRouteResponse' 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: StopsApi#stops_stops_for_route\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
