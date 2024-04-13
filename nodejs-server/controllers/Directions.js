'use strict';

var utils = require('../utils/writer.js');
var Directions = require('../service/DirectionsService');

module.exports.directions_ForDirection = function directions_ForDirection (req, res, next, direction_id, token, devid, signature) {
  Directions.directions_ForDirection(direction_id, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.directions_ForDirectionAndType = function directions_ForDirectionAndType (req, res, next, direction_id, route_type, token, devid, signature) {
  Directions.directions_ForDirectionAndType(direction_id, route_type, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.directions_ForRoute = function directions_ForRoute (req, res, next, route_id, token, devid, signature) {
  Directions.directions_ForRoute(route_id, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
