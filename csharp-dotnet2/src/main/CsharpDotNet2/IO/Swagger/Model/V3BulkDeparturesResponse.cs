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
  public class V3BulkDeparturesResponse {
    /// <summary>
    /// Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid.
    /// </summary>
    /// <value>Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid.</value>
    [DataMember(Name="responses", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "responses")]
    public List<V3BulkDeparturesUpdateResponse> Responses { get; set; }

    /// <summary>
    /// A train station, tram stop, bus stop, regional coach stop or Night Bus stop
    /// </summary>
    /// <value>A train station, tram stop, bus stop, regional coach stop or Night Bus stop</value>
    [DataMember(Name="stops", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stops")]
    public Dictionary<string, V3BulkDeparturesStopResponse> Stops { get; set; }

    /// <summary>
    /// Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
    /// </summary>
    /// <value>Train lines, tram routes, bus routes, regional coach routes, Night Bus routes</value>
    [DataMember(Name="routes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "routes")]
    public List<Object> Routes { get; set; }

    /// <summary>
    /// Individual trips/services of a route
    /// </summary>
    /// <value>Individual trips/services of a route</value>
    [DataMember(Name="runs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "runs")]
    public List<V3Run> Runs { get; set; }

    /// <summary>
    /// Directions of travel of route
    /// </summary>
    /// <value>Directions of travel of route</value>
    [DataMember(Name="directions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "directions")]
    public List<V3Direction> Directions { get; set; }

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
      sb.Append("class V3BulkDeparturesResponse {\n");
      sb.Append("  Responses: ").Append(Responses).Append("\n");
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
