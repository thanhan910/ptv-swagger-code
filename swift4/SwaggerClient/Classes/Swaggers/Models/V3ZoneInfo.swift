//
// V3ZoneInfo.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct V3ZoneInfo: Codable {


    public var minZone: Int?

    public var maxZone: Int?

    public var uniqueZones: [Int]?
    public init(minZone: Int? = nil, maxZone: Int? = nil, uniqueZones: [Int]? = nil) { 
        self.minZone = minZone
        self.maxZone = maxZone
        self.uniqueZones = uniqueZones
    }
    public enum CodingKeys: String, CodingKey { 
        case minZone = "MinZone"
        case maxZone = "MaxZone"
        case uniqueZones = "UniqueZones"
    }

}
