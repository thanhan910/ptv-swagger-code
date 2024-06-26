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
import org.openapitools.client.model.V3DisruptionDirection;

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
 * V3DisruptionRoute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T22:16:10.196593200+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3DisruptionRoute {
  public static final String SERIALIZED_NAME_ROUTE_TYPE = "route_type";
  @SerializedName(SERIALIZED_NAME_ROUTE_TYPE)
  private Integer routeType;

  public static final String SERIALIZED_NAME_ROUTE_ID = "route_id";
  @SerializedName(SERIALIZED_NAME_ROUTE_ID)
  private Integer routeId;

  public static final String SERIALIZED_NAME_ROUTE_NAME = "route_name";
  @SerializedName(SERIALIZED_NAME_ROUTE_NAME)
  private String routeName;

  public static final String SERIALIZED_NAME_ROUTE_NUMBER = "route_number";
  @SerializedName(SERIALIZED_NAME_ROUTE_NUMBER)
  private String routeNumber;

  public static final String SERIALIZED_NAME_ROUTE_GTFS_ID = "route_gtfs_id";
  @SerializedName(SERIALIZED_NAME_ROUTE_GTFS_ID)
  private String routeGtfsId;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private V3DisruptionDirection direction;

  public V3DisruptionRoute() {
  }

  public V3DisruptionRoute routeType(Integer routeType) {
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


  public V3DisruptionRoute routeId(Integer routeId) {
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


  public V3DisruptionRoute routeName(String routeName) {
    this.routeName = routeName;
    return this;
  }

   /**
   * Name of route
   * @return routeName
  **/
  @javax.annotation.Nullable
  public String getRouteName() {
    return routeName;
  }

  public void setRouteName(String routeName) {
    this.routeName = routeName;
  }


  public V3DisruptionRoute routeNumber(String routeNumber) {
    this.routeNumber = routeNumber;
    return this;
  }

   /**
   * Route number presented to public (i.e. not route_id)
   * @return routeNumber
  **/
  @javax.annotation.Nullable
  public String getRouteNumber() {
    return routeNumber;
  }

  public void setRouteNumber(String routeNumber) {
    this.routeNumber = routeNumber;
  }


  public V3DisruptionRoute routeGtfsId(String routeGtfsId) {
    this.routeGtfsId = routeGtfsId;
    return this;
  }

   /**
   * GTFS Identifer of the route
   * @return routeGtfsId
  **/
  @javax.annotation.Nullable
  public String getRouteGtfsId() {
    return routeGtfsId;
  }

  public void setRouteGtfsId(String routeGtfsId) {
    this.routeGtfsId = routeGtfsId;
  }


  public V3DisruptionRoute direction(V3DisruptionDirection direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  public V3DisruptionDirection getDirection() {
    return direction;
  }

  public void setDirection(V3DisruptionDirection direction) {
    this.direction = direction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DisruptionRoute v3DisruptionRoute = (V3DisruptionRoute) o;
    return Objects.equals(this.routeType, v3DisruptionRoute.routeType) &&
        Objects.equals(this.routeId, v3DisruptionRoute.routeId) &&
        Objects.equals(this.routeName, v3DisruptionRoute.routeName) &&
        Objects.equals(this.routeNumber, v3DisruptionRoute.routeNumber) &&
        Objects.equals(this.routeGtfsId, v3DisruptionRoute.routeGtfsId) &&
        Objects.equals(this.direction, v3DisruptionRoute.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeType, routeId, routeName, routeNumber, routeGtfsId, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DisruptionRoute {\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    routeName: ").append(toIndentedString(routeName)).append("\n");
    sb.append("    routeNumber: ").append(toIndentedString(routeNumber)).append("\n");
    sb.append("    routeGtfsId: ").append(toIndentedString(routeGtfsId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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
    openapiFields.add("route_type");
    openapiFields.add("route_id");
    openapiFields.add("route_name");
    openapiFields.add("route_number");
    openapiFields.add("route_gtfs_id");
    openapiFields.add("direction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3DisruptionRoute
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3DisruptionRoute.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3DisruptionRoute is not found in the empty JSON string", V3DisruptionRoute.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3DisruptionRoute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3DisruptionRoute` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("route_name") != null && !jsonObj.get("route_name").isJsonNull()) && !jsonObj.get("route_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route_name").toString()));
      }
      if ((jsonObj.get("route_number") != null && !jsonObj.get("route_number").isJsonNull()) && !jsonObj.get("route_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route_number").toString()));
      }
      if ((jsonObj.get("route_gtfs_id") != null && !jsonObj.get("route_gtfs_id").isJsonNull()) && !jsonObj.get("route_gtfs_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route_gtfs_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route_gtfs_id").toString()));
      }
      // validate the optional field `direction`
      if (jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull()) {
        V3DisruptionDirection.validateJsonElement(jsonObj.get("direction"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3DisruptionRoute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3DisruptionRoute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3DisruptionRoute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3DisruptionRoute.class));

       return (TypeAdapter<T>) new TypeAdapter<V3DisruptionRoute>() {
           @Override
           public void write(JsonWriter out, V3DisruptionRoute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3DisruptionRoute read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3DisruptionRoute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3DisruptionRoute
  * @throws IOException if the JSON string is invalid with respect to V3DisruptionRoute
  */
  public static V3DisruptionRoute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3DisruptionRoute.class);
  }

 /**
  * Convert an instance of V3DisruptionRoute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

