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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * V3SiriDownstreamSubscriptionDeleteRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T22:17:14.003555400+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3SiriDownstreamSubscriptionDeleteRequest {
  public static final String SERIALIZED_NAME_SUBSCRIBER_REF = "subscriber_ref";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_REF)
  private String subscriberRef;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_REF = "subscription_ref";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_REF)
  private List<String> subscriptionRef = new ArrayList<>();

  public V3SiriDownstreamSubscriptionDeleteRequest() {
  }

  public V3SiriDownstreamSubscriptionDeleteRequest subscriberRef(String subscriberRef) {
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


  public V3SiriDownstreamSubscriptionDeleteRequest subscriptionRef(List<String> subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
    return this;
  }

  public V3SiriDownstreamSubscriptionDeleteRequest addSubscriptionRefItem(String subscriptionRefItem) {
    if (this.subscriptionRef == null) {
      this.subscriptionRef = new ArrayList<>();
    }
    this.subscriptionRef.add(subscriptionRefItem);
    return this;
  }

   /**
   * Siri Subscription Reference(s) - Unique to a Subscriber Ref.  If &#x60;null&#x60;, then all subscriptions will be terminated for the referenced Subscriber.
   * @return subscriptionRef
  **/
  @javax.annotation.Nullable
  public List<String> getSubscriptionRef() {
    return subscriptionRef;
  }

  public void setSubscriptionRef(List<String> subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriDownstreamSubscriptionDeleteRequest v3SiriDownstreamSubscriptionDeleteRequest = (V3SiriDownstreamSubscriptionDeleteRequest) o;
    return Objects.equals(this.subscriberRef, v3SiriDownstreamSubscriptionDeleteRequest.subscriberRef) &&
        Objects.equals(this.subscriptionRef, v3SiriDownstreamSubscriptionDeleteRequest.subscriptionRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberRef, subscriptionRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriDownstreamSubscriptionDeleteRequest {\n");
    sb.append("    subscriberRef: ").append(toIndentedString(subscriberRef)).append("\n");
    sb.append("    subscriptionRef: ").append(toIndentedString(subscriptionRef)).append("\n");
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
    openapiFields.add("subscriber_ref");
    openapiFields.add("subscription_ref");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subscriber_ref");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3SiriDownstreamSubscriptionDeleteRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3SiriDownstreamSubscriptionDeleteRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3SiriDownstreamSubscriptionDeleteRequest is not found in the empty JSON string", V3SiriDownstreamSubscriptionDeleteRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3SiriDownstreamSubscriptionDeleteRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3SiriDownstreamSubscriptionDeleteRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V3SiriDownstreamSubscriptionDeleteRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("subscriber_ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriber_ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriber_ref").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("subscription_ref") != null && !jsonObj.get("subscription_ref").isJsonNull() && !jsonObj.get("subscription_ref").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_ref` to be an array in the JSON string but got `%s`", jsonObj.get("subscription_ref").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3SiriDownstreamSubscriptionDeleteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3SiriDownstreamSubscriptionDeleteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3SiriDownstreamSubscriptionDeleteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3SiriDownstreamSubscriptionDeleteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<V3SiriDownstreamSubscriptionDeleteRequest>() {
           @Override
           public void write(JsonWriter out, V3SiriDownstreamSubscriptionDeleteRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3SiriDownstreamSubscriptionDeleteRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3SiriDownstreamSubscriptionDeleteRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3SiriDownstreamSubscriptionDeleteRequest
  * @throws IOException if the JSON string is invalid with respect to V3SiriDownstreamSubscriptionDeleteRequest
  */
  public static V3SiriDownstreamSubscriptionDeleteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3SiriDownstreamSubscriptionDeleteRequest.class);
  }

 /**
  * Convert an instance of V3SiriDownstreamSubscriptionDeleteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

