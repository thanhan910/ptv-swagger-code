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
  public class V3OutletGeolocationParameters {
    /// <summary>
    /// Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)
    /// </summary>
    /// <value>Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)</value>
    [DataMember(Name="max_distance", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "max_distance")]
    public double? MaxDistance { get; set; }

    /// <summary>
    /// Maximum number of results returned (default = 30)
    /// </summary>
    /// <value>Maximum number of results returned (default = 30)</value>
    [DataMember(Name="max_results", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "max_results")]
    public int? MaxResults { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3OutletGeolocationParameters {\n");
      sb.Append("  MaxDistance: ").Append(MaxDistance).Append("\n");
      sb.Append("  MaxResults: ").Append(MaxResults).Append("\n");
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
