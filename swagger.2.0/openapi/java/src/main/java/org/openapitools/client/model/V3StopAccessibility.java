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
import java.util.Arrays;
import org.openapitools.client.model.V3StopAccessibilityWheelchair;

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
 * V3StopAccessibility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T22:16:10.196593200+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3StopAccessibility {
  public static final String SERIALIZED_NAME_LIGHTING = "lighting";
  @SerializedName(SERIALIZED_NAME_LIGHTING)
  private Boolean lighting;

  public static final String SERIALIZED_NAME_PLATFORM_NUMBER = "platform_number";
  @SerializedName(SERIALIZED_NAME_PLATFORM_NUMBER)
  private Integer platformNumber;

  public static final String SERIALIZED_NAME_AUDIO_CUSTOMER_INFORMATION = "audio_customer_information";
  @SerializedName(SERIALIZED_NAME_AUDIO_CUSTOMER_INFORMATION)
  private Boolean audioCustomerInformation;

  public static final String SERIALIZED_NAME_ESCALATOR = "escalator";
  @SerializedName(SERIALIZED_NAME_ESCALATOR)
  private Boolean escalator;

  public static final String SERIALIZED_NAME_HEARING_LOOP = "hearing_loop";
  @SerializedName(SERIALIZED_NAME_HEARING_LOOP)
  private Boolean hearingLoop;

  public static final String SERIALIZED_NAME_LIFT = "lift";
  @SerializedName(SERIALIZED_NAME_LIFT)
  private Boolean lift;

  public static final String SERIALIZED_NAME_STAIRS = "stairs";
  @SerializedName(SERIALIZED_NAME_STAIRS)
  private Boolean stairs;

  public static final String SERIALIZED_NAME_STOP_ACCESSIBLE = "stop_accessible";
  @SerializedName(SERIALIZED_NAME_STOP_ACCESSIBLE)
  private Boolean stopAccessible;

  public static final String SERIALIZED_NAME_TACTILE_GROUND_SURFACE_INDICATOR = "tactile_ground_surface_indicator";
  @SerializedName(SERIALIZED_NAME_TACTILE_GROUND_SURFACE_INDICATOR)
  private Boolean tactileGroundSurfaceIndicator;

  public static final String SERIALIZED_NAME_WAITING_ROOM = "waiting_room";
  @SerializedName(SERIALIZED_NAME_WAITING_ROOM)
  private Boolean waitingRoom;

  public static final String SERIALIZED_NAME_WHEELCHAIR = "wheelchair";
  @SerializedName(SERIALIZED_NAME_WHEELCHAIR)
  private V3StopAccessibilityWheelchair wheelchair;

  public V3StopAccessibility() {
  }

  public V3StopAccessibility lighting(Boolean lighting) {
    this.lighting = lighting;
    return this;
  }

   /**
   * Indicates if there is lighting at the stop
   * @return lighting
  **/
  @javax.annotation.Nullable
  public Boolean getLighting() {
    return lighting;
  }

  public void setLighting(Boolean lighting) {
    this.lighting = lighting;
  }


  public V3StopAccessibility platformNumber(Integer platformNumber) {
    this.platformNumber = platformNumber;
    return this;
  }

   /**
   * Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)
   * @return platformNumber
  **/
  @javax.annotation.Nullable
  public Integer getPlatformNumber() {
    return platformNumber;
  }

  public void setPlatformNumber(Integer platformNumber) {
    this.platformNumber = platformNumber;
  }


  public V3StopAccessibility audioCustomerInformation(Boolean audioCustomerInformation) {
    this.audioCustomerInformation = audioCustomerInformation;
    return this;
  }

   /**
   * Indicates if there is at least one audio customer information at the stop/platform
   * @return audioCustomerInformation
  **/
  @javax.annotation.Nullable
  public Boolean getAudioCustomerInformation() {
    return audioCustomerInformation;
  }

  public void setAudioCustomerInformation(Boolean audioCustomerInformation) {
    this.audioCustomerInformation = audioCustomerInformation;
  }


  public V3StopAccessibility escalator(Boolean escalator) {
    this.escalator = escalator;
    return this;
  }

   /**
   * Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
   * @return escalator
  **/
  @javax.annotation.Nullable
  public Boolean getEscalator() {
    return escalator;
  }

  public void setEscalator(Boolean escalator) {
    this.escalator = escalator;
  }


  public V3StopAccessibility hearingLoop(Boolean hearingLoop) {
    this.hearingLoop = hearingLoop;
    return this;
  }

   /**
   * Indicates if there is a hearing loop facility at the stop/platform
   * @return hearingLoop
  **/
  @javax.annotation.Nullable
  public Boolean getHearingLoop() {
    return hearingLoop;
  }

  public void setHearingLoop(Boolean hearingLoop) {
    this.hearingLoop = hearingLoop;
  }


  public V3StopAccessibility lift(Boolean lift) {
    this.lift = lift;
    return this;
  }

   /**
   * Indicates if there is an elevator at the stop/platform
   * @return lift
  **/
  @javax.annotation.Nullable
  public Boolean getLift() {
    return lift;
  }

  public void setLift(Boolean lift) {
    this.lift = lift;
  }


  public V3StopAccessibility stairs(Boolean stairs) {
    this.stairs = stairs;
    return this;
  }

   /**
   * Indicates if there are stairs available in the stop
   * @return stairs
  **/
  @javax.annotation.Nullable
  public Boolean getStairs() {
    return stairs;
  }

  public void setStairs(Boolean stairs) {
    this.stairs = stairs;
  }


  public V3StopAccessibility stopAccessible(Boolean stopAccessible) {
    this.stopAccessible = stopAccessible;
    return this;
  }

   /**
   * Indicates if the stop is accessible
   * @return stopAccessible
  **/
  @javax.annotation.Nullable
  public Boolean getStopAccessible() {
    return stopAccessible;
  }

  public void setStopAccessible(Boolean stopAccessible) {
    this.stopAccessible = stopAccessible;
  }


  public V3StopAccessibility tactileGroundSurfaceIndicator(Boolean tactileGroundSurfaceIndicator) {
    this.tactileGroundSurfaceIndicator = tactileGroundSurfaceIndicator;
    return this;
  }

   /**
   * Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop
   * @return tactileGroundSurfaceIndicator
  **/
  @javax.annotation.Nullable
  public Boolean getTactileGroundSurfaceIndicator() {
    return tactileGroundSurfaceIndicator;
  }

  public void setTactileGroundSurfaceIndicator(Boolean tactileGroundSurfaceIndicator) {
    this.tactileGroundSurfaceIndicator = tactileGroundSurfaceIndicator;
  }


  public V3StopAccessibility waitingRoom(Boolean waitingRoom) {
    this.waitingRoom = waitingRoom;
    return this;
  }

   /**
   * Indicates if there is a general waiting area at the stop
   * @return waitingRoom
  **/
  @javax.annotation.Nullable
  public Boolean getWaitingRoom() {
    return waitingRoom;
  }

  public void setWaitingRoom(Boolean waitingRoom) {
    this.waitingRoom = waitingRoom;
  }


  public V3StopAccessibility wheelchair(V3StopAccessibilityWheelchair wheelchair) {
    this.wheelchair = wheelchair;
    return this;
  }

   /**
   * Get wheelchair
   * @return wheelchair
  **/
  @javax.annotation.Nullable
  public V3StopAccessibilityWheelchair getWheelchair() {
    return wheelchair;
  }

  public void setWheelchair(V3StopAccessibilityWheelchair wheelchair) {
    this.wheelchair = wheelchair;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopAccessibility v3StopAccessibility = (V3StopAccessibility) o;
    return Objects.equals(this.lighting, v3StopAccessibility.lighting) &&
        Objects.equals(this.platformNumber, v3StopAccessibility.platformNumber) &&
        Objects.equals(this.audioCustomerInformation, v3StopAccessibility.audioCustomerInformation) &&
        Objects.equals(this.escalator, v3StopAccessibility.escalator) &&
        Objects.equals(this.hearingLoop, v3StopAccessibility.hearingLoop) &&
        Objects.equals(this.lift, v3StopAccessibility.lift) &&
        Objects.equals(this.stairs, v3StopAccessibility.stairs) &&
        Objects.equals(this.stopAccessible, v3StopAccessibility.stopAccessible) &&
        Objects.equals(this.tactileGroundSurfaceIndicator, v3StopAccessibility.tactileGroundSurfaceIndicator) &&
        Objects.equals(this.waitingRoom, v3StopAccessibility.waitingRoom) &&
        Objects.equals(this.wheelchair, v3StopAccessibility.wheelchair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lighting, platformNumber, audioCustomerInformation, escalator, hearingLoop, lift, stairs, stopAccessible, tactileGroundSurfaceIndicator, waitingRoom, wheelchair);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopAccessibility {\n");
    sb.append("    lighting: ").append(toIndentedString(lighting)).append("\n");
    sb.append("    platformNumber: ").append(toIndentedString(platformNumber)).append("\n");
    sb.append("    audioCustomerInformation: ").append(toIndentedString(audioCustomerInformation)).append("\n");
    sb.append("    escalator: ").append(toIndentedString(escalator)).append("\n");
    sb.append("    hearingLoop: ").append(toIndentedString(hearingLoop)).append("\n");
    sb.append("    lift: ").append(toIndentedString(lift)).append("\n");
    sb.append("    stairs: ").append(toIndentedString(stairs)).append("\n");
    sb.append("    stopAccessible: ").append(toIndentedString(stopAccessible)).append("\n");
    sb.append("    tactileGroundSurfaceIndicator: ").append(toIndentedString(tactileGroundSurfaceIndicator)).append("\n");
    sb.append("    waitingRoom: ").append(toIndentedString(waitingRoom)).append("\n");
    sb.append("    wheelchair: ").append(toIndentedString(wheelchair)).append("\n");
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
    openapiFields.add("lighting");
    openapiFields.add("platform_number");
    openapiFields.add("audio_customer_information");
    openapiFields.add("escalator");
    openapiFields.add("hearing_loop");
    openapiFields.add("lift");
    openapiFields.add("stairs");
    openapiFields.add("stop_accessible");
    openapiFields.add("tactile_ground_surface_indicator");
    openapiFields.add("waiting_room");
    openapiFields.add("wheelchair");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3StopAccessibility
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3StopAccessibility.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3StopAccessibility is not found in the empty JSON string", V3StopAccessibility.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3StopAccessibility.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3StopAccessibility` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `wheelchair`
      if (jsonObj.get("wheelchair") != null && !jsonObj.get("wheelchair").isJsonNull()) {
        V3StopAccessibilityWheelchair.validateJsonElement(jsonObj.get("wheelchair"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3StopAccessibility.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3StopAccessibility' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3StopAccessibility> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3StopAccessibility.class));

       return (TypeAdapter<T>) new TypeAdapter<V3StopAccessibility>() {
           @Override
           public void write(JsonWriter out, V3StopAccessibility value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3StopAccessibility read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3StopAccessibility given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3StopAccessibility
  * @throws IOException if the JSON string is invalid with respect to V3StopAccessibility
  */
  public static V3StopAccessibility fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3StopAccessibility.class);
  }

 /**
  * Convert an instance of V3StopAccessibility to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

