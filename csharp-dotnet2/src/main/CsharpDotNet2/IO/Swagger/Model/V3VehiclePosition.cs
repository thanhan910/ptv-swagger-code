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
  public class V3VehiclePosition {
    /// <summary>
    /// Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs.
    /// </summary>
    /// <value>Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs.</value>
    [DataMember(Name="latitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "latitude")]
    public double? Latitude { get; set; }

    /// <summary>
    /// Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs.
    /// </summary>
    /// <value>Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs.</value>
    [DataMember(Name="longitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "longitude")]
    public double? Longitude { get; set; }

    /// <summary>
    /// CIS - Metro Train Vehicle Location Easting coordinate
    /// </summary>
    /// <value>CIS - Metro Train Vehicle Location Easting coordinate</value>
    [DataMember(Name="easting", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "easting")]
    public double? Easting { get; set; }

    /// <summary>
    /// CIS - Metro Train Vehicle Location Northing coordinate
    /// </summary>
    /// <value>CIS - Metro Train Vehicle Location Northing coordinate</value>
    [DataMember(Name="northing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "northing")]
    public double? Northing { get; set; }

    /// <summary>
    /// CIS - Metro Train Vehicle Location Direction
    /// </summary>
    /// <value>CIS - Metro Train Vehicle Location Direction</value>
    [DataMember(Name="direction", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "direction")]
    public string Direction { get; set; }

    /// <summary>
    /// Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs.
    /// </summary>
    /// <value>Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs.</value>
    [DataMember(Name="bearing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bearing")]
    public double? Bearing { get; set; }

    /// <summary>
    /// Supplier of vehicle position data.
    /// </summary>
    /// <value>Supplier of vehicle position data.</value>
    [DataMember(Name="supplier", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "supplier")]
    public string Supplier { get; set; }

    /// <summary>
    /// Date and time that the vehicle position data was supplied.
    /// </summary>
    /// <value>Date and time that the vehicle position data was supplied.</value>
    [DataMember(Name="datetime_utc", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "datetime_utc")]
    public DateTime? DatetimeUtc { get; set; }

    /// <summary>
    /// CIS - Metro Train Vehicle Location data expiry time
    /// </summary>
    /// <value>CIS - Metro Train Vehicle Location data expiry time</value>
    [DataMember(Name="expiry_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "expiry_time")]
    public DateTime? ExpiryTime { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3VehiclePosition {\n");
      sb.Append("  Latitude: ").Append(Latitude).Append("\n");
      sb.Append("  Longitude: ").Append(Longitude).Append("\n");
      sb.Append("  Easting: ").Append(Easting).Append("\n");
      sb.Append("  Northing: ").Append(Northing).Append("\n");
      sb.Append("  Direction: ").Append(Direction).Append("\n");
      sb.Append("  Bearing: ").Append(Bearing).Append("\n");
      sb.Append("  Supplier: ").Append(Supplier).Append("\n");
      sb.Append("  DatetimeUtc: ").Append(DatetimeUtc).Append("\n");
      sb.Append("  ExpiryTime: ").Append(ExpiryTime).Append("\n");
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
