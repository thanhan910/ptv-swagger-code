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
  public class V3StopStaffing {
    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="fri_am_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fri_am_from")]
    public string FriAmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="fri_am_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fri_am_to")]
    public string FriAmTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="fri_pm_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fri_pm_from")]
    public string FriPmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="fri_pm_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fri_pm_to")]
    public string FriPmTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="mon_am_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mon_am_from")]
    public string MonAmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="mon_am_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mon_am_to")]
    public string MonAmTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="mon_pm_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mon_pm_from")]
    public string MonPmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="mon_pm_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mon_pm_to")]
    public string MonPmTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="ph_additional_text", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ph_additional_text")]
    public string PhAdditionalText { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="ph_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ph_from")]
    public string PhFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="ph_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ph_to")]
    public string PhTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="sat_am_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sat_am_from")]
    public string SatAmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="sat_am_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sat_am_to")]
    public string SatAmTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="sat_pm_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sat_pm_from")]
    public string SatPmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="sat_pm_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sat_pm_to")]
    public string SatPmTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="sun_am_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sun_am_from")]
    public string SunAmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="sun_am_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sun_am_to")]
    public string SunAmTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="sun_pm_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sun_pm_from")]
    public string SunPmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="sun_pm_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sun_pm_to")]
    public string SunPmTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="thu_am_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "thu_am_from")]
    public string ThuAmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="thu_am_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "thu_am_to")]
    public string ThuAmTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="thu_pm_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "thu_pm_from")]
    public string ThuPmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="thu_pm_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "thu_pm_to")]
    public string ThuPmTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="tue_am_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tue_am_from")]
    public string TueAmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="tue_am_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tue_am_to")]
    public string TueAmTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="tue_pm_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tue_pm_from")]
    public string TuePmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="tue_pm_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tue_pm_to")]
    public string TuePmTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="wed_am_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "wed_am_from")]
    public string WedAmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="wed_am_to", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "wed_am_to")]
    public string WedAmTo { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="wed_pm_from", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "wed_pm_from")]
    public string WedPmFrom { get; set; }

    /// <summary>
    /// Stop staffing hours
    /// </summary>
    /// <value>Stop staffing hours</value>
    [DataMember(Name="wed_pm_To", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "wed_pm_To")]
    public string WedPmTo { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3StopStaffing {\n");
      sb.Append("  FriAmFrom: ").Append(FriAmFrom).Append("\n");
      sb.Append("  FriAmTo: ").Append(FriAmTo).Append("\n");
      sb.Append("  FriPmFrom: ").Append(FriPmFrom).Append("\n");
      sb.Append("  FriPmTo: ").Append(FriPmTo).Append("\n");
      sb.Append("  MonAmFrom: ").Append(MonAmFrom).Append("\n");
      sb.Append("  MonAmTo: ").Append(MonAmTo).Append("\n");
      sb.Append("  MonPmFrom: ").Append(MonPmFrom).Append("\n");
      sb.Append("  MonPmTo: ").Append(MonPmTo).Append("\n");
      sb.Append("  PhAdditionalText: ").Append(PhAdditionalText).Append("\n");
      sb.Append("  PhFrom: ").Append(PhFrom).Append("\n");
      sb.Append("  PhTo: ").Append(PhTo).Append("\n");
      sb.Append("  SatAmFrom: ").Append(SatAmFrom).Append("\n");
      sb.Append("  SatAmTo: ").Append(SatAmTo).Append("\n");
      sb.Append("  SatPmFrom: ").Append(SatPmFrom).Append("\n");
      sb.Append("  SatPmTo: ").Append(SatPmTo).Append("\n");
      sb.Append("  SunAmFrom: ").Append(SunAmFrom).Append("\n");
      sb.Append("  SunAmTo: ").Append(SunAmTo).Append("\n");
      sb.Append("  SunPmFrom: ").Append(SunPmFrom).Append("\n");
      sb.Append("  SunPmTo: ").Append(SunPmTo).Append("\n");
      sb.Append("  ThuAmFrom: ").Append(ThuAmFrom).Append("\n");
      sb.Append("  ThuAmTo: ").Append(ThuAmTo).Append("\n");
      sb.Append("  ThuPmFrom: ").Append(ThuPmFrom).Append("\n");
      sb.Append("  ThuPmTo: ").Append(ThuPmTo).Append("\n");
      sb.Append("  TueAmFrom: ").Append(TueAmFrom).Append("\n");
      sb.Append("  TueAmTo: ").Append(TueAmTo).Append("\n");
      sb.Append("  TuePmFrom: ").Append(TuePmFrom).Append("\n");
      sb.Append("  TuePmTo: ").Append(TuePmTo).Append("\n");
      sb.Append("  WedAmFrom: ").Append(WedAmFrom).Append("\n");
      sb.Append("  WedAmTo: ").Append(WedAmTo).Append("\n");
      sb.Append("  WedPmFrom: ").Append(WedPmFrom).Append("\n");
      sb.Append("  WedPmTo: ").Append(WedPmTo).Append("\n");
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
