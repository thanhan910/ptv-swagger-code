//
// V3FareEstimateResult.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct V3FareEstimateResult: Codable {

    public var isEarlyBird: Bool?
    public var isJourneyInFreeTramZone: Bool?
    public var isThisWeekendJourney: Bool?
    public var zoneInfo: V3ZoneInfo?
    public var passengerFares: [V3PassengerFare]?

    public init(isEarlyBird: Bool? = nil, isJourneyInFreeTramZone: Bool? = nil, isThisWeekendJourney: Bool? = nil, zoneInfo: V3ZoneInfo? = nil, passengerFares: [V3PassengerFare]? = nil) {
        self.isEarlyBird = isEarlyBird
        self.isJourneyInFreeTramZone = isJourneyInFreeTramZone
        self.isThisWeekendJourney = isThisWeekendJourney
        self.zoneInfo = zoneInfo
        self.passengerFares = passengerFares
    }

    public enum CodingKeys: String, CodingKey { 
        case isEarlyBird = "IsEarlyBird"
        case isJourneyInFreeTramZone = "IsJourneyInFreeTramZone"
        case isThisWeekendJourney = "IsThisWeekendJourney"
        case zoneInfo = "ZoneInfo"
        case passengerFares = "PassengerFares"
    }

}
