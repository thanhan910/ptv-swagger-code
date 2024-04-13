part of swagger.api;



class DirectionsApi {
  final ApiClient apiClient;

  DirectionsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// View all routes for a direction of travel
  ///
  /// 
  Future<V3DirectionsResponse> directionsForDirection(int directionId, { String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(directionId == null) {
     throw new ApiException(400, "Missing required param: directionId");
    }

    // create path and map variables
    String path = "/v3/directions/{direction_id}".replaceAll("{format}","json").replaceAll("{" + "direction_id" + "}", directionId.toString());

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
          apiClient.deserialize(response.body, 'V3DirectionsResponse') as V3DirectionsResponse ;
    } else {
      return null;
    }
  }
  /// View all routes of a particular type for a direction of travel
  ///
  /// 
  Future<V3DirectionsResponse> directionsForDirectionAndType(int directionId, int routeType, { String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(directionId == null) {
     throw new ApiException(400, "Missing required param: directionId");
    }
    if(routeType == null) {
     throw new ApiException(400, "Missing required param: routeType");
    }

    // create path and map variables
    String path = "/v3/directions/{direction_id}/route_type/{route_type}".replaceAll("{format}","json").replaceAll("{" + "direction_id" + "}", directionId.toString()).replaceAll("{" + "route_type" + "}", routeType.toString());

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
          apiClient.deserialize(response.body, 'V3DirectionsResponse') as V3DirectionsResponse ;
    } else {
      return null;
    }
  }
  /// View directions that a route travels in
  ///
  /// 
  Future<V3DirectionsResponse> directionsForRoute(int routeId, { String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(routeId == null) {
     throw new ApiException(400, "Missing required param: routeId");
    }

    // create path and map variables
    String path = "/v3/directions/route/{route_id}".replaceAll("{format}","json").replaceAll("{" + "route_id" + "}", routeId.toString());

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
          apiClient.deserialize(response.body, 'V3DirectionsResponse') as V3DirectionsResponse ;
    } else {
      return null;
    }
  }
}
