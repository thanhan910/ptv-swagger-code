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
  public class V3StopAccessibility {
    /// <summary>
    /// Indicates if there is lighting at the stop
    /// </summary>
    /// <value>Indicates if there is lighting at the stop</value>
    [DataMember(Name="lighting", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lighting")]
    public bool? Lighting { get; set; }

    /// <summary>
    /// Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)
    /// </summary>
    /// <value>Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)</value>
    [DataMember(Name="platform_number", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "platform_number")]
    public int? PlatformNumber { get; set; }

    /// <summary>
    /// Indicates if there is at least one audio customer information at the stop/platform
    /// </summary>
    /// <value>Indicates if there is at least one audio customer information at the stop/platform</value>
    [DataMember(Name="audio_customer_information", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "audio_customer_information")]
    public bool? AudioCustomerInformation { get; set; }

    /// <summary>
    /// Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
    /// </summary>
    /// <value>Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)</value>
    [DataMember(Name="escalator", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "escalator")]
    public bool? Escalator { get; set; }

    /// <summary>
    /// Indicates if there is a hearing loop facility at the stop/platform
    /// </summary>
    /// <value>Indicates if there is a hearing loop facility at the stop/platform</value>
    [DataMember(Name="hearing_loop", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hearing_loop")]
    public bool? HearingLoop { get; set; }

    /// <summary>
    /// Indicates if there is an elevator at the stop/platform
    /// </summary>
    /// <value>Indicates if there is an elevator at the stop/platform</value>
    [DataMember(Name="lift", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lift")]
    public bool? Lift { get; set; }

    /// <summary>
    /// Indicates if there are stairs available in the stop
    /// </summary>
    /// <value>Indicates if there are stairs available in the stop</value>
    [DataMember(Name="stairs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stairs")]
    public bool? Stairs { get; set; }

    /// <summary>
    /// Indicates if the stop is accessible
    /// </summary>
    /// <value>Indicates if the stop is accessible</value>
    [DataMember(Name="stop_accessible", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stop_accessible")]
    public bool? StopAccessible { get; set; }

    /// <summary>
    /// Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop
    /// </summary>
    /// <value>Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop</value>
    [DataMember(Name="tactile_ground_surface_indicator", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tactile_ground_surface_indicator")]
    public bool? TactileGroundSurfaceIndicator { get; set; }

    /// <summary>
    /// Indicates if there is a general waiting area at the stop
    /// </summary>
    /// <value>Indicates if there is a general waiting area at the stop</value>
    [DataMember(Name="waiting_room", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "waiting_room")]
    public bool? WaitingRoom { get; set; }

    /// <summary>
    /// Gets or Sets Wheelchair
    /// </summary>
    [DataMember(Name="wheelchair", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "wheelchair")]
    public V3StopAccessibilityWheelchair Wheelchair { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3StopAccessibility {\n");
      sb.Append("  Lighting: ").Append(Lighting).Append("\n");
      sb.Append("  PlatformNumber: ").Append(PlatformNumber).Append("\n");
      sb.Append("  AudioCustomerInformation: ").Append(AudioCustomerInformation).Append("\n");
      sb.Append("  Escalator: ").Append(Escalator).Append("\n");
      sb.Append("  HearingLoop: ").Append(HearingLoop).Append("\n");
      sb.Append("  Lift: ").Append(Lift).Append("\n");
      sb.Append("  Stairs: ").Append(Stairs).Append("\n");
      sb.Append("  StopAccessible: ").Append(StopAccessible).Append("\n");
      sb.Append("  TactileGroundSurfaceIndicator: ").Append(TactileGroundSurfaceIndicator).Append("\n");
      sb.Append("  WaitingRoom: ").Append(WaitingRoom).Append("\n");
      sb.Append("  Wheelchair: ").Append(Wheelchair).Append("\n");
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
