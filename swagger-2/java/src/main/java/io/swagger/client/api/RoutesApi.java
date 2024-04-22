/*
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.V3ErrorResponse;
import io.swagger.client.model.V3RouteResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoutesApi {
    private ApiClient apiClient;

    public RoutesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RoutesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for routesOneOrMoreRoutes
     * @param routeTypes Filter by route_type; values returned via RouteTypes API (optional)
     * @param routeName Filter by name  of route (accepts partial route name matches) (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call routesOneOrMoreRoutesCall(List<Integer> routeTypes, String routeName, String token, String devid, String signature, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/routes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (routeTypes != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "route_types", routeTypes));
        if (routeName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("route_name", routeName));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token", token));
        if (devid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("devid", devid));
        if (signature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("signature", signature));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/html"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call routesOneOrMoreRoutesValidateBeforeCall(List<Integer> routeTypes, String routeName, String token, String devid, String signature, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = routesOneOrMoreRoutesCall(routeTypes, routeName, token, devid, signature, progressListener, progressRequestListener);
        return call;

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
     */
    public V3RouteResponse routesOneOrMoreRoutes(List<Integer> routeTypes, String routeName, String token, String devid, String signature) throws ApiException {
        ApiResponse<V3RouteResponse> resp = routesOneOrMoreRoutesWithHttpInfo(routeTypes, routeName, token, devid, signature);
        return resp.getData();
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
     */
    public ApiResponse<V3RouteResponse> routesOneOrMoreRoutesWithHttpInfo(List<Integer> routeTypes, String routeName, String token, String devid, String signature) throws ApiException {
        com.squareup.okhttp.Call call = routesOneOrMoreRoutesValidateBeforeCall(routeTypes, routeName, token, devid, signature, null, null);
        Type localVarReturnType = new TypeToken<V3RouteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View route names and numbers for all routes (asynchronously)
     * 
     * @param routeTypes Filter by route_type; values returned via RouteTypes API (optional)
     * @param routeName Filter by name  of route (accepts partial route name matches) (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call routesOneOrMoreRoutesAsync(List<Integer> routeTypes, String routeName, String token, String devid, String signature, final ApiCallback<V3RouteResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = routesOneOrMoreRoutesValidateBeforeCall(routeTypes, routeName, token, devid, signature, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V3RouteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for routesRouteFromId
     * @param routeId Identifier of route; values returned by Departures, Directions and Disruptions APIs (required)
     * @param includeGeopath Indicates kif geopath data will be returned (default &#x3D; false) (optional)
     * @param geopathUtc Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call routesRouteFromIdCall(Integer routeId, Boolean includeGeopath, OffsetDateTime geopathUtc, String token, String devid, String signature, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/routes/{route_id}"
            .replaceAll("\\{" + "route_id" + "\\}", apiClient.escapeString(routeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (includeGeopath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("include_geopath", includeGeopath));
        if (geopathUtc != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("geopath_utc", geopathUtc));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token", token));
        if (devid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("devid", devid));
        if (signature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("signature", signature));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "text/html"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call routesRouteFromIdValidateBeforeCall(Integer routeId, Boolean includeGeopath, OffsetDateTime geopathUtc, String token, String devid, String signature, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling routesRouteFromId(Async)");
        }
        

        com.squareup.okhttp.Call call = routesRouteFromIdCall(routeId, includeGeopath, geopathUtc, token, devid, signature, progressListener, progressRequestListener);
        return call;

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
     */
    public V3RouteResponse routesRouteFromId(Integer routeId, Boolean includeGeopath, OffsetDateTime geopathUtc, String token, String devid, String signature) throws ApiException {
        ApiResponse<V3RouteResponse> resp = routesRouteFromIdWithHttpInfo(routeId, includeGeopath, geopathUtc, token, devid, signature);
        return resp.getData();
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
     */
    public ApiResponse<V3RouteResponse> routesRouteFromIdWithHttpInfo(Integer routeId, Boolean includeGeopath, OffsetDateTime geopathUtc, String token, String devid, String signature) throws ApiException {
        com.squareup.okhttp.Call call = routesRouteFromIdValidateBeforeCall(routeId, includeGeopath, geopathUtc, token, devid, signature, null, null);
        Type localVarReturnType = new TypeToken<V3RouteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
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
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call routesRouteFromIdAsync(Integer routeId, Boolean includeGeopath, OffsetDateTime geopathUtc, String token, String devid, String signature, final ApiCallback<V3RouteResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = routesRouteFromIdValidateBeforeCall(routeId, includeGeopath, geopathUtc, token, devid, signature, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V3RouteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
