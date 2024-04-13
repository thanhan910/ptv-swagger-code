/* tslint:disable */
/* eslint-disable */
/**
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

import { V3DisruptionRoute } from './v3-disruption-route';
import { V3DisruptionStop } from './v3-disruption-stop';
import {
    V3DisruptionRoute,V3DisruptionStop,
} from ".";

/**
 * 
 *
 * @export
 * @interface V3Disruption
 */
export interface V3Disruption {

    /**
     * Disruption information identifier
     *
     * @type {number}
     * @memberof V3Disruption
     */
    disruptionId?: number;

    /**
     * Headline title summarising disruption information
     *
     * @type {string}
     * @memberof V3Disruption
     */
    title?: string;

    /**
     * URL of relevant article on PTV website
     *
     * @type {string}
     * @memberof V3Disruption
     */
    url?: string;

    /**
     * Description of the disruption
     *
     * @type {string}
     * @memberof V3Disruption
     */
    description?: string;

    /**
     * Status of the disruption (e.g. \"Planned\", \"Current\")
     *
     * @type {string}
     * @memberof V3Disruption
     */
    disruptionStatus?: string;

    /**
     * Type of disruption
     *
     * @type {string}
     * @memberof V3Disruption
     */
    disruptionType?: string;

    /**
     * Date and time disruption information is published on PTV website, in ISO 8601 UTC format
     *
     * @type {Date}
     * @memberof V3Disruption
     */
    publishedOn?: Date;

    /**
     * Date and time disruption information was last updated by PTV, in ISO 8601 UTC format
     *
     * @type {Date}
     * @memberof V3Disruption
     */
    lastUpdated?: Date;

    /**
     * Date and time at which disruption begins, in ISO 8601 UTC format
     *
     * @type {Date}
     * @memberof V3Disruption
     */
    fromDate?: Date;

    /**
     * Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)
     *
     * @type {Date}
     * @memberof V3Disruption
     */
    toDate?: Date;

    /**
     * Route relevant to a disruption (if applicable)
     *
     * @type {Array<V3DisruptionRoute>}
     * @memberof V3Disruption
     */
    routes?: Array<V3DisruptionRoute>;

    /**
     * Stop relevant to a disruption (if applicable)
     *
     * @type {Array<V3DisruptionStop>}
     * @memberof V3Disruption
     */
    stops?: Array<V3DisruptionStop>;

    /**
     * @type {string}
     * @memberof V3Disruption
     */
    colour?: string;

    /**
     * @type {boolean}
     * @memberof V3Disruption
     */
    displayOnBoard?: boolean;

    /**
     * @type {boolean}
     * @memberof V3Disruption
     */
    displayStatus?: boolean;
}
