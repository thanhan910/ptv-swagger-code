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
import {V3StopAccessibility} from './V3StopAccessibility';
import {V3StopAmenityDetails} from './V3StopAmenityDetails';
import {V3StopLocation} from './V3StopLocation';
import {V3StopStaffing} from './V3StopStaffing';

/**
 * The V3StopDetails model module.
 * @module model/V3StopDetails
 * @version v3
 */
export class V3StopDetails {
  /**
   * Constructs a new <code>V3StopDetails</code>.
   * @alias module:model/V3StopDetails
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>V3StopDetails</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/V3StopDetails} obj Optional instance to populate.
   * @return {module:model/V3StopDetails} The populated <code>V3StopDetails</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new V3StopDetails();
      if (data.hasOwnProperty('disruption_ids'))
        obj.disruptionIds = ApiClient.convertToType(data['disruption_ids'], ['Number']);
      if (data.hasOwnProperty('station_type'))
        obj.stationType = ApiClient.convertToType(data['station_type'], 'String');
      if (data.hasOwnProperty('station_description'))
        obj.stationDescription = ApiClient.convertToType(data['station_description'], 'String');
      if (data.hasOwnProperty('route_type'))
        obj.routeType = ApiClient.convertToType(data['route_type'], 'Number');
      if (data.hasOwnProperty('stop_location'))
        obj.stopLocation = V3StopLocation.constructFromObject(data['stop_location']);
      if (data.hasOwnProperty('stop_amenities'))
        obj.stopAmenities = V3StopAmenityDetails.constructFromObject(data['stop_amenities']);
      if (data.hasOwnProperty('stop_accessibility'))
        obj.stopAccessibility = V3StopAccessibility.constructFromObject(data['stop_accessibility']);
      if (data.hasOwnProperty('stop_staffing'))
        obj.stopStaffing = V3StopStaffing.constructFromObject(data['stop_staffing']);
      if (data.hasOwnProperty('routes'))
        obj.routes = ApiClient.convertToType(data['routes'], [Object]);
      if (data.hasOwnProperty('stop_id'))
        obj.stopId = ApiClient.convertToType(data['stop_id'], 'Number');
      if (data.hasOwnProperty('stop_name'))
        obj.stopName = ApiClient.convertToType(data['stop_name'], 'String');
      if (data.hasOwnProperty('stop_landmark'))
        obj.stopLandmark = ApiClient.convertToType(data['stop_landmark'], 'String');
    }
    return obj;
  }
}

/**
 * Disruption information identifier(s)
 * @member {Array.<Number>} disruptionIds
 */
V3StopDetails.prototype.disruptionIds = undefined;

/**
 * Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train
 * @member {String} stationType
 */
V3StopDetails.prototype.stationType = undefined;

/**
 * The definition applicable to the station_type; returns null for V/Line train
 * @member {String} stationDescription
 */
V3StopDetails.prototype.stationDescription = undefined;

/**
 * Transport mode identifier
 * @member {Number} routeType
 */
V3StopDetails.prototype.routeType = undefined;

/**
 * @member {module:model/V3StopLocation} stopLocation
 */
V3StopDetails.prototype.stopLocation = undefined;

/**
 * @member {module:model/V3StopAmenityDetails} stopAmenities
 */
V3StopDetails.prototype.stopAmenities = undefined;

/**
 * @member {module:model/V3StopAccessibility} stopAccessibility
 */
V3StopDetails.prototype.stopAccessibility = undefined;

/**
 * @member {module:model/V3StopStaffing} stopStaffing
 */
V3StopDetails.prototype.stopStaffing = undefined;

/**
 * Routes travelling through the stop
 * @member {Array.<Object>} routes
 */
V3StopDetails.prototype.routes = undefined;

/**
 * Stop identifier
 * @member {Number} stopId
 */
V3StopDetails.prototype.stopId = undefined;

/**
 * Name of stop
 * @member {String} stopName
 */
V3StopDetails.prototype.stopName = undefined;

/**
 * Landmark in proximity of stop
 * @member {String} stopLandmark
 */
V3StopDetails.prototype.stopLandmark = undefined;

