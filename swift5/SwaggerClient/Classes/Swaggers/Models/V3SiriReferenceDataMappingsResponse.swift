//
// V3SiriReferenceDataMappingsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct V3SiriReferenceDataMappingsResponse: Codable {

    public var mappingVersion: String?
    /** SIRI LineRef */
    public var lineRefs: [String:V3SiriDirectionRefsDictionary]?
    public var stopPointRefs: [String:V3StopPoint]?
    public var status: V3Status?

    public init(mappingVersion: String? = nil, lineRefs: [String:V3SiriDirectionRefsDictionary]? = nil, stopPointRefs: [String:V3StopPoint]? = nil, status: V3Status? = nil) {
        self.mappingVersion = mappingVersion
        self.lineRefs = lineRefs
        self.stopPointRefs = stopPointRefs
        self.status = status
    }

    public enum CodingKeys: String, CodingKey { 
        case mappingVersion = "mapping_version"
        case lineRefs = "line_refs"
        case stopPointRefs = "stop_point_refs"
        case status
    }

}
