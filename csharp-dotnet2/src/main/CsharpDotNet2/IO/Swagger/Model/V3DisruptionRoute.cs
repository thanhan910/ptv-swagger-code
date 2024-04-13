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
  public class V3DisruptionRoute {
    /// <summary>
    /// Transport mode identifier
    /// </summary>
    /// <value>Transport mode identifier</value>
    [DataMember(Name="route_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_type")]
    public int? RouteType { get; set; }

    /// <summary>
    /// Route identifier
    /// </summary>
    /// <value>Route identifier</value>
    [DataMember(Name="route_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_id")]
    public int? RouteId { get; set; }

    /// <summary>
    /// Name of route
    /// </summary>
    /// <value>Name of route</value>
    [DataMember(Name="route_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_name")]
    public string RouteName { get; set; }

    /// <summary>
    /// Route number presented to public (i.e. not route_id)
    /// </summary>
    /// <value>Route number presented to public (i.e. not route_id)</value>
    [DataMember(Name="route_number", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_number")]
    public string RouteNumber { get; set; }

    /// <summary>
    /// GTFS Identifer of the route
    /// </summary>
    /// <value>GTFS Identifer of the route</value>
    [DataMember(Name="route_gtfs_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_gtfs_id")]
    public string RouteGtfsId { get; set; }

    /// <summary>
    /// Gets or Sets Direction
    /// </summary>
    [DataMember(Name="direction", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "direction")]
    public V3DisruptionDirection Direction { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3DisruptionRoute {\n");
      sb.Append("  RouteType: ").Append(RouteType).Append("\n");
      sb.Append("  RouteId: ").Append(RouteId).Append("\n");
      sb.Append("  RouteName: ").Append(RouteName).Append("\n");
      sb.Append("  RouteNumber: ").Append(RouteNumber).Append("\n");
      sb.Append("  RouteGtfsId: ").Append(RouteGtfsId).Append("\n");
      sb.Append("  Direction: ").Append(Direction).Append("\n");
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
