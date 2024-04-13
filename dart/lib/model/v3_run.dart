part of swagger.api;

class V3Run {
  /* Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric */
  int runId = null;
/* Alphanumeric trip/service run identifier */
  String runRef = null;
/* Route identifier */
  int routeId = null;
/* Transport mode identifier */
  int routeType = null;
/* stop_id of final stop of run */
  int finalStopId = null;
/* Name of destination of run */
  String destinationName = null;
/* Status of metropolitan train run; returns \"scheduled\" for other modes */
  String status = null;
/* Direction of travel identifier */
  int directionId = null;
/* Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id. */
  int runSequence = null;
/* The number of remaining skipped/express stations for the run/service from a stop */
  int expressStopCount = null;

  V3VehiclePosition vehiclePosition = null;

  V3VehicleDescriptor vehicleDescriptor = null;
/* Geopath of the route */
  List<Object> geopath = [];

  V3Run();

  @override
  String toString() {
    return 'V3Run[runId=$runId, runRef=$runRef, routeId=$routeId, routeType=$routeType, finalStopId=$finalStopId, destinationName=$destinationName, status=$status, directionId=$directionId, runSequence=$runSequence, expressStopCount=$expressStopCount, vehiclePosition=$vehiclePosition, vehicleDescriptor=$vehicleDescriptor, geopath=$geopath, ]';
  }

  V3Run.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    runId = json['run_id'];
    runRef = json['run_ref'];
    routeId = json['route_id'];
    routeType = json['route_type'];
    finalStopId = json['final_stop_id'];
    destinationName = json['destination_name'];
    status = json['status'];
    directionId = json['direction_id'];
    runSequence = json['run_sequence'];
    expressStopCount = json['express_stop_count'];
    vehiclePosition = new V3VehiclePosition.fromJson(json['vehicle_position']);
    vehicleDescriptor = new V3VehicleDescriptor.fromJson(json['vehicle_descriptor']);
    geopath = Object.listFromJson(json['geopath']);
  }

  Map<String, dynamic> toJson() {
    return {
      'run_id': runId,
      'run_ref': runRef,
      'route_id': routeId,
      'route_type': routeType,
      'final_stop_id': finalStopId,
      'destination_name': destinationName,
      'status': status,
      'direction_id': directionId,
      'run_sequence': runSequence,
      'express_stop_count': expressStopCount,
      'vehicle_position': vehiclePosition,
      'vehicle_descriptor': vehicleDescriptor,
      'geopath': geopath
     };
  }

  static List<V3Run> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3Run>() : json.map((value) => new V3Run.fromJson(value)).toList();
  }

  static Map<String, V3Run> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3Run>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3Run.fromJson(value));
    }
    return map;
  }
}
