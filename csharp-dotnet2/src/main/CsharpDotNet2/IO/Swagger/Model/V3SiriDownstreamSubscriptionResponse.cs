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
  public class V3SiriDownstreamSubscriptionResponse {
    /// <summary>
    /// The Data Horizon of Chronos
    /// </summary>
    /// <value>The Data Horizon of Chronos</value>
    [DataMember(Name="valid_until", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "valid_until")]
    public DateTime? ValidUntil { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3SiriDownstreamSubscriptionResponse {\n");
      sb.Append("  ValidUntil: ").Append(ValidUntil).Append("\n");
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
