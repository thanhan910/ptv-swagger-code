//
// V3Outlet.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct V3Outlet: Codable {


    /** The SLID / SPID */
    public var outletSlidSpid: String?

    /** The location name of the outlet */
    public var outletName: String?

    /** The business name of the outlet */
    public var outletBusiness: String?

    /** Geographic coordinate of latitude at outlet */
    public var outletLatitude: Float?

    /** Geographic coordinate of longitude at outlet */
    public var outletLongitude: Float?

    /** The city/municipality the outlet is in */
    public var outletSuburb: String?

    /** The postcode for the outlet */
    public var outletPostcode: Int?

    /** The business hours on Monday */
    public var outletBusinessHourMon: String?

    /** The business hours on Tuesday */
    public var outletBusinessHourTue: String?

    /** The business hours on Wednesday */
    public var outletBusinessHourWed: String?

    /** The business hours on Thursday */
    public var outletBusinessHourThur: String?

    /** The business hours on Friday */
    public var outletBusinessHourFri: String?

    /** The business hours on Saturday */
    public var outletBusinessHourSat: String?

    /** The business hours on Sunday */
    public var outletBusinessHourSun: String?

    /** Any additional notes for the outlet such as &#x27;Buy pre-loaded myki cards only&#x27;. May be null/empty. */
    public var outletNotes: String?
    public init(outletSlidSpid: String? = nil, outletName: String? = nil, outletBusiness: String? = nil, outletLatitude: Float? = nil, outletLongitude: Float? = nil, outletSuburb: String? = nil, outletPostcode: Int? = nil, outletBusinessHourMon: String? = nil, outletBusinessHourTue: String? = nil, outletBusinessHourWed: String? = nil, outletBusinessHourThur: String? = nil, outletBusinessHourFri: String? = nil, outletBusinessHourSat: String? = nil, outletBusinessHourSun: String? = nil, outletNotes: String? = nil) { 
        self.outletSlidSpid = outletSlidSpid
        self.outletName = outletName
        self.outletBusiness = outletBusiness
        self.outletLatitude = outletLatitude
        self.outletLongitude = outletLongitude
        self.outletSuburb = outletSuburb
        self.outletPostcode = outletPostcode
        self.outletBusinessHourMon = outletBusinessHourMon
        self.outletBusinessHourTue = outletBusinessHourTue
        self.outletBusinessHourWed = outletBusinessHourWed
        self.outletBusinessHourThur = outletBusinessHourThur
        self.outletBusinessHourFri = outletBusinessHourFri
        self.outletBusinessHourSat = outletBusinessHourSat
        self.outletBusinessHourSun = outletBusinessHourSun
        self.outletNotes = outletNotes
    }
    public enum CodingKeys: String, CodingKey { 
        case outletSlidSpid = "outlet_slid_spid"
        case outletName = "outlet_name"
        case outletBusiness = "outlet_business"
        case outletLatitude = "outlet_latitude"
        case outletLongitude = "outlet_longitude"
        case outletSuburb = "outlet_suburb"
        case outletPostcode = "outlet_postcode"
        case outletBusinessHourMon = "outlet_business_hour_mon"
        case outletBusinessHourTue = "outlet_business_hour_tue"
        case outletBusinessHourWed = "outlet_business_hour_wed"
        case outletBusinessHourThur = "outlet_business_hour_thur"
        case outletBusinessHourFri = "outlet_business_hour_fri"
        case outletBusinessHourSat = "outlet_business_hour_sat"
        case outletBusinessHourSun = "outlet_business_hour_sun"
        case outletNotes = "outlet_notes"
    }

}
