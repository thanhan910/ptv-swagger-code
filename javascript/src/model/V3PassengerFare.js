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
import {ApiClient} from '../ApiClient';

/**
 * The V3PassengerFare model module.
 * @module model/V3PassengerFare
 * @version v3
 */
export class V3PassengerFare {
  /**
   * Constructs a new <code>V3PassengerFare</code>.
   * @alias module:model/V3PassengerFare
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>V3PassengerFare</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/V3PassengerFare} obj Optional instance to populate.
   * @return {module:model/V3PassengerFare} The populated <code>V3PassengerFare</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new V3PassengerFare();
      if (data.hasOwnProperty('PassengerType'))
        obj.passengerType = ApiClient.convertToType(data['PassengerType'], 'String');
      if (data.hasOwnProperty('Fare2HourPeak'))
        obj.fare2HourPeak = ApiClient.convertToType(data['Fare2HourPeak'], 'Number');
      if (data.hasOwnProperty('Fare2HourOffPeak'))
        obj.fare2HourOffPeak = ApiClient.convertToType(data['Fare2HourOffPeak'], 'Number');
      if (data.hasOwnProperty('FareDailyPeak'))
        obj.fareDailyPeak = ApiClient.convertToType(data['FareDailyPeak'], 'Number');
      if (data.hasOwnProperty('FareDailyOffPeak'))
        obj.fareDailyOffPeak = ApiClient.convertToType(data['FareDailyOffPeak'], 'Number');
      if (data.hasOwnProperty('Pass7Days'))
        obj.pass7Days = ApiClient.convertToType(data['Pass7Days'], 'Number');
      if (data.hasOwnProperty('Pass28To69DayPerDay'))
        obj.pass28To69DayPerDay = ApiClient.convertToType(data['Pass28To69DayPerDay'], 'Number');
      if (data.hasOwnProperty('Pass70PlusDayPerDay'))
        obj.pass70PlusDayPerDay = ApiClient.convertToType(data['Pass70PlusDayPerDay'], 'Number');
      if (data.hasOwnProperty('WeekendCap'))
        obj.weekendCap = ApiClient.convertToType(data['WeekendCap'], 'Number');
      if (data.hasOwnProperty('HolidayCap'))
        obj.holidayCap = ApiClient.convertToType(data['HolidayCap'], 'Number');
    }
    return obj;
  }
}

/**
 * @member {String} passengerType
 */
V3PassengerFare.prototype.passengerType = undefined;

/**
 * @member {Number} fare2HourPeak
 */
V3PassengerFare.prototype.fare2HourPeak = undefined;

/**
 * @member {Number} fare2HourOffPeak
 */
V3PassengerFare.prototype.fare2HourOffPeak = undefined;

/**
 * @member {Number} fareDailyPeak
 */
V3PassengerFare.prototype.fareDailyPeak = undefined;

/**
 * @member {Number} fareDailyOffPeak
 */
V3PassengerFare.prototype.fareDailyOffPeak = undefined;

/**
 * @member {Number} pass7Days
 */
V3PassengerFare.prototype.pass7Days = undefined;

/**
 * @member {Number} pass28To69DayPerDay
 */
V3PassengerFare.prototype.pass28To69DayPerDay = undefined;

/**
 * @member {Number} pass70PlusDayPerDay
 */
V3PassengerFare.prototype.pass70PlusDayPerDay = undefined;

/**
 * @member {Number} weekendCap
 */
V3PassengerFare.prototype.weekendCap = undefined;

/**
 * @member {Number} holidayCap
 */
V3PassengerFare.prototype.holidayCap = undefined;

