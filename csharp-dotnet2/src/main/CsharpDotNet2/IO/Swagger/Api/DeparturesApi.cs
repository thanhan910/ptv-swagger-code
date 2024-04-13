using System;
using System.Collections.Generic;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDeparturesApi
    {
        /// <summary>
        /// View departures for all routes from a stop 
        /// </summary>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="stopId">Identifier of stop; values returned by Stops API</param>
        /// <param name="platformNumbers">Filter by platform number at stop</param>
        /// <param name="directionId">Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}</param>
        /// <param name="gtfs">Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data</param>
        /// <param name="dateUtc">Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)</param>
        /// <param name="maxResults">Maximum number of results returned</param>
        /// <param name="includeCancelled">Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only</param>
        /// <param name="lookBackwards">Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.</param>
        /// <param name="includeGeopath">Indicates if the route geopath should be returned</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DeparturesResponse</returns>
        V3DeparturesResponse DeparturesGetForStop (int? routeType, int? stopId, List<int?> platformNumbers, int? directionId, bool? gtfs, DateTime? dateUtc, int? maxResults, bool? includeCancelled, bool? lookBackwards, List<string> expand, bool? includeGeopath, string token, string devid, string signature);
        /// <summary>
        /// View departures for a specific route from a stop 
        /// </summary>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="stopId">Identifier of stop; values returned by Stops API</param>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes</param>
        /// <param name="directionId">Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}</param>
        /// <param name="gtfs">Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data</param>
        /// <param name="dateUtc">Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)</param>
        /// <param name="maxResults">Maximum number of results returned</param>
        /// <param name="includeCancelled">Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only</param>
        /// <param name="lookBackwards">Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.</param>
        /// <param name="includeGeopath">Indicates if the route geopath should be returned</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DeparturesResponse</returns>
        V3DeparturesResponse DeparturesGetForStopAndRoute (int? routeType, int? stopId, string routeId, int? directionId, bool? gtfs, DateTime? dateUtc, int? maxResults, bool? includeCancelled, bool? lookBackwards, List<string> expand, bool? includeGeopath, string token, string devid, string signature);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class DeparturesApi : IDeparturesApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DeparturesApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public DeparturesApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="DeparturesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DeparturesApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        /// <summary>
        /// View departures for all routes from a stop 
        /// </summary>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="stopId">Identifier of stop; values returned by Stops API</param>
        /// <param name="platformNumbers">Filter by platform number at stop</param>
        /// <param name="directionId">Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}</param>
        /// <param name="gtfs">Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data</param>
        /// <param name="dateUtc">Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)</param>
        /// <param name="maxResults">Maximum number of results returned</param>
        /// <param name="includeCancelled">Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only</param>
        /// <param name="lookBackwards">Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.</param>
        /// <param name="includeGeopath">Indicates if the route geopath should be returned</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DeparturesResponse</returns>
        public V3DeparturesResponse DeparturesGetForStop (int? routeType, int? stopId, List<int?> platformNumbers, int? directionId, bool? gtfs, DateTime? dateUtc, int? maxResults, bool? includeCancelled, bool? lookBackwards, List<string> expand, bool? includeGeopath, string token, string devid, string signature)
        {
            // verify the required parameter 'routeType' is set
            if (routeType == null) throw new ApiException(400, "Missing required parameter 'routeType' when calling DeparturesGetForStop");
            // verify the required parameter 'stopId' is set
            if (stopId == null) throw new ApiException(400, "Missing required parameter 'stopId' when calling DeparturesGetForStop");
    
            var path = "/v3/departures/route_type/{route_type}/stop/{stop_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "route_type" + "}", ApiClient.ParameterToString(routeType));
path = path.Replace("{" + "stop_id" + "}", ApiClient.ParameterToString(stopId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (platformNumbers != null) queryParams.Add("platform_numbers", ApiClient.ParameterToString(platformNumbers)); // query parameter
 if (directionId != null) queryParams.Add("direction_id", ApiClient.ParameterToString(directionId)); // query parameter
 if (gtfs != null) queryParams.Add("gtfs", ApiClient.ParameterToString(gtfs)); // query parameter
 if (dateUtc != null) queryParams.Add("date_utc", ApiClient.ParameterToString(dateUtc)); // query parameter
 if (maxResults != null) queryParams.Add("max_results", ApiClient.ParameterToString(maxResults)); // query parameter
 if (includeCancelled != null) queryParams.Add("include_cancelled", ApiClient.ParameterToString(includeCancelled)); // query parameter
 if (lookBackwards != null) queryParams.Add("look_backwards", ApiClient.ParameterToString(lookBackwards)); // query parameter
 if (expand != null) queryParams.Add("expand", ApiClient.ParameterToString(expand)); // query parameter
 if (includeGeopath != null) queryParams.Add("include_geopath", ApiClient.ParameterToString(includeGeopath)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeparturesGetForStop: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeparturesGetForStop: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3DeparturesResponse) ApiClient.Deserialize(response.Content, typeof(V3DeparturesResponse), response.Headers);
        }
    
        /// <summary>
        /// View departures for a specific route from a stop 
        /// </summary>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="stopId">Identifier of stop; values returned by Stops API</param>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes</param>
        /// <param name="directionId">Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}</param>
        /// <param name="gtfs">Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data</param>
        /// <param name="dateUtc">Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)</param>
        /// <param name="maxResults">Maximum number of results returned</param>
        /// <param name="includeCancelled">Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only</param>
        /// <param name="lookBackwards">Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.</param>
        /// <param name="includeGeopath">Indicates if the route geopath should be returned</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DeparturesResponse</returns>
        public V3DeparturesResponse DeparturesGetForStopAndRoute (int? routeType, int? stopId, string routeId, int? directionId, bool? gtfs, DateTime? dateUtc, int? maxResults, bool? includeCancelled, bool? lookBackwards, List<string> expand, bool? includeGeopath, string token, string devid, string signature)
        {
            // verify the required parameter 'routeType' is set
            if (routeType == null) throw new ApiException(400, "Missing required parameter 'routeType' when calling DeparturesGetForStopAndRoute");
            // verify the required parameter 'stopId' is set
            if (stopId == null) throw new ApiException(400, "Missing required parameter 'stopId' when calling DeparturesGetForStopAndRoute");
            // verify the required parameter 'routeId' is set
            if (routeId == null) throw new ApiException(400, "Missing required parameter 'routeId' when calling DeparturesGetForStopAndRoute");
    
            var path = "/v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "route_type" + "}", ApiClient.ParameterToString(routeType));
path = path.Replace("{" + "stop_id" + "}", ApiClient.ParameterToString(stopId));
path = path.Replace("{" + "route_id" + "}", ApiClient.ParameterToString(routeId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (directionId != null) queryParams.Add("direction_id", ApiClient.ParameterToString(directionId)); // query parameter
 if (gtfs != null) queryParams.Add("gtfs", ApiClient.ParameterToString(gtfs)); // query parameter
 if (dateUtc != null) queryParams.Add("date_utc", ApiClient.ParameterToString(dateUtc)); // query parameter
 if (maxResults != null) queryParams.Add("max_results", ApiClient.ParameterToString(maxResults)); // query parameter
 if (includeCancelled != null) queryParams.Add("include_cancelled", ApiClient.ParameterToString(includeCancelled)); // query parameter
 if (lookBackwards != null) queryParams.Add("look_backwards", ApiClient.ParameterToString(lookBackwards)); // query parameter
 if (expand != null) queryParams.Add("expand", ApiClient.ParameterToString(expand)); // query parameter
 if (includeGeopath != null) queryParams.Add("include_geopath", ApiClient.ParameterToString(includeGeopath)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeparturesGetForStopAndRoute: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeparturesGetForStopAndRoute: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3DeparturesResponse) ApiClient.Deserialize(response.Content, typeof(V3DeparturesResponse), response.Headers);
        }
    
    }
}
