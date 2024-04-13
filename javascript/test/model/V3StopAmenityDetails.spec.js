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
    describe('V3StopAmenityDetails', function() {
      beforeEach(function() {
        instance = new PtvTimetableApiVersion3.V3StopAmenityDetails();
      });

      it('should create an instance of V3StopAmenityDetails', function() {
        // TODO: update the code to test V3StopAmenityDetails
        expect(instance).to.be.a(PtvTimetableApiVersion3.V3StopAmenityDetails);
      });

      it('should have the property toilet (base name: "toilet")', function() {
        // TODO: update the code to test the property toilet
        expect(instance).to.have.property('toilet');
        // expect(instance.toilet).to.be(expectedValueLiteral);
      });

      it('should have the property taxiRank (base name: "taxi_rank")', function() {
        // TODO: update the code to test the property taxiRank
        expect(instance).to.have.property('taxiRank');
        // expect(instance.taxiRank).to.be(expectedValueLiteral);
      });

      it('should have the property carParking (base name: "car_parking")', function() {
        // TODO: update the code to test the property carParking
        expect(instance).to.have.property('carParking');
        // expect(instance.carParking).to.be(expectedValueLiteral);
      });

      it('should have the property cctv (base name: "cctv")', function() {
        // TODO: update the code to test the property cctv
        expect(instance).to.have.property('cctv');
        // expect(instance.cctv).to.be(expectedValueLiteral);
      });

    });
  });

}));
