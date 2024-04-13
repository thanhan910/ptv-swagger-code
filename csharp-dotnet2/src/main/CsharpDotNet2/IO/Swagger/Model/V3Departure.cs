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
  public class V3Departure {
    /// <summary>
    /// Stop identifier
    /// </summary>
    /// <value>Stop identifier</value>
    [DataMember(Name="stop_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_id")]
    public int? StopId { get; set; }

    /// <summary>
    /// Route identifier
    /// </summary>
    /// <value>Route identifier</value>
    [DataMember(Name="route_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_id")]
    public int? RouteId { get; set; }

    /// <summary>
    /// Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
    /// </summary>
    /// <value>Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric</value>
    [DataMember(Name="run_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "run_id")]
    public int? RunId { get; set; }

    /// <summary>
    /// Alphanumeric trip/service run identifier
    /// </summary>
    /// <value>Alphanumeric trip/service run identifier</value>
    [DataMember(Name="run_ref", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "run_ref")]
    public string RunRef { get; set; }

    /// <summary>
    /// Direction of travel identifier
    /// </summary>
    /// <value>Direction of travel identifier</value>
    [DataMember(Name="direction_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "direction_id")]
    public int? DirectionId { get; set; }

    /// <summary>
    /// Disruption information identifier(s)
    /// </summary>
    /// <value>Disruption information identifier(s)</value>
    [DataMember(Name="disruption_ids", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disruption_ids")]
    public List<long?> DisruptionIds { get; set; }

    /// <summary>
    /// Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format
    /// </summary>
    /// <value>Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format</value>
    [DataMember(Name="scheduled_departure_utc", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduled_departure_utc")]
    public DateTime? ScheduledDepartureUtc { get; set; }

    /// <summary>
    /// Real-time estimate of departure time and date in ISO 8601 UTC format
    /// </summary>
    /// <value>Real-time estimate of departure time and date in ISO 8601 UTC format</value>
    [DataMember(Name="estimated_departure_utc", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "estimated_departure_utc")]
    public DateTime? EstimatedDepartureUtc { get; set; }

    /// <summary>
    /// Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes
    /// </summary>
    /// <value>Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes</value>
    [DataMember(Name="at_platform", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "at_platform")]
    public bool? AtPlatform { get; set; }

    /// <summary>
    /// Platform number at stop (metropolitan train only; returns null for other modes)
    /// </summary>
    /// <value>Platform number at stop (metropolitan train only; returns null for other modes)</value>
    [DataMember(Name="platform_number", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "platform_number")]
    public string PlatformNumber { get; set; }

    /// <summary>
    /// Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)
    /// </summary>
    /// <value>Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)</value>
    [DataMember(Name="flags", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "flags")]
    public string Flags { get; set; }

    /// <summary>
    /// Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4
    /// </summary>
    /// <value>Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4</value>
    [DataMember(Name="departure_sequence", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "departure_sequence")]
    public int? DepartureSequence { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3Departure {\n");
      sb.Append("  StopId: ").Append(StopId).Append("\n");
      sb.Append("  RouteId: ").Append(RouteId).Append("\n");
      sb.Append("  RunId: ").Append(RunId).Append("\n");
      sb.Append("  RunRef: ").Append(RunRef).Append("\n");
      sb.Append("  DirectionId: ").Append(DirectionId).Append("\n");
      sb.Append("  DisruptionIds: ").Append(DisruptionIds).Append("\n");
      sb.Append("  ScheduledDepartureUtc: ").Append(ScheduledDepartureUtc).Append("\n");
      sb.Append("  EstimatedDepartureUtc: ").Append(EstimatedDepartureUtc).Append("\n");
      sb.Append("  AtPlatform: ").Append(AtPlatform).Append("\n");
      sb.Append("  PlatformNumber: ").Append(PlatformNumber).Append("\n");
      sb.Append("  Flags: ").Append(Flags).Append("\n");
      sb.Append("  DepartureSequence: ").Append(DepartureSequence).Append("\n");
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
