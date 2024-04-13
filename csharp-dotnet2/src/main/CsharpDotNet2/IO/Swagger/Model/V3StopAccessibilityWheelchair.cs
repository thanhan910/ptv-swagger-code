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
  public class V3StopAccessibilityWheelchair {
    /// <summary>
    /// Gets or Sets AccessibleRamp
    /// </summary>
    [DataMember(Name="accessible_ramp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accessible_ramp")]
    public bool? AccessibleRamp { get; set; }

    /// <summary>
    /// Indicates if there is at least one accessible parking spot at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
    /// </summary>
    /// <value>Indicates if there is at least one accessible parking spot at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)</value>
    [DataMember(Name="parking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "parking")]
    public bool? Parking { get; set; }

    /// <summary>
    /// Indicates if there is at least one accessible telephone at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
    /// </summary>
    /// <value>Indicates if there is at least one accessible telephone at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)</value>
    [DataMember(Name="telephone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "telephone")]
    public bool? Telephone { get; set; }

    /// <summary>
    /// Indicates if there is at least one accessible toilet at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
    /// </summary>
    /// <value>Indicates if there is at least one accessible toilet at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)</value>
    [DataMember(Name="toilet", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "toilet")]
    public bool? Toilet { get; set; }

    /// <summary>
    /// Indicates if there is at least one low ticket counter at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
    /// </summary>
    /// <value>Indicates if there is at least one low ticket counter at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)</value>
    [DataMember(Name="low_ticket_counter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "low_ticket_counter")]
    public bool? LowTicketCounter { get; set; }

    /// <summary>
    /// Indicates if there is a space for mobility device to board on or off a transport mode
    /// </summary>
    /// <value>Indicates if there is a space for mobility device to board on or off a transport mode</value>
    [DataMember(Name="manouvering", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "manouvering")]
    public bool? Manouvering { get; set; }

    /// <summary>
    /// Indicates if there is a raised platform to board a train
    /// </summary>
    /// <value>Indicates if there is a raised platform to board a train</value>
    [DataMember(Name="raised_platform", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "raised_platform")]
    public bool? RaisedPlatform { get; set; }

    /// <summary>
    /// Indicates if there are ramps (&lt;1:14) at the stop/platform
    /// </summary>
    /// <value>Indicates if there are ramps (&lt;1:14) at the stop/platform</value>
    [DataMember(Name="ramp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ramp")]
    public bool? Ramp { get; set; }

    /// <summary>
    /// Indicates if there is a path beyond the stop which is accessible
    /// </summary>
    /// <value>Indicates if there is a path beyond the stop which is accessible</value>
    [DataMember(Name="secondary_path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "secondary_path")]
    public bool? SecondaryPath { get; set; }

    /// <summary>
    /// Indicates if there is shelter near the raised platform
    /// </summary>
    /// <value>Indicates if there is shelter near the raised platform</value>
    [DataMember(Name="raised_platform_shelther", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "raised_platform_shelther")]
    public bool? RaisedPlatformShelther { get; set; }

    /// <summary>
    /// Indicates if there are ramps (&gt;1:14) at the stop/platform
    /// </summary>
    /// <value>Indicates if there are ramps (&gt;1:14) at the stop/platform</value>
    [DataMember(Name="steep_ramp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "steep_ramp")]
    public bool? SteepRamp { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3StopAccessibilityWheelchair {\n");
      sb.Append("  AccessibleRamp: ").Append(AccessibleRamp).Append("\n");
      sb.Append("  Parking: ").Append(Parking).Append("\n");
      sb.Append("  Telephone: ").Append(Telephone).Append("\n");
      sb.Append("  Toilet: ").Append(Toilet).Append("\n");
      sb.Append("  LowTicketCounter: ").Append(LowTicketCounter).Append("\n");
      sb.Append("  Manouvering: ").Append(Manouvering).Append("\n");
      sb.Append("  RaisedPlatform: ").Append(RaisedPlatform).Append("\n");
      sb.Append("  Ramp: ").Append(Ramp).Append("\n");
      sb.Append("  SecondaryPath: ").Append(SecondaryPath).Append("\n");
      sb.Append("  RaisedPlatformShelther: ").Append(RaisedPlatformShelther).Append("\n");
      sb.Append("  SteepRamp: ").Append(SteepRamp).Append("\n");
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
