part of swagger.api;



class DeparturesApi {
  final ApiClient apiClient;

  DeparturesApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// View departures for all routes from a stop
  ///
  /// 
  Future<V3DeparturesResponse> departuresGetForStop(int routeType, int stopId, { List<int> platformNumbers, int directionId, bool gtfs, DateTime dateUtc, int maxResults, bool includeCancelled, bool lookBackwards, List<String> expand, bool includeGeopath, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(routeType == null) {
     throw new ApiException(400, "Missing required param: routeType");
    }
    if(stopId == null) {
     throw new ApiException(400, "Missing required param: stopId");
    }

    // create path and map variables
    String path = "/v3/departures/route_type/{route_type}/stop/{stop_id}".replaceAll("{format}","json").replaceAll("{" + "route_type" + "}", routeType.toString()).replaceAll("{" + "stop_id" + "}", stopId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(platformNumbers != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "platform_numbers", platformNumbers));
    }
    if(directionId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "direction_id", directionId));
    }
    if(gtfs != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "gtfs", gtfs));
    }
    if(dateUtc != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "date_utc", dateUtc));
    }
    if(maxResults != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "max_results", maxResults));
    }
    if(includeCancelled != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "include_cancelled", includeCancelled));
    }
    if(lookBackwards != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "look_backwards", lookBackwards));
    }
    if(expand != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "expand", expand));
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
          apiClient.deserialize(response.body, 'V3DeparturesResponse') as V3DeparturesResponse ;
    } else {
      return null;
    }
  }
  /// View departures for a specific route from a stop
  ///
  /// 
  Future<V3DeparturesResponse> departuresGetForStopAndRoute(int routeType, int stopId, String routeId, { int directionId, bool gtfs, DateTime dateUtc, int maxResults, bool includeCancelled, bool lookBackwards, List<String> expand, bool includeGeopath, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(routeType == null) {
     throw new ApiException(400, "Missing required param: routeType");
    }
    if(stopId == null) {
     throw new ApiException(400, "Missing required param: stopId");
    }
    if(routeId == null) {
     throw new ApiException(400, "Missing required param: routeId");
    }

    // create path and map variables
    String path = "/v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id}".replaceAll("{format}","json").replaceAll("{" + "route_type" + "}", routeType.toString()).replaceAll("{" + "stop_id" + "}", stopId.toString()).replaceAll("{" + "route_id" + "}", routeId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(directionId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "direction_id", directionId));
    }
    if(gtfs != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "gtfs", gtfs));
    }
    if(dateUtc != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "date_utc", dateUtc));
    }
    if(maxResults != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "max_results", maxResults));
    }
    if(includeCancelled != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "include_cancelled", includeCancelled));
    }
    if(lookBackwards != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "look_backwards", lookBackwards));
    }
    if(expand != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "expand", expand));
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
          apiClient.deserialize(response.body, 'V3DeparturesResponse') as V3DeparturesResponse ;
    } else {
      return null;
    }
  }
}
