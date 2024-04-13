'use strict';

var utils = require('../utils/writer.js');
var Routes = require('../service/RoutesService');

module.exports.routes_OneOrMoreRoutes = function routes_OneOrMoreRoutes (req, res, next, route_types, route_name, token, devid, signature) {
  Routes.routes_OneOrMoreRoutes(route_types, route_name, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.routes_RouteFromId = function routes_RouteFromId (req, res, next, route_id, include_geopath, geopath_utc, token, devid, signature) {
  Routes.routes_RouteFromId(route_id, include_geopath, geopath_utc, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
