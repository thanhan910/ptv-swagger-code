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
import type { V3BulkDeparturesRouteDirectionResponse } from './V3BulkDeparturesRouteDirectionResponse';
import {
    V3BulkDeparturesRouteDirectionResponseFromJSON,
    V3BulkDeparturesRouteDirectionResponseFromJSONTyped,
    V3BulkDeparturesRouteDirectionResponseToJSON,
} from './V3BulkDeparturesRouteDirectionResponse';
import type { V3Departure } from './V3Departure';
import {
    V3DepartureFromJSON,
    V3DepartureFromJSONTyped,
    V3DepartureToJSON,
} from './V3Departure';

/**
 * 
 * @export
 * @interface V3BulkDeparturesUpdateResponse
 */
export interface V3BulkDeparturesUpdateResponse {
    /**
     * Timetabled and real-time service departures
     * @type {Array<V3Departure>}
     * @memberof V3BulkDeparturesUpdateResponse
     */
    departures?: Array<V3Departure>;
    /**
     * Transport mode identifier
     * @type {number}
     * @memberof V3BulkDeparturesUpdateResponse
     */
    routeType?: number;
    /**
     * Stop identifier
     * @type {number}
     * @memberof V3BulkDeparturesUpdateResponse
     */
    stopId?: number;
    /**
     * 
     * @type {V3BulkDeparturesRouteDirectionResponse}
     * @memberof V3BulkDeparturesUpdateResponse
     */
    requestedRouteDirection?: V3BulkDeparturesRouteDirectionResponse;
    /**
     * The status of the route direction (changed | unchanged).
     * If changed, requests should change the requested_route_direction for the route_direction supplied.
     * @type {number}
     * @memberof V3BulkDeparturesUpdateResponse
     */
    routeDirectionStatus?: V3BulkDeparturesUpdateResponseRouteDirectionStatusEnum;
    /**
     * 
     * @type {V3BulkDeparturesRouteDirectionResponse}
     * @memberof V3BulkDeparturesUpdateResponse
     */
    routeDirection?: V3BulkDeparturesRouteDirectionResponse;
}


/**
 * @export
 */
export const V3BulkDeparturesUpdateResponseRouteDirectionStatusEnum = {
    NUMBER_0: 0,
    NUMBER_1: 1
} as const;
export type V3BulkDeparturesUpdateResponseRouteDirectionStatusEnum = typeof V3BulkDeparturesUpdateResponseRouteDirectionStatusEnum[keyof typeof V3BulkDeparturesUpdateResponseRouteDirectionStatusEnum];


/**
 * Check if a given object implements the V3BulkDeparturesUpdateResponse interface.
 */
export function instanceOfV3BulkDeparturesUpdateResponse(value: object): boolean {
    return true;
}

export function V3BulkDeparturesUpdateResponseFromJSON(json: any): V3BulkDeparturesUpdateResponse {
    return V3BulkDeparturesUpdateResponseFromJSONTyped(json, false);
}

export function V3BulkDeparturesUpdateResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): V3BulkDeparturesUpdateResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'departures': json['departures'] == null ? undefined : ((json['departures'] as Array<any>).map(V3DepartureFromJSON)),
        'routeType': json['route_type'] == null ? undefined : json['route_type'],
        'stopId': json['stop_id'] == null ? undefined : json['stop_id'],
        'requestedRouteDirection': json['requested_route_direction'] == null ? undefined : V3BulkDeparturesRouteDirectionResponseFromJSON(json['requested_route_direction']),
        'routeDirectionStatus': json['route_direction_status'] == null ? undefined : json['route_direction_status'],
        'routeDirection': json['route_direction'] == null ? undefined : V3BulkDeparturesRouteDirectionResponseFromJSON(json['route_direction']),
    };
}

export function V3BulkDeparturesUpdateResponseToJSON(value?: V3BulkDeparturesUpdateResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'departures': value['departures'] == null ? undefined : ((value['departures'] as Array<any>).map(V3DepartureToJSON)),
        'route_type': value['routeType'],
        'stop_id': value['stopId'],
        'requested_route_direction': V3BulkDeparturesRouteDirectionResponseToJSON(value['requestedRouteDirection']),
        'route_direction_status': value['routeDirectionStatus'],
        'route_direction': V3BulkDeparturesRouteDirectionResponseToJSON(value['routeDirection']),
    };
}
