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
  public class V3Status {
    /// <summary>
    /// API Version number
    /// </summary>
    /// <value>API Version number</value>
    [DataMember(Name="version", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "version")]
    public string Version { get; set; }

    /// <summary>
    /// API system health status (0=offline, 1=online)
    /// </summary>
    /// <value>API system health status (0=offline, 1=online)</value>
    [DataMember(Name="health", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "health")]
    public int? Health { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3Status {\n");
      sb.Append("  Version: ").Append(Version).Append("\n");
      sb.Append("  Health: ").Append(Health).Append("\n");
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
