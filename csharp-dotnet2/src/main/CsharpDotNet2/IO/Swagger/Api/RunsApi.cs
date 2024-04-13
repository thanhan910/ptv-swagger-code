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
    public interface IRunsApi
    {
        /// <summary>
        /// View all trip/service runs for a specific route ID 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes.</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.</param>
        /// <param name="dateUtc">Date of the request. (optional - defaults to now)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3RunsResponse</returns>
        V3RunsResponse RunsForRoute (int? routeId, List<string> expand, DateTime? dateUtc, string token, string devid, string signature);
        /// <summary>
        /// View all trip/service runs for a specific route ID and route type 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes.</param>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.</param>
        /// <param name="dateUtc">Date of the request. (optional - defaults to now)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3RunsResponse</returns>
        V3RunsResponse RunsForRouteAndRouteType (int? routeId, int? routeType, List<string> expand, DateTime? dateUtc, string token, string devid, string signature);
        /// <summary>
        /// View all trip/service runs for a specific run_ref 
        /// </summary>
        /// <param name="runRef">The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.</param>
        /// <param name="dateUtc">Date of the request. (optional - defaults to now)</param>
        /// <param name="includeGeopath">Indicates if geopath data will be returned (default &#x3D; false)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3RunsResponse</returns>
        V3RunsResponse RunsForRun (string runRef, List<string> expand, DateTime? dateUtc, bool? includeGeopath, string token, string devid, string signature);
        /// <summary>
        /// View the trip/service run for a specific run_ref and route type 
        /// </summary>
        /// <param name="runRef">The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.</param>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.</param>
        /// <param name="dateUtc">Date of the request. (optional - defaults to now)</param>
        /// <param name="includeGeopath">Indicates if geopath data will be returned (default &#x3D; false)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3RunResponse</returns>
        V3RunResponse RunsForRunAndRouteType (string runRef, int? routeType, List<string> expand, DateTime? dateUtc, bool? includeGeopath, string token, string devid, string signature);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class RunsApi : IRunsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RunsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public RunsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="RunsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public RunsApi(String basePath)
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
        /// View all trip/service runs for a specific route ID 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes.</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.</param>
        /// <param name="dateUtc">Date of the request. (optional - defaults to now)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3RunsResponse</returns>
        public V3RunsResponse RunsForRoute (int? routeId, List<string> expand, DateTime? dateUtc, string token, string devid, string signature)
        {
            // verify the required parameter 'routeId' is set
            if (routeId == null) throw new ApiException(400, "Missing required parameter 'routeId' when calling RunsForRoute");
    
            var path = "/v3/runs/route/{route_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "route_id" + "}", ApiClient.ParameterToString(routeId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (expand != null) queryParams.Add("expand", ApiClient.ParameterToString(expand)); // query parameter
 if (dateUtc != null) queryParams.Add("date_utc", ApiClient.ParameterToString(dateUtc)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling RunsForRoute: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling RunsForRoute: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3RunsResponse) ApiClient.Deserialize(response.Content, typeof(V3RunsResponse), response.Headers);
        }
    
        /// <summary>
        /// View all trip/service runs for a specific route ID and route type 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes.</param>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.</param>
        /// <param name="dateUtc">Date of the request. (optional - defaults to now)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3RunsResponse</returns>
        public V3RunsResponse RunsForRouteAndRouteType (int? routeId, int? routeType, List<string> expand, DateTime? dateUtc, string token, string devid, string signature)
        {
            // verify the required parameter 'routeId' is set
            if (routeId == null) throw new ApiException(400, "Missing required parameter 'routeId' when calling RunsForRouteAndRouteType");
            // verify the required parameter 'routeType' is set
            if (routeType == null) throw new ApiException(400, "Missing required parameter 'routeType' when calling RunsForRouteAndRouteType");
            // verify the required parameter 'expand' is set
            if (expand == null) throw new ApiException(400, "Missing required parameter 'expand' when calling RunsForRouteAndRouteType");
    
            var path = "/v3/runs/route/{route_id}/route_type/{route_type}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "route_id" + "}", ApiClient.ParameterToString(routeId));
