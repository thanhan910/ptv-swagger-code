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
  public class V3SearchParameters {
    /// <summary>
    /// Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
    /// </summary>
    /// <value>Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)</value>
    [DataMember(Name="route_types", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "route_types")]
    public List<int?> RouteTypes { get; set; }

    /// <summary>
    /// Filter by geographic coordinate of latitude
    /// </summary>
    /// <value>Filter by geographic coordinate of latitude</value>
    [DataMember(Name="latitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "latitude")]
    public float? Latitude { get; set; }

    /// <summary>
    /// Filter by geographic coordinate of longitude
    /// </summary>
    /// <value>Filter by geographic coordinate of longitude</value>
    [DataMember(Name="longitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "longitude")]
    public float? Longitude { get; set; }

    /// <summary>
    /// Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
    /// </summary>
    /// <value>Filter by maximum distance (in metres) from location specified via latitude and longitude parameters</value>
    [DataMember(Name="max_distance", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "max_distance")]
    public float? MaxDistance { get; set; }

    /// <summary>
    /// Placeholder for future development; currently unavailable
    /// </summary>
    /// <value>Placeholder for future development; currently unavailable</value>
    [DataMember(Name="include_addresses", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "include_addresses")]
    public bool? IncludeAddresses { get; set; }

    /// <summary>
    /// Indicates if outlets will be returned in response (default = true)
    /// </summary>
    /// <value>Indicates if outlets will be returned in response (default = true)</value>
    [DataMember(Name="include_outlets", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "include_outlets")]
    public bool? IncludeOutlets { get; set; }

    /// <summary>
    /// Indicates whether to find stops by suburbs in the search term (default = true)
    /// </summary>
    /// <value>Indicates whether to find stops by suburbs in the search term (default = true)</value>
    [DataMember(Name="match_stop_by_suburb", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "match_stop_by_suburb")]
    public bool? MatchStopBySuburb { get; set; }

    /// <summary>
    /// Indicates whether to find routes by suburbs in the search term (default = true)
    /// </summary>
    /// <value>Indicates whether to find routes by suburbs in the search term (default = true)</value>
    [DataMember(Name="match_route_by_suburb", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "match_route_by_suburb")]
    public bool? MatchRouteBySuburb { get; set; }

    /// <summary>
    /// Indicates whether to search for stops according to a metlink stop ID (default = false)
    /// </summary>
    /// <value>Indicates whether to search for stops according to a metlink stop ID (default = false)</value>
    [DataMember(Name="match_stop_by_gtfs_stop_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "match_stop_by_gtfs_stop_id")]
    public bool? MatchStopByGtfsStopId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3SearchParameters {\n");
      sb.Append("  RouteTypes: ").Append(RouteTypes).Append("\n");
      sb.Append("  Latitude: ").Append(Latitude).Append("\n");
      sb.Append("  Longitude: ").Append(Longitude).Append("\n");
      sb.Append("  MaxDistance: ").Append(MaxDistance).Append("\n");
      sb.Append("  IncludeAddresses: ").Append(IncludeAddresses).Append("\n");
      sb.Append("  IncludeOutlets: ").Append(IncludeOutlets).Append("\n");
      sb.Append("  MatchStopBySuburb: ").Append(MatchStopBySuburb).Append("\n");
      sb.Append("  MatchRouteBySuburb: ").Append(MatchRouteBySuburb).Append("\n");
      sb.Append("  MatchStopByGtfsStopId: ").Append(MatchStopByGtfsStopId).Append("\n");
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
