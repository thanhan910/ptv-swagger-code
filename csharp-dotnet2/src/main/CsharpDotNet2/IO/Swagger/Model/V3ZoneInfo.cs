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
  public class V3ZoneInfo {
    /// <summary>
    /// Gets or Sets MinZone
    /// </summary>
    [DataMember(Name="MinZone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "MinZone")]
    public int? MinZone { get; set; }

    /// <summary>
    /// Gets or Sets MaxZone
    /// </summary>
    [DataMember(Name="MaxZone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "MaxZone")]
    public int? MaxZone { get; set; }

    /// <summary>
    /// Gets or Sets UniqueZones
    /// </summary>
    [DataMember(Name="UniqueZones", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "UniqueZones")]
    public List<int?> UniqueZones { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3ZoneInfo {\n");
      sb.Append("  MinZone: ").Append(MinZone).Append("\n");
      sb.Append("  MaxZone: ").Append(MaxZone).Append("\n");
      sb.Append("  UniqueZones: ").Append(UniqueZones).Append("\n");
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
