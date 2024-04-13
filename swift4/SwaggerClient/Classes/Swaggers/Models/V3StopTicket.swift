//
// V3StopTicket.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct V3StopTicket: Codable {


    /** Indicates the ticket type for the stop (myki, paper or both) */
    public var ticketType: String?

    /** Description of the zone */
    public var zone: String?

    /** Indicates whether the stop is inside the free fare zone */
    public var isFreeFareZone: Bool?

    public var ticketMachine: Bool?

    public var ticketChecks: Bool?

    public var vlineReservation: Bool?

    public var ticketZones: [Int]?
    public init(ticketType: String? = nil, zone: String? = nil, isFreeFareZone: Bool? = nil, ticketMachine: Bool? = nil, ticketChecks: Bool? = nil, vlineReservation: Bool? = nil, ticketZones: [Int]? = nil) { 
        self.ticketType = ticketType
        self.zone = zone
        self.isFreeFareZone = isFreeFareZone
        self.ticketMachine = ticketMachine
        self.ticketChecks = ticketChecks
        self.vlineReservation = vlineReservation
        self.ticketZones = ticketZones
    }
    public enum CodingKeys: String, CodingKey { 
        case ticketType = "ticket_type"
        case zone
        case isFreeFareZone = "is_free_fare_zone"
        case ticketMachine = "ticket_machine"
        case ticketChecks = "ticket_checks"
        case vlineReservation = "vline_reservation"
        case ticketZones = "ticket_zones"
    }

}
