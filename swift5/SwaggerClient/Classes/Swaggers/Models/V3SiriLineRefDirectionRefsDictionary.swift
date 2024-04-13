//
// V3SiriLineRefDirectionRefsDictionary.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct V3SiriLineRefDirectionRefsDictionary: Codable {

    public var directionRefs: [String:[V3SiriReferenceDataDetail]]?
    public var unmatchedDirectionRefs: [String:String]?

    public init(directionRefs: [String:[V3SiriReferenceDataDetail]]? = nil, unmatchedDirectionRefs: [String:String]? = nil) {
        self.directionRefs = directionRefs
        self.unmatchedDirectionRefs = unmatchedDirectionRefs
    }

    public enum CodingKeys: String, CodingKey { 
        case directionRefs = "direction_refs"
        case unmatchedDirectionRefs = "unmatched_direction_refs"
    }

}
