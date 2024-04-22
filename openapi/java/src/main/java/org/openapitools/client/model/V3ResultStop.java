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
import org.openapitools.client.model.V3ResultRoute;

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
 * V3ResultStop
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T17:23:48.737568700+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3ResultStop {
  public static final String SERIALIZED_NAME_STOP_DISTANCE = "stop_distance";
  @SerializedName(SERIALIZED_NAME_STOP_DISTANCE)
  private Float stopDistance;

  public static final String SERIALIZED_NAME_STOP_SUBURB = "stop_suburb";
  @SerializedName(SERIALIZED_NAME_STOP_SUBURB)
  private String stopSuburb;

  public static final String SERIALIZED_NAME_ROUTE_TYPE = "route_type";
  @SerializedName(SERIALIZED_NAME_ROUTE_TYPE)
  private Integer routeType;

  public static final String SERIALIZED_NAME_ROUTES = "routes";
  @SerializedName(SERIALIZED_NAME_ROUTES)
  private List<V3ResultRoute> routes = new ArrayList<>();

  public static final String SERIALIZED_NAME_STOP_LATITUDE = "stop_latitude";
  @SerializedName(SERIALIZED_NAME_STOP_LATITUDE)
  private Float stopLatitude;

  public static final String SERIALIZED_NAME_STOP_LONGITUDE = "stop_longitude";
  @SerializedName(SERIALIZED_NAME_STOP_LONGITUDE)
  private Float stopLongitude;

  public static final String SERIALIZED_NAME_STOP_SEQUENCE = "stop_sequence";
  @SerializedName(SERIALIZED_NAME_STOP_SEQUENCE)
  private Integer stopSequence;

  public static final String SERIALIZED_NAME_STOP_ID = "stop_id";
  @SerializedName(SERIALIZED_NAME_STOP_ID)
  private Integer stopId;

  public static final String SERIALIZED_NAME_STOP_NAME = "stop_name";
  @SerializedName(SERIALIZED_NAME_STOP_NAME)
  private String stopName;

  public static final String SERIALIZED_NAME_STOP_LANDMARK = "stop_landmark";
  @SerializedName(SERIALIZED_NAME_STOP_LANDMARK)
  private String stopLandmark;

  public V3ResultStop() {
  }

  public V3ResultStop stopDistance(Float stopDistance) {
    this.stopDistance = stopDistance;
    return this;
  }

   /**
   * Distance of stop from input location (in metres); returns 0 if no location is input
   * @return stopDistance
  **/
  @javax.annotation.Nullable
  public Float getStopDistance() {
    return stopDistance;
  }

  public void setStopDistance(Float stopDistance) {
    this.stopDistance = stopDistance;
  }


  public V3ResultStop stopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
    return this;
  }

   /**
   * suburb of stop
   * @return stopSuburb
  **/
  @javax.annotation.Nullable
  public String getStopSuburb() {
    return stopSuburb;
  }

  public void setStopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
  }


  public V3ResultStop routeType(Integer routeType) {
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


  public V3ResultStop routes(List<V3ResultRoute> routes) {
    this.routes = routes;
    return this;
  }

  public V3ResultStop addRoutesItem(V3ResultRoute routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<>();
    }
    this.routes.add(routesItem);
    return this;
  }

   /**
   * List of routes travelling through the stop
   * @return routes
  **/
  @javax.annotation.Nullable
  public List<V3ResultRoute> getRoutes() {
    return routes;
  }

  public void setRoutes(List<V3ResultRoute> routes) {
    this.routes = routes;
  }


  public V3ResultStop stopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
    return this;
  }

   /**
   * Geographic coordinate of latitude at stop
   * @return stopLatitude
  **/
  @javax.annotation.Nullable
  public Float getStopLatitude() {
    return stopLatitude;
  }

  public void setStopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
  }


  public V3ResultStop stopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
    return this;
  }

   /**
   * Geographic coordinate of longitude at stop
   * @return stopLongitude
  **/
  @javax.annotation.Nullable
  public Float getStopLongitude() {
    return stopLongitude;
  }

  public void setStopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
  }


  public V3ResultStop stopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
    return this;
  }

   /**
   * Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
   * @return stopSequence
  **/
  @javax.annotation.Nullable
  public Integer getStopSequence() {
    return stopSequence;
  }

  public void setStopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
  }


  public V3ResultStop stopId(Integer stopId) {
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


  public V3ResultStop stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

   /**
   * Name of stop
   * @return stopName
  **/
  @javax.annotation.Nullable
  public String getStopName() {
    return stopName;
  }

  public void setStopName(String stopName) {
    this.stopName = stopName;
  }


  public V3ResultStop stopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
    return this;
  }

   /**
   * Landmark in proximity of stop
   * @return stopLandmark
  **/
  @javax.annotation.Nullable
  public String getStopLandmark() {
    return stopLandmark;
  }

  public void setStopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3ResultStop v3ResultStop = (V3ResultStop) o;
    return Objects.equals(this.stopDistance, v3ResultStop.stopDistance) &&
        Objects.equals(this.stopSuburb, v3ResultStop.stopSuburb) &&
        Objects.equals(this.routeType, v3ResultStop.routeType) &&
        Objects.equals(this.routes, v3ResultStop.routes) &&
        Objects.equals(this.stopLatitude, v3ResultStop.stopLatitude) &&
        Objects.equals(this.stopLongitude, v3ResultStop.stopLongitude) &&
        Objects.equals(this.stopSequence, v3ResultStop.stopSequence) &&
        Objects.equals(this.stopId, v3ResultStop.stopId) &&
        Objects.equals(this.stopName, v3ResultStop.stopName) &&
        Objects.equals(this.stopLandmark, v3ResultStop.stopLandmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopDistance, stopSuburb, routeType, routes, stopLatitude, stopLongitude, stopSequence, stopId, stopName, stopLandmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3ResultStop {\n");
    sb.append("    stopDistance: ").append(toIndentedString(stopDistance)).append("\n");
    sb.append("    stopSuburb: ").append(toIndentedString(stopSuburb)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    stopLatitude: ").append(toIndentedString(stopLatitude)).append("\n");
    sb.append("    stopLongitude: ").append(toIndentedString(stopLongitude)).append("\n");
    sb.append("    stopSequence: ").append(toIndentedString(stopSequence)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    stopName: ").append(toIndentedString(stopName)).append("\n");
    sb.append("    stopLandmark: ").append(toIndentedString(stopLandmark)).append("\n");
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
    openapiFields.add("stop_distance");
    openapiFields.add("stop_suburb");
    openapiFields.add("route_type");
    openapiFields.add("routes");
    openapiFields.add("stop_latitude");
    openapiFields.add("stop_longitude");
    openapiFields.add("stop_sequence");
    openapiFields.add("stop_id");
    openapiFields.add("stop_name");
    openapiFields.add("stop_landmark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3ResultStop
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3ResultStop.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3ResultStop is not found in the empty JSON string", V3ResultStop.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3ResultStop.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3ResultStop` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("stop_suburb") != null && !jsonObj.get("stop_suburb").isJsonNull()) && !jsonObj.get("stop_suburb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stop_suburb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stop_suburb").toString()));
      }
      if (jsonObj.get("routes") != null && !jsonObj.get("routes").isJsonNull()) {
        JsonArray jsonArrayroutes = jsonObj.getAsJsonArray("routes");
        if (jsonArrayroutes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("routes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `routes` to be an array in the JSON string but got `%s`", jsonObj.get("routes").toString()));
          }

          // validate the optional field `routes` (array)
          for (int i = 0; i < jsonArrayroutes.size(); i++) {
            V3ResultRoute.validateJsonElement(jsonArrayroutes.get(i));
          };
        }
      }
      if ((jsonObj.get("stop_name") != null && !jsonObj.get("stop_name").isJsonNull()) && !jsonObj.get("stop_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stop_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stop_name").toString()));
      }
      if ((jsonObj.get("stop_landmark") != null && !jsonObj.get("stop_landmark").isJsonNull()) && !jsonObj.get("stop_landmark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stop_landmark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stop_landmark").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3ResultStop.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3ResultStop' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3ResultStop> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3ResultStop.class));

       return (TypeAdapter<T>) new TypeAdapter<V3ResultStop>() {
           @Override
           public void write(JsonWriter out, V3ResultStop value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3ResultStop read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3ResultStop given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3ResultStop
  * @throws IOException if the JSON string is invalid with respect to V3ResultStop
  */
  public static V3ResultStop fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3ResultStop.class);
  }

 /**
  * Convert an instance of V3ResultStop to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

