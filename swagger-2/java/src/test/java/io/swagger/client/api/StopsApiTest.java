/*
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


package io.swagger.client.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.V3ErrorResponse;
import io.swagger.client.model.V3StopResponse;
import io.swagger.client.model.V3StopsByDistanceResponse;
import io.swagger.client.model.V3StopsOnRouteResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StopsApi
 */
@Ignore
public class StopsApiTest {

    private final StopsApi api = new StopsApi();

    
    /**
     * View facilities at a specific stop (Metro and V/Line stations only)
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void stopsStopDetailsTest() throws Exception {
        Integer stopId = null;
        Integer routeType = null;
        Boolean stopLocation = null;
        Boolean stopAmenities = null;
        Boolean stopAccessibility = null;
        Boolean stopContact = null;
        Boolean stopTicket = null;
        Boolean gtfs = null;
        Boolean stopStaffing = null;
        Boolean stopDisruptions = null;
        String token = null;
        String devid = null;
        String signature = null;
        V3StopResponse response = api.stopsStopDetails(stopId, routeType, stopLocation, stopAmenities, stopAccessibility, stopContact, stopTicket, gtfs, stopStaffing, stopDisruptions, token, devid, signature);

        // TODO: test validations
    }
    
    /**
     * View all stops near a specific location
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void stopsStopsByGeolocationTest() throws Exception {
        Float latitude = null;
        Float longitude = null;
        List<Integer> routeTypes = null;
        Integer maxResults = null;
        Double maxDistance = null;
        Boolean stopDisruptions = null;
        String token = null;
        String devid = null;
        String signature = null;
        V3StopsByDistanceResponse response = api.stopsStopsByGeolocation(latitude, longitude, routeTypes, maxResults, maxDistance, stopDisruptions, token, devid, signature);

        // TODO: test validations
    }
    
    /**
     * View all stops on a specific route
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void stopsStopsForRouteTest() throws Exception {
        Integer routeId = null;
        Integer routeType = null;
        Integer directionId = null;
        Boolean stopDisruptions = null;
        Boolean includeGeopath = null;
        OffsetDateTime geopathUtc = null;
        String token = null;
        String devid = null;
        String signature = null;
        V3StopsOnRouteResponse response = api.stopsStopsForRoute(routeId, routeType, directionId, stopDisruptions, includeGeopath, geopathUtc, token, devid, signature);

        // TODO: test validations
    }
    
}
