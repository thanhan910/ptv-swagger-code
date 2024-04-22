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
import type { V3Direction } from './V3Direction';
import {
    V3DirectionFromJSON,
    V3DirectionFromJSONTyped,
    V3DirectionToJSON,
} from './V3Direction';
import type { V3Disruption } from './V3Disruption';
import {
    V3DisruptionFromJSON,
    V3DisruptionFromJSONTyped,
    V3DisruptionToJSON,
} from './V3Disruption';
import type { V3PatternDeparture } from './V3PatternDeparture';
import {
    V3PatternDepartureFromJSON,
    V3PatternDepartureFromJSONTyped,
    V3PatternDepartureToJSON,
} from './V3PatternDeparture';
import type { V3Run } from './V3Run';
import {
    V3RunFromJSON,
    V3RunFromJSONTyped,
    V3RunToJSON,
} from './V3Run';
import type { V3Status } from './V3Status';
import {
    V3StatusFromJSON,
    V3StatusFromJSONTyped,
    V3StatusToJSON,
} from './V3Status';
import type { V3StoppingPatternStop } from './V3StoppingPatternStop';
import {
    V3StoppingPatternStopFromJSON,
    V3StoppingPatternStopFromJSONTyped,
    V3StoppingPatternStopToJSON,
} from './V3StoppingPatternStop';

/**
 * 
 * @export
 * @interface V3StoppingPattern
 */
export interface V3StoppingPattern {
    /**
     * Disruption information applicable to relevant routes or stops
     * @type {Array<V3Disruption>}
     * @memberof V3StoppingPattern
     */
    disruptions?: Array<V3Disruption>;
    /**
     * Timetabled and real-time service departures
     * @type {Array<V3PatternDeparture>}
     * @memberof V3StoppingPattern
     */
    departures?: Array<V3PatternDeparture>;
    /**
     * A train station, tram stop, bus stop, regional coach stop or Night Bus stop
     * @type {{ [key: string]: V3StoppingPatternStop; }}
     * @memberof V3StoppingPattern
     */
    stops?: { [key: string]: V3StoppingPatternStop; };
    /**
     * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
     * @type {{ [key: string]: object; }}
     * @memberof V3StoppingPattern
     */
    routes?: { [key: string]: object; };
    /**
     * Individual trips/services of a route
     * @type {{ [key: string]: V3Run; }}
     * @memberof V3StoppingPattern
     */
    runs?: { [key: string]: V3Run; };
    /**
     * Directions of travel of route
     * @type {{ [key: string]: V3Direction; }}
     * @memberof V3StoppingPattern
     */
    directions?: { [key: string]: V3Direction; };
    /**
     * 
     * @type {V3Status}
     * @memberof V3StoppingPattern
     */
    status?: V3Status;
}

/**
 * Check if a given object implements the V3StoppingPattern interface.
 */
export function instanceOfV3StoppingPattern(value: object): boolean {
    return true;
}

export function V3StoppingPatternFromJSON(json: any): V3StoppingPattern {
    return V3StoppingPatternFromJSONTyped(json, false);
}

export function V3StoppingPatternFromJSONTyped(json: any, ignoreDiscriminator: boolean): V3StoppingPattern {
    if (json == null) {
        return json;
    }
    return {
        
        'disruptions': json['disruptions'] == null ? undefined : ((json['disruptions'] as Array<any>).map(V3DisruptionFromJSON)),
        'departures': json['departures'] == null ? undefined : ((json['departures'] as Array<any>).map(V3PatternDepartureFromJSON)),
        'stops': json['stops'] == null ? undefined : (mapValues(json['stops'], V3StoppingPatternStopFromJSON)),
        'routes': json['routes'] == null ? undefined : json['routes'],
        'runs': json['runs'] == null ? undefined : (mapValues(json['runs'], V3RunFromJSON)),
        'directions': json['directions'] == null ? undefined : (mapValues(json['directions'], V3DirectionFromJSON)),
        'status': json['status'] == null ? undefined : V3StatusFromJSON(json['status']),
    };
}

export function V3StoppingPatternToJSON(value?: V3StoppingPattern | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'disruptions': value['disruptions'] == null ? undefined : ((value['disruptions'] as Array<any>).map(V3DisruptionToJSON)),
        'departures': value['departures'] == null ? undefined : ((value['departures'] as Array<any>).map(V3PatternDepartureToJSON)),
        'stops': value['stops'] == null ? undefined : (mapValues(value['stops'], V3StoppingPatternStopToJSON)),
        'routes': value['routes'],
        'runs': value['runs'] == null ? undefined : (mapValues(value['runs'], V3RunToJSON)),
        'directions': value['directions'] == null ? undefined : (mapValues(value['directions'], V3DirectionToJSON)),
        'status': V3StatusToJSON(value['status']),
    };
}
