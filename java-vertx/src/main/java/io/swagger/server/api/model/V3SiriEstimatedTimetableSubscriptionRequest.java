package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.server.api.model.V3SiriSubscriptionTopic;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3SiriEstimatedTimetableSubscriptionRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3SiriEstimatedTimetableSubscriptionRequest   {
  private String previewInterval = null;

  private String subscriberRef = null;

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

  
  private List<V3SiriSubscriptionTopic> topics = new ArrayList<V3SiriSubscriptionTopic>();

  public V3SiriEstimatedTimetableSubscriptionRequest previewInterval(String previewInterval) {
    this.previewInterval = previewInterval;
    return this;
  }

  /**
   * Siri Preview Interval
   * @return previewInterval
   **/
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
    public String getSiriVersion() {
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
