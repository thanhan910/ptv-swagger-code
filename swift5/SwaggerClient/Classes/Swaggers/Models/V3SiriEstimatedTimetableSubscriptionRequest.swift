//
// V3SiriEstimatedTimetableSubscriptionRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct V3SiriEstimatedTimetableSubscriptionRequest: Codable {

    public enum SiriFormat: Int, Codable { 
        case _0 = 0
        case _1 = 1
    }
    /** Siri Preview Interval */
    public var previewInterval: String
    /** Siri Subscriber Ref */
    public var subscriberRef: String
    /** Siri Subscription Ref - Unique to a Subscriber Ref */
    public var subscriptionRef: String
    /** Siri Message Format &#x27;xml&#x27; or &#x27;json&#x27; */
    public var siriFormat: SiriFormat
    /** Siri Message Version &#x27;1.3&#x27; or &#x27;2.0&#x27; */
    public var siriVersion: String
    /** Siri Consumer Address - Baseline and Updates will be sent to this address */
    public var consumerAddress: String
    /** Siri Initial Termination Time - Expiry of the subscription */
    public var initialTerminationTime: Date
    public var topics: [V3SiriSubscriptionTopic]

    public init(previewInterval: String, subscriberRef: String, subscriptionRef: String, siriFormat: SiriFormat, siriVersion: String, consumerAddress: String, initialTerminationTime: Date, topics: [V3SiriSubscriptionTopic]) {
        self.previewInterval = previewInterval
        self.subscriberRef = subscriberRef
        self.subscriptionRef = subscriptionRef
        self.siriFormat = siriFormat
        self.siriVersion = siriVersion
        self.consumerAddress = consumerAddress
        self.initialTerminationTime = initialTerminationTime
        self.topics = topics
    }

    public enum CodingKeys: String, CodingKey { 
        case previewInterval = "preview_interval"
        case subscriberRef = "subscriber_ref"
        case subscriptionRef = "subscription_ref"
        case siriFormat = "siri_format"
        case siriVersion = "siri_version"
        case consumerAddress = "consumer_address"
        case initialTerminationTime = "initial_termination_time"
        case topics
    }

}
