# io.swagger.client - Kotlin client library for PTV Timetable API - Version 3

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DeparturesApi* | [**departuresGetForStop**](docs/DeparturesApi.md#departuresgetforstop) | **GET** /v3/departures/route_type/{route_type}/stop/{stop_id} | View departures for all routes from a stop
*DeparturesApi* | [**departuresGetForStopAndRoute**](docs/DeparturesApi.md#departuresgetforstopandroute) | **GET** /v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id} | View departures for a specific route from a stop
*DirectionsApi* | [**directionsForDirection**](docs/DirectionsApi.md#directionsfordirection) | **GET** /v3/directions/{direction_id} | View all routes for a direction of travel
*DirectionsApi* | [**directionsForDirectionAndType**](docs/DirectionsApi.md#directionsfordirectionandtype) | **GET** /v3/directions/{direction_id}/route_type/{route_type} | View all routes of a particular type for a direction of travel
*DirectionsApi* | [**directionsForRoute**](docs/DirectionsApi.md#directionsforroute) | **GET** /v3/directions/route/{route_id} | View directions that a route travels in
*DisruptionsApi* | [**disruptionsGetAllDisruptions**](docs/DisruptionsApi.md#disruptionsgetalldisruptions) | **GET** /v3/disruptions | View all disruptions for all route types
*DisruptionsApi* | [**disruptionsGetDisruptionById**](docs/DisruptionsApi.md#disruptionsgetdisruptionbyid) | **GET** /v3/disruptions/{disruption_id} | View a specific disruption
*DisruptionsApi* | [**disruptionsGetDisruptionModes**](docs/DisruptionsApi.md#disruptionsgetdisruptionmodes) | **GET** /v3/disruptions/modes | Get all disruption modes
*DisruptionsApi* | [**disruptionsGetDisruptionsByRoute**](docs/DisruptionsApi.md#disruptionsgetdisruptionsbyroute) | **GET** /v3/disruptions/route/{route_id} | View all disruptions for a particular route
*DisruptionsApi* | [**disruptionsGetDisruptionsByRouteAndStop**](docs/DisruptionsApi.md#disruptionsgetdisruptionsbyrouteandstop) | **GET** /v3/disruptions/route/{route_id}/stop/{stop_id} | View all disruptions for a particular route and stop
*DisruptionsApi* | [**disruptionsGetDisruptionsByStop**](docs/DisruptionsApi.md#disruptionsgetdisruptionsbystop) | **GET** /v3/disruptions/stop/{stop_id} | View all disruptions for a particular stop
*FareEstimateApi* | [**fareEstimateGetFareEstimateByZone**](docs/FareEstimateApi.md#fareestimategetfareestimatebyzone) | **GET** /v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone} | Estimate a fare by zone
*OutletsApi* | [**outletsGetAllOutlets**](docs/OutletsApi.md#outletsgetalloutlets) | **GET** /v3/outlets | List all ticket outlets
*OutletsApi* | [**outletsGetOutletsByGeolocation**](docs/OutletsApi.md#outletsgetoutletsbygeolocation) | **GET** /v3/outlets/location/{latitude},{longitude} | List ticket outlets near a specific location
*PatternsApi* | [**patternsGetPatternByRun**](docs/PatternsApi.md#patternsgetpatternbyrun) | **GET** /v3/pattern/run/{run_ref}/route_type/{route_type} | View the stopping pattern for a specific trip/service run
*RouteTypesApi* | [**routeTypesGetRouteTypes**](docs/RouteTypesApi.md#routetypesgetroutetypes) | **GET** /v3/route_types | View all route types and their names
*RoutesApi* | [**routesOneOrMoreRoutes**](docs/RoutesApi.md#routesoneormoreroutes) | **GET** /v3/routes | View route names and numbers for all routes
*RoutesApi* | [**routesRouteFromId**](docs/RoutesApi.md#routesroutefromid) | **GET** /v3/routes/{route_id} | View route name and number for specific route ID
*RunsApi* | [**runsForRoute**](docs/RunsApi.md#runsforroute) | **GET** /v3/runs/route/{route_id} | View all trip/service runs for a specific route ID
*RunsApi* | [**runsForRouteAndRouteType**](docs/RunsApi.md#runsforrouteandroutetype) | **GET** /v3/runs/route/{route_id}/route_type/{route_type} | View all trip/service runs for a specific route ID and route type
*RunsApi* | [**runsForRun**](docs/RunsApi.md#runsforrun) | **GET** /v3/runs/{run_ref} | View all trip/service runs for a specific run_ref
*RunsApi* | [**runsForRunAndRouteType**](docs/RunsApi.md#runsforrunandroutetype) | **GET** /v3/runs/{run_ref}/route_type/{route_type} | View the trip/service run for a specific run_ref and route type
*SearchApi* | [**searchSearch**](docs/SearchApi.md#searchsearch) | **GET** /v3/search/{search_term} | View stops, routes and myki ticket outlets that match the search term
*StopsApi* | [**stopsStopDetails**](docs/StopsApi.md#stopsstopdetails) | **GET** /v3/stops/{stop_id}/route_type/{route_type} | View facilities at a specific stop (Metro and V/Line stations only)
*StopsApi* | [**stopsStopsByGeolocation**](docs/StopsApi.md#stopsstopsbygeolocation) | **GET** /v3/stops/location/{latitude},{longitude} | View all stops near a specific location
*StopsApi* | [**stopsStopsForRoute**](docs/StopsApi.md#stopsstopsforroute) | **GET** /v3/stops/route/{route_id}/route_type/{route_type} | View all stops on a specific route

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.V3BulkDeparturesRequest](docs/V3BulkDeparturesRequest.md)
 - [io.swagger.client.models.V3BulkDeparturesResponse](docs/V3BulkDeparturesResponse.md)
 - [io.swagger.client.models.V3BulkDeparturesRouteDirectionResponse](docs/V3BulkDeparturesRouteDirectionResponse.md)
 - [io.swagger.client.models.V3BulkDeparturesStopResponse](docs/V3BulkDeparturesStopResponse.md)
 - [io.swagger.client.models.V3BulkDeparturesUpdateResponse](docs/V3BulkDeparturesUpdateResponse.md)
 - [io.swagger.client.models.V3Departure](docs/V3Departure.md)
 - [io.swagger.client.models.V3DeparturesBroadParameters](docs/V3DeparturesBroadParameters.md)
 - [io.swagger.client.models.V3DeparturesResponse](docs/V3DeparturesResponse.md)
 - [io.swagger.client.models.V3DeparturesSpecificParameters](docs/V3DeparturesSpecificParameters.md)
 - [io.swagger.client.models.V3Direction](docs/V3Direction.md)
 - [io.swagger.client.models.V3DirectionWithDescription](docs/V3DirectionWithDescription.md)
 - [io.swagger.client.models.V3DirectionsResponse](docs/V3DirectionsResponse.md)
 - [io.swagger.client.models.V3Disruption](docs/V3Disruption.md)
 - [io.swagger.client.models.V3DisruptionDirection](docs/V3DisruptionDirection.md)
 - [io.swagger.client.models.V3DisruptionMode](docs/V3DisruptionMode.md)
 - [io.swagger.client.models.V3DisruptionModesResponse](docs/V3DisruptionModesResponse.md)
 - [io.swagger.client.models.V3DisruptionResponse](docs/V3DisruptionResponse.md)
 - [io.swagger.client.models.V3DisruptionRoute](docs/V3DisruptionRoute.md)
 - [io.swagger.client.models.V3DisruptionStop](docs/V3DisruptionStop.md)
 - [io.swagger.client.models.V3Disruptions](docs/V3Disruptions.md)
 - [io.swagger.client.models.V3DisruptionsResponse](docs/V3DisruptionsResponse.md)
 - [io.swagger.client.models.V3DynamoDbTimetable](docs/V3DynamoDbTimetable.md)
 - [io.swagger.client.models.V3DynamoDbTimetablesReponse](docs/V3DynamoDbTimetablesReponse.md)
 - [io.swagger.client.models.V3ErrorResponse](docs/V3ErrorResponse.md)
 - [io.swagger.client.models.V3FareEstimateResponse](docs/V3FareEstimateResponse.md)
 - [io.swagger.client.models.V3FareEstimateResult](docs/V3FareEstimateResult.md)
 - [io.swagger.client.models.V3FareEstimateResultStatus](docs/V3FareEstimateResultStatus.md)
 - [io.swagger.client.models.V3GenerateDivaMappingResponse](docs/V3GenerateDivaMappingResponse.md)
 - [io.swagger.client.models.V3Outlet](docs/V3Outlet.md)
 - [io.swagger.client.models.V3OutletGeolocation](docs/V3OutletGeolocation.md)
 - [io.swagger.client.models.V3OutletGeolocationParameters](docs/V3OutletGeolocationParameters.md)
 - [io.swagger.client.models.V3OutletGeolocationResponse](docs/V3OutletGeolocationResponse.md)
 - [io.swagger.client.models.V3OutletParameters](docs/V3OutletParameters.md)
 - [io.swagger.client.models.V3OutletResponse](docs/V3OutletResponse.md)
 - [io.swagger.client.models.V3PassengerFare](docs/V3PassengerFare.md)
 - [io.swagger.client.models.V3PatternDeparture](docs/V3PatternDeparture.md)
 - [io.swagger.client.models.V3ResultOutlet](docs/V3ResultOutlet.md)
 - [io.swagger.client.models.V3ResultRoute](docs/V3ResultRoute.md)
 - [io.swagger.client.models.V3ResultStop](docs/V3ResultStop.md)
 - [io.swagger.client.models.V3RouteDeparturesSpecificParameters](docs/V3RouteDeparturesSpecificParameters.md)
 - [io.swagger.client.models.V3RouteResponse](docs/V3RouteResponse.md)
 - [io.swagger.client.models.V3RouteServiceStatus](docs/V3RouteServiceStatus.md)
 - [io.swagger.client.models.V3RouteType](docs/V3RouteType.md)
 - [io.swagger.client.models.V3RouteTypesResponse](docs/V3RouteTypesResponse.md)
 - [io.swagger.client.models.V3RouteWithStatus](docs/V3RouteWithStatus.md)
 - [io.swagger.client.models.V3Run](docs/V3Run.md)
 - [io.swagger.client.models.V3RunResponse](docs/V3RunResponse.md)
 - [io.swagger.client.models.V3RunsResponse](docs/V3RunsResponse.md)
 - [io.swagger.client.models.V3SearchParameters](docs/V3SearchParameters.md)
 - [io.swagger.client.models.V3SearchResult](docs/V3SearchResult.md)
 - [io.swagger.client.models.V3SiriDirectionRefsDictionary](docs/V3SiriDirectionRefsDictionary.md)
 - [io.swagger.client.models.V3SiriDownstreamSubscription](docs/V3SiriDownstreamSubscription.md)
 - [io.swagger.client.models.V3SiriDownstreamSubscriptionDeleteRequest](docs/V3SiriDownstreamSubscriptionDeleteRequest.md)
 - [io.swagger.client.models.V3SiriDownstreamSubscriptionResponse](docs/V3SiriDownstreamSubscriptionResponse.md)
 - [io.swagger.client.models.V3SiriDownstreamSubscriptionTopic](docs/V3SiriDownstreamSubscriptionTopic.md)
 - [io.swagger.client.models.V3SiriEstimatedTimetableSubscriptionRequest](docs/V3SiriEstimatedTimetableSubscriptionRequest.md)
 - [io.swagger.client.models.V3SiriLineRef](docs/V3SiriLineRef.md)
 - [io.swagger.client.models.V3SiriLineRefDirectionRefStopPointRef](docs/V3SiriLineRefDirectionRefStopPointRef.md)
 - [io.swagger.client.models.V3SiriLineRefDirectionRefsDictionary](docs/V3SiriLineRefDirectionRefsDictionary.md)
 - [io.swagger.client.models.V3SiriLineRefMappingsResponse](docs/V3SiriLineRefMappingsResponse.md)
 - [io.swagger.client.models.V3SiriLineRefsRequest](docs/V3SiriLineRefsRequest.md)
 - [io.swagger.client.models.V3SiriProductionTimetableSubscriptionRequest](docs/V3SiriProductionTimetableSubscriptionRequest.md)
 - [io.swagger.client.models.V3SiriReferenceDataDetail](docs/V3SiriReferenceDataDetail.md)
 - [io.swagger.client.models.V3SiriReferenceDataMappingsResponse](docs/V3SiriReferenceDataMappingsResponse.md)
 - [io.swagger.client.models.V3SiriReferenceDataRequest](docs/V3SiriReferenceDataRequest.md)
 - [io.swagger.client.models.V3SiriStopsRefsDictionary](docs/V3SiriStopsRefsDictionary.md)
 - [io.swagger.client.models.V3SiriSubscriptionTopic](docs/V3SiriSubscriptionTopic.md)
 - [io.swagger.client.models.V3Status](docs/V3Status.md)
 - [io.swagger.client.models.V3StopAccessibility](docs/V3StopAccessibility.md)
 - [io.swagger.client.models.V3StopAccessibilityWheelchair](docs/V3StopAccessibilityWheelchair.md)
 - [io.swagger.client.models.V3StopAmenityDetails](docs/V3StopAmenityDetails.md)
 - [io.swagger.client.models.V3StopBasic](docs/V3StopBasic.md)
 - [io.swagger.client.models.V3StopDepartureRequest](docs/V3StopDepartureRequest.md)
 - [io.swagger.client.models.V3StopDepartureRequestRouteDirection](docs/V3StopDepartureRequestRouteDirection.md)
 - [io.swagger.client.models.V3StopDetails](docs/V3StopDetails.md)
 - [io.swagger.client.models.V3StopGeosearch](docs/V3StopGeosearch.md)
 - [io.swagger.client.models.V3StopGps](docs/V3StopGps.md)
 - [io.swagger.client.models.V3StopLocation](docs/V3StopLocation.md)
 - [io.swagger.client.models.V3StopModel](docs/V3StopModel.md)
 - [io.swagger.client.models.V3StopOnRoute](docs/V3StopOnRoute.md)
 - [io.swagger.client.models.V3StopPoint](docs/V3StopPoint.md)
 - [io.swagger.client.models.V3StopResponse](docs/V3StopResponse.md)
 - [io.swagger.client.models.V3StopStaffing](docs/V3StopStaffing.md)
 - [io.swagger.client.models.V3StopTicket](docs/V3StopTicket.md)
 - [io.swagger.client.models.V3StoppingPattern](docs/V3StoppingPattern.md)
 - [io.swagger.client.models.V3StoppingPatternStop](docs/V3StoppingPatternStop.md)
 - [io.swagger.client.models.V3StopsByDistanceResponse](docs/V3StopsByDistanceResponse.md)
 - [io.swagger.client.models.V3StopsOnRouteResponse](docs/V3StopsOnRouteResponse.md)
 - [io.swagger.client.models.V3VehicleDescriptor](docs/V3VehicleDescriptor.md)
 - [io.swagger.client.models.V3VehiclePosition](docs/V3VehiclePosition.md)
 - [io.swagger.client.models.V3Void](docs/V3Void.md)
 - [io.swagger.client.models.V3ZoneInfo](docs/V3ZoneInfo.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
