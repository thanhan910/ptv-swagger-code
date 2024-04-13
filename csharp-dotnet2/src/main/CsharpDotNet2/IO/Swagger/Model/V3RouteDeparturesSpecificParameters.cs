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
  public class V3RouteDeparturesSpecificParameters {
    /// <summary>
    /// DEPRECATED - use `scheduled_timetables` instead
    /// </summary>
    /// <value>DEPRECATED - use `scheduled_timetables` instead</value>
    [DataMember(Name="train_scheduled_timetables", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "train_scheduled_timetables")]
    public bool? TrainScheduledTimetables { get; set; }

    /// <summary>
    /// When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available.
    /// </summary>
    /// <value>When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available.</value>
    [DataMember(Name="scheduled_timetables", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduled_timetables")]
    public bool? ScheduledTimetables { get; set; }

    /// <summary>
    /// Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
    /// </summary>
    /// <value>Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)</value>
    [DataMember(Name="date_utc", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date_utc")]
    public DateTime? DateUtc { get; set; }

    /// <summary>
    /// Maximum number of results returned
    /// </summary>
    /// <value>Maximum number of results returned</value>
    [DataMember(Name="max_results", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "max_results")]
    public int? MaxResults { get; set; }

    /// <summary>
    /// Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
    /// </summary>
    /// <value>Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only</value>
    [DataMember(Name="include_cancelled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "include_cancelled")]
    public bool? IncludeCancelled { get; set; }

    /// <summary>
    /// Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
    /// </summary>
    /// <value>Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.</value>
    [DataMember(Name="look_backwards", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "look_backwards")]
    public bool? LookBackwards { get; set; }

    /// <summary>
    /// List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
    /// </summary>
    /// <value>List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.</value>
    [DataMember(Name="expand", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "expand")]
    public List<string> Expand { get; set; }

    /// <summary>
    /// Indicates if the route geopath should be returned
    /// </summary>
    /// <value>Indicates if the route geopath should be returned</value>
    [DataMember(Name="include_geopath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "include_geopath")]
    public bool? IncludeGeopath { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3RouteDeparturesSpecificParameters {\n");
      sb.Append("  TrainScheduledTimetables: ").Append(TrainScheduledTimetables).Append("\n");
      sb.Append("  ScheduledTimetables: ").Append(ScheduledTimetables).Append("\n");
      sb.Append("  DateUtc: ").Append(DateUtc).Append("\n");
      sb.Append("  MaxResults: ").Append(MaxResults).Append("\n");
      sb.Append("  IncludeCancelled: ").Append(IncludeCancelled).Append("\n");
      sb.Append("  LookBackwards: ").Append(LookBackwards).Append("\n");
      sb.Append("  Expand: ").Append(Expand).Append("\n");
      sb.Append("  IncludeGeopath: ").Append(IncludeGeopath).Append("\n");
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
