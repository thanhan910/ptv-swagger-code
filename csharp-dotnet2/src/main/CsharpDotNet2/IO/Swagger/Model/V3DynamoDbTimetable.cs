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
  public class V3DynamoDbTimetable {
    /// <summary>
    /// Name of corresponding table in DynamoDB.
    /// </summary>
    /// <value>Name of corresponding table in DynamoDB.</value>
    [DataMember(Name="table_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "table_name")]
    public string TableName { get; set; }

    /// <summary>
    /// Parser verison
    /// </summary>
    /// <value>Parser verison</value>
    [DataMember(Name="parser_version", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "parser_version")]
    public long? ParserVersion { get; set; }

    /// <summary>
    /// Diva Mapping Version used to load Parser into DynamoDB
    /// </summary>
    /// <value>Diva Mapping Version used to load Parser into DynamoDB</value>
    [DataMember(Name="parser_mapping_version", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "parser_mapping_version")]
    public string ParserMappingVersion { get; set; }

    /// <summary>
    /// PT version
    /// </summary>
    /// <value>PT version</value>
    [DataMember(Name="pt_version", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pt_version")]
    public long? PtVersion { get; set; }

    /// <summary>
    /// Diva Mapping Version used to load PT into DynamoDB
    /// </summary>
    /// <value>Diva Mapping Version used to load PT into DynamoDB</value>
    [DataMember(Name="pt_mapping_version", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pt_mapping_version")]
    public string PtMappingVersion { get; set; }

    /// <summary>
    /// A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)
    /// </summary>
    /// <value>A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)</value>
    [DataMember(Name="transport_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transport_type")]
    public int? TransportType { get; set; }

    /// <summary>
    /// Formated date string of applicable date
    /// </summary>
    /// <value>Formated date string of applicable date</value>
    [DataMember(Name="applicable_local_date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "applicable_local_date")]
    public string ApplicableLocalDate { get; set; }

    /// <summary>
    /// True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.
    /// </summary>
    /// <value>True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.</value>
    [DataMember(Name="exists", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "exists")]
    public bool? Exists { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3DynamoDbTimetable {\n");
      sb.Append("  TableName: ").Append(TableName).Append("\n");
      sb.Append("  ParserVersion: ").Append(ParserVersion).Append("\n");
      sb.Append("  ParserMappingVersion: ").Append(ParserMappingVersion).Append("\n");
      sb.Append("  PtVersion: ").Append(PtVersion).Append("\n");
      sb.Append("  PtMappingVersion: ").Append(PtMappingVersion).Append("\n");
      sb.Append("  TransportType: ").Append(TransportType).Append("\n");
      sb.Append("  ApplicableLocalDate: ").Append(ApplicableLocalDate).Append("\n");
      sb.Append("  Exists: ").Append(Exists).Append("\n");
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
