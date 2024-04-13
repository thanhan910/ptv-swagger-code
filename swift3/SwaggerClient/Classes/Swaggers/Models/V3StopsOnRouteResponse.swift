//
// V3StopsOnRouteResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class V3StopsOnRouteResponse: JSONEncodable {
    /** Train stations, tram stops, bus stops, regional coach stops or Night Bus stops */
    public var stops: [V3StopOnRoute]?
    /** Disruption information applicable to relevant routes or stops */
    public var disruptions: [String:V3Disruption]?
    /** GeoPath for the route */
    public var geopath: [Any]?
    public var status: V3Status?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["stops"] = self.stops?.encodeToJSON()
        nillableDictionary["disruptions"] = self.disruptions?.encodeToJSON()
        nillableDictionary["geopath"] = self.geopath?.encodeToJSON()
        nillableDictionary["status"] = self.status?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
