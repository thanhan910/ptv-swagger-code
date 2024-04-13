/*
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.52
 *
 * Do not edit the class manually.
 *
 */
(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.PtvTimetableApiVersion3);
  }
}(this, function(expect, PtvTimetableApiVersion3) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('V3SearchParameters', function() {
      beforeEach(function() {
        instance = new PtvTimetableApiVersion3.V3SearchParameters();
      });

      it('should create an instance of V3SearchParameters', function() {
        // TODO: update the code to test V3SearchParameters
        expect(instance).to.be.a(PtvTimetableApiVersion3.V3SearchParameters);
      });

      it('should have the property routeTypes (base name: "route_types")', function() {
        // TODO: update the code to test the property routeTypes
        expect(instance).to.have.property('routeTypes');
        // expect(instance.routeTypes).to.be(expectedValueLiteral);
      });

      it('should have the property latitude (base name: "latitude")', function() {
        // TODO: update the code to test the property latitude
        expect(instance).to.have.property('latitude');
        // expect(instance.latitude).to.be(expectedValueLiteral);
      });

      it('should have the property longitude (base name: "longitude")', function() {
        // TODO: update the code to test the property longitude
        expect(instance).to.have.property('longitude');
        // expect(instance.longitude).to.be(expectedValueLiteral);
      });

      it('should have the property maxDistance (base name: "max_distance")', function() {
        // TODO: update the code to test the property maxDistance
        expect(instance).to.have.property('maxDistance');
        // expect(instance.maxDistance).to.be(expectedValueLiteral);
      });

      it('should have the property includeAddresses (base name: "include_addresses")', function() {
        // TODO: update the code to test the property includeAddresses
        expect(instance).to.have.property('includeAddresses');
        // expect(instance.includeAddresses).to.be(expectedValueLiteral);
      });

      it('should have the property includeOutlets (base name: "include_outlets")', function() {
        // TODO: update the code to test the property includeOutlets
        expect(instance).to.have.property('includeOutlets');
        // expect(instance.includeOutlets).to.be(expectedValueLiteral);
      });

      it('should have the property matchStopBySuburb (base name: "match_stop_by_suburb")', function() {
        // TODO: update the code to test the property matchStopBySuburb
        expect(instance).to.have.property('matchStopBySuburb');
        // expect(instance.matchStopBySuburb).to.be(expectedValueLiteral);
      });

      it('should have the property matchRouteBySuburb (base name: "match_route_by_suburb")', function() {
        // TODO: update the code to test the property matchRouteBySuburb
        expect(instance).to.have.property('matchRouteBySuburb');
        // expect(instance.matchRouteBySuburb).to.be(expectedValueLiteral);
      });

      it('should have the property matchStopByGtfsStopId (base name: "match_stop_by_gtfs_stop_id")', function() {
        // TODO: update the code to test the property matchStopByGtfsStopId
        expect(instance).to.have.property('matchStopByGtfsStopId');
        // expect(instance.matchStopByGtfsStopId).to.be(expectedValueLiteral);
      });

    });
  });

}));
