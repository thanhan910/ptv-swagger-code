part of swagger.api;

class V3SearchParameters {
  /* Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) */
  List<int> routeTypes = null;
  //enum routeTypesEnum {  0,  1,  2,  3,  4,  };
/* Filter by geographic coordinate of latitude */
  double latitude = null;
/* Filter by geographic coordinate of longitude */
  double longitude = null;
/* Filter by maximum distance (in metres) from location specified via latitude and longitude parameters */
  double maxDistance = null;
/* Placeholder for future development; currently unavailable */
  bool includeAddresses = null;
/* Indicates if outlets will be returned in response (default = true) */
  bool includeOutlets = null;
/* Indicates whether to find stops by suburbs in the search term (default = true) */
  bool matchStopBySuburb = null;
/* Indicates whether to find routes by suburbs in the search term (default = true) */
  bool matchRouteBySuburb = null;
/* Indicates whether to search for stops according to a metlink stop ID (default = false) */
  bool matchStopByGtfsStopId = null;

  V3SearchParameters();

  @override
  String toString() {
    return 'V3SearchParameters[routeTypes=$routeTypes, latitude=$latitude, longitude=$longitude, maxDistance=$maxDistance, includeAddresses=$includeAddresses, includeOutlets=$includeOutlets, matchStopBySuburb=$matchStopBySuburb, matchRouteBySuburb=$matchRouteBySuburb, matchStopByGtfsStopId=$matchStopByGtfsStopId, ]';
  }

  V3SearchParameters.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    routeTypes = (json['route_types'] as List).map((item) => item as int).toList();
    latitude = json['latitude'];
    longitude = json['longitude'];
    maxDistance = json['max_distance'];
    includeAddresses = json['include_addresses'];
    includeOutlets = json['include_outlets'];
    matchStopBySuburb = json['match_stop_by_suburb'];
    matchRouteBySuburb = json['match_route_by_suburb'];
    matchStopByGtfsStopId = json['match_stop_by_gtfs_stop_id'];
  }

  Map<String, dynamic> toJson() {
    return {
      'route_types': routeTypes,
      'latitude': latitude,
      'longitude': longitude,
      'max_distance': maxDistance,
      'include_addresses': includeAddresses,
      'include_outlets': includeOutlets,
      'match_stop_by_suburb': matchStopBySuburb,
      'match_route_by_suburb': matchRouteBySuburb,
      'match_stop_by_gtfs_stop_id': matchStopByGtfsStopId
     };
  }

  static List<V3SearchParameters> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SearchParameters>() : json.map((value) => new V3SearchParameters.fromJson(value)).toList();
  }

  static Map<String, V3SearchParameters> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SearchParameters>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SearchParameters.fromJson(value));
    }
    return map;
  }
}
