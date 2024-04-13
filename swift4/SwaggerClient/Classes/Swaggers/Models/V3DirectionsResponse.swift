//
// V3DirectionsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct V3DirectionsResponse: Codable {


    /** Directions of travel of route */
    public var directions: [V3DirectionWithDescription]?

    public var status: V3Status?
    public init(directions: [V3DirectionWithDescription]? = nil, status: V3Status? = nil) { 
        self.directions = directions
        self.status = status
    }

}
