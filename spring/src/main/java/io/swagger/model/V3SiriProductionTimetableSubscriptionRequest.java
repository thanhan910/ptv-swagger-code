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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3SiriProductionTimetableSubscriptionRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3SiriProductionTimetableSubscriptionRequest   {
  @JsonProperty("start_time")
  private OffsetDateTime startTime = null;

  @JsonProperty("end_time")
  private OffsetDateTime endTime = null;

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

  public V3SiriProductionTimetableSubscriptionRequest startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Siri Start Time of the Validity Period
   * @return startTime
   **/
  @Schema(required = true, description = "Siri Start Time of the Validity Period")
      @NotNull

    @Valid
    public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public V3SiriProductionTimetableSubscriptionRequest endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Siri End Time of the Validity Period
   * @return endTime
   **/
  @Schema(required = true, description = "Siri End Time of the Validity Period")
      @NotNull

    @Valid
    public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public V3SiriProductionTimetableSubscriptionRequest subscriberRef(String subscriberRef) {
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

  public V3SiriProductionTimetableSubscriptionRequest subscriptionRef(String subscriptionRef) {
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

  public V3SiriProductionTimetableSubscriptionRequest siriFormat(SiriFormatEnum siriFormat) {
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

  public V3SiriProductionTimetableSubscriptionRequest siriVersion(String siriVersion) {
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

  public V3SiriProductionTimetableSubscriptionRequest consumerAddress(String consumerAddress) {
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

  public V3SiriProductionTimetableSubscriptionRequest initialTerminationTime(OffsetDateTime initialTerminationTime) {
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

  public V3SiriProductionTimetableSubscriptionRequest topics(List<V3SiriSubscriptionTopic> topics) {
    this.topics = topics;
    return this;
  }

  public V3SiriProductionTimetableSubscriptionRequest addTopicsItem(V3SiriSubscriptionTopic topicsItem) {
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
    V3SiriProductionTimetableSubscriptionRequest v3SiriProductionTimetableSubscriptionRequest = (V3SiriProductionTimetableSubscriptionRequest) o;
    return Objects.equals(this.startTime, v3SiriProductionTimetableSubscriptionRequest.startTime) &&
        Objects.equals(this.endTime, v3SiriProductionTimetableSubscriptionRequest.endTime) &&
        Objects.equals(this.subscriberRef, v3SiriProductionTimetableSubscriptionRequest.subscriberRef) &&
        Objects.equals(this.subscriptionRef, v3SiriProductionTimetableSubscriptionRequest.subscriptionRef) &&
        Objects.equals(this.siriFormat, v3SiriProductionTimetableSubscriptionRequest.siriFormat) &&
        Objects.equals(this.siriVersion, v3SiriProductionTimetableSubscriptionRequest.siriVersion) &&
        Objects.equals(this.consumerAddress, v3SiriProductionTimetableSubscriptionRequest.consumerAddress) &&
        Objects.equals(this.initialTerminationTime, v3SiriProductionTimetableSubscriptionRequest.initialTerminationTime) &&
        Objects.equals(this.topics, v3SiriProductionTimetableSubscriptionRequest.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, subscriberRef, subscriptionRef, siriFormat, siriVersion, consumerAddress, initialTerminationTime, topics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriProductionTimetableSubscriptionRequest {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
