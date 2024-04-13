part of swagger.api;

class V3StopDetails {
  /* Disruption information identifier(s) */
  List<int> disruptionIds = [];
/* Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train */
  String stationType = null;
/* The definition applicable to the station_type; returns null for V/Line train */
  String stationDescription = null;
/* Transport mode identifier */
  int routeType = null;

  V3StopLocation stopLocation = null;

  V3StopAmenityDetails stopAmenities = null;

  V3StopAccessibility stopAccessibility = null;

  V3StopStaffing stopStaffing = null;
/* Routes travelling through the stop */
  List<Object> routes = [];
/* Stop identifier */
  int stopId = null;
/* Name of stop */
  String stopName = null;
/* Landmark in proximity of stop */
  String stopLandmark = null;

  V3StopDetails();

  @override
  String toString() {
    return 'V3StopDetails[disruptionIds=$disruptionIds, stationType=$stationType, stationDescription=$stationDescription, routeType=$routeType, stopLocation=$stopLocation, stopAmenities=$stopAmenities, stopAccessibility=$stopAccessibility, stopStaffing=$stopStaffing, routes=$routes, stopId=$stopId, stopName=$stopName, stopLandmark=$stopLandmark, ]';
  }

  V3StopDetails.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    disruptionIds = (json['disruption_ids'] as List).map((item) => item as int).toList();
    stationType = json['station_type'];
    stationDescription = json['station_description'];
    routeType = json['route_type'];
    stopLocation = new V3StopLocation.fromJson(json['stop_location']);
    stopAmenities = new V3StopAmenityDetails.fromJson(json['stop_amenities']);
    stopAccessibility = new V3StopAccessibility.fromJson(json['stop_accessibility']);
    stopStaffing = new V3StopStaffing.fromJson(json['stop_staffing']);
    routes = Object.listFromJson(json['routes']);
    stopId = json['stop_id'];
    stopName = json['stop_name'];
    stopLandmark = json['stop_landmark'];
  }

  Map<String, dynamic> toJson() {
    return {
      'disruption_ids': disruptionIds,
      'station_type': stationType,
      'station_description': stationDescription,
      'route_type': routeType,
      'stop_location': stopLocation,
      'stop_amenities': stopAmenities,
      'stop_accessibility': stopAccessibility,
      'stop_staffing': stopStaffing,
      'routes': routes,
      'stop_id': stopId,
      'stop_name': stopName,
      'stop_landmark': stopLandmark
     };
  }

  static List<V3StopDetails> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopDetails>() : json.map((value) => new V3StopDetails.fromJson(value)).toList();
  }

  static Map<String, V3StopDetails> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopDetails>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopDetails.fromJson(value));
    }
    return map;
  }
}
