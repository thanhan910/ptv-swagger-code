part of swagger.api;



class RunsApi {
  final ApiClient apiClient;

  RunsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// View all trip/service runs for a specific route ID
  ///
  /// 
  Future<V3RunsResponse> runsForRoute(int routeId, { List<String> expand, DateTime dateUtc, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(routeId == null) {
     throw new ApiException(400, "Missing required param: routeId");
    }

    // create path and map variables
    String path = "/v3/runs/route/{route_id}".replaceAll("{format}","json").replaceAll("{" + "route_id" + "}", routeId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(expand != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "expand", expand));
    }
    if(dateUtc != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "date_utc", dateUtc));
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
          apiClient.deserialize(response.body, 'V3RunsResponse') as V3RunsResponse ;
    } else {
      return null;
    }
  }
  /// View all trip/service runs for a specific route ID and route type
  ///
  /// 
  Future<V3RunsResponse> runsForRouteAndRouteType(int routeId, int routeType, List<String> expand, { DateTime dateUtc, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(routeId == null) {
     throw new ApiException(400, "Missing required param: routeId");
    }
    if(routeType == null) {
     throw new ApiException(400, "Missing required param: routeType");
    }
    if(expand == null) {
     throw new ApiException(400, "Missing required param: expand");
    }

    // create path and map variables
    String path = "/v3/runs/route/{route_id}/route_type/{route_type}".replaceAll("{format}","json").replaceAll("{" + "route_id" + "}", routeId.toString()).replaceAll("{" + "route_type" + "}", routeType.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "expand", expand));
    if(dateUtc != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "date_utc", dateUtc));
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
          apiClient.deserialize(response.body, 'V3RunsResponse') as V3RunsResponse ;
    } else {
      return null;
    }
  }
  /// View all trip/service runs for a specific run_ref
  ///
  /// 
  Future<V3RunsResponse> runsForRun(String runRef, List<String> expand, { DateTime dateUtc, bool includeGeopath, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(runRef == null) {
     throw new ApiException(400, "Missing required param: runRef");
    }
    if(expand == null) {
     throw new ApiException(400, "Missing required param: expand");
    }

    // create path and map variables
    String path = "/v3/runs/{run_ref}".replaceAll("{format}","json").replaceAll("{" + "run_ref" + "}", runRef.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "expand", expand));
    if(dateUtc != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "date_utc", dateUtc));
    }
    if(includeGeopath != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "include_geopath", includeGeopath));
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
          apiClient.deserialize(response.body, 'V3RunsResponse') as V3RunsResponse ;
    } else {
      return null;
    }
  }
  /// View the trip/service run for a specific run_ref and route type
  ///
  /// 
  Future<V3RunResponse> runsForRunAndRouteType(String runRef, int routeType, List<String> expand, { DateTime dateUtc, bool includeGeopath, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(runRef == null) {
     throw new ApiException(400, "Missing required param: runRef");
    }
    if(routeType == null) {
     throw new ApiException(400, "Missing required param: routeType");
    }
    if(expand == null) {
     throw new ApiException(400, "Missing required param: expand");
    }

    // create path and map variables
    String path = "/v3/runs/{run_ref}/route_type/{route_type}".replaceAll("{format}","json").replaceAll("{" + "run_ref" + "}", runRef.toString()).replaceAll("{" + "route_type" + "}", routeType.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "expand", expand));
    if(dateUtc != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "date_utc", dateUtc));
    }
    if(includeGeopath != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "include_geopath", includeGeopath));
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
          apiClient.deserialize(response.body, 'V3RunResponse') as V3RunResponse ;
    } else {
      return null;
    }
  }
}
