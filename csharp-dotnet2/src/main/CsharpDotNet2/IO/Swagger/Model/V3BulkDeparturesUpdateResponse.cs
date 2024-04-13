using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class V3BulkDeparturesUpdateResponse {
    /// <summary>
    /// Timetabled and real-time service departures
    /// </summary>
    /// <value>Timetabled and real-time service departures</value>
    [DataMember(Name="departures", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "departures")]
    public List<V3Departure> Departures { get; set; }

    /// <summary>
    /// Transport mode identifier
    /// </summary>
    /// <value>Transport mode identifier</value>
    [DataMember(Name="route_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_type")]
    public int? RouteType { get; set; }

    /// <summary>
    /// Stop identifier
    /// </summary>
    /// <value>Stop identifier</value>
    [DataMember(Name="stop_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_id")]
    public int? StopId { get; set; }

    /// <summary>
    /// Gets or Sets RequestedRouteDirection
    /// </summary>
    [DataMember(Name="requested_route_direction", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "requested_route_direction")]
    public V3BulkDeparturesRouteDirectionResponse RequestedRouteDirection { get; set; }

    /// <summary>
    /// The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied.
    /// </summary>
    /// <value>The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied.</value>
    [DataMember(Name="route_direction_status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_direction_status")]
    public int? RouteDirectionStatus { get; set; }

    /// <summary>
    /// Gets or Sets RouteDirection
    /// </summary>
    [DataMember(Name="route_direction", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_direction")]
    public V3BulkDeparturesRouteDirectionResponse RouteDirection { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3BulkDeparturesUpdateResponse {\n");
      sb.Append("  Departures: ").Append(Departures).Append("\n");
      sb.Append("  RouteType: ").Append(RouteType).Append("\n");
      sb.Append("  StopId: ").Append(StopId).Append("\n");
      sb.Append("  RequestedRouteDirection: ").Append(RequestedRouteDirection).Append("\n");
      sb.Append("  RouteDirectionStatus: ").Append(RouteDirectionStatus).Append("\n");
      sb.Append("  RouteDirection: ").Append(RouteDirection).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
