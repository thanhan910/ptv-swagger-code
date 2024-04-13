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
 * The V3VehicleDescriptor model module.
 * @module model/V3VehicleDescriptor
 * @version v3
 */
export class V3VehicleDescriptor {
  /**
   * Constructs a new <code>V3VehicleDescriptor</code>.
   * @alias module:model/V3VehicleDescriptor
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>V3VehicleDescriptor</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/V3VehicleDescriptor} obj Optional instance to populate.
   * @return {module:model/V3VehicleDescriptor} The populated <code>V3VehicleDescriptor</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new V3VehicleDescriptor();
      if (data.hasOwnProperty('operator'))
        obj.operator = ApiClient.convertToType(data['operator'], 'String');
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'String');
      if (data.hasOwnProperty('low_floor'))
        obj.lowFloor = ApiClient.convertToType(data['low_floor'], 'Boolean');
      if (data.hasOwnProperty('air_conditioned'))
        obj.airConditioned = ApiClient.convertToType(data['air_conditioned'], 'Boolean');
      if (data.hasOwnProperty('description'))
        obj.description = ApiClient.convertToType(data['description'], 'String');
      if (data.hasOwnProperty('supplier'))
        obj.supplier = ApiClient.convertToType(data['supplier'], 'String');
      if (data.hasOwnProperty('length'))
        obj.length = ApiClient.convertToType(data['length'], 'String');
    }
    return obj;
  }
}

/**
 * Operator name of the vehicle such as \"Metro Trains Melbourne\", \"Yarra Trams\", \"Ventura Bus Line\", \"CDC\" or \"Sita Bus Lines\" . May be null/empty.  Only available for train, tram, v/line and some bus runs.
 * @member {String} operator
 */
V3VehicleDescriptor.prototype.operator = undefined;

/**
 * Operator identifier of the vehicle such as \"26094\". May be null/empty. Only available for some tram and bus runs.
 * @member {String} id
 */
V3VehicleDescriptor.prototype.id = undefined;

/**
 * Indicator if vehicle has a low floor. May be null. Only available for some tram runs.
 * @member {Boolean} lowFloor
 */
V3VehicleDescriptor.prototype.lowFloor = undefined;

/**
 * Indicator if vehicle is air conditioned. May be null. Only available for some tram runs.
 * @member {Boolean} airConditioned
 */
V3VehicleDescriptor.prototype.airConditioned = undefined;

/**
 * Vehicle description such as \"6 Car Comeng\", \"6 Car Xtrapolis\", \"3 Car Comeng\", \"6 Car Siemens\", \"3 Car Siemens\". May be null/empty.  Only available for some metropolitan train runs.
 * @member {String} description
 */
V3VehicleDescriptor.prototype.description = undefined;

/**
 * Supplier of vehicle descriptor data.
 * @member {String} supplier
 */
V3VehicleDescriptor.prototype.supplier = undefined;

/**
 * The length of the vehicle. Applies to CIS - Metro Trains
 * @member {String} length
 */
V3VehicleDescriptor.prototype.length = undefined;

