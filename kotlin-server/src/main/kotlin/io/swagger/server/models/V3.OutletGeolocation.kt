/**
* PTV Timetable API - Version 3
* The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
*
* OpenAPI spec version: v3
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/package io.swagger.server.models


/**
 * 
 * @param outletDistance Distance of outlet from input location (in metres); returns 0 if no location is input
 * @param outletSlidSpid The SLID / SPID
 * @param outletName The location name of the outlet
 * @param outletBusiness The business name of the outlet
 * @param outletLatitude Geographic coordinate of latitude at outlet
 * @param outletLongitude Geographic coordinate of longitude at outlet
 * @param outletSuburb The city/municipality the outlet is in
 * @param outletPostcode The postcode for the outlet
 * @param outletBusinessHourMon The business hours on Monday
 * @param outletBusinessHourTue The business hours on Tuesday
 * @param outletBusinessHourWed The business hours on Wednesday
 * @param outletBusinessHourThur The business hours on Thursday
 * @param outletBusinessHourFri The business hours on Friday
 * @param outletBusinessHourSat The business hours on Saturday
 * @param outletBusinessHourSun The business hours on Sunday
 * @param outletNotes Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.
 */
data class V3OutletGeolocation (

    /* Distance of outlet from input location (in metres); returns 0 if no location is input */
    val outletDistance: kotlin.Float? = null,
    /* The SLID / SPID */
    val outletSlidSpid: kotlin.String? = null,
    /* The location name of the outlet */
    val outletName: kotlin.String? = null,
    /* The business name of the outlet */
    val outletBusiness: kotlin.String? = null,
    /* Geographic coordinate of latitude at outlet */
    val outletLatitude: kotlin.Float? = null,
    /* Geographic coordinate of longitude at outlet */
    val outletLongitude: kotlin.Float? = null,
    /* The city/municipality the outlet is in */
    val outletSuburb: kotlin.String? = null,
    /* The postcode for the outlet */
    val outletPostcode: kotlin.Int? = null,
    /* The business hours on Monday */
    val outletBusinessHourMon: kotlin.String? = null,
    /* The business hours on Tuesday */
    val outletBusinessHourTue: kotlin.String? = null,
    /* The business hours on Wednesday */
    val outletBusinessHourWed: kotlin.String? = null,
    /* The business hours on Thursday */
    val outletBusinessHourThur: kotlin.String? = null,
    /* The business hours on Friday */
    val outletBusinessHourFri: kotlin.String? = null,
    /* The business hours on Saturday */
    val outletBusinessHourSat: kotlin.String? = null,
    /* The business hours on Sunday */
    val outletBusinessHourSun: kotlin.String? = null,
    /* Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty. */
    val outletNotes: kotlin.String? = null
) {
}
