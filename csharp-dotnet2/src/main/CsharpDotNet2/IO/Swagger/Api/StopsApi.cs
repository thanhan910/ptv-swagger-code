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
    public interface IStopsApi
    {
        /// <summary>
        /// View facilities at a specific stop (Metro and V/Line stations only) 
        /// </summary>
        /// <param name="stopId">Identifier of stop; values returned by Stops API</param>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="stopLocation">Indicates if stop location information will be returned (default &#x3D; false)</param>
        /// <param name="stopAmenities">Indicates if stop amenity information will be returned (default &#x3D; false)</param>
        /// <param name="stopAccessibility">Indicates if stop accessibility information will be returned (default &#x3D; false)</param>
        /// <param name="stopContact">Indicates if stop contact information will be returned (default &#x3D; false)</param>
        /// <param name="stopTicket">Indicates if stop ticket information will be returned (default &#x3D; false)</param>
        /// <param name="gtfs">Incdicates whether the stop_id is a GTFS ID or not</param>
        /// <param name="stopStaffing">Indicates if stop staffing information will be returned (default &#x3D; false)</param>
        /// <param name="stopDisruptions">Indicates if stop disruption information will be returned (default &#x3D; false)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3StopResponse</returns>
        V3StopResponse StopsStopDetails (int? stopId, int? routeType, bool? stopLocation, bool? stopAmenities, bool? stopAccessibility, bool? stopContact, bool? stopTicket, bool? gtfs, bool? stopStaffing, bool? stopDisruptions, string token, string devid, string signature);
        /// <summary>
        /// View all stops near a specific location 
        /// </summary>
        /// <param name="latitude">Geographic coordinate of latitude</param>
        /// <param name="longitude">Geographic coordinate of longitude</param>
        /// <param name="routeTypes">Filter by route_type; values returned via RouteTypes API</param>
        /// <param name="maxResults">Maximum number of results returned (default &#x3D; 30)</param>
        /// <param name="maxDistance">Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300)</param>
        /// <param name="stopDisruptions">Indicates if stop disruption information will be returned (default &#x3D; false)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3StopsByDistanceResponse</returns>
        V3StopsByDistanceResponse StopsStopsByGeolocation (float? latitude, float? longitude, List<int?> routeTypes, int? maxResults, double? maxDistance, bool? stopDisruptions, string token, string devid, string signature);
        /// <summary>
        /// View all stops on a specific route 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes</param>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="directionId">An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response.</param>
        /// <param name="stopDisruptions">Indicates if stop disruption information will be returned (default &#x3D; false)</param>
        /// <param name="includeGeopath">Indicates if geopath data will be returned (default &#x3D; false)</param>
        /// <param name="geopathUtc">Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3StopsOnRouteResponse</returns>
        V3StopsOnRouteResponse StopsStopsForRoute (int? routeId, int? routeType, int? directionId, bool? stopDisruptions, bool? includeGeopath, DateTime? geopathUtc, string token, string devid, string signature);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class StopsApi : IStopsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StopsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public StopsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="StopsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public StopsApi(String basePath)
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
        /// View facilities at a specific stop (Metro and V/Line stations only) 
        /// </summary>
        /// <param name="stopId">Identifier of stop; values returned by Stops API</param>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="stopLocation">Indicates if stop location information will be returned (default &#x3D; false)</param>
        /// <param name="stopAmenities">Indicates if stop amenity information will be returned (default &#x3D; false)</param>
        /// <param name="stopAccessibility">Indicates if stop accessibility information will be returned (default &#x3D; false)</param>
        /// <param name="stopContact">Indicates if stop contact information will be returned (default &#x3D; false)</param>
        /// <param name="stopTicket">Indicates if stop ticket information will be returned (default &#x3D; false)</param>
        /// <param name="gtfs">Incdicates whether the stop_id is a GTFS ID or not</param>
        /// <param name="stopStaffing">Indicates if stop staffing information will be returned (default &#x3D; false)</param>
        /// <param name="stopDisruptions">Indicates if stop disruption information will be returned (default &#x3D; false)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3StopResponse</returns>
        public V3StopResponse StopsStopDetails (int? stopId, int? routeType, bool? stopLocation, bool? stopAmenities, bool? stopAccessibility, bool? stopContact, bool? stopTicket, bool? gtfs, bool? stopStaffing, bool? stopDisruptions, string token, string devid, string signature)
        {
            // verify the required parameter 'stopId' is set
            if (stopId == null) throw new ApiException(400, "Missing required parameter 'stopId' when calling StopsStopDetails");
            // verify the required parameter 'routeType' is set
            if (routeType == null) throw new ApiException(400, "Missing required parameter 'routeType' when calling StopsStopDetails");
    
            var path = "/v3/stops/{stop_id}/route_type/{route_type}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "stop_id" + "}", ApiClient.ParameterToString(stopId));
path = path.Replace("{" + "route_type" + "}", ApiClient.ParameterToString(routeType));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (stopLocation != null) queryParams.Add("stop_location", ApiClient.ParameterToString(stopLocation)); // query parameter
 if (stopAmenities != null) queryParams.Add("stop_amenities", ApiClient.ParameterToString(stopAmenities)); // query parameter
 if (stopAccessibility != null) queryParams.Add("stop_accessibility", ApiClient.ParameterToString(stopAccessibility)); // query parameter
 if (stopContact != null) queryParams.Add("stop_contact", ApiClient.ParameterToString(stopContact)); // query parameter
 if (stopTicket != null) queryParams.Add("stop_ticket", ApiClient.ParameterToString(stopTicket)); // query parameter
 if (gtfs != null) queryParams.Add("gtfs", ApiClient.ParameterToString(gtfs)); // query parameter
 if (stopStaffing != null) queryParams.Add("stop_staffing", ApiClient.ParameterToString(stopStaffing)); // query parameter
 if (stopDisruptions != null) queryParams.Add("stop_disruptions", ApiClient.ParameterToString(stopDisruptions)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling StopsStopDetails: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StopsStopDetails: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3StopResponse) ApiClient.Deserialize(response.Content, typeof(V3StopResponse), response.Headers);
        }
    
        /// <summary>
        /// View all stops near a specific location 
        /// </summary>
        /// <param name="latitude">Geographic coordinate of latitude</param>
        /// <param name="longitude">Geographic coordinate of longitude</param>
        /// <param name="routeTypes">Filter by route_type; values returned via RouteTypes API</param>
        /// <param name="maxResults">Maximum number of results returned (default &#x3D; 30)</param>
        /// <param name="maxDistance">Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300)</param>
        /// <param name="stopDisruptions">Indicates if stop disruption information will be returned (default &#x3D; false)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3StopsByDistanceResponse</returns>
        public V3StopsByDistanceResponse StopsStopsByGeolocation (float? latitude, float? longitude, List<int?> routeTypes, int? maxResults, double? maxDistance, bool? stopDisruptions, string token, string devid, string signature)
        {
            // verify the required parameter 'latitude' is set
            if (latitude == null) throw new ApiException(400, "Missing required parameter 'latitude' when calling StopsStopsByGeolocation");
            // verify the required parameter 'longitude' is set
            if (longitude == null) throw new ApiException(400, "Missing required parameter 'longitude' when calling StopsStopsByGeolocation");
    
            var path = "/v3/stops/location/{latitude},{longitude}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "latitude" + "}", ApiClient.ParameterToString(latitude));
