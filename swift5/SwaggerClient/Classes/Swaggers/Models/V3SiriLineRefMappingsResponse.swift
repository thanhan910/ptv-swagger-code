//
// V3SiriLineRefMappingsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct V3SiriLineRefMappingsResponse: Codable {

    public var mappingVersion: String?
    public var lineRefs: [String:V3SiriLineRefDirectionRefsDictionary]?
    public var status: V3Status?

    public init(mappingVersion: String? = nil, lineRefs: [String:V3SiriLineRefDirectionRefsDictionary]? = nil, status: V3Status? = nil) {
        self.mappingVersion = mappingVersion
        self.lineRefs = lineRefs
        self.status = status
    }

    public enum CodingKeys: String, CodingKey { 
        case mappingVersion = "mapping_version"
        case lineRefs = "line_refs"
        case status
    }

}
