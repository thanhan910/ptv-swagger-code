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
    public interface IDisruptionsApi
    {
        /// <summary>
        /// View all disruptions for all route types 
        /// </summary>
        /// <param name="routeTypes">Filter by route_type; values returned via RouteTypes API</param>
        /// <param name="disruptionModes">Filter by disruption_mode; values returned via v3/disruptions/modes API</param>
        /// <param name="disruptionStatus">Filter by status of disruption</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DisruptionsResponse</returns>
        V3DisruptionsResponse DisruptionsGetAllDisruptions (List<int?> routeTypes, List<int?> disruptionModes, string disruptionStatus, string token, string devid, string signature);
        /// <summary>
        /// View a specific disruption 
        /// </summary>
        /// <param name="disruptionId">Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id}</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DisruptionResponse</returns>
        V3DisruptionResponse DisruptionsGetDisruptionById (long? disruptionId, string token, string devid, string signature);
        /// <summary>
        /// Get all disruption modes 
        /// </summary>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DisruptionModesResponse</returns>
        V3DisruptionModesResponse DisruptionsGetDisruptionModes (string token, string devid, string signature);
        /// <summary>
        /// View all disruptions for a particular route 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes</param>
        /// <param name="disruptionStatus">Filter by status of disruption</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DisruptionsResponse</returns>
        V3DisruptionsResponse DisruptionsGetDisruptionsByRoute (int? routeId, string disruptionStatus, string token, string devid, string signature);
        /// <summary>
        /// View all disruptions for a particular route and stop 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes</param>
        /// <param name="stopId">Identifier of stop; values returned by Stops API - v3/stops</param>
        /// <param name="disruptionStatus">Filter by status of disruption</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DisruptionsResponse</returns>
        V3DisruptionsResponse DisruptionsGetDisruptionsByRouteAndStop (int? routeId, int? stopId, string disruptionStatus, string token, string devid, string signature);
        /// <summary>
        /// View all disruptions for a particular stop 
        /// </summary>
        /// <param name="stopId">Identifier of stop; values returned by Stops API - v3/stops</param>
        /// <param name="disruptionStatus">Filter by status of disruption</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DisruptionsResponse</returns>
        V3DisruptionsResponse DisruptionsGetDisruptionsByStop (int? stopId, string disruptionStatus, string token, string devid, string signature);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class DisruptionsApi : IDisruptionsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DisruptionsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public DisruptionsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="DisruptionsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DisruptionsApi(String basePath)
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
        /// View all disruptions for all route types 
        /// </summary>
        /// <param name="routeTypes">Filter by route_type; values returned via RouteTypes API</param>
        /// <param name="disruptionModes">Filter by disruption_mode; values returned via v3/disruptions/modes API</param>
        /// <param name="disruptionStatus">Filter by status of disruption</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DisruptionsResponse</returns>
        public V3DisruptionsResponse DisruptionsGetAllDisruptions (List<int?> routeTypes, List<int?> disruptionModes, string disruptionStatus, string token, string devid, string signature)
        {
    
            var path = "/v3/disruptions";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (routeTypes != null) queryParams.Add("route_types", ApiClient.ParameterToString(routeTypes)); // query parameter
 if (disruptionModes != null) queryParams.Add("disruption_modes", ApiClient.ParameterToString(disruptionModes)); // query parameter
 if (disruptionStatus != null) queryParams.Add("disruption_status", ApiClient.ParameterToString(disruptionStatus)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DisruptionsGetAllDisruptions: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DisruptionsGetAllDisruptions: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3DisruptionsResponse) ApiClient.Deserialize(response.Content, typeof(V3DisruptionsResponse), response.Headers);
        }
    
        /// <summary>
        /// View a specific disruption 
        /// </summary>
        /// <param name="disruptionId">Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id}</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DisruptionResponse</returns>
        public V3DisruptionResponse DisruptionsGetDisruptionById (long? disruptionId, string token, string devid, string signature)
        {
            // verify the required parameter 'disruptionId' is set
            if (disruptionId == null) throw new ApiException(400, "Missing required parameter 'disruptionId' when calling DisruptionsGetDisruptionById");
    
            var path = "/v3/disruptions/{disruption_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "disruption_id" + "}", ApiClient.ParameterToString(disruptionId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DisruptionsGetDisruptionById: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DisruptionsGetDisruptionById: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3DisruptionResponse) ApiClient.Deserialize(response.Content, typeof(V3DisruptionResponse), response.Headers);
        }
    
        /// <summary>
        /// Get all disruption modes 
        /// </summary>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DisruptionModesResponse</returns>
        public V3DisruptionModesResponse DisruptionsGetDisruptionModes (string token, string devid, string signature)
        {
    
            var path = "/v3/disruptions/modes";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DisruptionsGetDisruptionModes: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DisruptionsGetDisruptionModes: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3DisruptionModesResponse) ApiClient.Deserialize(response.Content, typeof(V3DisruptionModesResponse), response.Headers);
        }
    
        /// <summary>
        /// View all disruptions for a particular route 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes</param>
        /// <param name="disruptionStatus">Filter by status of disruption</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DisruptionsResponse</returns>
        public V3DisruptionsResponse DisruptionsGetDisruptionsByRoute (int? routeId, string disruptionStatus, string token, string devid, string signature)
        {
            // verify the required parameter 'routeId' is set
            if (routeId == null) throw new ApiException(400, "Missing required parameter 'routeId' when calling DisruptionsGetDisruptionsByRoute");
    
            var path = "/v3/disruptions/route/{route_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "route_id" + "}", ApiClient.ParameterToString(routeId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (disruptionStatus != null) queryParams.Add("disruption_status", ApiClient.ParameterToString(disruptionStatus)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DisruptionsGetDisruptionsByRoute: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DisruptionsGetDisruptionsByRoute: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3DisruptionsResponse) ApiClient.Deserialize(response.Content, typeof(V3DisruptionsResponse), response.Headers);
        }
    
        /// <summary>
        /// View all disruptions for a particular route and stop 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes</param>
        /// <param name="stopId">Identifier of stop; values returned by Stops API - v3/stops</param>
        /// <param name="disruptionStatus">Filter by status of disruption</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DisruptionsResponse</returns>
        public V3DisruptionsResponse DisruptionsGetDisruptionsByRouteAndStop (int? routeId, int? stopId, string disruptionStatus, string token, string devid, string signature)
        {
            // verify the required parameter 'routeId' is set
            if (routeId == null) throw new ApiException(400, "Missing required parameter 'routeId' when calling DisruptionsGetDisruptionsByRouteAndStop");
            // verify the required parameter 'stopId' is set
            if (stopId == null) throw new ApiException(400, "Missing required parameter 'stopId' when calling DisruptionsGetDisruptionsByRouteAndStop");
    
            var path = "/v3/disruptions/route/{route_id}/stop/{stop_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "route_id" + "}", ApiClient.ParameterToString(routeId));
