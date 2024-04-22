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
 * V3DirectionWithDescription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T22:16:10.196593200+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3DirectionWithDescription {
  public static final String SERIALIZED_NAME_ROUTE_DIRECTION_DESCRIPTION = "route_direction_description";
  @SerializedName(SERIALIZED_NAME_ROUTE_DIRECTION_DESCRIPTION)
  private String routeDirectionDescription;

  public static final String SERIALIZED_NAME_DIRECTION_ID = "direction_id";
  @SerializedName(SERIALIZED_NAME_DIRECTION_ID)
  private Integer directionId;

  public static final String SERIALIZED_NAME_DIRECTION_NAME = "direction_name";
  @SerializedName(SERIALIZED_NAME_DIRECTION_NAME)
  private String directionName;

  public static final String SERIALIZED_NAME_ROUTE_ID = "route_id";
  @SerializedName(SERIALIZED_NAME_ROUTE_ID)
  private Integer routeId;

  public static final String SERIALIZED_NAME_ROUTE_TYPE = "route_type";
  @SerializedName(SERIALIZED_NAME_ROUTE_TYPE)
  private Integer routeType;

  public V3DirectionWithDescription() {
  }

  public V3DirectionWithDescription routeDirectionDescription(String routeDirectionDescription) {
    this.routeDirectionDescription = routeDirectionDescription;
    return this;
  }

   /**
   * Get routeDirectionDescription
   * @return routeDirectionDescription
  **/
  @javax.annotation.Nullable
  public String getRouteDirectionDescription() {
    return routeDirectionDescription;
  }

  public void setRouteDirectionDescription(String routeDirectionDescription) {
    this.routeDirectionDescription = routeDirectionDescription;
  }


  public V3DirectionWithDescription directionId(Integer directionId) {
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


  public V3DirectionWithDescription directionName(String directionName) {
    this.directionName = directionName;
    return this;
  }

   /**
   * Name of direction of travel
   * @return directionName
  **/
  @javax.annotation.Nullable
  public String getDirectionName() {
    return directionName;
  }

  public void setDirectionName(String directionName) {
    this.directionName = directionName;
  }


  public V3DirectionWithDescription routeId(Integer routeId) {
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


  public V3DirectionWithDescription routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

   /**
   * Transport mode identifier
   * @return routeType
  **/
  @javax.annotation.Nullable
  public Integer getRouteType() {
    return routeType;
  }

  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DirectionWithDescription v3DirectionWithDescription = (V3DirectionWithDescription) o;
    return Objects.equals(this.routeDirectionDescription, v3DirectionWithDescription.routeDirectionDescription) &&
        Objects.equals(this.directionId, v3DirectionWithDescription.directionId) &&
        Objects.equals(this.directionName, v3DirectionWithDescription.directionName) &&
        Objects.equals(this.routeId, v3DirectionWithDescription.routeId) &&
        Objects.equals(this.routeType, v3DirectionWithDescription.routeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeDirectionDescription, directionId, directionName, routeId, routeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DirectionWithDescription {\n");
    sb.append("    routeDirectionDescription: ").append(toIndentedString(routeDirectionDescription)).append("\n");
    sb.append("    directionId: ").append(toIndentedString(directionId)).append("\n");
    sb.append("    directionName: ").append(toIndentedString(directionName)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
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
    openapiFields.add("route_direction_description");
    openapiFields.add("direction_id");
    openapiFields.add("direction_name");
    openapiFields.add("route_id");
    openapiFields.add("route_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3DirectionWithDescription
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3DirectionWithDescription.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3DirectionWithDescription is not found in the empty JSON string", V3DirectionWithDescription.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3DirectionWithDescription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3DirectionWithDescription` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("route_direction_description") != null && !jsonObj.get("route_direction_description").isJsonNull()) && !jsonObj.get("route_direction_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route_direction_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route_direction_description").toString()));
      }
      if ((jsonObj.get("direction_name") != null && !jsonObj.get("direction_name").isJsonNull()) && !jsonObj.get("direction_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3DirectionWithDescription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3DirectionWithDescription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3DirectionWithDescription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3DirectionWithDescription.class));

       return (TypeAdapter<T>) new TypeAdapter<V3DirectionWithDescription>() {
           @Override
           public void write(JsonWriter out, V3DirectionWithDescription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3DirectionWithDescription read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3DirectionWithDescription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3DirectionWithDescription
  * @throws IOException if the JSON string is invalid with respect to V3DirectionWithDescription
  */
  public static V3DirectionWithDescription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3DirectionWithDescription.class);
  }

 /**
  * Convert an instance of V3DirectionWithDescription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

