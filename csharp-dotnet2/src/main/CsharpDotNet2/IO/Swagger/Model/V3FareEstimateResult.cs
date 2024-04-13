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
  public class V3FareEstimateResult {
    /// <summary>
    /// Gets or Sets IsEarlyBird
    /// </summary>
    [DataMember(Name="IsEarlyBird", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "IsEarlyBird")]
    public bool? IsEarlyBird { get; set; }

    /// <summary>
    /// Gets or Sets IsJourneyInFreeTramZone
    /// </summary>
    [DataMember(Name="IsJourneyInFreeTramZone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "IsJourneyInFreeTramZone")]
    public bool? IsJourneyInFreeTramZone { get; set; }

    /// <summary>
    /// Gets or Sets IsThisWeekendJourney
    /// </summary>
    [DataMember(Name="IsThisWeekendJourney", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "IsThisWeekendJourney")]
    public bool? IsThisWeekendJourney { get; set; }

    /// <summary>
    /// Gets or Sets ZoneInfo
    /// </summary>
    [DataMember(Name="ZoneInfo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ZoneInfo")]
    public V3ZoneInfo ZoneInfo { get; set; }

    /// <summary>
    /// Gets or Sets PassengerFares
    /// </summary>
    [DataMember(Name="PassengerFares", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PassengerFares")]
    public List<V3PassengerFare> PassengerFares { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3FareEstimateResult {\n");
      sb.Append("  IsEarlyBird: ").Append(IsEarlyBird).Append("\n");
      sb.Append("  IsJourneyInFreeTramZone: ").Append(IsJourneyInFreeTramZone).Append("\n");
      sb.Append("  IsThisWeekendJourney: ").Append(IsThisWeekendJourney).Append("\n");
      sb.Append("  ZoneInfo: ").Append(ZoneInfo).Append("\n");
      sb.Append("  PassengerFares: ").Append(PassengerFares).Append("\n");
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
