package io.swagger.model;

import io.swagger.model.V3SiriDownstreamSubscriptionTopic;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3SiriDownstreamSubscription   {

  private @Valid String subscriberRef = null;

  private @Valid String subscriptionRef = null;

public enum MessageTypeEnum {

    NUMBER_0(Integer.valueOf(0)), NUMBER_1(Integer.valueOf(1));


    private Integer value;

    MessageTypeEnum (Integer v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static MessageTypeEnum fromValue(String v) {
        for (MessageTypeEnum b : MessageTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private @Valid MessageTypeEnum messageType = null;

public enum SiriFormatEnum {

    NUMBER_0(Integer.valueOf(0)), NUMBER_1(Integer.valueOf(1));


    private Integer value;

    SiriFormatEnum (Integer v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static SiriFormatEnum fromValue(String v) {
        for (SiriFormatEnum b : SiriFormatEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private @Valid SiriFormatEnum siriFormat = null;

  private @Valid String siriVersion = null;

  private @Valid String consumerAddress = null;

  private @Valid Date initialTerminationTime = null;

  private @Valid Date validityPeriodStart = null;

  private @Valid Date validityPeriodEnd = null;

  private @Valid String previewInterval = null;

  private @Valid List<V3SiriDownstreamSubscriptionTopic> topics = new ArrayList<V3SiriDownstreamSubscriptionTopic>();

  /**
   **/
  public V3SiriDownstreamSubscription subscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("subscriber_ref")

  public String getSubscriberRef() {
    return subscriberRef;
  }
  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }

  /**
   **/
  public V3SiriDownstreamSubscription subscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("subscription_ref")

  public String getSubscriptionRef() {
    return subscriptionRef;
  }
  public void setSubscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }

  /**
   **/
  public V3SiriDownstreamSubscription messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("message_type")

  public MessageTypeEnum getMessageType() {
    return messageType;
  }
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  /**
   **/
  public V3SiriDownstreamSubscription siriFormat(SiriFormatEnum siriFormat) {
    this.siriFormat = siriFormat;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("siri_format")

  public SiriFormatEnum getSiriFormat() {
    return siriFormat;
  }
  public void setSiriFormat(SiriFormatEnum siriFormat) {
    this.siriFormat = siriFormat;
  }

  /**
   **/
  public V3SiriDownstreamSubscription siriVersion(String siriVersion) {
    this.siriVersion = siriVersion;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
  public V3SiriDownstreamSubscription consumerAddress(String consumerAddress) {
    this.consumerAddress = consumerAddress;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("consumer_address")

  public String getConsumerAddress() {
    return consumerAddress;
  }
  public void setConsumerAddress(String consumerAddress) {
    this.consumerAddress = consumerAddress;
  }

  /**
   **/
  public V3SiriDownstreamSubscription initialTerminationTime(Date initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("initial_termination_time")

  public Date getInitialTerminationTime() {
    return initialTerminationTime;
  }
  public void setInitialTerminationTime(Date initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
  }

  /**
   **/
  public V3SiriDownstreamSubscription validityPeriodStart(Date validityPeriodStart) {
    this.validityPeriodStart = validityPeriodStart;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("validity_period_start")

  public Date getValidityPeriodStart() {
    return validityPeriodStart;
  }
  public void setValidityPeriodStart(Date validityPeriodStart) {
    this.validityPeriodStart = validityPeriodStart;
  }

  /**
   **/
  public V3SiriDownstreamSubscription validityPeriodEnd(Date validityPeriodEnd) {
    this.validityPeriodEnd = validityPeriodEnd;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("validity_period_end")

  public Date getValidityPeriodEnd() {
    return validityPeriodEnd;
  }
  public void setValidityPeriodEnd(Date validityPeriodEnd) {
    this.validityPeriodEnd = validityPeriodEnd;
  }

  /**
   **/
  public V3SiriDownstreamSubscription previewInterval(String previewInterval) {
    this.previewInterval = previewInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("preview_interval")

  public String getPreviewInterval() {
    return previewInterval;
  }
  public void setPreviewInterval(String previewInterval) {
    this.previewInterval = previewInterval;
  }

  /**
   **/
  public V3SiriDownstreamSubscription topics(List<V3SiriDownstreamSubscriptionTopic> topics) {
    this.topics = topics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("topics")

  public List<V3SiriDownstreamSubscriptionTopic> getTopics() {
    return topics;
  }
  public void setTopics(List<V3SiriDownstreamSubscriptionTopic> topics) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
