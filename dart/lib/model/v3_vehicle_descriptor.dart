part of swagger.api;

class V3VehicleDescriptor {
  /* Operator name of the vehicle such as \"Metro Trains Melbourne\", \"Yarra Trams\", \"Ventura Bus Line\", \"CDC\" or \"Sita Bus Lines\" . May be null/empty.  Only available for train, tram, v/line and some bus runs. */
  String operator_ = null;
/* Operator identifier of the vehicle such as \"26094\". May be null/empty. Only available for some tram and bus runs. */
  String id = null;
/* Indicator if vehicle has a low floor. May be null. Only available for some tram runs. */
  bool lowFloor = null;
/* Indicator if vehicle is air conditioned. May be null. Only available for some tram runs. */
  bool airConditioned = null;
/* Vehicle description such as \"6 Car Comeng\", \"6 Car Xtrapolis\", \"3 Car Comeng\", \"6 Car Siemens\", \"3 Car Siemens\". May be null/empty.  Only available for some metropolitan train runs. */
  String description = null;
/* Supplier of vehicle descriptor data. */
  String supplier = null;
/* The length of the vehicle. Applies to CIS - Metro Trains */
  String length = null;

  V3VehicleDescriptor();

  @override
  String toString() {
    return 'V3VehicleDescriptor[operator_=$operator_, id=$id, lowFloor=$lowFloor, airConditioned=$airConditioned, description=$description, supplier=$supplier, length=$length, ]';
  }

  V3VehicleDescriptor.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    operator_ = json['operator'];
    id = json['id'];
    lowFloor = json['low_floor'];
    airConditioned = json['air_conditioned'];
    description = json['description'];
    supplier = json['supplier'];
    length = json['length'];
  }

  Map<String, dynamic> toJson() {
    return {
      'operator': operator_,
      'id': id,
      'low_floor': lowFloor,
      'air_conditioned': airConditioned,
      'description': description,
      'supplier': supplier,
      'length': length
     };
  }

  static List<V3VehicleDescriptor> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3VehicleDescriptor>() : json.map((value) => new V3VehicleDescriptor.fromJson(value)).toList();
  }

  static Map<String, V3VehicleDescriptor> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3VehicleDescriptor>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3VehicleDescriptor.fromJson(value));
    }
    return map;
  }
}
