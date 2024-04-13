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
  public class V3PassengerFare {
    /// <summary>
    /// Gets or Sets PassengerType
    /// </summary>
    [DataMember(Name="PassengerType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PassengerType")]
    public string PassengerType { get; set; }

    /// <summary>
    /// Gets or Sets Fare2HourPeak
    /// </summary>
    [DataMember(Name="Fare2HourPeak", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Fare2HourPeak")]
    public decimal? Fare2HourPeak { get; set; }

    /// <summary>
    /// Gets or Sets Fare2HourOffPeak
    /// </summary>
    [DataMember(Name="Fare2HourOffPeak", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Fare2HourOffPeak")]
    public decimal? Fare2HourOffPeak { get; set; }

    /// <summary>
    /// Gets or Sets FareDailyPeak
    /// </summary>
    [DataMember(Name="FareDailyPeak", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "FareDailyPeak")]
    public decimal? FareDailyPeak { get; set; }

    /// <summary>
    /// Gets or Sets FareDailyOffPeak
    /// </summary>
    [DataMember(Name="FareDailyOffPeak", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "FareDailyOffPeak")]
    public decimal? FareDailyOffPeak { get; set; }

    /// <summary>
    /// Gets or Sets Pass7Days
    /// </summary>
    [DataMember(Name="Pass7Days", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Pass7Days")]
    public decimal? Pass7Days { get; set; }

    /// <summary>
    /// Gets or Sets Pass28To69DayPerDay
    /// </summary>
    [DataMember(Name="Pass28To69DayPerDay", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Pass28To69DayPerDay")]
    public decimal? Pass28To69DayPerDay { get; set; }

    /// <summary>
    /// Gets or Sets Pass70PlusDayPerDay
    /// </summary>
    [DataMember(Name="Pass70PlusDayPerDay", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Pass70PlusDayPerDay")]
    public decimal? Pass70PlusDayPerDay { get; set; }

    /// <summary>
    /// Gets or Sets WeekendCap
    /// </summary>
    [DataMember(Name="WeekendCap", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "WeekendCap")]
    public decimal? WeekendCap { get; set; }

    /// <summary>
    /// Gets or Sets HolidayCap
    /// </summary>
    [DataMember(Name="HolidayCap", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "HolidayCap")]
    public decimal? HolidayCap { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3PassengerFare {\n");
      sb.Append("  PassengerType: ").Append(PassengerType).Append("\n");
      sb.Append("  Fare2HourPeak: ").Append(Fare2HourPeak).Append("\n");
      sb.Append("  Fare2HourOffPeak: ").Append(Fare2HourOffPeak).Append("\n");
      sb.Append("  FareDailyPeak: ").Append(FareDailyPeak).Append("\n");
      sb.Append("  FareDailyOffPeak: ").Append(FareDailyOffPeak).Append("\n");
      sb.Append("  Pass7Days: ").Append(Pass7Days).Append("\n");
      sb.Append("  Pass28To69DayPerDay: ").Append(Pass28To69DayPerDay).Append("\n");
      sb.Append("  Pass70PlusDayPerDay: ").Append(Pass70PlusDayPerDay).Append("\n");
      sb.Append("  WeekendCap: ").Append(WeekendCap).Append("\n");
      sb.Append("  HolidayCap: ").Append(HolidayCap).Append("\n");
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
