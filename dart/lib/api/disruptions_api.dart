part of swagger.api;



class DisruptionsApi {
  final ApiClient apiClient;

  DisruptionsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// View all disruptions for all route types
  ///
  /// 
  Future<V3DisruptionsResponse> disruptionsGetAllDisruptions({ List<int> routeTypes, List<int> disruptionModes, String disruptionStatus, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/v3/disruptions".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(routeTypes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "route_types", routeTypes));
    }
    if(disruptionModes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "disruption_modes", disruptionModes));
    }
    if(disruptionStatus != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "disruption_status", disruptionStatus));
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
          apiClient.deserialize(response.body, 'V3DisruptionsResponse') as V3DisruptionsResponse ;
    } else {
      return null;
    }
  }
  /// View a specific disruption
  ///
  /// 
  Future<V3DisruptionResponse> disruptionsGetDisruptionById(int disruptionId, { String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(disruptionId == null) {
     throw new ApiException(400, "Missing required param: disruptionId");
    }

    // create path and map variables
    String path = "/v3/disruptions/{disruption_id}".replaceAll("{format}","json").replaceAll("{" + "disruption_id" + "}", disruptionId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
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
          apiClient.deserialize(response.body, 'V3DisruptionResponse') as V3DisruptionResponse ;
    } else {
      return null;
    }
  }
  /// Get all disruption modes
  ///
  /// 
  Future<V3DisruptionModesResponse> disruptionsGetDisruptionModes({ String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/v3/disruptions/modes".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
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
          apiClient.deserialize(response.body, 'V3DisruptionModesResponse') as V3DisruptionModesResponse ;
    } else {
      return null;
    }
  }
  /// View all disruptions for a particular route
  ///
  /// 
  Future<V3DisruptionsResponse> disruptionsGetDisruptionsByRoute(int routeId, { String disruptionStatus, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(routeId == null) {
     throw new ApiException(400, "Missing required param: routeId");
    }

    // create path and map variables
    String path = "/v3/disruptions/route/{route_id}".replaceAll("{format}","json").replaceAll("{" + "route_id" + "}", routeId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(disruptionStatus != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "disruption_status", disruptionStatus));
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
          apiClient.deserialize(response.body, 'V3DisruptionsResponse') as V3DisruptionsResponse ;
    } else {
      return null;
    }
  }
  /// View all disruptions for a particular route and stop
  ///
  /// 
  Future<V3DisruptionsResponse> disruptionsGetDisruptionsByRouteAndStop(int routeId, int stopId, { String disruptionStatus, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(routeId == null) {
     throw new ApiException(400, "Missing required param: routeId");
    }
    if(stopId == null) {
     throw new ApiException(400, "Missing required param: stopId");
    }

    // create path and map variables
    String path = "/v3/disruptions/route/{route_id}/stop/{stop_id}".replaceAll("{format}","json").replaceAll("{" + "route_id" + "}", routeId.toString()).replaceAll("{" + "stop_id" + "}", stopId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(disruptionStatus != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "disruption_status", disruptionStatus));
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
          apiClient.deserialize(response.body, 'V3DisruptionsResponse') as V3DisruptionsResponse ;
    } else {
      return null;
    }
  }
  /// View all disruptions for a particular stop
  ///
  /// 
  Future<V3DisruptionsResponse> disruptionsGetDisruptionsByStop(int stopId, { String disruptionStatus, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(stopId == null) {
     throw new ApiException(400, "Missing required param: stopId");
    }

    // create path and map variables
    String path = "/v3/disruptions/stop/{stop_id}".replaceAll("{format}","json").replaceAll("{" + "stop_id" + "}", stopId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(disruptionStatus != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "disruption_status", disruptionStatus));
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
          apiClient.deserialize(response.body, 'V3DisruptionsResponse') as V3DisruptionsResponse ;
    } else {
      return null;
    }
  }
}
