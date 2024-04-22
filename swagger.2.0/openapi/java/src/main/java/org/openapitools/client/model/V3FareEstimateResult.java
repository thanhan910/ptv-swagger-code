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
import org.openapitools.client.model.V3PassengerFare;
import org.openapitools.client.model.V3ZoneInfo;

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
 * V3FareEstimateResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T22:16:10.196593200+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3FareEstimateResult {
  public static final String SERIALIZED_NAME_IS_EARLY_BIRD = "IsEarlyBird";
  @SerializedName(SERIALIZED_NAME_IS_EARLY_BIRD)
  private Boolean isEarlyBird;

  public static final String SERIALIZED_NAME_IS_JOURNEY_IN_FREE_TRAM_ZONE = "IsJourneyInFreeTramZone";
  @SerializedName(SERIALIZED_NAME_IS_JOURNEY_IN_FREE_TRAM_ZONE)
  private Boolean isJourneyInFreeTramZone;

  public static final String SERIALIZED_NAME_IS_THIS_WEEKEND_JOURNEY = "IsThisWeekendJourney";
  @SerializedName(SERIALIZED_NAME_IS_THIS_WEEKEND_JOURNEY)
  private Boolean isThisWeekendJourney;

  public static final String SERIALIZED_NAME_ZONE_INFO = "ZoneInfo";
  @SerializedName(SERIALIZED_NAME_ZONE_INFO)
  private V3ZoneInfo zoneInfo;

  public static final String SERIALIZED_NAME_PASSENGER_FARES = "PassengerFares";
  @SerializedName(SERIALIZED_NAME_PASSENGER_FARES)
  private List<V3PassengerFare> passengerFares = new ArrayList<>();

  public V3FareEstimateResult() {
  }

  public V3FareEstimateResult isEarlyBird(Boolean isEarlyBird) {
    this.isEarlyBird = isEarlyBird;
    return this;
  }

   /**
   * Get isEarlyBird
   * @return isEarlyBird
  **/
  @javax.annotation.Nullable
  public Boolean getIsEarlyBird() {
    return isEarlyBird;
  }

  public void setIsEarlyBird(Boolean isEarlyBird) {
    this.isEarlyBird = isEarlyBird;
  }


  public V3FareEstimateResult isJourneyInFreeTramZone(Boolean isJourneyInFreeTramZone) {
    this.isJourneyInFreeTramZone = isJourneyInFreeTramZone;
    return this;
  }

   /**
   * Get isJourneyInFreeTramZone
   * @return isJourneyInFreeTramZone
  **/
  @javax.annotation.Nullable
  public Boolean getIsJourneyInFreeTramZone() {
    return isJourneyInFreeTramZone;
  }

  public void setIsJourneyInFreeTramZone(Boolean isJourneyInFreeTramZone) {
    this.isJourneyInFreeTramZone = isJourneyInFreeTramZone;
  }


  public V3FareEstimateResult isThisWeekendJourney(Boolean isThisWeekendJourney) {
    this.isThisWeekendJourney = isThisWeekendJourney;
    return this;
  }

   /**
   * Get isThisWeekendJourney
   * @return isThisWeekendJourney
  **/
  @javax.annotation.Nullable
  public Boolean getIsThisWeekendJourney() {
    return isThisWeekendJourney;
  }

  public void setIsThisWeekendJourney(Boolean isThisWeekendJourney) {
    this.isThisWeekendJourney = isThisWeekendJourney;
  }


  public V3FareEstimateResult zoneInfo(V3ZoneInfo zoneInfo) {
    this.zoneInfo = zoneInfo;
    return this;
  }

   /**
   * Get zoneInfo
   * @return zoneInfo
  **/
  @javax.annotation.Nullable
  public V3ZoneInfo getZoneInfo() {
    return zoneInfo;
  }

  public void setZoneInfo(V3ZoneInfo zoneInfo) {
    this.zoneInfo = zoneInfo;
  }


  public V3FareEstimateResult passengerFares(List<V3PassengerFare> passengerFares) {
    this.passengerFares = passengerFares;
    return this;
  }

  public V3FareEstimateResult addPassengerFaresItem(V3PassengerFare passengerFaresItem) {
    if (this.passengerFares == null) {
      this.passengerFares = new ArrayList<>();
    }
    this.passengerFares.add(passengerFaresItem);
    return this;
  }

   /**
   * Get passengerFares
   * @return passengerFares
  **/
  @javax.annotation.Nullable
  public List<V3PassengerFare> getPassengerFares() {
    return passengerFares;
  }

  public void setPassengerFares(List<V3PassengerFare> passengerFares) {
    this.passengerFares = passengerFares;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3FareEstimateResult v3FareEstimateResult = (V3FareEstimateResult) o;
    return Objects.equals(this.isEarlyBird, v3FareEstimateResult.isEarlyBird) &&
        Objects.equals(this.isJourneyInFreeTramZone, v3FareEstimateResult.isJourneyInFreeTramZone) &&
        Objects.equals(this.isThisWeekendJourney, v3FareEstimateResult.isThisWeekendJourney) &&
        Objects.equals(this.zoneInfo, v3FareEstimateResult.zoneInfo) &&
        Objects.equals(this.passengerFares, v3FareEstimateResult.passengerFares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEarlyBird, isJourneyInFreeTramZone, isThisWeekendJourney, zoneInfo, passengerFares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3FareEstimateResult {\n");
    sb.append("    isEarlyBird: ").append(toIndentedString(isEarlyBird)).append("\n");
    sb.append("    isJourneyInFreeTramZone: ").append(toIndentedString(isJourneyInFreeTramZone)).append("\n");
    sb.append("    isThisWeekendJourney: ").append(toIndentedString(isThisWeekendJourney)).append("\n");
    sb.append("    zoneInfo: ").append(toIndentedString(zoneInfo)).append("\n");
    sb.append("    passengerFares: ").append(toIndentedString(passengerFares)).append("\n");
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
    openapiFields.add("IsEarlyBird");
    openapiFields.add("IsJourneyInFreeTramZone");
    openapiFields.add("IsThisWeekendJourney");
    openapiFields.add("ZoneInfo");
    openapiFields.add("PassengerFares");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3FareEstimateResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3FareEstimateResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3FareEstimateResult is not found in the empty JSON string", V3FareEstimateResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3FareEstimateResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3FareEstimateResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ZoneInfo`
      if (jsonObj.get("ZoneInfo") != null && !jsonObj.get("ZoneInfo").isJsonNull()) {
        V3ZoneInfo.validateJsonElement(jsonObj.get("ZoneInfo"));
      }
      if (jsonObj.get("PassengerFares") != null && !jsonObj.get("PassengerFares").isJsonNull()) {
        JsonArray jsonArraypassengerFares = jsonObj.getAsJsonArray("PassengerFares");
        if (jsonArraypassengerFares != null) {
          // ensure the json data is an array
          if (!jsonObj.get("PassengerFares").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `PassengerFares` to be an array in the JSON string but got `%s`", jsonObj.get("PassengerFares").toString()));
          }

          // validate the optional field `PassengerFares` (array)
          for (int i = 0; i < jsonArraypassengerFares.size(); i++) {
            V3PassengerFare.validateJsonElement(jsonArraypassengerFares.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3FareEstimateResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3FareEstimateResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3FareEstimateResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3FareEstimateResult.class));

       return (TypeAdapter<T>) new TypeAdapter<V3FareEstimateResult>() {
           @Override
           public void write(JsonWriter out, V3FareEstimateResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3FareEstimateResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3FareEstimateResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3FareEstimateResult
  * @throws IOException if the JSON string is invalid with respect to V3FareEstimateResult
  */
  public static V3FareEstimateResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3FareEstimateResult.class);
  }

 /**
  * Convert an instance of V3FareEstimateResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

