package io.swagger.api;

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

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/v3")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2024-04-14T03:35:19.221145900+10:00[Australia/Sydney]")
public class V3Api {

    @GET
    @Path("/departures/route_type/{route_type}/stop/{stop_id}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View departures for all routes from a stop", description = "", tags={ "Departures" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Service departures from the specified stop for all routes of the specified route type; departures are timetabled and real-time (if applicable).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DeparturesResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response departuresGetForStop( @PathParam("route_type")

 @Parameter(description = "Number identifying transport mode; values returned via RouteTypes API") Integer routeType
, @PathParam("stop_id")

 @Parameter(description = "Identifier of stop; values returned by Stops API") Integer stopId
,  @QueryParam("platform_numbers") 

 @Parameter(description = "Filter by platform number at stop")  List<Integer> platformNumbers
,  @QueryParam("direction_id") 

 @Parameter(description = "Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}")  Integer directionId
,  @QueryParam("gtfs") 

 @Parameter(description = "Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data")  Boolean gtfs
,  @QueryParam("date_utc") 

 @Parameter(description = "Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)")  Date dateUtc
,  @QueryParam("max_results") 

 @Parameter(description = "Maximum number of results returned")  Integer maxResults
,  @QueryParam("include_cancelled") 

 @Parameter(description = "Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only")  Boolean includeCancelled
,  @QueryParam("look_backwards") 

 @Parameter(description = "Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.")  Boolean lookBackwards
,  @QueryParam("expand") 

 @Parameter(description = "List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.")  List<String> expand
,  @QueryParam("include_geopath") 

 @Parameter(description = "Indicates if the route geopath should be returned")  Boolean includeGeopath
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View departures for a specific route from a stop", description = "", tags={ "Departures" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Service departures from the specified stop for the specified route (and route type); departures are timetabled and real-time (if applicable).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DeparturesResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response departuresGetForStopAndRoute( @PathParam("route_type")

 @Parameter(description = "Number identifying transport mode; values returned via RouteTypes API") Integer routeType
, @PathParam("stop_id")

 @Parameter(description = "Identifier of stop; values returned by Stops API") Integer stopId
, @PathParam("route_id")

 @Parameter(description = "Identifier of route; values returned by Routes API - v3/routes") String routeId
,  @QueryParam("direction_id") 

 @Parameter(description = "Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}")  Integer directionId
,  @QueryParam("gtfs") 

 @Parameter(description = "Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data")  Boolean gtfs
,  @QueryParam("date_utc") 

 @Parameter(description = "Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)")  Date dateUtc
,  @QueryParam("max_results") 

 @Parameter(description = "Maximum number of results returned")  Integer maxResults
,  @QueryParam("include_cancelled") 

 @Parameter(description = "Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only")  Boolean includeCancelled
,  @QueryParam("look_backwards") 

 @Parameter(description = "Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.")  Boolean lookBackwards
,  @QueryParam("expand") 

 @Parameter(description = "List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.")  List<String> expand
,  @QueryParam("include_geopath") 

 @Parameter(description = "Indicates if the route geopath should be returned")  Boolean includeGeopath
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/directions/{direction_id}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all routes for a direction of travel", description = "", tags={ "Directions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All routes that travel in the specified direction.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DirectionsResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response directionsForDirection( @PathParam("direction_id")

 @Parameter(description = "Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}") Integer directionId
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/directions/{direction_id}/route_type/{route_type}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all routes of a particular type for a direction of travel", description = "", tags={ "Directions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All routes of the specified route type that travel in the specified direction.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DirectionsResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response directionsForDirectionAndType( @PathParam("direction_id")

 @Parameter(description = "Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}") Integer directionId
, @PathParam("route_type")

 @Parameter(description = "Number identifying transport mode; values returned via RouteTypes API") Integer routeType
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/directions/route/{route_id}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View directions that a route travels in", description = "", tags={ "Directions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The directions that a specified route travels in.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DirectionsResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response directionsForRoute( @PathParam("route_id")

 @Parameter(description = "Identifier of route; values returned by Routes API - v3/routes") Integer routeId
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/disruptions")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all disruptions for all route types", description = "", tags={ "Disruptions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All disruption information for all route types.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionsResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response disruptionsGetAllDisruptions(  @QueryParam("route_types") 

 @Parameter(description = "Filter by route_type; values returned via RouteTypes API")  List<Integer> routeTypes
,  @QueryParam("disruption_modes") 

 @Parameter(description = "Filter by disruption_mode; values returned via v3/disruptions/modes API")  List<Integer> disruptionModes
,  @QueryParam("disruption_status") 

 @Parameter(description = "Filter by status of disruption")  String disruptionStatus
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/disruptions/{disruption_id}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View a specific disruption", description = "", tags={ "Disruptions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Disruption information for the specified disruption ID.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response disruptionsGetDisruptionById( @PathParam("disruption_id")

 @Parameter(description = "Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id}") Long disruptionId
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/disruptions/modes")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "Get all disruption modes", description = "", tags={ "Disruptions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Disruption specific modes", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionModesResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response disruptionsGetDisruptionModes(  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/disruptions/route/{route_id}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all disruptions for a particular route", description = "", tags={ "Disruptions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All disruption information (if any exists) for the specified route.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionsResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response disruptionsGetDisruptionsByRoute( @PathParam("route_id")

 @Parameter(description = "Identifier of route; values returned by Routes API - v3/routes") Integer routeId
,  @QueryParam("disruption_status") 

 @Parameter(description = "Filter by status of disruption")  String disruptionStatus
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/disruptions/route/{route_id}/stop/{stop_id}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all disruptions for a particular route and stop", description = "", tags={ "Disruptions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All disruption information (if any exists) for the specified route and stop.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionsResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response disruptionsGetDisruptionsByRouteAndStop( @PathParam("route_id")

 @Parameter(description = "Identifier of route; values returned by Routes API - v3/routes") Integer routeId
, @PathParam("stop_id")

 @Parameter(description = "Identifier of stop; values returned by Stops API - v3/stops") Integer stopId
,  @QueryParam("disruption_status") 

 @Parameter(description = "Filter by status of disruption")  String disruptionStatus
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/disruptions/stop/{stop_id}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all disruptions for a particular stop", description = "", tags={ "Disruptions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All disruption information (if any exists) for the specified stop.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3DisruptionsResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response disruptionsGetDisruptionsByStop( @PathParam("stop_id")

 @Parameter(description = "Identifier of stop; values returned by Stops API - v3/stops") Integer stopId
,  @QueryParam("disruption_status") 

 @Parameter(description = "Filter by status of disruption")  String disruptionStatus
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/fare_estimate/min_zone/{minZone}/max_zone/{maxZone}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "Estimate a fare by zone", description = "", tags={ "FareEstimate" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Resultant set fare estimates", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3FareEstimateResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response fareEstimateGetFareEstimateByZone( @PathParam("minZone")

 @Parameter(description = "Minimum Zone travelled through ie. 1") Integer minZone
, @PathParam("maxZone")

 @Parameter(description = "Maximum Zone travelled through id. 6") Integer maxZone
,  @QueryParam("journey_touch_on_utc") 

 @Parameter(description = "JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).")  Date journeyTouchOnUtc
,  @QueryParam("journey_touch_off_utc") 

 @Parameter(description = "JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).")  Date journeyTouchOffUtc
,  @QueryParam("is_journey_in_free_tram_zone") 

  Boolean isJourneyInFreeTramZone
,  @QueryParam("travelled_route_types") 

  List<Integer> travelledRouteTypes
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/outlets")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "List all ticket outlets", description = "", tags={ "Outlets" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Ticket outlets.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3OutletResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response outletsGetAllOutlets(  @QueryParam("max_results") 

 @Parameter(description = "Maximum number of results returned (default &#x3D; 30)")  Integer maxResults
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/outlets/location/{latitude},{longitude}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "List ticket outlets near a specific location", description = "", tags={ "Outlets" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Ticket outlets near the specified location.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3OutletGeolocationResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response outletsGetOutletsByGeolocation( @PathParam("latitude")

 @Parameter(description = "Geographic coordinate of latitude") Float latitude
, @PathParam("longitude")

 @Parameter(description = "Geographic coordinate of longitude") Float longitude
,  @QueryParam("max_distance") 

 @Parameter(description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300)")  Double maxDistance
,  @QueryParam("max_results") 

 @Parameter(description = "Maximum number of results returned (default &#x3D; 30)")  Integer maxResults
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/pattern/run/{run_ref}/route_type/{route_type}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View the stopping pattern for a specific trip/service run", description = "", tags={ "Patterns" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The stopping pattern of the specified run_ref and route type. (NOTE: the departure sequence field should be used to sort departures in chronological order, however it is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4)", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3StoppingPattern.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response patternsGetPatternByRun( @PathParam("run_ref")

 @Parameter(description = "The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.") String runRef
, @PathParam("route_type")

 @Parameter(description = "Number identifying transport mode; values returned via RouteTypes API") Integer routeType
, @NotNull  @QueryParam("expand") 

 @Parameter(description = "List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information.")  List<String> expand
,  @QueryParam("stop_id") 

 @Parameter(description = "Filter by stop_id; values returned by Stops API")  Integer stopId
,  @QueryParam("date_utc") 

 @Parameter(description = "Filter by the date and time of the request (ISO 8601 UTC format)")  Date dateUtc
,  @QueryParam("include_skipped_stops") 

 @Parameter(description = "Include any skipped stops in a stopping pattern. Defaults to false.")  Boolean includeSkippedStops
,  @QueryParam("include_geopath") 

 @Parameter(description = "Indicates if geopath data will be returned (default &#x3D; false)")  Boolean includeGeopath
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/route_types")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all route types and their names", description = "", tags={ "RouteTypes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All route types (i.e. identifiers of transport modes) and their names.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RouteTypesResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response routeTypesGetRouteTypes(  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/routes")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View route names and numbers for all routes", description = "", tags={ "Routes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Route names and numbers for all routes of all route types.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RouteResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response routesOneOrMoreRoutes(  @QueryParam("route_types") 

 @Parameter(description = "Filter by route_type; values returned via RouteTypes API")  List<Integer> routeTypes
,  @QueryParam("route_name") 

 @Parameter(description = "Filter by name  of route (accepts partial route name matches)")  String routeName
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/routes/{route_id}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View route name and number for specific route ID", description = "", tags={ "Routes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The route name and number for the specified route ID.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RouteResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response routesRouteFromId( @PathParam("route_id")

 @Parameter(description = "Identifier of route; values returned by Departures, Directions and Disruptions APIs") Integer routeId
,  @QueryParam("include_geopath") 

 @Parameter(description = "Indicates kif geopath data will be returned (default &#x3D; false)")  Boolean includeGeopath
,  @QueryParam("geopath_utc") 

 @Parameter(description = "Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date)")  Date geopathUtc
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/runs/route/{route_id}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all trip/service runs for a specific route ID", description = "", tags={ "Runs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All trip/service run details for the specified route ID.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RunsResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response runsForRoute( @PathParam("route_id")

 @Parameter(description = "Identifier of route; values returned by Routes API - v3/routes.") Integer routeId
,  @QueryParam("expand") 

 @Parameter(description = "List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.")  List<String> expand
,  @QueryParam("date_utc") 

 @Parameter(description = "Date of the request. (optional - defaults to now)")  Date dateUtc
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/runs/route/{route_id}/route_type/{route_type}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all trip/service runs for a specific route ID and route type", description = "", tags={ "Runs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All trip/service run details for the specified route ID and route type.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RunsResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response runsForRouteAndRouteType( @PathParam("route_id")

 @Parameter(description = "Identifier of route; values returned by Routes API - v3/routes.") Integer routeId
, @PathParam("route_type")

 @Parameter(description = "Number identifying transport mode; values returned via RouteTypes API") Integer routeType
, @NotNull  @QueryParam("expand") 

 @Parameter(description = "List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.")  List<String> expand
,  @QueryParam("date_utc") 

 @Parameter(description = "Date of the request. (optional - defaults to now)")  Date dateUtc
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/runs/{run_ref}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all trip/service runs for a specific run_ref", description = "", tags={ "Runs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All trip/service run details for the specified run_ref.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RunsResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response runsForRun( @PathParam("run_ref")

 @Parameter(description = "The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.") String runRef
, @NotNull  @QueryParam("expand") 

 @Parameter(description = "List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.")  List<String> expand
,  @QueryParam("date_utc") 

 @Parameter(description = "Date of the request. (optional - defaults to now)")  Date dateUtc
,  @QueryParam("include_geopath") 

 @Parameter(description = "Indicates if geopath data will be returned (default &#x3D; false)")  Boolean includeGeopath
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/runs/{run_ref}/route_type/{route_type}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View the trip/service run for a specific run_ref and route type", description = "", tags={ "Runs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The trip/service run details for the run_ref and route type specified.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3RunResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response runsForRunAndRouteType( @PathParam("run_ref")

 @Parameter(description = "The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.") String runRef
, @PathParam("route_type")

 @Parameter(description = "Number identifying transport mode; values returned via RouteTypes API") Integer routeType
, @NotNull  @QueryParam("expand") 

 @Parameter(description = "List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.")  List<String> expand
,  @QueryParam("date_utc") 

 @Parameter(description = "Date of the request. (optional - defaults to now)")  Date dateUtc
,  @QueryParam("include_geopath") 

 @Parameter(description = "Indicates if geopath data will be returned (default &#x3D; false)")  Boolean includeGeopath
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/search/{search_term}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View stops, routes and myki ticket outlets that match the search term", description = "", tags={ "Search" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Stops, routes and myki ticket outlets that contain the search term (note: stops and routes are ordered by route_type by default).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3SearchResult.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response searchSearch( @PathParam("search_term")

 @Parameter(description = "Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes)") String searchTerm
,  @QueryParam("route_types") 

 @Parameter(description = "Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)")  List<Integer> routeTypes
,  @QueryParam("latitude") 

 @Parameter(description = "Filter by geographic coordinate of latitude")  Float latitude
,  @QueryParam("longitude") 

 @Parameter(description = "Filter by geographic coordinate of longitude")  Float longitude
,  @QueryParam("max_distance") 

 @Parameter(description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters")  Float maxDistance
,  @QueryParam("include_addresses") 

 @Parameter(description = "Placeholder for future development; currently unavailable")  Boolean includeAddresses
,  @QueryParam("include_outlets") 

 @Parameter(description = "Indicates if outlets will be returned in response (default &#x3D; true)")  Boolean includeOutlets
,  @QueryParam("match_stop_by_suburb") 

 @Parameter(description = "Indicates whether to find stops by suburbs in the search term (default &#x3D; true)")  Boolean matchStopBySuburb
,  @QueryParam("match_route_by_suburb") 

 @Parameter(description = "Indicates whether to find routes by suburbs in the search term (default &#x3D; true)")  Boolean matchRouteBySuburb
,  @QueryParam("match_stop_by_gtfs_stop_id") 

 @Parameter(description = "Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false)")  Boolean matchStopByGtfsStopId
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/stops/{stop_id}/route_type/{route_type}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View facilities at a specific stop (Metro and V/Line stations only)", description = "", tags={ "Stops" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Stop location, amenity and accessibility facility information for the specified stop (metropolitan and V/Line stations only).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3StopResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response stopsStopDetails( @PathParam("stop_id")

 @Parameter(description = "Identifier of stop; values returned by Stops API") Integer stopId
, @PathParam("route_type")

 @Parameter(description = "Number identifying transport mode; values returned via RouteTypes API") Integer routeType
,  @QueryParam("stop_location") 

 @Parameter(description = "Indicates if stop location information will be returned (default &#x3D; false)")  Boolean stopLocation
,  @QueryParam("stop_amenities") 

 @Parameter(description = "Indicates if stop amenity information will be returned (default &#x3D; false)")  Boolean stopAmenities
,  @QueryParam("stop_accessibility") 

 @Parameter(description = "Indicates if stop accessibility information will be returned (default &#x3D; false)")  Boolean stopAccessibility
,  @QueryParam("stop_contact") 

 @Parameter(description = "Indicates if stop contact information will be returned (default &#x3D; false)")  Boolean stopContact
,  @QueryParam("stop_ticket") 

 @Parameter(description = "Indicates if stop ticket information will be returned (default &#x3D; false)")  Boolean stopTicket
,  @QueryParam("gtfs") 

 @Parameter(description = "Incdicates whether the stop_id is a GTFS ID or not")  Boolean gtfs
,  @QueryParam("stop_staffing") 

 @Parameter(description = "Indicates if stop staffing information will be returned (default &#x3D; false)")  Boolean stopStaffing
,  @QueryParam("stop_disruptions") 

 @Parameter(description = "Indicates if stop disruption information will be returned (default &#x3D; false)")  Boolean stopDisruptions
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/stops/location/{latitude},{longitude}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all stops near a specific location", description = "", tags={ "Stops" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All stops near the specified location.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3StopsByDistanceResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response stopsStopsByGeolocation( @PathParam("latitude")

 @Parameter(description = "Geographic coordinate of latitude") Float latitude
, @PathParam("longitude")

 @Parameter(description = "Geographic coordinate of longitude") Float longitude
,  @QueryParam("route_types") 

 @Parameter(description = "Filter by route_type; values returned via RouteTypes API")  List<Integer> routeTypes
,  @QueryParam("max_results") 

 @Parameter(description = "Maximum number of results returned (default &#x3D; 30)")  Integer maxResults
,  @QueryParam("max_distance") 

 @Parameter(description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300)")  Double maxDistance
,  @QueryParam("stop_disruptions") 

 @Parameter(description = "Indicates if stop disruption information will be returned (default &#x3D; false)")  Boolean stopDisruptions
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/stops/route/{route_id}/route_type/{route_type}")
    @Produces({ "application/json", "text/json", "text/html" })
    @Operation(summary = "View all stops on a specific route", description = "", tags={ "Stops" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "All stops on the specified route.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3StopsOnRouteResponse.class))),
        @ApiResponse(responseCode = "400", description = "Invalid Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Access Denied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = V3ErrorResponse.class)))
    })
    public Response stopsStopsForRoute( @PathParam("route_id")

 @Parameter(description = "Identifier of route; values returned by Routes API - v3/routes") Integer routeId
, @PathParam("route_type")

 @Parameter(description = "Number identifying transport mode; values returned via RouteTypes API") Integer routeType
,  @QueryParam("direction_id") 

 @Parameter(description = "An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response.")  Integer directionId
,  @QueryParam("stop_disruptions") 

 @Parameter(description = "Indicates if stop disruption information will be returned (default &#x3D; false)")  Boolean stopDisruptions
,  @QueryParam("include_geopath") 

 @Parameter(description = "Indicates if geopath data will be returned (default &#x3D; false)")  Boolean includeGeopath
,  @QueryParam("geopath_utc") 

 @Parameter(description = "Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date)")  Date geopathUtc
,  @QueryParam("token") 

 @Parameter(description = "Please ignore")  String token
,  @QueryParam("devid") 

 @Parameter(description = "Your developer id")  String devid
,  @QueryParam("signature") 

 @Parameter(description = "Authentication signature for request")  String signature
) {
        return Response.ok().entity("magic!").build();
    }}
