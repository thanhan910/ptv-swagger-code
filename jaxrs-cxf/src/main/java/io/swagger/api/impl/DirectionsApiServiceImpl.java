package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.V3DirectionsResponse;
import io.swagger.model.V3ErrorResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * PTV Timetable API - Version 3
 *
 * <p>The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 */
public class DirectionsApiServiceImpl implements DirectionsApi {
    /**
     * View all routes for a direction of travel
     *
     */
    public V3DirectionsResponse directionsForDirection(Integer directionId, String token, String devid, String signature) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * View all routes of a particular type for a direction of travel
     *
     */
    public V3DirectionsResponse directionsForDirectionAndType(Integer directionId, Integer routeType, String token, String devid, String signature) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * View directions that a route travels in
     *
     */
    public V3DirectionsResponse directionsForRoute(Integer routeId, String token, String devid, String signature) {
        // TODO: Implement...
        
        return null;
    }
    
}

