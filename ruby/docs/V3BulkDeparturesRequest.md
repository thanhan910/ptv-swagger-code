# SwaggerClient::V3BulkDeparturesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**Array&lt;V3StopDepartureRequest&gt;**](V3StopDepartureRequest.md) | Collection of departure requests | 
**date_utc** | **DateTime** | Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] 
**look_backwards** | **BOOLEAN** | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] 
**include_cancelled** | **BOOLEAN** | Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] 
**include_geopath** | **BOOLEAN** | Indicates if the route geopath should be returned | [optional] 
**expand** | **Array&lt;String&gt;** | List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none | [optional] 

