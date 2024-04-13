'use strict';


/**
 * View facilities at a specific stop (Metro and V/Line stations only)
 *
 * stop_id Integer Identifier of stop; values returned by Stops API
 * route_type Integer Number identifying transport mode; values returned via RouteTypes API
 * stop_location Boolean Indicates if stop location information will be returned (default = false) (optional)
 * stop_amenities Boolean Indicates if stop amenity information will be returned (default = false) (optional)
 * stop_accessibility Boolean Indicates if stop accessibility information will be returned (default = false) (optional)
 * stop_contact Boolean Indicates if stop contact information will be returned (default = false) (optional)
 * stop_ticket Boolean Indicates if stop ticket information will be returned (default = false) (optional)
 * gtfs Boolean Incdicates whether the stop_id is a GTFS ID or not (optional)
 * stop_staffing Boolean Indicates if stop staffing information will be returned (default = false) (optional)
 * stop_disruptions Boolean Indicates if stop disruption information will be returned (default = false) (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.StopResponse
 **/
exports.stops_StopDetails = function(stop_id,route_type,stop_location,stop_amenities,stop_accessibility,stop_contact,stop_ticket,gtfs,stop_staffing,stop_disruptions,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "stop" : {
    "station_description" : "station_description",
    "routes" : [ { }, { } ],
    "stop_amenities" : {
      "taxi_rank" : true,
      "toilet" : true,
      "car_parking" : "car_parking",
      "cctv" : true
    },
    "route_type" : 6,
    "stop_staffing" : {
      "sun_am_to" : "sun_am_to",
      "sun_am_from" : "sun_am_from",
      "sun_pm_to" : "sun_pm_to",
      "tue_am_from" : "tue_am_from",
      "ph_from" : "ph_from",
      "sat_am_from" : "sat_am_from",
      "wed_am_from" : "wed_am_from",
      "ph_additional_text" : "ph_additional_text",
      "sun_pm_from" : "sun_pm_from",
      "thu_pm_to" : "thu_pm_to",
      "fri_am_to" : "fri_am_to",
      "fri_pm_from" : "fri_pm_from",
      "sat_pm_from" : "sat_pm_from",
      "tue_am_to" : "tue_am_to",
      "tue_pm_from" : "tue_pm_from",
      "sat_am_to" : "sat_am_to",
      "thu_pm_from" : "thu_pm_from",
      "mon_am_to" : "mon_am_to",
      "mon_pm_to" : "mon_pm_to",
      "fri_am_from" : "fri_am_from",
      "fri_pm_to" : "fri_pm_to",
      "thu_am_from" : "thu_am_from",
      "thu_am_to" : "thu_am_to",
      "mon_pm_from" : "mon_pm_from",
      "sat_pm_to" : "sat_pm_to",
      "tue_pm_to" : "tue_pm_to",
      "ph_to" : "ph_to",
      "wed_pm_from" : "wed_pm_from",
      "wed_pm_To" : "wed_pm_To",
      "mon_am_from" : "mon_am_from",
      "wed_am_to" : "wed_am_to"
    },
    "stop_id" : 2,
    "stop_location" : {
      "gps" : {
        "latitude" : 1.4658129,
        "longitude" : 5.962134
      }
    },
    "stop_accessibility" : {
      "wheelchair" : {
        "parking" : true,
        "raised_platform_shelther" : true,
        "toilet" : true,
        "low_ticket_counter" : true,
        "ramp" : true,
        "accessible_ramp" : true,
        "manouvering" : true,
        "steep_ramp" : true,
        "telephone" : true,
        "secondary_path" : true,
        "raised_platform" : true
      },
      "escalator" : true,
      "hearing_loop" : true,
      "waiting_room" : true,
      "stairs" : true,
      "platform_number" : 5,
      "lift" : true,
      "tactile_ground_surface_indicator" : true,
      "lighting" : true,
      "stop_accessible" : true,
      "audio_customer_information" : true
    },
    "stop_landmark" : "stop_landmark",
    "station_type" : "station_type",
    "disruption_ids" : [ 0, 0 ],
    "stop_name" : "stop_name"
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
 * View all stops near a specific location
 *
 * latitude Float Geographic coordinate of latitude
 * longitude Float Geographic coordinate of longitude
 * route_types List Filter by route_type; values returned via RouteTypes API (optional)
 * max_results Integer Maximum number of results returned (default = 30) (optional)
 * max_distance Double Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300) (optional)
 * stop_disruptions Boolean Indicates if stop disruption information will be returned (default = false) (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.StopsByDistanceResponse
 **/
exports.stops_StopsByGeolocation = function(latitude,longitude,route_types,max_results,max_distance,stop_disruptions,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
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
  "stops" : [ {
    "routes" : [ { }, { } ],
    "stop_longitude" : 2.302136,
    "stop_sequence" : 7,
    "stop_id" : 1,
    "route_type" : 5,
    "stop_landmark" : "stop_landmark",
    "stop_suburb" : "stop_suburb",
    "disruption_ids" : [ 0, 0 ],
    "stop_distance" : 6.0274563,
    "stop_name" : "stop_name",
    "stop_latitude" : 5.637377
  }, {
    "routes" : [ { }, { } ],
    "stop_longitude" : 2.302136,
    "stop_sequence" : 7,
    "stop_id" : 1,
    "route_type" : 5,
    "stop_landmark" : "stop_landmark",
    "stop_suburb" : "stop_suburb",
    "disruption_ids" : [ 0, 0 ],
    "stop_distance" : 6.0274563,
    "stop_name" : "stop_name",
    "stop_latitude" : 5.637377
  } ],
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
 * View all stops on a specific route
 *
 * route_id Integer Identifier of route; values returned by Routes API - v3/routes
 * route_type Integer Number identifying transport mode; values returned via RouteTypes API
 * direction_id Integer An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response. (optional)
 * stop_disruptions Boolean Indicates if stop disruption information will be returned (default = false) (optional)
 * include_geopath Boolean Indicates if geopath data will be returned (default = false) (optional)
 * geopath_utc Date Filter geopaths by date (ISO 8601 UTC format) (default = current date) (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.StopsOnRouteResponse
 **/
exports.stops_StopsForRoute = function(route_id,route_type,direction_id,stop_disruptions,include_geopath,geopath_utc,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
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
  "stops" : [ {
    "stop_ticket" : {
      "ticket_type" : "ticket_type",
      "vline_reservation" : true,
      "zone" : "zone",
      "ticket_machine" : true,
      "ticket_zones" : [ 7, 7 ],
      "is_free_fare_zone" : true,
      "ticket_checks" : true
    },
    "stop_longitude" : 5.962134,
    "stop_sequence" : 5,
    "route_type" : 6,
    "stop_id" : 2,
    "stop_landmark" : "stop_landmark",
    "stop_suburb" : "stop_suburb",
    "disruption_ids" : [ 0, 0 ],
    "stop_name" : "stop_name",
    "stop_latitude" : 1.4658129
  }, {
    "stop_ticket" : {
      "ticket_type" : "ticket_type",
      "vline_reservation" : true,
      "zone" : "zone",
      "ticket_machine" : true,
      "ticket_zones" : [ 7, 7 ],
      "is_free_fare_zone" : true,
      "ticket_checks" : true
    },
    "stop_longitude" : 5.962134,
    "stop_sequence" : 5,
    "route_type" : 6,
    "stop_id" : 2,
    "stop_landmark" : "stop_landmark",
    "stop_suburb" : "stop_suburb",
    "disruption_ids" : [ 0, 0 ],
    "stop_name" : "stop_name",
    "stop_latitude" : 1.4658129
  } ],
  "geopath" : [ { }, { } ],
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

