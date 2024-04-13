package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.server.api.model.V3SiriDownstreamSubscriptionTopic;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3SiriDownstreamSubscription
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



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

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MessageTypeEnum fromValue(Integer value) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
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

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SiriFormatEnum fromValue(Integer value) {
      for (SiriFormatEnum b : SiriFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private SiriFormatEnum siriFormat = null;

  private String siriVersion = null;

  private String consumerAddress = null;

  private OffsetDateTime initialTerminationTime = null;

  private OffsetDateTime validityPeriodStart = null;

  private OffsetDateTime validityPeriodEnd = null;

  private String previewInterval = null;

  
  private List<V3SiriDownstreamSubscriptionTopic> topics = null;

  public V3SiriDownstreamSubscription subscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
    return this;
  }

  /**
   * Get subscriberRef
   * @return subscriberRef
   **/
    public String getSubscriberRef() {
    return subscriberRef;
  }

  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }

  public V3SiriDownstreamSubscription subscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
    return this;
  }

  /**
   * Get subscriptionRef
   * @return subscriptionRef
   **/
    public String getSubscriptionRef() {
    return subscriptionRef;
  }

  public void setSubscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }

  public V3SiriDownstreamSubscription messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

  /**
   * Get messageType
   * @return messageType
   **/
    public MessageTypeEnum getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  public V3SiriDownstreamSubscription siriFormat(SiriFormatEnum siriFormat) {
    this.siriFormat = siriFormat;
    return this;
  }

  /**
   * Get siriFormat
   * @return siriFormat
   **/
    public SiriFormatEnum getSiriFormat() {
    return siriFormat;
  }

  public void setSiriFormat(SiriFormatEnum siriFormat) {
    this.siriFormat = siriFormat;
  }

  public V3SiriDownstreamSubscription siriVersion(String siriVersion) {
    this.siriVersion = siriVersion;
    return this;
  }

  /**
   * Get siriVersion
   * @return siriVersion
   **/
    public String getSiriVersion() {
    return siriVersion;
  }

  public void setSiriVersion(String siriVersion) {
    this.siriVersion = siriVersion;
  }

  public V3SiriDownstreamSubscription consumerAddress(String consumerAddress) {
    this.consumerAddress = consumerAddress;
    return this;
  }

  /**
   * Get consumerAddress
   * @return consumerAddress
   **/
    public String getConsumerAddress() {
    return consumerAddress;
  }

  public void setConsumerAddress(String consumerAddress) {
    this.consumerAddress = consumerAddress;
  }

  public V3SiriDownstreamSubscription initialTerminationTime(OffsetDateTime initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
    return this;
  }

  /**
   * Get initialTerminationTime
   * @return initialTerminationTime
   **/
    public OffsetDateTime getInitialTerminationTime() {
    return initialTerminationTime;
  }

  public void setInitialTerminationTime(OffsetDateTime initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
  }

  public V3SiriDownstreamSubscription validityPeriodStart(OffsetDateTime validityPeriodStart) {
    this.validityPeriodStart = validityPeriodStart;
    return this;
  }

  /**
   * Get validityPeriodStart
   * @return validityPeriodStart
   **/
    public OffsetDateTime getValidityPeriodStart() {
    return validityPeriodStart;
  }

  public void setValidityPeriodStart(OffsetDateTime validityPeriodStart) {
    this.validityPeriodStart = validityPeriodStart;
  }

  public V3SiriDownstreamSubscription validityPeriodEnd(OffsetDateTime validityPeriodEnd) {
    this.validityPeriodEnd = validityPeriodEnd;
    return this;
  }

  /**
   * Get validityPeriodEnd
   * @return validityPeriodEnd
   **/
    public OffsetDateTime getValidityPeriodEnd() {
    return validityPeriodEnd;
  }

  public void setValidityPeriodEnd(OffsetDateTime validityPeriodEnd) {
    this.validityPeriodEnd = validityPeriodEnd;
  }

  public V3SiriDownstreamSubscription previewInterval(String previewInterval) {
    this.previewInterval = previewInterval;
    return this;
  }

  /**
   * Get previewInterval
   * @return previewInterval
   **/
    public String getPreviewInterval() {
    return previewInterval;
  }

  public void setPreviewInterval(String previewInterval) {
    this.previewInterval = previewInterval;
  }

  public V3SiriDownstreamSubscription topics(List<V3SiriDownstreamSubscriptionTopic> topics) {
    this.topics = topics;
    return this;
  }

  public V3SiriDownstreamSubscription addTopicsItem(V3SiriDownstreamSubscriptionTopic topicsItem) {
    if (this.topics == null) {
      this.topics = new ArrayList<V3SiriDownstreamSubscriptionTopic>();
    }
    this.topics.add(topicsItem);
    return this;
  }

  /**
   * Get topics
   * @return topics
   **/
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
    return Objects.equals(this.subscriberRef, v3SiriDownstreamSubscription.subscriberRef) &&
        Objects.equals(this.subscriptionRef, v3SiriDownstreamSubscription.subscriptionRef) &&
        Objects.equals(this.messageType, v3SiriDownstreamSubscription.messageType) &&
        Objects.equals(this.siriFormat, v3SiriDownstreamSubscription.siriFormat) &&
        Objects.equals(this.siriVersion, v3SiriDownstreamSubscription.siriVersion) &&
        Objects.equals(this.consumerAddress, v3SiriDownstreamSubscription.consumerAddress) &&
        Objects.equals(this.initialTerminationTime, v3SiriDownstreamSubscription.initialTerminationTime) &&
        Objects.equals(this.validityPeriodStart, v3SiriDownstreamSubscription.validityPeriodStart) &&
        Objects.equals(this.validityPeriodEnd, v3SiriDownstreamSubscription.validityPeriodEnd) &&
        Objects.equals(this.previewInterval, v3SiriDownstreamSubscription.previewInterval) &&
        Objects.equals(this.topics, v3SiriDownstreamSubscription.topics);
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
