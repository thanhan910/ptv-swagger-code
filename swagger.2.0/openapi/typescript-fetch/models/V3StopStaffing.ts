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
/**
 * 
 * @export
 * @interface V3StopStaffing
 */
export interface V3StopStaffing {
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    friAmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    friAmTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    friPmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    friPmTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    monAmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    monAmTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    monPmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    monPmTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    phAdditionalText?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    phFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    phTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    satAmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    satAmTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    satPmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    satPmTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    sunAmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    sunAmTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    sunPmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    sunPmTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    thuAmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    thuAmTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    thuPmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    thuPmTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    tueAmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    tueAmTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    tuePmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    tuePmTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    wedAmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    wedAmTo?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    wedPmFrom?: string;
    /**
     * Stop staffing hours
     * @type {string}
     * @memberof V3StopStaffing
     */
    wedPmTo?: string;
}

/**
 * Check if a given object implements the V3StopStaffing interface.
 */
export function instanceOfV3StopStaffing(value: object): boolean {
    return true;
}

export function V3StopStaffingFromJSON(json: any): V3StopStaffing {
    return V3StopStaffingFromJSONTyped(json, false);
}

export function V3StopStaffingFromJSONTyped(json: any, ignoreDiscriminator: boolean): V3StopStaffing {
    if (json == null) {
        return json;
    }
    return {
        
        'friAmFrom': json['fri_am_from'] == null ? undefined : json['fri_am_from'],
        'friAmTo': json['fri_am_to'] == null ? undefined : json['fri_am_to'],
        'friPmFrom': json['fri_pm_from'] == null ? undefined : json['fri_pm_from'],
        'friPmTo': json['fri_pm_to'] == null ? undefined : json['fri_pm_to'],
        'monAmFrom': json['mon_am_from'] == null ? undefined : json['mon_am_from'],
        'monAmTo': json['mon_am_to'] == null ? undefined : json['mon_am_to'],
        'monPmFrom': json['mon_pm_from'] == null ? undefined : json['mon_pm_from'],
        'monPmTo': json['mon_pm_to'] == null ? undefined : json['mon_pm_to'],
        'phAdditionalText': json['ph_additional_text'] == null ? undefined : json['ph_additional_text'],
        'phFrom': json['ph_from'] == null ? undefined : json['ph_from'],
        'phTo': json['ph_to'] == null ? undefined : json['ph_to'],
        'satAmFrom': json['sat_am_from'] == null ? undefined : json['sat_am_from'],
        'satAmTo': json['sat_am_to'] == null ? undefined : json['sat_am_to'],
        'satPmFrom': json['sat_pm_from'] == null ? undefined : json['sat_pm_from'],
        'satPmTo': json['sat_pm_to'] == null ? undefined : json['sat_pm_to'],
        'sunAmFrom': json['sun_am_from'] == null ? undefined : json['sun_am_from'],
        'sunAmTo': json['sun_am_to'] == null ? undefined : json['sun_am_to'],
        'sunPmFrom': json['sun_pm_from'] == null ? undefined : json['sun_pm_from'],
        'sunPmTo': json['sun_pm_to'] == null ? undefined : json['sun_pm_to'],
        'thuAmFrom': json['thu_am_from'] == null ? undefined : json['thu_am_from'],
        'thuAmTo': json['thu_am_to'] == null ? undefined : json['thu_am_to'],
        'thuPmFrom': json['thu_pm_from'] == null ? undefined : json['thu_pm_from'],
        'thuPmTo': json['thu_pm_to'] == null ? undefined : json['thu_pm_to'],
        'tueAmFrom': json['tue_am_from'] == null ? undefined : json['tue_am_from'],
        'tueAmTo': json['tue_am_to'] == null ? undefined : json['tue_am_to'],
        'tuePmFrom': json['tue_pm_from'] == null ? undefined : json['tue_pm_from'],
        'tuePmTo': json['tue_pm_to'] == null ? undefined : json['tue_pm_to'],
        'wedAmFrom': json['wed_am_from'] == null ? undefined : json['wed_am_from'],
        'wedAmTo': json['wed_am_to'] == null ? undefined : json['wed_am_to'],
        'wedPmFrom': json['wed_pm_from'] == null ? undefined : json['wed_pm_from'],
        'wedPmTo': json['wed_pm_To'] == null ? undefined : json['wed_pm_To'],
    };
}

export function V3StopStaffingToJSON(value?: V3StopStaffing | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'fri_am_from': value['friAmFrom'],
        'fri_am_to': value['friAmTo'],
        'fri_pm_from': value['friPmFrom'],
        'fri_pm_to': value['friPmTo'],
        'mon_am_from': value['monAmFrom'],
        'mon_am_to': value['monAmTo'],
        'mon_pm_from': value['monPmFrom'],
        'mon_pm_to': value['monPmTo'],
        'ph_additional_text': value['phAdditionalText'],
        'ph_from': value['phFrom'],
        'ph_to': value['phTo'],
        'sat_am_from': value['satAmFrom'],
        'sat_am_to': value['satAmTo'],
        'sat_pm_from': value['satPmFrom'],
        'sat_pm_to': value['satPmTo'],
        'sun_am_from': value['sunAmFrom'],
        'sun_am_to': value['sunAmTo'],
        'sun_pm_from': value['sunPmFrom'],
        'sun_pm_to': value['sunPmTo'],
        'thu_am_from': value['thuAmFrom'],
        'thu_am_to': value['thuAmTo'],
        'thu_pm_from': value['thuPmFrom'],
        'thu_pm_to': value['thuPmTo'],
        'tue_am_from': value['tueAmFrom'],
        'tue_am_to': value['tueAmTo'],
        'tue_pm_from': value['tuePmFrom'],
        'tue_pm_to': value['tuePmTo'],
        'wed_am_from': value['wedAmFrom'],
        'wed_am_to': value['wedAmTo'],
        'wed_pm_from': value['wedPmFrom'],
        'wed_pm_To': value['wedPmTo'],
    };
}

