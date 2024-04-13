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

import io.swagger.server.models.V3StopAccessibilityWheelchair

/**
 * 
 * @param lighting Indicates if there is lighting at the stop
 * @param platformNumber Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)
 * @param audioCustomerInformation Indicates if there is at least one audio customer information at the stop/platform
 * @param escalator Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
 * @param hearingLoop Indicates if there is a hearing loop facility at the stop/platform
 * @param lift Indicates if there is an elevator at the stop/platform
 * @param stairs Indicates if there are stairs available in the stop
 * @param stopAccessible Indicates if the stop is accessible
 * @param tactileGroundSurfaceIndicator Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop
 * @param waitingRoom Indicates if there is a general waiting area at the stop
 * @param wheelchair 
 */
data class V3StopAccessibility (

    /* Indicates if there is lighting at the stop */
    val lighting: kotlin.Boolean? = null,
    /* Indicates the platform number for xivic information (Platform 0 indicates general stop facilities) */
    val platformNumber: kotlin.Int? = null,
    /* Indicates if there is at least one audio customer information at the stop/platform */
    val audioCustomerInformation: kotlin.Boolean? = null,
    /* Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992) */
    val escalator: kotlin.Boolean? = null,
    /* Indicates if there is a hearing loop facility at the stop/platform */
    val hearingLoop: kotlin.Boolean? = null,
    /* Indicates if there is an elevator at the stop/platform */
    val lift: kotlin.Boolean? = null,
    /* Indicates if there are stairs available in the stop */
    val stairs: kotlin.Boolean? = null,
    /* Indicates if the stop is accessible */
    val stopAccessible: kotlin.Boolean? = null,
    /* Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop */
    val tactileGroundSurfaceIndicator: kotlin.Boolean? = null,
    /* Indicates if there is a general waiting area at the stop */
    val waitingRoom: kotlin.Boolean? = null,
    val wheelchair: V3StopAccessibilityWheelchair? = null
) {
}
