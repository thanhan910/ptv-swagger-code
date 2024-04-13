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
  public class V3StopTicket {
    /// <summary>
    /// Indicates the ticket type for the stop (myki, paper or both)
    /// </summary>
    /// <value>Indicates the ticket type for the stop (myki, paper or both)</value>
    [DataMember(Name="ticket_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ticket_type")]
    public string TicketType { get; set; }

    /// <summary>
    /// Description of the zone
    /// </summary>
    /// <value>Description of the zone</value>
    [DataMember(Name="zone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "zone")]
    public string Zone { get; set; }

    /// <summary>
    /// Indicates whether the stop is inside the free fare zone
    /// </summary>
    /// <value>Indicates whether the stop is inside the free fare zone</value>
    [DataMember(Name="is_free_fare_zone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_free_fare_zone")]
    public bool? IsFreeFareZone { get; set; }

    /// <summary>
    /// Gets or Sets TicketMachine
    /// </summary>
    [DataMember(Name="ticket_machine", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ticket_machine")]
    public bool? TicketMachine { get; set; }

    /// <summary>
    /// Gets or Sets TicketChecks
    /// </summary>
    [DataMember(Name="ticket_checks", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ticket_checks")]
    public bool? TicketChecks { get; set; }

    /// <summary>
    /// Gets or Sets VlineReservation
    /// </summary>
    [DataMember(Name="vline_reservation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vline_reservation")]
    public bool? VlineReservation { get; set; }

    /// <summary>
    /// Gets or Sets TicketZones
    /// </summary>
    [DataMember(Name="ticket_zones", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ticket_zones")]
    public List<int?> TicketZones { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3StopTicket {\n");
      sb.Append("  TicketType: ").Append(TicketType).Append("\n");
      sb.Append("  Zone: ").Append(Zone).Append("\n");
      sb.Append("  IsFreeFareZone: ").Append(IsFreeFareZone).Append("\n");
      sb.Append("  TicketMachine: ").Append(TicketMachine).Append("\n");
      sb.Append("  TicketChecks: ").Append(TicketChecks).Append("\n");
      sb.Append("  VlineReservation: ").Append(VlineReservation).Append("\n");
      sb.Append("  TicketZones: ").Append(TicketZones).Append("\n");
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