path = path.Replace("{" + "stop_id" + "}", ApiClient.ParameterToString(stopId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (disruptionStatus != null) queryParams.Add("disruption_status", ApiClient.ParameterToString(disruptionStatus)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DisruptionsGetDisruptionsByRouteAndStop: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DisruptionsGetDisruptionsByRouteAndStop: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3DisruptionsResponse) ApiClient.Deserialize(response.Content, typeof(V3DisruptionsResponse), response.Headers);
        }
    
        /// <summary>
        /// View all disruptions for a particular stop 
        /// </summary>
        /// <param name="stopId">Identifier of stop; values returned by Stops API - v3/stops</param>
        /// <param name="disruptionStatus">Filter by status of disruption</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DisruptionsResponse</returns>
        public V3DisruptionsResponse DisruptionsGetDisruptionsByStop (int? stopId, string disruptionStatus, string token, string devid, string signature)
        {
            // verify the required parameter 'stopId' is set
            if (stopId == null) throw new ApiException(400, "Missing required parameter 'stopId' when calling DisruptionsGetDisruptionsByStop");
    
            var path = "/v3/disruptions/stop/{stop_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "stop_id" + "}", ApiClient.ParameterToString(stopId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (disruptionStatus != null) queryParams.Add("disruption_status", ApiClient.ParameterToString(disruptionStatus)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DisruptionsGetDisruptionsByStop: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DisruptionsGetDisruptionsByStop: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3DisruptionsResponse) ApiClient.Deserialize(response.Content, typeof(V3DisruptionsResponse), response.Headers);
        }
    
    }
}