path = path.Replace("{" + "route_type" + "}", ApiClient.ParameterToString(routeType));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (expand != null) queryParams.Add("expand", ApiClient.ParameterToString(expand)); // query parameter
 if (dateUtc != null) queryParams.Add("date_utc", ApiClient.ParameterToString(dateUtc)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling RunsForRouteAndRouteType: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling RunsForRouteAndRouteType: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3RunsResponse) ApiClient.Deserialize(response.Content, typeof(V3RunsResponse), response.Headers);
        }
    
        /// <summary>
        /// View all trip/service runs for a specific run_ref 
        /// </summary>
        /// <param name="runRef">The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.</param>
        /// <param name="dateUtc">Date of the request. (optional - defaults to now)</param>
        /// <param name="includeGeopath">Indicates if geopath data will be returned (default &#x3D; false)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3RunsResponse</returns>
        public V3RunsResponse RunsForRun (string runRef, List<string> expand, DateTime? dateUtc, bool? includeGeopath, string token, string devid, string signature)
        {
            // verify the required parameter 'runRef' is set
            if (runRef == null) throw new ApiException(400, "Missing required parameter 'runRef' when calling RunsForRun");
            // verify the required parameter 'expand' is set
            if (expand == null) throw new ApiException(400, "Missing required parameter 'expand' when calling RunsForRun");
    
            var path = "/v3/runs/{run_ref}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "run_ref" + "}", ApiClient.ParameterToString(runRef));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (expand != null) queryParams.Add("expand", ApiClient.ParameterToString(expand)); // query parameter
 if (dateUtc != null) queryParams.Add("date_utc", ApiClient.ParameterToString(dateUtc)); // query parameter
 if (includeGeopath != null) queryParams.Add("include_geopath", ApiClient.ParameterToString(includeGeopath)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling RunsForRun: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling RunsForRun: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3RunsResponse) ApiClient.Deserialize(response.Content, typeof(V3RunsResponse), response.Headers);
        }
    
        /// <summary>
        /// View the trip/service run for a specific run_ref and route type 
        /// </summary>
        /// <param name="runRef">The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.</param>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.</param>
        /// <param name="dateUtc">Date of the request. (optional - defaults to now)</param>
        /// <param name="includeGeopath">Indicates if geopath data will be returned (default &#x3D; false)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3RunResponse</returns>
        public V3RunResponse RunsForRunAndRouteType (string runRef, int? routeType, List<string> expand, DateTime? dateUtc, bool? includeGeopath, string token, string devid, string signature)
        {
            // verify the required parameter 'runRef' is set
            if (runRef == null) throw new ApiException(400, "Missing required parameter 'runRef' when calling RunsForRunAndRouteType");
            // verify the required parameter 'routeType' is set
            if (routeType == null) throw new ApiException(400, "Missing required parameter 'routeType' when calling RunsForRunAndRouteType");
            // verify the required parameter 'expand' is set
            if (expand == null) throw new ApiException(400, "Missing required parameter 'expand' when calling RunsForRunAndRouteType");
    
            var path = "/v3/runs/{run_ref}/route_type/{route_type}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "run_ref" + "}", ApiClient.ParameterToString(runRef));
path = path.Replace("{" + "route_type" + "}", ApiClient.ParameterToString(routeType));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (expand != null) queryParams.Add("expand", ApiClient.ParameterToString(expand)); // query parameter
 if (dateUtc != null) queryParams.Add("date_utc", ApiClient.ParameterToString(dateUtc)); // query parameter
 if (includeGeopath != null) queryParams.Add("include_geopath", ApiClient.ParameterToString(includeGeopath)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling RunsForRunAndRouteType: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling RunsForRunAndRouteType: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3RunResponse) ApiClient.Deserialize(response.Content, typeof(V3RunResponse), response.Headers);
        }
    
    }
}
