package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3SiriDownstreamSubscriptionDeleteRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3SiriDownstreamSubscriptionDeleteRequest   {
  private String subscriberRef = null;

  
  private List<String> subscriptionRef = null;

  public V3SiriDownstreamSubscriptionDeleteRequest subscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
    return this;
  }

  /**
   * Siri Subscriber Ref
   * @return subscriberRef
   **/
    public String getSubscriberRef() {
    return subscriberRef;
  }

  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }

  public V3SiriDownstreamSubscriptionDeleteRequest subscriptionRef(List<String> subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
    return this;
  }

  public V3SiriDownstreamSubscriptionDeleteRequest addSubscriptionRefItem(String subscriptionRefItem) {
    if (this.subscriptionRef == null) {
      this.subscriptionRef = new ArrayList<String>();
    }
    this.subscriptionRef.add(subscriptionRefItem);
    return this;
  }

  /**
   * Siri Subscription Reference(s) - Unique to a Subscriber Ref.  If `null`, then all subscriptions will be terminated for the referenced Subscriber.
   * @return subscriptionRef
   **/
    public List<String> getSubscriptionRef() {
    return subscriptionRef;
  }

  public void setSubscriptionRef(List<String> subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriDownstreamSubscriptionDeleteRequest v3SiriDownstreamSubscriptionDeleteRequest = (V3SiriDownstreamSubscriptionDeleteRequest) o;
    return Objects.equals(this.subscriberRef, v3SiriDownstreamSubscriptionDeleteRequest.subscriberRef) &&
        Objects.equals(this.subscriptionRef, v3SiriDownstreamSubscriptionDeleteRequest.subscriptionRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberRef, subscriptionRef);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
