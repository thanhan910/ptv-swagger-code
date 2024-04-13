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
import io.swagger.client.model.V3DeparturesResponse;
import io.swagger.client.model.V3ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeparturesApi {
    private ApiClient apiClient;

    public DeparturesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeparturesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for departuresGetForStop
     * @param routeType Number identifying transport mode; values returned via RouteTypes API (required)
     * @param stopId Identifier of stop; values returned by Stops API (required)
     * @param platformNumbers Filter by platform number at stop (optional)
     * @param directionId Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
     * @param gtfs Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data (optional)
     * @param dateUtc Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) (optional)
     * @param maxResults Maximum number of results returned (optional)
     * @param includeCancelled Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only (optional)
     * @param lookBackwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. (optional)
     * @param expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
     * @param includeGeopath Indicates if the route geopath should be returned (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call departuresGetForStopCall(Integer routeType, Integer stopId, List<Integer> platformNumbers, Integer directionId, Boolean gtfs, OffsetDateTime dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v3/departures/route_type/{route_type}/stop/{stop_id}"
            .replaceAll("\\{" + "route_type" + "\\}", apiClient.escapeString(routeType.toString()))
            .replaceAll("\\{" + "stop_id" + "\\}", apiClient.escapeString(stopId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (platformNumbers != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "platform_numbers", platformNumbers));
        if (directionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("direction_id", directionId));
        if (gtfs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("gtfs", gtfs));
        if (dateUtc != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date_utc", dateUtc));
        if (maxResults != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("max_results", maxResults));
        if (includeCancelled != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("include_cancelled", includeCancelled));
        if (lookBackwards != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("look_backwards", lookBackwards));
        if (expand != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
        if (includeGeopath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("include_geopath", includeGeopath));
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
    private com.squareup.okhttp.Call departuresGetForStopValidateBeforeCall(Integer routeType, Integer stopId, List<Integer> platformNumbers, Integer directionId, Boolean gtfs, OffsetDateTime dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'routeType' is set
        if (routeType == null) {
            throw new ApiException("Missing the required parameter 'routeType' when calling departuresGetForStop(Async)");
        }
        // verify the required parameter 'stopId' is set
        if (stopId == null) {
            throw new ApiException("Missing the required parameter 'stopId' when calling departuresGetForStop(Async)");
        }
        
        com.squareup.okhttp.Call call = departuresGetForStopCall(routeType, stopId, platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * View departures for all routes from a stop
     * 
     * @param routeType Number identifying transport mode; values returned via RouteTypes API (required)
     * @param stopId Identifier of stop; values returned by Stops API (required)
     * @param platformNumbers Filter by platform number at stop (optional)
     * @param directionId Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
     * @param gtfs Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data (optional)
     * @param dateUtc Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) (optional)
     * @param maxResults Maximum number of results returned (optional)
     * @param includeCancelled Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only (optional)
     * @param lookBackwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. (optional)
     * @param expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
     * @param includeGeopath Indicates if the route geopath should be returned (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @return V3DeparturesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public V3DeparturesResponse departuresGetForStop(Integer routeType, Integer stopId, List<Integer> platformNumbers, Integer directionId, Boolean gtfs, OffsetDateTime dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature) throws ApiException {
        ApiResponse<V3DeparturesResponse> resp = departuresGetForStopWithHttpInfo(routeType, stopId, platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature);
        return resp.getData();
    }

    /**
     * View departures for all routes from a stop
     * 
     * @param routeType Number identifying transport mode; values returned via RouteTypes API (required)
     * @param stopId Identifier of stop; values returned by Stops API (required)
     * @param platformNumbers Filter by platform number at stop (optional)
     * @param directionId Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
     * @param gtfs Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data (optional)
     * @param dateUtc Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) (optional)
     * @param maxResults Maximum number of results returned (optional)
     * @param includeCancelled Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only (optional)
     * @param lookBackwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. (optional)
     * @param expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
     * @param includeGeopath Indicates if the route geopath should be returned (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @return ApiResponse&lt;V3DeparturesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<V3DeparturesResponse> departuresGetForStopWithHttpInfo(Integer routeType, Integer stopId, List<Integer> platformNumbers, Integer directionId, Boolean gtfs, OffsetDateTime dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature) throws ApiException {
        com.squareup.okhttp.Call call = departuresGetForStopValidateBeforeCall(routeType, stopId, platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature, null, null);
        Type localVarReturnType = new TypeToken<V3DeparturesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View departures for all routes from a stop (asynchronously)
     * 
     * @param routeType Number identifying transport mode; values returned via RouteTypes API (required)
     * @param stopId Identifier of stop; values returned by Stops API (required)
     * @param platformNumbers Filter by platform number at stop (optional)
     * @param directionId Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
     * @param gtfs Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data (optional)
     * @param dateUtc Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) (optional)
     * @param maxResults Maximum number of results returned (optional)
     * @param includeCancelled Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only (optional)
     * @param lookBackwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. (optional)
     * @param expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
     * @param includeGeopath Indicates if the route geopath should be returned (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call departuresGetForStopAsync(Integer routeType, Integer stopId, List<Integer> platformNumbers, Integer directionId, Boolean gtfs, OffsetDateTime dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature, final ApiCallback<V3DeparturesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = departuresGetForStopValidateBeforeCall(routeType, stopId, platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V3DeparturesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for departuresGetForStopAndRoute
     * @param routeType Number identifying transport mode; values returned via RouteTypes API (required)
     * @param stopId Identifier of stop; values returned by Stops API (required)
     * @param routeId Identifier of route; values returned by Routes API - v3/routes (required)
     * @param directionId Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
     * @param gtfs Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data (optional)
     * @param dateUtc Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) (optional)
     * @param maxResults Maximum number of results returned (optional)
     * @param includeCancelled Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only (optional)
     * @param lookBackwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. (optional)
     * @param expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
     * @param includeGeopath Indicates if the route geopath should be returned (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call departuresGetForStopAndRouteCall(Integer routeType, Integer stopId, String routeId, Integer directionId, Boolean gtfs, OffsetDateTime dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id}"
            .replaceAll("\\{" + "route_type" + "\\}", apiClient.escapeString(routeType.toString()))
            .replaceAll("\\{" + "stop_id" + "\\}", apiClient.escapeString(stopId.toString()))
            .replaceAll("\\{" + "route_id" + "\\}", apiClient.escapeString(routeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (directionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("direction_id", directionId));
        if (gtfs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("gtfs", gtfs));
        if (dateUtc != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date_utc", dateUtc));
        if (maxResults != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("max_results", maxResults));
        if (includeCancelled != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("include_cancelled", includeCancelled));
        if (lookBackwards != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("look_backwards", lookBackwards));
        if (expand != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
        if (includeGeopath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("include_geopath", includeGeopath));
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
    private com.squareup.okhttp.Call departuresGetForStopAndRouteValidateBeforeCall(Integer routeType, Integer stopId, String routeId, Integer directionId, Boolean gtfs, OffsetDateTime dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'routeType' is set
        if (routeType == null) {
            throw new ApiException("Missing the required parameter 'routeType' when calling departuresGetForStopAndRoute(Async)");
        }
        // verify the required parameter 'stopId' is set
        if (stopId == null) {
            throw new ApiException("Missing the required parameter 'stopId' when calling departuresGetForStopAndRoute(Async)");
        }
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling departuresGetForStopAndRoute(Async)");
        }
        
        com.squareup.okhttp.Call call = departuresGetForStopAndRouteCall(routeType, stopId, routeId, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * View departures for a specific route from a stop
     * 
     * @param routeType Number identifying transport mode; values returned via RouteTypes API (required)
     * @param stopId Identifier of stop; values returned by Stops API (required)
     * @param routeId Identifier of route; values returned by Routes API - v3/routes (required)
     * @param directionId Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
     * @param gtfs Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data (optional)
     * @param dateUtc Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) (optional)
     * @param maxResults Maximum number of results returned (optional)
     * @param includeCancelled Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only (optional)
     * @param lookBackwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. (optional)
     * @param expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
     * @param includeGeopath Indicates if the route geopath should be returned (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @return V3DeparturesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public V3DeparturesResponse departuresGetForStopAndRoute(Integer routeType, Integer stopId, String routeId, Integer directionId, Boolean gtfs, OffsetDateTime dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature) throws ApiException {
        ApiResponse<V3DeparturesResponse> resp = departuresGetForStopAndRouteWithHttpInfo(routeType, stopId, routeId, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature);
        return resp.getData();
    }

    /**
     * View departures for a specific route from a stop
     * 
     * @param routeType Number identifying transport mode; values returned via RouteTypes API (required)
     * @param stopId Identifier of stop; values returned by Stops API (required)
     * @param routeId Identifier of route; values returned by Routes API - v3/routes (required)
     * @param directionId Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
     * @param gtfs Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data (optional)
     * @param dateUtc Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) (optional)
     * @param maxResults Maximum number of results returned (optional)
     * @param includeCancelled Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only (optional)
     * @param lookBackwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. (optional)
     * @param expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
     * @param includeGeopath Indicates if the route geopath should be returned (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @return ApiResponse&lt;V3DeparturesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<V3DeparturesResponse> departuresGetForStopAndRouteWithHttpInfo(Integer routeType, Integer stopId, String routeId, Integer directionId, Boolean gtfs, OffsetDateTime dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature) throws ApiException {
        com.squareup.okhttp.Call call = departuresGetForStopAndRouteValidateBeforeCall(routeType, stopId, routeId, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature, null, null);
        Type localVarReturnType = new TypeToken<V3DeparturesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View departures for a specific route from a stop (asynchronously)
     * 
     * @param routeType Number identifying transport mode; values returned via RouteTypes API (required)
     * @param stopId Identifier of stop; values returned by Stops API (required)
     * @param routeId Identifier of route; values returned by Routes API - v3/routes (required)
     * @param directionId Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional)
     * @param gtfs Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data (optional)
     * @param dateUtc Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) (optional)
     * @param maxResults Maximum number of results returned (optional)
     * @param includeCancelled Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only (optional)
     * @param lookBackwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. (optional)
     * @param expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional)
     * @param includeGeopath Indicates if the route geopath should be returned (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call departuresGetForStopAndRouteAsync(Integer routeType, Integer stopId, String routeId, Integer directionId, Boolean gtfs, OffsetDateTime dateUtc, Integer maxResults, Boolean includeCancelled, Boolean lookBackwards, List<String> expand, Boolean includeGeopath, String token, String devid, String signature, final ApiCallback<V3DeparturesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = departuresGetForStopAndRouteValidateBeforeCall(routeType, stopId, routeId, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V3DeparturesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
