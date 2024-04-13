'use strict';

var utils = require('../utils/writer.js');
var Outlets = require('../service/OutletsService');

module.exports.outlets_GetAllOutlets = function outlets_GetAllOutlets (req, res, next, max_results, token, devid, signature) {
  Outlets.outlets_GetAllOutlets(max_results, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.outlets_GetOutletsByGeolocation = function outlets_GetOutletsByGeolocation (req, res, next, latitude, longitude, max_distance, max_results, token, devid, signature) {
  Outlets.outlets_GetOutletsByGeolocation(latitude, longitude, max_distance, max_results, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
