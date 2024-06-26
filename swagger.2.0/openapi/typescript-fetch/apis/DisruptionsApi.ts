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


import * as runtime from '../runtime';
import type {
  V3DisruptionModesResponse,
  V3DisruptionResponse,
  V3DisruptionsResponse,
  V3ErrorResponse,
} from '../models/index';
import {
    V3DisruptionModesResponseFromJSON,
    V3DisruptionModesResponseToJSON,
    V3DisruptionResponseFromJSON,
    V3DisruptionResponseToJSON,
    V3DisruptionsResponseFromJSON,
    V3DisruptionsResponseToJSON,
    V3ErrorResponseFromJSON,
    V3ErrorResponseToJSON,
} from '../models/index';

export interface DisruptionsGetAllDisruptionsRequest {
    routeTypes?: Array<DisruptionsGetAllDisruptionsRouteTypesEnum>;
    disruptionModes?: Array<DisruptionsGetAllDisruptionsDisruptionModesEnum>;
    disruptionStatus?: DisruptionsGetAllDisruptionsDisruptionStatusEnum;
    token?: string;
    devid?: string;
    signature?: string;
}

export interface DisruptionsGetDisruptionByIdRequest {
    disruptionId: number;
    token?: string;
    devid?: string;
    signature?: string;
}

export interface DisruptionsGetDisruptionModesRequest {
    token?: string;
    devid?: string;
    signature?: string;
}

export interface DisruptionsGetDisruptionsByRouteRequest {
    routeId: number;
    disruptionStatus?: DisruptionsGetDisruptionsByRouteDisruptionStatusEnum;
    token?: string;
    devid?: string;
    signature?: string;
}

export interface DisruptionsGetDisruptionsByRouteAndStopRequest {
    routeId: number;
    stopId: number;
    disruptionStatus?: DisruptionsGetDisruptionsByRouteAndStopDisruptionStatusEnum;
    token?: string;
    devid?: string;
    signature?: string;
}

export interface DisruptionsGetDisruptionsByStopRequest {
    stopId: number;
    disruptionStatus?: DisruptionsGetDisruptionsByStopDisruptionStatusEnum;
    token?: string;
    devid?: string;
    signature?: string;
}

/**
 * 
 */
export class DisruptionsApi extends runtime.BaseAPI {

