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
  public class V3Direction {
    /// <summary>
    /// Direction of travel identifier
    /// </summary>
    /// <value>Direction of travel identifier</value>
    [DataMember(Name="direction_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "direction_id")]
    public int? DirectionId { get; set; }

    /// <summary>
    /// Name of direction of travel
    /// </summary>
    /// <value>Name of direction of travel</value>
    [DataMember(Name="direction_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "direction_name")]
    public string DirectionName { get; set; }

    /// <summary>
    /// Route identifier
    /// </summary>
    /// <value>Route identifier</value>
    [DataMember(Name="route_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_id")]
    public int? RouteId { get; set; }

    /// <summary>
    /// Transport mode identifier
    /// </summary>
    /// <value>Transport mode identifier</value>
    [DataMember(Name="route_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_type")]
    public int? RouteType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3Direction {\n");
      sb.Append("  DirectionId: ").Append(DirectionId).Append("\n");
      sb.Append("  DirectionName: ").Append(DirectionName).Append("\n");
      sb.Append("  RouteId: ").Append(RouteId).Append("\n");
      sb.Append("  RouteType: ").Append(RouteType).Append("\n");
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
