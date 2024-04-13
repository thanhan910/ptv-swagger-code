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
  public class V3BulkDeparturesStopResponse {
    /// <summary>
    /// Name of stop
    /// </summary>
    /// <value>Name of stop</value>
    [DataMember(Name="stop_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_name")]
    public string StopName { get; set; }

    /// <summary>
    /// Stop identifier
    /// </summary>
    /// <value>Stop identifier</value>
    [DataMember(Name="stop_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_id")]
    public int? StopId { get; set; }

    /// <summary>
    /// Geographic coordinate of latitude at stop
    /// </summary>
    /// <value>Geographic coordinate of latitude at stop</value>
    [DataMember(Name="stop_latitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_latitude")]
    public float? StopLatitude { get; set; }

    /// <summary>
    /// Geographic coordinate of longitude at stop
    /// </summary>
    /// <value>Geographic coordinate of longitude at stop</value>
    [DataMember(Name="stop_longitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_longitude")]
    public float? StopLongitude { get; set; }

    /// <summary>
    /// suburb of stop
    /// </summary>
    /// <value>suburb of stop</value>
    [DataMember(Name="stop_suburb", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_suburb")]
    public string StopSuburb { get; set; }

    /// <summary>
    /// Landmark in proximity of stop
    /// </summary>
    /// <value>Landmark in proximity of stop</value>
    [DataMember(Name="stop_landmark", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_landmark")]
    public string StopLandmark { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3BulkDeparturesStopResponse {\n");
      sb.Append("  StopName: ").Append(StopName).Append("\n");
      sb.Append("  StopId: ").Append(StopId).Append("\n");
      sb.Append("  StopLatitude: ").Append(StopLatitude).Append("\n");
      sb.Append("  StopLongitude: ").Append(StopLongitude).Append("\n");
      sb.Append("  StopSuburb: ").Append(StopSuburb).Append("\n");
      sb.Append("  StopLandmark: ").Append(StopLandmark).Append("\n");
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
