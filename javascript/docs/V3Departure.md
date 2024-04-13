# PtvTimetableApiVersion3.V3Departure

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stopId** | **Number** | Stop identifier | [optional] 
**routeId** | **Number** | Route identifier | [optional] 
**runId** | **Number** | Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric | [optional] 
**runRef** | **String** | Alphanumeric trip/service run identifier | [optional] 
**directionId** | **Number** | Direction of travel identifier | [optional] 
**disruptionIds** | **[Number]** | Disruption information identifier(s) | [optional] 
**scheduledDepartureUtc** | **Date** | Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format | [optional] 
**estimatedDepartureUtc** | **Date** | Real-time estimate of departure time and date in ISO 8601 UTC format | [optional] 
**atPlatform** | **Boolean** | Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes | [optional] 
**platformNumber** | **String** | Platform number at stop (metropolitan train only; returns null for other modes) | [optional] 
**flags** | **String** | Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag) | [optional] 
**departureSequence** | **Number** | Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4 | [optional] 
