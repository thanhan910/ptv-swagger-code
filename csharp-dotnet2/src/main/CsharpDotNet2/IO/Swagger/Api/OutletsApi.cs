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
    public interface IOutletsApi
    {
        /// <summary>
        /// List all ticket outlets 
        /// </summary>
        /// <param name="maxResults">Maximum number of results returned (default &#x3D; 30)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3OutletResponse</returns>
        V3OutletResponse OutletsGetAllOutlets (int? maxResults, string token, string devid, string signature);
        /// <summary>
        /// List ticket outlets near a specific location 
        /// </summary>
        /// <param name="latitude">Geographic coordinate of latitude</param>
        /// <param name="longitude">Geographic coordinate of longitude</param>
        /// <param name="maxDistance">Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300)</param>
        /// <param name="maxResults">Maximum number of results returned (default &#x3D; 30)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3OutletGeolocationResponse</returns>
        V3OutletGeolocationResponse OutletsGetOutletsByGeolocation (float? latitude, float? longitude, double? maxDistance, int? maxResults, string token, string devid, string signature);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class OutletsApi : IOutletsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OutletsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public OutletsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="OutletsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public OutletsApi(String basePath)
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
        /// List all ticket outlets 
        /// </summary>
        /// <param name="maxResults">Maximum number of results returned (default &#x3D; 30)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3OutletResponse</returns>
        public V3OutletResponse OutletsGetAllOutlets (int? maxResults, string token, string devid, string signature)
        {
    
            var path = "/v3/outlets";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (maxResults != null) queryParams.Add("max_results", ApiClient.ParameterToString(maxResults)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OutletsGetAllOutlets: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OutletsGetAllOutlets: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3OutletResponse) ApiClient.Deserialize(response.Content, typeof(V3OutletResponse), response.Headers);
        }
    
        /// <summary>
        /// List ticket outlets near a specific location 
        /// </summary>
        /// <param name="latitude">Geographic coordinate of latitude</param>
        /// <param name="longitude">Geographic coordinate of longitude</param>
        /// <param name="maxDistance">Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300)</param>
        /// <param name="maxResults">Maximum number of results returned (default &#x3D; 30)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3OutletGeolocationResponse</returns>
        public V3OutletGeolocationResponse OutletsGetOutletsByGeolocation (float? latitude, float? longitude, double? maxDistance, int? maxResults, string token, string devid, string signature)
        {
            // verify the required parameter 'latitude' is set
            if (latitude == null) throw new ApiException(400, "Missing required parameter 'latitude' when calling OutletsGetOutletsByGeolocation");
            // verify the required parameter 'longitude' is set
            if (longitude == null) throw new ApiException(400, "Missing required parameter 'longitude' when calling OutletsGetOutletsByGeolocation");
    
            var path = "/v3/outlets/location/{latitude},{longitude}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "latitude" + "}", ApiClient.ParameterToString(latitude));
path = path.Replace("{" + "longitude" + "}", ApiClient.ParameterToString(longitude));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (maxDistance != null) queryParams.Add("max_distance", ApiClient.ParameterToString(maxDistance)); // query parameter
 if (maxResults != null) queryParams.Add("max_results", ApiClient.ParameterToString(maxResults)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OutletsGetOutletsByGeolocation: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OutletsGetOutletsByGeolocation: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3OutletGeolocationResponse) ApiClient.Deserialize(response.Content, typeof(V3OutletGeolocationResponse), response.Headers);
        }
    
    }
}
