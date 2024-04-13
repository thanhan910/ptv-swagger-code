part of swagger.api;

class V3VehiclePosition {
  /* Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs. */
  double latitude = null;
/* Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs. */
  double longitude = null;
/* CIS - Metro Train Vehicle Location Easting coordinate */
  double easting = null;
/* CIS - Metro Train Vehicle Location Northing coordinate */
  double northing = null;
/* CIS - Metro Train Vehicle Location Direction */
  String direction = null;
/* Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs. */
  double bearing = null;
/* Supplier of vehicle position data. */
  String supplier = null;
/* Date and time that the vehicle position data was supplied. */
  DateTime datetimeUtc = null;
/* CIS - Metro Train Vehicle Location data expiry time */
  DateTime expiryTime = null;

  V3VehiclePosition();

  @override
  String toString() {
    return 'V3VehiclePosition[latitude=$latitude, longitude=$longitude, easting=$easting, northing=$northing, direction=$direction, bearing=$bearing, supplier=$supplier, datetimeUtc=$datetimeUtc, expiryTime=$expiryTime, ]';
  }

  V3VehiclePosition.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    latitude = json['latitude'];
    longitude = json['longitude'];
    easting = json['easting'];
    northing = json['northing'];
    direction = json['direction'];
    bearing = json['bearing'];
    supplier = json['supplier'];
    datetimeUtc = json['datetime_utc'] == null ? null : DateTime.parse(json['datetime_utc']);
    expiryTime = json['expiry_time'] == null ? null : DateTime.parse(json['expiry_time']);
  }

  Map<String, dynamic> toJson() {
    return {
      'latitude': latitude,
      'longitude': longitude,
      'easting': easting,
      'northing': northing,
      'direction': direction,
      'bearing': bearing,
      'supplier': supplier,
      'datetime_utc': datetimeUtc == null ? '' : datetimeUtc.toUtc().toIso8601String(),
      'expiry_time': expiryTime == null ? '' : expiryTime.toUtc().toIso8601String()
     };
  }

  static List<V3VehiclePosition> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3VehiclePosition>() : json.map((value) => new V3VehiclePosition.fromJson(value)).toList();
  }

  static Map<String, V3VehiclePosition> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3VehiclePosition>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3VehiclePosition.fromJson(value));
    }
    return map;
  }
}
