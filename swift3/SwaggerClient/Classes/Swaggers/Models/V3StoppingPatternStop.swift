//
// V3StoppingPatternStop.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class V3StoppingPatternStop: JSONEncodable {
    public var stopTicket: V3StopTicket?
    /** Distance of stop from input location (in metres); returns 0 if no location is input */
    public var stopDistance: Float?
    /** suburb of stop */
    public var stopSuburb: String?
    /** Name of stop */
    public var stopName: String?
    /** Stop identifier */
    public var stopId: Int32?
    /** Transport mode identifier */
    public var routeType: Int32?
    /** Geographic coordinate of latitude at stop */
    public var stopLatitude: Float?
    /** Geographic coordinate of longitude at stop */
    public var stopLongitude: Float?
    /** Landmark in proximity of stop */
    public var stopLandmark: String?
    /** Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id. */
    public var stopSequence: Int32?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["stop_ticket"] = self.stopTicket?.encodeToJSON()
        nillableDictionary["stop_distance"] = self.stopDistance
        nillableDictionary["stop_suburb"] = self.stopSuburb
        nillableDictionary["stop_name"] = self.stopName
        nillableDictionary["stop_id"] = self.stopId?.encodeToJSON()
        nillableDictionary["route_type"] = self.routeType?.encodeToJSON()
        nillableDictionary["stop_latitude"] = self.stopLatitude
        nillableDictionary["stop_longitude"] = self.stopLongitude
        nillableDictionary["stop_landmark"] = self.stopLandmark
        nillableDictionary["stop_sequence"] = self.stopSequence?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
