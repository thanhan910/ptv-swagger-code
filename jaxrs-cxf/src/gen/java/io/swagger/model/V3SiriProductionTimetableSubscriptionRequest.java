package io.swagger.model;

import io.swagger.model.V3SiriSubscriptionTopic;
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

public class V3SiriProductionTimetableSubscriptionRequest   {
  
  @Schema(required = true, description = "Siri Start Time of the Validity Period")
 /**
   * Siri Start Time of the Validity Period  
  **/
  private Date startTime = null;
  
  @Schema(required = true, description = "Siri End Time of the Validity Period")
 /**
   * Siri End Time of the Validity Period  
  **/
  private Date endTime = null;
  
  @Schema(required = true, description = "Siri Subscriber Ref")
 /**
   * Siri Subscriber Ref  
  **/
  private String subscriberRef = null;
  
  @Schema(required = true, description = "Siri Subscription Ref - Unique to a Subscriber Ref")
 /**
   * Siri Subscription Ref - Unique to a Subscriber Ref  
  **/
  private String subscriptionRef = null;
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
  @Schema(required = true, description = "Siri Message Format 'xml' or 'json'")
 /**
   * Siri Message Format 'xml' or 'json'  
  **/
  private SiriFormatEnum siriFormat = null;
  
  @Schema(required = true, description = "Siri Message Version '1.3' or '2.0'")
 /**
   * Siri Message Version '1.3' or '2.0'  
  **/
  private String siriVersion = null;
  
  @Schema(required = true, description = "Siri Consumer Address - Baseline and Updates will be sent to this address")
 /**
   * Siri Consumer Address - Baseline and Updates will be sent to this address  
  **/
  private String consumerAddress = null;
  
  @Schema(required = true, description = "Siri Initial Termination Time - Expiry of the subscription")
 /**
   * Siri Initial Termination Time - Expiry of the subscription  
  **/
  private Date initialTerminationTime = null;
  
  @Schema(required = true, description = "")
  private List<V3SiriSubscriptionTopic> topics = new ArrayList<V3SiriSubscriptionTopic>();
 /**
   * Siri Start Time of the Validity Period
   * @return startTime
  **/
  @JsonProperty("start_time")
  @NotNull
  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public V3SiriProductionTimetableSubscriptionRequest startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Siri End Time of the Validity Period
   * @return endTime
  **/
  @JsonProperty("end_time")
  @NotNull
  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public V3SiriProductionTimetableSubscriptionRequest endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
   * Siri Subscriber Ref
   * @return subscriberRef
  **/
  @JsonProperty("subscriber_ref")
  @NotNull
  public String getSubscriberRef() {
    return subscriberRef;
  }

  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }

  public V3SiriProductionTimetableSubscriptionRequest subscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
    return this;
  }

 /**
   * Siri Subscription Ref - Unique to a Subscriber Ref
   * @return subscriptionRef
  **/
  @JsonProperty("subscription_ref")
  @NotNull
  public String getSubscriptionRef() {
    return subscriptionRef;
  }

  public void setSubscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }

  public V3SiriProductionTimetableSubscriptionRequest subscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
    return this;
  }

 /**
   * Siri Message Format &#x27;xml&#x27; or &#x27;json&#x27;
   * @return siriFormat
  **/
  @JsonProperty("siri_format")
  @NotNull
  public Integer getSiriFormat() {
    if (siriFormat == null) {
      return null;
    }
    return siriFormat.getValue();
  }

  public void setSiriFormat(SiriFormatEnum siriFormat) {
    this.siriFormat = siriFormat;
  }

  public V3SiriProductionTimetableSubscriptionRequest siriFormat(SiriFormatEnum siriFormat) {
    this.siriFormat = siriFormat;
    return this;
  }

 /**
   * Siri Message Version &#x27;1.3&#x27; or &#x27;2.0&#x27;
   * @return siriVersion
  **/
  @JsonProperty("siri_version")
  @NotNull
 @Pattern(regexp="1.3|2.0")  public String getSiriVersion() {
    return siriVersion;
  }

  public void setSiriVersion(String siriVersion) {
    this.siriVersion = siriVersion;
  }

  public V3SiriProductionTimetableSubscriptionRequest siriVersion(String siriVersion) {
    this.siriVersion = siriVersion;
    return this;
  }

 /**
   * Siri Consumer Address - Baseline and Updates will be sent to this address
   * @return consumerAddress
  **/
  @JsonProperty("consumer_address")
  @NotNull
  public String getConsumerAddress() {
    return consumerAddress;
  }

  public void setConsumerAddress(String consumerAddress) {
    this.consumerAddress = consumerAddress;
  }

  public V3SiriProductionTimetableSubscriptionRequest consumerAddress(String consumerAddress) {
    this.consumerAddress = consumerAddress;
    return this;
  }

 /**
   * Siri Initial Termination Time - Expiry of the subscription
   * @return initialTerminationTime
  **/
  @JsonProperty("initial_termination_time")
  @NotNull
  public Date getInitialTerminationTime() {
    return initialTerminationTime;
  }

  public void setInitialTerminationTime(Date initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
  }

  public V3SiriProductionTimetableSubscriptionRequest initialTerminationTime(Date initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
    return this;
  }

 /**
   * Get topics
   * @return topics
  **/
  @JsonProperty("topics")
  @NotNull
  public List<V3SiriSubscriptionTopic> getTopics() {
    return topics;
  }

  public void setTopics(List<V3SiriSubscriptionTopic> topics) {
    this.topics = topics;
  }

  public V3SiriProductionTimetableSubscriptionRequest topics(List<V3SiriSubscriptionTopic> topics) {
    this.topics = topics;
    return this;
  }

  public V3SiriProductionTimetableSubscriptionRequest addTopicsItem(V3SiriSubscriptionTopic topicsItem) {
    this.topics.add(topicsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
