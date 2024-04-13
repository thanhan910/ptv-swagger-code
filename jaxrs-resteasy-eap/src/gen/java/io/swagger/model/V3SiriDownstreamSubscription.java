package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.V3SiriDownstreamSubscriptionTopic;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
public class V3SiriDownstreamSubscription   {
  private String subscriberRef = null;
  private String subscriptionRef = null;
  /**
   * Gets or Sets messageType
   */
  public enum MessageTypeEnum {
    NUMBER_0(0),
    NUMBER_1(1);
    private Integer value;

    MessageTypeEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessageTypeEnum messageType = null;
  /**
   * Gets or Sets siriFormat
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
  private Date validityPeriodStart = null;
  private Date validityPeriodEnd = null;
  private String previewInterval = null;
  private List<V3SiriDownstreamSubscriptionTopic> topics = new ArrayList<V3SiriDownstreamSubscriptionTopic>();

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("subscriber_ref")
  public String getSubscriberRef() {
    return subscriberRef;
  }
  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("subscription_ref")
  public String getSubscriptionRef() {
    return subscriptionRef;
  }
  public void setSubscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("message_type")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("siri_format")
  public SiriFormatEnum getSiriFormat() {
    return siriFormat;
  }
  public void setSiriFormat(SiriFormatEnum siriFormat) {
    this.siriFormat = siriFormat;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("siri_version")
  @Pattern(regexp="1.3|2.0")
  public String getSiriVersion() {
    return siriVersion;
  }
  public void setSiriVersion(String siriVersion) {
    this.siriVersion = siriVersion;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("consumer_address")
  public String getConsumerAddress() {
    return consumerAddress;
  }
  public void setConsumerAddress(String consumerAddress) {
    this.consumerAddress = consumerAddress;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("initial_termination_time")
  public Date getInitialTerminationTime() {
    return initialTerminationTime;
  }
  public void setInitialTerminationTime(Date initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("validity_period_start")
  public Date getValidityPeriodStart() {
    return validityPeriodStart;
  }
  public void setValidityPeriodStart(Date validityPeriodStart) {
    this.validityPeriodStart = validityPeriodStart;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("validity_period_end")
  public Date getValidityPeriodEnd() {
    return validityPeriodEnd;
  }
  public void setValidityPeriodEnd(Date validityPeriodEnd) {
    this.validityPeriodEnd = validityPeriodEnd;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("preview_interval")
  public String getPreviewInterval() {
    return previewInterval;
  }
  public void setPreviewInterval(String previewInterval) {
    this.previewInterval = previewInterval;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("topics")
  public List<V3SiriDownstreamSubscriptionTopic> getTopics() {
    return topics;
  }
  public void setTopics(List<V3SiriDownstreamSubscriptionTopic> topics) {
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
    V3SiriDownstreamSubscription v3SiriDownstreamSubscription = (V3SiriDownstreamSubscription) o;
    return Objects.equals(subscriberRef, v3SiriDownstreamSubscription.subscriberRef) &&
        Objects.equals(subscriptionRef, v3SiriDownstreamSubscription.subscriptionRef) &&
        Objects.equals(messageType, v3SiriDownstreamSubscription.messageType) &&
        Objects.equals(siriFormat, v3SiriDownstreamSubscription.siriFormat) &&
        Objects.equals(siriVersion, v3SiriDownstreamSubscription.siriVersion) &&
        Objects.equals(consumerAddress, v3SiriDownstreamSubscription.consumerAddress) &&
        Objects.equals(initialTerminationTime, v3SiriDownstreamSubscription.initialTerminationTime) &&
        Objects.equals(validityPeriodStart, v3SiriDownstreamSubscription.validityPeriodStart) &&
        Objects.equals(validityPeriodEnd, v3SiriDownstreamSubscription.validityPeriodEnd) &&
        Objects.equals(previewInterval, v3SiriDownstreamSubscription.previewInterval) &&
        Objects.equals(topics, v3SiriDownstreamSubscription.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberRef, subscriptionRef, messageType, siriFormat, siriVersion, consumerAddress, initialTerminationTime, validityPeriodStart, validityPeriodEnd, previewInterval, topics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriDownstreamSubscription {\n");
    
    sb.append("    subscriberRef: ").append(toIndentedString(subscriberRef)).append("\n");
    sb.append("    subscriptionRef: ").append(toIndentedString(subscriptionRef)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    siriFormat: ").append(toIndentedString(siriFormat)).append("\n");
    sb.append("    siriVersion: ").append(toIndentedString(siriVersion)).append("\n");
    sb.append("    consumerAddress: ").append(toIndentedString(consumerAddress)).append("\n");
    sb.append("    initialTerminationTime: ").append(toIndentedString(initialTerminationTime)).append("\n");
    sb.append("    validityPeriodStart: ").append(toIndentedString(validityPeriodStart)).append("\n");
    sb.append("    validityPeriodEnd: ").append(toIndentedString(validityPeriodEnd)).append("\n");
    sb.append("    previewInterval: ").append(toIndentedString(previewInterval)).append("\n");
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
