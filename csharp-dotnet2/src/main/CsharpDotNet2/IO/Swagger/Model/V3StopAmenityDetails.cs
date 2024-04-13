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
  public class V3StopAmenityDetails {
    /// <summary>
    /// Indicates if there is a public toilet at or near the stop
    /// </summary>
    /// <value>Indicates if there is a public toilet at or near the stop</value>
    [DataMember(Name="toilet", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "toilet")]
    public bool? Toilet { get; set; }

    /// <summary>
    /// Indicates if there is a taxi rank at or near the stop
    /// </summary>
    /// <value>Indicates if there is a taxi rank at or near the stop</value>
    [DataMember(Name="taxi_rank", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxi_rank")]
    public bool? TaxiRank { get; set; }

    /// <summary>
    /// The number of free car parking spots at the stop
    /// </summary>
    /// <value>The number of free car parking spots at the stop</value>
    [DataMember(Name="car_parking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "car_parking")]
    public string CarParking { get; set; }

    /// <summary>
    /// Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop
    /// </summary>
    /// <value>Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop</value>
    [DataMember(Name="cctv", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cctv")]
    public bool? Cctv { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3StopAmenityDetails {\n");
      sb.Append("  Toilet: ").Append(Toilet).Append("\n");
      sb.Append("  TaxiRank: ").Append(TaxiRank).Append("\n");
      sb.Append("  CarParking: ").Append(CarParking).Append("\n");
      sb.Append("  Cctv: ").Append(Cctv).Append("\n");
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
