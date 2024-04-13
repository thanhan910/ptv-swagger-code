package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3SiriDownstreamSubscriptionDeleteRequest   {
  @JsonProperty("subscriber_ref")
  private String subscriberRef = null;
  @JsonProperty("subscription_ref")
  private List<String> subscriptionRef = null;
  /**
   * Siri Subscriber Ref
   **/
  public V3SiriDownstreamSubscriptionDeleteRequest subscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
    return this;
  }

  
  @Schema(required = true, description = "Siri Subscriber Ref")
  @JsonProperty("subscriber_ref")
  public String getSubscriberRef() {
    return subscriberRef;
  }
  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }

  /**
   * Siri Subscription Reference(s) - Unique to a Subscriber Ref.  If `null`, then all subscriptions will be terminated for the referenced Subscriber.
   **/
  public V3SiriDownstreamSubscriptionDeleteRequest subscriptionRef(List<String> subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
    return this;
  }

  
  @Schema(description = "Siri Subscription Reference(s) - Unique to a Subscriber Ref.  If `null`, then all subscriptions will be terminated for the referenced Subscriber.")
  @JsonProperty("subscription_ref")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