    /**
     * View all disruptions for all route types
     */
    async disruptionsGetAllDisruptionsRaw(requestParameters: DisruptionsGetAllDisruptionsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<V3DisruptionsResponse>> {
        const queryParameters: any = {};

        if (requestParameters['routeTypes'] != null) {
            queryParameters['route_types'] = requestParameters['routeTypes'];
        }

        if (requestParameters['disruptionModes'] != null) {
            queryParameters['disruption_modes'] = requestParameters['disruptionModes'];
        }

        if (requestParameters['disruptionStatus'] != null) {
            queryParameters['disruption_status'] = requestParameters['disruptionStatus'];
        }

        if (requestParameters['token'] != null) {
            queryParameters['token'] = requestParameters['token'];
        }

        if (requestParameters['devid'] != null) {
            queryParameters['devid'] = requestParameters['devid'];
        }

        if (requestParameters['signature'] != null) {
            queryParameters['signature'] = requestParameters['signature'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/v3/disruptions`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => V3DisruptionsResponseFromJSON(jsonValue));
    }

    /**
     * View all disruptions for all route types
     */
    async disruptionsGetAllDisruptions(requestParameters: DisruptionsGetAllDisruptionsRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<V3DisruptionsResponse> {
        const response = await this.disruptionsGetAllDisruptionsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * View a specific disruption
     */
    async disruptionsGetDisruptionByIdRaw(requestParameters: DisruptionsGetDisruptionByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<V3DisruptionResponse>> {
        if (requestParameters['disruptionId'] == null) {
            throw new runtime.RequiredError(
                'disruptionId',
                'Required parameter "disruptionId" was null or undefined when calling disruptionsGetDisruptionById().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['token'] != null) {
            queryParameters['token'] = requestParameters['token'];
        }

        if (requestParameters['devid'] != null) {
            queryParameters['devid'] = requestParameters['devid'];
        }

        if (requestParameters['signature'] != null) {
            queryParameters['signature'] = requestParameters['signature'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/v3/disruptions/{disruption_id}`.replace(`{${"disruption_id"}}`, encodeURIComponent(String(requestParameters['disruptionId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => V3DisruptionResponseFromJSON(jsonValue));
    }

    /**
     * View a specific disruption
     */
    async disruptionsGetDisruptionById(requestParameters: DisruptionsGetDisruptionByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<V3DisruptionResponse> {
        const response = await this.disruptionsGetDisruptionByIdRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get all disruption modes
     */
    async disruptionsGetDisruptionModesRaw(requestParameters: DisruptionsGetDisruptionModesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<V3DisruptionModesResponse>> {
        const queryParameters: any = {};

        if (requestParameters['token'] != null) {
            queryParameters['token'] = requestParameters['token'];
        }

        if (requestParameters['devid'] != null) {
            queryParameters['devid'] = requestParameters['devid'];
        }

        if (requestParameters['signature'] != null) {
            queryParameters['signature'] = requestParameters['signature'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/v3/disruptions/modes`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => V3DisruptionModesResponseFromJSON(jsonValue));
    }

    /**
     * Get all disruption modes
     */
    async disruptionsGetDisruptionModes(requestParameters: DisruptionsGetDisruptionModesRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<V3DisruptionModesResponse> {
        const response = await this.disruptionsGetDisruptionModesRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * View all disruptions for a particular route
     */
    async disruptionsGetDisruptionsByRouteRaw(requestParameters: DisruptionsGetDisruptionsByRouteRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<V3DisruptionsResponse>> {
        if (requestParameters['routeId'] == null) {
            throw new runtime.RequiredError(
                'routeId',
                'Required parameter "routeId" was null or undefined when calling disruptionsGetDisruptionsByRoute().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['disruptionStatus'] != null) {
            queryParameters['disruption_status'] = requestParameters['disruptionStatus'];
        }

        if (requestParameters['token'] != null) {
            queryParameters['token'] = requestParameters['token'];
        }

        if (requestParameters['devid'] != null) {
            queryParameters['devid'] = requestParameters['devid'];
        }

        if (requestParameters['signature'] != null) {
            queryParameters['signature'] = requestParameters['signature'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/v3/disruptions/route/{route_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters['routeId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => V3DisruptionsResponseFromJSON(jsonValue));
    }

    /**
     * View all disruptions for a particular route
     */
    async disruptionsGetDisruptionsByRoute(requestParameters: DisruptionsGetDisruptionsByRouteRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<V3DisruptionsResponse> {
        const response = await this.disruptionsGetDisruptionsByRouteRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * View all disruptions for a particular route and stop
     */
    async disruptionsGetDisruptionsByRouteAndStopRaw(requestParameters: DisruptionsGetDisruptionsByRouteAndStopRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<V3DisruptionsResponse>> {
        if (requestParameters['routeId'] == null) {
            throw new runtime.RequiredError(
                'routeId',
                'Required parameter "routeId" was null or undefined when calling disruptionsGetDisruptionsByRouteAndStop().'
            );
        }

        if (requestParameters['stopId'] == null) {
            throw new runtime.RequiredError(
                'stopId',
                'Required parameter "stopId" was null or undefined when calling disruptionsGetDisruptionsByRouteAndStop().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['disruptionStatus'] != null) {
            queryParameters['disruption_status'] = requestParameters['disruptionStatus'];
        }

        if (requestParameters['token'] != null) {
            queryParameters['token'] = requestParameters['token'];
        }

        if (requestParameters['devid'] != null) {
            queryParameters['devid'] = requestParameters['devid'];
        }

        if (requestParameters['signature'] != null) {
            queryParameters['signature'] = requestParameters['signature'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/v3/disruptions/route/{route_id}/stop/{stop_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters['routeId']))).replace(`{${"stop_id"}}`, encodeURIComponent(String(requestParameters['stopId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => V3DisruptionsResponseFromJSON(jsonValue));
    }

    /**
     * View all disruptions for a particular route and stop
     */
    async disruptionsGetDisruptionsByRouteAndStop(requestParameters: DisruptionsGetDisruptionsByRouteAndStopRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<V3DisruptionsResponse> {
        const response = await this.disruptionsGetDisruptionsByRouteAndStopRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * View all disruptions for a particular stop
     */
    async disruptionsGetDisruptionsByStopRaw(requestParameters: DisruptionsGetDisruptionsByStopRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<V3DisruptionsResponse>> {
        if (requestParameters['stopId'] == null) {
            throw new runtime.RequiredError(
                'stopId',
                'Required parameter "stopId" was null or undefined when calling disruptionsGetDisruptionsByStop().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['disruptionStatus'] != null) {
            queryParameters['disruption_status'] = requestParameters['disruptionStatus'];
        }

        if (requestParameters['token'] != null) {
            queryParameters['token'] = requestParameters['token'];
        }

        if (requestParameters['devid'] != null) {
            queryParameters['devid'] = requestParameters['devid'];
        }

        if (requestParameters['signature'] != null) {
            queryParameters['signature'] = requestParameters['signature'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/v3/disruptions/stop/{stop_id}`.replace(`{${"stop_id"}}`, encodeURIComponent(String(requestParameters['stopId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => V3DisruptionsResponseFromJSON(jsonValue));
    }

    /**
     * View all disruptions for a particular stop
     */
    async disruptionsGetDisruptionsByStop(requestParameters: DisruptionsGetDisruptionsByStopRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<V3DisruptionsResponse> {
        const response = await this.disruptionsGetDisruptionsByStopRaw(requestParameters, initOverrides);
        return await response.value();
    }

}

/**
 * @export
 */
export const DisruptionsGetAllDisruptionsRouteTypesEnum = {
    NUMBER_0: 0,
    NUMBER_1: 1,
    NUMBER_2: 2,
    NUMBER_3: 3,
    NUMBER_4: 4
} as const;
export type DisruptionsGetAllDisruptionsRouteTypesEnum = typeof DisruptionsGetAllDisruptionsRouteTypesEnum[keyof typeof DisruptionsGetAllDisruptionsRouteTypesEnum];
/**
 * @export
 */
export const DisruptionsGetAllDisruptionsDisruptionModesEnum = {
    NUMBER_1: 1,
    NUMBER_2: 2,
    NUMBER_3: 3,
    NUMBER_4: 4,
    NUMBER_5: 5,
    NUMBER_7: 7,
    NUMBER_8: 8,
    NUMBER_9: 9,
    NUMBER_10: 10,
    NUMBER_11: 11,
    NUMBER_12: 12,
    NUMBER_13: 13,
    NUMBER_14: 14,
    NUMBER_100: 100
} as const;
export type DisruptionsGetAllDisruptionsDisruptionModesEnum = typeof DisruptionsGetAllDisruptionsDisruptionModesEnum[keyof typeof DisruptionsGetAllDisruptionsDisruptionModesEnum];
/**
 * @export
 */
export const DisruptionsGetAllDisruptionsDisruptionStatusEnum = {
    Current: 'current',
    Planned: 'planned'
} as const;
export type DisruptionsGetAllDisruptionsDisruptionStatusEnum = typeof DisruptionsGetAllDisruptionsDisruptionStatusEnum[keyof typeof DisruptionsGetAllDisruptionsDisruptionStatusEnum];
/**
 * @export
 */
export const DisruptionsGetDisruptionsByRouteDisruptionStatusEnum = {
    Current: 'current',
    Planned: 'planned'
} as const;
export type DisruptionsGetDisruptionsByRouteDisruptionStatusEnum = typeof DisruptionsGetDisruptionsByRouteDisruptionStatusEnum[keyof typeof DisruptionsGetDisruptionsByRouteDisruptionStatusEnum];
/**
 * @export
 */
export const DisruptionsGetDisruptionsByRouteAndStopDisruptionStatusEnum = {
    Current: 'current',
    Planned: 'planned'
} as const;
export type DisruptionsGetDisruptionsByRouteAndStopDisruptionStatusEnum = typeof DisruptionsGetDisruptionsByRouteAndStopDisruptionStatusEnum[keyof typeof DisruptionsGetDisruptionsByRouteAndStopDisruptionStatusEnum];
/**
 * @export
 */
export const DisruptionsGetDisruptionsByStopDisruptionStatusEnum = {
    Current: 'current',
    Planned: 'planned'
} as const;
export type DisruptionsGetDisruptionsByStopDisruptionStatusEnum = typeof DisruptionsGetDisruptionsByStopDisruptionStatusEnum[keyof typeof DisruptionsGetDisruptionsByStopDisruptionStatusEnum];
