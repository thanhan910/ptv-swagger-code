part of swagger.api;

class QueryParam {
  String name;
  String value;

  QueryParam(this.name, this.value);
}

class ApiClient {

  String basePath;
  var client = new BrowserClient();

  Map<String, String> _defaultHeaderMap = {};
  Map<String, Authentication> _authentications = {};

  final _RegList = new RegExp(r'^List<(.*)>$');
  final _RegMap = new RegExp(r'^Map<String,(.*)>$');

  ApiClient({this.basePath: "https://timetableapi.ptv.vic.gov.au/"}) {
    // Setup authentications (key: authentication name, value: authentication).
  }

  void addDefaultHeader(String key, String value) {
     _defaultHeaderMap[key] = value;
  }

  dynamic _deserialize(dynamic value, String targetType) {
    try {
      switch (targetType) {
        case 'String':
          return '$value';
        case 'int':
          return value is int ? value : int.parse('$value');
        case 'bool':
          return value is bool ? value : '$value'.toLowerCase() == 'true';
        case 'double':
          return value is double ? value : double.parse('$value');
        case 'V3BulkDeparturesRequest':
          return new V3BulkDeparturesRequest.fromJson(value);
        case 'V3BulkDeparturesResponse':
          return new V3BulkDeparturesResponse.fromJson(value);
        case 'V3BulkDeparturesRouteDirectionResponse':
          return new V3BulkDeparturesRouteDirectionResponse.fromJson(value);
        case 'V3BulkDeparturesStopResponse':
          return new V3BulkDeparturesStopResponse.fromJson(value);
        case 'V3BulkDeparturesUpdateResponse':
          return new V3BulkDeparturesUpdateResponse.fromJson(value);
        case 'V3Departure':
          return new V3Departure.fromJson(value);
        case 'V3DeparturesBroadParameters':
          return new V3DeparturesBroadParameters.fromJson(value);
        case 'V3DeparturesResponse':
          return new V3DeparturesResponse.fromJson(value);
        case 'V3DeparturesSpecificParameters':
          return new V3DeparturesSpecificParameters.fromJson(value);
        case 'V3Direction':
          return new V3Direction.fromJson(value);
        case 'V3DirectionWithDescription':
          return new V3DirectionWithDescription.fromJson(value);
        case 'V3DirectionsResponse':
          return new V3DirectionsResponse.fromJson(value);
        case 'V3Disruption':
          return new V3Disruption.fromJson(value);
        case 'V3DisruptionDirection':
          return new V3DisruptionDirection.fromJson(value);
        case 'V3DisruptionMode':
          return new V3DisruptionMode.fromJson(value);
        case 'V3DisruptionModesResponse':
          return new V3DisruptionModesResponse.fromJson(value);
        case 'V3DisruptionResponse':
          return new V3DisruptionResponse.fromJson(value);
        case 'V3DisruptionRoute':
          return new V3DisruptionRoute.fromJson(value);
        case 'V3DisruptionStop':
          return new V3DisruptionStop.fromJson(value);
        case 'V3Disruptions':
          return new V3Disruptions.fromJson(value);
        case 'V3DisruptionsResponse':
          return new V3DisruptionsResponse.fromJson(value);
        case 'V3DynamoDbTimetable':
          return new V3DynamoDbTimetable.fromJson(value);
        case 'V3DynamoDbTimetablesReponse':
          return new V3DynamoDbTimetablesReponse.fromJson(value);
        case 'V3ErrorResponse':
          return new V3ErrorResponse.fromJson(value);
        case 'V3FareEstimateResponse':
          return new V3FareEstimateResponse.fromJson(value);
        case 'V3FareEstimateResult':
          return new V3FareEstimateResult.fromJson(value);
        case 'V3FareEstimateResultStatus':
          return new V3FareEstimateResultStatus.fromJson(value);
        case 'V3GenerateDivaMappingResponse':
          return new V3GenerateDivaMappingResponse.fromJson(value);
        case 'V3Outlet':
          return new V3Outlet.fromJson(value);
        case 'V3OutletGeolocation':
          return new V3OutletGeolocation.fromJson(value);
        case 'V3OutletGeolocationParameters':
          return new V3OutletGeolocationParameters.fromJson(value);
        case 'V3OutletGeolocationResponse':
          return new V3OutletGeolocationResponse.fromJson(value);
        case 'V3OutletParameters':
          return new V3OutletParameters.fromJson(value);
        case 'V3OutletResponse':
          return new V3OutletResponse.fromJson(value);
        case 'V3PassengerFare':
          return new V3PassengerFare.fromJson(value);
        case 'V3PatternDeparture':
          return new V3PatternDeparture.fromJson(value);
        case 'V3ResultOutlet':
          return new V3ResultOutlet.fromJson(value);
        case 'V3ResultRoute':
          return new V3ResultRoute.fromJson(value);
        case 'V3ResultStop':
          return new V3ResultStop.fromJson(value);
        case 'V3RouteDeparturesSpecificParameters':
          return new V3RouteDeparturesSpecificParameters.fromJson(value);
        case 'V3RouteResponse':
          return new V3RouteResponse.fromJson(value);
        case 'V3RouteServiceStatus':
          return new V3RouteServiceStatus.fromJson(value);
        case 'V3RouteType':
          return new V3RouteType.fromJson(value);
        case 'V3RouteTypesResponse':
          return new V3RouteTypesResponse.fromJson(value);
        case 'V3RouteWithStatus':
          return new V3RouteWithStatus.fromJson(value);
        case 'V3Run':
          return new V3Run.fromJson(value);
        case 'V3RunResponse':
          return new V3RunResponse.fromJson(value);
        case 'V3RunsResponse':
          return new V3RunsResponse.fromJson(value);
        case 'V3SearchParameters':
          return new V3SearchParameters.fromJson(value);
        case 'V3SearchResult':
          return new V3SearchResult.fromJson(value);
        case 'V3SiriDirectionRefsDictionary':
          return new V3SiriDirectionRefsDictionary.fromJson(value);
        case 'V3SiriDownstreamSubscription':
          return new V3SiriDownstreamSubscription.fromJson(value);
        case 'V3SiriDownstreamSubscriptionDeleteRequest':
          return new V3SiriDownstreamSubscriptionDeleteRequest.fromJson(value);
        case 'V3SiriDownstreamSubscriptionResponse':
          return new V3SiriDownstreamSubscriptionResponse.fromJson(value);
        case 'V3SiriDownstreamSubscriptionTopic':
          return new V3SiriDownstreamSubscriptionTopic.fromJson(value);
        case 'V3SiriEstimatedTimetableSubscriptionRequest':
          return new V3SiriEstimatedTimetableSubscriptionRequest.fromJson(value);
        case 'V3SiriLineRef':
          return new V3SiriLineRef.fromJson(value);
        case 'V3SiriLineRefDirectionRefStopPointRef':
          return new V3SiriLineRefDirectionRefStopPointRef.fromJson(value);
        case 'V3SiriLineRefDirectionRefsDictionary':
          return new V3SiriLineRefDirectionRefsDictionary.fromJson(value);
        case 'V3SiriLineRefMappingsResponse':
          return new V3SiriLineRefMappingsResponse.fromJson(value);
        case 'V3SiriLineRefsRequest':
          return new V3SiriLineRefsRequest.fromJson(value);
        case 'V3SiriProductionTimetableSubscriptionRequest':
          return new V3SiriProductionTimetableSubscriptionRequest.fromJson(value);
        case 'V3SiriReferenceDataDetail':
          return new V3SiriReferenceDataDetail.fromJson(value);
        case 'V3SiriReferenceDataMappingsResponse':
          return new V3SiriReferenceDataMappingsResponse.fromJson(value);
        case 'V3SiriReferenceDataRequest':
          return new V3SiriReferenceDataRequest.fromJson(value);
        case 'V3SiriStopsRefsDictionary':
          return new V3SiriStopsRefsDictionary.fromJson(value);
        case 'V3SiriSubscriptionTopic':
          return new V3SiriSubscriptionTopic.fromJson(value);
        case 'V3Status':
          return new V3Status.fromJson(value);
        case 'V3StopAccessibility':
          return new V3StopAccessibility.fromJson(value);
        case 'V3StopAccessibilityWheelchair':
          return new V3StopAccessibilityWheelchair.fromJson(value);
        case 'V3StopAmenityDetails':
          return new V3StopAmenityDetails.fromJson(value);
        case 'V3StopBasic':
          return new V3StopBasic.fromJson(value);
        case 'V3StopDepartureRequest':
          return new V3StopDepartureRequest.fromJson(value);
        case 'V3StopDepartureRequestRouteDirection':
          return new V3StopDepartureRequestRouteDirection.fromJson(value);
        case 'V3StopDetails':
          return new V3StopDetails.fromJson(value);
        case 'V3StopGeosearch':
          return new V3StopGeosearch.fromJson(value);
        case 'V3StopGps':
          return new V3StopGps.fromJson(value);
        case 'V3StopLocation':
          return new V3StopLocation.fromJson(value);
        case 'V3StopModel':
          return new V3StopModel.fromJson(value);
        case 'V3StopOnRoute':
          return new V3StopOnRoute.fromJson(value);
        case 'V3StopPoint':
          return new V3StopPoint.fromJson(value);
        case 'V3StopResponse':
          return new V3StopResponse.fromJson(value);
        case 'V3StopStaffing':
          return new V3StopStaffing.fromJson(value);
        case 'V3StopTicket':
          return new V3StopTicket.fromJson(value);
        case 'V3StoppingPattern':
          return new V3StoppingPattern.fromJson(value);
        case 'V3StoppingPatternStop':
          return new V3StoppingPatternStop.fromJson(value);
        case 'V3StopsByDistanceResponse':
          return new V3StopsByDistanceResponse.fromJson(value);
        case 'V3StopsOnRouteResponse':
          return new V3StopsOnRouteResponse.fromJson(value);
        case 'V3VehicleDescriptor':
          return new V3VehicleDescriptor.fromJson(value);
        case 'V3VehiclePosition':
          return new V3VehiclePosition.fromJson(value);
        case 'V3Void':
          return new V3Void.fromJson(value);
        case 'V3ZoneInfo':
          return new V3ZoneInfo.fromJson(value);
        default:
          {
            Match match;
            if (value is List &&
                (match = _RegList.firstMatch(targetType)) != null) {
              var newTargetType = match[1];
              return value.map((v) => _deserialize(v, newTargetType)).toList();
            } else if (value is Map &&
                (match = _RegMap.firstMatch(targetType)) != null) {
              var newTargetType = match[1];
              return new Map.fromIterables(value.keys,
                  value.values.map((v) => _deserialize(v, newTargetType)));
            }
          }
      }
    } catch (e, stack) {
      throw new ApiException.withInner(500, 'Exception during deserialization.', e, stack);
    }
    throw new ApiException(500, 'Could not find a suitable class for deserialization');
  }

