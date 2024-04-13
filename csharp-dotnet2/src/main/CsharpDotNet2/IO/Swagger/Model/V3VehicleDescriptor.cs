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
  public class V3VehicleDescriptor {
    /// <summary>
    /// Operator name of the vehicle such as \"Metro Trains Melbourne\", \"Yarra Trams\", \"Ventura Bus Line\", \"CDC\" or \"Sita Bus Lines\" . May be null/empty.  Only available for train, tram, v/line and some bus runs.
    /// </summary>
    /// <value>Operator name of the vehicle such as \"Metro Trains Melbourne\", \"Yarra Trams\", \"Ventura Bus Line\", \"CDC\" or \"Sita Bus Lines\" . May be null/empty.  Only available for train, tram, v/line and some bus runs.</value>
    [DataMember(Name="operator", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "operator")]
    public string _Operator { get; set; }

    /// <summary>
    /// Operator identifier of the vehicle such as \"26094\". May be null/empty. Only available for some tram and bus runs.
    /// </summary>
    /// <value>Operator identifier of the vehicle such as \"26094\". May be null/empty. Only available for some tram and bus runs.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// Indicator if vehicle has a low floor. May be null. Only available for some tram runs.
    /// </summary>
    /// <value>Indicator if vehicle has a low floor. May be null. Only available for some tram runs.</value>
    [DataMember(Name="low_floor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "low_floor")]
    public bool? LowFloor { get; set; }

    /// <summary>
    /// Indicator if vehicle is air conditioned. May be null. Only available for some tram runs.
    /// </summary>
    /// <value>Indicator if vehicle is air conditioned. May be null. Only available for some tram runs.</value>
    [DataMember(Name="air_conditioned", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "air_conditioned")]
    public bool? AirConditioned { get; set; }

    /// <summary>
    /// Vehicle description such as \"6 Car Comeng\", \"6 Car Xtrapolis\", \"3 Car Comeng\", \"6 Car Siemens\", \"3 Car Siemens\". May be null/empty.  Only available for some metropolitan train runs.
    /// </summary>
    /// <value>Vehicle description such as \"6 Car Comeng\", \"6 Car Xtrapolis\", \"3 Car Comeng\", \"6 Car Siemens\", \"3 Car Siemens\". May be null/empty.  Only available for some metropolitan train runs.</value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// Supplier of vehicle descriptor data.
    /// </summary>
    /// <value>Supplier of vehicle descriptor data.</value>
    [DataMember(Name="supplier", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "supplier")]
    public string Supplier { get; set; }

    /// <summary>
    /// The length of the vehicle. Applies to CIS - Metro Trains
    /// </summary>
    /// <value>The length of the vehicle. Applies to CIS - Metro Trains</value>
    [DataMember(Name="length", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "length")]
    public string Length { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3VehicleDescriptor {\n");
      sb.Append("  _Operator: ").Append(_Operator).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  LowFloor: ").Append(LowFloor).Append("\n");
      sb.Append("  AirConditioned: ").Append(AirConditioned).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  Supplier: ").Append(Supplier).Append("\n");
      sb.Append("  Length: ").Append(Length).Append("\n");
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
