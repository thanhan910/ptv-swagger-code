part of swagger.api;

class V3SiriLineRefMappingsResponse {
  
  String mappingVersion = null;

  Map<String, V3SiriLineRefDirectionRefsDictionary> lineRefs = {};

  V3Status status = null;

  V3SiriLineRefMappingsResponse();

  @override
  String toString() {
    return 'V3SiriLineRefMappingsResponse[mappingVersion=$mappingVersion, lineRefs=$lineRefs, status=$status, ]';
  }

  V3SiriLineRefMappingsResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    mappingVersion = json['mapping_version'];
    lineRefs = V3SiriLineRefDirectionRefsDictionary.mapFromJson(json['line_refs']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'mapping_version': mappingVersion,
      'line_refs': lineRefs,
      'status': status
     };
  }

  static List<V3SiriLineRefMappingsResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriLineRefMappingsResponse>() : json.map((value) => new V3SiriLineRefMappingsResponse.fromJson(value)).toList();
  }

  static Map<String, V3SiriLineRefMappingsResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriLineRefMappingsResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriLineRefMappingsResponse.fromJson(value));
    }
    return map;
  }
}
