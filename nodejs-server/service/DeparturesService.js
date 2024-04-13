'use strict';


/**
 * View departures for all routes from a stop
 *
 * route_type Integer Number identifying transport mode; values returned via RouteTypes API
 * stop_id Integer Identifier of stop; values returned by Stops API
 * platform_numbers List Filter by platform number at stop (optional)
 * direction_id Integer Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
 * gtfs Boolean Indicates that stop_id parameter will accept \"GTFS stop_id\" data (optional)
 * date_utc Date Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time) (optional)
 * max_results Integer Maximum number of results returned (optional)
 * include_cancelled Boolean Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only (optional)
 * look_backwards Boolean Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0. (optional)
 * expand List List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
 * include_geopath Boolean Indicates if the route geopath should be returned (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.DeparturesResponse
 **/
exports.departures_GetForStop = function(route_type,stop_id,platform_numbers,direction_id,gtfs,date_utc,max_results,include_cancelled,look_backwards,expand,include_geopath,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "routes" : {
    "key" : { }
  },
  "directions" : {
    "key" : {
      "direction_id" : 9,
      "route_id" : 6,
      "route_type" : 3,
      "direction_name" : "direction_name"
    }
  },
  "disruptions" : {
    "key" : {
      "last_updated" : "2000-01-23T04:56:07.000+00:00",
      "from_date" : "2000-01-23T04:56:07.000+00:00",
      "disruption_type" : "disruption_type",
      "published_on" : "2000-01-23T04:56:07.000+00:00",
      "description" : "description",
      "display_on_board" : true,
      "title" : "title",
      "url" : "url",
      "routes" : [ {
        "route_id" : 2,
        "route_name" : "route_name",
        "route_type" : 1,
        "route_number" : "route_number",
        "route_gtfs_id" : "route_gtfs_id",
        "direction" : {
          "service_time" : "service_time",
          "direction_id" : 6,
          "direction_name" : "direction_name",
          "route_direction_id" : 6
        }
      }, {
        "route_id" : 2,
        "route_name" : "route_name",
        "route_type" : 1,
        "route_number" : "route_number",
        "route_gtfs_id" : "route_gtfs_id",
        "direction" : {
          "service_time" : "service_time",
          "direction_id" : 6,
          "direction_name" : "direction_name",
          "route_direction_id" : 6
        }
      } ],
      "disruption_id" : 6,
      "colour" : "colour",
      "to_date" : "2000-01-23T04:56:07.000+00:00",
      "disruption_status" : "disruption_status",
      "stops" : [ {
        "stop_id" : 5,
        "stop_name" : "stop_name"
      }, {
        "stop_id" : 5,
        "stop_name" : "stop_name"
      } ],
      "display_status" : true
    }
  },
  "stops" : {
    "key" : {
      "stop_longitude" : 4.145608,
      "stop_sequence" : 7,
      "stop_id" : 9,
      "route_type" : 3,
      "stop_landmark" : "stop_landmark",
      "stop_suburb" : "stop_suburb",
      "stop_distance" : 7.0614014,
      "stop_name" : "stop_name",
      "stop_latitude" : 2.027123
    }
  },
  "departures" : [ {
    "scheduled_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "direction_id" : 5,
    "route_id" : 6,
    "run_id" : 1,
    "estimated_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "departure_sequence" : 2,
    "stop_id" : 0,
    "run_ref" : "run_ref",
    "platform_number" : "platform_number",
    "flags" : "flags",
    "disruption_ids" : [ 5, 5 ],
    "at_platform" : true
  }, {
    "scheduled_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "direction_id" : 5,
    "route_id" : 6,
    "run_id" : 1,
    "estimated_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "departure_sequence" : 2,
    "stop_id" : 0,
    "run_ref" : "run_ref",
    "platform_number" : "platform_number",
    "flags" : "flags",
    "disruption_ids" : [ 5, 5 ],
    "at_platform" : true
  } ],
  "runs" : {
    "key" : {
      "run_id" : 1,
      "route_id" : 1,
      "final_stop_id" : 6,
      "destination_name" : "destination_name",
      "vehicle_descriptor" : {
        "low_floor" : true,
        "air_conditioned" : true,
        "supplier" : "supplier",
        "length" : "length",
        "description" : "description",
        "id" : "id",
        "operator" : "operator"
      },
      "run_sequence" : 1,
      "direction_id" : 7,
      "run_ref" : "run_ref",
      "route_type" : 1,
      "vehicle_position" : {
        "easting" : 9.369310271410669,
        "bearing" : 8.762042012749001,
        "datetime_utc" : "2000-01-23T04:56:07.000+00:00",
        "latitude" : 5.025004791520295,
        "supplier" : "supplier",
        "expiry_time" : "2000-01-23T04:56:07.000+00:00",
        "northing" : 6.683562403749608,
        "longitude" : 9.965781217890562,
        "direction" : "direction"
      },
      "express_stop_count" : 4,
      "geopath" : [ { }, { } ],
      "status" : "status"
    }
  },
  "status" : {
    "health" : 6,
    "version" : "version"
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * View departures for a specific route from a stop
 *
 * route_type Integer Number identifying transport mode; values returned via RouteTypes API
 * stop_id Integer Identifier of stop; values returned by Stops API
 * route_id String Identifier of route; values returned by Routes API - v3/routes
 * direction_id Integer Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
 * gtfs Boolean Indicates that stop_id parameter will accept \"GTFS stop_id\" data (optional)
 * date_utc Date Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time) (optional)
 * max_results Integer Maximum number of results returned (optional)
 * include_cancelled Boolean Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only (optional)
 * look_backwards Boolean Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0. (optional)
 * expand List List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
 * include_geopath Boolean Indicates if the route geopath should be returned (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.DeparturesResponse
 **/
exports.departures_GetForStopAndRoute = function(route_type,stop_id,route_id,direction_id,gtfs,date_utc,max_results,include_cancelled,look_backwards,expand,include_geopath,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "routes" : {
    "key" : { }
  },
  "directions" : {
    "key" : {
      "direction_id" : 9,
      "route_id" : 6,
      "route_type" : 3,
      "direction_name" : "direction_name"
    }
  },
  "disruptions" : {
    "key" : {
      "last_updated" : "2000-01-23T04:56:07.000+00:00",
      "from_date" : "2000-01-23T04:56:07.000+00:00",
      "disruption_type" : "disruption_type",
      "published_on" : "2000-01-23T04:56:07.000+00:00",
      "description" : "description",
      "display_on_board" : true,
      "title" : "title",
      "url" : "url",
      "routes" : [ {
        "route_id" : 2,
        "route_name" : "route_name",
        "route_type" : 1,
        "route_number" : "route_number",
        "route_gtfs_id" : "route_gtfs_id",
        "direction" : {
          "service_time" : "service_time",
          "direction_id" : 6,
          "direction_name" : "direction_name",
          "route_direction_id" : 6
        }
      }, {
        "route_id" : 2,
        "route_name" : "route_name",
        "route_type" : 1,
        "route_number" : "route_number",
        "route_gtfs_id" : "route_gtfs_id",
        "direction" : {
          "service_time" : "service_time",
          "direction_id" : 6,
          "direction_name" : "direction_name",
          "route_direction_id" : 6
        }
      } ],
      "disruption_id" : 6,
      "colour" : "colour",
      "to_date" : "2000-01-23T04:56:07.000+00:00",
      "disruption_status" : "disruption_status",
      "stops" : [ {
        "stop_id" : 5,
        "stop_name" : "stop_name"
      }, {
        "stop_id" : 5,
        "stop_name" : "stop_name"
      } ],
      "display_status" : true
    }
  },
  "stops" : {
    "key" : {
      "stop_longitude" : 4.145608,
      "stop_sequence" : 7,
      "stop_id" : 9,
      "route_type" : 3,
      "stop_landmark" : "stop_landmark",
      "stop_suburb" : "stop_suburb",
      "stop_distance" : 7.0614014,
      "stop_name" : "stop_name",
      "stop_latitude" : 2.027123
    }
  },
  "departures" : [ {
    "scheduled_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "direction_id" : 5,
    "route_id" : 6,
    "run_id" : 1,
    "estimated_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "departure_sequence" : 2,
    "stop_id" : 0,
    "run_ref" : "run_ref",
    "platform_number" : "platform_number",
    "flags" : "flags",
    "disruption_ids" : [ 5, 5 ],
    "at_platform" : true
  }, {
    "scheduled_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "direction_id" : 5,
    "route_id" : 6,
    "run_id" : 1,
    "estimated_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "departure_sequence" : 2,
    "stop_id" : 0,
    "run_ref" : "run_ref",
    "platform_number" : "platform_number",
    "flags" : "flags",
    "disruption_ids" : [ 5, 5 ],
    "at_platform" : true
  } ],
  "runs" : {
    "key" : {
      "run_id" : 1,
      "route_id" : 1,
      "final_stop_id" : 6,
      "destination_name" : "destination_name",
      "vehicle_descriptor" : {
        "low_floor" : true,
        "air_conditioned" : true,
        "supplier" : "supplier",
        "length" : "length",
        "description" : "description",
        "id" : "id",
        "operator" : "operator"
      },
      "run_sequence" : 1,
      "direction_id" : 7,
      "run_ref" : "run_ref",
      "route_type" : 1,
      "vehicle_position" : {
        "easting" : 9.369310271410669,
        "bearing" : 8.762042012749001,
        "datetime_utc" : "2000-01-23T04:56:07.000+00:00",
        "latitude" : 5.025004791520295,
        "supplier" : "supplier",
        "expiry_time" : "2000-01-23T04:56:07.000+00:00",
        "northing" : 6.683562403749608,
        "longitude" : 9.965781217890562,
        "direction" : "direction"
      },
      "express_stop_count" : 4,
      "geopath" : [ { }, { } ],
      "status" : "status"
    }
  },
  "status" : {
    "health" : 6,
    "version" : "version"
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

