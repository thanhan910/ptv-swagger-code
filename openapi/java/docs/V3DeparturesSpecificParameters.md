

# V3DeparturesSpecificParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**directionId** | **Integer** | Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} |  [optional] |
|**gtfs** | **Boolean** | Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data |  [optional] |
|**dateUtc** | **OffsetDateTime** | Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) |  [optional] |
|**maxResults** | **Integer** | Maximum number of results returned |  [optional] |
|**includeCancelled** | **Boolean** | Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only |  [optional] |
|**lookBackwards** | **Boolean** | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. |  [optional] |
|**expand** | [**List&lt;ExpandEnum&gt;**](#List&lt;ExpandEnum&gt;) | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. |  [optional] |
|**includeGeopath** | **Boolean** | Indicates if the route geopath should be returned |  [optional] |



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



