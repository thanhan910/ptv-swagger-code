//
// V3OutletResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct V3OutletResponse: Codable {


    /** myki ticket outlets */
    public var outlets: [V3Outlet]?

    public var status: V3Status?
    public init(outlets: [V3Outlet]? = nil, status: V3Status? = nil) { 
        self.outlets = outlets
        self.status = status
    }

}
