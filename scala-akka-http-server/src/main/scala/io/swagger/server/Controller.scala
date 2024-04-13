package io.swagger.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import io.swagger.server.api.DeparturesApi
import io.swagger.server.api.DirectionsApi
import io.swagger.server.api.DisruptionsApi
import io.swagger.server.api.FareEstimateApi
import io.swagger.server.api.OutletsApi
import io.swagger.server.api.PatternsApi
import io.swagger.server.api.RouteTypesApi
import io.swagger.server.api.RoutesApi
import io.swagger.server.api.RunsApi
import io.swagger.server.api.SearchApi
import io.swagger.server.api.StopsApi
import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

class Controller(departures: DeparturesApi, directions: DirectionsApi, disruptions: DisruptionsApi, fareEstimate: FareEstimateApi, outlets: OutletsApi, patterns: PatternsApi, routeTypes: RouteTypesApi, routes: RoutesApi, runs: RunsApi, search: SearchApi, stops: StopsApi)(implicit system: ActorSystem, materializer: ActorMaterializer) {

    lazy val routes: Route = departures.route ~ directions.route ~ disruptions.route ~ fareEstimate.route ~ outlets.route ~ patterns.route ~ routeTypes.route ~ routes.route ~ runs.route ~ search.route ~ stops.route 

    Http().bindAndHandle(routes, "0.0.0.0", 9000)
}