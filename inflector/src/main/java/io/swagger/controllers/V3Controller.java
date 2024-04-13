package io.swagger.controllers;

import io.swagger.oas.inflector.models.RequestContext;
import io.swagger.oas.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

import io.swagger.model.*;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")
public class V3Controller  {
  /** 
   * Uncomment and implement as you see fit.  These operations will map
   * Directly to operation calls from the routing logic.  Because the inflector
   * Code allows you to implement logic incrementally, they are disabled.
   **/

  /*
    public ResponseContext departuresGetForStop(RequestContext request , Integer routeType 
, Integer stopId 
, List<Integer> platformNumbers 
, Integer directionId 
, Boolean gtfs 
, Date dateUtc 
, Integer maxResults 
, Boolean includeCancelled 
, Boolean lookBackwards 
, List<String> expand 
, Boolean includeGeopath 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext departuresGetForStopAndRoute(RequestContext request , Integer routeType 
, Integer stopId 
, String routeId 
, Integer directionId 
, Boolean gtfs 
, Date dateUtc 
, Integer maxResults 
, Boolean includeCancelled 
, Boolean lookBackwards 
, List<String> expand 
, Boolean includeGeopath 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext directionsForDirection(RequestContext request , Integer directionId 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext directionsForDirectionAndType(RequestContext request , Integer directionId 
, Integer routeType 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext directionsForRoute(RequestContext request , Integer routeId 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext disruptionsGetAllDisruptions(RequestContext request , List<Integer> routeTypes 
, List<Integer> disruptionModes 
, String disruptionStatus 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext disruptionsGetDisruptionById(RequestContext request , Long disruptionId 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext disruptionsGetDisruptionModes(RequestContext request , String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext disruptionsGetDisruptionsByRoute(RequestContext request , Integer routeId 
, String disruptionStatus 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext disruptionsGetDisruptionsByRouteAndStop(RequestContext request , Integer routeId 
, Integer stopId 
, String disruptionStatus 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext disruptionsGetDisruptionsByStop(RequestContext request , Integer stopId 
, String disruptionStatus 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext fareEstimateGetFareEstimateByZone(RequestContext request , Integer minZone 
, Integer maxZone 
, Date journeyTouchOnUtc 
, Date journeyTouchOffUtc 
, Boolean isJourneyInFreeTramZone 
, List<Integer> travelledRouteTypes 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext outletsGetAllOutlets(RequestContext request , Integer maxResults 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext outletsGetOutletsByGeolocation(RequestContext request , Float latitude 
, Float longitude 
, Double maxDistance 
, Integer maxResults 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext patternsGetPatternByRun(RequestContext request , String runRef 
, Integer routeType 
, List<String> expand 
, Integer stopId 
, Date dateUtc 
, Boolean includeSkippedStops 
, Boolean includeGeopath 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext routeTypesGetRouteTypes(RequestContext request , String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext routesOneOrMoreRoutes(RequestContext request , List<Integer> routeTypes 
, String routeName 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext routesRouteFromId(RequestContext request , Integer routeId 
, Boolean includeGeopath 
, Date geopathUtc 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext runsForRoute(RequestContext request , Integer routeId 
, List<String> expand 
, Date dateUtc 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext runsForRouteAndRouteType(RequestContext request , Integer routeId 
, Integer routeType 
, List<String> expand 
, Date dateUtc 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext runsForRun(RequestContext request , String runRef 
, List<String> expand 
, Date dateUtc 
, Boolean includeGeopath 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext runsForRunAndRouteType(RequestContext request , String runRef 
, Integer routeType 
, List<String> expand 
, Date dateUtc 
, Boolean includeGeopath 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext searchSearch(RequestContext request , String searchTerm 
, List<Integer> routeTypes 
, Float latitude 
, Float longitude 
, Float maxDistance 
, Boolean includeAddresses 
, Boolean includeOutlets 
, Boolean matchStopBySuburb 
, Boolean matchRouteBySuburb 
, Boolean matchStopByGtfsStopId 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext stopsStopDetails(RequestContext request , Integer stopId 
, Integer routeType 
, Boolean stopLocation 
, Boolean stopAmenities 
, Boolean stopAccessibility 
, Boolean stopContact 
, Boolean stopTicket 
, Boolean gtfs 
, Boolean stopStaffing 
, Boolean stopDisruptions 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext stopsStopsByGeolocation(RequestContext request , Float latitude 
, Float longitude 
, List<Integer> routeTypes 
, Integer maxResults 
, Double maxDistance 
, Boolean stopDisruptions 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext stopsStopsForRoute(RequestContext request , Integer routeId 
, Integer routeType 
, Integer directionId 
, Boolean stopDisruptions 
, Boolean includeGeopath 
, Date geopathUtc 
, String token 
, String devid 
, String signature 
) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}

