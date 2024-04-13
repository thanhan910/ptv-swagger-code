'use strict';


/**
 * View all routes for a direction of travel
 *
 * direction_id Integer Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.DirectionsResponse
 **/
exports.directions_ForDirection = function(direction_id,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "directions" : [ {
    "direction_id" : 0,
    "route_id" : 6,
    "route_type" : 1,
    "direction_name" : "direction_name",
    "route_direction_description" : "route_direction_description"
  }, {
    "direction_id" : 0,
    "route_id" : 6,
    "route_type" : 1,
    "direction_name" : "direction_name",
    "route_direction_description" : "route_direction_description"
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
 * View all routes of a particular type for a direction of travel
 *
 * direction_id Integer Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
 * route_type Integer Number identifying transport mode; values returned via RouteTypes API
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.DirectionsResponse
 **/
exports.directions_ForDirectionAndType = function(direction_id,route_type,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "directions" : [ {
    "direction_id" : 0,
    "route_id" : 6,
    "route_type" : 1,
    "direction_name" : "direction_name",
    "route_direction_description" : "route_direction_description"
  }, {
    "direction_id" : 0,
    "route_id" : 6,
    "route_type" : 1,
    "direction_name" : "direction_name",
    "route_direction_description" : "route_direction_description"
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
 * View directions that a route travels in
 *
 * route_id Integer Identifier of route; values returned by Routes API - v3/routes
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.DirectionsResponse
 **/
exports.directions_ForRoute = function(route_id,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "directions" : [ {
    "direction_id" : 0,
    "route_id" : 6,
    "route_type" : 1,
    "direction_name" : "direction_name",
    "route_direction_description" : "route_direction_description"
  }, {
    "direction_id" : 0,
    "route_id" : 6,
    "route_type" : 1,
    "direction_name" : "direction_name",
    "route_direction_description" : "route_direction_description"
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

