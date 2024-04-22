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
 * V3DynamoDbTimetable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T17:23:48.737568700+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3DynamoDbTimetable {
  public static final String SERIALIZED_NAME_TABLE_NAME = "table_name";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME)
  private String tableName;

  public static final String SERIALIZED_NAME_PARSER_VERSION = "parser_version";
  @SerializedName(SERIALIZED_NAME_PARSER_VERSION)
  private Long parserVersion;

  public static final String SERIALIZED_NAME_PARSER_MAPPING_VERSION = "parser_mapping_version";
  @SerializedName(SERIALIZED_NAME_PARSER_MAPPING_VERSION)
  private String parserMappingVersion;

  public static final String SERIALIZED_NAME_PT_VERSION = "pt_version";
  @SerializedName(SERIALIZED_NAME_PT_VERSION)
  private Long ptVersion;

  public static final String SERIALIZED_NAME_PT_MAPPING_VERSION = "pt_mapping_version";
  @SerializedName(SERIALIZED_NAME_PT_MAPPING_VERSION)
  private String ptMappingVersion;

  /**
   * A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)
   */
  @JsonAdapter(TransportTypeEnum.Adapter.class)
  public enum TransportTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4);

    private Integer value;

    TransportTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransportTypeEnum fromValue(Integer value) {
      for (TransportTypeEnum b : TransportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransportTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransportTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransportTypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return TransportTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      TransportTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TRANSPORT_TYPE = "transport_type";
  @SerializedName(SERIALIZED_NAME_TRANSPORT_TYPE)
  private TransportTypeEnum transportType;

  public static final String SERIALIZED_NAME_APPLICABLE_LOCAL_DATE = "applicable_local_date";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_LOCAL_DATE)
  private String applicableLocalDate;

  public static final String SERIALIZED_NAME_EXISTS = "exists";
  @SerializedName(SERIALIZED_NAME_EXISTS)
  private Boolean exists;

  public V3DynamoDbTimetable() {
  }

  public V3DynamoDbTimetable(
     String applicableLocalDate
  ) {
    this();
    this.applicableLocalDate = applicableLocalDate;
  }

  public V3DynamoDbTimetable tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Name of corresponding table in DynamoDB.
   * @return tableName
  **/
  @javax.annotation.Nullable
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  public V3DynamoDbTimetable parserVersion(Long parserVersion) {
    this.parserVersion = parserVersion;
    return this;
  }

   /**
   * Parser verison
   * @return parserVersion
  **/
  @javax.annotation.Nullable
  public Long getParserVersion() {
    return parserVersion;
  }

  public void setParserVersion(Long parserVersion) {
    this.parserVersion = parserVersion;
  }


  public V3DynamoDbTimetable parserMappingVersion(String parserMappingVersion) {
    this.parserMappingVersion = parserMappingVersion;
    return this;
  }

   /**
   * Diva Mapping Version used to load Parser into DynamoDB
   * @return parserMappingVersion
  **/
  @javax.annotation.Nullable
  public String getParserMappingVersion() {
    return parserMappingVersion;
  }

  public void setParserMappingVersion(String parserMappingVersion) {
    this.parserMappingVersion = parserMappingVersion;
  }


  public V3DynamoDbTimetable ptVersion(Long ptVersion) {
    this.ptVersion = ptVersion;
    return this;
  }

   /**
   * PT version
   * @return ptVersion
  **/
  @javax.annotation.Nullable
  public Long getPtVersion() {
    return ptVersion;
  }

  public void setPtVersion(Long ptVersion) {
    this.ptVersion = ptVersion;
  }


  public V3DynamoDbTimetable ptMappingVersion(String ptMappingVersion) {
    this.ptMappingVersion = ptMappingVersion;
    return this;
  }

   /**
   * Diva Mapping Version used to load PT into DynamoDB
   * @return ptMappingVersion
  **/
  @javax.annotation.Nullable
  public String getPtMappingVersion() {
    return ptMappingVersion;
  }

  public void setPtMappingVersion(String ptMappingVersion) {
    this.ptMappingVersion = ptMappingVersion;
  }


  public V3DynamoDbTimetable transportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
    return this;
  }

   /**
   * A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)
   * @return transportType
  **/
  @javax.annotation.Nullable
  public TransportTypeEnum getTransportType() {
    return transportType;
  }

  public void setTransportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
  }


   /**
   * Formated date string of applicable date
   * @return applicableLocalDate
  **/
  @javax.annotation.Nullable
  public String getApplicableLocalDate() {
    return applicableLocalDate;
  }



  public V3DynamoDbTimetable exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

   /**
   * True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.
   * @return exists
  **/
  @javax.annotation.Nullable
  public Boolean getExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DynamoDbTimetable v3DynamoDbTimetable = (V3DynamoDbTimetable) o;
    return Objects.equals(this.tableName, v3DynamoDbTimetable.tableName) &&
        Objects.equals(this.parserVersion, v3DynamoDbTimetable.parserVersion) &&
        Objects.equals(this.parserMappingVersion, v3DynamoDbTimetable.parserMappingVersion) &&
        Objects.equals(this.ptVersion, v3DynamoDbTimetable.ptVersion) &&
        Objects.equals(this.ptMappingVersion, v3DynamoDbTimetable.ptMappingVersion) &&
        Objects.equals(this.transportType, v3DynamoDbTimetable.transportType) &&
        Objects.equals(this.applicableLocalDate, v3DynamoDbTimetable.applicableLocalDate) &&
        Objects.equals(this.exists, v3DynamoDbTimetable.exists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName, parserVersion, parserMappingVersion, ptVersion, ptMappingVersion, transportType, applicableLocalDate, exists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DynamoDbTimetable {\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    parserVersion: ").append(toIndentedString(parserVersion)).append("\n");
    sb.append("    parserMappingVersion: ").append(toIndentedString(parserMappingVersion)).append("\n");
    sb.append("    ptVersion: ").append(toIndentedString(ptVersion)).append("\n");
    sb.append("    ptMappingVersion: ").append(toIndentedString(ptMappingVersion)).append("\n");
    sb.append("    transportType: ").append(toIndentedString(transportType)).append("\n");
    sb.append("    applicableLocalDate: ").append(toIndentedString(applicableLocalDate)).append("\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
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
    openapiFields.add("table_name");
    openapiFields.add("parser_version");
    openapiFields.add("parser_mapping_version");
    openapiFields.add("pt_version");
    openapiFields.add("pt_mapping_version");
    openapiFields.add("transport_type");
    openapiFields.add("applicable_local_date");
    openapiFields.add("exists");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3DynamoDbTimetable
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3DynamoDbTimetable.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3DynamoDbTimetable is not found in the empty JSON string", V3DynamoDbTimetable.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3DynamoDbTimetable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3DynamoDbTimetable` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("table_name") != null && !jsonObj.get("table_name").isJsonNull()) && !jsonObj.get("table_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `table_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("table_name").toString()));
      }
      if ((jsonObj.get("parser_mapping_version") != null && !jsonObj.get("parser_mapping_version").isJsonNull()) && !jsonObj.get("parser_mapping_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parser_mapping_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parser_mapping_version").toString()));
      }
      if ((jsonObj.get("pt_mapping_version") != null && !jsonObj.get("pt_mapping_version").isJsonNull()) && !jsonObj.get("pt_mapping_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pt_mapping_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pt_mapping_version").toString()));
      }
      // validate the optional field `transport_type`
      if (jsonObj.get("transport_type") != null && !jsonObj.get("transport_type").isJsonNull()) {
        TransportTypeEnum.validateJsonElement(jsonObj.get("transport_type"));
      }
      if ((jsonObj.get("applicable_local_date") != null && !jsonObj.get("applicable_local_date").isJsonNull()) && !jsonObj.get("applicable_local_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicable_local_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicable_local_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3DynamoDbTimetable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3DynamoDbTimetable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3DynamoDbTimetable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3DynamoDbTimetable.class));

       return (TypeAdapter<T>) new TypeAdapter<V3DynamoDbTimetable>() {
           @Override
           public void write(JsonWriter out, V3DynamoDbTimetable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3DynamoDbTimetable read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3DynamoDbTimetable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3DynamoDbTimetable
  * @throws IOException if the JSON string is invalid with respect to V3DynamoDbTimetable
  */
  public static V3DynamoDbTimetable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3DynamoDbTimetable.class);
  }

 /**
  * Convert an instance of V3DynamoDbTimetable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

