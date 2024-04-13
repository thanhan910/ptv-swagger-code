'use strict';


/**
 * View all trip/service runs for a specific route ID
 *
 * route_id Integer Identifier of route; values returned by Routes API - v3/routes.
 * expand List List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. (optional)
 * date_utc Date Date of the request. (optional - defaults to now) (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.RunsResponse
 **/
exports.runs_ForRoute = function(route_id,expand,date_utc,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "runs" : [ {
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
  }, {
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
 * View all trip/service runs for a specific route ID and route type
 *
 * route_id Integer Identifier of route; values returned by Routes API - v3/routes.
 * route_type Integer Number identifying transport mode; values returned via RouteTypes API
 * expand List List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.
 * date_utc Date Date of the request. (optional - defaults to now) (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.RunsResponse
 **/
exports.runs_ForRouteAndRouteType = function(route_id,route_type,expand,date_utc,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "runs" : [ {
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
  }, {
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
 * View all trip/service runs for a specific run_ref
 *
 * run_ref String The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
 * expand List List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
 * date_utc Date Date of the request. (optional - defaults to now) (optional)
 * include_geopath Boolean Indicates if geopath data will be returned (default = false) (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.RunsResponse
 **/
exports.runs_ForRun = function(run_ref,expand,date_utc,include_geopath,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "runs" : [ {
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
  }, {
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
 * View the trip/service run for a specific run_ref and route type
 *
 * run_ref String The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
 * route_type Integer Number identifying transport mode; values returned via RouteTypes API
 * expand List List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
 * date_utc Date Date of the request. (optional - defaults to now) (optional)
 * include_geopath Boolean Indicates if geopath data will be returned (default = false) (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.RunResponse
 **/
exports.runs_ForRunAndRouteType = function(run_ref,route_type,expand,date_utc,include_geopath,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "run" : {
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

