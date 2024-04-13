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
  public class V3StopDepartureRequestRouteDirection {
    /// <summary>
    /// Identifier of route; values returned by Routes API - v3/routes
    /// </summary>
    /// <value>Identifier of route; values returned by Routes API - v3/routes</value>
    [DataMember(Name="route_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_id")]
    public string RouteId { get; set; }

    /// <summary>
    /// Direction of travel identifier; values returned by Directions API - v3/directions
    /// </summary>
    /// <value>Direction of travel identifier; values returned by Directions API - v3/directions</value>
    [DataMember(Name="direction_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "direction_id")]
    public int? DirectionId { get; set; }

    /// <summary>
    /// Name of direction of travel; values returned by Directions API - v3/directions
    /// </summary>
    /// <value>Name of direction of travel; values returned by Directions API - v3/directions</value>
    [DataMember(Name="direction_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "direction_name")]
    public string DirectionName { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3StopDepartureRequestRouteDirection {\n");
      sb.Append("  RouteId: ").Append(RouteId).Append("\n");
      sb.Append("  DirectionId: ").Append(DirectionId).Append("\n");
      sb.Append("  DirectionName: ").Append(DirectionName).Append("\n");
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
