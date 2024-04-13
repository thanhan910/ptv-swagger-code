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

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import jakarta.inject.Inject;

import java.util.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class V3ApiControllerTest {

    @Inject
    private V3Api api;

    @Test
    void departuresGetForStopTest() {
        Integer routeType = null;
        Integer stopId = null;
        List<Integer> platformNumbers = null;
        Integer directionId = null;
        Boolean gtfs = null;
        OffsetDateTime dateUtc = null;
        Integer maxResults = null;
        Boolean includeCancelled = null;
        Boolean lookBackwards = null;
        List<String> expand = null;
        Boolean includeGeopath = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.departuresGetForStop(routeType, stopId, platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void departuresGetForStopAndRouteTest() {
        Integer routeType = null;
        Integer stopId = null;
        String routeId = null;
        Integer directionId = null;
        Boolean gtfs = null;
        OffsetDateTime dateUtc = null;
        Integer maxResults = null;
        Boolean includeCancelled = null;
        Boolean lookBackwards = null;
        List<String> expand = null;
        Boolean includeGeopath = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.departuresGetForStopAndRoute(routeType, stopId, routeId, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void directionsForDirectionTest() {
        Integer directionId = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.directionsForDirection(directionId, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void directionsForDirectionAndTypeTest() {
        Integer directionId = null;
        Integer routeType = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.directionsForDirectionAndType(directionId, routeType, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void directionsForRouteTest() {
        Integer routeId = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.directionsForRoute(routeId, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void disruptionsGetAllDisruptionsTest() {
        List<Integer> routeTypes = null;
        List<Integer> disruptionModes = null;
        String disruptionStatus = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.disruptionsGetAllDisruptions(routeTypes, disruptionModes, disruptionStatus, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void disruptionsGetDisruptionByIdTest() {
        Long disruptionId = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.disruptionsGetDisruptionById(disruptionId, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void disruptionsGetDisruptionModesTest() {
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.disruptionsGetDisruptionModes(token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void disruptionsGetDisruptionsByRouteTest() {
        Integer routeId = null;
        String disruptionStatus = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.disruptionsGetDisruptionsByRoute(routeId, disruptionStatus, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void disruptionsGetDisruptionsByRouteAndStopTest() {
        Integer routeId = null;
        Integer stopId = null;
        String disruptionStatus = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.disruptionsGetDisruptionsByRouteAndStop(routeId, stopId, disruptionStatus, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void disruptionsGetDisruptionsByStopTest() {
        Integer stopId = null;
        String disruptionStatus = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.disruptionsGetDisruptionsByStop(stopId, disruptionStatus, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void fareEstimateGetFareEstimateByZoneTest() {
        Integer minZone = null;
        Integer maxZone = null;
        OffsetDateTime journeyTouchOnUtc = null;
        OffsetDateTime journeyTouchOffUtc = null;
        Boolean isJourneyInFreeTramZone = null;
        List<Integer> travelledRouteTypes = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.fareEstimateGetFareEstimateByZone(minZone, maxZone, journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void outletsGetAllOutletsTest() {
        Integer maxResults = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.outletsGetAllOutlets(maxResults, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void outletsGetOutletsByGeolocationTest() {
        Float latitude = null;
        Float longitude = null;
        Double maxDistance = null;
        Integer maxResults = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.outletsGetOutletsByGeolocation(latitude, longitude, maxDistance, maxResults, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void patternsGetPatternByRunTest() {
        String runRef = null;
        Integer routeType = null;
        List<String> expand = null;
        Integer stopId = null;
        OffsetDateTime dateUtc = null;
        Boolean includeSkippedStops = null;
        Boolean includeGeopath = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.patternsGetPatternByRun(runRef, routeType, expand, stopId, dateUtc, includeSkippedStops, includeGeopath, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void routeTypesGetRouteTypesTest() {
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.routeTypesGetRouteTypes(token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void routesOneOrMoreRoutesTest() {
        List<Integer> routeTypes = null;
        String routeName = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.routesOneOrMoreRoutes(routeTypes, routeName, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void routesRouteFromIdTest() {
        Integer routeId = null;
        Boolean includeGeopath = null;
        OffsetDateTime geopathUtc = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.routesRouteFromId(routeId, includeGeopath, geopathUtc, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void runsForRouteTest() {
        Integer routeId = null;
        List<String> expand = null;
        OffsetDateTime dateUtc = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.runsForRoute(routeId, expand, dateUtc, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void runsForRouteAndRouteTypeTest() {
        Integer routeId = null;
        Integer routeType = null;
        List<String> expand = null;
        OffsetDateTime dateUtc = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.runsForRouteAndRouteType(routeId, routeType, expand, dateUtc, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void runsForRunTest() {
        String runRef = null;
        List<String> expand = null;
        OffsetDateTime dateUtc = null;
        Boolean includeGeopath = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.runsForRun(runRef, expand, dateUtc, includeGeopath, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void runsForRunAndRouteTypeTest() {
        String runRef = null;
        Integer routeType = null;
        List<String> expand = null;
        OffsetDateTime dateUtc = null;
        Boolean includeGeopath = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.runsForRunAndRouteType(runRef, routeType, expand, dateUtc, includeGeopath, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void searchSearchTest() {
        String searchTerm = null;
        List<Integer> routeTypes = null;
        Float latitude = null;
        Float longitude = null;
        Float maxDistance = null;
        Boolean includeAddresses = null;
        Boolean includeOutlets = null;
        Boolean matchStopBySuburb = null;
        Boolean matchRouteBySuburb = null;
        Boolean matchStopByGtfsStopId = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.searchSearch(searchTerm, routeTypes, latitude, longitude, maxDistance, includeAddresses, includeOutlets, matchStopBySuburb, matchRouteBySuburb, matchStopByGtfsStopId, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void stopsStopDetailsTest() {
        Integer stopId = null;
        Integer routeType = null;
        Boolean stopLocation = null;
        Boolean stopAmenities = null;
        Boolean stopAccessibility = null;
        Boolean stopContact = null;
        Boolean stopTicket = null;
        Boolean gtfs = null;
        Boolean stopStaffing = null;
        Boolean stopDisruptions = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.stopsStopDetails(stopId, routeType, stopLocation, stopAmenities, stopAccessibility, stopContact, stopTicket, gtfs, stopStaffing, stopDisruptions, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void stopsStopsByGeolocationTest() {
        Float latitude = null;
        Float longitude = null;
        List<Integer> routeTypes = null;
        Integer maxResults = null;
        Double maxDistance = null;
        Boolean stopDisruptions = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.stopsStopsByGeolocation(latitude, longitude, routeTypes, maxResults, maxDistance, stopDisruptions, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void stopsStopsForRouteTest() {
        Integer routeId = null;
        Integer routeType = null;
        Integer directionId = null;
        Boolean stopDisruptions = null;
        Boolean includeGeopath = null;
        OffsetDateTime geopathUtc = null;
        String token = null;
        String devid = null;
        String signature = null;
        try {
            //TODO: api.stopsStopsForRoute(routeId, routeType, directionId, stopDisruptions, includeGeopath, geopathUtc, token, devid, signature).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
