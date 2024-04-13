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
  public class V3StopsOnRouteResponse {
    /// <summary>
    /// Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
    /// </summary>
    /// <value>Train stations, tram stops, bus stops, regional coach stops or Night Bus stops</value>
    [DataMember(Name="stops", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stops")]
    public List<V3StopOnRoute> Stops { get; set; }

    /// <summary>
    /// Disruption information applicable to relevant routes or stops
    /// </summary>
    /// <value>Disruption information applicable to relevant routes or stops</value>
    [DataMember(Name="disruptions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disruptions")]
    public Dictionary<string, V3Disruption> Disruptions { get; set; }

    /// <summary>
    /// GeoPath for the route
    /// </summary>
    /// <value>GeoPath for the route</value>
    [DataMember(Name="geopath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "geopath")]
    public List<Object> Geopath { get; set; }

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
      sb.Append("class V3StopsOnRouteResponse {\n");
      sb.Append("  Stops: ").Append(Stops).Append("\n");
      sb.Append("  Disruptions: ").Append(Disruptions).Append("\n");
      sb.Append("  Geopath: ").Append(Geopath).Append("\n");
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
