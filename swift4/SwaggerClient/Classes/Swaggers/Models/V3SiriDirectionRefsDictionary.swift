//
// V3SiriDirectionRefsDictionary.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct V3SiriDirectionRefsDictionary: Codable {


    public var directionRefs: [String:V3SiriStopsRefsDictionary]?
    public init(directionRefs: [String:V3SiriStopsRefsDictionary]? = nil) { 
        self.directionRefs = directionRefs
    }
    public enum CodingKeys: String, CodingKey { 
        case directionRefs = "direction_refs"
    }

}
