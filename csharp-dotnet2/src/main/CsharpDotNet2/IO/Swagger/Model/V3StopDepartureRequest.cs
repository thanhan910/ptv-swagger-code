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
  public class V3StopDepartureRequest {
    /// <summary>
    /// Number identifying transport mode; values returned via RouteTypes API
    /// </summary>
    /// <value>Number identifying transport mode; values returned via RouteTypes API</value>
    [DataMember(Name="route_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_type")]
    public int? RouteType { get; set; }

    /// <summary>
    /// Identifier of stop; values returned by Stops API
    /// </summary>
    /// <value>Identifier of stop; values returned by Stops API</value>
    [DataMember(Name="stop_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_id")]
    public int? StopId { get; set; }

    /// <summary>
    /// Maximum number of results returned
    /// </summary>
    /// <value>Maximum number of results returned</value>
    [DataMember(Name="max_results", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "max_results")]
    public int? MaxResults { get; set; }

    /// <summary>
    /// Indicates that stop_id parameter will accept \"GTFS stop_id\" data and route_directions[x].route_id parameters will accept route_gtfs_id data
    /// </summary>
    /// <value>Indicates that stop_id parameter will accept \"GTFS stop_id\" data and route_directions[x].route_id parameters will accept route_gtfs_id data</value>
    [DataMember(Name="gtfs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "gtfs")]
    public bool? Gtfs { get; set; }

    /// <summary>
    /// The route directions to find departures for at this stop.
    /// </summary>
    /// <value>The route directions to find departures for at this stop.</value>
    [DataMember(Name="route_directions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_directions")]
    public List<V3StopDepartureRequestRouteDirection> RouteDirections { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3StopDepartureRequest {\n");
      sb.Append("  RouteType: ").Append(RouteType).Append("\n");
      sb.Append("  StopId: ").Append(StopId).Append("\n");
      sb.Append("  MaxResults: ").Append(MaxResults).Append("\n");
      sb.Append("  Gtfs: ").Append(Gtfs).Append("\n");
      sb.Append("  RouteDirections: ").Append(RouteDirections).Append("\n");
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
