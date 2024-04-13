//
// V3BulkDeparturesResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class V3BulkDeparturesResponse: JSONEncodable {
    /** Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid. */
    public var responses: [V3BulkDeparturesUpdateResponse]?
    /** A train station, tram stop, bus stop, regional coach stop or Night Bus stop */
    public var stops: [String:V3BulkDeparturesStopResponse]?
    /** Train lines, tram routes, bus routes, regional coach routes, Night Bus routes */
    public var routes: [Any]?
    /** Individual trips/services of a route */
    public var runs: [V3Run]?
    /** Directions of travel of route */
    public var directions: [V3Direction]?
    /** Disruption information applicable to relevant routes or stops */
    public var disruptions: [String:V3Disruption]?
    public var status: V3Status?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["responses"] = self.responses?.encodeToJSON()
        nillableDictionary["stops"] = self.stops?.encodeToJSON()
        nillableDictionary["routes"] = self.routes?.encodeToJSON()
        nillableDictionary["runs"] = self.runs?.encodeToJSON()
        nillableDictionary["directions"] = self.directions?.encodeToJSON()
        nillableDictionary["disruptions"] = self.disruptions?.encodeToJSON()
        nillableDictionary["status"] = self.status?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
