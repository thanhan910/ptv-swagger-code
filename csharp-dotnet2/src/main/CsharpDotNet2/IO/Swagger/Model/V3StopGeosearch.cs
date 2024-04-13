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
  public class V3StopGeosearch {
    /// <summary>
    /// Disruption information identifier(s)
    /// </summary>
    /// <value>Disruption information identifier(s)</value>
    [DataMember(Name="disruption_ids", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disruption_ids")]
    public List<long?> DisruptionIds { get; set; }

    /// <summary>
    /// Distance of stop from input location (in metres); returns 0 if no location is input
    /// </summary>
    /// <value>Distance of stop from input location (in metres); returns 0 if no location is input</value>
    [DataMember(Name="stop_distance", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_distance")]
    public float? StopDistance { get; set; }

    /// <summary>
    /// suburb of stop
    /// </summary>
    /// <value>suburb of stop</value>
    [DataMember(Name="stop_suburb", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_suburb")]
    public string StopSuburb { get; set; }

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
    /// Transport mode identifier
    /// </summary>
    /// <value>Transport mode identifier</value>
    [DataMember(Name="route_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_type")]
    public int? RouteType { get; set; }

    /// <summary>
    /// List of routes travelling through the stop
    /// </summary>
    /// <value>List of routes travelling through the stop</value>
    [DataMember(Name="routes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "routes")]
    public List<Object> Routes { get; set; }

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
    /// Landmark in proximity of stop
    /// </summary>
    /// <value>Landmark in proximity of stop</value>
    [DataMember(Name="stop_landmark", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_landmark")]
    public string StopLandmark { get; set; }

    /// <summary>
    /// Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
    /// </summary>
    /// <value>Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.</value>
    [DataMember(Name="stop_sequence", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_sequence")]
    public int? StopSequence { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3StopGeosearch {\n");
      sb.Append("  DisruptionIds: ").Append(DisruptionIds).Append("\n");
      sb.Append("  StopDistance: ").Append(StopDistance).Append("\n");
      sb.Append("  StopSuburb: ").Append(StopSuburb).Append("\n");
      sb.Append("  StopName: ").Append(StopName).Append("\n");
      sb.Append("  StopId: ").Append(StopId).Append("\n");
      sb.Append("  RouteType: ").Append(RouteType).Append("\n");
      sb.Append("  Routes: ").Append(Routes).Append("\n");
      sb.Append("  StopLatitude: ").Append(StopLatitude).Append("\n");
      sb.Append("  StopLongitude: ").Append(StopLongitude).Append("\n");
      sb.Append("  StopLandmark: ").Append(StopLandmark).Append("\n");
      sb.Append("  StopSequence: ").Append(StopSequence).Append("\n");
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
