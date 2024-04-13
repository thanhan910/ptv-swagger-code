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
  public class V3SiriEstimatedTimetableSubscriptionRequest {
    /// <summary>
    /// Siri Preview Interval
    /// </summary>
    /// <value>Siri Preview Interval</value>
    [DataMember(Name="preview_interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "preview_interval")]
    public string PreviewInterval { get; set; }

    /// <summary>
    /// Siri Subscriber Ref
    /// </summary>
    /// <value>Siri Subscriber Ref</value>
    [DataMember(Name="subscriber_ref", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subscriber_ref")]
    public string SubscriberRef { get; set; }

    /// <summary>
    /// Siri Subscription Ref - Unique to a Subscriber Ref
    /// </summary>
    /// <value>Siri Subscription Ref - Unique to a Subscriber Ref</value>
    [DataMember(Name="subscription_ref", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subscription_ref")]
    public string SubscriptionRef { get; set; }

    /// <summary>
    /// Siri Message Format 'xml' or 'json'
    /// </summary>
    /// <value>Siri Message Format 'xml' or 'json'</value>
    [DataMember(Name="siri_format", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "siri_format")]
    public int? SiriFormat { get; set; }

    /// <summary>
    /// Siri Message Version '1.3' or '2.0'
    /// </summary>
    /// <value>Siri Message Version '1.3' or '2.0'</value>
    [DataMember(Name="siri_version", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "siri_version")]
    public string SiriVersion { get; set; }

    /// <summary>
    /// Siri Consumer Address - Baseline and Updates will be sent to this address
    /// </summary>
    /// <value>Siri Consumer Address - Baseline and Updates will be sent to this address</value>
    [DataMember(Name="consumer_address", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "consumer_address")]
    public string ConsumerAddress { get; set; }

    /// <summary>
    /// Siri Initial Termination Time - Expiry of the subscription
    /// </summary>
    /// <value>Siri Initial Termination Time - Expiry of the subscription</value>
    [DataMember(Name="initial_termination_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "initial_termination_time")]
    public DateTime? InitialTerminationTime { get; set; }

    /// <summary>
    /// Gets or Sets Topics
    /// </summary>
    [DataMember(Name="topics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "topics")]
    public List<V3SiriSubscriptionTopic> Topics { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3SiriEstimatedTimetableSubscriptionRequest {\n");
      sb.Append("  PreviewInterval: ").Append(PreviewInterval).Append("\n");
      sb.Append("  SubscriberRef: ").Append(SubscriberRef).Append("\n");
      sb.Append("  SubscriptionRef: ").Append(SubscriptionRef).Append("\n");
      sb.Append("  SiriFormat: ").Append(SiriFormat).Append("\n");
      sb.Append("  SiriVersion: ").Append(SiriVersion).Append("\n");
      sb.Append("  ConsumerAddress: ").Append(ConsumerAddress).Append("\n");
      sb.Append("  InitialTerminationTime: ").Append(InitialTerminationTime).Append("\n");
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
