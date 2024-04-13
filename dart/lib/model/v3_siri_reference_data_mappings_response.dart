part of swagger.api;

class V3SiriReferenceDataMappingsResponse {
  
  String mappingVersion = null;
/* SIRI LineRef */
  Map<String, V3SiriDirectionRefsDictionary> lineRefs = {};

  Map<String, V3StopPoint> stopPointRefs = {};

  V3Status status = null;

  V3SiriReferenceDataMappingsResponse();

  @override
  String toString() {
    return 'V3SiriReferenceDataMappingsResponse[mappingVersion=$mappingVersion, lineRefs=$lineRefs, stopPointRefs=$stopPointRefs, status=$status, ]';
  }

  V3SiriReferenceDataMappingsResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    mappingVersion = json['mapping_version'];
    lineRefs = V3SiriDirectionRefsDictionary.mapFromJson(json['line_refs']);
    stopPointRefs = V3StopPoint.mapFromJson(json['stop_point_refs']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'mapping_version': mappingVersion,
      'line_refs': lineRefs,
      'stop_point_refs': stopPointRefs,
      'status': status
     };
  }

  static List<V3SiriReferenceDataMappingsResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriReferenceDataMappingsResponse>() : json.map((value) => new V3SiriReferenceDataMappingsResponse.fromJson(value)).toList();
  }

  static Map<String, V3SiriReferenceDataMappingsResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriReferenceDataMappingsResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriReferenceDataMappingsResponse.fromJson(value));
    }
    return map;
  }
}
