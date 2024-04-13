//
// V3ResultStop.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct V3ResultStop: Codable {

    /** Distance of stop from input location (in metres); returns 0 if no location is input */
    public var stopDistance: Float?
    /** suburb of stop */
    public var stopSuburb: String?
    /** Transport mode identifier */
    public var routeType: Int?
    /** List of routes travelling through the stop */
    public var routes: [V3ResultRoute]?
    /** Geographic coordinate of latitude at stop */
    public var stopLatitude: Float?
    /** Geographic coordinate of longitude at stop */
    public var stopLongitude: Float?
    /** Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id. */
    public var stopSequence: Int?
    /** Stop identifier */
    public var stopId: Int?
    /** Name of stop */
    public var stopName: String?
    /** Landmark in proximity of stop */
    public var stopLandmark: String?

    public init(stopDistance: Float? = nil, stopSuburb: String? = nil, routeType: Int? = nil, routes: [V3ResultRoute]? = nil, stopLatitude: Float? = nil, stopLongitude: Float? = nil, stopSequence: Int? = nil, stopId: Int? = nil, stopName: String? = nil, stopLandmark: String? = nil) {
        self.stopDistance = stopDistance
        self.stopSuburb = stopSuburb
        self.routeType = routeType
        self.routes = routes
        self.stopLatitude = stopLatitude
        self.stopLongitude = stopLongitude
        self.stopSequence = stopSequence
        self.stopId = stopId
        self.stopName = stopName
        self.stopLandmark = stopLandmark
    }

    public enum CodingKeys: String, CodingKey { 
        case stopDistance = "stop_distance"
        case stopSuburb = "stop_suburb"
        case routeType = "route_type"
        case routes
        case stopLatitude = "stop_latitude"
        case stopLongitude = "stop_longitude"
        case stopSequence = "stop_sequence"
        case stopId = "stop_id"
        case stopName = "stop_name"
        case stopLandmark = "stop_landmark"
    }

}
