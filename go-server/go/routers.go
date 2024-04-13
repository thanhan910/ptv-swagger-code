/*
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * API version: v3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

import (
	"fmt"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

type Route struct {
	Name        string
	Method      string
	Pattern     string
	HandlerFunc http.HandlerFunc
}

type Routes []Route

func NewRouter() *mux.Router {
	router := mux.NewRouter().StrictSlash(true)
	for _, route := range routes {
		var handler http.Handler
		handler = route.HandlerFunc
		handler = Logger(handler, route.Name)

		router.
			Methods(route.Method).
			Path(route.Pattern).
			Name(route.Name).
			Handler(handler)
	}

	return router
}

func Index(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello World!")
}

var routes = Routes{
	Route{
		"Index",
		"GET",
		"//",
		Index,
	},

	Route{
		"DeparturesGetForStop",
		strings.ToUpper("Get"),
		"//v3/departures/route_type/{route_type}/stop/{stop_id}",
		DeparturesGetForStop,
	},

	Route{
		"DeparturesGetForStopAndRoute",
		strings.ToUpper("Get"),
		"//v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id}",
		DeparturesGetForStopAndRoute,
	},

	Route{
		"DirectionsForDirection",
		strings.ToUpper("Get"),
		"//v3/directions/{direction_id}",
		DirectionsForDirection,
	},

	Route{
		"DirectionsForDirectionAndType",
		strings.ToUpper("Get"),
		"//v3/directions/{direction_id}/route_type/{route_type}",
		DirectionsForDirectionAndType,
	},

	Route{
		"DirectionsForRoute",
		strings.ToUpper("Get"),
		"//v3/directions/route/{route_id}",
		DirectionsForRoute,
	},

	Route{
		"DisruptionsGetAllDisruptions",
		strings.ToUpper("Get"),
		"//v3/disruptions",
		DisruptionsGetAllDisruptions,
	},

	Route{
		"DisruptionsGetDisruptionById",
		strings.ToUpper("Get"),
		"//v3/disruptions/{disruption_id}",
		DisruptionsGetDisruptionById,
	},

	Route{
		"DisruptionsGetDisruptionModes",
		strings.ToUpper("Get"),
		"//v3/disruptions/modes",
		DisruptionsGetDisruptionModes,
	},

	Route{
		"DisruptionsGetDisruptionsByRoute",
		strings.ToUpper("Get"),
		"//v3/disruptions/route/{route_id}",
		DisruptionsGetDisruptionsByRoute,
	},

	Route{
		"DisruptionsGetDisruptionsByRouteAndStop",
		strings.ToUpper("Get"),
		"//v3/disruptions/route/{route_id}/stop/{stop_id}",
		DisruptionsGetDisruptionsByRouteAndStop,
	},

	Route{
		"DisruptionsGetDisruptionsByStop",
		strings.ToUpper("Get"),
		"//v3/disruptions/stop/{stop_id}",
		DisruptionsGetDisruptionsByStop,
	},

	Route{
		"FareEstimateGetFareEstimateByZone",
		strings.ToUpper("Get"),
		"//v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone}",
		FareEstimateGetFareEstimateByZone,
	},

	Route{
		"OutletsGetAllOutlets",
		strings.ToUpper("Get"),
		"//v3/outlets",
		OutletsGetAllOutlets,
	},

	Route{
		"OutletsGetOutletsByGeolocation",
		strings.ToUpper("Get"),
		"//v3/outlets/location/{latitude},{longitude}",
		OutletsGetOutletsByGeolocation,
	},

	Route{
		"PatternsGetPatternByRun",
		strings.ToUpper("Get"),
		"//v3/pattern/run/{run_ref}/route_type/{route_type}",
		PatternsGetPatternByRun,
	},

	Route{
		"RouteTypesGetRouteTypes",
		strings.ToUpper("Get"),
		"//v3/route_types",
		RouteTypesGetRouteTypes,
	},

	Route{
		"RoutesOneOrMoreRoutes",
		strings.ToUpper("Get"),
		"//v3/routes",
		RoutesOneOrMoreRoutes,
	},

	Route{
		"RoutesRouteFromId",
		strings.ToUpper("Get"),
		"//v3/routes/{route_id}",
		RoutesRouteFromId,
	},

	Route{
		"RunsForRoute",
		strings.ToUpper("Get"),
		"//v3/runs/route/{route_id}",
		RunsForRoute,
	},

	Route{
		"RunsForRouteAndRouteType",
		strings.ToUpper("Get"),
		"//v3/runs/route/{route_id}/route_type/{route_type}",
		RunsForRouteAndRouteType,
	},

	Route{
		"RunsForRun",
		strings.ToUpper("Get"),
		"//v3/runs/{run_ref}",
		RunsForRun,
	},

	Route{
		"RunsForRunAndRouteType",
		strings.ToUpper("Get"),
		"//v3/runs/{run_ref}/route_type/{route_type}",
		RunsForRunAndRouteType,
	},

	Route{
		"SearchSearch",
		strings.ToUpper("Get"),
		"//v3/search/{search_term}",
		SearchSearch,
	},

	Route{
		"StopsStopDetails",
		strings.ToUpper("Get"),
		"//v3/stops/{stop_id}/route_type/{route_type}",
		StopsStopDetails,
	},

	Route{
		"StopsStopsByGeolocation",
		strings.ToUpper("Get"),
		"//v3/stops/location/{latitude},{longitude}",
		StopsStopsByGeolocation,
	},

	Route{
		"StopsStopsForRoute",
		strings.ToUpper("Get"),
		"//v3/stops/route/{route_id}/route_type/{route_type}",
		StopsStopsForRoute,
	},
}
