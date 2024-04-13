'use strict';

var utils = require('../utils/writer.js');
var Patterns = require('../service/PatternsService');

module.exports.patterns_GetPatternByRun = function patterns_GetPatternByRun (req, res, next, run_ref, route_type, expand, stop_id, date_utc, include_skipped_stops, include_geopath, token, devid, signature) {
  Patterns.patterns_GetPatternByRun(run_ref, route_type, expand, stop_id, date_utc, include_skipped_stops, include_geopath, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
