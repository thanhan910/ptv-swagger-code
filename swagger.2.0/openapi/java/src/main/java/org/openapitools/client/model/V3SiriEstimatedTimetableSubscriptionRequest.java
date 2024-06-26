/*
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.V3SiriSubscriptionTopic;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * V3SiriEstimatedTimetableSubscriptionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T22:16:10.196593200+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3SiriEstimatedTimetableSubscriptionRequest {
  public static final String SERIALIZED_NAME_PREVIEW_INTERVAL = "preview_interval";
  @SerializedName(SERIALIZED_NAME_PREVIEW_INTERVAL)
  private String previewInterval;

  public static final String SERIALIZED_NAME_SUBSCRIBER_REF = "subscriber_ref";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_REF)
  private String subscriberRef;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_REF = "subscription_ref";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_REF)
  private String subscriptionRef;

  /**
   * Siri Message Format &#39;xml&#39; or &#39;json&#39;
   */
  @JsonAdapter(SiriFormatEnum.Adapter.class)
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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SiriFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SiriFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SiriFormatEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return SiriFormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      SiriFormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SIRI_FORMAT = "siri_format";
  @SerializedName(SERIALIZED_NAME_SIRI_FORMAT)
  private SiriFormatEnum siriFormat;

  public static final String SERIALIZED_NAME_SIRI_VERSION = "siri_version";
  @SerializedName(SERIALIZED_NAME_SIRI_VERSION)
  private String siriVersion;

  public static final String SERIALIZED_NAME_CONSUMER_ADDRESS = "consumer_address";
  @SerializedName(SERIALIZED_NAME_CONSUMER_ADDRESS)
  private String consumerAddress;

  public static final String SERIALIZED_NAME_INITIAL_TERMINATION_TIME = "initial_termination_time";
  @SerializedName(SERIALIZED_NAME_INITIAL_TERMINATION_TIME)
  private OffsetDateTime initialTerminationTime;

  public static final String SERIALIZED_NAME_TOPICS = "topics";
  @SerializedName(SERIALIZED_NAME_TOPICS)
  private List<V3SiriSubscriptionTopic> topics = new ArrayList<>();

  public V3SiriEstimatedTimetableSubscriptionRequest() {
  }

  public V3SiriEstimatedTimetableSubscriptionRequest previewInterval(String previewInterval) {
    this.previewInterval = previewInterval;
    return this;
  }

   /**
   * Siri Preview Interval
   * @return previewInterval
  **/
  @javax.annotation.Nonnull
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
  @javax.annotation.Nonnull
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
  @javax.annotation.Nonnull
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
   * Siri Message Format &#39;xml&#39; or &#39;json&#39;
   * @return siriFormat
  **/
  @javax.annotation.Nonnull
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
   * Siri Message Version &#39;1.3&#39; or &#39;2.0&#39;
   * @return siriVersion
  **/
  @javax.annotation.Nonnull
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
  @javax.annotation.Nonnull
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
  @javax.annotation.Nonnull
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
    if (this.topics == null) {
      this.topics = new ArrayList<>();
    }
    this.topics.add(topicsItem);
    return this;
  }

   /**
   * Get topics
   * @return topics
  **/
  @javax.annotation.Nonnull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("preview_interval");
    openapiFields.add("subscriber_ref");
    openapiFields.add("subscription_ref");
    openapiFields.add("siri_format");
    openapiFields.add("siri_version");
    openapiFields.add("consumer_address");
    openapiFields.add("initial_termination_time");
    openapiFields.add("topics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("preview_interval");
    openapiRequiredFields.add("subscriber_ref");
    openapiRequiredFields.add("subscription_ref");
    openapiRequiredFields.add("siri_format");
    openapiRequiredFields.add("siri_version");
    openapiRequiredFields.add("consumer_address");
    openapiRequiredFields.add("initial_termination_time");
    openapiRequiredFields.add("topics");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3SiriEstimatedTimetableSubscriptionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3SiriEstimatedTimetableSubscriptionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3SiriEstimatedTimetableSubscriptionRequest is not found in the empty JSON string", V3SiriEstimatedTimetableSubscriptionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3SiriEstimatedTimetableSubscriptionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3SiriEstimatedTimetableSubscriptionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V3SiriEstimatedTimetableSubscriptionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("preview_interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preview_interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preview_interval").toString()));
      }
      if (!jsonObj.get("subscriber_ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriber_ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriber_ref").toString()));
      }
      if (!jsonObj.get("subscription_ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_ref").toString()));
      }
      // validate the required field `siri_format`
      SiriFormatEnum.validateJsonElement(jsonObj.get("siri_format"));
      if (!jsonObj.get("siri_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `siri_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("siri_version").toString()));
      }
      if (!jsonObj.get("consumer_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumer_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumer_address").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("topics").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `topics` to be an array in the JSON string but got `%s`", jsonObj.get("topics").toString()));
      }

      JsonArray jsonArraytopics = jsonObj.getAsJsonArray("topics");
      // validate the required field `topics` (array)
      for (int i = 0; i < jsonArraytopics.size(); i++) {
        V3SiriSubscriptionTopic.validateJsonElement(jsonArraytopics.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3SiriEstimatedTimetableSubscriptionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3SiriEstimatedTimetableSubscriptionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3SiriEstimatedTimetableSubscriptionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3SiriEstimatedTimetableSubscriptionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<V3SiriEstimatedTimetableSubscriptionRequest>() {
           @Override
           public void write(JsonWriter out, V3SiriEstimatedTimetableSubscriptionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3SiriEstimatedTimetableSubscriptionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3SiriEstimatedTimetableSubscriptionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3SiriEstimatedTimetableSubscriptionRequest
  * @throws IOException if the JSON string is invalid with respect to V3SiriEstimatedTimetableSubscriptionRequest
  */
  public static V3SiriEstimatedTimetableSubscriptionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3SiriEstimatedTimetableSubscriptionRequest.class);
  }

 /**
  * Convert an instance of V3SiriEstimatedTimetableSubscriptionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

