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
  public class V3BulkDeparturesRequest {
    /// <summary>
    /// Collection of departure requests
    /// </summary>
    /// <value>Collection of departure requests</value>
    [DataMember(Name="requests", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "requests")]
    public List<V3StopDepartureRequest> Requests { get; set; }

    /// <summary>
    /// Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
    /// </summary>
    /// <value>Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)</value>
    [DataMember(Name="date_utc", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date_utc")]
    public DateTime? DateUtc { get; set; }

    /// <summary>
    /// Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
    /// </summary>
    /// <value>Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.</value>
    [DataMember(Name="look_backwards", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "look_backwards")]
    public bool? LookBackwards { get; set; }

    /// <summary>
    /// Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
    /// </summary>
    /// <value>Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only</value>
    [DataMember(Name="include_cancelled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "include_cancelled")]
    public bool? IncludeCancelled { get; set; }

    /// <summary>
    /// Indicates if the route geopath should be returned
    /// </summary>
    /// <value>Indicates if the route geopath should be returned</value>
    [DataMember(Name="include_geopath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "include_geopath")]
    public bool? IncludeGeopath { get; set; }

    /// <summary>
    /// List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none
    /// </summary>
    /// <value>List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none</value>
    [DataMember(Name="expand", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "expand")]
    public List<string> Expand { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3BulkDeparturesRequest {\n");
      sb.Append("  Requests: ").Append(Requests).Append("\n");
      sb.Append("  DateUtc: ").Append(DateUtc).Append("\n");
      sb.Append("  LookBackwards: ").Append(LookBackwards).Append("\n");
      sb.Append("  IncludeCancelled: ").Append(IncludeCancelled).Append("\n");
      sb.Append("  IncludeGeopath: ").Append(IncludeGeopath).Append("\n");
      sb.Append("  Expand: ").Append(Expand).Append("\n");
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
