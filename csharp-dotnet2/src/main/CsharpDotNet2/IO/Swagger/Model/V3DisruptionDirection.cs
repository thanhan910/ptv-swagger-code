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
  public class V3DisruptionDirection {
    /// <summary>
    /// Route and direction of travel combination identifier
    /// </summary>
    /// <value>Route and direction of travel combination identifier</value>
    [DataMember(Name="route_direction_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_direction_id")]
    public int? RouteDirectionId { get; set; }

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
    /// Time of service to which disruption applies, in 24 hour clock format (HH:MM:SS) AEDT/AEST; returns null if disruption applies to multiple (or no) services
    /// </summary>
    /// <value>Time of service to which disruption applies, in 24 hour clock format (HH:MM:SS) AEDT/AEST; returns null if disruption applies to multiple (or no) services</value>
    [DataMember(Name="service_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service_time")]
    public string ServiceTime { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3DisruptionDirection {\n");
      sb.Append("  RouteDirectionId: ").Append(RouteDirectionId).Append("\n");
      sb.Append("  DirectionId: ").Append(DirectionId).Append("\n");
      sb.Append("  DirectionName: ").Append(DirectionName).Append("\n");
      sb.Append("  ServiceTime: ").Append(ServiceTime).Append("\n");
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
