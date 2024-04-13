package io.swagger.model;

import io.swagger.model.V3SiriDownstreamSubscriptionTopic;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;

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

public class V3SiriDownstreamSubscription   {
  
  @Schema(description = "")
  private String subscriberRef = null;
  
  @Schema(description = "")
  private String subscriptionRef = null;
  public enum MessageTypeEnum {
    NUMBER_0(0),
    NUMBER_1(1);

    private Integer value;

    MessageTypeEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static MessageTypeEnum fromValue(String text) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "")
  private MessageTypeEnum messageType = null;
  public enum SiriFormatEnum {
    NUMBER_0(0),
    NUMBER_1(1);

    private Integer value;

    SiriFormatEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
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
  @Schema(description = "")
  private SiriFormatEnum siriFormat = null;
  
  @Schema(description = "")
  private String siriVersion = null;
  
  @Schema(description = "")
  private String consumerAddress = null;
  
  @Schema(description = "")
  private Date initialTerminationTime = null;
  
  @Schema(description = "")
  private Date validityPeriodStart = null;
  
  @Schema(description = "")
  private Date validityPeriodEnd = null;
  
  @Schema(description = "")
  private String previewInterval = null;
  
  @Schema(description = "")
  private List<V3SiriDownstreamSubscriptionTopic> topics = null;
 /**
   * Get subscriberRef
   * @return subscriberRef
  **/
  @JsonProperty("subscriber_ref")
  public String getSubscriberRef() {
    return subscriberRef;
  }

  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }

  public V3SiriDownstreamSubscription subscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
    return this;
  }

 /**
   * Get subscriptionRef
   * @return subscriptionRef
  **/
  @JsonProperty("subscription_ref")
  public String getSubscriptionRef() {
    return subscriptionRef;
  }

  public void setSubscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }

  public V3SiriDownstreamSubscription subscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
    return this;
  }

 /**
   * Get messageType
   * @return messageType
  **/
  @JsonProperty("message_type")
  public Integer getMessageType() {
    if (messageType == null) {
      return null;
    }
    return messageType.getValue();
  }

  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  public V3SiriDownstreamSubscription messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

 /**
   * Get siriFormat
   * @return siriFormat
  **/
  @JsonProperty("siri_format")
  public Integer getSiriFormat() {
    if (siriFormat == null) {
      return null;
    }
    return siriFormat.getValue();
  }

  public void setSiriFormat(SiriFormatEnum siriFormat) {
    this.siriFormat = siriFormat;
  }

  public V3SiriDownstreamSubscription siriFormat(SiriFormatEnum siriFormat) {
    this.siriFormat = siriFormat;
    return this;
  }

 /**
   * Get siriVersion
   * @return siriVersion
  **/
  @JsonProperty("siri_version")
 @Pattern(regexp="1.3|2.0")  public String getSiriVersion() {
    return siriVersion;
  }

  public void setSiriVersion(String siriVersion) {
    this.siriVersion = siriVersion;
  }

  public V3SiriDownstreamSubscription siriVersion(String siriVersion) {
    this.siriVersion = siriVersion;
    return this;
  }

 /**
   * Get consumerAddress
   * @return consumerAddress
  **/
  @JsonProperty("consumer_address")
  public String getConsumerAddress() {
    return consumerAddress;
  }

  public void setConsumerAddress(String consumerAddress) {
    this.consumerAddress = consumerAddress;
  }

  public V3SiriDownstreamSubscription consumerAddress(String consumerAddress) {
    this.consumerAddress = consumerAddress;
    return this;
  }

 /**
   * Get initialTerminationTime
   * @return initialTerminationTime
  **/
  @JsonProperty("initial_termination_time")
  public Date getInitialTerminationTime() {
    return initialTerminationTime;
  }

  public void setInitialTerminationTime(Date initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
  }

  public V3SiriDownstreamSubscription initialTerminationTime(Date initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
    return this;
  }

 /**
   * Get validityPeriodStart
   * @return validityPeriodStart
  **/
  @JsonProperty("validity_period_start")
  public Date getValidityPeriodStart() {
    return validityPeriodStart;
  }

  public void setValidityPeriodStart(Date validityPeriodStart) {
    this.validityPeriodStart = validityPeriodStart;
  }

  public V3SiriDownstreamSubscription validityPeriodStart(Date validityPeriodStart) {
    this.validityPeriodStart = validityPeriodStart;
    return this;
  }

 /**
   * Get validityPeriodEnd
   * @return validityPeriodEnd
  **/
  @JsonProperty("validity_period_end")
  public Date getValidityPeriodEnd() {
    return validityPeriodEnd;
  }

  public void setValidityPeriodEnd(Date validityPeriodEnd) {
    this.validityPeriodEnd = validityPeriodEnd;
  }

  public V3SiriDownstreamSubscription validityPeriodEnd(Date validityPeriodEnd) {
    this.validityPeriodEnd = validityPeriodEnd;
    return this;
  }

 /**
   * Get previewInterval
   * @return previewInterval
  **/
  @JsonProperty("preview_interval")
  public String getPreviewInterval() {
    return previewInterval;
  }

  public void setPreviewInterval(String previewInterval) {
    this.previewInterval = previewInterval;
  }

  public V3SiriDownstreamSubscription previewInterval(String previewInterval) {
    this.previewInterval = previewInterval;
    return this;
  }

 /**
   * Get topics
   * @return topics
  **/
  @JsonProperty("topics")
  public List<V3SiriDownstreamSubscriptionTopic> getTopics() {
    return topics;
  }

  public void setTopics(List<V3SiriDownstreamSubscriptionTopic> topics) {
    this.topics = topics;
  }

  public V3SiriDownstreamSubscription topics(List<V3SiriDownstreamSubscriptionTopic> topics) {
    this.topics = topics;
    return this;
  }

  public V3SiriDownstreamSubscription addTopicsItem(V3SiriDownstreamSubscriptionTopic topicsItem) {
    this.topics.add(topicsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
