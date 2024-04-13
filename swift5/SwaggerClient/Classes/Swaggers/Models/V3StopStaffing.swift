//
// V3StopStaffing.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct V3StopStaffing: Codable {

    /** Stop staffing hours */
    public var friAmFrom: String?
    /** Stop staffing hours */
    public var friAmTo: String?
    /** Stop staffing hours */
    public var friPmFrom: String?
    /** Stop staffing hours */
    public var friPmTo: String?
    /** Stop staffing hours */
    public var monAmFrom: String?
    /** Stop staffing hours */
    public var monAmTo: String?
    /** Stop staffing hours */
    public var monPmFrom: String?
    /** Stop staffing hours */
    public var monPmTo: String?
    /** Stop staffing hours */
    public var phAdditionalText: String?
    /** Stop staffing hours */
    public var phFrom: String?
    /** Stop staffing hours */
    public var phTo: String?
    /** Stop staffing hours */
    public var satAmFrom: String?
    /** Stop staffing hours */
    public var satAmTo: String?
    /** Stop staffing hours */
    public var satPmFrom: String?
    /** Stop staffing hours */
    public var satPmTo: String?
    /** Stop staffing hours */
    public var sunAmFrom: String?
    /** Stop staffing hours */
    public var sunAmTo: String?
    /** Stop staffing hours */
    public var sunPmFrom: String?
    /** Stop staffing hours */
    public var sunPmTo: String?
    /** Stop staffing hours */
    public var thuAmFrom: String?
    /** Stop staffing hours */
    public var thuAmTo: String?
    /** Stop staffing hours */
    public var thuPmFrom: String?
    /** Stop staffing hours */
    public var thuPmTo: String?
    /** Stop staffing hours */
    public var tueAmFrom: String?
    /** Stop staffing hours */
    public var tueAmTo: String?
    /** Stop staffing hours */
    public var tuePmFrom: String?
    /** Stop staffing hours */
    public var tuePmTo: String?
    /** Stop staffing hours */
    public var wedAmFrom: String?
    /** Stop staffing hours */
    public var wedAmTo: String?
    /** Stop staffing hours */
    public var wedPmFrom: String?
    /** Stop staffing hours */
    public var wedPmTo: String?

    public init(friAmFrom: String? = nil, friAmTo: String? = nil, friPmFrom: String? = nil, friPmTo: String? = nil, monAmFrom: String? = nil, monAmTo: String? = nil, monPmFrom: String? = nil, monPmTo: String? = nil, phAdditionalText: String? = nil, phFrom: String? = nil, phTo: String? = nil, satAmFrom: String? = nil, satAmTo: String? = nil, satPmFrom: String? = nil, satPmTo: String? = nil, sunAmFrom: String? = nil, sunAmTo: String? = nil, sunPmFrom: String? = nil, sunPmTo: String? = nil, thuAmFrom: String? = nil, thuAmTo: String? = nil, thuPmFrom: String? = nil, thuPmTo: String? = nil, tueAmFrom: String? = nil, tueAmTo: String? = nil, tuePmFrom: String? = nil, tuePmTo: String? = nil, wedAmFrom: String? = nil, wedAmTo: String? = nil, wedPmFrom: String? = nil, wedPmTo: String? = nil) {
        self.friAmFrom = friAmFrom
        self.friAmTo = friAmTo
        self.friPmFrom = friPmFrom
        self.friPmTo = friPmTo
        self.monAmFrom = monAmFrom
        self.monAmTo = monAmTo
        self.monPmFrom = monPmFrom
        self.monPmTo = monPmTo
        self.phAdditionalText = phAdditionalText
        self.phFrom = phFrom
        self.phTo = phTo
        self.satAmFrom = satAmFrom
        self.satAmTo = satAmTo
        self.satPmFrom = satPmFrom
        self.satPmTo = satPmTo
        self.sunAmFrom = sunAmFrom
        self.sunAmTo = sunAmTo
        self.sunPmFrom = sunPmFrom
        self.sunPmTo = sunPmTo
        self.thuAmFrom = thuAmFrom
        self.thuAmTo = thuAmTo
        self.thuPmFrom = thuPmFrom
        self.thuPmTo = thuPmTo
        self.tueAmFrom = tueAmFrom
        self.tueAmTo = tueAmTo
        self.tuePmFrom = tuePmFrom
        self.tuePmTo = tuePmTo
        self.wedAmFrom = wedAmFrom
        self.wedAmTo = wedAmTo
        self.wedPmFrom = wedPmFrom
        self.wedPmTo = wedPmTo
    }

    public enum CodingKeys: String, CodingKey { 
        case friAmFrom = "fri_am_from"
        case friAmTo = "fri_am_to"
        case friPmFrom = "fri_pm_from"
        case friPmTo = "fri_pm_to"
        case monAmFrom = "mon_am_from"
        case monAmTo = "mon_am_to"
        case monPmFrom = "mon_pm_from"
        case monPmTo = "mon_pm_to"
        case phAdditionalText = "ph_additional_text"
        case phFrom = "ph_from"
        case phTo = "ph_to"
        case satAmFrom = "sat_am_from"
        case satAmTo = "sat_am_to"
        case satPmFrom = "sat_pm_from"
        case satPmTo = "sat_pm_to"
        case sunAmFrom = "sun_am_from"
        case sunAmTo = "sun_am_to"
        case sunPmFrom = "sun_pm_from"
        case sunPmTo = "sun_pm_to"
        case thuAmFrom = "thu_am_from"
        case thuAmTo = "thu_am_to"
        case thuPmFrom = "thu_pm_from"
        case thuPmTo = "thu_pm_to"
        case tueAmFrom = "tue_am_from"
        case tueAmTo = "tue_am_to"
        case tuePmFrom = "tue_pm_from"
        case tuePmTo = "tue_pm_to"
        case wedAmFrom = "wed_am_from"
        case wedAmTo = "wed_am_to"
        case wedPmFrom = "wed_pm_from"
        case wedPmTo = "wed_pm_To"
    }

}
