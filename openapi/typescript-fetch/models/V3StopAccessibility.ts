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
import type { V3StopAccessibilityWheelchair } from './V3StopAccessibilityWheelchair';
import {
    V3StopAccessibilityWheelchairFromJSON,
    V3StopAccessibilityWheelchairFromJSONTyped,
    V3StopAccessibilityWheelchairToJSON,
} from './V3StopAccessibilityWheelchair';

/**
 * 
 * @export
 * @interface V3StopAccessibility
 */
export interface V3StopAccessibility {
    /**
     * Indicates if there is lighting at the stop
     * @type {boolean}
     * @memberof V3StopAccessibility
     */
    lighting?: boolean;
    /**
     * Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)
     * @type {number}
     * @memberof V3StopAccessibility
     */
    platformNumber?: number;
    /**
     * Indicates if there is at least one audio customer information at the stop/platform
     * @type {boolean}
     * @memberof V3StopAccessibility
     */
    audioCustomerInformation?: boolean;
    /**
     * Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
     * @type {boolean}
     * @memberof V3StopAccessibility
     */
    escalator?: boolean;
    /**
     * Indicates if there is a hearing loop facility at the stop/platform
     * @type {boolean}
     * @memberof V3StopAccessibility
     */
    hearingLoop?: boolean;
    /**
     * Indicates if there is an elevator at the stop/platform
     * @type {boolean}
     * @memberof V3StopAccessibility
     */
    lift?: boolean;
    /**
     * Indicates if there are stairs available in the stop
     * @type {boolean}
     * @memberof V3StopAccessibility
     */
    stairs?: boolean;
    /**
     * Indicates if the stop is accessible
     * @type {boolean}
     * @memberof V3StopAccessibility
     */
    stopAccessible?: boolean;
    /**
     * Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop
     * @type {boolean}
     * @memberof V3StopAccessibility
     */
    tactileGroundSurfaceIndicator?: boolean;
    /**
     * Indicates if there is a general waiting area at the stop
     * @type {boolean}
     * @memberof V3StopAccessibility
     */
    waitingRoom?: boolean;
    /**
     * 
     * @type {V3StopAccessibilityWheelchair}
     * @memberof V3StopAccessibility
     */
    wheelchair?: V3StopAccessibilityWheelchair;
}

/**
 * Check if a given object implements the V3StopAccessibility interface.
 */
export function instanceOfV3StopAccessibility(value: object): boolean {
    return true;
}

export function V3StopAccessibilityFromJSON(json: any): V3StopAccessibility {
    return V3StopAccessibilityFromJSONTyped(json, false);
}

export function V3StopAccessibilityFromJSONTyped(json: any, ignoreDiscriminator: boolean): V3StopAccessibility {
    if (json == null) {
        return json;
    }
    return {
        
        'lighting': json['lighting'] == null ? undefined : json['lighting'],
        'platformNumber': json['platform_number'] == null ? undefined : json['platform_number'],
        'audioCustomerInformation': json['audio_customer_information'] == null ? undefined : json['audio_customer_information'],
        'escalator': json['escalator'] == null ? undefined : json['escalator'],
        'hearingLoop': json['hearing_loop'] == null ? undefined : json['hearing_loop'],
        'lift': json['lift'] == null ? undefined : json['lift'],
        'stairs': json['stairs'] == null ? undefined : json['stairs'],
        'stopAccessible': json['stop_accessible'] == null ? undefined : json['stop_accessible'],
        'tactileGroundSurfaceIndicator': json['tactile_ground_surface_indicator'] == null ? undefined : json['tactile_ground_surface_indicator'],
        'waitingRoom': json['waiting_room'] == null ? undefined : json['waiting_room'],
        'wheelchair': json['wheelchair'] == null ? undefined : V3StopAccessibilityWheelchairFromJSON(json['wheelchair']),
    };
}

export function V3StopAccessibilityToJSON(value?: V3StopAccessibility | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'lighting': value['lighting'],
        'platform_number': value['platformNumber'],
        'audio_customer_information': value['audioCustomerInformation'],
        'escalator': value['escalator'],
        'hearing_loop': value['hearingLoop'],
        'lift': value['lift'],
        'stairs': value['stairs'],
        'stop_accessible': value['stopAccessible'],
        'tactile_ground_surface_indicator': value['tactileGroundSurfaceIndicator'],
        'waiting_room': value['waitingRoom'],
        'wheelchair': V3StopAccessibilityWheelchairToJSON(value['wheelchair']),
    };
}

