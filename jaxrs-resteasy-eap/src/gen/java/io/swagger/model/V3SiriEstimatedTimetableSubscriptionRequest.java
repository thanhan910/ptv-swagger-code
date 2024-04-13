package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.V3SiriSubscriptionTopic;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
public class V3SiriEstimatedTimetableSubscriptionRequest   {
  private String previewInterval = null;
  private String subscriberRef = null;
  private String subscriptionRef = null;
  /**
   * Siri Message Format &#x27;xml&#x27; or &#x27;json&#x27;
   */
  public enum SiriFormatEnum {
    NUMBER_0(0),
    NUMBER_1(1);
    private Integer value;

    SiriFormatEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SiriFormatEnum siriFormat = null;
  private String siriVersion = null;
  private String consumerAddress = null;
  private Date initialTerminationTime = null;
  private List<V3SiriSubscriptionTopic> topics = new ArrayList<V3SiriSubscriptionTopic>();

  /**
   * Siri Preview Interval
   **/
  
  @Schema(required = true, description = "Siri Preview Interval")
  @JsonProperty("preview_interval")
  @NotNull
  public String getPreviewInterval() {
    return previewInterval;
  }
  public void setPreviewInterval(String previewInterval) {
    this.previewInterval = previewInterval;
  }

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
   * Siri Subscription Ref - Unique to a Subscriber Ref
   **/
  
  @Schema(required = true, description = "Siri Subscription Ref - Unique to a Subscriber Ref")
  @JsonProperty("subscription_ref")
  @NotNull
  public String getSubscriptionRef() {
    return subscriptionRef;
  }
  public void setSubscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }

  /**
   * Siri Message Format &#x27;xml&#x27; or &#x27;json&#x27;
   **/
  
  @Schema(required = true, description = "Siri Message Format 'xml' or 'json'")
  @JsonProperty("siri_format")
  @NotNull
  public SiriFormatEnum getSiriFormat() {
    return siriFormat;
  }
  public void setSiriFormat(SiriFormatEnum siriFormat) {
    this.siriFormat = siriFormat;
  }

  /**
   * Siri Message Version &#x27;1.3&#x27; or &#x27;2.0&#x27;
   **/
  
  @Schema(required = true, description = "Siri Message Version '1.3' or '2.0'")
  @JsonProperty("siri_version")
  @NotNull
  @Pattern(regexp="1.3|2.0")
  public String getSiriVersion() {
    return siriVersion;
  }
  public void setSiriVersion(String siriVersion) {
    this.siriVersion = siriVersion;
  }

  /**
   * Siri Consumer Address - Baseline and Updates will be sent to this address
   **/
  
  @Schema(required = true, description = "Siri Consumer Address - Baseline and Updates will be sent to this address")
  @JsonProperty("consumer_address")
  @NotNull
  public String getConsumerAddress() {
    return consumerAddress;
  }
  public void setConsumerAddress(String consumerAddress) {
    this.consumerAddress = consumerAddress;
  }

  /**
   * Siri Initial Termination Time - Expiry of the subscription
   **/
  
  @Schema(required = true, description = "Siri Initial Termination Time - Expiry of the subscription")
  @JsonProperty("initial_termination_time")
  @NotNull
  public Date getInitialTerminationTime() {
    return initialTerminationTime;
  }
  public void setInitialTerminationTime(Date initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
  }

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("topics")
  @NotNull
  public List<V3SiriSubscriptionTopic> getTopics() {
    return topics;
  }
  public void setTopics(List<V3SiriSubscriptionTopic> topics) {
    this.topics = topics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriEstimatedTimetableSubscriptionRequest v3SiriEstimatedTimetableSubscriptionRequest = (V3SiriEstimatedTimetableSubscriptionRequest) o;
    return Objects.equals(previewInterval, v3SiriEstimatedTimetableSubscriptionRequest.previewInterval) &&
        Objects.equals(subscriberRef, v3SiriEstimatedTimetableSubscriptionRequest.subscriberRef) &&
        Objects.equals(subscriptionRef, v3SiriEstimatedTimetableSubscriptionRequest.subscriptionRef) &&
        Objects.equals(siriFormat, v3SiriEstimatedTimetableSubscriptionRequest.siriFormat) &&
        Objects.equals(siriVersion, v3SiriEstimatedTimetableSubscriptionRequest.siriVersion) &&
        Objects.equals(consumerAddress, v3SiriEstimatedTimetableSubscriptionRequest.consumerAddress) &&
        Objects.equals(initialTerminationTime, v3SiriEstimatedTimetableSubscriptionRequest.initialTerminationTime) &&
        Objects.equals(topics, v3SiriEstimatedTimetableSubscriptionRequest.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previewInterval, subscriberRef, subscriptionRef, siriFormat, siriVersion, consumerAddress, initialTerminationTime, topics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriEstimatedTimetableSubscriptionRequest {\n");
    
    sb.append("    previewInterval: ").append(toIndentedString(previewInterval)).append("\n");
    sb.append("    subscriberRef: ").append(toIndentedString(subscriberRef)).append("\n");
    sb.append("    subscriptionRef: ").append(toIndentedString(subscriptionRef)).append("\n");
    sb.append("    siriFormat: ").append(toIndentedString(siriFormat)).append("\n");
    sb.append("    siriVersion: ").append(toIndentedString(siriVersion)).append("\n");
    sb.append("    consumerAddress: ").append(toIndentedString(consumerAddress)).append("\n");
    sb.append("    initialTerminationTime: ").append(toIndentedString(initialTerminationTime)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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
