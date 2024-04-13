part of swagger.api;

class V3ZoneInfo {
  
  int minZone = null;

  int maxZone = null;

  List<int> uniqueZones = [];

  V3ZoneInfo();

  @override
  String toString() {
    return 'V3ZoneInfo[minZone=$minZone, maxZone=$maxZone, uniqueZones=$uniqueZones, ]';
  }

  V3ZoneInfo.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    minZone = json['MinZone'];
    maxZone = json['MaxZone'];
    uniqueZones = (json['UniqueZones'] as List).map((item) => item as int).toList();
  }

  Map<String, dynamic> toJson() {
    return {
      'MinZone': minZone,
      'MaxZone': maxZone,
      'UniqueZones': uniqueZones
     };
  }

  static List<V3ZoneInfo> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3ZoneInfo>() : json.map((value) => new V3ZoneInfo.fromJson(value)).toList();
  }

  static Map<String, V3ZoneInfo> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3ZoneInfo>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3ZoneInfo.fromJson(value));
    }
    return map;
  }
}
