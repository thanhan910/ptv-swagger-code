//
// V3StopDepartureRequestRouteDirection.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct V3StopDepartureRequestRouteDirection: Codable {


    /** Identifier of route; values returned by Routes API - v3/routes */
    public var routeId: String?

    /** Direction of travel identifier; values returned by Directions API - v3/directions */
    public var directionId: Int?

    /** Name of direction of travel; values returned by Directions API - v3/directions */
    public var directionName: String
    public init(routeId: String? = nil, directionId: Int? = nil, directionName: String) { 
        self.routeId = routeId
        self.directionId = directionId
        self.directionName = directionName
    }
    public enum CodingKeys: String, CodingKey { 
        case routeId = "route_id"
        case directionId = "direction_id"
        case directionName = "direction_name"
    }

}
