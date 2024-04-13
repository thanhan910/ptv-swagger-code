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
  public class V3SiriStopsRefsDictionary {
    /// <summary>
    /// Gets or Sets StopPointRefs
    /// </summary>
    [DataMember(Name="stop_point_refs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_point_refs")]
    public Dictionary<string, V3SiriReferenceDataDetail> StopPointRefs { get; set; }

    /// <summary>
    /// Gets or Sets UnmatchedStopPointRefs
    /// </summary>
    [DataMember(Name="unmatched_stop_point_refs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "unmatched_stop_point_refs")]
    public Dictionary<string, string> UnmatchedStopPointRefs { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3SiriStopsRefsDictionary {\n");
      sb.Append("  StopPointRefs: ").Append(StopPointRefs).Append("\n");
      sb.Append("  UnmatchedStopPointRefs: ").Append(UnmatchedStopPointRefs).Append("\n");
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
