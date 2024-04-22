/* tslint:disable */
/* eslint-disable */
/**
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria\'s public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { V3StopGps } from './V3StopGps';
import {
    V3StopGpsFromJSON,
    V3StopGpsFromJSONTyped,
    V3StopGpsToJSON,
} from './V3StopGps';

/**
 * 
 * @export
 * @interface V3StopLocation
 */
export interface V3StopLocation {
    /**
     * 
     * @type {V3StopGps}
     * @memberof V3StopLocation
     */
    gps?: V3StopGps;
}

/**
 * Check if a given object implements the V3StopLocation interface.
 */
export function instanceOfV3StopLocation(value: object): boolean {
    return true;
}

export function V3StopLocationFromJSON(json: any): V3StopLocation {
    return V3StopLocationFromJSONTyped(json, false);
}

export function V3StopLocationFromJSONTyped(json: any, ignoreDiscriminator: boolean): V3StopLocation {
    if (json == null) {
        return json;
    }
    return {
        
        'gps': json['gps'] == null ? undefined : V3StopGpsFromJSON(json['gps']),
    };
}

export function V3StopLocationToJSON(value?: V3StopLocation | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'gps': V3StopGpsToJSON(value['gps']),
    };
}

