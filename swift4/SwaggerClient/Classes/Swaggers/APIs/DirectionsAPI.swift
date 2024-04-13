//
// DirectionsAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class DirectionsAPI {
    /**
     View all routes for a direction of travel
     - parameter directionId: (path) Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}      - parameter token: (query) Please ignore (optional)     - parameter devid: (query) Your developer id (optional)     - parameter signature: (query) Authentication signature for request (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func directionsForDirection(directionId: Int, token: String? = nil, devid: String? = nil, signature: String? = nil, completion: @escaping ((_ data: V3DirectionsResponse?,_ error: Error?) -> Void)) {
        directionsForDirectionWithRequestBuilder(directionId: directionId, token: token, devid: devid, signature: signature).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     View all routes for a direction of travel
     - GET /v3/directions/{direction_id}
     - examples: [{contentType=application/json, example={
  "directions" : [ {
    "direction_id" : 0,
    "route_id" : 6,
    "route_type" : 1,
    "direction_name" : "direction_name",
    "route_direction_description" : "route_direction_description"
  }, {
    "direction_id" : 0,
    "route_id" : 6,
    "route_type" : 1,
    "direction_name" : "direction_name",
    "route_direction_description" : "route_direction_description"
  } ],
  "status" : {
    "health" : 6,
    "version" : "version"
  }
}}]
     - parameter directionId: (path) Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}      - parameter token: (query) Please ignore (optional)     - parameter devid: (query) Your developer id (optional)     - parameter signature: (query) Authentication signature for request (optional)

     - returns: RequestBuilder<V3DirectionsResponse> 
     */
    open class func directionsForDirectionWithRequestBuilder(directionId: Int, token: String? = nil, devid: String? = nil, signature: String? = nil) -> RequestBuilder<V3DirectionsResponse> {
        var path = "/v3/directions/{direction_id}"
        let directionIdPreEscape = "\(directionId)"
        let directionIdPostEscape = directionIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{direction_id}", with: directionIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "token": token, 
                        "devid": devid, 
                        "signature": signature
        ])

        let requestBuilder: RequestBuilder<V3DirectionsResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     * enum for parameter routeType
     */
    public enum RouteType_directionsForDirectionAndType: Int { 
        case _0 = 0
        case _1 = 1
        case _2 = 2
        case _3 = 3
        case _4 = 4
    }

    /**
     View all routes of a particular type for a direction of travel
     - parameter directionId: (path) Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}      - parameter routeType: (path) Number identifying transport mode; values returned via RouteTypes API      - parameter token: (query) Please ignore (optional)     - parameter devid: (query) Your developer id (optional)     - parameter signature: (query) Authentication signature for request (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func directionsForDirectionAndType(directionId: Int, routeType: RouteType_directionsForDirectionAndType, token: String? = nil, devid: String? = nil, signature: String? = nil, completion: @escaping ((_ data: V3DirectionsResponse?,_ error: Error?) -> Void)) {
        directionsForDirectionAndTypeWithRequestBuilder(directionId: directionId, routeType: routeType, token: token, devid: devid, signature: signature).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     View all routes of a particular type for a direction of travel
     - GET /v3/directions/{direction_id}/route_type/{route_type}
     - examples: [{contentType=application/json, example={
  "directions" : [ {
    "direction_id" : 0,
    "route_id" : 6,
    "route_type" : 1,
    "direction_name" : "direction_name",
    "route_direction_description" : "route_direction_description"
  }, {
    "direction_id" : 0,
    "route_id" : 6,
    "route_type" : 1,
    "direction_name" : "direction_name",
    "route_direction_description" : "route_direction_description"
  } ],
  "status" : {
    "health" : 6,
    "version" : "version"
  }
}}]
     - parameter directionId: (path) Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}      - parameter routeType: (path) Number identifying transport mode; values returned via RouteTypes API      - parameter token: (query) Please ignore (optional)     - parameter devid: (query) Your developer id (optional)     - parameter signature: (query) Authentication signature for request (optional)

     - returns: RequestBuilder<V3DirectionsResponse> 
     */
    open class func directionsForDirectionAndTypeWithRequestBuilder(directionId: Int, routeType: RouteType_directionsForDirectionAndType, token: String? = nil, devid: String? = nil, signature: String? = nil) -> RequestBuilder<V3DirectionsResponse> {
        var path = "/v3/directions/{direction_id}/route_type/{route_type}"
        let directionIdPreEscape = "\(directionId)"
        let directionIdPostEscape = directionIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{direction_id}", with: directionIdPostEscape, options: .literal, range: nil)
        let routeTypePreEscape = "\(routeType.rawValue)"
        let routeTypePostEscape = routeTypePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{route_type}", with: routeTypePostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "token": token, 
                        "devid": devid, 
                        "signature": signature
        ])

        let requestBuilder: RequestBuilder<V3DirectionsResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     View directions that a route travels in
     - parameter routeId: (path) Identifier of route; values returned by Routes API - v3/routes      - parameter token: (query) Please ignore (optional)     - parameter devid: (query) Your developer id (optional)     - parameter signature: (query) Authentication signature for request (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func directionsForRoute(routeId: Int, token: String? = nil, devid: String? = nil, signature: String? = nil, completion: @escaping ((_ data: V3DirectionsResponse?,_ error: Error?) -> Void)) {
        directionsForRouteWithRequestBuilder(routeId: routeId, token: token, devid: devid, signature: signature).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     View directions that a route travels in
     - GET /v3/directions/route/{route_id}
     - examples: [{contentType=application/json, example={
  "directions" : [ {
    "direction_id" : 0,
    "route_id" : 6,
    "route_type" : 1,
    "direction_name" : "direction_name",
    "route_direction_description" : "route_direction_description"
  }, {
    "direction_id" : 0,
    "route_id" : 6,
    "route_type" : 1,
    "direction_name" : "direction_name",
    "route_direction_description" : "route_direction_description"
  } ],
  "status" : {
    "health" : 6,
    "version" : "version"
  }
}}]
     - parameter routeId: (path) Identifier of route; values returned by Routes API - v3/routes      - parameter token: (query) Please ignore (optional)     - parameter devid: (query) Your developer id (optional)     - parameter signature: (query) Authentication signature for request (optional)

     - returns: RequestBuilder<V3DirectionsResponse> 
     */
    open class func directionsForRouteWithRequestBuilder(routeId: Int, token: String? = nil, devid: String? = nil, signature: String? = nil) -> RequestBuilder<V3DirectionsResponse> {
        var path = "/v3/directions/route/{route_id}"
        let routeIdPreEscape = "\(routeId)"
        let routeIdPostEscape = routeIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{route_id}", with: routeIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "token": token, 
                        "devid": devid, 
                        "signature": signature
        ])

        let requestBuilder: RequestBuilder<V3DirectionsResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
