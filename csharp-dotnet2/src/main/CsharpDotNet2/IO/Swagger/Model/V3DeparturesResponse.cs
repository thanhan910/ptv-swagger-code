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
  public class V3DeparturesResponse {
    /// <summary>
    /// Timetabled and real-time service departures
    /// </summary>
    /// <value>Timetabled and real-time service departures</value>
    [DataMember(Name="departures", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "departures")]
    public List<V3Departure> Departures { get; set; }

    /// <summary>
    /// A train station, tram stop, bus stop, regional coach stop or Night Bus stop
    /// </summary>
    /// <value>A train station, tram stop, bus stop, regional coach stop or Night Bus stop</value>
    [DataMember(Name="stops", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stops")]
    public Dictionary<string, V3StopModel> Stops { get; set; }

    /// <summary>
    /// Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
    /// </summary>
    /// <value>Train lines, tram routes, bus routes, regional coach routes, Night Bus routes</value>
    [DataMember(Name="routes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "routes")]
    public Dictionary<string, Object> Routes { get; set; }

    /// <summary>
    /// Individual trips/services of a route
    /// </summary>
    /// <value>Individual trips/services of a route</value>
    [DataMember(Name="runs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "runs")]
    public Dictionary<string, V3Run> Runs { get; set; }

    /// <summary>
    /// Directions of travel of route
    /// </summary>
    /// <value>Directions of travel of route</value>
    [DataMember(Name="directions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "directions")]
    public Dictionary<string, V3Direction> Directions { get; set; }

    /// <summary>
    /// Disruption information applicable to relevant routes or stops
    /// </summary>
    /// <value>Disruption information applicable to relevant routes or stops</value>
    [DataMember(Name="disruptions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disruptions")]
    public Dictionary<string, V3Disruption> Disruptions { get; set; }

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
      sb.Append("class V3DeparturesResponse {\n");
      sb.Append("  Departures: ").Append(Departures).Append("\n");
      sb.Append("  Stops: ").Append(Stops).Append("\n");
      sb.Append("  Routes: ").Append(Routes).Append("\n");
      sb.Append("  Runs: ").Append(Runs).Append("\n");
      sb.Append("  Directions: ").Append(Directions).Append("\n");
      sb.Append("  Disruptions: ").Append(Disruptions).Append("\n");
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
