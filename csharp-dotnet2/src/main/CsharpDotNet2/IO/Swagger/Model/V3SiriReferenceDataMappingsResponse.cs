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
  public class V3SiriReferenceDataMappingsResponse {
    /// <summary>
    /// Gets or Sets MappingVersion
    /// </summary>
    [DataMember(Name="mapping_version", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mapping_version")]
    public string MappingVersion { get; set; }

    /// <summary>
    /// SIRI LineRef
    /// </summary>
    /// <value>SIRI LineRef</value>
    [DataMember(Name="line_refs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "line_refs")]
    public Dictionary<string, V3SiriDirectionRefsDictionary> LineRefs { get; set; }

    /// <summary>
    /// Gets or Sets StopPointRefs
    /// </summary>
    [DataMember(Name="stop_point_refs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_point_refs")]
    public Dictionary<string, V3StopPoint> StopPointRefs { get; set; }

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
      sb.Append("class V3SiriReferenceDataMappingsResponse {\n");
      sb.Append("  MappingVersion: ").Append(MappingVersion).Append("\n");
      sb.Append("  LineRefs: ").Append(LineRefs).Append("\n");
      sb.Append("  StopPointRefs: ").Append(StopPointRefs).Append("\n");
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
