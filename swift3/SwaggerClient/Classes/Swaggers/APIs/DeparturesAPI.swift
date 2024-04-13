//
// DeparturesAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class DeparturesAPI: APIBase {
    /**
     * enum for parameter routeType
     */
    public enum RouteType_departuresGetForStop: Int32 { 
        case _0 = 0
        case _1 = 1
        case _2 = 2
        case _3 = 3
        case _4 = 4
    }

    /**
     * enum for parameter expand
     */
    public enum Expand_departuresGetForStop: String { 
        case all = "All"
        case stop = "Stop"
        case route = "Route"
        case run = "Run"
        case direction = "Direction"
        case disruption = "Disruption"
        case vehicleDescriptor = "VehicleDescriptor"
        case vehiclePosition = "VehiclePosition"
        case _none = "None"
    }

    /**
     View departures for all routes from a stop
     - parameter routeType: (path) Number identifying transport mode; values returned via RouteTypes API 
     - parameter stopId: (path) Identifier of stop; values returned by Stops API 
     - parameter platformNumbers: (query) Filter by platform number at stop (optional)
     - parameter directionId: (query) Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
     - parameter gtfs: (query) Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data (optional)
     - parameter dateUtc: (query) Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) (optional)
     - parameter maxResults: (query) Maximum number of results returned (optional)
     - parameter includeCancelled: (query) Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only (optional)
     - parameter lookBackwards: (query) Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. (optional)
     - parameter expand: (query) List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
     - parameter includeGeopath: (query) Indicates if the route geopath should be returned (optional)
     - parameter token: (query) Please ignore (optional)
     - parameter devid: (query) Your developer id (optional)
     - parameter signature: (query) Authentication signature for request (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func departuresGetForStop(routeType: RouteType_departuresGetForStop, stopId: Int32, platformNumbers: [Int32]? = nil, directionId: Int32? = nil, gtfs: Bool? = nil, dateUtc: Date? = nil, maxResults: Int32? = nil, includeCancelled: Bool? = nil, lookBackwards: Bool? = nil, expand: [String]? = nil, includeGeopath: Bool? = nil, token: String? = nil, devid: String? = nil, signature: String? = nil, completion: @escaping ((_ data: V3DeparturesResponse?, _ error: ErrorResponse?) -> Void)) {
        departuresGetForStopWithRequestBuilder(routeType: routeType, stopId: stopId, platformNumbers: platformNumbers, directionId: directionId, gtfs: gtfs, dateUtc: dateUtc, maxResults: maxResults, includeCancelled: includeCancelled, lookBackwards: lookBackwards, expand: expand, includeGeopath: includeGeopath, token: token, devid: devid, signature: signature).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     View departures for all routes from a stop
     - GET /v3/departures/route_type/{route_type}/stop/{stop_id}

     - examples: [{contentType=application/json, example={
  "routes" : {
    "key" : { }
  },
  "directions" : {
    "key" : {
      "direction_id" : 9,
      "route_id" : 6,
      "route_type" : 3,
      "direction_name" : "direction_name"
    }
  },
  "disruptions" : {
    "key" : {
      "last_updated" : "2000-01-23T04:56:07.000+00:00",
      "from_date" : "2000-01-23T04:56:07.000+00:00",
      "disruption_type" : "disruption_type",
      "published_on" : "2000-01-23T04:56:07.000+00:00",
      "description" : "description",
      "display_on_board" : true,
      "title" : "title",
      "url" : "url",
      "routes" : [ {
        "route_id" : 2,
        "route_name" : "route_name",
        "route_type" : 1,
        "route_number" : "route_number",
        "route_gtfs_id" : "route_gtfs_id",
        "direction" : {
          "service_time" : "service_time",
          "direction_id" : 6,
          "direction_name" : "direction_name",
          "route_direction_id" : 6
        }
      }, {
        "route_id" : 2,
        "route_name" : "route_name",
        "route_type" : 1,
        "route_number" : "route_number",
        "route_gtfs_id" : "route_gtfs_id",
        "direction" : {
          "service_time" : "service_time",
          "direction_id" : 6,
          "direction_name" : "direction_name",
          "route_direction_id" : 6
        }
      } ],
      "disruption_id" : 6,
      "colour" : "colour",
      "to_date" : "2000-01-23T04:56:07.000+00:00",
      "disruption_status" : "disruption_status",
      "stops" : [ {
        "stop_id" : 5,
        "stop_name" : "stop_name"
      }, {
        "stop_id" : 5,
        "stop_name" : "stop_name"
      } ],
      "display_status" : true
    }
  },
  "stops" : {
    "key" : {
      "stop_longitude" : 4.145608,
      "stop_sequence" : 7,
      "stop_id" : 9,
      "route_type" : 3,
      "stop_landmark" : "stop_landmark",
      "stop_suburb" : "stop_suburb",
      "stop_distance" : 7.0614014,
      "stop_name" : "stop_name",
      "stop_latitude" : 2.027123
    }
  },
  "departures" : [ {
    "scheduled_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "direction_id" : 5,
    "route_id" : 6,
    "run_id" : 1,
    "estimated_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "departure_sequence" : 2,
    "stop_id" : 0,
    "run_ref" : "run_ref",
    "platform_number" : "platform_number",
    "flags" : "flags",
    "disruption_ids" : [ 5, 5 ],
    "at_platform" : true
  }, {
    "scheduled_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "direction_id" : 5,
    "route_id" : 6,
    "run_id" : 1,
    "estimated_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "departure_sequence" : 2,
    "stop_id" : 0,
    "run_ref" : "run_ref",
    "platform_number" : "platform_number",
    "flags" : "flags",
    "disruption_ids" : [ 5, 5 ],
    "at_platform" : true
  } ],
  "runs" : {
    "key" : {
      "run_id" : 1,
      "route_id" : 1,
      "final_stop_id" : 6,
      "destination_name" : "destination_name",
      "vehicle_descriptor" : {
        "low_floor" : true,
        "air_conditioned" : true,
        "supplier" : "supplier",
        "length" : "length",
        "description" : "description",
        "id" : "id",
        "operator" : "operator"
      },
      "run_sequence" : 1,
      "direction_id" : 7,
      "run_ref" : "run_ref",
      "route_type" : 1,
      "vehicle_position" : {
        "easting" : 9.369310271410669,
        "bearing" : 8.762042012749001,
        "datetime_utc" : "2000-01-23T04:56:07.000+00:00",
        "latitude" : 5.025004791520295,
        "supplier" : "supplier",
        "expiry_time" : "2000-01-23T04:56:07.000+00:00",
        "northing" : 6.683562403749608,
        "longitude" : 9.965781217890562,
        "direction" : "direction"
      },
      "express_stop_count" : 4,
      "geopath" : [ { }, { } ],
      "status" : "status"
    }
  },
  "status" : {
    "health" : 6,
    "version" : "version"
  }
}}]
     - parameter routeType: (path) Number identifying transport mode; values returned via RouteTypes API 
     - parameter stopId: (path) Identifier of stop; values returned by Stops API 
     - parameter platformNumbers: (query) Filter by platform number at stop (optional)
     - parameter directionId: (query) Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
     - parameter gtfs: (query) Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data (optional)
     - parameter dateUtc: (query) Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) (optional)
     - parameter maxResults: (query) Maximum number of results returned (optional)
     - parameter includeCancelled: (query) Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only (optional)
     - parameter lookBackwards: (query) Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. (optional)
     - parameter expand: (query) List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
     - parameter includeGeopath: (query) Indicates if the route geopath should be returned (optional)
     - parameter token: (query) Please ignore (optional)
     - parameter devid: (query) Your developer id (optional)
     - parameter signature: (query) Authentication signature for request (optional)
     - returns: RequestBuilder<V3DeparturesResponse> 
     */
    open class func departuresGetForStopWithRequestBuilder(routeType: RouteType_departuresGetForStop, stopId: Int32, platformNumbers: [Int32]? = nil, directionId: Int32? = nil, gtfs: Bool? = nil, dateUtc: Date? = nil, maxResults: Int32? = nil, includeCancelled: Bool? = nil, lookBackwards: Bool? = nil, expand: [String]? = nil, includeGeopath: Bool? = nil, token: String? = nil, devid: String? = nil, signature: String? = nil) -> RequestBuilder<V3DeparturesResponse> {
        var path = "/v3/departures/route_type/{route_type}/stop/{stop_id}"
        let routeTypePreEscape = "\(routeType.rawValue)"
        let routeTypePostEscape = routeTypePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{route_type}", with: routeTypePostEscape, options: .literal, range: nil)
        let stopIdPreEscape = "\(stopId)"
        let stopIdPostEscape = stopIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{stop_id}", with: stopIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "platform_numbers": platformNumbers,
                        "direction_id": directionId?.encodeToJSON(),
                        "gtfs": gtfs,
                        "date_utc": dateUtc?.encodeToJSON(),
                        "max_results": maxResults?.encodeToJSON(),
                        "include_cancelled": includeCancelled,
                        "look_backwards": lookBackwards,
                        "expand": expand,
                        "include_geopath": includeGeopath,
                        "token": token,
                        "devid": devid,
                        "signature": signature
        ])

        let requestBuilder: RequestBuilder<V3DeparturesResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     * enum for parameter routeType
     */
    public enum RouteType_departuresGetForStopAndRoute: Int32 { 
        case _0 = 0
        case _1 = 1
        case _2 = 2
        case _3 = 3
        case _4 = 4
    }

    /**
     * enum for parameter expand
     */
    public enum Expand_departuresGetForStopAndRoute: String { 
        case all = "All"
        case stop = "Stop"
        case route = "Route"
        case run = "Run"
        case direction = "Direction"
        case disruption = "Disruption"
        case vehicleDescriptor = "VehicleDescriptor"
        case vehiclePosition = "VehiclePosition"
        case _none = "None"
    }

    /**
     View departures for a specific route from a stop
     - parameter routeType: (path) Number identifying transport mode; values returned via RouteTypes API 
     - parameter stopId: (path) Identifier of stop; values returned by Stops API 
     - parameter routeId: (path) Identifier of route; values returned by Routes API - v3/routes 
     - parameter directionId: (query) Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
     - parameter gtfs: (query) Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data (optional)
     - parameter dateUtc: (query) Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) (optional)
     - parameter maxResults: (query) Maximum number of results returned (optional)
     - parameter includeCancelled: (query) Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only (optional)
     - parameter lookBackwards: (query) Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. (optional)
     - parameter expand: (query) List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
     - parameter includeGeopath: (query) Indicates if the route geopath should be returned (optional)
     - parameter token: (query) Please ignore (optional)
     - parameter devid: (query) Your developer id (optional)
     - parameter signature: (query) Authentication signature for request (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func departuresGetForStopAndRoute(routeType: RouteType_departuresGetForStopAndRoute, stopId: Int32, routeId: String, directionId: Int32? = nil, gtfs: Bool? = nil, dateUtc: Date? = nil, maxResults: Int32? = nil, includeCancelled: Bool? = nil, lookBackwards: Bool? = nil, expand: [String]? = nil, includeGeopath: Bool? = nil, token: String? = nil, devid: String? = nil, signature: String? = nil, completion: @escaping ((_ data: V3DeparturesResponse?, _ error: ErrorResponse?) -> Void)) {
        departuresGetForStopAndRouteWithRequestBuilder(routeType: routeType, stopId: stopId, routeId: routeId, directionId: directionId, gtfs: gtfs, dateUtc: dateUtc, maxResults: maxResults, includeCancelled: includeCancelled, lookBackwards: lookBackwards, expand: expand, includeGeopath: includeGeopath, token: token, devid: devid, signature: signature).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     View departures for a specific route from a stop
     - GET /v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id}

     - examples: [{contentType=application/json, example={
  "routes" : {
    "key" : { }
  },
  "directions" : {
    "key" : {
      "direction_id" : 9,
      "route_id" : 6,
      "route_type" : 3,
      "direction_name" : "direction_name"
    }
  },
  "disruptions" : {
    "key" : {
      "last_updated" : "2000-01-23T04:56:07.000+00:00",
      "from_date" : "2000-01-23T04:56:07.000+00:00",
      "disruption_type" : "disruption_type",
      "published_on" : "2000-01-23T04:56:07.000+00:00",
      "description" : "description",
      "display_on_board" : true,
      "title" : "title",
      "url" : "url",
      "routes" : [ {
        "route_id" : 2,
        "route_name" : "route_name",
        "route_type" : 1,
        "route_number" : "route_number",
        "route_gtfs_id" : "route_gtfs_id",
        "direction" : {
          "service_time" : "service_time",
          "direction_id" : 6,
          "direction_name" : "direction_name",
          "route_direction_id" : 6
        }
      }, {
        "route_id" : 2,
        "route_name" : "route_name",
        "route_type" : 1,
        "route_number" : "route_number",
        "route_gtfs_id" : "route_gtfs_id",
        "direction" : {
          "service_time" : "service_time",
          "direction_id" : 6,
          "direction_name" : "direction_name",
          "route_direction_id" : 6
        }
      } ],
      "disruption_id" : 6,
      "colour" : "colour",
      "to_date" : "2000-01-23T04:56:07.000+00:00",
      "disruption_status" : "disruption_status",
      "stops" : [ {
        "stop_id" : 5,
        "stop_name" : "stop_name"
      }, {
        "stop_id" : 5,
        "stop_name" : "stop_name"
      } ],
      "display_status" : true
    }
  },
  "stops" : {
    "key" : {
      "stop_longitude" : 4.145608,
      "stop_sequence" : 7,
      "stop_id" : 9,
      "route_type" : 3,
      "stop_landmark" : "stop_landmark",
      "stop_suburb" : "stop_suburb",
      "stop_distance" : 7.0614014,
      "stop_name" : "stop_name",
      "stop_latitude" : 2.027123
    }
  },
  "departures" : [ {
    "scheduled_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "direction_id" : 5,
    "route_id" : 6,
    "run_id" : 1,
    "estimated_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "departure_sequence" : 2,
    "stop_id" : 0,
    "run_ref" : "run_ref",
    "platform_number" : "platform_number",
    "flags" : "flags",
    "disruption_ids" : [ 5, 5 ],
    "at_platform" : true
  }, {
    "scheduled_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "direction_id" : 5,
    "route_id" : 6,
    "run_id" : 1,
    "estimated_departure_utc" : "2000-01-23T04:56:07.000+00:00",
    "departure_sequence" : 2,
    "stop_id" : 0,
    "run_ref" : "run_ref",
    "platform_number" : "platform_number",
    "flags" : "flags",
    "disruption_ids" : [ 5, 5 ],
    "at_platform" : true
  } ],
  "runs" : {
    "key" : {
      "run_id" : 1,
      "route_id" : 1,
      "final_stop_id" : 6,
      "destination_name" : "destination_name",
      "vehicle_descriptor" : {
        "low_floor" : true,
        "air_conditioned" : true,
        "supplier" : "supplier",
        "length" : "length",
        "description" : "description",
        "id" : "id",
        "operator" : "operator"
      },
      "run_sequence" : 1,
      "direction_id" : 7,
      "run_ref" : "run_ref",
      "route_type" : 1,
      "vehicle_position" : {
        "easting" : 9.369310271410669,
        "bearing" : 8.762042012749001,
        "datetime_utc" : "2000-01-23T04:56:07.000+00:00",
        "latitude" : 5.025004791520295,
        "supplier" : "supplier",
        "expiry_time" : "2000-01-23T04:56:07.000+00:00",
        "northing" : 6.683562403749608,
        "longitude" : 9.965781217890562,
        "direction" : "direction"
      },
      "express_stop_count" : 4,
      "geopath" : [ { }, { } ],
      "status" : "status"
    }
  },
  "status" : {
    "health" : 6,
    "version" : "version"
  }
}}]
     - parameter routeType: (path) Number identifying transport mode; values returned via RouteTypes API 
     - parameter stopId: (path) Identifier of stop; values returned by Stops API 
     - parameter routeId: (path) Identifier of route; values returned by Routes API - v3/routes 
     - parameter directionId: (query) Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
     - parameter gtfs: (query) Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data (optional)
     - parameter dateUtc: (query) Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) (optional)
     - parameter maxResults: (query) Maximum number of results returned (optional)
     - parameter includeCancelled: (query) Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only (optional)
     - parameter lookBackwards: (query) Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. (optional)
     - parameter expand: (query) List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
     - parameter includeGeopath: (query) Indicates if the route geopath should be returned (optional)
     - parameter token: (query) Please ignore (optional)
     - parameter devid: (query) Your developer id (optional)
     - parameter signature: (query) Authentication signature for request (optional)
     - returns: RequestBuilder<V3DeparturesResponse> 
     */
    open class func departuresGetForStopAndRouteWithRequestBuilder(routeType: RouteType_departuresGetForStopAndRoute, stopId: Int32, routeId: String, directionId: Int32? = nil, gtfs: Bool? = nil, dateUtc: Date? = nil, maxResults: Int32? = nil, includeCancelled: Bool? = nil, lookBackwards: Bool? = nil, expand: [String]? = nil, includeGeopath: Bool? = nil, token: String? = nil, devid: String? = nil, signature: String? = nil) -> RequestBuilder<V3DeparturesResponse> {
        var path = "/v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id}"
        let routeTypePreEscape = "\(routeType.rawValue)"
        let routeTypePostEscape = routeTypePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{route_type}", with: routeTypePostEscape, options: .literal, range: nil)
        let stopIdPreEscape = "\(stopId)"
        let stopIdPostEscape = stopIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{stop_id}", with: stopIdPostEscape, options: .literal, range: nil)
        let routeIdPreEscape = "\(routeId)"
        let routeIdPostEscape = routeIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{route_id}", with: routeIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
                        "direction_id": directionId?.encodeToJSON(),
                        "gtfs": gtfs,
                        "date_utc": dateUtc?.encodeToJSON(),
                        "max_results": maxResults?.encodeToJSON(),
                        "include_cancelled": includeCancelled,
                        "look_backwards": lookBackwards,
                        "expand": expand,
                        "include_geopath": includeGeopath,
                        "token": token,
                        "devid": devid,
                        "signature": signature
        ])

        let requestBuilder: RequestBuilder<V3DeparturesResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
