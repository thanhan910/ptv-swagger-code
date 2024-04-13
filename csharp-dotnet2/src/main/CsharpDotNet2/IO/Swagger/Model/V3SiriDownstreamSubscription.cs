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
  public class V3SiriDownstreamSubscription {
    /// <summary>
    /// Gets or Sets SubscriberRef
    /// </summary>
    [DataMember(Name="subscriber_ref", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subscriber_ref")]
    public string SubscriberRef { get; set; }

    /// <summary>
    /// Gets or Sets SubscriptionRef
    /// </summary>
    [DataMember(Name="subscription_ref", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subscription_ref")]
    public string SubscriptionRef { get; set; }

    /// <summary>
    /// Gets or Sets MessageType
    /// </summary>
    [DataMember(Name="message_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "message_type")]
    public int? MessageType { get; set; }

    /// <summary>
    /// Gets or Sets SiriFormat
    /// </summary>
    [DataMember(Name="siri_format", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "siri_format")]
    public int? SiriFormat { get; set; }

    /// <summary>
    /// Gets or Sets SiriVersion
    /// </summary>
    [DataMember(Name="siri_version", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "siri_version")]
    public string SiriVersion { get; set; }

    /// <summary>
    /// Gets or Sets ConsumerAddress
    /// </summary>
    [DataMember(Name="consumer_address", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "consumer_address")]
    public string ConsumerAddress { get; set; }

    /// <summary>
    /// Gets or Sets InitialTerminationTime
    /// </summary>
    [DataMember(Name="initial_termination_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "initial_termination_time")]
    public DateTime? InitialTerminationTime { get; set; }

    /// <summary>
    /// Gets or Sets ValidityPeriodStart
    /// </summary>
    [DataMember(Name="validity_period_start", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "validity_period_start")]
    public DateTime? ValidityPeriodStart { get; set; }

    /// <summary>
    /// Gets or Sets ValidityPeriodEnd
    /// </summary>
    [DataMember(Name="validity_period_end", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "validity_period_end")]
    public DateTime? ValidityPeriodEnd { get; set; }

    /// <summary>
    /// Gets or Sets PreviewInterval
    /// </summary>
    [DataMember(Name="preview_interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "preview_interval")]
    public string PreviewInterval { get; set; }

    /// <summary>
    /// Gets or Sets Topics
    /// </summary>
    [DataMember(Name="topics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "topics")]
    public List<V3SiriDownstreamSubscriptionTopic> Topics { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3SiriDownstreamSubscription {\n");
      sb.Append("  SubscriberRef: ").Append(SubscriberRef).Append("\n");
      sb.Append("  SubscriptionRef: ").Append(SubscriptionRef).Append("\n");
      sb.Append("  MessageType: ").Append(MessageType).Append("\n");
      sb.Append("  SiriFormat: ").Append(SiriFormat).Append("\n");
      sb.Append("  SiriVersion: ").Append(SiriVersion).Append("\n");
      sb.Append("  ConsumerAddress: ").Append(ConsumerAddress).Append("\n");
      sb.Append("  InitialTerminationTime: ").Append(InitialTerminationTime).Append("\n");
      sb.Append("  ValidityPeriodStart: ").Append(ValidityPeriodStart).Append("\n");
      sb.Append("  ValidityPeriodEnd: ").Append(ValidityPeriodEnd).Append("\n");
      sb.Append("  PreviewInterval: ").Append(PreviewInterval).Append("\n");
      sb.Append("  Topics: ").Append(Topics).Append("\n");
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
