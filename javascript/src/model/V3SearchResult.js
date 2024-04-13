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
import {V3ResultOutlet} from './V3ResultOutlet';
import {V3ResultRoute} from './V3ResultRoute';
import {V3ResultStop} from './V3ResultStop';
import {V3Status} from './V3Status';

/**
 * The V3SearchResult model module.
 * @module model/V3SearchResult
 * @version v3
 */
export class V3SearchResult {
  /**
   * Constructs a new <code>V3SearchResult</code>.
   * @alias module:model/V3SearchResult
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>V3SearchResult</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/V3SearchResult} obj Optional instance to populate.
   * @return {module:model/V3SearchResult} The populated <code>V3SearchResult</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new V3SearchResult();
      if (data.hasOwnProperty('stops'))
        obj.stops = ApiClient.convertToType(data['stops'], [V3ResultStop]);
      if (data.hasOwnProperty('routes'))
        obj.routes = ApiClient.convertToType(data['routes'], [V3ResultRoute]);
      if (data.hasOwnProperty('outlets'))
        obj.outlets = ApiClient.convertToType(data['outlets'], [V3ResultOutlet]);
      if (data.hasOwnProperty('status'))
        obj.status = V3Status.constructFromObject(data['status']);
    }
    return obj;
  }
}

/**
 * Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
 * @member {Array.<module:model/V3ResultStop>} stops
 */
V3SearchResult.prototype.stops = undefined;

/**
 * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
 * @member {Array.<module:model/V3ResultRoute>} routes
 */
V3SearchResult.prototype.routes = undefined;

/**
 * myki ticket outlets
 * @member {Array.<module:model/V3ResultOutlet>} outlets
 */
V3SearchResult.prototype.outlets = undefined;

/**
 * @member {module:model/V3Status} status
 */
V3SearchResult.prototype.status = undefined;

