/*
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V3Outlet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-22T17:22:49.642+10:00")
public class V3Outlet {
  @SerializedName("outlet_slid_spid")
  private String outletSlidSpid = null;

  @SerializedName("outlet_name")
  private String outletName = null;

  @SerializedName("outlet_business")
  private String outletBusiness = null;

  @SerializedName("outlet_latitude")
  private Float outletLatitude = null;

  @SerializedName("outlet_longitude")
  private Float outletLongitude = null;

  @SerializedName("outlet_suburb")
  private String outletSuburb = null;

  @SerializedName("outlet_postcode")
  private Integer outletPostcode = null;

  @SerializedName("outlet_business_hour_mon")
  private String outletBusinessHourMon = null;

  @SerializedName("outlet_business_hour_tue")
  private String outletBusinessHourTue = null;

  @SerializedName("outlet_business_hour_wed")
  private String outletBusinessHourWed = null;

  @SerializedName("outlet_business_hour_thur")
  private String outletBusinessHourThur = null;

  @SerializedName("outlet_business_hour_fri")
  private String outletBusinessHourFri = null;

  @SerializedName("outlet_business_hour_sat")
  private String outletBusinessHourSat = null;

  @SerializedName("outlet_business_hour_sun")
  private String outletBusinessHourSun = null;

  @SerializedName("outlet_notes")
  private String outletNotes = null;

  public V3Outlet outletSlidSpid(String outletSlidSpid) {
    this.outletSlidSpid = outletSlidSpid;
    return this;
  }

   /**
   * The SLID / SPID
   * @return outletSlidSpid
  **/
  @ApiModelProperty(value = "The SLID / SPID")
  public String getOutletSlidSpid() {
    return outletSlidSpid;
  }

  public void setOutletSlidSpid(String outletSlidSpid) {
    this.outletSlidSpid = outletSlidSpid;
  }

  public V3Outlet outletName(String outletName) {
    this.outletName = outletName;
    return this;
  }

   /**
   * The location name of the outlet
   * @return outletName
  **/
  @ApiModelProperty(value = "The location name of the outlet")
  public String getOutletName() {
    return outletName;
  }

  public void setOutletName(String outletName) {
    this.outletName = outletName;
  }

  public V3Outlet outletBusiness(String outletBusiness) {
    this.outletBusiness = outletBusiness;
    return this;
  }

   /**
   * The business name of the outlet
   * @return outletBusiness
  **/
  @ApiModelProperty(value = "The business name of the outlet")
  public String getOutletBusiness() {
    return outletBusiness;
  }

  public void setOutletBusiness(String outletBusiness) {
    this.outletBusiness = outletBusiness;
  }

  public V3Outlet outletLatitude(Float outletLatitude) {
    this.outletLatitude = outletLatitude;
    return this;
  }

   /**
   * Geographic coordinate of latitude at outlet
   * @return outletLatitude
  **/
  @ApiModelProperty(value = "Geographic coordinate of latitude at outlet")
  public Float getOutletLatitude() {
    return outletLatitude;
  }

  public void setOutletLatitude(Float outletLatitude) {
    this.outletLatitude = outletLatitude;
  }

  public V3Outlet outletLongitude(Float outletLongitude) {
    this.outletLongitude = outletLongitude;
    return this;
  }

   /**
   * Geographic coordinate of longitude at outlet
   * @return outletLongitude
  **/
  @ApiModelProperty(value = "Geographic coordinate of longitude at outlet")
  public Float getOutletLongitude() {
    return outletLongitude;
  }

  public void setOutletLongitude(Float outletLongitude) {
    this.outletLongitude = outletLongitude;
  }

  public V3Outlet outletSuburb(String outletSuburb) {
    this.outletSuburb = outletSuburb;
    return this;
  }

   /**
   * The city/municipality the outlet is in
   * @return outletSuburb
  **/
  @ApiModelProperty(value = "The city/municipality the outlet is in")
  public String getOutletSuburb() {
    return outletSuburb;
  }

  public void setOutletSuburb(String outletSuburb) {
    this.outletSuburb = outletSuburb;
  }

  public V3Outlet outletPostcode(Integer outletPostcode) {
    this.outletPostcode = outletPostcode;
    return this;
  }

   /**
   * The postcode for the outlet
   * @return outletPostcode
  **/
  @ApiModelProperty(value = "The postcode for the outlet")
  public Integer getOutletPostcode() {
    return outletPostcode;
  }

  public void setOutletPostcode(Integer outletPostcode) {
    this.outletPostcode = outletPostcode;
  }

  public V3Outlet outletBusinessHourMon(String outletBusinessHourMon) {
    this.outletBusinessHourMon = outletBusinessHourMon;
    return this;
  }

   /**
   * The business hours on Monday
   * @return outletBusinessHourMon
  **/
  @ApiModelProperty(value = "The business hours on Monday")
  public String getOutletBusinessHourMon() {
    return outletBusinessHourMon;
  }

  public void setOutletBusinessHourMon(String outletBusinessHourMon) {
    this.outletBusinessHourMon = outletBusinessHourMon;
  }

  public V3Outlet outletBusinessHourTue(String outletBusinessHourTue) {
    this.outletBusinessHourTue = outletBusinessHourTue;
    return this;
  }

   /**
   * The business hours on Tuesday
   * @return outletBusinessHourTue
  **/
  @ApiModelProperty(value = "The business hours on Tuesday")
  public String getOutletBusinessHourTue() {
    return outletBusinessHourTue;
  }

  public void setOutletBusinessHourTue(String outletBusinessHourTue) {
    this.outletBusinessHourTue = outletBusinessHourTue;
  }

  public V3Outlet outletBusinessHourWed(String outletBusinessHourWed) {
    this.outletBusinessHourWed = outletBusinessHourWed;
    return this;
  }

   /**
   * The business hours on Wednesday
   * @return outletBusinessHourWed
  **/
  @ApiModelProperty(value = "The business hours on Wednesday")
  public String getOutletBusinessHourWed() {
    return outletBusinessHourWed;
  }

  public void setOutletBusinessHourWed(String outletBusinessHourWed) {
    this.outletBusinessHourWed = outletBusinessHourWed;
  }

  public V3Outlet outletBusinessHourThur(String outletBusinessHourThur) {
    this.outletBusinessHourThur = outletBusinessHourThur;
    return this;
  }

   /**
   * The business hours on Thursday
   * @return outletBusinessHourThur
  **/
  @ApiModelProperty(value = "The business hours on Thursday")
  public String getOutletBusinessHourThur() {
    return outletBusinessHourThur;
  }

  public void setOutletBusinessHourThur(String outletBusinessHourThur) {
    this.outletBusinessHourThur = outletBusinessHourThur;
  }

  public V3Outlet outletBusinessHourFri(String outletBusinessHourFri) {
    this.outletBusinessHourFri = outletBusinessHourFri;
    return this;
  }

   /**
   * The business hours on Friday
   * @return outletBusinessHourFri
  **/
  @ApiModelProperty(value = "The business hours on Friday")
  public String getOutletBusinessHourFri() {
    return outletBusinessHourFri;
  }

  public void setOutletBusinessHourFri(String outletBusinessHourFri) {
    this.outletBusinessHourFri = outletBusinessHourFri;
  }

  public V3Outlet outletBusinessHourSat(String outletBusinessHourSat) {
    this.outletBusinessHourSat = outletBusinessHourSat;
    return this;
  }

   /**
   * The business hours on Saturday
   * @return outletBusinessHourSat
  **/
  @ApiModelProperty(value = "The business hours on Saturday")
  public String getOutletBusinessHourSat() {
    return outletBusinessHourSat;
  }

  public void setOutletBusinessHourSat(String outletBusinessHourSat) {
    this.outletBusinessHourSat = outletBusinessHourSat;
  }

  public V3Outlet outletBusinessHourSun(String outletBusinessHourSun) {
    this.outletBusinessHourSun = outletBusinessHourSun;
    return this;
  }

   /**
   * The business hours on Sunday
   * @return outletBusinessHourSun
  **/
  @ApiModelProperty(value = "The business hours on Sunday")
  public String getOutletBusinessHourSun() {
    return outletBusinessHourSun;
  }

  public void setOutletBusinessHourSun(String outletBusinessHourSun) {
    this.outletBusinessHourSun = outletBusinessHourSun;
  }

  public V3Outlet outletNotes(String outletNotes) {
    this.outletNotes = outletNotes;
    return this;
  }

   /**
   * Any additional notes for the outlet such as &#39;Buy pre-loaded myki cards only&#39;. May be null/empty.
   * @return outletNotes
  **/
  @ApiModelProperty(value = "Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.")
  public String getOutletNotes() {
    return outletNotes;
  }

  public void setOutletNotes(String outletNotes) {
    this.outletNotes = outletNotes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3Outlet v3Outlet = (V3Outlet) o;
    return Objects.equals(this.outletSlidSpid, v3Outlet.outletSlidSpid) &&
        Objects.equals(this.outletName, v3Outlet.outletName) &&
        Objects.equals(this.outletBusiness, v3Outlet.outletBusiness) &&
        Objects.equals(this.outletLatitude, v3Outlet.outletLatitude) &&
        Objects.equals(this.outletLongitude, v3Outlet.outletLongitude) &&
        Objects.equals(this.outletSuburb, v3Outlet.outletSuburb) &&
        Objects.equals(this.outletPostcode, v3Outlet.outletPostcode) &&
        Objects.equals(this.outletBusinessHourMon, v3Outlet.outletBusinessHourMon) &&
        Objects.equals(this.outletBusinessHourTue, v3Outlet.outletBusinessHourTue) &&
        Objects.equals(this.outletBusinessHourWed, v3Outlet.outletBusinessHourWed) &&
        Objects.equals(this.outletBusinessHourThur, v3Outlet.outletBusinessHourThur) &&
        Objects.equals(this.outletBusinessHourFri, v3Outlet.outletBusinessHourFri) &&
        Objects.equals(this.outletBusinessHourSat, v3Outlet.outletBusinessHourSat) &&
        Objects.equals(this.outletBusinessHourSun, v3Outlet.outletBusinessHourSun) &&
        Objects.equals(this.outletNotes, v3Outlet.outletNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outletSlidSpid, outletName, outletBusiness, outletLatitude, outletLongitude, outletSuburb, outletPostcode, outletBusinessHourMon, outletBusinessHourTue, outletBusinessHourWed, outletBusinessHourThur, outletBusinessHourFri, outletBusinessHourSat, outletBusinessHourSun, outletNotes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3Outlet {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

