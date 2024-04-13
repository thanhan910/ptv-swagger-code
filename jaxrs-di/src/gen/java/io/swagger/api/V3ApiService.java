package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

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

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2024-04-14T03:35:34.831658800+10:00[Australia/Sydney]")
public interface V3ApiService {
    public Response departuresGetForStop(Integer routeType,Integer stopId, List<Integer> platformNumbers, Integer directionId, Boolean gtfs, Date dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature,SecurityContext securityContext);
    public Response departuresGetForStopAndRoute(Integer routeType,Integer stopId,String routeId, Integer directionId, Boolean gtfs, Date dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature,SecurityContext securityContext);
    public Response directionsForDirection(Integer directionId, String token, String devid, String signature,SecurityContext securityContext);
    public Response directionsForDirectionAndType(Integer directionId,Integer routeType, String token, String devid, String signature,SecurityContext securityContext);
    public Response directionsForRoute(Integer routeId, String token, String devid, String signature,SecurityContext securityContext);
    public Response disruptionsGetAllDisruptions( List<Integer> routeTypes, List<Integer> disruptionModes, String disruptionStatus, String token, String devid, String signature,SecurityContext securityContext);
    public Response disruptionsGetDisruptionById(Long disruptionId, String token, String devid, String signature,SecurityContext securityContext);
    public Response disruptionsGetDisruptionModes( String token, String devid, String signature,SecurityContext securityContext);
    public Response disruptionsGetDisruptionsByRoute(Integer routeId, String disruptionStatus, String token, String devid, String signature,SecurityContext securityContext);
    public Response disruptionsGetDisruptionsByRouteAndStop(Integer routeId,Integer stopId, String disruptionStatus, String token, String devid, String signature,SecurityContext securityContext);
    public Response disruptionsGetDisruptionsByStop(Integer stopId, String disruptionStatus, String token, String devid, String signature,SecurityContext securityContext);
    public Response fareEstimateGetFareEstimateByZone(Integer minZone,Integer maxZone, Date journeyTouchOnUtc, Date journeyTouchOffUtc, Boolean isJourneyInFreeTramZone, List<Integer> travelledRouteTypes, String token, String devid, String signature,SecurityContext securityContext);
    public Response outletsGetAllOutlets( Integer maxResults, String token, String devid, String signature,SecurityContext securityContext);
    public Response outletsGetOutletsByGeolocation(Float latitude,Float longitude, Double maxDistance, Integer maxResults, String token, String devid, String signature,SecurityContext securityContext);
    public Response patternsGetPatternByRun(String runRef,Integer routeType, @NotNull List<String> expand, Integer stopId, Date dateUtc, Boolean includeSkippedStops, Boolean includeGeopath, String token, String devid, String signature,SecurityContext securityContext);
    public Response routeTypesGetRouteTypes( String token, String devid, String signature,SecurityContext securityContext);
    public Response routesOneOrMoreRoutes( List<Integer> routeTypes, String routeName, String token, String devid, String signature,SecurityContext securityContext);
    public Response routesRouteFromId(Integer routeId, Boolean includeGeopath, Date geopathUtc, String token, String devid, String signature,SecurityContext securityContext);
    public Response runsForRoute(Integer routeId, List<String> expand, Date dateUtc, String token, String devid, String signature,SecurityContext securityContext);
    public Response runsForRouteAndRouteType(Integer routeId,Integer routeType, @NotNull List<String> expand, Date dateUtc, String token, String devid, String signature,SecurityContext securityContext);
    public Response runsForRun(String runRef, @NotNull List<String> expand, Date dateUtc, Boolean includeGeopath, String token, String devid, String signature,SecurityContext securityContext);
    public Response runsForRunAndRouteType(String runRef,Integer routeType, @NotNull List<String> expand, Date dateUtc, Boolean includeGeopath, String token, String devid, String signature,SecurityContext securityContext);
    public Response searchSearch(String searchTerm, List<Integer> routeTypes, Float latitude, Float longitude, Float maxDistance, Boolean includeAddresses, Boolean includeOutlets, Boolean matchStopBySuburb, Boolean matchRouteBySuburb, Boolean matchStopByGtfsStopId, String token, String devid, String signature,SecurityContext securityContext);
    public Response stopsStopDetails(Integer stopId,Integer routeType, Boolean stopLocation, Boolean stopAmenities, Boolean stopAccessibility, Boolean stopContact, Boolean stopTicket, Boolean gtfs, Boolean stopStaffing, Boolean stopDisruptions, String token, String devid, String signature,SecurityContext securityContext);
    public Response stopsStopsByGeolocation(Float latitude,Float longitude, List<Integer> routeTypes, Integer maxResults, Double maxDistance, Boolean stopDisruptions, String token, String devid, String signature,SecurityContext securityContext);
    public Response stopsStopsForRoute(Integer routeId,Integer routeType, Integer directionId, Boolean stopDisruptions, Boolean includeGeopath, Date geopathUtc, String token, String devid, String signature,SecurityContext securityContext);
}
