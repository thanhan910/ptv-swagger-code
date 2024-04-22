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
import org.openapitools.client.model.V3StopModel;

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
 * V3PatternDeparture
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T22:16:10.196593200+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3PatternDeparture {
  public static final String SERIALIZED_NAME_SKIPPED_STOPS = "skipped_stops";
  @SerializedName(SERIALIZED_NAME_SKIPPED_STOPS)
  private List<V3StopModel> skippedStops = new ArrayList<>();

  public static final String SERIALIZED_NAME_STOP_ID = "stop_id";
  @SerializedName(SERIALIZED_NAME_STOP_ID)
  private Integer stopId;

  public static final String SERIALIZED_NAME_ROUTE_ID = "route_id";
  @SerializedName(SERIALIZED_NAME_ROUTE_ID)
  private Integer routeId;

  public static final String SERIALIZED_NAME_RUN_ID = "run_id";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  private Integer runId;

  public static final String SERIALIZED_NAME_RUN_REF = "run_ref";
  @SerializedName(SERIALIZED_NAME_RUN_REF)
  private String runRef;

  public static final String SERIALIZED_NAME_DIRECTION_ID = "direction_id";
  @SerializedName(SERIALIZED_NAME_DIRECTION_ID)
  private Integer directionId;

  public static final String SERIALIZED_NAME_DISRUPTION_IDS = "disruption_ids";
  @SerializedName(SERIALIZED_NAME_DISRUPTION_IDS)
  private List<Long> disruptionIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCHEDULED_DEPARTURE_UTC = "scheduled_departure_utc";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_DEPARTURE_UTC)
  private OffsetDateTime scheduledDepartureUtc;

  public static final String SERIALIZED_NAME_ESTIMATED_DEPARTURE_UTC = "estimated_departure_utc";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DEPARTURE_UTC)
  private OffsetDateTime estimatedDepartureUtc;

  public static final String SERIALIZED_NAME_AT_PLATFORM = "at_platform";
  @SerializedName(SERIALIZED_NAME_AT_PLATFORM)
  private Boolean atPlatform;

  public static final String SERIALIZED_NAME_PLATFORM_NUMBER = "platform_number";
  @SerializedName(SERIALIZED_NAME_PLATFORM_NUMBER)
  private String platformNumber;

  public static final String SERIALIZED_NAME_FLAGS = "flags";
  @SerializedName(SERIALIZED_NAME_FLAGS)
  private String flags;

  public static final String SERIALIZED_NAME_DEPARTURE_SEQUENCE = "departure_sequence";
  @SerializedName(SERIALIZED_NAME_DEPARTURE_SEQUENCE)
  private Integer departureSequence;

  public V3PatternDeparture() {
  }

  public V3PatternDeparture(
     Integer runId
  ) {
    this();
    this.runId = runId;
  }

  public V3PatternDeparture skippedStops(List<V3StopModel> skippedStops) {
    this.skippedStops = skippedStops;
    return this;
  }

  public V3PatternDeparture addSkippedStopsItem(V3StopModel skippedStopsItem) {
    if (this.skippedStops == null) {
      this.skippedStops = new ArrayList<>();
    }
    this.skippedStops.add(skippedStopsItem);
    return this;
  }

   /**
   * The stops to be skipped following the current departure in order.
   * @return skippedStops
  **/
  @javax.annotation.Nullable
  public List<V3StopModel> getSkippedStops() {
    return skippedStops;
  }

  public void setSkippedStops(List<V3StopModel> skippedStops) {
    this.skippedStops = skippedStops;
  }


  public V3PatternDeparture stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

   /**
   * Stop identifier
   * @return stopId
  **/
  @javax.annotation.Nullable
  public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }


  public V3PatternDeparture routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

   /**
   * Route identifier
   * @return routeId
  **/
  @javax.annotation.Nullable
  public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }


   /**
   * Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
   * @return runId
  **/
  @javax.annotation.Nullable
  public Integer getRunId() {
    return runId;
  }



  public V3PatternDeparture runRef(String runRef) {
    this.runRef = runRef;
    return this;
  }

   /**
   * Alphanumeric trip/service run identifier
   * @return runRef
  **/
  @javax.annotation.Nullable
  public String getRunRef() {
    return runRef;
  }

  public void setRunRef(String runRef) {
    this.runRef = runRef;
  }


  public V3PatternDeparture directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

   /**
   * Direction of travel identifier
   * @return directionId
  **/
  @javax.annotation.Nullable
  public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }


  public V3PatternDeparture disruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
    return this;
  }

  public V3PatternDeparture addDisruptionIdsItem(Long disruptionIdsItem) {
    if (this.disruptionIds == null) {
      this.disruptionIds = new ArrayList<>();
    }
    this.disruptionIds.add(disruptionIdsItem);
    return this;
  }

   /**
   * Disruption information identifier(s)
   * @return disruptionIds
  **/
  @javax.annotation.Nullable
  public List<Long> getDisruptionIds() {
    return disruptionIds;
  }

  public void setDisruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
  }


  public V3PatternDeparture scheduledDepartureUtc(OffsetDateTime scheduledDepartureUtc) {
    this.scheduledDepartureUtc = scheduledDepartureUtc;
    return this;
  }

   /**
   * Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format
   * @return scheduledDepartureUtc
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getScheduledDepartureUtc() {
    return scheduledDepartureUtc;
  }

  public void setScheduledDepartureUtc(OffsetDateTime scheduledDepartureUtc) {
    this.scheduledDepartureUtc = scheduledDepartureUtc;
  }


  public V3PatternDeparture estimatedDepartureUtc(OffsetDateTime estimatedDepartureUtc) {
    this.estimatedDepartureUtc = estimatedDepartureUtc;
    return this;
  }

   /**
   * Real-time estimate of departure time and date in ISO 8601 UTC format
   * @return estimatedDepartureUtc
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEstimatedDepartureUtc() {
    return estimatedDepartureUtc;
  }

  public void setEstimatedDepartureUtc(OffsetDateTime estimatedDepartureUtc) {
    this.estimatedDepartureUtc = estimatedDepartureUtc;
  }


  public V3PatternDeparture atPlatform(Boolean atPlatform) {
    this.atPlatform = atPlatform;
    return this;
  }

   /**
   * Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes
   * @return atPlatform
  **/
  @javax.annotation.Nullable
  public Boolean getAtPlatform() {
    return atPlatform;
  }

  public void setAtPlatform(Boolean atPlatform) {
    this.atPlatform = atPlatform;
  }


  public V3PatternDeparture platformNumber(String platformNumber) {
    this.platformNumber = platformNumber;
    return this;
  }

   /**
   * Platform number at stop (metropolitan train only; returns null for other modes)
   * @return platformNumber
  **/
  @javax.annotation.Nullable
  public String getPlatformNumber() {
    return platformNumber;
  }

  public void setPlatformNumber(String platformNumber) {
    this.platformNumber = platformNumber;
  }


  public V3PatternDeparture flags(String flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)
   * @return flags
  **/
  @javax.annotation.Nullable
  public String getFlags() {
    return flags;
  }

  public void setFlags(String flags) {
    this.flags = flags;
  }


  public V3PatternDeparture departureSequence(Integer departureSequence) {
    this.departureSequence = departureSequence;
    return this;
  }

   /**
   * Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4
   * @return departureSequence
  **/
  @javax.annotation.Nullable
  public Integer getDepartureSequence() {
    return departureSequence;
  }

  public void setDepartureSequence(Integer departureSequence) {
    this.departureSequence = departureSequence;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3PatternDeparture v3PatternDeparture = (V3PatternDeparture) o;
    return Objects.equals(this.skippedStops, v3PatternDeparture.skippedStops) &&
        Objects.equals(this.stopId, v3PatternDeparture.stopId) &&
        Objects.equals(this.routeId, v3PatternDeparture.routeId) &&
        Objects.equals(this.runId, v3PatternDeparture.runId) &&
        Objects.equals(this.runRef, v3PatternDeparture.runRef) &&
        Objects.equals(this.directionId, v3PatternDeparture.directionId) &&
        Objects.equals(this.disruptionIds, v3PatternDeparture.disruptionIds) &&
        Objects.equals(this.scheduledDepartureUtc, v3PatternDeparture.scheduledDepartureUtc) &&
        Objects.equals(this.estimatedDepartureUtc, v3PatternDeparture.estimatedDepartureUtc) &&
        Objects.equals(this.atPlatform, v3PatternDeparture.atPlatform) &&
        Objects.equals(this.platformNumber, v3PatternDeparture.platformNumber) &&
        Objects.equals(this.flags, v3PatternDeparture.flags) &&
        Objects.equals(this.departureSequence, v3PatternDeparture.departureSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skippedStops, stopId, routeId, runId, runRef, directionId, disruptionIds, scheduledDepartureUtc, estimatedDepartureUtc, atPlatform, platformNumber, flags, departureSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3PatternDeparture {\n");
    sb.append("    skippedStops: ").append(toIndentedString(skippedStops)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    runRef: ").append(toIndentedString(runRef)).append("\n");
    sb.append("    directionId: ").append(toIndentedString(directionId)).append("\n");
    sb.append("    disruptionIds: ").append(toIndentedString(disruptionIds)).append("\n");
    sb.append("    scheduledDepartureUtc: ").append(toIndentedString(scheduledDepartureUtc)).append("\n");
    sb.append("    estimatedDepartureUtc: ").append(toIndentedString(estimatedDepartureUtc)).append("\n");
    sb.append("    atPlatform: ").append(toIndentedString(atPlatform)).append("\n");
    sb.append("    platformNumber: ").append(toIndentedString(platformNumber)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    departureSequence: ").append(toIndentedString(departureSequence)).append("\n");
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
    openapiFields.add("skipped_stops");
    openapiFields.add("stop_id");
    openapiFields.add("route_id");
    openapiFields.add("run_id");
    openapiFields.add("run_ref");
    openapiFields.add("direction_id");
    openapiFields.add("disruption_ids");
    openapiFields.add("scheduled_departure_utc");
    openapiFields.add("estimated_departure_utc");
    openapiFields.add("at_platform");
    openapiFields.add("platform_number");
    openapiFields.add("flags");
    openapiFields.add("departure_sequence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3PatternDeparture
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3PatternDeparture.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3PatternDeparture is not found in the empty JSON string", V3PatternDeparture.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3PatternDeparture.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3PatternDeparture` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("skipped_stops") != null && !jsonObj.get("skipped_stops").isJsonNull()) {
        JsonArray jsonArrayskippedStops = jsonObj.getAsJsonArray("skipped_stops");
        if (jsonArrayskippedStops != null) {
          // ensure the json data is an array
          if (!jsonObj.get("skipped_stops").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `skipped_stops` to be an array in the JSON string but got `%s`", jsonObj.get("skipped_stops").toString()));
          }

          // validate the optional field `skipped_stops` (array)
          for (int i = 0; i < jsonArrayskippedStops.size(); i++) {
            V3StopModel.validateJsonElement(jsonArrayskippedStops.get(i));
          };
        }
      }
      if ((jsonObj.get("run_ref") != null && !jsonObj.get("run_ref").isJsonNull()) && !jsonObj.get("run_ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `run_ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("run_ref").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("disruption_ids") != null && !jsonObj.get("disruption_ids").isJsonNull() && !jsonObj.get("disruption_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `disruption_ids` to be an array in the JSON string but got `%s`", jsonObj.get("disruption_ids").toString()));
      }
      if ((jsonObj.get("platform_number") != null && !jsonObj.get("platform_number").isJsonNull()) && !jsonObj.get("platform_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform_number").toString()));
      }
      if ((jsonObj.get("flags") != null && !jsonObj.get("flags").isJsonNull()) && !jsonObj.get("flags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3PatternDeparture.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3PatternDeparture' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3PatternDeparture> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3PatternDeparture.class));

       return (TypeAdapter<T>) new TypeAdapter<V3PatternDeparture>() {
           @Override
           public void write(JsonWriter out, V3PatternDeparture value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3PatternDeparture read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3PatternDeparture given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3PatternDeparture
  * @throws IOException if the JSON string is invalid with respect to V3PatternDeparture
  */
  public static V3PatternDeparture fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3PatternDeparture.class);
  }

 /**
  * Convert an instance of V3PatternDeparture to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

