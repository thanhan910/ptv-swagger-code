package io.swagger.api;

import io.swagger.model.V3ErrorResponse;
import io.swagger.model.V3SearchResult;

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
public interface SearchApi  {

    /**
     * View stops, routes and myki ticket outlets that match the search term
     *
     */
    @GET
    @Path("/v3/search/{search_term}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View stops, routes and myki ticket outlets that match the search term", tags={ "Search" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Stops, routes and myki ticket outlets that contain the search term (note: stops and routes are ordered by route_type by default).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3SearchResult.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public V3SearchResult searchSearch(@PathParam("search_term") String searchTerm, @QueryParam("route_types") List<Integer> routeTypes, @QueryParam("latitude") Float latitude, @QueryParam("longitude") Float longitude, @QueryParam("max_distance") Float maxDistance, @QueryParam("include_addresses") Boolean includeAddresses, @QueryParam("include_outlets") Boolean includeOutlets, @QueryParam("match_stop_by_suburb") Boolean matchStopBySuburb, @QueryParam("match_route_by_suburb") Boolean matchRouteBySuburb, @QueryParam("match_stop_by_gtfs_stop_id") Boolean matchStopByGtfsStopId, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature);
}
