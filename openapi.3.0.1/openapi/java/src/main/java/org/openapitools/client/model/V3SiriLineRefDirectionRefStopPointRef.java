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
 * V3SiriLineRefDirectionRefStopPointRef
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T22:00:03.206044600+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3SiriLineRefDirectionRefStopPointRef {
  public static final String SERIALIZED_NAME_LINE_REF = "line_ref";
  @SerializedName(SERIALIZED_NAME_LINE_REF)
  private String lineRef;

  /**
   * Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
   */
  @JsonAdapter(DirectionRefEnum.Adapter.class)
  public enum DirectionRefEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_5(5),
    
    NUMBER_10(10),
    
    NUMBER_16(16),
    
    NUMBER_32(32),
    
    NUMBER_65(65),
    
    NUMBER_130(130);

    private Integer value;

    DirectionRefEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionRefEnum fromValue(Integer value) {
      for (DirectionRefEnum b : DirectionRefEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DirectionRefEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionRefEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionRefEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return DirectionRefEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      DirectionRefEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DIRECTION_REF = "direction_ref";
  @SerializedName(SERIALIZED_NAME_DIRECTION_REF)
  private DirectionRefEnum directionRef;

  public static final String SERIALIZED_NAME_STOP_POINT_REF = "stop_point_ref";
  @SerializedName(SERIALIZED_NAME_STOP_POINT_REF)
  private Integer stopPointRef;

  public V3SiriLineRefDirectionRefStopPointRef() {
  }

  public V3SiriLineRefDirectionRefStopPointRef lineRef(String lineRef) {
    this.lineRef = lineRef;
    return this;
  }

   /**
   * Siri LineRef
   * @return lineRef
  **/
  @javax.annotation.Nonnull
  public String getLineRef() {
    return lineRef;
  }

  public void setLineRef(String lineRef) {
    this.lineRef = lineRef;
  }


  public V3SiriLineRefDirectionRefStopPointRef directionRef(DirectionRefEnum directionRef) {
    this.directionRef = directionRef;
    return this;
  }

   /**
   * Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
   * @return directionRef
  **/
  @javax.annotation.Nonnull
  public DirectionRefEnum getDirectionRef() {
    return directionRef;
  }

  public void setDirectionRef(DirectionRefEnum directionRef) {
    this.directionRef = directionRef;
  }


  public V3SiriLineRefDirectionRefStopPointRef stopPointRef(Integer stopPointRef) {
    this.stopPointRef = stopPointRef;
    return this;
  }

   /**
   * Siri StopPointRef
   * @return stopPointRef
  **/
  @javax.annotation.Nonnull
  public Integer getStopPointRef() {
    return stopPointRef;
  }

  public void setStopPointRef(Integer stopPointRef) {
    this.stopPointRef = stopPointRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriLineRefDirectionRefStopPointRef v3SiriLineRefDirectionRefStopPointRef = (V3SiriLineRefDirectionRefStopPointRef) o;
    return Objects.equals(this.lineRef, v3SiriLineRefDirectionRefStopPointRef.lineRef) &&
        Objects.equals(this.directionRef, v3SiriLineRefDirectionRefStopPointRef.directionRef) &&
        Objects.equals(this.stopPointRef, v3SiriLineRefDirectionRefStopPointRef.stopPointRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineRef, directionRef, stopPointRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriLineRefDirectionRefStopPointRef {\n");
    sb.append("    lineRef: ").append(toIndentedString(lineRef)).append("\n");
    sb.append("    directionRef: ").append(toIndentedString(directionRef)).append("\n");
    sb.append("    stopPointRef: ").append(toIndentedString(stopPointRef)).append("\n");
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
    openapiFields.add("line_ref");
    openapiFields.add("direction_ref");
    openapiFields.add("stop_point_ref");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("line_ref");
    openapiRequiredFields.add("direction_ref");
    openapiRequiredFields.add("stop_point_ref");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3SiriLineRefDirectionRefStopPointRef
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3SiriLineRefDirectionRefStopPointRef.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3SiriLineRefDirectionRefStopPointRef is not found in the empty JSON string", V3SiriLineRefDirectionRefStopPointRef.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3SiriLineRefDirectionRefStopPointRef.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3SiriLineRefDirectionRefStopPointRef` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V3SiriLineRefDirectionRefStopPointRef.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("line_ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line_ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line_ref").toString()));
      }
      // validate the required field `direction_ref`
      DirectionRefEnum.validateJsonElement(jsonObj.get("direction_ref"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3SiriLineRefDirectionRefStopPointRef.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3SiriLineRefDirectionRefStopPointRef' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3SiriLineRefDirectionRefStopPointRef> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3SiriLineRefDirectionRefStopPointRef.class));

       return (TypeAdapter<T>) new TypeAdapter<V3SiriLineRefDirectionRefStopPointRef>() {
           @Override
           public void write(JsonWriter out, V3SiriLineRefDirectionRefStopPointRef value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3SiriLineRefDirectionRefStopPointRef read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3SiriLineRefDirectionRefStopPointRef given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3SiriLineRefDirectionRefStopPointRef
  * @throws IOException if the JSON string is invalid with respect to V3SiriLineRefDirectionRefStopPointRef
  */
  public static V3SiriLineRefDirectionRefStopPointRef fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3SiriLineRefDirectionRefStopPointRef.class);
  }

 /**
  * Convert an instance of V3SiriLineRefDirectionRefStopPointRef to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
