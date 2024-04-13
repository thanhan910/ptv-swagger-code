//
// V3SiriDownstreamSubscription.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class V3SiriDownstreamSubscription: JSONEncodable {
    public enum MessageType: Int32 {
        case _0 = 0
        case _1 = 1
    }
    public enum SiriFormat: Int32 {
        case _0 = 0
        case _1 = 1
    }
    public var subscriberRef: String?
    public var subscriptionRef: String?
        public var messageType: MessageType?
        public var siriFormat: SiriFormat?
    public var siriVersion: String?
    public var consumerAddress: String?
    public var initialTerminationTime: Date?
    public var validityPeriodStart: Date?
    public var validityPeriodEnd: Date?
    public var previewInterval: String?
    public var topics: [V3SiriDownstreamSubscriptionTopic]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["subscriber_ref"] = self.subscriberRef
        nillableDictionary["subscription_ref"] = self.subscriptionRef
        nillableDictionary["message_type"] = self.messageType?.rawValue
        nillableDictionary["siri_format"] = self.siriFormat?.rawValue
        nillableDictionary["siri_version"] = self.siriVersion
        nillableDictionary["consumer_address"] = self.consumerAddress
        nillableDictionary["initial_termination_time"] = self.initialTerminationTime?.encodeToJSON()
        nillableDictionary["validity_period_start"] = self.validityPeriodStart?.encodeToJSON()
        nillableDictionary["validity_period_end"] = self.validityPeriodEnd?.encodeToJSON()
        nillableDictionary["preview_interval"] = self.previewInterval
        nillableDictionary["topics"] = self.topics?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
