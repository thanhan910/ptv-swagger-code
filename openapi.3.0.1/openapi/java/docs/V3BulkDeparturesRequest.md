

# V3BulkDeparturesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requests** | [**List&lt;V3StopDepartureRequest&gt;**](V3StopDepartureRequest.md) | Collection of departure requests |  |
|**dateUtc** | **OffsetDateTime** | Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) |  [optional] |
|**lookBackwards** | **Boolean** | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. |  [optional] |
|**includeCancelled** | **Boolean** | Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only |  [optional] |
|**includeGeopath** | **Boolean** | Indicates if the route geopath should be returned |  [optional] |
|**expand** | [**List&lt;ExpandEnum&gt;**](#List&lt;ExpandEnum&gt;) | List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none |  [optional] |



## Enum: List&lt;ExpandEnum&gt;

| Name | Value |
|---- | -----|
| ALL | &quot;All&quot; |
| STOP | &quot;Stop&quot; |
| ROUTE | &quot;Route&quot; |
| RUN | &quot;Run&quot; |
| DIRECTION | &quot;Direction&quot; |
| DISRUPTION | &quot;Disruption&quot; |
| VEHICLEDESCRIPTOR | &quot;VehicleDescriptor&quot; |
| VEHICLEPOSITION | &quot;VehiclePosition&quot; |
| NONE | &quot;None&quot; |



