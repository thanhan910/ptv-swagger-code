# Ptv.Api.Client.Model.V3VehicleDescriptor

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operator** | **string** | Operator name of the vehicle such as \&quot;Metro Trains Melbourne\&quot;, \&quot;Yarra Trams\&quot;, \&quot;Ventura Bus Line\&quot;, \&quot;CDC\&quot; or \&quot;Sita Bus Lines\&quot; . May be null/empty.  Only available for train, tram, v/line and some bus runs. | [optional] 
**Id** | **string** | Operator identifier of the vehicle such as \&quot;26094\&quot;. May be null/empty. Only available for some tram and bus runs. | [optional] 
**LowFloor** | **bool** | Indicator if vehicle has a low floor. May be null. Only available for some tram runs. | [optional] 
**AirConditioned** | **bool** | Indicator if vehicle is air conditioned. May be null. Only available for some tram runs. | [optional] 
**Description** | **string** | Vehicle description such as \&quot;6 Car Comeng\&quot;, \&quot;6 Car Xtrapolis\&quot;, \&quot;3 Car Comeng\&quot;, \&quot;6 Car Siemens\&quot;, \&quot;3 Car Siemens\&quot;. May be null/empty.  Only available for some metropolitan train runs. | [optional] 
**Supplier** | **string** | Supplier of vehicle descriptor data. | [optional] 
**Length** | **string** | The length of the vehicle. Applies to CIS - Metro Trains | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

