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
import type { V3SiriDownstreamSubscriptionTopic } from './V3SiriDownstreamSubscriptionTopic';
import {
    V3SiriDownstreamSubscriptionTopicFromJSON,
    V3SiriDownstreamSubscriptionTopicFromJSONTyped,
    V3SiriDownstreamSubscriptionTopicToJSON,
} from './V3SiriDownstreamSubscriptionTopic';

/**
 * 
 * @export
 * @interface V3SiriDownstreamSubscription
 */
export interface V3SiriDownstreamSubscription {
    /**
     * 
     * @type {string}
     * @memberof V3SiriDownstreamSubscription
     */
    subscriberRef?: string;
    /**
     * 
     * @type {string}
     * @memberof V3SiriDownstreamSubscription
     */
    subscriptionRef?: string;
    /**
     * 
     * @type {number}
     * @memberof V3SiriDownstreamSubscription
     */
    messageType?: V3SiriDownstreamSubscriptionMessageTypeEnum;
    /**
     * 
     * @type {number}
     * @memberof V3SiriDownstreamSubscription
     */
    siriFormat?: V3SiriDownstreamSubscriptionSiriFormatEnum;
    /**
     * 
     * @type {string}
     * @memberof V3SiriDownstreamSubscription
     */
    siriVersion?: string;
    /**
     * 
     * @type {string}
     * @memberof V3SiriDownstreamSubscription
     */
    consumerAddress?: string;
    /**
     * 
     * @type {Date}
     * @memberof V3SiriDownstreamSubscription
     */
    initialTerminationTime?: Date;
    /**
     * 
     * @type {Date}
     * @memberof V3SiriDownstreamSubscription
     */
    validityPeriodStart?: Date;
    /**
     * 
     * @type {Date}
     * @memberof V3SiriDownstreamSubscription
     */
    validityPeriodEnd?: Date;
    /**
     * 
     * @type {string}
     * @memberof V3SiriDownstreamSubscription
     */
    previewInterval?: string;
    /**
     * 
     * @type {Array<V3SiriDownstreamSubscriptionTopic>}
     * @memberof V3SiriDownstreamSubscription
     */
    topics?: Array<V3SiriDownstreamSubscriptionTopic>;
}


/**
 * @export
 */
export const V3SiriDownstreamSubscriptionMessageTypeEnum = {
    NUMBER_0: 0,
    NUMBER_1: 1
} as const;
export type V3SiriDownstreamSubscriptionMessageTypeEnum = typeof V3SiriDownstreamSubscriptionMessageTypeEnum[keyof typeof V3SiriDownstreamSubscriptionMessageTypeEnum];

/**
 * @export
 */
export const V3SiriDownstreamSubscriptionSiriFormatEnum = {
    NUMBER_0: 0,
    NUMBER_1: 1
} as const;
export type V3SiriDownstreamSubscriptionSiriFormatEnum = typeof V3SiriDownstreamSubscriptionSiriFormatEnum[keyof typeof V3SiriDownstreamSubscriptionSiriFormatEnum];


/**
 * Check if a given object implements the V3SiriDownstreamSubscription interface.
 */
export function instanceOfV3SiriDownstreamSubscription(value: object): boolean {
    return true;
}

export function V3SiriDownstreamSubscriptionFromJSON(json: any): V3SiriDownstreamSubscription {
    return V3SiriDownstreamSubscriptionFromJSONTyped(json, false);
}

export function V3SiriDownstreamSubscriptionFromJSONTyped(json: any, ignoreDiscriminator: boolean): V3SiriDownstreamSubscription {
    if (json == null) {
        return json;
    }
    return {
        
        'subscriberRef': json['subscriber_ref'] == null ? undefined : json['subscriber_ref'],
        'subscriptionRef': json['subscription_ref'] == null ? undefined : json['subscription_ref'],
        'messageType': json['message_type'] == null ? undefined : json['message_type'],
        'siriFormat': json['siri_format'] == null ? undefined : json['siri_format'],
        'siriVersion': json['siri_version'] == null ? undefined : json['siri_version'],
        'consumerAddress': json['consumer_address'] == null ? undefined : json['consumer_address'],
        'initialTerminationTime': json['initial_termination_time'] == null ? undefined : (new Date(json['initial_termination_time'])),
        'validityPeriodStart': json['validity_period_start'] == null ? undefined : (new Date(json['validity_period_start'])),
        'validityPeriodEnd': json['validity_period_end'] == null ? undefined : (new Date(json['validity_period_end'])),
        'previewInterval': json['preview_interval'] == null ? undefined : json['preview_interval'],
        'topics': json['topics'] == null ? undefined : ((json['topics'] as Array<any>).map(V3SiriDownstreamSubscriptionTopicFromJSON)),
    };
}

export function V3SiriDownstreamSubscriptionToJSON(value?: V3SiriDownstreamSubscription | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'subscriber_ref': value['subscriberRef'],
        'subscription_ref': value['subscriptionRef'],
        'message_type': value['messageType'],
        'siri_format': value['siriFormat'],
        'siri_version': value['siriVersion'],
        'consumer_address': value['consumerAddress'],
        'initial_termination_time': value['initialTerminationTime'] == null ? undefined : ((value['initialTerminationTime']).toISOString()),
        'validity_period_start': value['validityPeriodStart'] == null ? undefined : ((value['validityPeriodStart']).toISOString()),
        'validity_period_end': value['validityPeriodEnd'] == null ? undefined : ((value['validityPeriodEnd']).toISOString()),
        'preview_interval': value['previewInterval'],
        'topics': value['topics'] == null ? undefined : ((value['topics'] as Array<any>).map(V3SiriDownstreamSubscriptionTopicToJSON)),
    };
}

