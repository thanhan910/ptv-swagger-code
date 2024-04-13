package io.swagger.api;

import io.swagger.model.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Date;
import io.swagger.model.V3DeparturesResponse;
import io.swagger.model.V3DirectionsResponse;
import io.swagger.model.V3DisruptionModesResponse;
import io.swagger.model.V3DisruptionResponse;
import io.swagger.model.V3DisruptionsResponse;
import io.swagger.model.V3ErrorResponse;
import io.swagger.model.V3FareEstimateResponse;
import io.swagger.model.V3OutletGeolocationResponse;
import io.swagger.model.V3OutletResponse;
import io.swagger.model.V3RouteResponse;
import io.swagger.model.V3RouteTypesResponse;
import io.swagger.model.V3RunResponse;
import io.swagger.model.V3RunsResponse;
import io.swagger.model.V3SearchResult;
import io.swagger.model.V3StopResponse;
import io.swagger.model.V3StoppingPattern;
import io.swagger.model.V3StopsByDistanceResponse;
import io.swagger.model.V3StopsOnRouteResponse;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/v3")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
public interface V3Api  {
   
    @GET
    @Path("/departures/route_type/{route_type}/stop/{stop_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View departures for all routes from a stop", description = "", tags={ "Departures" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Service departures from the specified stop for all routes of the specified route type; departures are timetabled and real-time (if applicable).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DeparturesResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response departuresGetForStop( @PathParam("route_type") Integer routeType, @PathParam("stop_id") Integer stopId, @QueryParam("platform_numbers") List<Integer> platformNumbers, @QueryParam("direction_id") Integer directionId, @QueryParam("gtfs") Boolean gtfs, @QueryParam("date_utc") Date dateUtc, @QueryParam("max_results") Integer maxResults, @QueryParam("include_cancelled") Boolean includeCancelled, @QueryParam("look_backwards") Boolean lookBackwards, @QueryParam("expand") List<String> expand, @QueryParam("include_geopath") Boolean includeGeopath, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View departures for a specific route from a stop", description = "", tags={ "Departures" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Service departures from the specified stop for the specified route (and route type); departures are timetabled and real-time (if applicable).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DeparturesResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response departuresGetForStopAndRoute( @PathParam("route_type") Integer routeType, @PathParam("stop_id") Integer stopId, @PathParam("route_id") String routeId, @QueryParam("direction_id") Integer directionId, @QueryParam("gtfs") Boolean gtfs, @QueryParam("date_utc") Date dateUtc, @QueryParam("max_results") Integer maxResults, @QueryParam("include_cancelled") Boolean includeCancelled, @QueryParam("look_backwards") Boolean lookBackwards, @QueryParam("expand") List<String> expand, @QueryParam("include_geopath") Boolean includeGeopath, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/directions/{direction_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all routes for a direction of travel", description = "", tags={ "Directions" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All routes that travel in the specified direction.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DirectionsResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response directionsForDirection( @PathParam("direction_id") Integer directionId, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/directions/{direction_id}/route_type/{route_type}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all routes of a particular type for a direction of travel", description = "", tags={ "Directions" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All routes of the specified route type that travel in the specified direction.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DirectionsResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response directionsForDirectionAndType( @PathParam("direction_id") Integer directionId, @PathParam("route_type") Integer routeType, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/directions/route/{route_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View directions that a route travels in", description = "", tags={ "Directions" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The directions that a specified route travels in.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DirectionsResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response directionsForRoute( @PathParam("route_id") Integer routeId, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/disruptions")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all disruptions for all route types", description = "", tags={ "Disruptions" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All disruption information for all route types.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionsResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response disruptionsGetAllDisruptions( @QueryParam("route_types") List<Integer> routeTypes, @QueryParam("disruption_modes") List<Integer> disruptionModes, @QueryParam("disruption_status") String disruptionStatus, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/disruptions/{disruption_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View a specific disruption", description = "", tags={ "Disruptions" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Disruption information for the specified disruption ID.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response disruptionsGetDisruptionById( @PathParam("disruption_id") Long disruptionId, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/disruptions/modes")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "Get all disruption modes", description = "", tags={ "Disruptions" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Disruption specific modes", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionModesResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response disruptionsGetDisruptionModes( @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/disruptions/route/{route_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all disruptions for a particular route", description = "", tags={ "Disruptions" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All disruption information (if any exists) for the specified route.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionsResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response disruptionsGetDisruptionsByRoute( @PathParam("route_id") Integer routeId, @QueryParam("disruption_status") String disruptionStatus, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/disruptions/route/{route_id}/stop/{stop_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all disruptions for a particular route and stop", description = "", tags={ "Disruptions" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All disruption information (if any exists) for the specified route and stop.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionsResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response disruptionsGetDisruptionsByRouteAndStop( @PathParam("route_id") Integer routeId, @PathParam("stop_id") Integer stopId, @QueryParam("disruption_status") String disruptionStatus, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/disruptions/stop/{stop_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all disruptions for a particular stop", description = "", tags={ "Disruptions" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All disruption information (if any exists) for the specified stop.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionsResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response disruptionsGetDisruptionsByStop( @PathParam("stop_id") Integer stopId, @QueryParam("disruption_status") String disruptionStatus, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/fare_estimate/min_zone/{minZone}/max_zone/{maxZone}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "Estimate a fare by zone", description = "", tags={ "FareEstimate" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Resultant set fare estimates", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3FareEstimateResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response fareEstimateGetFareEstimateByZone( @PathParam("minZone") Integer minZone, @PathParam("maxZone") Integer maxZone, @QueryParam("journey_touch_on_utc") Date journeyTouchOnUtc, @QueryParam("journey_touch_off_utc") Date journeyTouchOffUtc, @QueryParam("is_journey_in_free_tram_zone") Boolean isJourneyInFreeTramZone, @QueryParam("travelled_route_types") List<Integer> travelledRouteTypes, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/outlets")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "List all ticket outlets", description = "", tags={ "Outlets" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Ticket outlets.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3OutletResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response outletsGetAllOutlets( @QueryParam("max_results") Integer maxResults, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/outlets/location/{latitude},{longitude}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "List ticket outlets near a specific location", description = "", tags={ "Outlets" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Ticket outlets near the specified location.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3OutletGeolocationResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response outletsGetOutletsByGeolocation( @PathParam("latitude") Float latitude, @PathParam("longitude") Float longitude, @QueryParam("max_distance") Double maxDistance, @QueryParam("max_results") Integer maxResults, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/pattern/run/{run_ref}/route_type/{route_type}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View the stopping pattern for a specific trip/service run", description = "", tags={ "Patterns" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The stopping pattern of the specified run_ref and route type. (NOTE: the departure sequence field should be used to sort departures in chronological order, however it is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4)", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3StoppingPattern.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response patternsGetPatternByRun( @PathParam("run_ref") String runRef, @PathParam("route_type") Integer routeType, @NotNull @QueryParam("expand") List<String> expand, @QueryParam("stop_id") Integer stopId, @QueryParam("date_utc") Date dateUtc, @QueryParam("include_skipped_stops") Boolean includeSkippedStops, @QueryParam("include_geopath") Boolean includeGeopath, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/route_types")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all route types and their names", description = "", tags={ "RouteTypes" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All route types (i.e. identifiers of transport modes) and their names.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RouteTypesResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response routeTypesGetRouteTypes( @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/routes")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View route names and numbers for all routes", description = "", tags={ "Routes" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Route names and numbers for all routes of all route types.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RouteResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response routesOneOrMoreRoutes( @QueryParam("route_types") List<Integer> routeTypes, @QueryParam("route_name") String routeName, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/routes/{route_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View route name and number for specific route ID", description = "", tags={ "Routes" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The route name and number for the specified route ID.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RouteResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response routesRouteFromId( @PathParam("route_id") Integer routeId, @QueryParam("include_geopath") Boolean includeGeopath, @QueryParam("geopath_utc") Date geopathUtc, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/runs/route/{route_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all trip/service runs for a specific route ID", description = "", tags={ "Runs" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All trip/service run details for the specified route ID.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RunsResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response runsForRoute( @PathParam("route_id") Integer routeId, @QueryParam("expand") List<String> expand, @QueryParam("date_utc") Date dateUtc, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/runs/route/{route_id}/route_type/{route_type}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all trip/service runs for a specific route ID and route type", description = "", tags={ "Runs" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All trip/service run details for the specified route ID and route type.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RunsResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response runsForRouteAndRouteType( @PathParam("route_id") Integer routeId, @PathParam("route_type") Integer routeType, @NotNull @QueryParam("expand") List<String> expand, @QueryParam("date_utc") Date dateUtc, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/runs/{run_ref}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all trip/service runs for a specific run_ref", description = "", tags={ "Runs" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All trip/service run details for the specified run_ref.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RunsResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response runsForRun( @PathParam("run_ref") String runRef, @NotNull @QueryParam("expand") List<String> expand, @QueryParam("date_utc") Date dateUtc, @QueryParam("include_geopath") Boolean includeGeopath, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/runs/{run_ref}/route_type/{route_type}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View the trip/service run for a specific run_ref and route type", description = "", tags={ "Runs" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "The trip/service run details for the run_ref and route type specified.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RunResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response runsForRunAndRouteType( @PathParam("run_ref") String runRef, @PathParam("route_type") Integer routeType, @NotNull @QueryParam("expand") List<String> expand, @QueryParam("date_utc") Date dateUtc, @QueryParam("include_geopath") Boolean includeGeopath, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/search/{search_term}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View stops, routes and myki ticket outlets that match the search term", description = "", tags={ "Search" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Stops, routes and myki ticket outlets that contain the search term (note: stops and routes are ordered by route_type by default).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3SearchResult.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response searchSearch( @PathParam("search_term") String searchTerm, @QueryParam("route_types") List<Integer> routeTypes, @QueryParam("latitude") Float latitude, @QueryParam("longitude") Float longitude, @QueryParam("max_distance") Float maxDistance, @QueryParam("include_addresses") Boolean includeAddresses, @QueryParam("include_outlets") Boolean includeOutlets, @QueryParam("match_stop_by_suburb") Boolean matchStopBySuburb, @QueryParam("match_route_by_suburb") Boolean matchRouteBySuburb, @QueryParam("match_stop_by_gtfs_stop_id") Boolean matchStopByGtfsStopId, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/stops/{stop_id}/route_type/{route_type}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View facilities at a specific stop (Metro and V/Line stations only)", description = "", tags={ "Stops" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Stop location, amenity and accessibility facility information for the specified stop (metropolitan and V/Line stations only).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3StopResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response stopsStopDetails( @PathParam("stop_id") Integer stopId, @PathParam("route_type") Integer routeType, @QueryParam("stop_location") Boolean stopLocation, @QueryParam("stop_amenities") Boolean stopAmenities, @QueryParam("stop_accessibility") Boolean stopAccessibility, @QueryParam("stop_contact") Boolean stopContact, @QueryParam("stop_ticket") Boolean stopTicket, @QueryParam("gtfs") Boolean gtfs, @QueryParam("stop_staffing") Boolean stopStaffing, @QueryParam("stop_disruptions") Boolean stopDisruptions, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/stops/location/{latitude},{longitude}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all stops near a specific location", description = "", tags={ "Stops" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All stops near the specified location.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3StopsByDistanceResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response stopsStopsByGeolocation( @PathParam("latitude") Float latitude, @PathParam("longitude") Float longitude, @QueryParam("route_types") List<Integer> routeTypes, @QueryParam("max_results") Integer maxResults, @QueryParam("max_distance") Double maxDistance, @QueryParam("stop_disruptions") Boolean stopDisruptions, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

    @GET
    @Path("/stops/route/{route_id}/route_type/{route_type}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all stops on a specific route", description = "", tags={ "Stops" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "All stops on the specified route.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3StopsOnRouteResponse.class))),
                @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
                @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
         })
    Response stopsStopsForRoute( @PathParam("route_id") Integer routeId, @PathParam("route_type") Integer routeType, @QueryParam("direction_id") Integer directionId, @QueryParam("stop_disruptions") Boolean stopDisruptions, @QueryParam("include_geopath") Boolean includeGeopath, @QueryParam("geopath_utc") Date geopathUtc, @QueryParam("token") String token, @QueryParam("devid") String devid, @QueryParam("signature") String signature,@Context SecurityContext securityContext);

}
