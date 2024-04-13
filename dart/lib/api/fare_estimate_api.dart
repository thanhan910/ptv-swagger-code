part of swagger.api;



class FareEstimateApi {
  final ApiClient apiClient;

  FareEstimateApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Estimate a fare by zone
  ///
  /// 
  Future<V3FareEstimateResponse> fareEstimateGetFareEstimateByZone(int minZone, int maxZone, { DateTime journeyTouchOnUtc, DateTime journeyTouchOffUtc, bool isJourneyInFreeTramZone, List<int> travelledRouteTypes, String token, String devid, String signature }) async {
    Object postBody = null;

    // verify required params are set
    if(minZone == null) {
     throw new ApiException(400, "Missing required param: minZone");
    }
    if(maxZone == null) {
     throw new ApiException(400, "Missing required param: maxZone");
    }

    // create path and map variables
    String path = "/v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone}".replaceAll("{format}","json").replaceAll("{" + "minZone" + "}", minZone.toString()).replaceAll("{" + "maxZone" + "}", maxZone.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(journeyTouchOnUtc != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "journey_touch_on_utc", journeyTouchOnUtc));
    }
    if(journeyTouchOffUtc != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "journey_touch_off_utc", journeyTouchOffUtc));
    }
    if(isJourneyInFreeTramZone != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "is_journey_in_free_tram_zone", isJourneyInFreeTramZone));
    }
    if(travelledRouteTypes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "travelled_route_types", travelledRouteTypes));
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
          apiClient.deserialize(response.body, 'V3FareEstimateResponse') as V3FareEstimateResponse ;
    } else {
      return null;
    }
  }
}
