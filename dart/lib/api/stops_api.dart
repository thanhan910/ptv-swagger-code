part of swagger.api;



class StopsApi {
  final ApiClient apiClient;

  StopsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// View facilities at a specific stop (Metro and V/Line stations only)
  ///
  /// 
  Future<V3StopResponse> stopsStopDetails(int stopId, int routeType, { bool stopLocation, bool stopAmenities, bool stopAccessibility, bool stopContact, bool stopTicket, bool gtfs, bool stopStaffing, bool stopDisruptions, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(stopId == null) {
     throw new ApiException(400, "Missing required param: stopId");
    }
    if(routeType == null) {
     throw new ApiException(400, "Missing required param: routeType");
    }

    // create path and map variables
    String path = "/v3/stops/{stop_id}/route_type/{route_type}".replaceAll("{format}","json").replaceAll("{" + "stop_id" + "}", stopId.toString()).replaceAll("{" + "route_type" + "}", routeType.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(stopLocation != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "stop_location", stopLocation));
    }
    if(stopAmenities != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "stop_amenities", stopAmenities));
    }
    if(stopAccessibility != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "stop_accessibility", stopAccessibility));
    }
    if(stopContact != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "stop_contact", stopContact));
    }
    if(stopTicket != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "stop_ticket", stopTicket));
    }
    if(gtfs != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "gtfs", gtfs));
    }
    if(stopStaffing != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "stop_staffing", stopStaffing));
    }
    if(stopDisruptions != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "stop_disruptions", stopDisruptions));
    }
    if(token != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "token", token));
    }
    if(devid != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "devid", devid));
    }
    if(signature != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "signature", signature));
    }
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return
          apiClient.deserialize(response.body, 'V3StopResponse') as V3StopResponse ;
    } else {
      return null;
    }
  }
  /// View all stops near a specific location
  ///
  /// 
  Future<V3StopsByDistanceResponse> stopsStopsByGeolocation(double latitude, double longitude, { List<int> routeTypes, int maxResults, double maxDistance, bool stopDisruptions, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(latitude == null) {
     throw new ApiException(400, "Missing required param: latitude");
    }
    if(longitude == null) {
     throw new ApiException(400, "Missing required param: longitude");
    }

    // create path and map variables
    String path = "/v3/stops/location/{latitude},{longitude}".replaceAll("{format}","json").replaceAll("{" + "latitude" + "}", latitude.toString()).replaceAll("{" + "longitude" + "}", longitude.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(routeTypes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "route_types", routeTypes));
    }
    if(maxResults != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "max_results", maxResults));
    }
    if(maxDistance != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "max_distance", maxDistance));
    }
    if(stopDisruptions != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "stop_disruptions", stopDisruptions));
    }
    if(token != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "token", token));
    }
    if(devid != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "devid", devid));
    }
    if(signature != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "signature", signature));
    }
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return
          apiClient.deserialize(response.body, 'V3StopsByDistanceResponse') as V3StopsByDistanceResponse ;
    } else {
      return null;
    }
  }
  /// View all stops on a specific route
  ///
  /// 
  Future<V3StopsOnRouteResponse> stopsStopsForRoute(int routeId, int routeType, { int directionId, bool stopDisruptions, bool includeGeopath, DateTime geopathUtc, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(routeId == null) {
     throw new ApiException(400, "Missing required param: routeId");
    }
    if(routeType == null) {
     throw new ApiException(400, "Missing required param: routeType");
    }

    // create path and map variables
    String path = "/v3/stops/route/{route_id}/route_type/{route_type}".replaceAll("{format}","json").replaceAll("{" + "route_id" + "}", routeId.toString()).replaceAll("{" + "route_type" + "}", routeType.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(directionId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "direction_id", directionId));
    }
    if(stopDisruptions != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "stop_disruptions", stopDisruptions));
    }
    if(includeGeopath != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "include_geopath", includeGeopath));
    }
    if(geopathUtc != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "geopath_utc", geopathUtc));
    }
    if(token != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "token", token));
    }
    if(devid != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "devid", devid));
    }
    if(signature != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "signature", signature));
    }
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return
          apiClient.deserialize(response.body, 'V3StopsOnRouteResponse') as V3StopsOnRouteResponse ;
    } else {
      return null;
    }
  }
}
