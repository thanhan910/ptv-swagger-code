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
  public class V3SiriLineRef {
    /// <summary>
    /// Siri LineRef
    /// </summary>
    /// <value>Siri LineRef</value>
    [DataMember(Name="line_ref", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "line_ref")]
    public string LineRef { get; set; }

    /// <summary>
    /// Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
    /// </summary>
    /// <value>Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)</value>
    [DataMember(Name="direction_ref", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "direction_ref")]
    public int? DirectionRef { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3SiriLineRef {\n");
      sb.Append("  LineRef: ").Append(LineRef).Append("\n");
      sb.Append("  DirectionRef: ").Append(DirectionRef).Append("\n");
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
