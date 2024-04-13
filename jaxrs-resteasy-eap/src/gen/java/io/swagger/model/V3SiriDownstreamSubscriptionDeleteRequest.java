package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
public class V3SiriDownstreamSubscriptionDeleteRequest   {
  private String subscriberRef = null;
  private List<String> subscriptionRef = new ArrayList<String>();

  /**
   * Siri Subscriber Ref
   **/
  
  @Schema(required = true, description = "Siri Subscriber Ref")
  @JsonProperty("subscriber_ref")
  @NotNull
  public String getSubscriberRef() {
    return subscriberRef;
  }
  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }

  /**
   * Siri Subscription Reference(s) - Unique to a Subscriber Ref.  If &#x60;null&#x60;, then all subscriptions will be terminated for the referenced Subscriber.
   **/
  
  @Schema(description = "Siri Subscription Reference(s) - Unique to a Subscriber Ref.  If `null`, then all subscriptions will be terminated for the referenced Subscriber.")
  @JsonProperty("subscription_ref")
  public List<String> getSubscriptionRef() {
    return subscriptionRef;
  }
  public void setSubscriptionRef(List<String> subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriDownstreamSubscriptionDeleteRequest v3SiriDownstreamSubscriptionDeleteRequest = (V3SiriDownstreamSubscriptionDeleteRequest) o;
    return Objects.equals(subscriberRef, v3SiriDownstreamSubscriptionDeleteRequest.subscriberRef) &&
        Objects.equals(subscriptionRef, v3SiriDownstreamSubscriptionDeleteRequest.subscriptionRef);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
