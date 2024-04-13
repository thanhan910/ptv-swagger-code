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
  public class V3FareEstimateResultStatus {
    /// <summary>
    /// Gets or Sets StatusCode
    /// </summary>
    [DataMember(Name="StatusCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "StatusCode")]
    public int? StatusCode { get; set; }

    /// <summary>
    /// Gets or Sets Message
    /// </summary>
    [DataMember(Name="Message", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Message")]
    public string Message { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3FareEstimateResultStatus {\n");
      sb.Append("  StatusCode: ").Append(StatusCode).Append("\n");
      sb.Append("  Message: ").Append(Message).Append("\n");
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
