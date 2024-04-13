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
  public class V3Run {
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
    /// Route identifier
    /// </summary>
    /// <value>Route identifier</value>
    [DataMember(Name="route_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_id")]
    public int? RouteId { get; set; }

    /// <summary>
    /// Transport mode identifier
    /// </summary>
    /// <value>Transport mode identifier</value>
    [DataMember(Name="route_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_type")]
    public int? RouteType { get; set; }

    /// <summary>
    /// stop_id of final stop of run
    /// </summary>
    /// <value>stop_id of final stop of run</value>
    [DataMember(Name="final_stop_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "final_stop_id")]
    public int? FinalStopId { get; set; }

    /// <summary>
    /// Name of destination of run
    /// </summary>
    /// <value>Name of destination of run</value>
    [DataMember(Name="destination_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "destination_name")]
    public string DestinationName { get; set; }

    /// <summary>
    /// Status of metropolitan train run; returns \"scheduled\" for other modes
    /// </summary>
    /// <value>Status of metropolitan train run; returns \"scheduled\" for other modes</value>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public string Status { get; set; }

    /// <summary>
    /// Direction of travel identifier
    /// </summary>
    /// <value>Direction of travel identifier</value>
    [DataMember(Name="direction_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "direction_id")]
    public int? DirectionId { get; set; }

    /// <summary>
    /// Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.
    /// </summary>
    /// <value>Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.</value>
    [DataMember(Name="run_sequence", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "run_sequence")]
    public int? RunSequence { get; set; }

    /// <summary>
    /// The number of remaining skipped/express stations for the run/service from a stop
    /// </summary>
    /// <value>The number of remaining skipped/express stations for the run/service from a stop</value>
    [DataMember(Name="express_stop_count", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "express_stop_count")]
    public int? ExpressStopCount { get; set; }

    /// <summary>
    /// Gets or Sets VehiclePosition
    /// </summary>
    [DataMember(Name="vehicle_position", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicle_position")]
    public V3VehiclePosition VehiclePosition { get; set; }

    /// <summary>
    /// Gets or Sets VehicleDescriptor
    /// </summary>
    [DataMember(Name="vehicle_descriptor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicle_descriptor")]
    public V3VehicleDescriptor VehicleDescriptor { get; set; }

    /// <summary>
    /// Geopath of the route
    /// </summary>
    /// <value>Geopath of the route</value>
    [DataMember(Name="geopath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "geopath")]
    public List<Object> Geopath { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3Run {\n");
      sb.Append("  RunId: ").Append(RunId).Append("\n");
      sb.Append("  RunRef: ").Append(RunRef).Append("\n");
      sb.Append("  RouteId: ").Append(RouteId).Append("\n");
      sb.Append("  RouteType: ").Append(RouteType).Append("\n");
      sb.Append("  FinalStopId: ").Append(FinalStopId).Append("\n");
      sb.Append("  DestinationName: ").Append(DestinationName).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
      sb.Append("  DirectionId: ").Append(DirectionId).Append("\n");
      sb.Append("  RunSequence: ").Append(RunSequence).Append("\n");
      sb.Append("  ExpressStopCount: ").Append(ExpressStopCount).Append("\n");
      sb.Append("  VehiclePosition: ").Append(VehiclePosition).Append("\n");
      sb.Append("  VehicleDescriptor: ").Append(VehicleDescriptor).Append("\n");
      sb.Append("  Geopath: ").Append(Geopath).Append("\n");
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
