# V3PatternDeparture

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**skippedStops** | [**List&lt;V3StopModel&gt;**](V3StopModel.md) | The stops to be skipped following the current departure in order. |  [optional]
**stopId** | **Integer** | Stop identifier |  [optional]
**routeId** | **Integer** | Route identifier |  [optional]
**runId** | **Integer** | Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric |  [optional]
**runRef** | **String** | Alphanumeric trip/service run identifier |  [optional]
**directionId** | **Integer** | Direction of travel identifier |  [optional]
**disruptionIds** | **List&lt;Long&gt;** | Disruption information identifier(s) |  [optional]
**scheduledDepartureUtc** | [**OffsetDateTime**](OffsetDateTime.md) | Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format |  [optional]
**estimatedDepartureUtc** | [**OffsetDateTime**](OffsetDateTime.md) | Real-time estimate of departure time and date in ISO 8601 UTC format |  [optional]
**atPlatform** | **Boolean** | Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes |  [optional]
**platformNumber** | **String** | Platform number at stop (metropolitan train only; returns null for other modes) |  [optional]
**flags** | **String** | Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag) |  [optional]
**departureSequence** | **Integer** | Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4 |  [optional]
