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
 * V3ResultOutlet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T22:17:14.003555400+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3ResultOutlet {
  public static final String SERIALIZED_NAME_OUTLET_DISTANCE = "outlet_distance";
  @SerializedName(SERIALIZED_NAME_OUTLET_DISTANCE)
  private Float outletDistance;

  public static final String SERIALIZED_NAME_OUTLET_SLID_SPID = "outlet_slid_spid";
  @SerializedName(SERIALIZED_NAME_OUTLET_SLID_SPID)
  private String outletSlidSpid;

  public static final String SERIALIZED_NAME_OUTLET_NAME = "outlet_name";
  @SerializedName(SERIALIZED_NAME_OUTLET_NAME)
  private String outletName;

  public static final String SERIALIZED_NAME_OUTLET_BUSINESS = "outlet_business";
  @SerializedName(SERIALIZED_NAME_OUTLET_BUSINESS)
  private String outletBusiness;

  public static final String SERIALIZED_NAME_OUTLET_LATITUDE = "outlet_latitude";
  @SerializedName(SERIALIZED_NAME_OUTLET_LATITUDE)
  private Float outletLatitude;

  public static final String SERIALIZED_NAME_OUTLET_LONGITUDE = "outlet_longitude";
  @SerializedName(SERIALIZED_NAME_OUTLET_LONGITUDE)
  private Float outletLongitude;

  public static final String SERIALIZED_NAME_OUTLET_SUBURB = "outlet_suburb";
  @SerializedName(SERIALIZED_NAME_OUTLET_SUBURB)
  private String outletSuburb;

  public static final String SERIALIZED_NAME_OUTLET_POSTCODE = "outlet_postcode";
  @SerializedName(SERIALIZED_NAME_OUTLET_POSTCODE)
  private Integer outletPostcode;

  public static final String SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_MON = "outlet_business_hour_mon";
  @SerializedName(SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_MON)
  private String outletBusinessHourMon;

  public static final String SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_TUE = "outlet_business_hour_tue";
  @SerializedName(SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_TUE)
  private String outletBusinessHourTue;

  public static final String SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_WED = "outlet_business_hour_wed";
  @SerializedName(SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_WED)
  private String outletBusinessHourWed;

  public static final String SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_THUR = "outlet_business_hour_thur";
  @SerializedName(SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_THUR)
  private String outletBusinessHourThur;

  public static final String SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_FRI = "outlet_business_hour_fri";
  @SerializedName(SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_FRI)
  private String outletBusinessHourFri;

  public static final String SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_SAT = "outlet_business_hour_sat";
  @SerializedName(SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_SAT)
  private String outletBusinessHourSat;

  public static final String SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_SUN = "outlet_business_hour_sun";
  @SerializedName(SERIALIZED_NAME_OUTLET_BUSINESS_HOUR_SUN)
  private String outletBusinessHourSun;

  public static final String SERIALIZED_NAME_OUTLET_NOTES = "outlet_notes";
  @SerializedName(SERIALIZED_NAME_OUTLET_NOTES)
  private String outletNotes;

  public V3ResultOutlet() {
  }

  public V3ResultOutlet outletDistance(Float outletDistance) {
    this.outletDistance = outletDistance;
    return this;
  }

   /**
   * Distance of outlet from input location (in metres); returns 0 if no location is input
   * @return outletDistance
  **/
  @javax.annotation.Nullable
  public Float getOutletDistance() {
    return outletDistance;
  }

  public void setOutletDistance(Float outletDistance) {
    this.outletDistance = outletDistance;
  }


  public V3ResultOutlet outletSlidSpid(String outletSlidSpid) {
    this.outletSlidSpid = outletSlidSpid;
    return this;
  }

   /**
   * The SLID / SPID
   * @return outletSlidSpid
  **/
  @javax.annotation.Nullable
  public String getOutletSlidSpid() {
    return outletSlidSpid;
  }

  public void setOutletSlidSpid(String outletSlidSpid) {
    this.outletSlidSpid = outletSlidSpid;
  }


  public V3ResultOutlet outletName(String outletName) {
    this.outletName = outletName;
    return this;
  }

   /**
   * The location name of the outlet
   * @return outletName
  **/
  @javax.annotation.Nullable
  public String getOutletName() {
    return outletName;
  }

  public void setOutletName(String outletName) {
    this.outletName = outletName;
  }


  public V3ResultOutlet outletBusiness(String outletBusiness) {
    this.outletBusiness = outletBusiness;
    return this;
  }

   /**
   * The business name of the outlet
   * @return outletBusiness
  **/
  @javax.annotation.Nullable
  public String getOutletBusiness() {
    return outletBusiness;
  }

  public void setOutletBusiness(String outletBusiness) {
    this.outletBusiness = outletBusiness;
  }


  public V3ResultOutlet outletLatitude(Float outletLatitude) {
    this.outletLatitude = outletLatitude;
    return this;
  }

   /**
   * Geographic coordinate of latitude at outlet
   * @return outletLatitude
  **/
  @javax.annotation.Nullable
  public Float getOutletLatitude() {
    return outletLatitude;
  }

  public void setOutletLatitude(Float outletLatitude) {
    this.outletLatitude = outletLatitude;
  }


  public V3ResultOutlet outletLongitude(Float outletLongitude) {
    this.outletLongitude = outletLongitude;
    return this;
  }

   /**
   * Geographic coordinate of longitude at outlet
   * @return outletLongitude
  **/
  @javax.annotation.Nullable
  public Float getOutletLongitude() {
    return outletLongitude;
  }

  public void setOutletLongitude(Float outletLongitude) {
    this.outletLongitude = outletLongitude;
  }


  public V3ResultOutlet outletSuburb(String outletSuburb) {
    this.outletSuburb = outletSuburb;
    return this;
  }

   /**
   * The city/municipality the outlet is in
   * @return outletSuburb
  **/
  @javax.annotation.Nullable
  public String getOutletSuburb() {
    return outletSuburb;
  }

  public void setOutletSuburb(String outletSuburb) {
    this.outletSuburb = outletSuburb;
  }


  public V3ResultOutlet outletPostcode(Integer outletPostcode) {
    this.outletPostcode = outletPostcode;
    return this;
  }

   /**
   * The postcode for the outlet
   * @return outletPostcode
  **/
  @javax.annotation.Nullable
  public Integer getOutletPostcode() {
    return outletPostcode;
  }

  public void setOutletPostcode(Integer outletPostcode) {
    this.outletPostcode = outletPostcode;
  }


  public V3ResultOutlet outletBusinessHourMon(String outletBusinessHourMon) {
    this.outletBusinessHourMon = outletBusinessHourMon;
    return this;
  }

   /**
   * The business hours on Monday
   * @return outletBusinessHourMon
  **/
  @javax.annotation.Nullable
  public String getOutletBusinessHourMon() {
    return outletBusinessHourMon;
  }

  public void setOutletBusinessHourMon(String outletBusinessHourMon) {
    this.outletBusinessHourMon = outletBusinessHourMon;
  }


  public V3ResultOutlet outletBusinessHourTue(String outletBusinessHourTue) {
    this.outletBusinessHourTue = outletBusinessHourTue;
    return this;
  }

   /**
   * The business hours on Tuesday
   * @return outletBusinessHourTue
  **/
  @javax.annotation.Nullable
  public String getOutletBusinessHourTue() {
    return outletBusinessHourTue;
  }

  public void setOutletBusinessHourTue(String outletBusinessHourTue) {
    this.outletBusinessHourTue = outletBusinessHourTue;
  }


  public V3ResultOutlet outletBusinessHourWed(String outletBusinessHourWed) {
    this.outletBusinessHourWed = outletBusinessHourWed;
    return this;
  }

   /**
   * The business hours on Wednesday
   * @return outletBusinessHourWed
  **/
  @javax.annotation.Nullable
  public String getOutletBusinessHourWed() {
    return outletBusinessHourWed;
  }

  public void setOutletBusinessHourWed(String outletBusinessHourWed) {
    this.outletBusinessHourWed = outletBusinessHourWed;
  }


  public V3ResultOutlet outletBusinessHourThur(String outletBusinessHourThur) {
    this.outletBusinessHourThur = outletBusinessHourThur;
    return this;
  }

   /**
   * The business hours on Thursday
   * @return outletBusinessHourThur
  **/
  @javax.annotation.Nullable
  public String getOutletBusinessHourThur() {
    return outletBusinessHourThur;
  }

  public void setOutletBusinessHourThur(String outletBusinessHourThur) {
    this.outletBusinessHourThur = outletBusinessHourThur;
  }


  public V3ResultOutlet outletBusinessHourFri(String outletBusinessHourFri) {
    this.outletBusinessHourFri = outletBusinessHourFri;
    return this;
  }

   /**
   * The business hours on Friday
   * @return outletBusinessHourFri
  **/
  @javax.annotation.Nullable
  public String getOutletBusinessHourFri() {
    return outletBusinessHourFri;
  }

  public void setOutletBusinessHourFri(String outletBusinessHourFri) {
    this.outletBusinessHourFri = outletBusinessHourFri;
  }


  public V3ResultOutlet outletBusinessHourSat(String outletBusinessHourSat) {
    this.outletBusinessHourSat = outletBusinessHourSat;
    return this;
  }

   /**
   * The business hours on Saturday
   * @return outletBusinessHourSat
  **/
  @javax.annotation.Nullable
  public String getOutletBusinessHourSat() {
    return outletBusinessHourSat;
  }

  public void setOutletBusinessHourSat(String outletBusinessHourSat) {
    this.outletBusinessHourSat = outletBusinessHourSat;
  }


  public V3ResultOutlet outletBusinessHourSun(String outletBusinessHourSun) {
    this.outletBusinessHourSun = outletBusinessHourSun;
    return this;
  }

   /**
   * The business hours on Sunday
   * @return outletBusinessHourSun
  **/
  @javax.annotation.Nullable
  public String getOutletBusinessHourSun() {
    return outletBusinessHourSun;
  }

  public void setOutletBusinessHourSun(String outletBusinessHourSun) {
    this.outletBusinessHourSun = outletBusinessHourSun;
  }


  public V3ResultOutlet outletNotes(String outletNotes) {
    this.outletNotes = outletNotes;
    return this;
  }

   /**
   * Any additional notes for the outlet such as &#39;Buy pre-loaded myki cards only&#39;. May be null/empty.
   * @return outletNotes
  **/
  @javax.annotation.Nullable
  public String getOutletNotes() {
    return outletNotes;
  }

  public void setOutletNotes(String outletNotes) {
    this.outletNotes = outletNotes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3ResultOutlet v3ResultOutlet = (V3ResultOutlet) o;
    return Objects.equals(this.outletDistance, v3ResultOutlet.outletDistance) &&
        Objects.equals(this.outletSlidSpid, v3ResultOutlet.outletSlidSpid) &&
        Objects.equals(this.outletName, v3ResultOutlet.outletName) &&
        Objects.equals(this.outletBusiness, v3ResultOutlet.outletBusiness) &&
        Objects.equals(this.outletLatitude, v3ResultOutlet.outletLatitude) &&
        Objects.equals(this.outletLongitude, v3ResultOutlet.outletLongitude) &&
        Objects.equals(this.outletSuburb, v3ResultOutlet.outletSuburb) &&
        Objects.equals(this.outletPostcode, v3ResultOutlet.outletPostcode) &&
        Objects.equals(this.outletBusinessHourMon, v3ResultOutlet.outletBusinessHourMon) &&
        Objects.equals(this.outletBusinessHourTue, v3ResultOutlet.outletBusinessHourTue) &&
        Objects.equals(this.outletBusinessHourWed, v3ResultOutlet.outletBusinessHourWed) &&
        Objects.equals(this.outletBusinessHourThur, v3ResultOutlet.outletBusinessHourThur) &&
        Objects.equals(this.outletBusinessHourFri, v3ResultOutlet.outletBusinessHourFri) &&
        Objects.equals(this.outletBusinessHourSat, v3ResultOutlet.outletBusinessHourSat) &&
        Objects.equals(this.outletBusinessHourSun, v3ResultOutlet.outletBusinessHourSun) &&
        Objects.equals(this.outletNotes, v3ResultOutlet.outletNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outletDistance, outletSlidSpid, outletName, outletBusiness, outletLatitude, outletLongitude, outletSuburb, outletPostcode, outletBusinessHourMon, outletBusinessHourTue, outletBusinessHourWed, outletBusinessHourThur, outletBusinessHourFri, outletBusinessHourSat, outletBusinessHourSun, outletNotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3ResultOutlet {\n");
    sb.append("    outletDistance: ").append(toIndentedString(outletDistance)).append("\n");
    sb.append("    outletSlidSpid: ").append(toIndentedString(outletSlidSpid)).append("\n");
    sb.append("    outletName: ").append(toIndentedString(outletName)).append("\n");
    sb.append("    outletBusiness: ").append(toIndentedString(outletBusiness)).append("\n");
    sb.append("    outletLatitude: ").append(toIndentedString(outletLatitude)).append("\n");
    sb.append("    outletLongitude: ").append(toIndentedString(outletLongitude)).append("\n");
    sb.append("    outletSuburb: ").append(toIndentedString(outletSuburb)).append("\n");
    sb.append("    outletPostcode: ").append(toIndentedString(outletPostcode)).append("\n");
    sb.append("    outletBusinessHourMon: ").append(toIndentedString(outletBusinessHourMon)).append("\n");
    sb.append("    outletBusinessHourTue: ").append(toIndentedString(outletBusinessHourTue)).append("\n");
    sb.append("    outletBusinessHourWed: ").append(toIndentedString(outletBusinessHourWed)).append("\n");
    sb.append("    outletBusinessHourThur: ").append(toIndentedString(outletBusinessHourThur)).append("\n");
    sb.append("    outletBusinessHourFri: ").append(toIndentedString(outletBusinessHourFri)).append("\n");
    sb.append("    outletBusinessHourSat: ").append(toIndentedString(outletBusinessHourSat)).append("\n");
    sb.append("    outletBusinessHourSun: ").append(toIndentedString(outletBusinessHourSun)).append("\n");
    sb.append("    outletNotes: ").append(toIndentedString(outletNotes)).append("\n");
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
    openapiFields.add("outlet_distance");
    openapiFields.add("outlet_slid_spid");
    openapiFields.add("outlet_name");
    openapiFields.add("outlet_business");
    openapiFields.add("outlet_latitude");
    openapiFields.add("outlet_longitude");
    openapiFields.add("outlet_suburb");
    openapiFields.add("outlet_postcode");
    openapiFields.add("outlet_business_hour_mon");
    openapiFields.add("outlet_business_hour_tue");
    openapiFields.add("outlet_business_hour_wed");
    openapiFields.add("outlet_business_hour_thur");
    openapiFields.add("outlet_business_hour_fri");
    openapiFields.add("outlet_business_hour_sat");
    openapiFields.add("outlet_business_hour_sun");
    openapiFields.add("outlet_notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3ResultOutlet
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3ResultOutlet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3ResultOutlet is not found in the empty JSON string", V3ResultOutlet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3ResultOutlet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3ResultOutlet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("outlet_slid_spid") != null && !jsonObj.get("outlet_slid_spid").isJsonNull()) && !jsonObj.get("outlet_slid_spid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlet_slid_spid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlet_slid_spid").toString()));
      }
      if ((jsonObj.get("outlet_name") != null && !jsonObj.get("outlet_name").isJsonNull()) && !jsonObj.get("outlet_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlet_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlet_name").toString()));
      }
      if ((jsonObj.get("outlet_business") != null && !jsonObj.get("outlet_business").isJsonNull()) && !jsonObj.get("outlet_business").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlet_business` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlet_business").toString()));
      }
      if ((jsonObj.get("outlet_suburb") != null && !jsonObj.get("outlet_suburb").isJsonNull()) && !jsonObj.get("outlet_suburb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlet_suburb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlet_suburb").toString()));
      }
      if ((jsonObj.get("outlet_business_hour_mon") != null && !jsonObj.get("outlet_business_hour_mon").isJsonNull()) && !jsonObj.get("outlet_business_hour_mon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlet_business_hour_mon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlet_business_hour_mon").toString()));
      }
      if ((jsonObj.get("outlet_business_hour_tue") != null && !jsonObj.get("outlet_business_hour_tue").isJsonNull()) && !jsonObj.get("outlet_business_hour_tue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlet_business_hour_tue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlet_business_hour_tue").toString()));
      }
      if ((jsonObj.get("outlet_business_hour_wed") != null && !jsonObj.get("outlet_business_hour_wed").isJsonNull()) && !jsonObj.get("outlet_business_hour_wed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlet_business_hour_wed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlet_business_hour_wed").toString()));
      }
      if ((jsonObj.get("outlet_business_hour_thur") != null && !jsonObj.get("outlet_business_hour_thur").isJsonNull()) && !jsonObj.get("outlet_business_hour_thur").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlet_business_hour_thur` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlet_business_hour_thur").toString()));
      }
      if ((jsonObj.get("outlet_business_hour_fri") != null && !jsonObj.get("outlet_business_hour_fri").isJsonNull()) && !jsonObj.get("outlet_business_hour_fri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlet_business_hour_fri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlet_business_hour_fri").toString()));
      }
      if ((jsonObj.get("outlet_business_hour_sat") != null && !jsonObj.get("outlet_business_hour_sat").isJsonNull()) && !jsonObj.get("outlet_business_hour_sat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlet_business_hour_sat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlet_business_hour_sat").toString()));
      }
      if ((jsonObj.get("outlet_business_hour_sun") != null && !jsonObj.get("outlet_business_hour_sun").isJsonNull()) && !jsonObj.get("outlet_business_hour_sun").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlet_business_hour_sun` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlet_business_hour_sun").toString()));
      }
      if ((jsonObj.get("outlet_notes") != null && !jsonObj.get("outlet_notes").isJsonNull()) && !jsonObj.get("outlet_notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlet_notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlet_notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3ResultOutlet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3ResultOutlet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3ResultOutlet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3ResultOutlet.class));

       return (TypeAdapter<T>) new TypeAdapter<V3ResultOutlet>() {
           @Override
           public void write(JsonWriter out, V3ResultOutlet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3ResultOutlet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3ResultOutlet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3ResultOutlet
  * @throws IOException if the JSON string is invalid with respect to V3ResultOutlet
  */
  public static V3ResultOutlet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3ResultOutlet.class);
  }

 /**
  * Convert an instance of V3ResultOutlet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

