'use strict';


/**
 * View the stopping pattern for a specific trip/service run
 *
 * run_ref String The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
 * route_type Integer Number identifying transport mode; values returned via RouteTypes API
 * expand List List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
 * stop_id Integer Filter by stop_id; values returned by Stops API (optional)
 * date_utc Date Filter by the date and time of the request (ISO 8601 UTC format) (optional)
 * include_skipped_stops Boolean Include any skipped stops in a stopping pattern. Defaults to false. (optional)
 * include_geopath Boolean Indicates if geopath data will be returned (default = false) (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.StoppingPattern
 **/
exports.patterns_GetPatternByRun = function(run_ref,route_type,expand,stop_id,date_utc,include_skipped_stops,include_geopath,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "routes" : {
    "key" : { }
  },
  "disruptions" : [ {
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
  }, {
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
  } ],
  "directions" : {
    "key" : {
      "direction_id" : 9,
      "route_id" : 6,
      "route_type" : 3,
      "direction_name" : "direction_name"
    }
  },
  "stops" : {
    "key" : {
      "stop_ticket" : {
        "ticket_type" : "ticket_type",
        "vline_reservation" : true,
        "zone" : "zone",
        "ticket_machine" : true,
        "ticket_zones" : [ 7, 7 ],
        "is_free_fare_zone" : true,
        "ticket_checks" : true
      },
      "stop_longitude" : 7.386282,
      "stop_sequence" : 1,
      "stop_id" : 3,
      "route_type" : 2,
      "stop_landmark" : "stop_landmark",
      "stop_suburb" : "stop_suburb",
      "stop_distance" : 9.301444,
      "stop_name" : "stop_name",
      "stop_latitude" : 4.145608
    }
  },
  "departures" : [ {
    "route_id" : 6,
    "run_id" : 1,
    "estimated_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "departure_sequence" : 2,
    "flags" : "flags",
    "skipped_stops" : [ {
      "stop_longitude" : 4.145608,
      "stop_sequence" : 7,
      "stop_id" : 9,
      "route_type" : 3,
      "stop_landmark" : "stop_landmark",
      "stop_suburb" : "stop_suburb",
      "stop_distance" : 7.0614014,
      "stop_name" : "stop_name",
      "stop_latitude" : 2.027123
    }, {
      "stop_longitude" : 4.145608,
      "stop_sequence" : 7,
      "stop_id" : 9,
      "route_type" : 3,
      "stop_landmark" : "stop_landmark",
      "stop_suburb" : "stop_suburb",
      "stop_distance" : 7.0614014,
      "stop_name" : "stop_name",
      "stop_latitude" : 2.027123
    } ],
    "disruption_ids" : [ 5, 5 ],
    "at_platform" : true,
    "scheduled_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "direction_id" : 5,
    "stop_id" : 0,
    "run_ref" : "run_ref",
    "platform_number" : "platform_number"
  }, {
    "route_id" : 6,
    "run_id" : 1,
    "estimated_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "departure_sequence" : 2,
    "flags" : "flags",
    "skipped_stops" : [ {
      "stop_longitude" : 4.145608,
      "stop_sequence" : 7,
      "stop_id" : 9,
      "route_type" : 3,
      "stop_landmark" : "stop_landmark",
      "stop_suburb" : "stop_suburb",
      "stop_distance" : 7.0614014,
      "stop_name" : "stop_name",
      "stop_latitude" : 2.027123
    }, {
      "stop_longitude" : 4.145608,
      "stop_sequence" : 7,
      "stop_id" : 9,
      "route_type" : 3,
      "stop_landmark" : "stop_landmark",
      "stop_suburb" : "stop_suburb",
      "stop_distance" : 7.0614014,
      "stop_name" : "stop_name",
      "stop_latitude" : 2.027123
    } ],
    "disruption_ids" : [ 5, 5 ],
    "at_platform" : true,
    "scheduled_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "direction_id" : 5,
    "stop_id" : 0,
    "run_ref" : "run_ref",
    "platform_number" : "platform_number"
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

