/* 
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IFareEstimateApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Estimate a fare by zone
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="minZone">Minimum Zone travelled through ie. 1</param>
        /// <param name="maxZone">Maximum Zone travelled through id. 6</param>
        /// <param name="journeyTouchOnUtc">JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="journeyTouchOffUtc">JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="isJourneyInFreeTramZone"> (optional)</param>
        /// <param name="travelledRouteTypes"> (optional)</param>
        /// <param name="token">Please ignore (optional)</param>
        /// <param name="devid">Your developer id (optional)</param>
        /// <param name="signature">Authentication signature for request (optional)</param>
        /// <returns>V3FareEstimateResponse</returns>
        V3FareEstimateResponse FareEstimateGetFareEstimateByZone (int? minZone, int? maxZone, DateTime? journeyTouchOnUtc = null, DateTime? journeyTouchOffUtc = null, bool? isJourneyInFreeTramZone = null, List<int?> travelledRouteTypes = null, string token = null, string devid = null, string signature = null);

        /// <summary>
        /// Estimate a fare by zone
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="minZone">Minimum Zone travelled through ie. 1</param>
        /// <param name="maxZone">Maximum Zone travelled through id. 6</param>
        /// <param name="journeyTouchOnUtc">JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="journeyTouchOffUtc">JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="isJourneyInFreeTramZone"> (optional)</param>
        /// <param name="travelledRouteTypes"> (optional)</param>
        /// <param name="token">Please ignore (optional)</param>
        /// <param name="devid">Your developer id (optional)</param>
        /// <param name="signature">Authentication signature for request (optional)</param>
        /// <returns>ApiResponse of V3FareEstimateResponse</returns>
        ApiResponse<V3FareEstimateResponse> FareEstimateGetFareEstimateByZoneWithHttpInfo (int? minZone, int? maxZone, DateTime? journeyTouchOnUtc = null, DateTime? journeyTouchOffUtc = null, bool? isJourneyInFreeTramZone = null, List<int?> travelledRouteTypes = null, string token = null, string devid = null, string signature = null);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Estimate a fare by zone
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="minZone">Minimum Zone travelled through ie. 1</param>
        /// <param name="maxZone">Maximum Zone travelled through id. 6</param>
        /// <param name="journeyTouchOnUtc">JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="journeyTouchOffUtc">JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="isJourneyInFreeTramZone"> (optional)</param>
        /// <param name="travelledRouteTypes"> (optional)</param>
        /// <param name="token">Please ignore (optional)</param>
        /// <param name="devid">Your developer id (optional)</param>
        /// <param name="signature">Authentication signature for request (optional)</param>
        /// <returns>Task of V3FareEstimateResponse</returns>
        System.Threading.Tasks.Task<V3FareEstimateResponse> FareEstimateGetFareEstimateByZoneAsync (int? minZone, int? maxZone, DateTime? journeyTouchOnUtc = null, DateTime? journeyTouchOffUtc = null, bool? isJourneyInFreeTramZone = null, List<int?> travelledRouteTypes = null, string token = null, string devid = null, string signature = null);

        /// <summary>
        /// Estimate a fare by zone
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="minZone">Minimum Zone travelled through ie. 1</param>
        /// <param name="maxZone">Maximum Zone travelled through id. 6</param>
        /// <param name="journeyTouchOnUtc">JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="journeyTouchOffUtc">JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="isJourneyInFreeTramZone"> (optional)</param>
        /// <param name="travelledRouteTypes"> (optional)</param>
        /// <param name="token">Please ignore (optional)</param>
        /// <param name="devid">Your developer id (optional)</param>
        /// <param name="signature">Authentication signature for request (optional)</param>
        /// <returns>Task of ApiResponse (V3FareEstimateResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<V3FareEstimateResponse>> FareEstimateGetFareEstimateByZoneAsyncWithHttpInfo (int? minZone, int? maxZone, DateTime? journeyTouchOnUtc = null, DateTime? journeyTouchOffUtc = null, bool? isJourneyInFreeTramZone = null, List<int?> travelledRouteTypes = null, string token = null, string devid = null, string signature = null);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class FareEstimateApi : IFareEstimateApi
    {
        private IO.Swagger.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="FareEstimateApi"/> class.
        /// </summary>
        /// <returns></returns>
        public FareEstimateApi(String basePath)
        {
            this.Configuration = new IO.Swagger.Client.Configuration { BasePath = basePath };

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FareEstimateApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public FareEstimateApi(IO.Swagger.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = IO.Swagger.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public IO.Swagger.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public IO.Swagger.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Estimate a fare by zone 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="minZone">Minimum Zone travelled through ie. 1</param>
        /// <param name="maxZone">Maximum Zone travelled through id. 6</param>
        /// <param name="journeyTouchOnUtc">JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="journeyTouchOffUtc">JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="isJourneyInFreeTramZone"> (optional)</param>
        /// <param name="travelledRouteTypes"> (optional)</param>
        /// <param name="token">Please ignore (optional)</param>
        /// <param name="devid">Your developer id (optional)</param>
        /// <param name="signature">Authentication signature for request (optional)</param>
        /// <returns>V3FareEstimateResponse</returns>
        public V3FareEstimateResponse FareEstimateGetFareEstimateByZone (int? minZone, int? maxZone, DateTime? journeyTouchOnUtc = null, DateTime? journeyTouchOffUtc = null, bool? isJourneyInFreeTramZone = null, List<int?> travelledRouteTypes = null, string token = null, string devid = null, string signature = null)
        {
             ApiResponse<V3FareEstimateResponse> localVarResponse = FareEstimateGetFareEstimateByZoneWithHttpInfo(minZone, maxZone, journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Estimate a fare by zone 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="minZone">Minimum Zone travelled through ie. 1</param>
        /// <param name="maxZone">Maximum Zone travelled through id. 6</param>
        /// <param name="journeyTouchOnUtc">JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="journeyTouchOffUtc">JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="isJourneyInFreeTramZone"> (optional)</param>
        /// <param name="travelledRouteTypes"> (optional)</param>
        /// <param name="token">Please ignore (optional)</param>
        /// <param name="devid">Your developer id (optional)</param>
        /// <param name="signature">Authentication signature for request (optional)</param>
        /// <returns>ApiResponse of V3FareEstimateResponse</returns>
        public ApiResponse< V3FareEstimateResponse > FareEstimateGetFareEstimateByZoneWithHttpInfo (int? minZone, int? maxZone, DateTime? journeyTouchOnUtc = null, DateTime? journeyTouchOffUtc = null, bool? isJourneyInFreeTramZone = null, List<int?> travelledRouteTypes = null, string token = null, string devid = null, string signature = null)
        {
            // verify the required parameter 'minZone' is set
            if (minZone == null)
                throw new ApiException(400, "Missing required parameter 'minZone' when calling FareEstimateApi->FareEstimateGetFareEstimateByZone");
            // verify the required parameter 'maxZone' is set
            if (maxZone == null)
                throw new ApiException(400, "Missing required parameter 'maxZone' when calling FareEstimateApi->FareEstimateGetFareEstimateByZone");

            var localVarPath = "/v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "text/json",
                "text/html"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (minZone != null) localVarPathParams.Add("minZone", this.Configuration.ApiClient.ParameterToString(minZone)); // path parameter
            if (maxZone != null) localVarPathParams.Add("maxZone", this.Configuration.ApiClient.ParameterToString(maxZone)); // path parameter
            if (journeyTouchOnUtc != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "journey_touch_on_utc", journeyTouchOnUtc)); // query parameter
            if (journeyTouchOffUtc != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "journey_touch_off_utc", journeyTouchOffUtc)); // query parameter
            if (isJourneyInFreeTramZone != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "is_journey_in_free_tram_zone", isJourneyInFreeTramZone)); // query parameter
            if (travelledRouteTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("multi", "travelled_route_types", travelledRouteTypes)); // query parameter
            if (token != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "token", token)); // query parameter
            if (devid != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "devid", devid)); // query parameter
            if (signature != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "signature", signature)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("FareEstimateGetFareEstimateByZone", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<V3FareEstimateResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (V3FareEstimateResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(V3FareEstimateResponse)));
        }

        /// <summary>
        /// Estimate a fare by zone 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="minZone">Minimum Zone travelled through ie. 1</param>
        /// <param name="maxZone">Maximum Zone travelled through id. 6</param>
        /// <param name="journeyTouchOnUtc">JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="journeyTouchOffUtc">JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="isJourneyInFreeTramZone"> (optional)</param>
        /// <param name="travelledRouteTypes"> (optional)</param>
        /// <param name="token">Please ignore (optional)</param>
        /// <param name="devid">Your developer id (optional)</param>
        /// <param name="signature">Authentication signature for request (optional)</param>
        /// <returns>Task of V3FareEstimateResponse</returns>
        public async System.Threading.Tasks.Task<V3FareEstimateResponse> FareEstimateGetFareEstimateByZoneAsync (int? minZone, int? maxZone, DateTime? journeyTouchOnUtc = null, DateTime? journeyTouchOffUtc = null, bool? isJourneyInFreeTramZone = null, List<int?> travelledRouteTypes = null, string token = null, string devid = null, string signature = null)
        {
             ApiResponse<V3FareEstimateResponse> localVarResponse = await FareEstimateGetFareEstimateByZoneAsyncWithHttpInfo(minZone, maxZone, journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Estimate a fare by zone 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="minZone">Minimum Zone travelled through ie. 1</param>
        /// <param name="maxZone">Maximum Zone travelled through id. 6</param>
        /// <param name="journeyTouchOnUtc">JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="journeyTouchOffUtc">JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)</param>
        /// <param name="isJourneyInFreeTramZone"> (optional)</param>
        /// <param name="travelledRouteTypes"> (optional)</param>
        /// <param name="token">Please ignore (optional)</param>
        /// <param name="devid">Your developer id (optional)</param>
        /// <param name="signature">Authentication signature for request (optional)</param>
        /// <returns>Task of ApiResponse (V3FareEstimateResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<V3FareEstimateResponse>> FareEstimateGetFareEstimateByZoneAsyncWithHttpInfo (int? minZone, int? maxZone, DateTime? journeyTouchOnUtc = null, DateTime? journeyTouchOffUtc = null, bool? isJourneyInFreeTramZone = null, List<int?> travelledRouteTypes = null, string token = null, string devid = null, string signature = null)
        {
            // verify the required parameter 'minZone' is set
            if (minZone == null)
                throw new ApiException(400, "Missing required parameter 'minZone' when calling FareEstimateApi->FareEstimateGetFareEstimateByZone");
            // verify the required parameter 'maxZone' is set
            if (maxZone == null)
                throw new ApiException(400, "Missing required parameter 'maxZone' when calling FareEstimateApi->FareEstimateGetFareEstimateByZone");

            var localVarPath = "/v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "text/json",
                "text/html"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (minZone != null) localVarPathParams.Add("minZone", this.Configuration.ApiClient.ParameterToString(minZone)); // path parameter
            if (maxZone != null) localVarPathParams.Add("maxZone", this.Configuration.ApiClient.ParameterToString(maxZone)); // path parameter
            if (journeyTouchOnUtc != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "journey_touch_on_utc", journeyTouchOnUtc)); // query parameter
            if (journeyTouchOffUtc != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "journey_touch_off_utc", journeyTouchOffUtc)); // query parameter
            if (isJourneyInFreeTramZone != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "is_journey_in_free_tram_zone", isJourneyInFreeTramZone)); // query parameter
            if (travelledRouteTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("multi", "travelled_route_types", travelledRouteTypes)); // query parameter
            if (token != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "token", token)); // query parameter
            if (devid != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "devid", devid)); // query parameter
            if (signature != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "signature", signature)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("FareEstimateGetFareEstimateByZone", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<V3FareEstimateResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (V3FareEstimateResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(V3FareEstimateResponse)));
        }

    }
}
