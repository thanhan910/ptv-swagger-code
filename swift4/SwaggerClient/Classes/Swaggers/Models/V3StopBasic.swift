//
// V3StopBasic.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct V3StopBasic: Codable {


    public var stopId: Int?

    public var stopName: String?
    public init(stopId: Int? = nil, stopName: String? = nil) { 
        self.stopId = stopId
        self.stopName = stopName
    }
    public enum CodingKeys: String, CodingKey { 
        case stopId = "stop_id"
        case stopName = "stop_name"
    }

}
