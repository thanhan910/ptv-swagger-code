//
// V3ResultRoute.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct V3ResultRoute: Codable {


    /** Name of route */
    public var routeName: String?

    /** Route number presented to public (nb. not route_id) */
    public var routeNumber: String?

    /** Transport mode identifier */
    public var routeType: Int?

    /** Route identifier */
    public var routeId: Int?

    /** GTFS Identifer of the route */
    public var routeGtfsId: String?

    public var routeServiceStatus: V3RouteServiceStatus?
    public init(routeName: String? = nil, routeNumber: String? = nil, routeType: Int? = nil, routeId: Int? = nil, routeGtfsId: String? = nil, routeServiceStatus: V3RouteServiceStatus? = nil) { 
        self.routeName = routeName
        self.routeNumber = routeNumber
        self.routeType = routeType
        self.routeId = routeId
        self.routeGtfsId = routeGtfsId
        self.routeServiceStatus = routeServiceStatus
    }
    public enum CodingKeys: String, CodingKey { 
        case routeName = "route_name"
        case routeNumber = "route_number"
        case routeType = "route_type"
        case routeId = "route_id"
        case routeGtfsId = "route_gtfs_id"
        case routeServiceStatus = "route_service_status"
    }

}
