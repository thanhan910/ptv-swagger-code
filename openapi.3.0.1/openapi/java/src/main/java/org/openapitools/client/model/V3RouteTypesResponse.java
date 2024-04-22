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
import org.openapitools.client.model.V3RouteType;
import org.openapitools.client.model.V3Status;

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
 * V3RouteTypesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T22:17:14.003555400+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3RouteTypesResponse {
  public static final String SERIALIZED_NAME_ROUTE_TYPES = "route_types";
  @SerializedName(SERIALIZED_NAME_ROUTE_TYPES)
  private List<V3RouteType> routeTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private V3Status status;

  public V3RouteTypesResponse() {
  }

  public V3RouteTypesResponse routeTypes(List<V3RouteType> routeTypes) {
    this.routeTypes = routeTypes;
    return this;
  }

  public V3RouteTypesResponse addRouteTypesItem(V3RouteType routeTypesItem) {
    if (this.routeTypes == null) {
      this.routeTypes = new ArrayList<>();
    }
    this.routeTypes.add(routeTypesItem);
    return this;
  }

   /**
   * Transport mode identifiers
   * @return routeTypes
  **/
  @javax.annotation.Nullable
  public List<V3RouteType> getRouteTypes() {
    return routeTypes;
  }

  public void setRouteTypes(List<V3RouteType> routeTypes) {
    this.routeTypes = routeTypes;
  }


  public V3RouteTypesResponse status(V3Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public V3Status getStatus() {
    return status;
  }

  public void setStatus(V3Status status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3RouteTypesResponse v3RouteTypesResponse = (V3RouteTypesResponse) o;
    return Objects.equals(this.routeTypes, v3RouteTypesResponse.routeTypes) &&
        Objects.equals(this.status, v3RouteTypesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeTypes, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3RouteTypesResponse {\n");
    sb.append("    routeTypes: ").append(toIndentedString(routeTypes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("route_types");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3RouteTypesResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3RouteTypesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3RouteTypesResponse is not found in the empty JSON string", V3RouteTypesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3RouteTypesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3RouteTypesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("route_types") != null && !jsonObj.get("route_types").isJsonNull()) {
        JsonArray jsonArrayrouteTypes = jsonObj.getAsJsonArray("route_types");
        if (jsonArrayrouteTypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("route_types").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `route_types` to be an array in the JSON string but got `%s`", jsonObj.get("route_types").toString()));
          }

          // validate the optional field `route_types` (array)
          for (int i = 0; i < jsonArrayrouteTypes.size(); i++) {
            V3RouteType.validateJsonElement(jsonArrayrouteTypes.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        V3Status.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3RouteTypesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3RouteTypesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3RouteTypesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3RouteTypesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<V3RouteTypesResponse>() {
           @Override
           public void write(JsonWriter out, V3RouteTypesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3RouteTypesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3RouteTypesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3RouteTypesResponse
  * @throws IOException if the JSON string is invalid with respect to V3RouteTypesResponse
  */
  public static V3RouteTypesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3RouteTypesResponse.class);
  }

 /**
  * Convert an instance of V3RouteTypesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

