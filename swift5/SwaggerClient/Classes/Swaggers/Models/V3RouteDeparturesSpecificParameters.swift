//
// V3RouteDeparturesSpecificParameters.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct V3RouteDeparturesSpecificParameters: Codable {

    public enum Expand: String, Codable { 
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
    /** DEPRECATED - use &#x60;scheduled_timetables&#x60; instead */
    public var trainScheduledTimetables: Bool?
    /** When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available. */
    public var scheduledTimetables: Bool?
    /** Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) */
    public var dateUtc: Date?
    /** Maximum number of results returned */
    public var maxResults: Int?
    /** Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only */
    public var includeCancelled: Bool?
    /** Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. */
    public var lookBackwards: Bool?
    /** List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. */
    public var expand: [Expand]?
    /** Indicates if the route geopath should be returned */
    public var includeGeopath: Bool?

    public init(trainScheduledTimetables: Bool? = nil, scheduledTimetables: Bool? = nil, dateUtc: Date? = nil, maxResults: Int? = nil, includeCancelled: Bool? = nil, lookBackwards: Bool? = nil, expand: [Expand]? = nil, includeGeopath: Bool? = nil) {
        self.trainScheduledTimetables = trainScheduledTimetables
        self.scheduledTimetables = scheduledTimetables
        self.dateUtc = dateUtc
        self.maxResults = maxResults
        self.includeCancelled = includeCancelled
        self.lookBackwards = lookBackwards
        self.expand = expand
        self.includeGeopath = includeGeopath
    }

    public enum CodingKeys: String, CodingKey { 
        case trainScheduledTimetables = "train_scheduled_timetables"
        case scheduledTimetables = "scheduled_timetables"
        case dateUtc = "date_utc"
        case maxResults = "max_results"
        case includeCancelled = "include_cancelled"
        case lookBackwards = "look_backwards"
        case expand
        case includeGeopath = "include_geopath"
    }

}
