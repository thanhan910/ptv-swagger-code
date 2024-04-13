package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.V3SiriSubscriptionTopic;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3SiriEstimatedTimetableSubscriptionRequest
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3SiriEstimatedTimetableSubscriptionRequest   {
  @JsonProperty("preview_interval")
  private String previewInterval = null;

  @JsonProperty("subscriber_ref")
  private String subscriberRef = null;

  @JsonProperty("subscription_ref")
  private String subscriptionRef = null;

  /**
   * Siri Message Format 'xml' or 'json'
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

    @JsonCreator
    public static SiriFormatEnum fromValue(String text) {
      for (SiriFormatEnum b : SiriFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("siri_format")
  private SiriFormatEnum siriFormat = null;

  @JsonProperty("siri_version")
  private String siriVersion = null;

  @JsonProperty("consumer_address")
  private String consumerAddress = null;

  @JsonProperty("initial_termination_time")
  private OffsetDateTime initialTerminationTime = null;

  @JsonProperty("topics")
  @Valid
  private List<V3SiriSubscriptionTopic> topics = new ArrayList<V3SiriSubscriptionTopic>();

  public V3SiriEstimatedTimetableSubscriptionRequest previewInterval(String previewInterval) {
    this.previewInterval = previewInterval;
    return this;
  }

  /**
   * Siri Preview Interval
   * @return previewInterval
  **/
  @Schema(required = true, description = "Siri Preview Interval")
  @NotNull

  public String getPreviewInterval() {
    return previewInterval;
  }

  public void setPreviewInterval(String previewInterval) {
    this.previewInterval = previewInterval;
  }

  public V3SiriEstimatedTimetableSubscriptionRequest subscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
    return this;
  }

  /**
   * Siri Subscriber Ref
   * @return subscriberRef
  **/
  @Schema(required = true, description = "Siri Subscriber Ref")
  @NotNull

  public String getSubscriberRef() {
    return subscriberRef;
  }

  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }

  public V3SiriEstimatedTimetableSubscriptionRequest subscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
    return this;
  }

  /**
   * Siri Subscription Ref - Unique to a Subscriber Ref
   * @return subscriptionRef
  **/
  @Schema(required = true, description = "Siri Subscription Ref - Unique to a Subscriber Ref")
  @NotNull

  public String getSubscriptionRef() {
    return subscriptionRef;
  }

  public void setSubscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }

  public V3SiriEstimatedTimetableSubscriptionRequest siriFormat(SiriFormatEnum siriFormat) {
    this.siriFormat = siriFormat;
    return this;
  }

  /**
   * Siri Message Format 'xml' or 'json'
   * @return siriFormat
  **/
  @Schema(required = true, description = "Siri Message Format 'xml' or 'json'")
  @NotNull

  public SiriFormatEnum getSiriFormat() {
    return siriFormat;
  }

  public void setSiriFormat(SiriFormatEnum siriFormat) {
    this.siriFormat = siriFormat;
  }

  public V3SiriEstimatedTimetableSubscriptionRequest siriVersion(String siriVersion) {
    this.siriVersion = siriVersion;
    return this;
  }

  /**
   * Siri Message Version '1.3' or '2.0'
   * @return siriVersion
  **/
  @Schema(required = true, description = "Siri Message Version '1.3' or '2.0'")
  @NotNull

@Pattern(regexp="1.3|2.0")   public String getSiriVersion() {
    return siriVersion;
  }

  public void setSiriVersion(String siriVersion) {
    this.siriVersion = siriVersion;
  }

  public V3SiriEstimatedTimetableSubscriptionRequest consumerAddress(String consumerAddress) {
    this.consumerAddress = consumerAddress;
    return this;
  }

  /**
   * Siri Consumer Address - Baseline and Updates will be sent to this address
   * @return consumerAddress
  **/
  @Schema(required = true, description = "Siri Consumer Address - Baseline and Updates will be sent to this address")
  @NotNull

  public String getConsumerAddress() {
    return consumerAddress;
  }

  public void setConsumerAddress(String consumerAddress) {
    this.consumerAddress = consumerAddress;
  }

  public V3SiriEstimatedTimetableSubscriptionRequest initialTerminationTime(OffsetDateTime initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
    return this;
  }

  /**
   * Siri Initial Termination Time - Expiry of the subscription
   * @return initialTerminationTime
  **/
  @Schema(required = true, description = "Siri Initial Termination Time - Expiry of the subscription")
  @NotNull

  @Valid
  public OffsetDateTime getInitialTerminationTime() {
    return initialTerminationTime;
  }

  public void setInitialTerminationTime(OffsetDateTime initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
  }

  public V3SiriEstimatedTimetableSubscriptionRequest topics(List<V3SiriSubscriptionTopic> topics) {
    this.topics = topics;
    return this;
  }

  public V3SiriEstimatedTimetableSubscriptionRequest addTopicsItem(V3SiriSubscriptionTopic topicsItem) {
    this.topics.add(topicsItem);
    return this;
  }

  /**
   * Get topics
   * @return topics
  **/
  @Schema(required = true, description = "")
  @NotNull
  @Valid
  public List<V3SiriSubscriptionTopic> getTopics() {
    return topics;
  }

  public void setTopics(List<V3SiriSubscriptionTopic> topics) {
    this.topics = topics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriEstimatedTimetableSubscriptionRequest v3SiriEstimatedTimetableSubscriptionRequest = (V3SiriEstimatedTimetableSubscriptionRequest) o;
    return Objects.equals(this.previewInterval, v3SiriEstimatedTimetableSubscriptionRequest.previewInterval) &&
        Objects.equals(this.subscriberRef, v3SiriEstimatedTimetableSubscriptionRequest.subscriberRef) &&
        Objects.equals(this.subscriptionRef, v3SiriEstimatedTimetableSubscriptionRequest.subscriptionRef) &&
        Objects.equals(this.siriFormat, v3SiriEstimatedTimetableSubscriptionRequest.siriFormat) &&
        Objects.equals(this.siriVersion, v3SiriEstimatedTimetableSubscriptionRequest.siriVersion) &&
        Objects.equals(this.consumerAddress, v3SiriEstimatedTimetableSubscriptionRequest.consumerAddress) &&
        Objects.equals(this.initialTerminationTime, v3SiriEstimatedTimetableSubscriptionRequest.initialTerminationTime) &&
        Objects.equals(this.topics, v3SiriEstimatedTimetableSubscriptionRequest.topics);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
