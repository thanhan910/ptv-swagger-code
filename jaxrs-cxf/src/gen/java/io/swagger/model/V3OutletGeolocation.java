package io.swagger.model;

import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class V3OutletGeolocation   {
  
  @Schema(description = "Distance of outlet from input location (in metres); returns 0 if no location is input")
 /**
   * Distance of outlet from input location (in metres); returns 0 if no location is input  
  **/
  private Float outletDistance = null;
  
  @Schema(description = "The SLID / SPID")
 /**
   * The SLID / SPID  
  **/
  private String outletSlidSpid = null;
  
  @Schema(description = "The location name of the outlet")
 /**
   * The location name of the outlet  
  **/
  private String outletName = null;
  
  @Schema(description = "The business name of the outlet")
 /**
   * The business name of the outlet  
  **/
  private String outletBusiness = null;
  
  @Schema(description = "Geographic coordinate of latitude at outlet")
 /**
   * Geographic coordinate of latitude at outlet  
  **/
  private Float outletLatitude = null;
  
  @Schema(description = "Geographic coordinate of longitude at outlet")
 /**
   * Geographic coordinate of longitude at outlet  
  **/
  private Float outletLongitude = null;
  
  @Schema(description = "The city/municipality the outlet is in")
 /**
   * The city/municipality the outlet is in  
  **/
  private String outletSuburb = null;
  
  @Schema(description = "The postcode for the outlet")
 /**
   * The postcode for the outlet  
  **/
  private Integer outletPostcode = null;
  
  @Schema(description = "The business hours on Monday")
 /**
   * The business hours on Monday  
  **/
  private String outletBusinessHourMon = null;
  
  @Schema(description = "The business hours on Tuesday")
 /**
   * The business hours on Tuesday  
  **/
  private String outletBusinessHourTue = null;
  
  @Schema(description = "The business hours on Wednesday")
 /**
   * The business hours on Wednesday  
  **/
  private String outletBusinessHourWed = null;
  
  @Schema(description = "The business hours on Thursday")
 /**
   * The business hours on Thursday  
  **/
  private String outletBusinessHourThur = null;
  
  @Schema(description = "The business hours on Friday")
 /**
   * The business hours on Friday  
  **/
  private String outletBusinessHourFri = null;
  
  @Schema(description = "The business hours on Saturday")
 /**
   * The business hours on Saturday  
  **/
  private String outletBusinessHourSat = null;
  
  @Schema(description = "The business hours on Sunday")
 /**
   * The business hours on Sunday  
  **/
  private String outletBusinessHourSun = null;
  
  @Schema(description = "Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.")
 /**
   * Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.  
  **/
  private String outletNotes = null;
 /**
   * Distance of outlet from input location (in metres); returns 0 if no location is input
   * @return outletDistance
  **/
  @JsonProperty("outlet_distance")
  public Float getOutletDistance() {
    return outletDistance;
  }

  public void setOutletDistance(Float outletDistance) {
    this.outletDistance = outletDistance;
  }

  public V3OutletGeolocation outletDistance(Float outletDistance) {
    this.outletDistance = outletDistance;
    return this;
  }

 /**
   * The SLID / SPID
   * @return outletSlidSpid
  **/
  @JsonProperty("outlet_slid_spid")
  public String getOutletSlidSpid() {
    return outletSlidSpid;
  }

  public void setOutletSlidSpid(String outletSlidSpid) {
    this.outletSlidSpid = outletSlidSpid;
  }

  public V3OutletGeolocation outletSlidSpid(String outletSlidSpid) {
    this.outletSlidSpid = outletSlidSpid;
    return this;
  }

 /**
   * The location name of the outlet
   * @return outletName
  **/
  @JsonProperty("outlet_name")
  public String getOutletName() {
    return outletName;
  }

  public void setOutletName(String outletName) {
    this.outletName = outletName;
  }

  public V3OutletGeolocation outletName(String outletName) {
    this.outletName = outletName;
    return this;
  }

 /**
   * The business name of the outlet
   * @return outletBusiness
  **/
  @JsonProperty("outlet_business")
  public String getOutletBusiness() {
    return outletBusiness;
  }

  public void setOutletBusiness(String outletBusiness) {
    this.outletBusiness = outletBusiness;
  }

  public V3OutletGeolocation outletBusiness(String outletBusiness) {
    this.outletBusiness = outletBusiness;
    return this;
  }

 /**
   * Geographic coordinate of latitude at outlet
   * @return outletLatitude
  **/
  @JsonProperty("outlet_latitude")
  public Float getOutletLatitude() {
    return outletLatitude;
  }

  public void setOutletLatitude(Float outletLatitude) {
    this.outletLatitude = outletLatitude;
  }

  public V3OutletGeolocation outletLatitude(Float outletLatitude) {
    this.outletLatitude = outletLatitude;
    return this;
  }

 /**
   * Geographic coordinate of longitude at outlet
   * @return outletLongitude
  **/
  @JsonProperty("outlet_longitude")
  public Float getOutletLongitude() {
    return outletLongitude;
  }

  public void setOutletLongitude(Float outletLongitude) {
    this.outletLongitude = outletLongitude;
  }

  public V3OutletGeolocation outletLongitude(Float outletLongitude) {
    this.outletLongitude = outletLongitude;
    return this;
  }

 /**
   * The city/municipality the outlet is in
   * @return outletSuburb
  **/
  @JsonProperty("outlet_suburb")
  public String getOutletSuburb() {
    return outletSuburb;
  }

  public void setOutletSuburb(String outletSuburb) {
    this.outletSuburb = outletSuburb;
  }

  public V3OutletGeolocation outletSuburb(String outletSuburb) {
    this.outletSuburb = outletSuburb;
    return this;
  }

 /**
   * The postcode for the outlet
   * @return outletPostcode
  **/
  @JsonProperty("outlet_postcode")
  public Integer getOutletPostcode() {
    return outletPostcode;
  }

  public void setOutletPostcode(Integer outletPostcode) {
    this.outletPostcode = outletPostcode;
  }

  public V3OutletGeolocation outletPostcode(Integer outletPostcode) {
    this.outletPostcode = outletPostcode;
    return this;
  }

 /**
   * The business hours on Monday
   * @return outletBusinessHourMon
  **/
  @JsonProperty("outlet_business_hour_mon")
  public String getOutletBusinessHourMon() {
    return outletBusinessHourMon;
  }

  public void setOutletBusinessHourMon(String outletBusinessHourMon) {
    this.outletBusinessHourMon = outletBusinessHourMon;
  }

  public V3OutletGeolocation outletBusinessHourMon(String outletBusinessHourMon) {
    this.outletBusinessHourMon = outletBusinessHourMon;
    return this;
  }

 /**
   * The business hours on Tuesday
   * @return outletBusinessHourTue
  **/
  @JsonProperty("outlet_business_hour_tue")
  public String getOutletBusinessHourTue() {
    return outletBusinessHourTue;
  }

  public void setOutletBusinessHourTue(String outletBusinessHourTue) {
    this.outletBusinessHourTue = outletBusinessHourTue;
  }

  public V3OutletGeolocation outletBusinessHourTue(String outletBusinessHourTue) {
    this.outletBusinessHourTue = outletBusinessHourTue;
    return this;
  }

 /**
   * The business hours on Wednesday
   * @return outletBusinessHourWed
  **/
  @JsonProperty("outlet_business_hour_wed")
  public String getOutletBusinessHourWed() {
    return outletBusinessHourWed;
  }

  public void setOutletBusinessHourWed(String outletBusinessHourWed) {
    this.outletBusinessHourWed = outletBusinessHourWed;
  }

  public V3OutletGeolocation outletBusinessHourWed(String outletBusinessHourWed) {
    this.outletBusinessHourWed = outletBusinessHourWed;
    return this;
  }

 /**
   * The business hours on Thursday
   * @return outletBusinessHourThur
  **/
  @JsonProperty("outlet_business_hour_thur")
  public String getOutletBusinessHourThur() {
    return outletBusinessHourThur;
  }

  public void setOutletBusinessHourThur(String outletBusinessHourThur) {
    this.outletBusinessHourThur = outletBusinessHourThur;
  }

  public V3OutletGeolocation outletBusinessHourThur(String outletBusinessHourThur) {
    this.outletBusinessHourThur = outletBusinessHourThur;
    return this;
  }

 /**
   * The business hours on Friday
   * @return outletBusinessHourFri
  **/
  @JsonProperty("outlet_business_hour_fri")
  public String getOutletBusinessHourFri() {
    return outletBusinessHourFri;
  }

  public void setOutletBusinessHourFri(String outletBusinessHourFri) {
    this.outletBusinessHourFri = outletBusinessHourFri;
  }

  public V3OutletGeolocation outletBusinessHourFri(String outletBusinessHourFri) {
    this.outletBusinessHourFri = outletBusinessHourFri;
    return this;
  }

 /**
   * The business hours on Saturday
   * @return outletBusinessHourSat
  **/
  @JsonProperty("outlet_business_hour_sat")
  public String getOutletBusinessHourSat() {
    return outletBusinessHourSat;
  }

  public void setOutletBusinessHourSat(String outletBusinessHourSat) {
    this.outletBusinessHourSat = outletBusinessHourSat;
  }

  public V3OutletGeolocation outletBusinessHourSat(String outletBusinessHourSat) {
    this.outletBusinessHourSat = outletBusinessHourSat;
    return this;
  }

 /**
   * The business hours on Sunday
   * @return outletBusinessHourSun
  **/
  @JsonProperty("outlet_business_hour_sun")
  public String getOutletBusinessHourSun() {
    return outletBusinessHourSun;
  }

  public void setOutletBusinessHourSun(String outletBusinessHourSun) {
    this.outletBusinessHourSun = outletBusinessHourSun;
  }

  public V3OutletGeolocation outletBusinessHourSun(String outletBusinessHourSun) {
    this.outletBusinessHourSun = outletBusinessHourSun;
    return this;
  }

 /**
   * Any additional notes for the outlet such as &#x27;Buy pre-loaded myki cards only&#x27;. May be null/empty.
   * @return outletNotes
  **/
  @JsonProperty("outlet_notes")
  public String getOutletNotes() {
    return outletNotes;
  }

  public void setOutletNotes(String outletNotes) {
    this.outletNotes = outletNotes;
  }

  public V3OutletGeolocation outletNotes(String outletNotes) {
    this.outletNotes = outletNotes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3OutletGeolocation {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
