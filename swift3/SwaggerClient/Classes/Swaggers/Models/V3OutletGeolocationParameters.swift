//
// V3OutletGeolocationParameters.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class V3OutletGeolocationParameters: JSONEncodable {
    /** Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) */
    public var maxDistance: Double?
    /** Maximum number of results returned (default &#x3D; 30) */
    public var maxResults: Int32?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["max_distance"] = self.maxDistance
        nillableDictionary["max_results"] = self.maxResults?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
