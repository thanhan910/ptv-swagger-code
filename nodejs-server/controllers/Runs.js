'use strict';

var utils = require('../utils/writer.js');
var Runs = require('../service/RunsService');

module.exports.runs_ForRoute = function runs_ForRoute (req, res, next, route_id, expand, date_utc, token, devid, signature) {
  Runs.runs_ForRoute(route_id, expand, date_utc, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.runs_ForRouteAndRouteType = function runs_ForRouteAndRouteType (req, res, next, route_id, route_type, expand, date_utc, token, devid, signature) {
  Runs.runs_ForRouteAndRouteType(route_id, route_type, expand, date_utc, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.runs_ForRun = function runs_ForRun (req, res, next, run_ref, expand, date_utc, include_geopath, token, devid, signature) {
  Runs.runs_ForRun(run_ref, expand, date_utc, include_geopath, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.runs_ForRunAndRouteType = function runs_ForRunAndRouteType (req, res, next, run_ref, route_type, expand, date_utc, include_geopath, token, devid, signature) {
  Runs.runs_ForRunAndRouteType(run_ref, route_type, expand, date_utc, include_geopath, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
