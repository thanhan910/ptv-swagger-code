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
    public interface IPatternsApi
    {
        /// <summary>
        /// View the stopping pattern for a specific trip/service run 
        /// </summary>
        /// <param name="runRef">The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.</param>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information.</param>
        /// <param name="stopId">Filter by stop_id; values returned by Stops API</param>
        /// <param name="dateUtc">Filter by the date and time of the request (ISO 8601 UTC format)</param>
        /// <param name="includeSkippedStops">Include any skipped stops in a stopping pattern. Defaults to false.</param>
        /// <param name="includeGeopath">Indicates if geopath data will be returned (default &#x3D; false)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3StoppingPattern</returns>
        V3StoppingPattern PatternsGetPatternByRun (string runRef, int? routeType, List<string> expand, int? stopId, DateTime? dateUtc, bool? includeSkippedStops, bool? includeGeopath, string token, string devid, string signature);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class PatternsApi : IPatternsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PatternsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public PatternsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="PatternsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PatternsApi(String basePath)
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
        /// View the stopping pattern for a specific trip/service run 
        /// </summary>
        /// <param name="runRef">The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.</param>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information.</param>
        /// <param name="stopId">Filter by stop_id; values returned by Stops API</param>
        /// <param name="dateUtc">Filter by the date and time of the request (ISO 8601 UTC format)</param>
        /// <param name="includeSkippedStops">Include any skipped stops in a stopping pattern. Defaults to false.</param>
        /// <param name="includeGeopath">Indicates if geopath data will be returned (default &#x3D; false)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3StoppingPattern</returns>
        public V3StoppingPattern PatternsGetPatternByRun (string runRef, int? routeType, List<string> expand, int? stopId, DateTime? dateUtc, bool? includeSkippedStops, bool? includeGeopath, string token, string devid, string signature)
        {
            // verify the required parameter 'runRef' is set
            if (runRef == null) throw new ApiException(400, "Missing required parameter 'runRef' when calling PatternsGetPatternByRun");
            // verify the required parameter 'routeType' is set
            if (routeType == null) throw new ApiException(400, "Missing required parameter 'routeType' when calling PatternsGetPatternByRun");
            // verify the required parameter 'expand' is set
            if (expand == null) throw new ApiException(400, "Missing required parameter 'expand' when calling PatternsGetPatternByRun");
    
            var path = "/v3/pattern/run/{run_ref}/route_type/{route_type}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "run_ref" + "}", ApiClient.ParameterToString(runRef));
path = path.Replace("{" + "route_type" + "}", ApiClient.ParameterToString(routeType));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (expand != null) queryParams.Add("expand", ApiClient.ParameterToString(expand)); // query parameter
 if (stopId != null) queryParams.Add("stop_id", ApiClient.ParameterToString(stopId)); // query parameter
 if (dateUtc != null) queryParams.Add("date_utc", ApiClient.ParameterToString(dateUtc)); // query parameter
 if (includeSkippedStops != null) queryParams.Add("include_skipped_stops", ApiClient.ParameterToString(includeSkippedStops)); // query parameter
 if (includeGeopath != null) queryParams.Add("include_geopath", ApiClient.ParameterToString(includeGeopath)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PatternsGetPatternByRun: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PatternsGetPatternByRun: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3StoppingPattern) ApiClient.Deserialize(response.Content, typeof(V3StoppingPattern), response.Headers);
        }
    
    }
}
