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
 * The V3StopAccessibilityWheelchair model module.
 * @module model/V3StopAccessibilityWheelchair
 * @version v3
 */
export class V3StopAccessibilityWheelchair {
  /**
   * Constructs a new <code>V3StopAccessibilityWheelchair</code>.
   * @alias module:model/V3StopAccessibilityWheelchair
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>V3StopAccessibilityWheelchair</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/V3StopAccessibilityWheelchair} obj Optional instance to populate.
   * @return {module:model/V3StopAccessibilityWheelchair} The populated <code>V3StopAccessibilityWheelchair</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new V3StopAccessibilityWheelchair();
      if (data.hasOwnProperty('accessible_ramp'))
        obj.accessibleRamp = ApiClient.convertToType(data['accessible_ramp'], 'Boolean');
      if (data.hasOwnProperty('parking'))
        obj.parking = ApiClient.convertToType(data['parking'], 'Boolean');
      if (data.hasOwnProperty('telephone'))
        obj.telephone = ApiClient.convertToType(data['telephone'], 'Boolean');
      if (data.hasOwnProperty('toilet'))
        obj.toilet = ApiClient.convertToType(data['toilet'], 'Boolean');
      if (data.hasOwnProperty('low_ticket_counter'))
        obj.lowTicketCounter = ApiClient.convertToType(data['low_ticket_counter'], 'Boolean');
      if (data.hasOwnProperty('manouvering'))
        obj.manouvering = ApiClient.convertToType(data['manouvering'], 'Boolean');
      if (data.hasOwnProperty('raised_platform'))
        obj.raisedPlatform = ApiClient.convertToType(data['raised_platform'], 'Boolean');
      if (data.hasOwnProperty('ramp'))
        obj.ramp = ApiClient.convertToType(data['ramp'], 'Boolean');
      if (data.hasOwnProperty('secondary_path'))
        obj.secondaryPath = ApiClient.convertToType(data['secondary_path'], 'Boolean');
      if (data.hasOwnProperty('raised_platform_shelther'))
        obj.raisedPlatformShelther = ApiClient.convertToType(data['raised_platform_shelther'], 'Boolean');
      if (data.hasOwnProperty('steep_ramp'))
        obj.steepRamp = ApiClient.convertToType(data['steep_ramp'], 'Boolean');
    }
    return obj;
  }
}

/**
 * @member {Boolean} accessibleRamp
 */
V3StopAccessibilityWheelchair.prototype.accessibleRamp = undefined;

/**
 * Indicates if there is at least one accessible parking spot at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
 * @member {Boolean} parking
 */
V3StopAccessibilityWheelchair.prototype.parking = undefined;

/**
 * Indicates if there is at least one accessible telephone at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
 * @member {Boolean} telephone
 */
V3StopAccessibilityWheelchair.prototype.telephone = undefined;

/**
 * Indicates if there is at least one accessible toilet at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
 * @member {Boolean} toilet
 */
V3StopAccessibilityWheelchair.prototype.toilet = undefined;

/**
 * Indicates if there is at least one low ticket counter at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
 * @member {Boolean} lowTicketCounter
 */
V3StopAccessibilityWheelchair.prototype.lowTicketCounter = undefined;

/**
 * Indicates if there is a space for mobility device to board on or off a transport mode
 * @member {Boolean} manouvering
 */
V3StopAccessibilityWheelchair.prototype.manouvering = undefined;

/**
 * Indicates if there is a raised platform to board a train
 * @member {Boolean} raisedPlatform
 */
V3StopAccessibilityWheelchair.prototype.raisedPlatform = undefined;

/**
 * Indicates if there are ramps (&lt;1:14) at the stop/platform
 * @member {Boolean} ramp
 */
V3StopAccessibilityWheelchair.prototype.ramp = undefined;

/**
 * Indicates if there is a path beyond the stop which is accessible
 * @member {Boolean} secondaryPath
 */
V3StopAccessibilityWheelchair.prototype.secondaryPath = undefined;

/**
 * Indicates if there is shelter near the raised platform
 * @member {Boolean} raisedPlatformShelther
 */
V3StopAccessibilityWheelchair.prototype.raisedPlatformShelther = undefined;

/**
 * Indicates if there are ramps (&gt;1:14) at the stop/platform
 * @member {Boolean} steepRamp
 */
V3StopAccessibilityWheelchair.prototype.steepRamp = undefined;

