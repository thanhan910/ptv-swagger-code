

# V3StopDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**disruptionIds** | **List&lt;Long&gt;** | Disruption information identifier(s) |  [optional] |
|**stationType** | **String** | Type of metropolitan train station (i.e. \&quot;Premium\&quot;, \&quot;Host\&quot; or \&quot;Unstaffed\&quot; station); returns null for V/Line train |  [optional] |
|**stationDescription** | **String** | The definition applicable to the station_type; returns null for V/Line train |  [optional] |
|**routeType** | **Integer** | Transport mode identifier |  [optional] |
|**stopLocation** | [**V3StopLocation**](V3StopLocation.md) |  |  [optional] |
|**stopAmenities** | [**V3StopAmenityDetails**](V3StopAmenityDetails.md) |  |  [optional] |
|**stopAccessibility** | [**V3StopAccessibility**](V3StopAccessibility.md) |  |  [optional] |
|**stopStaffing** | [**V3StopStaffing**](V3StopStaffing.md) |  |  [optional] |
|**routes** | **List&lt;Object&gt;** | Routes travelling through the stop |  [optional] |
|**stopId** | **Integer** | Stop identifier |  [optional] |
|**stopName** | **String** | Name of stop |  [optional] |
|**stopLandmark** | **String** | Landmark in proximity of stop |  [optional] |



