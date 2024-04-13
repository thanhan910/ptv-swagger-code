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
  public class V3Disruptions {
    /// <summary>
    /// Subset of disruption information applicable to multiple route_types
    /// </summary>
    /// <value>Subset of disruption information applicable to multiple route_types</value>
    [DataMember(Name="general", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "general")]
    public List<V3Disruption> General { get; set; }

    /// <summary>
    /// Subset of disruption information applicable to metropolitan train
    /// </summary>
    /// <value>Subset of disruption information applicable to metropolitan train</value>
    [DataMember(Name="metro_train", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "metro_train")]
    public List<V3Disruption> MetroTrain { get; set; }

    /// <summary>
    /// Subset of disruption information applicable to metropolitan tram
    /// </summary>
    /// <value>Subset of disruption information applicable to metropolitan tram</value>
    [DataMember(Name="metro_tram", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "metro_tram")]
    public List<V3Disruption> MetroTram { get; set; }

    /// <summary>
    /// Subset of disruption information applicable to metropolitan bus
    /// </summary>
    /// <value>Subset of disruption information applicable to metropolitan bus</value>
    [DataMember(Name="metro_bus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "metro_bus")]
    public List<V3Disruption> MetroBus { get; set; }

    /// <summary>
    /// Subset of disruption information applicable to V/Line train
    /// </summary>
    /// <value>Subset of disruption information applicable to V/Line train</value>
    [DataMember(Name="regional_train", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "regional_train")]
    public List<V3Disruption> RegionalTrain { get; set; }

    /// <summary>
    /// Subset of disruption information applicable to V/Line coach
    /// </summary>
    /// <value>Subset of disruption information applicable to V/Line coach</value>
    [DataMember(Name="regional_coach", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "regional_coach")]
    public List<V3Disruption> RegionalCoach { get; set; }

    /// <summary>
    /// Subset of disruption information applicable to regional bus
    /// </summary>
    /// <value>Subset of disruption information applicable to regional bus</value>
    [DataMember(Name="regional_bus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "regional_bus")]
    public List<V3Disruption> RegionalBus { get; set; }

    /// <summary>
    /// Subset of disruption information applicable to school bus
    /// </summary>
    /// <value>Subset of disruption information applicable to school bus</value>
    [DataMember(Name="school_bus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "school_bus")]
    public List<V3Disruption> SchoolBus { get; set; }

    /// <summary>
    /// Subset of disruption information applicable to telebus services
    /// </summary>
    /// <value>Subset of disruption information applicable to telebus services</value>
    [DataMember(Name="telebus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "telebus")]
    public List<V3Disruption> Telebus { get; set; }

    /// <summary>
    /// Subset of disruption information applicable to night bus
    /// </summary>
    /// <value>Subset of disruption information applicable to night bus</value>
    [DataMember(Name="night_bus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "night_bus")]
    public List<V3Disruption> NightBus { get; set; }

    /// <summary>
    /// Subset of disruption information applicable to ferry
    /// </summary>
    /// <value>Subset of disruption information applicable to ferry</value>
    [DataMember(Name="ferry", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ferry")]
    public List<V3Disruption> Ferry { get; set; }

    /// <summary>
    /// Subset of disruption information applicable to interstate train
    /// </summary>
    /// <value>Subset of disruption information applicable to interstate train</value>
    [DataMember(Name="interstate_train", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "interstate_train")]
    public List<V3Disruption> InterstateTrain { get; set; }

    /// <summary>
    /// Subset of disruption information applicable to skybus
    /// </summary>
    /// <value>Subset of disruption information applicable to skybus</value>
    [DataMember(Name="skybus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "skybus")]
    public List<V3Disruption> Skybus { get; set; }

    /// <summary>
    /// Subset of disruption information applicable to taxi
    /// </summary>
    /// <value>Subset of disruption information applicable to taxi</value>
    [DataMember(Name="taxi", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxi")]
    public List<V3Disruption> Taxi { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3Disruptions {\n");
      sb.Append("  General: ").Append(General).Append("\n");
      sb.Append("  MetroTrain: ").Append(MetroTrain).Append("\n");
      sb.Append("  MetroTram: ").Append(MetroTram).Append("\n");
      sb.Append("  MetroBus: ").Append(MetroBus).Append("\n");
      sb.Append("  RegionalTrain: ").Append(RegionalTrain).Append("\n");
      sb.Append("  RegionalCoach: ").Append(RegionalCoach).Append("\n");
      sb.Append("  RegionalBus: ").Append(RegionalBus).Append("\n");
      sb.Append("  SchoolBus: ").Append(SchoolBus).Append("\n");
      sb.Append("  Telebus: ").Append(Telebus).Append("\n");
      sb.Append("  NightBus: ").Append(NightBus).Append("\n");
      sb.Append("  Ferry: ").Append(Ferry).Append("\n");
      sb.Append("  InterstateTrain: ").Append(InterstateTrain).Append("\n");
      sb.Append("  Skybus: ").Append(Skybus).Append("\n");
      sb.Append("  Taxi: ").Append(Taxi).Append("\n");
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
