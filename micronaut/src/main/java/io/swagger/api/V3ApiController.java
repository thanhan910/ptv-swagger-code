package io.swagger.api;

import org.threeten.bp.OffsetDateTime;

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

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.HttpResponse;
import io.reactivex.rxjava3.core.Single;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Controller
public class V3ApiController implements V3Api {

    @Override
    public Single<HttpResponse<V3DeparturesResponse>> departuresGetForStop(Integer routeType, Integer stopId, @Nullable List<Integer> platformNumbers, @Nullable Integer directionId, @Nullable Boolean gtfs, @Nullable OffsetDateTime dateUtc, @Nullable Integer maxResults, @Nullable Boolean includeCancelled, @Nullable Boolean lookBackwards, @Nullable List<String> expand, @Nullable Boolean includeGeopath, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.departuresGetForStop(routeType, stopId, platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3DeparturesResponse>> departuresGetForStopAndRoute(Integer routeType, Integer stopId, String routeId, @Nullable Integer directionId, @Nullable Boolean gtfs, @Nullable OffsetDateTime dateUtc, @Nullable Integer maxResults, @Nullable Boolean includeCancelled, @Nullable Boolean lookBackwards, @Nullable List<String> expand, @Nullable Boolean includeGeopath, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.departuresGetForStopAndRoute(routeType, stopId, routeId, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3DirectionsResponse>> directionsForDirection(Integer directionId, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.directionsForDirection(directionId, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3DirectionsResponse>> directionsForDirectionAndType(Integer directionId, Integer routeType, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.directionsForDirectionAndType(directionId, routeType, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3DirectionsResponse>> directionsForRoute(Integer routeId, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.directionsForRoute(routeId, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3DisruptionsResponse>> disruptionsGetAllDisruptions(@Nullable List<Integer> routeTypes, @Nullable List<Integer> disruptionModes, @Nullable String disruptionStatus, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.disruptionsGetAllDisruptions(routeTypes, disruptionModes, disruptionStatus, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3DisruptionResponse>> disruptionsGetDisruptionById(Long disruptionId, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.disruptionsGetDisruptionById(disruptionId, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3DisruptionModesResponse>> disruptionsGetDisruptionModes(@Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.disruptionsGetDisruptionModes(token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3DisruptionsResponse>> disruptionsGetDisruptionsByRoute(Integer routeId, @Nullable String disruptionStatus, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.disruptionsGetDisruptionsByRoute(routeId, disruptionStatus, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3DisruptionsResponse>> disruptionsGetDisruptionsByRouteAndStop(Integer routeId, Integer stopId, @Nullable String disruptionStatus, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.disruptionsGetDisruptionsByRouteAndStop(routeId, stopId, disruptionStatus, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3DisruptionsResponse>> disruptionsGetDisruptionsByStop(Integer stopId, @Nullable String disruptionStatus, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.disruptionsGetDisruptionsByStop(stopId, disruptionStatus, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3FareEstimateResponse>> fareEstimateGetFareEstimateByZone(Integer minZone, Integer maxZone, @Nullable OffsetDateTime journeyTouchOnUtc, @Nullable OffsetDateTime journeyTouchOffUtc, @Nullable Boolean isJourneyInFreeTramZone, @Nullable List<Integer> travelledRouteTypes, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.fareEstimateGetFareEstimateByZone(minZone, maxZone, journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3OutletResponse>> outletsGetAllOutlets(@Nullable Integer maxResults, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.outletsGetAllOutlets(maxResults, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3OutletGeolocationResponse>> outletsGetOutletsByGeolocation(Float latitude, Float longitude, @Nullable Double maxDistance, @Nullable Integer maxResults, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.outletsGetOutletsByGeolocation(latitude, longitude, maxDistance, maxResults, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3StoppingPattern>> patternsGetPatternByRun(String runRef, Integer routeType, @NotNull List<String> expand, @Nullable Integer stopId, @Nullable OffsetDateTime dateUtc, @Nullable Boolean includeSkippedStops, @Nullable Boolean includeGeopath, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.patternsGetPatternByRun(runRef, routeType, expand, stopId, dateUtc, includeSkippedStops, includeGeopath, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3RouteTypesResponse>> routeTypesGetRouteTypes(@Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.routeTypesGetRouteTypes(token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3RouteResponse>> routesOneOrMoreRoutes(@Nullable List<Integer> routeTypes, @Nullable String routeName, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.routesOneOrMoreRoutes(routeTypes, routeName, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3RouteResponse>> routesRouteFromId(Integer routeId, @Nullable Boolean includeGeopath, @Nullable OffsetDateTime geopathUtc, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.routesRouteFromId(routeId, includeGeopath, geopathUtc, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3RunsResponse>> runsForRoute(Integer routeId, @Nullable List<String> expand, @Nullable OffsetDateTime dateUtc, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.runsForRoute(routeId, expand, dateUtc, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3RunsResponse>> runsForRouteAndRouteType(Integer routeId, Integer routeType, @NotNull List<String> expand, @Nullable OffsetDateTime dateUtc, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.runsForRouteAndRouteType(routeId, routeType, expand, dateUtc, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3RunsResponse>> runsForRun(String runRef, @NotNull List<String> expand, @Nullable OffsetDateTime dateUtc, @Nullable Boolean includeGeopath, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.runsForRun(runRef, expand, dateUtc, includeGeopath, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3RunResponse>> runsForRunAndRouteType(String runRef, Integer routeType, @NotNull List<String> expand, @Nullable OffsetDateTime dateUtc, @Nullable Boolean includeGeopath, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.runsForRunAndRouteType(runRef, routeType, expand, dateUtc, includeGeopath, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3SearchResult>> searchSearch(String searchTerm, @Nullable List<Integer> routeTypes, @Nullable Float latitude, @Nullable Float longitude, @Nullable Float maxDistance, @Nullable Boolean includeAddresses, @Nullable Boolean includeOutlets, @Nullable Boolean matchStopBySuburb, @Nullable Boolean matchRouteBySuburb, @Nullable Boolean matchStopByGtfsStopId, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.searchSearch(searchTerm, routeTypes, latitude, longitude, maxDistance, includeAddresses, includeOutlets, matchStopBySuburb, matchRouteBySuburb, matchStopByGtfsStopId, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3StopResponse>> stopsStopDetails(Integer stopId, Integer routeType, @Nullable Boolean stopLocation, @Nullable Boolean stopAmenities, @Nullable Boolean stopAccessibility, @Nullable Boolean stopContact, @Nullable Boolean stopTicket, @Nullable Boolean gtfs, @Nullable Boolean stopStaffing, @Nullable Boolean stopDisruptions, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.stopsStopDetails(stopId, routeType, stopLocation, stopAmenities, stopAccessibility, stopContact, stopTicket, gtfs, stopStaffing, stopDisruptions, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3StopsByDistanceResponse>> stopsStopsByGeolocation(Float latitude, Float longitude, @Nullable List<Integer> routeTypes, @Nullable Integer maxResults, @Nullable Double maxDistance, @Nullable Boolean stopDisruptions, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.stopsStopsByGeolocation(latitude, longitude, routeTypes, maxResults, maxDistance, stopDisruptions, token, devid, signature);
    }

    @Override
    public Single<HttpResponse<V3StopsOnRouteResponse>> stopsStopsForRoute(Integer routeId, Integer routeType, @Nullable Integer directionId, @Nullable Boolean stopDisruptions, @Nullable Boolean includeGeopath, @Nullable OffsetDateTime geopathUtc, @Nullable String token, @Nullable String devid, @Nullable String signature) {
        // TODO: Implement me
        return V3Api.super.stopsStopsForRoute(routeId, routeType, directionId, stopDisruptions, includeGeopath, geopathUtc, token, devid, signature);
    }
}
