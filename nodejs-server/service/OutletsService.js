'use strict';


/**
 * List all ticket outlets
 *
 * max_results Integer Maximum number of results returned (default = 30) (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.OutletResponse
 **/
exports.outlets_GetAllOutlets = function(max_results,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "outlets" : [ {
    "outlet_business_hour_thur" : "outlet_business_hour_thur",
    "outlet_postcode" : 1,
    "outlet_business_hour_fri" : "outlet_business_hour_fri",
    "outlet_business_hour_wed" : "outlet_business_hour_wed",
    "outlet_suburb" : "outlet_suburb",
    "outlet_longitude" : 6.0274563,
    "outlet_name" : "outlet_name",
    "outlet_business" : "outlet_business",
    "outlet_business_hour_mon" : "outlet_business_hour_mon",
    "outlet_business_hour_sun" : "outlet_business_hour_sun",
    "outlet_slid_spid" : "outlet_slid_spid",
    "outlet_business_hour_sat" : "outlet_business_hour_sat",
    "outlet_notes" : "outlet_notes",
    "outlet_business_hour_tue" : "outlet_business_hour_tue",
    "outlet_latitude" : 0.8008282
  }, {
    "outlet_business_hour_thur" : "outlet_business_hour_thur",
    "outlet_postcode" : 1,
    "outlet_business_hour_fri" : "outlet_business_hour_fri",
    "outlet_business_hour_wed" : "outlet_business_hour_wed",
    "outlet_suburb" : "outlet_suburb",
    "outlet_longitude" : 6.0274563,
    "outlet_name" : "outlet_name",
    "outlet_business" : "outlet_business",
    "outlet_business_hour_mon" : "outlet_business_hour_mon",
    "outlet_business_hour_sun" : "outlet_business_hour_sun",
    "outlet_slid_spid" : "outlet_slid_spid",
    "outlet_business_hour_sat" : "outlet_business_hour_sat",
    "outlet_notes" : "outlet_notes",
    "outlet_business_hour_tue" : "outlet_business_hour_tue",
    "outlet_latitude" : 0.8008282
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
 * List ticket outlets near a specific location
 *
 * latitude Float Geographic coordinate of latitude
 * longitude Float Geographic coordinate of longitude
 * max_distance Double Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300) (optional)
 * max_results Integer Maximum number of results returned (default = 30) (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.OutletGeolocationResponse
 **/
exports.outlets_GetOutletsByGeolocation = function(latitude,longitude,max_distance,max_results,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "outlets" : [ {
    "outlet_business_hour_thur" : "outlet_business_hour_thur",
    "outlet_postcode" : 5,
    "outlet_business_hour_fri" : "outlet_business_hour_fri",
    "outlet_business_hour_wed" : "outlet_business_hour_wed",
    "outlet_suburb" : "outlet_suburb",
    "outlet_longitude" : 1.4658129,
    "outlet_name" : "outlet_name",
    "outlet_distance" : 0.8008282,
    "outlet_business" : "outlet_business",
    "outlet_business_hour_mon" : "outlet_business_hour_mon",
    "outlet_business_hour_sun" : "outlet_business_hour_sun",
    "outlet_slid_spid" : "outlet_slid_spid",
    "outlet_business_hour_sat" : "outlet_business_hour_sat",
    "outlet_notes" : "outlet_notes",
    "outlet_business_hour_tue" : "outlet_business_hour_tue",
    "outlet_latitude" : 6.0274563
  }, {
    "outlet_business_hour_thur" : "outlet_business_hour_thur",
    "outlet_postcode" : 5,
    "outlet_business_hour_fri" : "outlet_business_hour_fri",
    "outlet_business_hour_wed" : "outlet_business_hour_wed",
    "outlet_suburb" : "outlet_suburb",
    "outlet_longitude" : 1.4658129,
    "outlet_name" : "outlet_name",
    "outlet_distance" : 0.8008282,
    "outlet_business" : "outlet_business",
    "outlet_business_hour_mon" : "outlet_business_hour_mon",
    "outlet_business_hour_sun" : "outlet_business_hour_sun",
    "outlet_slid_spid" : "outlet_slid_spid",
    "outlet_business_hour_sat" : "outlet_business_hour_sat",
    "outlet_notes" : "outlet_notes",
    "outlet_business_hour_tue" : "outlet_business_hour_tue",
    "outlet_latitude" : 6.0274563
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

