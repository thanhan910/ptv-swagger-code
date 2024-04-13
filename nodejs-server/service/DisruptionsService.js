'use strict';


/**
 * View all disruptions for all route types
 *
 * route_types List Filter by route_type; values returned via RouteTypes API (optional)
 * disruption_modes List Filter by disruption_mode; values returned via v3/disruptions/modes API (optional)
 * disruption_status String Filter by status of disruption (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.DisruptionsResponse
 **/
exports.disruptions_GetAllDisruptions = function(route_types,disruption_modes,disruption_status,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "disruptions" : {
    "metro_bus" : [ null, null ],
    "skybus" : [ null, null ],
    "metro_train" : [ null, null ],
    "regional_coach" : [ null, null ],
    "regional_bus" : [ null, null ],
    "taxi" : [ null, null ],
    "regional_train" : [ null, null ],
    "general" : [ {
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
    "night_bus" : [ null, null ],
    "interstate_train" : [ null, null ],
    "ferry" : [ null, null ],
    "telebus" : [ null, null ],
    "metro_tram" : [ null, null ],
    "school_bus" : [ null, null ]
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
 * View a specific disruption
 *
 * disruption_id Long Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id}
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.DisruptionResponse
 **/
exports.disruptions_GetDisruptionById = function(disruption_id,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "disruption" : {
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
 * Get all disruption modes
 *
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.DisruptionModesResponse
 **/
exports.disruptions_GetDisruptionModes = function(token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "disruption_modes" : [ {
    "disruption_mode_name" : "disruption_mode_name",
    "disruption_mode" : 0
  }, {
    "disruption_mode_name" : "disruption_mode_name",
    "disruption_mode" : 0
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
 * View all disruptions for a particular route
 *
 * route_id Integer Identifier of route; values returned by Routes API - v3/routes
 * disruption_status String Filter by status of disruption (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.DisruptionsResponse
 **/
exports.disruptions_GetDisruptionsByRoute = function(route_id,disruption_status,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "disruptions" : {
    "metro_bus" : [ null, null ],
    "skybus" : [ null, null ],
    "metro_train" : [ null, null ],
    "regional_coach" : [ null, null ],
    "regional_bus" : [ null, null ],
    "taxi" : [ null, null ],
    "regional_train" : [ null, null ],
    "general" : [ {
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
    "night_bus" : [ null, null ],
    "interstate_train" : [ null, null ],
    "ferry" : [ null, null ],
    "telebus" : [ null, null ],
    "metro_tram" : [ null, null ],
    "school_bus" : [ null, null ]
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
 * View all disruptions for a particular route and stop
 *
 * route_id Integer Identifier of route; values returned by Routes API - v3/routes
 * stop_id Integer Identifier of stop; values returned by Stops API - v3/stops
 * disruption_status String Filter by status of disruption (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.DisruptionsResponse
 **/
exports.disruptions_GetDisruptionsByRouteAndStop = function(route_id,stop_id,disruption_status,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "disruptions" : {
    "metro_bus" : [ null, null ],
    "skybus" : [ null, null ],
    "metro_train" : [ null, null ],
    "regional_coach" : [ null, null ],
    "regional_bus" : [ null, null ],
    "taxi" : [ null, null ],
    "regional_train" : [ null, null ],
    "general" : [ {
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
    "night_bus" : [ null, null ],
    "interstate_train" : [ null, null ],
    "ferry" : [ null, null ],
    "telebus" : [ null, null ],
    "metro_tram" : [ null, null ],
    "school_bus" : [ null, null ]
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
 * View all disruptions for a particular stop
 *
 * stop_id Integer Identifier of stop; values returned by Stops API - v3/stops
 * disruption_status String Filter by status of disruption (optional)
 * token String Please ignore (optional)
 * devid String Your developer id (optional)
 * signature String Authentication signature for request (optional)
 * returns V3.DisruptionsResponse
 **/
exports.disruptions_GetDisruptionsByStop = function(stop_id,disruption_status,token,devid,signature) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "disruptions" : {
    "metro_bus" : [ null, null ],
    "skybus" : [ null, null ],
    "metro_train" : [ null, null ],
    "regional_coach" : [ null, null ],
    "regional_bus" : [ null, null ],
    "taxi" : [ null, null ],
    "regional_train" : [ null, null ],
    "general" : [ {
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
    "night_bus" : [ null, null ],
    "interstate_train" : [ null, null ],
    "ferry" : [ null, null ],
    "telebus" : [ null, null ],
    "metro_tram" : [ null, null ],
    "school_bus" : [ null, null ]
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

