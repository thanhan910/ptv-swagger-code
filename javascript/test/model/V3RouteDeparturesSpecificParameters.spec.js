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
    describe('V3RouteDeparturesSpecificParameters', function() {
      beforeEach(function() {
        instance = new PtvTimetableApiVersion3.V3RouteDeparturesSpecificParameters();
      });

      it('should create an instance of V3RouteDeparturesSpecificParameters', function() {
        // TODO: update the code to test V3RouteDeparturesSpecificParameters
        expect(instance).to.be.a(PtvTimetableApiVersion3.V3RouteDeparturesSpecificParameters);
      });

      it('should have the property trainScheduledTimetables (base name: "train_scheduled_timetables")', function() {
        // TODO: update the code to test the property trainScheduledTimetables
        expect(instance).to.have.property('trainScheduledTimetables');
        // expect(instance.trainScheduledTimetables).to.be(expectedValueLiteral);
      });

      it('should have the property scheduledTimetables (base name: "scheduled_timetables")', function() {
        // TODO: update the code to test the property scheduledTimetables
        expect(instance).to.have.property('scheduledTimetables');
        // expect(instance.scheduledTimetables).to.be(expectedValueLiteral);
      });

      it('should have the property dateUtc (base name: "date_utc")', function() {
        // TODO: update the code to test the property dateUtc
        expect(instance).to.have.property('dateUtc');
        // expect(instance.dateUtc).to.be(expectedValueLiteral);
      });

      it('should have the property maxResults (base name: "max_results")', function() {
        // TODO: update the code to test the property maxResults
        expect(instance).to.have.property('maxResults');
        // expect(instance.maxResults).to.be(expectedValueLiteral);
      });

      it('should have the property includeCancelled (base name: "include_cancelled")', function() {
        // TODO: update the code to test the property includeCancelled
        expect(instance).to.have.property('includeCancelled');
        // expect(instance.includeCancelled).to.be(expectedValueLiteral);
      });

      it('should have the property lookBackwards (base name: "look_backwards")', function() {
        // TODO: update the code to test the property lookBackwards
        expect(instance).to.have.property('lookBackwards');
        // expect(instance.lookBackwards).to.be(expectedValueLiteral);
      });

      it('should have the property expand (base name: "expand")', function() {
        // TODO: update the code to test the property expand
        expect(instance).to.have.property('expand');
        // expect(instance.expand).to.be(expectedValueLiteral);
      });

      it('should have the property includeGeopath (base name: "include_geopath")', function() {
        // TODO: update the code to test the property includeGeopath
        expect(instance).to.have.property('includeGeopath');
        // expect(instance.includeGeopath).to.be(expectedValueLiteral);
      });

    });
  });

}));