  dynamic deserialize(String jsonVal, String targetType) {
    // Remove all spaces.  Necessary for reg expressions as well.
    targetType = targetType.replaceAll(' ', '');

    if (targetType == 'String') return jsonVal;

    var decodedJson = json.decode(jsonVal);
    return _deserialize(decodedJson, targetType);
  }

  String serialize(Object obj) {
    String serialized = '';
    if (obj == null) {
      serialized = '';
    } else {
      serialized = json.encode(obj);
    }
    return serialized;
  }

  // We don't use a Map<String, String> for queryParams.
  // If collectionFormat is 'multi' a key might appear multiple times.
  Future<Response> invokeAPI(String path,
                             String method,
                             Iterable<QueryParam> queryParams,
                             Object body,
                             Map<String, String> headerParams,
                             Map<String, String> formParams,
                             String contentType,
                             List<String> authNames) async {

    _updateParamsForAuth(authNames, queryParams, headerParams);

    var ps = queryParams.where((p) => p.value != null).map((p) => '${Uri.encodeComponent(p.name)}=${Uri.encodeComponent(p.value)}');
    String queryString = ps.isNotEmpty ?
                         '?' + ps.join('&') :
                         '';

    String url = basePath + path + queryString;

    headerParams.addAll(_defaultHeaderMap);
    headerParams['Content-Type'] = contentType;

    if(body is MultipartRequest) {
      var request = new MultipartRequest(method, Uri.parse(url));
      request.fields.addAll(body.fields);
      request.files.addAll(body.files);
      request.headers.addAll(body.headers);
      request.headers.addAll(headerParams);
      var response = await client.send(request);
      return Response.fromStream(response);
    } else {
      var msgBody = contentType == "application/x-www-form-urlencoded" ? formParams : serialize(body);
      switch(method) {
        case "POST":
          return client.post(url, headers: headerParams, body: msgBody);
        case "PUT":
          return client.put(url, headers: headerParams, body: msgBody);
        case "DELETE":
          return client.delete(url, headers: headerParams);
        case "PATCH":
          return client.patch(url, headers: headerParams, body: msgBody);
        default:
          return client.get(url, headers: headerParams);
      }
    }
  }

  /// Update query and header parameters based on authentication settings.
  /// @param authNames The authentications to apply
  void _updateParamsForAuth(List<String> authNames, List<QueryParam> queryParams, Map<String, String> headerParams) {
    authNames.forEach((authName) {
      Authentication auth = _authentications[authName];
      if (auth == null) throw new ArgumentError("Authentication undefined: " + authName);
      auth.applyToParams(queryParams, headerParams);
    });
  }

  void setAccessToken(String accessToken) {
    _authentications.forEach((key, auth) {
      if (auth is OAuth) {
        auth.setAccessToken(accessToken);
      }
    });
  }
}
