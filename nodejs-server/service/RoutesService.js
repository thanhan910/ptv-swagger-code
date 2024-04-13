'use strict';


/**
 * View route names and numbers for all routes
 *
 * route_types List Filter by route_type; values returned via RouteTypes API (optional)
 * route_name String Filter by name  of route (accepts partial route name matches) (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.RouteResponse
 **/
exports.routes_OneOrMoreRoutes = function(route_types,route_name,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "route" : {
    "route_service_status" : {
      "description" : "description",
      "timestamp" : "2000-01-23T04:56:07.000+00:00"
    },
    "route_id" : 6,
    "route_name" : "route_name",
    "route_type" : 0,
    "route_number" : "route_number",
    "route_gtfs_id" : "route_gtfs_id",
    "geopath" : [ { }, { } ]
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
 * View route name and number for specific route ID
 *
 * route_id Integer Identifier of route; values returned by Departures, Directions and Disruptions APIs
 * include_geopath Boolean Indicates kif geopath data will be returned (default = false) (optional)
 * geopath_utc Date Filter geopaths by date (ISO 8601 UTC format) (default = current date) (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.RouteResponse
 **/
exports.routes_RouteFromId = function(route_id,include_geopath,geopath_utc,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "route" : {
    "route_service_status" : {
      "description" : "description",
      "timestamp" : "2000-01-23T04:56:07.000+00:00"
    },
    "route_id" : 6,
    "route_name" : "route_name",
    "route_type" : 0,
    "route_number" : "route_number",
    "route_gtfs_id" : "route_gtfs_id",
    "geopath" : [ { }, { } ]
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

