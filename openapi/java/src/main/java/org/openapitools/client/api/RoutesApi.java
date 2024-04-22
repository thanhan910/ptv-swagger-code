/*
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.time.OffsetDateTime;
import org.openapitools.client.model.V3ErrorResponse;
import org.openapitools.client.model.V3RouteResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoutesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RoutesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RoutesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for routesOneOrMoreRoutes
     * @param routeTypes Filter by route_type; values returned via RouteTypes API (optional)
     * @param routeName Filter by name  of route (accepts partial route name matches) (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Route names and numbers for all routes of all route types. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access Denied </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call routesOneOrMoreRoutesCall(List<Integer> routeTypes, String routeName, String token, String devid, String signature, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/routes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (routeTypes != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "route_types", routeTypes));
        }

        if (routeName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("route_name", routeName));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        if (devid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("devid", devid));
        }

        if (signature != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("signature", signature));
        }

        final String[] localVarAccepts = {
            "application/json",
            "text/json",
            "text/html"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call routesOneOrMoreRoutesValidateBeforeCall(List<Integer> routeTypes, String routeName, String token, String devid, String signature, final ApiCallback _callback) throws ApiException {
        return routesOneOrMoreRoutesCall(routeTypes, routeName, token, devid, signature, _callback);

    }

    /**
     * View route names and numbers for all routes
     * 
     * @param routeTypes Filter by route_type; values returned via RouteTypes API (optional)
     * @param routeName Filter by name  of route (accepts partial route name matches) (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @return V3RouteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Route names and numbers for all routes of all route types. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access Denied </td><td>  -  </td></tr>
     </table>
     */
    public V3RouteResponse routesOneOrMoreRoutes(List<Integer> routeTypes, String routeName, String token, String devid, String signature) throws ApiException {
        ApiResponse<V3RouteResponse> localVarResp = routesOneOrMoreRoutesWithHttpInfo(routeTypes, routeName, token, devid, signature);
        return localVarResp.getData();
    }

    /**
     * View route names and numbers for all routes
     * 
     * @param routeTypes Filter by route_type; values returned via RouteTypes API (optional)
     * @param routeName Filter by name  of route (accepts partial route name matches) (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @return ApiResponse&lt;V3RouteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Route names and numbers for all routes of all route types. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access Denied </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V3RouteResponse> routesOneOrMoreRoutesWithHttpInfo(List<Integer> routeTypes, String routeName, String token, String devid, String signature) throws ApiException {
        okhttp3.Call localVarCall = routesOneOrMoreRoutesValidateBeforeCall(routeTypes, routeName, token, devid, signature, null);
        Type localVarReturnType = new TypeToken<V3RouteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * View route names and numbers for all routes (asynchronously)
     * 
     * @param routeTypes Filter by route_type; values returned via RouteTypes API (optional)
     * @param routeName Filter by name  of route (accepts partial route name matches) (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Route names and numbers for all routes of all route types. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access Denied </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call routesOneOrMoreRoutesAsync(List<Integer> routeTypes, String routeName, String token, String devid, String signature, final ApiCallback<V3RouteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = routesOneOrMoreRoutesValidateBeforeCall(routeTypes, routeName, token, devid, signature, _callback);
        Type localVarReturnType = new TypeToken<V3RouteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for routesRouteFromId
     * @param routeId Identifier of route; values returned by Departures, Directions and Disruptions APIs (required)
     * @param includeGeopath Indicates kif geopath data will be returned (default &#x3D; false) (optional)
     * @param geopathUtc Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The route name and number for the specified route ID. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access Denied </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call routesRouteFromIdCall(Integer routeId, Boolean includeGeopath, OffsetDateTime geopathUtc, String token, String devid, String signature, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/routes/{route_id}"
            .replace("{" + "route_id" + "}", localVarApiClient.escapeString(routeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeGeopath != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_geopath", includeGeopath));
        }

        if (geopathUtc != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("geopath_utc", geopathUtc));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        if (devid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("devid", devid));
        }

        if (signature != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("signature", signature));
        }

        final String[] localVarAccepts = {
            "application/json",
            "text/json",
            "text/html"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call routesRouteFromIdValidateBeforeCall(Integer routeId, Boolean includeGeopath, OffsetDateTime geopathUtc, String token, String devid, String signature, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling routesRouteFromId(Async)");
        }

        return routesRouteFromIdCall(routeId, includeGeopath, geopathUtc, token, devid, signature, _callback);

    }

    /**
     * View route name and number for specific route ID
     * 
     * @param routeId Identifier of route; values returned by Departures, Directions and Disruptions APIs (required)
     * @param includeGeopath Indicates kif geopath data will be returned (default &#x3D; false) (optional)
     * @param geopathUtc Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @return V3RouteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The route name and number for the specified route ID. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access Denied </td><td>  -  </td></tr>
     </table>
     */
    public V3RouteResponse routesRouteFromId(Integer routeId, Boolean includeGeopath, OffsetDateTime geopathUtc, String token, String devid, String signature) throws ApiException {
        ApiResponse<V3RouteResponse> localVarResp = routesRouteFromIdWithHttpInfo(routeId, includeGeopath, geopathUtc, token, devid, signature);
        return localVarResp.getData();
    }

    /**
     * View route name and number for specific route ID
     * 
     * @param routeId Identifier of route; values returned by Departures, Directions and Disruptions APIs (required)
     * @param includeGeopath Indicates kif geopath data will be returned (default &#x3D; false) (optional)
     * @param geopathUtc Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @return ApiResponse&lt;V3RouteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The route name and number for the specified route ID. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access Denied </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V3RouteResponse> routesRouteFromIdWithHttpInfo(Integer routeId, Boolean includeGeopath, OffsetDateTime geopathUtc, String token, String devid, String signature) throws ApiException {
        okhttp3.Call localVarCall = routesRouteFromIdValidateBeforeCall(routeId, includeGeopath, geopathUtc, token, devid, signature, null);
        Type localVarReturnType = new TypeToken<V3RouteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * View route name and number for specific route ID (asynchronously)
     * 
     * @param routeId Identifier of route; values returned by Departures, Directions and Disruptions APIs (required)
     * @param includeGeopath Indicates kif geopath data will be returned (default &#x3D; false) (optional)
     * @param geopathUtc Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The route name and number for the specified route ID. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access Denied </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call routesRouteFromIdAsync(Integer routeId, Boolean includeGeopath, OffsetDateTime geopathUtc, String token, String devid, String signature, final ApiCallback<V3RouteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = routesRouteFromIdValidateBeforeCall(routeId, includeGeopath, geopathUtc, token, devid, signature, _callback);
        Type localVarReturnType = new TypeToken<V3RouteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
