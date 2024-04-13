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
    public interface ISearchApi
    {
        /// <summary>
        /// View stops, routes and myki ticket outlets that match the search term 
        /// </summary>
        /// <param name="searchTerm">Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes)</param>
        /// <param name="routeTypes">Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)</param>
        /// <param name="latitude">Filter by geographic coordinate of latitude</param>
        /// <param name="longitude">Filter by geographic coordinate of longitude</param>
        /// <param name="maxDistance">Filter by maximum distance (in metres) from location specified via latitude and longitude parameters</param>
        /// <param name="includeAddresses">Placeholder for future development; currently unavailable</param>
        /// <param name="includeOutlets">Indicates if outlets will be returned in response (default &#x3D; true)</param>
        /// <param name="matchStopBySuburb">Indicates whether to find stops by suburbs in the search term (default &#x3D; true)</param>
        /// <param name="matchRouteBySuburb">Indicates whether to find routes by suburbs in the search term (default &#x3D; true)</param>
        /// <param name="matchStopByGtfsStopId">Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3SearchResult</returns>
        V3SearchResult SearchSearch (string searchTerm, List<int?> routeTypes, float? latitude, float? longitude, float? maxDistance, bool? includeAddresses, bool? includeOutlets, bool? matchStopBySuburb, bool? matchRouteBySuburb, bool? matchStopByGtfsStopId, string token, string devid, string signature);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class SearchApi : ISearchApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SearchApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public SearchApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="SearchApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SearchApi(String basePath)
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
        /// View stops, routes and myki ticket outlets that match the search term 
        /// </summary>
        /// <param name="searchTerm">Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes)</param>
        /// <param name="routeTypes">Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)</param>
        /// <param name="latitude">Filter by geographic coordinate of latitude</param>
        /// <param name="longitude">Filter by geographic coordinate of longitude</param>
        /// <param name="maxDistance">Filter by maximum distance (in metres) from location specified via latitude and longitude parameters</param>
        /// <param name="includeAddresses">Placeholder for future development; currently unavailable</param>
        /// <param name="includeOutlets">Indicates if outlets will be returned in response (default &#x3D; true)</param>
        /// <param name="matchStopBySuburb">Indicates whether to find stops by suburbs in the search term (default &#x3D; true)</param>
        /// <param name="matchRouteBySuburb">Indicates whether to find routes by suburbs in the search term (default &#x3D; true)</param>
        /// <param name="matchStopByGtfsStopId">Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3SearchResult</returns>
        public V3SearchResult SearchSearch (string searchTerm, List<int?> routeTypes, float? latitude, float? longitude, float? maxDistance, bool? includeAddresses, bool? includeOutlets, bool? matchStopBySuburb, bool? matchRouteBySuburb, bool? matchStopByGtfsStopId, string token, string devid, string signature)
        {
            // verify the required parameter 'searchTerm' is set
            if (searchTerm == null) throw new ApiException(400, "Missing required parameter 'searchTerm' when calling SearchSearch");
    
            var path = "/v3/search/{search_term}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "search_term" + "}", ApiClient.ParameterToString(searchTerm));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (routeTypes != null) queryParams.Add("route_types", ApiClient.ParameterToString(routeTypes)); // query parameter
 if (latitude != null) queryParams.Add("latitude", ApiClient.ParameterToString(latitude)); // query parameter
 if (longitude != null) queryParams.Add("longitude", ApiClient.ParameterToString(longitude)); // query parameter
 if (maxDistance != null) queryParams.Add("max_distance", ApiClient.ParameterToString(maxDistance)); // query parameter
 if (includeAddresses != null) queryParams.Add("include_addresses", ApiClient.ParameterToString(includeAddresses)); // query parameter
 if (includeOutlets != null) queryParams.Add("include_outlets", ApiClient.ParameterToString(includeOutlets)); // query parameter
 if (matchStopBySuburb != null) queryParams.Add("match_stop_by_suburb", ApiClient.ParameterToString(matchStopBySuburb)); // query parameter
 if (matchRouteBySuburb != null) queryParams.Add("match_route_by_suburb", ApiClient.ParameterToString(matchRouteBySuburb)); // query parameter
 if (matchStopByGtfsStopId != null) queryParams.Add("match_stop_by_gtfs_stop_id", ApiClient.ParameterToString(matchStopByGtfsStopId)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SearchSearch: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling SearchSearch: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3SearchResult) ApiClient.Deserialize(response.Content, typeof(V3SearchResult), response.Headers);
        }
    
    }
}
