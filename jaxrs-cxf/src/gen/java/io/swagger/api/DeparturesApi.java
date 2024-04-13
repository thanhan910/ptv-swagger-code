package io.swagger.api;

import java.util.Date;
import io.swagger.model.V3DeparturesResponse;
import io.swagger.model.V3ErrorResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * PTV Timetable API - Version 3
 *
 * <p>The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 */
@Path("/")
public interface DeparturesApi  {

    /**
     * View departures for all routes from a stop
     *
     */
    @GET
    @Path("/v3/departures/route_type/{route_type}/stop/{stop_id}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View departures for all routes from a stop", tags={ "Departures" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Service departures from the specified stop for all routes of the specified route type; departures are timetabled and real-time (if applicable).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DeparturesResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public V3DeparturesResponse departuresGetForStop(@PathParam("route_type") Integer routeType, @PathParam("stop_id") Integer stopId, @QueryParam("platform_numbers") List<Integer> platformNumbers, @QueryParam("direction_id") Integer directionId, @QueryParam("gtfs") Boolean gtfs, @QueryParam("date_utc") Date dateUtc, @QueryParam("max_results") Integer maxResults, @QueryParam("include_cancelled") Boolean includeCancelled, @QueryParam("look_backwards") Boolean lookBackwards, @QueryParam("expand") List<String> expand, @QueryParam("include_geopath") Boolean includeGeopath, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature);

    /**
     * View departures for a specific route from a stop
     *
     */
    @GET
    @Path("/v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View departures for a specific route from a stop", tags={ "Departures" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Service departures from the specified stop for the specified route (and route type); departures are timetabled and real-time (if applicable).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DeparturesResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public V3DeparturesResponse departuresGetForStopAndRoute(@PathParam("route_type") Integer routeType, @PathParam("stop_id") Integer stopId, @PathParam("route_id") String routeId, @QueryParam("direction_id") Integer directionId, @QueryParam("gtfs") Boolean gtfs, @QueryParam("date_utc") Date dateUtc, @QueryParam("max_results") Integer maxResults, @QueryParam("include_cancelled") Boolean includeCancelled, @QueryParam("look_backwards") Boolean lookBackwards, @QueryParam("expand") List<String> expand, @QueryParam("include_geopath") Boolean includeGeopath, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature);
}
