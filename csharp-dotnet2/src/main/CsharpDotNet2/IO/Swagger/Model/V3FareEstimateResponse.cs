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
  public class V3FareEstimateResponse {
    /// <summary>
    /// Gets or Sets FareEstimateResultStatus
    /// </summary>
    [DataMember(Name="FareEstimateResultStatus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "FareEstimateResultStatus")]
    public V3FareEstimateResultStatus FareEstimateResultStatus { get; set; }

    /// <summary>
    /// Gets or Sets FareEstimateResult
    /// </summary>
    [DataMember(Name="FareEstimateResult", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "FareEstimateResult")]
    public V3FareEstimateResult FareEstimateResult { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3FareEstimateResponse {\n");
      sb.Append("  FareEstimateResultStatus: ").Append(FareEstimateResultStatus).Append("\n");
      sb.Append("  FareEstimateResult: ").Append(FareEstimateResult).Append("\n");
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
