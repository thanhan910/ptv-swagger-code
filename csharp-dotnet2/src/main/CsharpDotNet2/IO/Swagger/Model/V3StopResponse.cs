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
  public class V3StopResponse {
    /// <summary>
    /// Gets or Sets Stop
    /// </summary>
    [DataMember(Name="stop", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop")]
    public V3StopDetails Stop { get; set; }

    /// <summary>
    /// Disruption information applicable to relevant routes or stops
    /// </summary>
    /// <value>Disruption information applicable to relevant routes or stops</value>
    [DataMember(Name="disruptions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disruptions")]
    public Dictionary<string, V3Disruption> Disruptions { get; set; }

    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public V3Status Status { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3StopResponse {\n");
      sb.Append("  Stop: ").Append(Stop).Append("\n");
      sb.Append("  Disruptions: ").Append(Disruptions).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
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
