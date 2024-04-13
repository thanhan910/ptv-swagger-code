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
  public class V3SiriLineRefDirectionRefsDictionary {
    /// <summary>
    /// Gets or Sets DirectionRefs
    /// </summary>
    [DataMember(Name="direction_refs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "direction_refs")]
    public Dictionary<string, List<V3SiriReferenceDataDetail>> DirectionRefs { get; set; }

    /// <summary>
    /// Gets or Sets UnmatchedDirectionRefs
    /// </summary>
    [DataMember(Name="unmatched_direction_refs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "unmatched_direction_refs")]
    public Dictionary<string, string> UnmatchedDirectionRefs { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3SiriLineRefDirectionRefsDictionary {\n");
      sb.Append("  DirectionRefs: ").Append(DirectionRefs).Append("\n");
      sb.Append("  UnmatchedDirectionRefs: ").Append(UnmatchedDirectionRefs).Append("\n");
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
