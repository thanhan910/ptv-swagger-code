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
  public class V3SiriDownstreamSubscriptionDeleteRequest {
    /// <summary>
    /// Siri Subscriber Ref
    /// </summary>
    /// <value>Siri Subscriber Ref</value>
    [DataMember(Name="subscriber_ref", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subscriber_ref")]
    public string SubscriberRef { get; set; }

    /// <summary>
    /// Siri Subscription Reference(s) - Unique to a Subscriber Ref.  If `null`, then all subscriptions will be terminated for the referenced Subscriber.
    /// </summary>
    /// <value>Siri Subscription Reference(s) - Unique to a Subscriber Ref.  If `null`, then all subscriptions will be terminated for the referenced Subscriber.</value>
    [DataMember(Name="subscription_ref", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subscription_ref")]
    public List<string> SubscriptionRef { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class V3SiriDownstreamSubscriptionDeleteRequest {\n");
      sb.Append("  SubscriberRef: ").Append(SubscriberRef).Append("\n");
      sb.Append("  SubscriptionRef: ").Append(SubscriptionRef).Append("\n");
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
