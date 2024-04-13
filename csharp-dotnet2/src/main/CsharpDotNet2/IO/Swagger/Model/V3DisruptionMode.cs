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
  public class V3DisruptionMode {
    /// <summary>
    /// Name of disruption mode
    /// </summary>
    /// <value>Name of disruption mode</value>
    [DataMember(Name="disruption_mode_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disruption_mode_name")]
    public string DisruptionModeName { get; set; }

    /// <summary>
    /// Disruption mode identifier
    /// </summary>
    /// <value>Disruption mode identifier</value>
    [DataMember(Name="disruption_mode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disruption_mode")]
    public int? DisruptionMode { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3DisruptionMode {\n");
      sb.Append("  DisruptionModeName: ").Append(DisruptionModeName).Append("\n");
      sb.Append("  DisruptionMode: ").Append(DisruptionMode).Append("\n");
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
