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
import org.openapitools.client.model.V3StopDepartureRequest;

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
 * V3BulkDeparturesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T17:23:48.737568700+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3BulkDeparturesRequest {
  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private List<V3StopDepartureRequest> requests = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATE_UTC = "date_utc";
  @SerializedName(SERIALIZED_NAME_DATE_UTC)
  private OffsetDateTime dateUtc;

  public static final String SERIALIZED_NAME_LOOK_BACKWARDS = "look_backwards";
  @SerializedName(SERIALIZED_NAME_LOOK_BACKWARDS)
  private Boolean lookBackwards;

  public static final String SERIALIZED_NAME_INCLUDE_CANCELLED = "include_cancelled";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CANCELLED)
  private Boolean includeCancelled;

  public static final String SERIALIZED_NAME_INCLUDE_GEOPATH = "include_geopath";
  @SerializedName(SERIALIZED_NAME_INCLUDE_GEOPATH)
  private Boolean includeGeopath;

  /**
   * Gets or Sets expand
   */
  @JsonAdapter(ExpandEnum.Adapter.class)
  public enum ExpandEnum {
    ALL("All"),
    
    STOP("Stop"),
    
    ROUTE("Route"),
    
    RUN("Run"),
    
    DIRECTION("Direction"),
    
    DISRUPTION("Disruption"),
    
    VEHICLEDESCRIPTOR("VehicleDescriptor"),
    
    VEHICLEPOSITION("VehiclePosition"),
    
    NONE("None");

    private String value;

    ExpandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExpandEnum fromValue(String value) {
      for (ExpandEnum b : ExpandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExpandEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExpandEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExpandEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExpandEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ExpandEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private List<ExpandEnum> expand = new ArrayList<>();

  public V3BulkDeparturesRequest() {
  }

  public V3BulkDeparturesRequest requests(List<V3StopDepartureRequest> requests) {
    this.requests = requests;
    return this;
  }

  public V3BulkDeparturesRequest addRequestsItem(V3StopDepartureRequest requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * Collection of departure requests
   * @return requests
  **/
  @javax.annotation.Nonnull
  public List<V3StopDepartureRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<V3StopDepartureRequest> requests) {
    this.requests = requests;
  }


  public V3BulkDeparturesRequest dateUtc(OffsetDateTime dateUtc) {
    this.dateUtc = dateUtc;
    return this;
  }

   /**
   * Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)
   * @return dateUtc
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateUtc() {
    return dateUtc;
  }

  public void setDateUtc(OffsetDateTime dateUtc) {
    this.dateUtc = dateUtc;
  }


  public V3BulkDeparturesRequest lookBackwards(Boolean lookBackwards) {
    this.lookBackwards = lookBackwards;
    return this;
  }

   /**
   * Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.
   * @return lookBackwards
  **/
  @javax.annotation.Nullable
  public Boolean getLookBackwards() {
    return lookBackwards;
  }

  public void setLookBackwards(Boolean lookBackwards) {
    this.lookBackwards = lookBackwards;
  }


  public V3BulkDeparturesRequest includeCancelled(Boolean includeCancelled) {
    this.includeCancelled = includeCancelled;
    return this;
  }

   /**
   * Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only
   * @return includeCancelled
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeCancelled() {
    return includeCancelled;
  }

  public void setIncludeCancelled(Boolean includeCancelled) {
    this.includeCancelled = includeCancelled;
  }


  public V3BulkDeparturesRequest includeGeopath(Boolean includeGeopath) {
    this.includeGeopath = includeGeopath;
    return this;
  }

   /**
   * Indicates if the route geopath should be returned
   * @return includeGeopath
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeGeopath() {
    return includeGeopath;
  }

  public void setIncludeGeopath(Boolean includeGeopath) {
    this.includeGeopath = includeGeopath;
  }


  public V3BulkDeparturesRequest expand(List<ExpandEnum> expand) {
    this.expand = expand;
    return this;
  }

  public V3BulkDeparturesRequest addExpandItem(ExpandEnum expandItem) {
    if (this.expand == null) {
      this.expand = new ArrayList<>();
    }
    this.expand.add(expandItem);
    return this;
  }

   /**
   * List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none
   * @return expand
  **/
  @javax.annotation.Nullable
  public List<ExpandEnum> getExpand() {
    return expand;
  }

  public void setExpand(List<ExpandEnum> expand) {
    this.expand = expand;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3BulkDeparturesRequest v3BulkDeparturesRequest = (V3BulkDeparturesRequest) o;
    return Objects.equals(this.requests, v3BulkDeparturesRequest.requests) &&
        Objects.equals(this.dateUtc, v3BulkDeparturesRequest.dateUtc) &&
        Objects.equals(this.lookBackwards, v3BulkDeparturesRequest.lookBackwards) &&
        Objects.equals(this.includeCancelled, v3BulkDeparturesRequest.includeCancelled) &&
        Objects.equals(this.includeGeopath, v3BulkDeparturesRequest.includeGeopath) &&
        Objects.equals(this.expand, v3BulkDeparturesRequest.expand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests, dateUtc, lookBackwards, includeCancelled, includeGeopath, expand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3BulkDeparturesRequest {\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    dateUtc: ").append(toIndentedString(dateUtc)).append("\n");
    sb.append("    lookBackwards: ").append(toIndentedString(lookBackwards)).append("\n");
    sb.append("    includeCancelled: ").append(toIndentedString(includeCancelled)).append("\n");
    sb.append("    includeGeopath: ").append(toIndentedString(includeGeopath)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
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
    openapiFields.add("requests");
    openapiFields.add("date_utc");
    openapiFields.add("look_backwards");
    openapiFields.add("include_cancelled");
    openapiFields.add("include_geopath");
    openapiFields.add("expand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("requests");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3BulkDeparturesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3BulkDeparturesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3BulkDeparturesRequest is not found in the empty JSON string", V3BulkDeparturesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3BulkDeparturesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3BulkDeparturesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V3BulkDeparturesRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("requests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requests` to be an array in the JSON string but got `%s`", jsonObj.get("requests").toString()));
      }

      JsonArray jsonArrayrequests = jsonObj.getAsJsonArray("requests");
      // validate the required field `requests` (array)
      for (int i = 0; i < jsonArrayrequests.size(); i++) {
        V3StopDepartureRequest.validateJsonElement(jsonArrayrequests.get(i));
      };
      // ensure the optional json data is an array if present
      if (jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull() && !jsonObj.get("expand").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be an array in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3BulkDeparturesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3BulkDeparturesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3BulkDeparturesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3BulkDeparturesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<V3BulkDeparturesRequest>() {
           @Override
           public void write(JsonWriter out, V3BulkDeparturesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3BulkDeparturesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3BulkDeparturesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3BulkDeparturesRequest
  * @throws IOException if the JSON string is invalid with respect to V3BulkDeparturesRequest
  */
  public static V3BulkDeparturesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3BulkDeparturesRequest.class);
  }

 /**
  * Convert an instance of V3BulkDeparturesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

