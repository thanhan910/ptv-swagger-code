//
// V3OutletParameters.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct V3OutletParameters: Codable {

    /** Maximum number of results returned (default &#x3D; 30) */
    public var maxResults: Int?

    public init(maxResults: Int? = nil) {
        self.maxResults = maxResults
    }

    public enum CodingKeys: String, CodingKey { 
        case maxResults = "max_results"
    }

}
