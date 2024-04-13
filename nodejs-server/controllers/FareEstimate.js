'use strict';

var utils = require('../utils/writer.js');
var FareEstimate = require('../service/FareEstimateService');

module.exports.fareEstimate_GetFareEstimateByZone = function fareEstimate_GetFareEstimateByZone (req, res, next, minZone, maxZone, journey_touch_on_utc, journey_touch_off_utc, is_journey_in_free_tram_zone, travelled_route_types, token, devid, signature) {
  FareEstimate.fareEstimate_GetFareEstimateByZone(minZone, maxZone, journey_touch_on_utc, journey_touch_off_utc, is_journey_in_free_tram_zone, travelled_route_types, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
