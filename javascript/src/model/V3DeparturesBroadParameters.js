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
 * The V3DeparturesBroadParameters model module.
 * @module model/V3DeparturesBroadParameters
 * @version v3
 */
export class V3DeparturesBroadParameters {
  /**
   * Constructs a new <code>V3DeparturesBroadParameters</code>.
   * @alias module:model/V3DeparturesBroadParameters
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>V3DeparturesBroadParameters</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/V3DeparturesBroadParameters} obj Optional instance to populate.
   * @return {module:model/V3DeparturesBroadParameters} The populated <code>V3DeparturesBroadParameters</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new V3DeparturesBroadParameters();
      if (data.hasOwnProperty('platform_numbers'))
        obj.platformNumbers = ApiClient.convertToType(data['platform_numbers'], ['Number']);
      if (data.hasOwnProperty('direction_id'))
        obj.directionId = ApiClient.convertToType(data['direction_id'], 'Number');
      if (data.hasOwnProperty('gtfs'))
        obj.gtfs = ApiClient.convertToType(data['gtfs'], 'Boolean');
      if (data.hasOwnProperty('date_utc'))
        obj.dateUtc = ApiClient.convertToType(data['date_utc'], 'Date');
      if (data.hasOwnProperty('max_results'))
        obj.maxResults = ApiClient.convertToType(data['max_results'], 'Number');
      if (data.hasOwnProperty('include_cancelled'))
        obj.includeCancelled = ApiClient.convertToType(data['include_cancelled'], 'Boolean');
      if (data.hasOwnProperty('look_backwards'))
        obj.lookBackwards = ApiClient.convertToType(data['look_backwards'], 'Boolean');
      if (data.hasOwnProperty('expand'))
        obj.expand = ApiClient.convertToType(data['expand'], ['String']);
      if (data.hasOwnProperty('include_geopath'))
        obj.includeGeopath = ApiClient.convertToType(data['include_geopath'], 'Boolean');
    }
    return obj;
  }
}

/**
 * Filter by platform number at stop
 * @member {Array.<Number>} platformNumbers
 */
V3DeparturesBroadParameters.prototype.platformNumbers = undefined;

/**
 * Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
 * @member {Number} directionId
 */
V3DeparturesBroadParameters.prototype.directionId = undefined;

/**
 * Indicates that stop_id parameter will accept \"GTFS stop_id\" data
 * @member {Boolean} gtfs
 */
V3DeparturesBroadParameters.prototype.gtfs = undefined;

/**
 * Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
 * @member {Date} dateUtc
 */
V3DeparturesBroadParameters.prototype.dateUtc = undefined;

/**
 * Maximum number of results returned
 * @member {Number} maxResults
 */
V3DeparturesBroadParameters.prototype.maxResults = undefined;

/**
 * Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
 * @member {Boolean} includeCancelled
 */
V3DeparturesBroadParameters.prototype.includeCancelled = undefined;

/**
 * Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
 * @member {Boolean} lookBackwards
 */
V3DeparturesBroadParameters.prototype.lookBackwards = undefined;

/**
 * Allowed values for the <code>expand</code> property.
 * @enum {String}
 * @readonly
 */
V3DeparturesBroadParameters.ExpandEnum = {
  /**
   * value: "All"
   * @const
   */
  all: "All",

  /**
   * value: "Stop"
   * @const
   */
  stop: "Stop",

  /**
   * value: "Route"
   * @const
   */
  route: "Route",

  /**
   * value: "Run"
   * @const
   */
  run: "Run",

  /**
   * value: "Direction"
   * @const
   */
  direction: "Direction",

  /**
   * value: "Disruption"
   * @const
   */
  disruption: "Disruption",

  /**
   * value: "VehicleDescriptor"
   * @const
   */
  vehicleDescriptor: "VehicleDescriptor",

  /**
   * value: "VehiclePosition"
   * @const
   */
  vehiclePosition: "VehiclePosition",

  /**
   * value: "None"
   * @const
   */
  none: "None"
};
/**
 * List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
 * @member {Array.<module:model/V3DeparturesBroadParameters.ExpandEnum>} expand
 */
V3DeparturesBroadParameters.prototype.expand = undefined;

/**
 * Indicates if the route geopath should be returned
 * @member {Boolean} includeGeopath
 */
V3DeparturesBroadParameters.prototype.includeGeopath = undefined;

