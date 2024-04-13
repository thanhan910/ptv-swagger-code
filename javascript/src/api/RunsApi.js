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
import {ApiClient} from "../ApiClient";
import {V3ErrorResponse} from '../model/V3ErrorResponse';
import {V3RunResponse} from '../model/V3RunResponse';
import {V3RunsResponse} from '../model/V3RunsResponse';

/**
* Runs service.
* @module api/RunsApi
* @version v3
*/
export class RunsApi {

    /**
    * Constructs a new RunsApi. 
    * @alias module:api/RunsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the runsForRoute operation.
     * @callback moduleapi/RunsApi~runsForRouteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3RunsResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View all trip/service runs for a specific route ID
     * @param {Number} routeId Identifier of route; values returned by Routes API - v3/routes.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.expand List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
     * @param {Date} opts.dateUtc Date of the request. (optional - defaults to now)
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/RunsApi~runsForRouteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    runsForRoute(routeId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling runsForRoute");
      }

      let pathParams = {
        'route_id': routeId
      };
      let queryParams = {
        'expand': this.apiClient.buildCollectionParam(opts['expand'], 'multi'),'date_utc': opts['dateUtc'],'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3RunsResponse;

      return this.apiClient.callApi(
        '/v3/runs/route/{route_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the runsForRouteAndRouteType operation.
     * @callback moduleapi/RunsApi~runsForRouteAndRouteTypeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3RunsResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View all trip/service runs for a specific route ID and route type
     * @param {Number} routeId Identifier of route; values returned by Routes API - v3/routes.
     * @param {module:model/Number} routeType Number identifying transport mode; values returned via RouteTypes API
     * @param {Array.<module:model/String>} expand List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.
     * @param {Object} opts Optional parameters
     * @param {Date} opts.dateUtc Date of the request. (optional - defaults to now)
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/RunsApi~runsForRouteAndRouteTypeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    runsForRouteAndRouteType(routeId, routeType, expand, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling runsForRouteAndRouteType");
      }
      // verify the required parameter 'routeType' is set
      if (routeType === undefined || routeType === null) {
        throw new Error("Missing the required parameter 'routeType' when calling runsForRouteAndRouteType");
      }
      // verify the required parameter 'expand' is set
      if (expand === undefined || expand === null) {
        throw new Error("Missing the required parameter 'expand' when calling runsForRouteAndRouteType");
      }

      let pathParams = {
        'route_id': routeId,'route_type': routeType
      };
      let queryParams = {
        'expand': this.apiClient.buildCollectionParam(expand, 'multi'),'date_utc': opts['dateUtc'],'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3RunsResponse;

      return this.apiClient.callApi(
        '/v3/runs/route/{route_id}/route_type/{route_type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the runsForRun operation.
     * @callback moduleapi/RunsApi~runsForRunCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3RunsResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View all trip/service runs for a specific run_ref
     * @param {String} runRef The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
     * @param {Array.<module:model/String>} expand List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
     * @param {Object} opts Optional parameters
     * @param {Date} opts.dateUtc Date of the request. (optional - defaults to now)
     * @param {Boolean} opts.includeGeopath Indicates if geopath data will be returned (default &#x3D; false)
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/RunsApi~runsForRunCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    runsForRun(runRef, expand, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'runRef' is set
      if (runRef === undefined || runRef === null) {
        throw new Error("Missing the required parameter 'runRef' when calling runsForRun");
      }
      // verify the required parameter 'expand' is set
      if (expand === undefined || expand === null) {
        throw new Error("Missing the required parameter 'expand' when calling runsForRun");
      }

      let pathParams = {
        'run_ref': runRef
      };
      let queryParams = {
        'expand': this.apiClient.buildCollectionParam(expand, 'multi'),'date_utc': opts['dateUtc'],'include_geopath': opts['includeGeopath'],'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3RunsResponse;

      return this.apiClient.callApi(
        '/v3/runs/{run_ref}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the runsForRunAndRouteType operation.
     * @callback moduleapi/RunsApi~runsForRunAndRouteTypeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3RunResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View the trip/service run for a specific run_ref and route type
     * @param {String} runRef The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
     * @param {module:model/Number} routeType Number identifying transport mode; values returned via RouteTypes API
     * @param {Array.<module:model/String>} expand List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
     * @param {Object} opts Optional parameters
     * @param {Date} opts.dateUtc Date of the request. (optional - defaults to now)
     * @param {Boolean} opts.includeGeopath Indicates if geopath data will be returned (default &#x3D; false)
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/RunsApi~runsForRunAndRouteTypeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    runsForRunAndRouteType(runRef, routeType, expand, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'runRef' is set
      if (runRef === undefined || runRef === null) {
        throw new Error("Missing the required parameter 'runRef' when calling runsForRunAndRouteType");
      }
      // verify the required parameter 'routeType' is set
      if (routeType === undefined || routeType === null) {
        throw new Error("Missing the required parameter 'routeType' when calling runsForRunAndRouteType");
      }
      // verify the required parameter 'expand' is set
      if (expand === undefined || expand === null) {
        throw new Error("Missing the required parameter 'expand' when calling runsForRunAndRouteType");
      }

      let pathParams = {
        'run_ref': runRef,'route_type': routeType
      };
      let queryParams = {
        'expand': this.apiClient.buildCollectionParam(expand, 'multi'),'date_utc': opts['dateUtc'],'include_geopath': opts['includeGeopath'],'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3RunResponse;

      return this.apiClient.callApi(
        '/v3/runs/{run_ref}/route_type/{route_type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}