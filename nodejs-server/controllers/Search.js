'use strict';

var utils = require('../utils/writer.js');
var Search = require('../service/SearchService');

module.exports.search_Search = function search_Search (req, res, next, search_term, route_types, latitude, longitude, max_distance, include_addresses, include_outlets, match_stop_by_suburb, match_route_by_suburb, match_stop_by_gtfs_stop_id, token, devid, signature) {
  Search.search_Search(search_term, route_types, latitude, longitude, max_distance, include_addresses, include_outlets, match_stop_by_suburb, match_route_by_suburb, match_stop_by_gtfs_stop_id, token, devid, signature)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
