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
 */
package io.swagger.client.models

import io.swagger.client.models.V3ResultRoute

/**
 * 
 * @param stopDistance Distance of stop from input location (in metres); returns 0 if no location is input
 * @param stopSuburb suburb of stop
 * @param routeType Transport mode identifier
 * @param routes List of routes travelling through the stop
 * @param stopLatitude Geographic coordinate of latitude at stop
 * @param stopLongitude Geographic coordinate of longitude at stop
 * @param stopSequence Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
 * @param stopId Stop identifier
 * @param stopName Name of stop
 * @param stopLandmark Landmark in proximity of stop
 */
data class V3ResultStop (

    /* Distance of stop from input location (in metres); returns 0 if no location is input */
    val stopDistance: kotlin.Float? = null,
    /* suburb of stop */
    val stopSuburb: kotlin.String? = null,
    /* Transport mode identifier */
    val routeType: kotlin.Int? = null,
    /* List of routes travelling through the stop */
    val routes: kotlin.Array<V3ResultRoute>? = null,
    /* Geographic coordinate of latitude at stop */
    val stopLatitude: kotlin.Float? = null,
    /* Geographic coordinate of longitude at stop */
    val stopLongitude: kotlin.Float? = null,
    /* Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id. */
    val stopSequence: kotlin.Int? = null,
    /* Stop identifier */
    val stopId: kotlin.Int? = null,
    /* Name of stop */
    val stopName: kotlin.String? = null,
    /* Landmark in proximity of stop */
    val stopLandmark: kotlin.String? = null
) {
}