'use strict';

var utils = require('../utils/writer.js');
var RouteTypes = require('../service/RouteTypesService');

module.exports.routeTypes_GetRouteTypes = function routeTypes_GetRouteTypes (req, res, next, token, devid, signature) {
  RouteTypes.routeTypes_GetRouteTypes(token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
