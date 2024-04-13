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
    describe('V3OutletGeolocation', function() {
      beforeEach(function() {
        instance = new PtvTimetableApiVersion3.V3OutletGeolocation();
      });

      it('should create an instance of V3OutletGeolocation', function() {
        // TODO: update the code to test V3OutletGeolocation
        expect(instance).to.be.a(PtvTimetableApiVersion3.V3OutletGeolocation);
      });

      it('should have the property outletDistance (base name: "outlet_distance")', function() {
        // TODO: update the code to test the property outletDistance
        expect(instance).to.have.property('outletDistance');
        // expect(instance.outletDistance).to.be(expectedValueLiteral);
      });

      it('should have the property outletSlidSpid (base name: "outlet_slid_spid")', function() {
        // TODO: update the code to test the property outletSlidSpid
        expect(instance).to.have.property('outletSlidSpid');
        // expect(instance.outletSlidSpid).to.be(expectedValueLiteral);
      });

      it('should have the property outletName (base name: "outlet_name")', function() {
        // TODO: update the code to test the property outletName
        expect(instance).to.have.property('outletName');
        // expect(instance.outletName).to.be(expectedValueLiteral);
      });

      it('should have the property outletBusiness (base name: "outlet_business")', function() {
        // TODO: update the code to test the property outletBusiness
        expect(instance).to.have.property('outletBusiness');
        // expect(instance.outletBusiness).to.be(expectedValueLiteral);
      });

      it('should have the property outletLatitude (base name: "outlet_latitude")', function() {
        // TODO: update the code to test the property outletLatitude
        expect(instance).to.have.property('outletLatitude');
        // expect(instance.outletLatitude).to.be(expectedValueLiteral);
      });

      it('should have the property outletLongitude (base name: "outlet_longitude")', function() {
        // TODO: update the code to test the property outletLongitude
        expect(instance).to.have.property('outletLongitude');
        // expect(instance.outletLongitude).to.be(expectedValueLiteral);
      });

      it('should have the property outletSuburb (base name: "outlet_suburb")', function() {
        // TODO: update the code to test the property outletSuburb
        expect(instance).to.have.property('outletSuburb');
        // expect(instance.outletSuburb).to.be(expectedValueLiteral);
      });

      it('should have the property outletPostcode (base name: "outlet_postcode")', function() {
        // TODO: update the code to test the property outletPostcode
        expect(instance).to.have.property('outletPostcode');
        // expect(instance.outletPostcode).to.be(expectedValueLiteral);
      });

      it('should have the property outletBusinessHourMon (base name: "outlet_business_hour_mon")', function() {
        // TODO: update the code to test the property outletBusinessHourMon
        expect(instance).to.have.property('outletBusinessHourMon');
        // expect(instance.outletBusinessHourMon).to.be(expectedValueLiteral);
      });

      it('should have the property outletBusinessHourTue (base name: "outlet_business_hour_tue")', function() {
        // TODO: update the code to test the property outletBusinessHourTue
        expect(instance).to.have.property('outletBusinessHourTue');
        // expect(instance.outletBusinessHourTue).to.be(expectedValueLiteral);
      });

      it('should have the property outletBusinessHourWed (base name: "outlet_business_hour_wed")', function() {
        // TODO: update the code to test the property outletBusinessHourWed
        expect(instance).to.have.property('outletBusinessHourWed');
        // expect(instance.outletBusinessHourWed).to.be(expectedValueLiteral);
      });

      it('should have the property outletBusinessHourThur (base name: "outlet_business_hour_thur")', function() {
        // TODO: update the code to test the property outletBusinessHourThur
        expect(instance).to.have.property('outletBusinessHourThur');
        // expect(instance.outletBusinessHourThur).to.be(expectedValueLiteral);
      });

      it('should have the property outletBusinessHourFri (base name: "outlet_business_hour_fri")', function() {
        // TODO: update the code to test the property outletBusinessHourFri
        expect(instance).to.have.property('outletBusinessHourFri');
        // expect(instance.outletBusinessHourFri).to.be(expectedValueLiteral);
      });

      it('should have the property outletBusinessHourSat (base name: "outlet_business_hour_sat")', function() {
        // TODO: update the code to test the property outletBusinessHourSat
        expect(instance).to.have.property('outletBusinessHourSat');
        // expect(instance.outletBusinessHourSat).to.be(expectedValueLiteral);
      });

      it('should have the property outletBusinessHourSun (base name: "outlet_business_hour_sun")', function() {
        // TODO: update the code to test the property outletBusinessHourSun
        expect(instance).to.have.property('outletBusinessHourSun');
        // expect(instance.outletBusinessHourSun).to.be(expectedValueLiteral);
      });

      it('should have the property outletNotes (base name: "outlet_notes")', function() {
        // TODO: update the code to test the property outletNotes
        expect(instance).to.have.property('outletNotes');
        // expect(instance.outletNotes).to.be(expectedValueLiteral);
      });

    });
  });

}));
