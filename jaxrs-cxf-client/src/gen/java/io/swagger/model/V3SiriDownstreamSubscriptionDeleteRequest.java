package io.swagger.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class V3SiriDownstreamSubscriptionDeleteRequest   {
  
  @Schema(required = true, description = "Siri Subscriber Ref")
 /**
   * Siri Subscriber Ref  
  **/
  private String subscriberRef = null;
  
  @Schema(description = "Siri Subscription Reference(s) - Unique to a Subscriber Ref.  If `null`, then all subscriptions will be terminated for the referenced Subscriber.")
 /**
   * Siri Subscription Reference(s) - Unique to a Subscriber Ref.  If `null`, then all subscriptions will be terminated for the referenced Subscriber.  
  **/
  private List<String> subscriptionRef = null;
 /**
   * Siri Subscriber Ref
   * @return subscriberRef
  **/
  @JsonProperty("subscriber_ref")
  public String getSubscriberRef() {
    return subscriberRef;
  }

  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }

  public V3SiriDownstreamSubscriptionDeleteRequest subscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
    return this;
  }

 /**
   * Siri Subscription Reference(s) - Unique to a Subscriber Ref.  If &#x60;null&#x60;, then all subscriptions will be terminated for the referenced Subscriber.
   * @return subscriptionRef
  **/
  @JsonProperty("subscription_ref")
  public List<String> getSubscriptionRef() {
    return subscriptionRef;
  }

  public void setSubscriptionRef(List<String> subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }

  public V3SiriDownstreamSubscriptionDeleteRequest subscriptionRef(List<String> subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
    return this;
  }

  public V3SiriDownstreamSubscriptionDeleteRequest addSubscriptionRefItem(String subscriptionRefItem) {
    this.subscriptionRef.add(subscriptionRefItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriDownstreamSubscriptionDeleteRequest {\n");
    
    sb.append("    subscriberRef: ").append(toIndentedString(subscriberRef)).append("\n");
    sb.append("    subscriptionRef: ").append(toIndentedString(subscriptionRef)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
