'use strict';


/**
 * View stops, routes and myki ticket outlets that match the search term
 *
 * search_term String Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes)
 * route_types List Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) (optional)
 * latitude Float Filter by geographic coordinate of latitude (optional)
 * longitude Float Filter by geographic coordinate of longitude (optional)
 * max_distance Float Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (optional)
 * include_addresses Boolean Placeholder for future development; currently unavailable (optional)
 * include_outlets Boolean Indicates if outlets will be returned in response (default = true) (optional)
 * match_stop_by_suburb Boolean Indicates whether to find stops by suburbs in the search term (default = true) (optional)
 * match_route_by_suburb Boolean Indicates whether to find routes by suburbs in the search term (default = true) (optional)
 * match_stop_by_gtfs_stop_id Boolean Indicates whether to search for stops according to a metlink stop ID (default = false) (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.SearchResult
 **/
exports.search_Search = function(search_term,route_types,latitude,longitude,max_distance,include_addresses,include_outlets,match_stop_by_suburb,match_route_by_suburb,match_stop_by_gtfs_stop_id,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "routes" : [ null, null ],
  "outlets" : [ {
    "outlet_business_hour_thur" : "outlet_business_hour_thur",
    "outlet_postcode" : 7,
    "outlet_business_hour_fri" : "outlet_business_hour_fri",
    "outlet_business_hour_wed" : "outlet_business_hour_wed",
    "outlet_suburb" : "outlet_suburb",
    "outlet_longitude" : 4.145608,
    "outlet_name" : "outlet_name",
    "outlet_distance" : 3.6160767,
    "outlet_business" : "outlet_business",
    "outlet_business_hour_mon" : "outlet_business_hour_mon",
    "outlet_business_hour_sun" : "outlet_business_hour_sun",
    "outlet_slid_spid" : "outlet_slid_spid",
    "outlet_business_hour_sat" : "outlet_business_hour_sat",
    "outlet_notes" : "outlet_notes",
    "outlet_business_hour_tue" : "outlet_business_hour_tue",
    "outlet_latitude" : 2.027123
  }, {
    "outlet_business_hour_thur" : "outlet_business_hour_thur",
    "outlet_postcode" : 7,
    "outlet_business_hour_fri" : "outlet_business_hour_fri",
    "outlet_business_hour_wed" : "outlet_business_hour_wed",
    "outlet_suburb" : "outlet_suburb",
    "outlet_longitude" : 4.145608,
    "outlet_name" : "outlet_name",
    "outlet_distance" : 3.6160767,
    "outlet_business" : "outlet_business",
    "outlet_business_hour_mon" : "outlet_business_hour_mon",
    "outlet_business_hour_sun" : "outlet_business_hour_sun",
    "outlet_slid_spid" : "outlet_slid_spid",
    "outlet_business_hour_sat" : "outlet_business_hour_sat",
    "outlet_notes" : "outlet_notes",
    "outlet_business_hour_tue" : "outlet_business_hour_tue",
    "outlet_latitude" : 2.027123
  } ],
  "stops" : [ {
    "routes" : [ {
      "route_service_status" : {
        "description" : "description",
        "timestamp" : "2000-01-23T04:56:07.000+00:00"
      },
      "route_id" : 5,
      "route_name" : "route_name",
      "route_type" : 1,
      "route_number" : "route_number",
      "route_gtfs_id" : "route_gtfs_id"
    }, {
      "route_service_status" : {
        "description" : "description",
        "timestamp" : "2000-01-23T04:56:07.000+00:00"
      },
      "route_id" : 5,
      "route_name" : "route_name",
      "route_type" : 1,
      "route_number" : "route_number",
      "route_gtfs_id" : "route_gtfs_id"
    } ],
    "stop_longitude" : 2.302136,
    "stop_sequence" : 7,
    "route_type" : 6,
    "stop_id" : 9,
    "stop_landmark" : "stop_landmark",
    "stop_suburb" : "stop_suburb",
    "stop_distance" : 0.8008282,
    "stop_name" : "stop_name",
    "stop_latitude" : 5.637377
  }, {
    "routes" : [ {
      "route_service_status" : {
        "description" : "description",
        "timestamp" : "2000-01-23T04:56:07.000+00:00"
      },
      "route_id" : 5,
      "route_name" : "route_name",
      "route_type" : 1,
      "route_number" : "route_number",
      "route_gtfs_id" : "route_gtfs_id"
    }, {
      "route_service_status" : {
        "description" : "description",
        "timestamp" : "2000-01-23T04:56:07.000+00:00"
      },
      "route_id" : 5,
      "route_name" : "route_name",
      "route_type" : 1,
      "route_number" : "route_number",
      "route_gtfs_id" : "route_gtfs_id"
    } ],
    "stop_longitude" : 2.302136,
    "stop_sequence" : 7,
    "route_type" : 6,
    "stop_id" : 9,
    "stop_landmark" : "stop_landmark",
    "stop_suburb" : "stop_suburb",
    "stop_distance" : 0.8008282,
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

