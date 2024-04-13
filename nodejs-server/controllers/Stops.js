'use strict';

var utils = require('../utils/writer.js');
var Stops = require('../service/StopsService');

module.exports.stops_StopDetails = function stops_StopDetails (req, res, next, stop_id, route_type, stop_location, stop_amenities, stop_accessibility, stop_contact, stop_ticket, gtfs, stop_staffing, stop_disruptions, token, devid, signature) {
  Stops.stops_StopDetails(stop_id, route_type, stop_location, stop_amenities, stop_accessibility, stop_contact, stop_ticket, gtfs, stop_staffing, stop_disruptions, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.stops_StopsByGeolocation = function stops_StopsByGeolocation (req, res, next, latitude, longitude, route_types, max_results, max_distance, stop_disruptions, token, devid, signature) {
  Stops.stops_StopsByGeolocation(latitude, longitude, route_types, max_results, max_distance, stop_disruptions, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.stops_StopsForRoute = function stops_StopsForRoute (req, res, next, route_id, route_type, direction_id, stop_disruptions, include_geopath, geopath_utc, token, devid, signature) {
  Stops.stops_StopsForRoute(route_id, route_type, direction_id, stop_disruptions, include_geopath, geopath_utc, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
