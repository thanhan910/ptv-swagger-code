//
// V3SiriReferenceDataMappingsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class V3SiriReferenceDataMappingsResponse: JSONEncodable {
    public var mappingVersion: String?
    /** SIRI LineRef */
    public var lineRefs: [String:V3SiriDirectionRefsDictionary]?
    public var stopPointRefs: [String:V3StopPoint]?
    public var status: V3Status?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["mapping_version"] = self.mappingVersion
        nillableDictionary["line_refs"] = self.lineRefs?.encodeToJSON()
        nillableDictionary["stop_point_refs"] = self.stopPointRefs?.encodeToJSON()
        nillableDictionary["status"] = self.status?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
