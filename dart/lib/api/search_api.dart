part of swagger.api;



class SearchApi {
  final ApiClient apiClient;

  SearchApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// View stops, routes and myki ticket outlets that match the search term
  ///
  /// 
  Future<V3SearchResult> searchSearch(String searchTerm, { List<int> routeTypes, double latitude, double longitude, double maxDistance, bool includeAddresses, bool includeOutlets, bool matchStopBySuburb, bool matchRouteBySuburb, bool matchStopByGtfsStopId, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(searchTerm == null) {
     throw new ApiException(400, "Missing required param: searchTerm");
    }

    // create path and map variables
    String path = "/v3/search/{search_term}".replaceAll("{format}","json").replaceAll("{" + "search_term" + "}", searchTerm.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(routeTypes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "route_types", routeTypes));
    }
    if(latitude != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "latitude", latitude));
    }
    if(longitude != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "longitude", longitude));
    }
    if(maxDistance != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "max_distance", maxDistance));
    }
    if(includeAddresses != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "include_addresses", includeAddresses));
    }
    if(includeOutlets != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "include_outlets", includeOutlets));
    }
    if(matchStopBySuburb != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "match_stop_by_suburb", matchStopBySuburb));
    }
    if(matchRouteBySuburb != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "match_route_by_suburb", matchRouteBySuburb));
    }
    if(matchStopByGtfsStopId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "match_stop_by_gtfs_stop_id", matchStopByGtfsStopId));
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
          apiClient.deserialize(response.body, 'V3SearchResult') as V3SearchResult ;
    } else {
      return null;
    }
  }
}
