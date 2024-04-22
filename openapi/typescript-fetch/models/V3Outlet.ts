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
 * @interface V3Outlet
 */
export interface V3Outlet {
    /**
     * The SLID / SPID
     * @type {string}
     * @memberof V3Outlet
     */
    outletSlidSpid?: string;
    /**
     * The location name of the outlet
     * @type {string}
     * @memberof V3Outlet
     */
    outletName?: string;
    /**
     * The business name of the outlet
     * @type {string}
     * @memberof V3Outlet
     */
    outletBusiness?: string;
    /**
     * Geographic coordinate of latitude at outlet
     * @type {number}
     * @memberof V3Outlet
     */
    outletLatitude?: number;
    /**
     * Geographic coordinate of longitude at outlet
     * @type {number}
     * @memberof V3Outlet
     */
    outletLongitude?: number;
    /**
     * The city/municipality the outlet is in
     * @type {string}
     * @memberof V3Outlet
     */
    outletSuburb?: string;
    /**
     * The postcode for the outlet
     * @type {number}
     * @memberof V3Outlet
     */
    outletPostcode?: number;
    /**
     * The business hours on Monday
     * @type {string}
     * @memberof V3Outlet
     */
    outletBusinessHourMon?: string;
    /**
     * The business hours on Tuesday
     * @type {string}
     * @memberof V3Outlet
     */
    outletBusinessHourTue?: string;
    /**
     * The business hours on Wednesday
     * @type {string}
     * @memberof V3Outlet
     */
    outletBusinessHourWed?: string;
    /**
     * The business hours on Thursday
     * @type {string}
     * @memberof V3Outlet
     */
    outletBusinessHourThur?: string;
    /**
     * The business hours on Friday
     * @type {string}
     * @memberof V3Outlet
     */
    outletBusinessHourFri?: string;
    /**
     * The business hours on Saturday
     * @type {string}
     * @memberof V3Outlet
     */
    outletBusinessHourSat?: string;
    /**
     * The business hours on Sunday
     * @type {string}
     * @memberof V3Outlet
     */
    outletBusinessHourSun?: string;
    /**
     * Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.
     * @type {string}
     * @memberof V3Outlet
     */
    outletNotes?: string;
}

/**
 * Check if a given object implements the V3Outlet interface.
 */
export function instanceOfV3Outlet(value: object): boolean {
    return true;
}

export function V3OutletFromJSON(json: any): V3Outlet {
    return V3OutletFromJSONTyped(json, false);
}

export function V3OutletFromJSONTyped(json: any, ignoreDiscriminator: boolean): V3Outlet {
    if (json == null) {
        return json;
    }
    return {
        
        'outletSlidSpid': json['outlet_slid_spid'] == null ? undefined : json['outlet_slid_spid'],
        'outletName': json['outlet_name'] == null ? undefined : json['outlet_name'],
        'outletBusiness': json['outlet_business'] == null ? undefined : json['outlet_business'],
        'outletLatitude': json['outlet_latitude'] == null ? undefined : json['outlet_latitude'],
        'outletLongitude': json['outlet_longitude'] == null ? undefined : json['outlet_longitude'],
        'outletSuburb': json['outlet_suburb'] == null ? undefined : json['outlet_suburb'],
        'outletPostcode': json['outlet_postcode'] == null ? undefined : json['outlet_postcode'],
        'outletBusinessHourMon': json['outlet_business_hour_mon'] == null ? undefined : json['outlet_business_hour_mon'],
        'outletBusinessHourTue': json['outlet_business_hour_tue'] == null ? undefined : json['outlet_business_hour_tue'],
        'outletBusinessHourWed': json['outlet_business_hour_wed'] == null ? undefined : json['outlet_business_hour_wed'],
        'outletBusinessHourThur': json['outlet_business_hour_thur'] == null ? undefined : json['outlet_business_hour_thur'],
        'outletBusinessHourFri': json['outlet_business_hour_fri'] == null ? undefined : json['outlet_business_hour_fri'],
        'outletBusinessHourSat': json['outlet_business_hour_sat'] == null ? undefined : json['outlet_business_hour_sat'],
        'outletBusinessHourSun': json['outlet_business_hour_sun'] == null ? undefined : json['outlet_business_hour_sun'],
        'outletNotes': json['outlet_notes'] == null ? undefined : json['outlet_notes'],
    };
}

export function V3OutletToJSON(value?: V3Outlet | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'outlet_slid_spid': value['outletSlidSpid'],
        'outlet_name': value['outletName'],
        'outlet_business': value['outletBusiness'],
        'outlet_latitude': value['outletLatitude'],
        'outlet_longitude': value['outletLongitude'],
        'outlet_suburb': value['outletSuburb'],
        'outlet_postcode': value['outletPostcode'],
        'outlet_business_hour_mon': value['outletBusinessHourMon'],
        'outlet_business_hour_tue': value['outletBusinessHourTue'],
        'outlet_business_hour_wed': value['outletBusinessHourWed'],
        'outlet_business_hour_thur': value['outletBusinessHourThur'],
        'outlet_business_hour_fri': value['outletBusinessHourFri'],
        'outlet_business_hour_sat': value['outletBusinessHourSat'],
        'outlet_business_hour_sun': value['outletBusinessHourSun'],
        'outlet_notes': value['outletNotes'],
    };
}

