/*
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.V3DisruptionModesResponse;
import org.openapitools.client.model.V3DisruptionResponse;
import org.openapitools.client.model.V3DisruptionsResponse;
import org.openapitools.client.model.V3ErrorResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DisruptionsApi
 */
@Disabled
public class DisruptionsApiTest {

    private final DisruptionsApi api = new DisruptionsApi();

    /**
     * View all disruptions for all route types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disruptionsGetAllDisruptionsTest() throws ApiException {
        List<Integer> routeTypes = null;
        List<Integer> disruptionModes = null;
        String disruptionStatus = null;
        String token = null;
        String devid = null;
        String signature = null;
        V3DisruptionsResponse response = api.disruptionsGetAllDisruptions(routeTypes, disruptionModes, disruptionStatus, token, devid, signature);
        // TODO: test validations
    }

    /**
     * View a specific disruption
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disruptionsGetDisruptionByIdTest() throws ApiException {
        Long disruptionId = null;
        String token = null;
        String devid = null;
        String signature = null;
        V3DisruptionResponse response = api.disruptionsGetDisruptionById(disruptionId, token, devid, signature);
        // TODO: test validations
    }

    /**
     * Get all disruption modes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disruptionsGetDisruptionModesTest() throws ApiException {
        String token = null;
        String devid = null;
        String signature = null;
        V3DisruptionModesResponse response = api.disruptionsGetDisruptionModes(token, devid, signature);
        // TODO: test validations
    }

    /**
     * View all disruptions for a particular route
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disruptionsGetDisruptionsByRouteTest() throws ApiException {
        Integer routeId = null;
        String disruptionStatus = null;
        String token = null;
        String devid = null;
        String signature = null;
        V3DisruptionsResponse response = api.disruptionsGetDisruptionsByRoute(routeId, disruptionStatus, token, devid, signature);
        // TODO: test validations
    }

    /**
     * View all disruptions for a particular route and stop
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disruptionsGetDisruptionsByRouteAndStopTest() throws ApiException {
        Integer routeId = null;
        Integer stopId = null;
        String disruptionStatus = null;
        String token = null;
        String devid = null;
        String signature = null;
        V3DisruptionsResponse response = api.disruptionsGetDisruptionsByRouteAndStop(routeId, stopId, disruptionStatus, token, devid, signature);
        // TODO: test validations
    }

    /**
     * View all disruptions for a particular stop
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disruptionsGetDisruptionsByStopTest() throws ApiException {
        Integer stopId = null;
        String disruptionStatus = null;
        String token = null;
        String devid = null;
        String signature = null;
        V3DisruptionsResponse response = api.disruptionsGetDisruptionsByStop(stopId, disruptionStatus, token, devid, signature);
        // TODO: test validations
    }

}
