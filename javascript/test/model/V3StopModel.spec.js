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
    describe('V3StopModel', function() {
      beforeEach(function() {
        instance = new PtvTimetableApiVersion3.V3StopModel();
      });

      it('should create an instance of V3StopModel', function() {
        // TODO: update the code to test V3StopModel
        expect(instance).to.be.a(PtvTimetableApiVersion3.V3StopModel);
      });

      it('should have the property stopDistance (base name: "stop_distance")', function() {
        // TODO: update the code to test the property stopDistance
        expect(instance).to.have.property('stopDistance');
        // expect(instance.stopDistance).to.be(expectedValueLiteral);
      });

      it('should have the property stopSuburb (base name: "stop_suburb")', function() {
        // TODO: update the code to test the property stopSuburb
        expect(instance).to.have.property('stopSuburb');
        // expect(instance.stopSuburb).to.be(expectedValueLiteral);
      });

      it('should have the property stopName (base name: "stop_name")', function() {
        // TODO: update the code to test the property stopName
        expect(instance).to.have.property('stopName');
        // expect(instance.stopName).to.be(expectedValueLiteral);
      });

      it('should have the property stopId (base name: "stop_id")', function() {
        // TODO: update the code to test the property stopId
        expect(instance).to.have.property('stopId');
        // expect(instance.stopId).to.be(expectedValueLiteral);
      });

      it('should have the property routeType (base name: "route_type")', function() {
        // TODO: update the code to test the property routeType
        expect(instance).to.have.property('routeType');
        // expect(instance.routeType).to.be(expectedValueLiteral);
      });

      it('should have the property stopLatitude (base name: "stop_latitude")', function() {
        // TODO: update the code to test the property stopLatitude
        expect(instance).to.have.property('stopLatitude');
        // expect(instance.stopLatitude).to.be(expectedValueLiteral);
      });

      it('should have the property stopLongitude (base name: "stop_longitude")', function() {
        // TODO: update the code to test the property stopLongitude
        expect(instance).to.have.property('stopLongitude');
        // expect(instance.stopLongitude).to.be(expectedValueLiteral);
      });

      it('should have the property stopLandmark (base name: "stop_landmark")', function() {
        // TODO: update the code to test the property stopLandmark
        expect(instance).to.have.property('stopLandmark');
        // expect(instance.stopLandmark).to.be(expectedValueLiteral);
      });

      it('should have the property stopSequence (base name: "stop_sequence")', function() {
        // TODO: update the code to test the property stopSequence
        expect(instance).to.have.property('stopSequence');
        // expect(instance.stopSequence).to.be(expectedValueLiteral);
      });

    });
  });

}));
