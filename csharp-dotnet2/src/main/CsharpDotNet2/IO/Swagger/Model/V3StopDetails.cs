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
  public class V3StopDetails {
    /// <summary>
    /// Disruption information identifier(s)
    /// </summary>
    /// <value>Disruption information identifier(s)</value>
    [DataMember(Name="disruption_ids", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disruption_ids")]
    public List<long?> DisruptionIds { get; set; }

    /// <summary>
    /// Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train
    /// </summary>
    /// <value>Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train</value>
    [DataMember(Name="station_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "station_type")]
    public string StationType { get; set; }

    /// <summary>
    /// The definition applicable to the station_type; returns null for V/Line train
    /// </summary>
    /// <value>The definition applicable to the station_type; returns null for V/Line train</value>
    [DataMember(Name="station_description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "station_description")]
    public string StationDescription { get; set; }

    /// <summary>
    /// Transport mode identifier
    /// </summary>
    /// <value>Transport mode identifier</value>
    [DataMember(Name="route_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_type")]
    public int? RouteType { get; set; }

    /// <summary>
    /// Gets or Sets StopLocation
    /// </summary>
    [DataMember(Name="stop_location", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_location")]
    public V3StopLocation StopLocation { get; set; }

    /// <summary>
    /// Gets or Sets StopAmenities
    /// </summary>
    [DataMember(Name="stop_amenities", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_amenities")]
    public V3StopAmenityDetails StopAmenities { get; set; }

    /// <summary>
    /// Gets or Sets StopAccessibility
    /// </summary>
    [DataMember(Name="stop_accessibility", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_accessibility")]
    public V3StopAccessibility StopAccessibility { get; set; }

    /// <summary>
    /// Gets or Sets StopStaffing
    /// </summary>
    [DataMember(Name="stop_staffing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_staffing")]
    public V3StopStaffing StopStaffing { get; set; }

    /// <summary>
    /// Routes travelling through the stop
    /// </summary>
    /// <value>Routes travelling through the stop</value>
    [DataMember(Name="routes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "routes")]
    public List<Object> Routes { get; set; }

    /// <summary>
    /// Stop identifier
    /// </summary>
    /// <value>Stop identifier</value>
    [DataMember(Name="stop_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_id")]
    public int? StopId { get; set; }

    /// <summary>
    /// Name of stop
    /// </summary>
    /// <value>Name of stop</value>
    [DataMember(Name="stop_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_name")]
    public string StopName { get; set; }

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
      sb.Append("class V3StopDetails {\n");
      sb.Append("  DisruptionIds: ").Append(DisruptionIds).Append("\n");
      sb.Append("  StationType: ").Append(StationType).Append("\n");
      sb.Append("  StationDescription: ").Append(StationDescription).Append("\n");
      sb.Append("  RouteType: ").Append(RouteType).Append("\n");
      sb.Append("  StopLocation: ").Append(StopLocation).Append("\n");
      sb.Append("  StopAmenities: ").Append(StopAmenities).Append("\n");
      sb.Append("  StopAccessibility: ").Append(StopAccessibility).Append("\n");
      sb.Append("  StopStaffing: ").Append(StopStaffing).Append("\n");
      sb.Append("  Routes: ").Append(Routes).Append("\n");
      sb.Append("  StopId: ").Append(StopId).Append("\n");
      sb.Append("  StopName: ").Append(StopName).Append("\n");
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
