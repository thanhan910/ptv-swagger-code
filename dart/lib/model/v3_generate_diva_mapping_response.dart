part of swagger.api;

class V3GenerateDivaMappingResponse {
  
  String mappingVersion = null;

  V3Status status = null;

  V3GenerateDivaMappingResponse();

  @override
  String toString() {
    return 'V3GenerateDivaMappingResponse[mappingVersion=$mappingVersion, status=$status, ]';
  }

  V3GenerateDivaMappingResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    mappingVersion = json['mapping_version'];
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'mapping_version': mappingVersion,
      'status': status
     };
  }

  static List<V3GenerateDivaMappingResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3GenerateDivaMappingResponse>() : json.map((value) => new V3GenerateDivaMappingResponse.fromJson(value)).toList();
  }

  static Map<String, V3GenerateDivaMappingResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3GenerateDivaMappingResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3GenerateDivaMappingResponse.fromJson(value));
    }
    return map;
  }
}
