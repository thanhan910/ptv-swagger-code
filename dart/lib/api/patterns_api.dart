part of swagger.api;



class PatternsApi {
  final ApiClient apiClient;

  PatternsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// View the stopping pattern for a specific trip/service run
  ///
  /// 
  Future<V3StoppingPattern> patternsGetPatternByRun(String runRef, int routeType, List<String> expand, { int stopId, DateTime dateUtc, bool includeSkippedStops, bool includeGeopath, String token, String devid, String signature }) async {
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
    String path = "/v3/pattern/run/{run_ref}/route_type/{route_type}".replaceAll("{format}","json").replaceAll("{" + "run_ref" + "}", runRef.toString()).replaceAll("{" + "route_type" + "}", routeType.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "expand", expand));
    if(stopId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "stop_id", stopId));
    }
    if(dateUtc != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "date_utc", dateUtc));
    }
    if(includeSkippedStops != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "include_skipped_stops", includeSkippedStops));
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
          apiClient.deserialize(response.body, 'V3StoppingPattern') as V3StoppingPattern ;
    } else {
      return null;
    }
  }
}
