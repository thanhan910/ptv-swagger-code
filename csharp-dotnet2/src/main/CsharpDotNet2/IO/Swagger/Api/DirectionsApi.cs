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
    public interface IDirectionsApi
    {
        /// <summary>
        /// View all routes for a direction of travel 
        /// </summary>
        /// <param name="directionId">Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DirectionsResponse</returns>
        V3DirectionsResponse DirectionsForDirection (int? directionId, string token, string devid, string signature);
        /// <summary>
        /// View all routes of a particular type for a direction of travel 
        /// </summary>
        /// <param name="directionId">Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}</param>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DirectionsResponse</returns>
        V3DirectionsResponse DirectionsForDirectionAndType (int? directionId, int? routeType, string token, string devid, string signature);
        /// <summary>
        /// View directions that a route travels in 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DirectionsResponse</returns>
        V3DirectionsResponse DirectionsForRoute (int? routeId, string token, string devid, string signature);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class DirectionsApi : IDirectionsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DirectionsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public DirectionsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="DirectionsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DirectionsApi(String basePath)
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
        /// View all routes for a direction of travel 
        /// </summary>
        /// <param name="directionId">Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DirectionsResponse</returns>
        public V3DirectionsResponse DirectionsForDirection (int? directionId, string token, string devid, string signature)
        {
            // verify the required parameter 'directionId' is set
            if (directionId == null) throw new ApiException(400, "Missing required parameter 'directionId' when calling DirectionsForDirection");
    
            var path = "/v3/directions/{direction_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "direction_id" + "}", ApiClient.ParameterToString(directionId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DirectionsForDirection: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DirectionsForDirection: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3DirectionsResponse) ApiClient.Deserialize(response.Content, typeof(V3DirectionsResponse), response.Headers);
        }
    
        /// <summary>
        /// View all routes of a particular type for a direction of travel 
        /// </summary>
        /// <param name="directionId">Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}</param>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DirectionsResponse</returns>
        public V3DirectionsResponse DirectionsForDirectionAndType (int? directionId, int? routeType, string token, string devid, string signature)
        {
            // verify the required parameter 'directionId' is set
            if (directionId == null) throw new ApiException(400, "Missing required parameter 'directionId' when calling DirectionsForDirectionAndType");
            // verify the required parameter 'routeType' is set
            if (routeType == null) throw new ApiException(400, "Missing required parameter 'routeType' when calling DirectionsForDirectionAndType");
    
            var path = "/v3/directions/{direction_id}/route_type/{route_type}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "direction_id" + "}", ApiClient.ParameterToString(directionId));
path = path.Replace("{" + "route_type" + "}", ApiClient.ParameterToString(routeType));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DirectionsForDirectionAndType: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DirectionsForDirectionAndType: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3DirectionsResponse) ApiClient.Deserialize(response.Content, typeof(V3DirectionsResponse), response.Headers);
        }
    
        /// <summary>
        /// View directions that a route travels in 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3DirectionsResponse</returns>
        public V3DirectionsResponse DirectionsForRoute (int? routeId, string token, string devid, string signature)
        {
            // verify the required parameter 'routeId' is set
            if (routeId == null) throw new ApiException(400, "Missing required parameter 'routeId' when calling DirectionsForRoute");
    
            var path = "/v3/directions/route/{route_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "route_id" + "}", ApiClient.ParameterToString(routeId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DirectionsForRoute: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DirectionsForRoute: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3DirectionsResponse) ApiClient.Deserialize(response.Content, typeof(V3DirectionsResponse), response.Headers);
        }
    
    }
}
