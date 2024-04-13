/**
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *//* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs';

import { V3ErrorResponse } from '../model/v3ErrorResponse';
import { V3StopResponse } from '../model/v3StopResponse';
import { V3StopsByDistanceResponse } from '../model/v3StopsByDistanceResponse';
import { V3StopsOnRouteResponse } from '../model/v3StopsOnRouteResponse';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class StopsService {

    protected basePath = 'https://timetableapi.ptv.vic.gov.au/';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
            this.basePath = basePath || configuration.basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * View facilities at a specific stop (Metro and V/Line stations only)
     * 
     * @param stopId Identifier of stop; values returned by Stops API
     * @param routeType Number identifying transport mode; values returned via RouteTypes API
     * @param stopLocation Indicates if stop location information will be returned (default &#x3D; false)
     * @param stopAmenities Indicates if stop amenity information will be returned (default &#x3D; false)
     * @param stopAccessibility Indicates if stop accessibility information will be returned (default &#x3D; false)
     * @param stopContact Indicates if stop contact information will be returned (default &#x3D; false)
     * @param stopTicket Indicates if stop ticket information will be returned (default &#x3D; false)
     * @param gtfs Incdicates whether the stop_id is a GTFS ID or not
     * @param stopStaffing Indicates if stop staffing information will be returned (default &#x3D; false)
     * @param stopDisruptions Indicates if stop disruption information will be returned (default &#x3D; false)
     * @param token Please ignore
     * @param devid Your developer id
     * @param signature Authentication signature for request
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public stopsStopDetails(stopId: number, routeType: number, stopLocation?: boolean, stopAmenities?: boolean, stopAccessibility?: boolean, stopContact?: boolean, stopTicket?: boolean, gtfs?: boolean, stopStaffing?: boolean, stopDisruptions?: boolean, token?: string, devid?: string, signature?: string, observe?: 'body', reportProgress?: boolean): Observable<V3StopResponse>;
    public stopsStopDetails(stopId: number, routeType: number, stopLocation?: boolean, stopAmenities?: boolean, stopAccessibility?: boolean, stopContact?: boolean, stopTicket?: boolean, gtfs?: boolean, stopStaffing?: boolean, stopDisruptions?: boolean, token?: string, devid?: string, signature?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<V3StopResponse>>;
    public stopsStopDetails(stopId: number, routeType: number, stopLocation?: boolean, stopAmenities?: boolean, stopAccessibility?: boolean, stopContact?: boolean, stopTicket?: boolean, gtfs?: boolean, stopStaffing?: boolean, stopDisruptions?: boolean, token?: string, devid?: string, signature?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<V3StopResponse>>;
    public stopsStopDetails(stopId: number, routeType: number, stopLocation?: boolean, stopAmenities?: boolean, stopAccessibility?: boolean, stopContact?: boolean, stopTicket?: boolean, gtfs?: boolean, stopStaffing?: boolean, stopDisruptions?: boolean, token?: string, devid?: string, signature?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (stopId === null || stopId === undefined) {
            throw new Error('Required parameter stopId was null or undefined when calling stopsStopDetails.');
        }

        if (routeType === null || routeType === undefined) {
            throw new Error('Required parameter routeType was null or undefined when calling stopsStopDetails.');
        }












        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (stopLocation !== undefined && stopLocation !== null) {
            queryParameters = queryParameters.set('stop_location', <any>stopLocation);
        }
        if (stopAmenities !== undefined && stopAmenities !== null) {
            queryParameters = queryParameters.set('stop_amenities', <any>stopAmenities);
        }
        if (stopAccessibility !== undefined && stopAccessibility !== null) {
            queryParameters = queryParameters.set('stop_accessibility', <any>stopAccessibility);
        }
        if (stopContact !== undefined && stopContact !== null) {
            queryParameters = queryParameters.set('stop_contact', <any>stopContact);
        }
        if (stopTicket !== undefined && stopTicket !== null) {
            queryParameters = queryParameters.set('stop_ticket', <any>stopTicket);
        }
        if (gtfs !== undefined && gtfs !== null) {
            queryParameters = queryParameters.set('gtfs', <any>gtfs);
        }
        if (stopStaffing !== undefined && stopStaffing !== null) {
            queryParameters = queryParameters.set('stop_staffing', <any>stopStaffing);
        }
        if (stopDisruptions !== undefined && stopDisruptions !== null) {
            queryParameters = queryParameters.set('stop_disruptions', <any>stopDisruptions);
        }
        if (token !== undefined && token !== null) {
            queryParameters = queryParameters.set('token', <any>token);
        }
        if (devid !== undefined && devid !== null) {
            queryParameters = queryParameters.set('devid', <any>devid);
        }
        if (signature !== undefined && signature !== null) {
            queryParameters = queryParameters.set('signature', <any>signature);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json',
            'text/json',
            'text/html'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<V3StopResponse>('get',`${this.basePath}/v3/stops/${encodeURIComponent(String(stopId))}/route_type/${encodeURIComponent(String(routeType))}`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * View all stops near a specific location
     * 
     * @param latitude Geographic coordinate of latitude
     * @param longitude Geographic coordinate of longitude
     * @param routeTypes Filter by route_type; values returned via RouteTypes API
     * @param maxResults Maximum number of results returned (default &#x3D; 30)
     * @param maxDistance Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300)
     * @param stopDisruptions Indicates if stop disruption information will be returned (default &#x3D; false)
     * @param token Please ignore
     * @param devid Your developer id
     * @param signature Authentication signature for request
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public stopsStopsByGeolocation(latitude: number, longitude: number, routeTypes?: Array<number>, maxResults?: number, maxDistance?: number, stopDisruptions?: boolean, token?: string, devid?: string, signature?: string, observe?: 'body', reportProgress?: boolean): Observable<V3StopsByDistanceResponse>;
    public stopsStopsByGeolocation(latitude: number, longitude: number, routeTypes?: Array<number>, maxResults?: number, maxDistance?: number, stopDisruptions?: boolean, token?: string, devid?: string, signature?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<V3StopsByDistanceResponse>>;
    public stopsStopsByGeolocation(latitude: number, longitude: number, routeTypes?: Array<number>, maxResults?: number, maxDistance?: number, stopDisruptions?: boolean, token?: string, devid?: string, signature?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<V3StopsByDistanceResponse>>;
    public stopsStopsByGeolocation(latitude: number, longitude: number, routeTypes?: Array<number>, maxResults?: number, maxDistance?: number, stopDisruptions?: boolean, token?: string, devid?: string, signature?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (latitude === null || latitude === undefined) {
            throw new Error('Required parameter latitude was null or undefined when calling stopsStopsByGeolocation.');
        }

        if (longitude === null || longitude === undefined) {
            throw new Error('Required parameter longitude was null or undefined when calling stopsStopsByGeolocation.');
        }








        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (routeTypes) {
            routeTypes.forEach((element) => {
                queryParameters = queryParameters.append('route_types', <any>element);
            })
        }
        if (maxResults !== undefined && maxResults !== null) {
            queryParameters = queryParameters.set('max_results', <any>maxResults);
        }
        if (maxDistance !== undefined && maxDistance !== null) {
            queryParameters = queryParameters.set('max_distance', <any>maxDistance);
        }
        if (stopDisruptions !== undefined && stopDisruptions !== null) {
            queryParameters = queryParameters.set('stop_disruptions', <any>stopDisruptions);
        }
        if (token !== undefined && token !== null) {
            queryParameters = queryParameters.set('token', <any>token);
        }
        if (devid !== undefined && devid !== null) {
            queryParameters = queryParameters.set('devid', <any>devid);
        }
        if (signature !== undefined && signature !== null) {
            queryParameters = queryParameters.set('signature', <any>signature);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json',
            'text/json',
            'text/html'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<V3StopsByDistanceResponse>('get',`${this.basePath}/v3/stops/location/${encodeURIComponent(String(latitude))},${encodeURIComponent(String(longitude))}`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * View all stops on a specific route
     * 
     * @param routeId Identifier of route; values returned by Routes API - v3/routes
     * @param routeType Number identifying transport mode; values returned via RouteTypes API
     * @param directionId An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response.
     * @param stopDisruptions Indicates if stop disruption information will be returned (default &#x3D; false)
     * @param includeGeopath Indicates if geopath data will be returned (default &#x3D; false)
     * @param geopathUtc Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date)
     * @param token Please ignore
     * @param devid Your developer id
     * @param signature Authentication signature for request
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public stopsStopsForRoute(routeId: number, routeType: number, directionId?: number, stopDisruptions?: boolean, includeGeopath?: boolean, geopathUtc?: Date, token?: string, devid?: string, signature?: string, observe?: 'body', reportProgress?: boolean): Observable<V3StopsOnRouteResponse>;
    public stopsStopsForRoute(routeId: number, routeType: number, directionId?: number, stopDisruptions?: boolean, includeGeopath?: boolean, geopathUtc?: Date, token?: string, devid?: string, signature?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<V3StopsOnRouteResponse>>;
    public stopsStopsForRoute(routeId: number, routeType: number, directionId?: number, stopDisruptions?: boolean, includeGeopath?: boolean, geopathUtc?: Date, token?: string, devid?: string, signature?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<V3StopsOnRouteResponse>>;
    public stopsStopsForRoute(routeId: number, routeType: number, directionId?: number, stopDisruptions?: boolean, includeGeopath?: boolean, geopathUtc?: Date, token?: string, devid?: string, signature?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling stopsStopsForRoute.');
        }

        if (routeType === null || routeType === undefined) {
            throw new Error('Required parameter routeType was null or undefined when calling stopsStopsForRoute.');
        }








        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (directionId !== undefined && directionId !== null) {
            queryParameters = queryParameters.set('direction_id', <any>directionId);
        }
        if (stopDisruptions !== undefined && stopDisruptions !== null) {
            queryParameters = queryParameters.set('stop_disruptions', <any>stopDisruptions);
        }
        if (includeGeopath !== undefined && includeGeopath !== null) {
            queryParameters = queryParameters.set('include_geopath', <any>includeGeopath);
        }
        if (geopathUtc !== undefined && geopathUtc !== null) {
            queryParameters = queryParameters.set('geopath_utc', <any>geopathUtc.toISOString());
        }
        if (token !== undefined && token !== null) {
            queryParameters = queryParameters.set('token', <any>token);
        }
        if (devid !== undefined && devid !== null) {
            queryParameters = queryParameters.set('devid', <any>devid);
        }
        if (signature !== undefined && signature !== null) {
            queryParameters = queryParameters.set('signature', <any>signature);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json',
            'text/json',
            'text/html'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<V3StopsOnRouteResponse>('get',`${this.basePath}/v3/stops/route/${encodeURIComponent(String(routeId))}/route_type/${encodeURIComponent(String(routeType))}`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
