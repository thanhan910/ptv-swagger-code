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
  public class V3Disruption {
    /// <summary>
    /// Disruption information identifier
    /// </summary>
    /// <value>Disruption information identifier</value>
    [DataMember(Name="disruption_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disruption_id")]
    public long? DisruptionId { get; set; }

    /// <summary>
    /// Headline title summarising disruption information
    /// </summary>
    /// <value>Headline title summarising disruption information</value>
    [DataMember(Name="title", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "title")]
    public string Title { get; set; }

    /// <summary>
    /// URL of relevant article on PTV website
    /// </summary>
    /// <value>URL of relevant article on PTV website</value>
    [DataMember(Name="url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "url")]
    public string Url { get; set; }

    /// <summary>
    /// Description of the disruption
    /// </summary>
    /// <value>Description of the disruption</value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// Status of the disruption (e.g. \"Planned\", \"Current\")
    /// </summary>
    /// <value>Status of the disruption (e.g. \"Planned\", \"Current\")</value>
    [DataMember(Name="disruption_status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disruption_status")]
    public string DisruptionStatus { get; set; }

    /// <summary>
    /// Type of disruption
    /// </summary>
    /// <value>Type of disruption</value>
    [DataMember(Name="disruption_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disruption_type")]
    public string DisruptionType { get; set; }

    /// <summary>
    /// Date and time disruption information is published on PTV website, in ISO 8601 UTC format
    /// </summary>
    /// <value>Date and time disruption information is published on PTV website, in ISO 8601 UTC format</value>
    [DataMember(Name="published_on", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "published_on")]
    public DateTime? PublishedOn { get; set; }

    /// <summary>
    /// Date and time disruption information was last updated by PTV, in ISO 8601 UTC format
    /// </summary>
    /// <value>Date and time disruption information was last updated by PTV, in ISO 8601 UTC format</value>
    [DataMember(Name="last_updated", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "last_updated")]
    public DateTime? LastUpdated { get; set; }

    /// <summary>
    /// Date and time at which disruption begins, in ISO 8601 UTC format
    /// </summary>
    /// <value>Date and time at which disruption begins, in ISO 8601 UTC format</value>
    [DataMember(Name="from_date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "from_date")]
    public DateTime? FromDate { get; set; }

    /// <summary>
    /// Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)
    /// </summary>
    /// <value>Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)</value>
    [DataMember(Name="to_date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "to_date")]
    public DateTime? ToDate { get; set; }

    /// <summary>
    /// Route relevant to a disruption (if applicable)
    /// </summary>
    /// <value>Route relevant to a disruption (if applicable)</value>
    [DataMember(Name="routes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "routes")]
    public List<V3DisruptionRoute> Routes { get; set; }

    /// <summary>
    /// Stop relevant to a disruption (if applicable)
    /// </summary>
    /// <value>Stop relevant to a disruption (if applicable)</value>
    [DataMember(Name="stops", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stops")]
    public List<V3DisruptionStop> Stops { get; set; }

    /// <summary>
    /// Gets or Sets Colour
    /// </summary>
    [DataMember(Name="colour", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "colour")]
    public string Colour { get; set; }

    /// <summary>
    /// Gets or Sets DisplayOnBoard
    /// </summary>
    [DataMember(Name="display_on_board", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "display_on_board")]
    public bool? DisplayOnBoard { get; set; }

    /// <summary>
    /// Gets or Sets DisplayStatus
    /// </summary>
    [DataMember(Name="display_status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "display_status")]
    public bool? DisplayStatus { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3Disruption {\n");
      sb.Append("  DisruptionId: ").Append(DisruptionId).Append("\n");
      sb.Append("  Title: ").Append(Title).Append("\n");
      sb.Append("  Url: ").Append(Url).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  DisruptionStatus: ").Append(DisruptionStatus).Append("\n");
      sb.Append("  DisruptionType: ").Append(DisruptionType).Append("\n");
      sb.Append("  PublishedOn: ").Append(PublishedOn).Append("\n");
      sb.Append("  LastUpdated: ").Append(LastUpdated).Append("\n");
      sb.Append("  FromDate: ").Append(FromDate).Append("\n");
      sb.Append("  ToDate: ").Append(ToDate).Append("\n");
      sb.Append("  Routes: ").Append(Routes).Append("\n");
      sb.Append("  Stops: ").Append(Stops).Append("\n");
      sb.Append("  Colour: ").Append(Colour).Append("\n");
      sb.Append("  DisplayOnBoard: ").Append(DisplayOnBoard).Append("\n");
      sb.Append("  DisplayStatus: ").Append(DisplayStatus).Append("\n");
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
