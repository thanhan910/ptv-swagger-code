'use strict';

var utils = require('../utils/writer.js');
var Departures = require('../service/DeparturesService');

module.exports.departures_GetForStop = function departures_GetForStop (req, res, next, route_type, stop_id, platform_numbers, direction_id, gtfs, date_utc, max_results, include_cancelled, look_backwards, expand, include_geopath, token, devid, signature) {
  Departures.departures_GetForStop(route_type, stop_id, platform_numbers, direction_id, gtfs, date_utc, max_results, include_cancelled, look_backwards, expand, include_geopath, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.departures_GetForStopAndRoute = function departures_GetForStopAndRoute (req, res, next, route_type, stop_id, route_id, direction_id, gtfs, date_utc, max_results, include_cancelled, look_backwards, expand, include_geopath, token, devid, signature) {
  Departures.departures_GetForStopAndRoute(route_type, stop_id, route_id, direction_id, gtfs, date_utc, max_results, include_cancelled, look_backwards, expand, include_geopath, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
