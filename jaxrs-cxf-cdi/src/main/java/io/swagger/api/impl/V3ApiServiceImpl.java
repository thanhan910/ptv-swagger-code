package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

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

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2024-04-14T03:35:13.240467400+10:00[Australia/Sydney]")
public class V3ApiServiceImpl implements V3ApiService {
      @Override
      public Response departuresGetForStop(Integer routeType, Integer stopId, List<Integer> platformNumbers, Integer directionId, Boolean gtfs, java.util.Date dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response departuresGetForStopAndRoute(Integer routeType, Integer stopId, String routeId, Integer directionId, Boolean gtfs, java.util.Date dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response directionsForDirection(Integer directionId, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response directionsForDirectionAndType(Integer directionId, Integer routeType, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response directionsForRoute(Integer routeId, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response disruptionsGetAllDisruptions(List<Integer> routeTypes, List<Integer> disruptionModes, String disruptionStatus, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response disruptionsGetDisruptionById(Long disruptionId, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response disruptionsGetDisruptionModes(String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response disruptionsGetDisruptionsByRoute(Integer routeId, String disruptionStatus, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response disruptionsGetDisruptionsByRouteAndStop(Integer routeId, Integer stopId, String disruptionStatus, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response disruptionsGetDisruptionsByStop(Integer stopId, String disruptionStatus, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response fareEstimateGetFareEstimateByZone(Integer minZone, Integer maxZone, java.util.Date journeyTouchOnUtc, java.util.Date journeyTouchOffUtc, Boolean isJourneyInFreeTramZone, List<Integer> travelledRouteTypes, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response outletsGetAllOutlets(Integer maxResults, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response outletsGetOutletsByGeolocation(Float latitude, Float longitude, Double maxDistance, Integer maxResults, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response patternsGetPatternByRun(String runRef, Integer routeType, List<String> expand, Integer stopId, java.util.Date dateUtc, Boolean includeSkippedStops, Boolean includeGeopath, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response routeTypesGetRouteTypes(String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response routesOneOrMoreRoutes(List<Integer> routeTypes, String routeName, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response routesRouteFromId(Integer routeId, Boolean includeGeopath, java.util.Date geopathUtc, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response runsForRoute(Integer routeId, List<String> expand, java.util.Date dateUtc, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response runsForRouteAndRouteType(Integer routeId, Integer routeType, List<String> expand, java.util.Date dateUtc, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response runsForRun(String runRef, List<String> expand, java.util.Date dateUtc, Boolean includeGeopath, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response runsForRunAndRouteType(String runRef, Integer routeType, List<String> expand, java.util.Date dateUtc, Boolean includeGeopath, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response searchSearch(String searchTerm, List<Integer> routeTypes, Float latitude, Float longitude, Float maxDistance, Boolean includeAddresses, Boolean includeOutlets, Boolean matchStopBySuburb, Boolean matchRouteBySuburb, Boolean matchStopByGtfsStopId, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response stopsStopDetails(Integer stopId, Integer routeType, Boolean stopLocation, Boolean stopAmenities, Boolean stopAccessibility, Boolean stopContact, Boolean stopTicket, Boolean gtfs, Boolean stopStaffing, Boolean stopDisruptions, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response stopsStopsByGeolocation(Float latitude, Float longitude, List<Integer> routeTypes, Integer maxResults, Double maxDistance, Boolean stopDisruptions, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response stopsStopsForRoute(Integer routeId, Integer routeType, Integer directionId, Boolean stopDisruptions, Boolean includeGeopath, java.util.Date geopathUtc, String token, String devid, String signature, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
