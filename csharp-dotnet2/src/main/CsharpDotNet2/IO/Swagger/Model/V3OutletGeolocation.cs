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
  public class V3OutletGeolocation {
    /// <summary>
    /// Distance of outlet from input location (in metres); returns 0 if no location is input
    /// </summary>
    /// <value>Distance of outlet from input location (in metres); returns 0 if no location is input</value>
    [DataMember(Name="outlet_distance", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_distance")]
    public float? OutletDistance { get; set; }

    /// <summary>
    /// The SLID / SPID
    /// </summary>
    /// <value>The SLID / SPID</value>
    [DataMember(Name="outlet_slid_spid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_slid_spid")]
    public string OutletSlidSpid { get; set; }

    /// <summary>
    /// The location name of the outlet
    /// </summary>
    /// <value>The location name of the outlet</value>
    [DataMember(Name="outlet_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_name")]
    public string OutletName { get; set; }

    /// <summary>
    /// The business name of the outlet
    /// </summary>
    /// <value>The business name of the outlet</value>
    [DataMember(Name="outlet_business", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_business")]
    public string OutletBusiness { get; set; }

    /// <summary>
    /// Geographic coordinate of latitude at outlet
    /// </summary>
    /// <value>Geographic coordinate of latitude at outlet</value>
    [DataMember(Name="outlet_latitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_latitude")]
    public float? OutletLatitude { get; set; }

    /// <summary>
    /// Geographic coordinate of longitude at outlet
    /// </summary>
    /// <value>Geographic coordinate of longitude at outlet</value>
    [DataMember(Name="outlet_longitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_longitude")]
    public float? OutletLongitude { get; set; }

    /// <summary>
    /// The city/municipality the outlet is in
    /// </summary>
    /// <value>The city/municipality the outlet is in</value>
    [DataMember(Name="outlet_suburb", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_suburb")]
    public string OutletSuburb { get; set; }

    /// <summary>
    /// The postcode for the outlet
    /// </summary>
    /// <value>The postcode for the outlet</value>
    [DataMember(Name="outlet_postcode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_postcode")]
    public int? OutletPostcode { get; set; }

    /// <summary>
    /// The business hours on Monday
    /// </summary>
    /// <value>The business hours on Monday</value>
    [DataMember(Name="outlet_business_hour_mon", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_business_hour_mon")]
    public string OutletBusinessHourMon { get; set; }

    /// <summary>
    /// The business hours on Tuesday
    /// </summary>
    /// <value>The business hours on Tuesday</value>
    [DataMember(Name="outlet_business_hour_tue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_business_hour_tue")]
    public string OutletBusinessHourTue { get; set; }

    /// <summary>
    /// The business hours on Wednesday
    /// </summary>
    /// <value>The business hours on Wednesday</value>
    [DataMember(Name="outlet_business_hour_wed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_business_hour_wed")]
    public string OutletBusinessHourWed { get; set; }

    /// <summary>
    /// The business hours on Thursday
    /// </summary>
    /// <value>The business hours on Thursday</value>
    [DataMember(Name="outlet_business_hour_thur", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_business_hour_thur")]
    public string OutletBusinessHourThur { get; set; }

    /// <summary>
    /// The business hours on Friday
    /// </summary>
    /// <value>The business hours on Friday</value>
    [DataMember(Name="outlet_business_hour_fri", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_business_hour_fri")]
    public string OutletBusinessHourFri { get; set; }

    /// <summary>
    /// The business hours on Saturday
    /// </summary>
    /// <value>The business hours on Saturday</value>
    [DataMember(Name="outlet_business_hour_sat", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_business_hour_sat")]
    public string OutletBusinessHourSat { get; set; }

    /// <summary>
    /// The business hours on Sunday
    /// </summary>
    /// <value>The business hours on Sunday</value>
    [DataMember(Name="outlet_business_hour_sun", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_business_hour_sun")]
    public string OutletBusinessHourSun { get; set; }

    /// <summary>
    /// Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.
    /// </summary>
    /// <value>Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.</value>
    [DataMember(Name="outlet_notes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "outlet_notes")]
    public string OutletNotes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3OutletGeolocation {\n");
      sb.Append("  OutletDistance: ").Append(OutletDistance).Append("\n");
      sb.Append("  OutletSlidSpid: ").Append(OutletSlidSpid).Append("\n");
      sb.Append("  OutletName: ").Append(OutletName).Append("\n");
      sb.Append("  OutletBusiness: ").Append(OutletBusiness).Append("\n");
      sb.Append("  OutletLatitude: ").Append(OutletLatitude).Append("\n");
      sb.Append("  OutletLongitude: ").Append(OutletLongitude).Append("\n");
      sb.Append("  OutletSuburb: ").Append(OutletSuburb).Append("\n");
      sb.Append("  OutletPostcode: ").Append(OutletPostcode).Append("\n");
      sb.Append("  OutletBusinessHourMon: ").Append(OutletBusinessHourMon).Append("\n");
      sb.Append("  OutletBusinessHourTue: ").Append(OutletBusinessHourTue).Append("\n");
      sb.Append("  OutletBusinessHourWed: ").Append(OutletBusinessHourWed).Append("\n");
      sb.Append("  OutletBusinessHourThur: ").Append(OutletBusinessHourThur).Append("\n");
      sb.Append("  OutletBusinessHourFri: ").Append(OutletBusinessHourFri).Append("\n");
      sb.Append("  OutletBusinessHourSat: ").Append(OutletBusinessHourSat).Append("\n");
      sb.Append("  OutletBusinessHourSun: ").Append(OutletBusinessHourSun).Append("\n");
      sb.Append("  OutletNotes: ").Append(OutletNotes).Append("\n");
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
