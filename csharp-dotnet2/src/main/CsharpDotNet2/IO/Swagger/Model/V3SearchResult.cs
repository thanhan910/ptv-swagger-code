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
  public class V3SearchResult {
    /// <summary>
    /// Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
    /// </summary>
    /// <value>Train stations, tram stops, bus stops, regional coach stops or Night Bus stops</value>
    [DataMember(Name="stops", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stops")]
    public List<V3ResultStop> Stops { get; set; }

    /// <summary>
    /// Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
    /// </summary>
    /// <value>Train lines, tram routes, bus routes, regional coach routes, Night Bus routes</value>
    [DataMember(Name="routes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "routes")]
    public List<V3ResultRoute> Routes { get; set; }

    /// <summary>
    /// myki ticket outlets
    /// </summary>
    /// <value>myki ticket outlets</value>
    [DataMember(Name="outlets", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlets")]
    public List<V3ResultOutlet> Outlets { get; set; }

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
      sb.Append("class V3SearchResult {\n");
      sb.Append("  Stops: ").Append(Stops).Append("\n");
      sb.Append("  Routes: ").Append(Routes).Append("\n");
      sb.Append("  Outlets: ").Append(Outlets).Append("\n");
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
