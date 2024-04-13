package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.V3ApiService;
import io.swagger.api.factories.V3ApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
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

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/v3")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-04-14T03:35:25.635146900+10:00[Australia/Sydney]")
public class V3Api  {
   private final V3ApiService delegate;

   public V3Api(@Context ServletConfig servletContext) {
      V3ApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("V3Api.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (V3ApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = V3ApiServiceFactory.getV3Api();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/departures/route_type/{route_type}/stop/{stop_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View departures for all routes from a stop", description = "", tags={ "Departures" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Service departures from the specified stop for all routes of the specified route type; departures are timetabled and real-time (if applicable).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DeparturesResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response departuresGetForStop(@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API",required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" })
) @PathParam("route_type") Integer routeType,@Parameter(in = ParameterIn.PATH, description = "Identifier of stop; values returned by Stops API",required=true) @PathParam("stop_id") Integer stopId,@Parameter(in = ParameterIn.QUERY, description = "Filter by platform number at stop") @QueryParam("platform_numbers") List<Integer> platformNumbers,@Parameter(in = ParameterIn.QUERY, description = "Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}") @QueryParam("direction_id") Integer directionId,@Parameter(in = ParameterIn.QUERY, description = "Indicates that stop_id parameter will accept \"GTFS stop_id\" data") @QueryParam("gtfs") Boolean gtfs,@Parameter(in = ParameterIn.QUERY, description = "Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)") @QueryParam("date_utc") Date dateUtc,@Parameter(in = ParameterIn.QUERY, description = "Maximum number of results returned") @QueryParam("max_results") Integer maxResults,@Parameter(in = ParameterIn.QUERY, description = "Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only") @QueryParam("include_cancelled") Boolean includeCancelled,@Parameter(in = ParameterIn.QUERY, description = "Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.") @QueryParam("look_backwards") Boolean lookBackwards,@Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.", schema=@Schema(allowableValues={ "All", "Stop", "Route", "Run", "Direction", "Disruption", "VehicleDescriptor", "VehiclePosition", "None" })
) @QueryParam("expand") List<String> expand,@Parameter(in = ParameterIn.QUERY, description = "Indicates if the route geopath should be returned") @QueryParam("include_geopath") Boolean includeGeopath,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.departuresGetForStop(routeType,stopId,platformNumbers,directionId,gtfs,dateUtc,maxResults,includeCancelled,lookBackwards,expand,includeGeopath,token,devid,signature,securityContext);
    }
    @GET
    @Path("/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View departures for a specific route from a stop", description = "", tags={ "Departures" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Service departures from the specified stop for the specified route (and route type); departures are timetabled and real-time (if applicable).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DeparturesResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response departuresGetForStopAndRoute(@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API",required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" })
) @PathParam("route_type") Integer routeType,@Parameter(in = ParameterIn.PATH, description = "Identifier of stop; values returned by Stops API",required=true) @PathParam("stop_id") Integer stopId,@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes",required=true) @PathParam("route_id") String routeId,@Parameter(in = ParameterIn.QUERY, description = "Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}") @QueryParam("direction_id") Integer directionId,@Parameter(in = ParameterIn.QUERY, description = "Indicates that stop_id parameter will accept \"GTFS stop_id\" data") @QueryParam("gtfs") Boolean gtfs,@Parameter(in = ParameterIn.QUERY, description = "Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)") @QueryParam("date_utc") Date dateUtc,@Parameter(in = ParameterIn.QUERY, description = "Maximum number of results returned") @QueryParam("max_results") Integer maxResults,@Parameter(in = ParameterIn.QUERY, description = "Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only") @QueryParam("include_cancelled") Boolean includeCancelled,@Parameter(in = ParameterIn.QUERY, description = "Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.") @QueryParam("look_backwards") Boolean lookBackwards,@Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.", schema=@Schema(allowableValues={ "All", "Stop", "Route", "Run", "Direction", "Disruption", "VehicleDescriptor", "VehiclePosition", "None" })
) @QueryParam("expand") List<String> expand,@Parameter(in = ParameterIn.QUERY, description = "Indicates if the route geopath should be returned") @QueryParam("include_geopath") Boolean includeGeopath,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.departuresGetForStopAndRoute(routeType,stopId,routeId,directionId,gtfs,dateUtc,maxResults,includeCancelled,lookBackwards,expand,includeGeopath,token,devid,signature,securityContext);
    }
    @GET
    @Path("/directions/{direction_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all routes for a direction of travel", description = "", tags={ "Directions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All routes that travel in the specified direction.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DirectionsResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response directionsForDirection(@Parameter(in = ParameterIn.PATH, description = "Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}",required=true) @PathParam("direction_id") Integer directionId,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.directionsForDirection(directionId,token,devid,signature,securityContext);
    }
    @GET
    @Path("/directions/{direction_id}/route_type/{route_type}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all routes of a particular type for a direction of travel", description = "", tags={ "Directions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All routes of the specified route type that travel in the specified direction.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DirectionsResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response directionsForDirectionAndType(@Parameter(in = ParameterIn.PATH, description = "Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}",required=true) @PathParam("direction_id") Integer directionId,@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API",required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" })
) @PathParam("route_type") Integer routeType,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.directionsForDirectionAndType(directionId,routeType,token,devid,signature,securityContext);
    }
    @GET
    @Path("/directions/route/{route_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View directions that a route travels in", description = "", tags={ "Directions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The directions that a specified route travels in.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DirectionsResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response directionsForRoute(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes",required=true) @PathParam("route_id") Integer routeId,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.directionsForRoute(routeId,token,devid,signature,securityContext);
    }
    @GET
    @Path("/disruptions")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all disruptions for all route types", description = "", tags={ "Disruptions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All disruption information for all route types.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionsResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response disruptionsGetAllDisruptions(@Parameter(in = ParameterIn.QUERY, description = "Filter by route_type; values returned via RouteTypes API", schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" })
) @QueryParam("route_types") List<Integer> routeTypes,@Parameter(in = ParameterIn.QUERY, description = "Filter by disruption_mode; values returned via v3/disruptions/modes API", schema=@Schema(allowableValues={ "1", "2", "3", "4", "5", "7", "8", "9", "10", "11", "12", "13", "14", "100" })
) @QueryParam("disruption_modes") List<Integer> disruptionModes,@Parameter(in = ParameterIn.QUERY, description = "Filter by status of disruption", schema=@Schema(allowableValues={ "current", "planned" })
) @QueryParam("disruption_status") String disruptionStatus,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.disruptionsGetAllDisruptions(routeTypes,disruptionModes,disruptionStatus,token,devid,signature,securityContext);
    }
    @GET
    @Path("/disruptions/{disruption_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View a specific disruption", description = "", tags={ "Disruptions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Disruption information for the specified disruption ID.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response disruptionsGetDisruptionById(@Parameter(in = ParameterIn.PATH, description = "Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id}",required=true) @PathParam("disruption_id") Long disruptionId,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.disruptionsGetDisruptionById(disruptionId,token,devid,signature,securityContext);
    }
    @GET
    @Path("/disruptions/modes")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "Get all disruption modes", description = "", tags={ "Disruptions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Disruption specific modes", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionModesResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response disruptionsGetDisruptionModes(@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.disruptionsGetDisruptionModes(token,devid,signature,securityContext);
    }
    @GET
    @Path("/disruptions/route/{route_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all disruptions for a particular route", description = "", tags={ "Disruptions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All disruption information (if any exists) for the specified route.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionsResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response disruptionsGetDisruptionsByRoute(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes",required=true) @PathParam("route_id") Integer routeId,@Parameter(in = ParameterIn.QUERY, description = "Filter by status of disruption", schema=@Schema(allowableValues={ "current", "planned" })
) @QueryParam("disruption_status") String disruptionStatus,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.disruptionsGetDisruptionsByRoute(routeId,disruptionStatus,token,devid,signature,securityContext);
    }
    @GET
    @Path("/disruptions/route/{route_id}/stop/{stop_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all disruptions for a particular route and stop", description = "", tags={ "Disruptions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All disruption information (if any exists) for the specified route and stop.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionsResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response disruptionsGetDisruptionsByRouteAndStop(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes",required=true) @PathParam("route_id") Integer routeId,@Parameter(in = ParameterIn.PATH, description = "Identifier of stop; values returned by Stops API - v3/stops",required=true) @PathParam("stop_id") Integer stopId,@Parameter(in = ParameterIn.QUERY, description = "Filter by status of disruption", schema=@Schema(allowableValues={ "current", "planned" })
) @QueryParam("disruption_status") String disruptionStatus,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.disruptionsGetDisruptionsByRouteAndStop(routeId,stopId,disruptionStatus,token,devid,signature,securityContext);
    }
    @GET
    @Path("/disruptions/stop/{stop_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all disruptions for a particular stop", description = "", tags={ "Disruptions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All disruption information (if any exists) for the specified stop.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionsResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response disruptionsGetDisruptionsByStop(@Parameter(in = ParameterIn.PATH, description = "Identifier of stop; values returned by Stops API - v3/stops",required=true) @PathParam("stop_id") Integer stopId,@Parameter(in = ParameterIn.QUERY, description = "Filter by status of disruption", schema=@Schema(allowableValues={ "current", "planned" })
) @QueryParam("disruption_status") String disruptionStatus,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.disruptionsGetDisruptionsByStop(stopId,disruptionStatus,token,devid,signature,securityContext);
    }
    @GET
    @Path("/fare_estimate/min_zone/{minZone}/max_zone/{maxZone}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "Estimate a fare by zone", description = "", tags={ "FareEstimate" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Resultant set fare estimates", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3FareEstimateResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response fareEstimateGetFareEstimateByZone(@Parameter(in = ParameterIn.PATH, description = "Minimum Zone travelled through ie. 1",required=true) @PathParam("minZone") Integer minZone,@Parameter(in = ParameterIn.PATH, description = "Maximum Zone travelled through id. 6",required=true) @PathParam("maxZone") Integer maxZone,@Parameter(in = ParameterIn.QUERY, description = "JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).") @QueryParam("journey_touch_on_utc") Date journeyTouchOnUtc,@Parameter(in = ParameterIn.QUERY, description = "JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).") @QueryParam("journey_touch_off_utc") Date journeyTouchOffUtc,@Parameter(in = ParameterIn.QUERY, description = "") @QueryParam("is_journey_in_free_tram_zone") Boolean isJourneyInFreeTramZone,@Parameter(in = ParameterIn.QUERY, description = "", schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" })
) @QueryParam("travelled_route_types") List<Integer> travelledRouteTypes,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.fareEstimateGetFareEstimateByZone(minZone,maxZone,journeyTouchOnUtc,journeyTouchOffUtc,isJourneyInFreeTramZone,travelledRouteTypes,token,devid,signature,securityContext);
    }
    @GET
    @Path("/outlets")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "List all ticket outlets", description = "", tags={ "Outlets" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Ticket outlets.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3OutletResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response outletsGetAllOutlets(@Parameter(in = ParameterIn.QUERY, description = "Maximum number of results returned (default = 30)") @QueryParam("max_results") Integer maxResults,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.outletsGetAllOutlets(maxResults,token,devid,signature,securityContext);
    }
    @GET
    @Path("/outlets/location/{latitude},{longitude}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "List ticket outlets near a specific location", description = "", tags={ "Outlets" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Ticket outlets near the specified location.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3OutletGeolocationResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response outletsGetOutletsByGeolocation(@Parameter(in = ParameterIn.PATH, description = "Geographic coordinate of latitude",required=true) @PathParam("latitude") Float latitude,@Parameter(in = ParameterIn.PATH, description = "Geographic coordinate of longitude",required=true) @PathParam("longitude") Float longitude,@Parameter(in = ParameterIn.QUERY, description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)") @QueryParam("max_distance") Double maxDistance,@Parameter(in = ParameterIn.QUERY, description = "Maximum number of results returned (default = 30)") @QueryParam("max_results") Integer maxResults,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.outletsGetOutletsByGeolocation(latitude,longitude,maxDistance,maxResults,token,devid,signature,securityContext);
    }
    @GET
    @Path("/pattern/run/{run_ref}/route_type/{route_type}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View the stopping pattern for a specific trip/service run", description = "", tags={ "Patterns" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The stopping pattern of the specified run_ref and route type. (NOTE: the departure sequence field should be used to sort departures in chronological order, however it is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4)", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3StoppingPattern.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response patternsGetPatternByRun(@Parameter(in = ParameterIn.PATH, description = "The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.",required=true) @PathParam("run_ref") String runRef,@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API",required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" })
) @PathParam("route_type") Integer routeType,@Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information.",required=true, schema=@Schema(allowableValues={ "All", "Stop", "Route", "Run", "Direction", "Disruption", "VehicleDescriptor", "VehiclePosition", "None" })
) @QueryParam("expand") List<String> expand,@Parameter(in = ParameterIn.QUERY, description = "Filter by stop_id; values returned by Stops API") @QueryParam("stop_id") Integer stopId,@Parameter(in = ParameterIn.QUERY, description = "Filter by the date and time of the request (ISO 8601 UTC format)") @QueryParam("date_utc") Date dateUtc,@Parameter(in = ParameterIn.QUERY, description = "Include any skipped stops in a stopping pattern. Defaults to false.") @QueryParam("include_skipped_stops") Boolean includeSkippedStops,@Parameter(in = ParameterIn.QUERY, description = "Indicates if geopath data will be returned (default = false)") @QueryParam("include_geopath") Boolean includeGeopath,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patternsGetPatternByRun(runRef,routeType,expand,stopId,dateUtc,includeSkippedStops,includeGeopath,token,devid,signature,securityContext);
    }
    @GET
    @Path("/route_types")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all route types and their names", description = "", tags={ "RouteTypes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All route types (i.e. identifiers of transport modes) and their names.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RouteTypesResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response routeTypesGetRouteTypes(@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.routeTypesGetRouteTypes(token,devid,signature,securityContext);
    }
    @GET
    @Path("/routes")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View route names and numbers for all routes", description = "", tags={ "Routes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Route names and numbers for all routes of all route types.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RouteResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response routesOneOrMoreRoutes(@Parameter(in = ParameterIn.QUERY, description = "Filter by route_type; values returned via RouteTypes API", schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" })
) @QueryParam("route_types") List<Integer> routeTypes,@Parameter(in = ParameterIn.QUERY, description = "Filter by name  of route (accepts partial route name matches)") @QueryParam("route_name") String routeName,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.routesOneOrMoreRoutes(routeTypes,routeName,token,devid,signature,securityContext);
    }
    @GET
    @Path("/routes/{route_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View route name and number for specific route ID", description = "", tags={ "Routes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The route name and number for the specified route ID.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RouteResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response routesRouteFromId(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Departures, Directions and Disruptions APIs",required=true) @PathParam("route_id") Integer routeId,@Parameter(in = ParameterIn.QUERY, description = "Indicates kif geopath data will be returned (default = false)") @QueryParam("include_geopath") Boolean includeGeopath,@Parameter(in = ParameterIn.QUERY, description = "Filter geopaths by date (ISO 8601 UTC format) (default = current date)") @QueryParam("geopath_utc") Date geopathUtc,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.routesRouteFromId(routeId,includeGeopath,geopathUtc,token,devid,signature,securityContext);
    }
    @GET
    @Path("/runs/route/{route_id}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all trip/service runs for a specific route ID", description = "", tags={ "Runs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All trip/service run details for the specified route ID.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RunsResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response runsForRoute(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes.",required=true) @PathParam("route_id") Integer routeId,@Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.", schema=@Schema(allowableValues={ "All", "VehicleDescriptor", "VehiclePosition", "None" })
) @QueryParam("expand") List<String> expand,@Parameter(in = ParameterIn.QUERY, description = "Date of the request. (optional - defaults to now)") @QueryParam("date_utc") Date dateUtc,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.runsForRoute(routeId,expand,dateUtc,token,devid,signature,securityContext);
    }
    @GET
    @Path("/runs/route/{route_id}/route_type/{route_type}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all trip/service runs for a specific route ID and route type", description = "", tags={ "Runs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All trip/service run details for the specified route ID and route type.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RunsResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response runsForRouteAndRouteType(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes.",required=true) @PathParam("route_id") Integer routeId,@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API",required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" })
) @PathParam("route_type") Integer routeType,@Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.",required=true, schema=@Schema(allowableValues={ "All", "VehicleDescriptor", "VehiclePosition", "None" })
) @QueryParam("expand") List<String> expand,@Parameter(in = ParameterIn.QUERY, description = "Date of the request. (optional - defaults to now)") @QueryParam("date_utc") Date dateUtc,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.runsForRouteAndRouteType(routeId,routeType,expand,dateUtc,token,devid,signature,securityContext);
    }
    @GET
    @Path("/runs/{run_ref}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all trip/service runs for a specific run_ref", description = "", tags={ "Runs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All trip/service run details for the specified run_ref.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RunsResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response runsForRun(@Parameter(in = ParameterIn.PATH, description = "The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.",required=true) @PathParam("run_ref") String runRef,@Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.",required=true, schema=@Schema(allowableValues={ "All", "VehicleDescriptor", "VehiclePosition", "None" })
) @QueryParam("expand") List<String> expand,@Parameter(in = ParameterIn.QUERY, description = "Date of the request. (optional - defaults to now)") @QueryParam("date_utc") Date dateUtc,@Parameter(in = ParameterIn.QUERY, description = "Indicates if geopath data will be returned (default = false)") @QueryParam("include_geopath") Boolean includeGeopath,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.runsForRun(runRef,expand,dateUtc,includeGeopath,token,devid,signature,securityContext);
    }
    @GET
    @Path("/runs/{run_ref}/route_type/{route_type}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View the trip/service run for a specific run_ref and route type", description = "", tags={ "Runs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The trip/service run details for the run_ref and route type specified.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RunResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response runsForRunAndRouteType(@Parameter(in = ParameterIn.PATH, description = "The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.",required=true) @PathParam("run_ref") String runRef,@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API",required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" })
) @PathParam("route_type") Integer routeType,@Parameter(in = ParameterIn.QUERY, description = "List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.",required=true, schema=@Schema(allowableValues={ "All", "VehicleDescriptor", "VehiclePosition", "None" })
) @QueryParam("expand") List<String> expand,@Parameter(in = ParameterIn.QUERY, description = "Date of the request. (optional - defaults to now)") @QueryParam("date_utc") Date dateUtc,@Parameter(in = ParameterIn.QUERY, description = "Indicates if geopath data will be returned (default = false)") @QueryParam("include_geopath") Boolean includeGeopath,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.runsForRunAndRouteType(runRef,routeType,expand,dateUtc,includeGeopath,token,devid,signature,securityContext);
    }
    @GET
    @Path("/search/{search_term}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View stops, routes and myki ticket outlets that match the search term", description = "", tags={ "Search" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Stops, routes and myki ticket outlets that contain the search term (note: stops and routes are ordered by route_type by default).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3SearchResult.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response searchSearch(@Parameter(in = ParameterIn.PATH, description = "Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes)",required=true) @PathParam("search_term") String searchTerm,@Parameter(in = ParameterIn.QUERY, description = "Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)", schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" })
) @QueryParam("route_types") List<Integer> routeTypes,@Parameter(in = ParameterIn.QUERY, description = "Filter by geographic coordinate of latitude") @QueryParam("latitude") Float latitude,@Parameter(in = ParameterIn.QUERY, description = "Filter by geographic coordinate of longitude") @QueryParam("longitude") Float longitude,@Parameter(in = ParameterIn.QUERY, description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters") @QueryParam("max_distance") Float maxDistance,@Parameter(in = ParameterIn.QUERY, description = "Placeholder for future development; currently unavailable") @QueryParam("include_addresses") Boolean includeAddresses,@Parameter(in = ParameterIn.QUERY, description = "Indicates if outlets will be returned in response (default = true)") @QueryParam("include_outlets") Boolean includeOutlets,@Parameter(in = ParameterIn.QUERY, description = "Indicates whether to find stops by suburbs in the search term (default = true)") @QueryParam("match_stop_by_suburb") Boolean matchStopBySuburb,@Parameter(in = ParameterIn.QUERY, description = "Indicates whether to find routes by suburbs in the search term (default = true)") @QueryParam("match_route_by_suburb") Boolean matchRouteBySuburb,@Parameter(in = ParameterIn.QUERY, description = "Indicates whether to search for stops according to a metlink stop ID (default = false)") @QueryParam("match_stop_by_gtfs_stop_id") Boolean matchStopByGtfsStopId,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchSearch(searchTerm,routeTypes,latitude,longitude,maxDistance,includeAddresses,includeOutlets,matchStopBySuburb,matchRouteBySuburb,matchStopByGtfsStopId,token,devid,signature,securityContext);
    }
    @GET
    @Path("/stops/{stop_id}/route_type/{route_type}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View facilities at a specific stop (Metro and V/Line stations only)", description = "", tags={ "Stops" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Stop location, amenity and accessibility facility information for the specified stop (metropolitan and V/Line stations only).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3StopResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response stopsStopDetails(@Parameter(in = ParameterIn.PATH, description = "Identifier of stop; values returned by Stops API",required=true) @PathParam("stop_id") Integer stopId,@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API",required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" })
) @PathParam("route_type") Integer routeType,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop location information will be returned (default = false)") @QueryParam("stop_location") Boolean stopLocation,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop amenity information will be returned (default = false)") @QueryParam("stop_amenities") Boolean stopAmenities,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop accessibility information will be returned (default = false)") @QueryParam("stop_accessibility") Boolean stopAccessibility,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop contact information will be returned (default = false)") @QueryParam("stop_contact") Boolean stopContact,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop ticket information will be returned (default = false)") @QueryParam("stop_ticket") Boolean stopTicket,@Parameter(in = ParameterIn.QUERY, description = "Incdicates whether the stop_id is a GTFS ID or not") @QueryParam("gtfs") Boolean gtfs,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop staffing information will be returned (default = false)") @QueryParam("stop_staffing") Boolean stopStaffing,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop disruption information will be returned (default = false)") @QueryParam("stop_disruptions") Boolean stopDisruptions,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.stopsStopDetails(stopId,routeType,stopLocation,stopAmenities,stopAccessibility,stopContact,stopTicket,gtfs,stopStaffing,stopDisruptions,token,devid,signature,securityContext);
    }
    @GET
    @Path("/stops/location/{latitude},{longitude}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all stops near a specific location", description = "", tags={ "Stops" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All stops near the specified location.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3StopsByDistanceResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response stopsStopsByGeolocation(@Parameter(in = ParameterIn.PATH, description = "Geographic coordinate of latitude",required=true) @PathParam("latitude") Float latitude,@Parameter(in = ParameterIn.PATH, description = "Geographic coordinate of longitude",required=true) @PathParam("longitude") Float longitude,@Parameter(in = ParameterIn.QUERY, description = "Filter by route_type; values returned via RouteTypes API", schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" })
) @QueryParam("route_types") List<Integer> routeTypes,@Parameter(in = ParameterIn.QUERY, description = "Maximum number of results returned (default = 30)") @QueryParam("max_results") Integer maxResults,@Parameter(in = ParameterIn.QUERY, description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)") @QueryParam("max_distance") Double maxDistance,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop disruption information will be returned (default = false)") @QueryParam("stop_disruptions") Boolean stopDisruptions,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.stopsStopsByGeolocation(latitude,longitude,routeTypes,maxResults,maxDistance,stopDisruptions,token,devid,signature,securityContext);
    }
    @GET
    @Path("/stops/route/{route_id}/route_type/{route_type}")
    
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all stops on a specific route", description = "", tags={ "Stops" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All stops on the specified route.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3StopsOnRouteResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))) })
    public Response stopsStopsForRoute(@Parameter(in = ParameterIn.PATH, description = "Identifier of route; values returned by Routes API - v3/routes",required=true) @PathParam("route_id") Integer routeId,@Parameter(in = ParameterIn.PATH, description = "Number identifying transport mode; values returned via RouteTypes API",required=true, schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" })
) @PathParam("route_type") Integer routeType,@Parameter(in = ParameterIn.QUERY, description = "An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response.") @QueryParam("direction_id") Integer directionId,@Parameter(in = ParameterIn.QUERY, description = "Indicates if stop disruption information will be returned (default = false)") @QueryParam("stop_disruptions") Boolean stopDisruptions,@Parameter(in = ParameterIn.QUERY, description = "Indicates if geopath data will be returned (default = false)") @QueryParam("include_geopath") Boolean includeGeopath,@Parameter(in = ParameterIn.QUERY, description = "Filter geopaths by date (ISO 8601 UTC format) (default = current date)") @QueryParam("geopath_utc") Date geopathUtc,@Parameter(in = ParameterIn.QUERY, description = "Please ignore") @QueryParam("token") String token,@Parameter(in = ParameterIn.QUERY, description = "Your developer id") @QueryParam("devid") String devid,@Parameter(in = ParameterIn.QUERY, description = "Authentication signature for request") @QueryParam("signature") String signature,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.stopsStopsForRoute(routeId,routeType,directionId,stopDisruptions,includeGeopath,geopathUtc,token,devid,signature,securityContext);
    }
}
