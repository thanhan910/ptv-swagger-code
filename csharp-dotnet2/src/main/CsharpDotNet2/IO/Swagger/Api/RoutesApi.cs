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
    public interface IRoutesApi
    {
        /// <summary>
        /// View route names and numbers for all routes 
        /// </summary>
        /// <param name="routeTypes">Filter by route_type; values returned via RouteTypes API</param>
        /// <param name="routeName">Filter by name  of route (accepts partial route name matches)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3RouteResponse</returns>
        V3RouteResponse RoutesOneOrMoreRoutes (List<int?> routeTypes, string routeName, string token, string devid, string signature);
        /// <summary>
        /// View route name and number for specific route ID 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Departures, Directions and Disruptions APIs</param>
        /// <param name="includeGeopath">Indicates kif geopath data will be returned (default &#x3D; false)</param>
        /// <param name="geopathUtc">Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3RouteResponse</returns>
        V3RouteResponse RoutesRouteFromId (int? routeId, bool? includeGeopath, DateTime? geopathUtc, string token, string devid, string signature);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class RoutesApi : IRoutesApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RoutesApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public RoutesApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="RoutesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public RoutesApi(String basePath)
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
        /// View route names and numbers for all routes 
        /// </summary>
        /// <param name="routeTypes">Filter by route_type; values returned via RouteTypes API</param>
        /// <param name="routeName">Filter by name  of route (accepts partial route name matches)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3RouteResponse</returns>
        public V3RouteResponse RoutesOneOrMoreRoutes (List<int?> routeTypes, string routeName, string token, string devid, string signature)
        {
    
            var path = "/v3/routes";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (routeTypes != null) queryParams.Add("route_types", ApiClient.ParameterToString(routeTypes)); // query parameter
 if (routeName != null) queryParams.Add("route_name", ApiClient.ParameterToString(routeName)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling RoutesOneOrMoreRoutes: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling RoutesOneOrMoreRoutes: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3RouteResponse) ApiClient.Deserialize(response.Content, typeof(V3RouteResponse), response.Headers);
        }
    
        /// <summary>
        /// View route name and number for specific route ID 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Departures, Directions and Disruptions APIs</param>
        /// <param name="includeGeopath">Indicates kif geopath data will be returned (default &#x3D; false)</param>
        /// <param name="geopathUtc">Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3RouteResponse</returns>
        public V3RouteResponse RoutesRouteFromId (int? routeId, bool? includeGeopath, DateTime? geopathUtc, string token, string devid, string signature)
        {
            // verify the required parameter 'routeId' is set
            if (routeId == null) throw new ApiException(400, "Missing required parameter 'routeId' when calling RoutesRouteFromId");
    
            var path = "/v3/routes/{route_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "route_id" + "}", ApiClient.ParameterToString(routeId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (includeGeopath != null) queryParams.Add("include_geopath", ApiClient.ParameterToString(includeGeopath)); // query parameter
 if (geopathUtc != null) queryParams.Add("geopath_utc", ApiClient.ParameterToString(geopathUtc)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling RoutesRouteFromId: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling RoutesRouteFromId: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3RouteResponse) ApiClient.Deserialize(response.Content, typeof(V3RouteResponse), response.Headers);
        }
    
    }
}
