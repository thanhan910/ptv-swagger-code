//
// V3RunResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct V3RunResponse: Codable {


    public var run: V3Run?

    public var status: V3Status?
    public init(run: V3Run? = nil, status: V3Status? = nil) { 
        self.run = run
        self.status = status
    }

}
