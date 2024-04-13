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
  public class V3SiriReferenceDataDetail {
    /// <summary>
    /// Gets or Sets RouteId
    /// </summary>
    [DataMember(Name="route_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_id")]
    public int? RouteId { get; set; }

    /// <summary>
    /// Route number
    /// </summary>
    /// <value>Route number</value>
    [DataMember(Name="route_number_short", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_number_short")]
    public string RouteNumberShort { get; set; }

    /// <summary>
    /// Gets or Sets DirectionId
    /// </summary>
    [DataMember(Name="direction_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "direction_id")]
    public int? DirectionId { get; set; }

    /// <summary>
    /// Authority (Upstream SIRI provider) of a route and direction
    /// </summary>
    /// <value>Authority (Upstream SIRI provider) of a route and direction</value>
    [DataMember(Name="tracking_supplier_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tracking_supplier_id")]
    public int? TrackingSupplierId { get; set; }

    /// <summary>
    /// Gets or Sets RouteType
    /// </summary>
    [DataMember(Name="route_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_type")]
    public int? RouteType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3SiriReferenceDataDetail {\n");
      sb.Append("  RouteId: ").Append(RouteId).Append("\n");
      sb.Append("  RouteNumberShort: ").Append(RouteNumberShort).Append("\n");
      sb.Append("  DirectionId: ").Append(DirectionId).Append("\n");
      sb.Append("  TrackingSupplierId: ").Append(TrackingSupplierId).Append("\n");
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
