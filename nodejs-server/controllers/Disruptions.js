'use strict';

var utils = require('../utils/writer.js');
var Disruptions = require('../service/DisruptionsService');

module.exports.disruptions_GetAllDisruptions = function disruptions_GetAllDisruptions (req, res, next, route_types, disruption_modes, disruption_status, token, devid, signature) {
  Disruptions.disruptions_GetAllDisruptions(route_types, disruption_modes, disruption_status, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.disruptions_GetDisruptionById = function disruptions_GetDisruptionById (req, res, next, disruption_id, token, devid, signature) {
  Disruptions.disruptions_GetDisruptionById(disruption_id, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.disruptions_GetDisruptionModes = function disruptions_GetDisruptionModes (req, res, next, token, devid, signature) {
  Disruptions.disruptions_GetDisruptionModes(token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.disruptions_GetDisruptionsByRoute = function disruptions_GetDisruptionsByRoute (req, res, next, route_id, disruption_status, token, devid, signature) {
  Disruptions.disruptions_GetDisruptionsByRoute(route_id, disruption_status, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.disruptions_GetDisruptionsByRouteAndStop = function disruptions_GetDisruptionsByRouteAndStop (req, res, next, route_id, stop_id, disruption_status, token, devid, signature) {
  Disruptions.disruptions_GetDisruptionsByRouteAndStop(route_id, stop_id, disruption_status, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.disruptions_GetDisruptionsByStop = function disruptions_GetDisruptionsByStop (req, res, next, stop_id, disruption_status, token, devid, signature) {
  Disruptions.disruptions_GetDisruptionsByStop(stop_id, disruption_status, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
