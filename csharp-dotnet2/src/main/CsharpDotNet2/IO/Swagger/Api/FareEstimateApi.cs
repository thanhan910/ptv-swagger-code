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
    public interface IFareEstimateApi
    {
        /// <summary>
        /// Estimate a fare by zone 
        /// </summary>
        /// <param name="minZone">Minimum Zone travelled through ie. 1</param>
        /// <param name="maxZone">Maximum Zone travelled through id. 6</param>
        /// <param name="journeyTouchOnUtc">JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).</param>
        /// <param name="journeyTouchOffUtc">JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).</param>
        /// <param name="isJourneyInFreeTramZone"></param>
        /// <param name="travelledRouteTypes"></param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3FareEstimateResponse</returns>
        V3FareEstimateResponse FareEstimateGetFareEstimateByZone (int? minZone, int? maxZone, DateTime? journeyTouchOnUtc, DateTime? journeyTouchOffUtc, bool? isJourneyInFreeTramZone, List<int?> travelledRouteTypes, string token, string devid, string signature);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class FareEstimateApi : IFareEstimateApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FareEstimateApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public FareEstimateApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="FareEstimateApi"/> class.
        /// </summary>
        /// <returns></returns>
        public FareEstimateApi(String basePath)
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
        /// Estimate a fare by zone 
        /// </summary>
        /// <param name="minZone">Minimum Zone travelled through ie. 1</param>
        /// <param name="maxZone">Maximum Zone travelled through id. 6</param>
        /// <param name="journeyTouchOnUtc">JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).</param>
        /// <param name="journeyTouchOffUtc">JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).</param>
        /// <param name="isJourneyInFreeTramZone"></param>
        /// <param name="travelledRouteTypes"></param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <returns>V3FareEstimateResponse</returns>
        public V3FareEstimateResponse FareEstimateGetFareEstimateByZone (int? minZone, int? maxZone, DateTime? journeyTouchOnUtc, DateTime? journeyTouchOffUtc, bool? isJourneyInFreeTramZone, List<int?> travelledRouteTypes, string token, string devid, string signature)
        {
            // verify the required parameter 'minZone' is set
            if (minZone == null) throw new ApiException(400, "Missing required parameter 'minZone' when calling FareEstimateGetFareEstimateByZone");
            // verify the required parameter 'maxZone' is set
            if (maxZone == null) throw new ApiException(400, "Missing required parameter 'maxZone' when calling FareEstimateGetFareEstimateByZone");
    
            var path = "/v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "minZone" + "}", ApiClient.ParameterToString(minZone));
path = path.Replace("{" + "maxZone" + "}", ApiClient.ParameterToString(maxZone));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (journeyTouchOnUtc != null) queryParams.Add("journey_touch_on_utc", ApiClient.ParameterToString(journeyTouchOnUtc)); // query parameter
 if (journeyTouchOffUtc != null) queryParams.Add("journey_touch_off_utc", ApiClient.ParameterToString(journeyTouchOffUtc)); // query parameter
 if (isJourneyInFreeTramZone != null) queryParams.Add("is_journey_in_free_tram_zone", ApiClient.ParameterToString(isJourneyInFreeTramZone)); // query parameter
 if (travelledRouteTypes != null) queryParams.Add("travelled_route_types", ApiClient.ParameterToString(travelledRouteTypes)); // query parameter
 if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
 if (devid != null) queryParams.Add("devid", ApiClient.ParameterToString(devid)); // query parameter
 if (signature != null) queryParams.Add("signature", ApiClient.ParameterToString(signature)); // query parameter
                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling FareEstimateGetFareEstimateByZone: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FareEstimateGetFareEstimateByZone: " + response.ErrorMessage, response.ErrorMessage);
    
            return (V3FareEstimateResponse) ApiClient.Deserialize(response.Content, typeof(V3FareEstimateResponse), response.Headers);
        }
    
    }
}
