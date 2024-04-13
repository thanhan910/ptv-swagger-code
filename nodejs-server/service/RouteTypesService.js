'use strict';


/**
 * View all route types and their names
 *
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.RouteTypesResponse
 **/
exports.routeTypes_GetRouteTypes = function(token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "route_types" : [ {
    "route_type_name" : "route_type_name",
    "route_type" : 0
  }, {
    "route_type_name" : "route_type_name",
    "route_type" : 0
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

