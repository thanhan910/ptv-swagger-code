package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3SiriSubscriptionTopic;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3SiriProductionTimetableSubscriptionRequest   {
  private java.util.Date startTime = null;
  private java.util.Date endTime = null;
  private String subscriberRef = null;
  private String subscriptionRef = null;
@XmlType(name="SiriFormatEnum")
@XmlEnum(Integer.class)
public enum SiriFormatEnum {

    @XmlEnumValue(0) NUMBER_0(Integer.valueOf(0)), @XmlEnumValue(1) NUMBER_1(Integer.valueOf(1));


    private Integer value;

    SiriFormatEnum (Integer v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SiriFormatEnum fromValue(String v) {
        for (SiriFormatEnum b : SiriFormatEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private SiriFormatEnum siriFormat = null;
  private String siriVersion = null;
  private String consumerAddress = null;
  private java.util.Date initialTerminationTime = null;
  private List<V3SiriSubscriptionTopic> topics = new ArrayList<V3SiriSubscriptionTopic>();

  /**
   * Siri Start Time of the Validity Period
   **/
  public V3SiriProductionTimetableSubscriptionRequest startTime(java.util.Date startTime) {
    this.startTime = startTime;
    return this;
  }

  
  
  @Schema(required = true, description = "Siri Start Time of the Validity Period")
  @JsonProperty("start_time")
  @NotNull
  @Valid
  public java.util.Date getStartTime() {
    return startTime;
  }
  public void setStartTime(java.util.Date startTime) {
    this.startTime = startTime;
  }

  /**
   * Siri End Time of the Validity Period
   **/
  public V3SiriProductionTimetableSubscriptionRequest endTime(java.util.Date endTime) {
    this.endTime = endTime;
    return this;
  }

  
  
  @Schema(required = true, description = "Siri End Time of the Validity Period")
  @JsonProperty("end_time")
  @NotNull
  @Valid
  public java.util.Date getEndTime() {
    return endTime;
  }
  public void setEndTime(java.util.Date endTime) {
    this.endTime = endTime;
  }

  /**
   * Siri Subscriber Ref
   **/
  public V3SiriProductionTimetableSubscriptionRequest subscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
    return this;
  }

  
  
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
  public V3SiriProductionTimetableSubscriptionRequest subscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
    return this;
  }

  
  
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
  public V3SiriProductionTimetableSubscriptionRequest siriFormat(SiriFormatEnum siriFormat) {
    this.siriFormat = siriFormat;
    return this;
  }

  
  
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
  public V3SiriProductionTimetableSubscriptionRequest siriVersion(String siriVersion) {
    this.siriVersion = siriVersion;
    return this;
  }

  
  
  @Schema(required = true, description = "Siri Message Version '1.3' or '2.0'")
  @JsonProperty("siri_version")
  @NotNull
 @Pattern(regexp="1.3|2.0")  public String getSiriVersion() {
    return siriVersion;
  }
  public void setSiriVersion(String siriVersion) {
    this.siriVersion = siriVersion;
  }

  /**
   * Siri Consumer Address - Baseline and Updates will be sent to this address
   **/
  public V3SiriProductionTimetableSubscriptionRequest consumerAddress(String consumerAddress) {
    this.consumerAddress = consumerAddress;
    return this;
  }

  
  
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
  public V3SiriProductionTimetableSubscriptionRequest initialTerminationTime(java.util.Date initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
    return this;
  }

  
  
  @Schema(required = true, description = "Siri Initial Termination Time - Expiry of the subscription")
  @JsonProperty("initial_termination_time")
  @NotNull
  @Valid
  public java.util.Date getInitialTerminationTime() {
    return initialTerminationTime;
  }
  public void setInitialTerminationTime(java.util.Date initialTerminationTime) {
    this.initialTerminationTime = initialTerminationTime;
  }

  /**
   **/
  public V3SiriProductionTimetableSubscriptionRequest topics(List<V3SiriSubscriptionTopic> topics) {
    this.topics = topics;
    return this;
  }

  
  
  @Schema(required = true, description = "")
  @JsonProperty("topics")
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
    return Objects.equals(startTime, v3SiriProductionTimetableSubscriptionRequest.startTime) &&
        Objects.equals(endTime, v3SiriProductionTimetableSubscriptionRequest.endTime) &&
        Objects.equals(subscriberRef, v3SiriProductionTimetableSubscriptionRequest.subscriberRef) &&
        Objects.equals(subscriptionRef, v3SiriProductionTimetableSubscriptionRequest.subscriptionRef) &&
        Objects.equals(siriFormat, v3SiriProductionTimetableSubscriptionRequest.siriFormat) &&
        Objects.equals(siriVersion, v3SiriProductionTimetableSubscriptionRequest.siriVersion) &&
        Objects.equals(consumerAddress, v3SiriProductionTimetableSubscriptionRequest.consumerAddress) &&
        Objects.equals(initialTerminationTime, v3SiriProductionTimetableSubscriptionRequest.initialTerminationTime) &&
        Objects.equals(topics, v3SiriProductionTimetableSubscriptionRequest.topics);
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