path = path.Replace("{" + "longitude" + "}", ApiClient.ParameterToString(longitude));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (routeTypes != null) queryParams.Add("route_types", ApiClient.ParameterToString(routeTypes)); // query parameter
 if (maxResults != null) queryParams.Add("max_results", ApiClient.ParameterToString(maxResults)); // query parameter
 if (maxDistance != null) queryParams.Add("max_distance", ApiClient.ParameterToString(maxDistance)); // query parameter
 if (stopDisruptions != null) queryParams.Add("stop_disruptions", ApiClient.ParameterToString(stopDisruptions)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling StopsStopsByGeolocation: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StopsStopsByGeolocation: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3StopsByDistanceResponse) ApiClient.Deserialize(response.Content, typeof(V3StopsByDistanceResponse), response.Headers);
        }
    
        /// <summary>
        /// View all stops on a specific route 
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Routes API - v3/routes</param>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API</param>
        /// <param name="directionId">An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response.</param>
        /// <param name="stopDisruptions">Indicates if stop disruption information will be returned (default &#x3D; false)</param>
        /// <param name="includeGeopath">Indicates if geopath data will be returned (default &#x3D; false)</param>
        /// <param name="geopathUtc">Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3StopsOnRouteResponse</returns>
        public V3StopsOnRouteResponse StopsStopsForRoute (int? routeId, int? routeType, int? directionId, bool? stopDisruptions, bool? includeGeopath, DateTime? geopathUtc, string token, string devid, string signature)
        {
            // verify the required parameter 'routeId' is set
            if (routeId == null) throw new ApiException(400, "Missing required parameter 'routeId' when calling StopsStopsForRoute");
            // verify the required parameter 'routeType' is set
            if (routeType == null) throw new ApiException(400, "Missing required parameter 'routeType' when calling StopsStopsForRoute");
    
            var path = "/v3/stops/route/{route_id}/route_type/{route_type}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "route_id" + "}", ApiClient.ParameterToString(routeId));
path = path.Replace("{" + "route_type" + "}", ApiClient.ParameterToString(routeType));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (directionId != null) queryParams.Add("direction_id", ApiClient.ParameterToString(directionId)); // query parameter
 if (stopDisruptions != null) queryParams.Add("stop_disruptions", ApiClient.ParameterToString(stopDisruptions)); // query parameter
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
                throw new ApiException ((int)response.StatusCode, "Error calling StopsStopsForRoute: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StopsStopsForRoute: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3StopsOnRouteResponse) ApiClient.Deserialize(response.Content, typeof(V3StopsOnRouteResponse), response.Headers);
        }
    
    }
}
