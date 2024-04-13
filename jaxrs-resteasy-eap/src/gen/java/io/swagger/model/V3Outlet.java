package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
public class V3Outlet   {
  private String outletSlidSpid = null;
  private String outletName = null;
  private String outletBusiness = null;
  private Float outletLatitude = null;
  private Float outletLongitude = null;
  private String outletSuburb = null;
  private Integer outletPostcode = null;
  private String outletBusinessHourMon = null;
  private String outletBusinessHourTue = null;
  private String outletBusinessHourWed = null;
  private String outletBusinessHourThur = null;
  private String outletBusinessHourFri = null;
  private String outletBusinessHourSat = null;
  private String outletBusinessHourSun = null;
  private String outletNotes = null;

  /**
   * The SLID / SPID
   **/
  
  @Schema(description = "The SLID / SPID")
  @JsonProperty("outlet_slid_spid")
  public String getOutletSlidSpid() {
    return outletSlidSpid;
  }
  public void setOutletSlidSpid(String outletSlidSpid) {
    this.outletSlidSpid = outletSlidSpid;
  }

  /**
   * The location name of the outlet
   **/
  
  @Schema(description = "The location name of the outlet")
  @JsonProperty("outlet_name")
  public String getOutletName() {
    return outletName;
  }
  public void setOutletName(String outletName) {
    this.outletName = outletName;
  }

  /**
   * The business name of the outlet
   **/
  
  @Schema(description = "The business name of the outlet")
  @JsonProperty("outlet_business")
  public String getOutletBusiness() {
    return outletBusiness;
  }
  public void setOutletBusiness(String outletBusiness) {
    this.outletBusiness = outletBusiness;
  }

  /**
   * Geographic coordinate of latitude at outlet
   **/
  
  @Schema(description = "Geographic coordinate of latitude at outlet")
  @JsonProperty("outlet_latitude")
  public Float getOutletLatitude() {
    return outletLatitude;
  }
  public void setOutletLatitude(Float outletLatitude) {
    this.outletLatitude = outletLatitude;
  }

  /**
   * Geographic coordinate of longitude at outlet
   **/
  
  @Schema(description = "Geographic coordinate of longitude at outlet")
  @JsonProperty("outlet_longitude")
  public Float getOutletLongitude() {
    return outletLongitude;
  }
  public void setOutletLongitude(Float outletLongitude) {
    this.outletLongitude = outletLongitude;
  }

  /**
   * The city/municipality the outlet is in
   **/
  
  @Schema(description = "The city/municipality the outlet is in")
  @JsonProperty("outlet_suburb")
  public String getOutletSuburb() {
    return outletSuburb;
  }
  public void setOutletSuburb(String outletSuburb) {
    this.outletSuburb = outletSuburb;
  }

  /**
   * The postcode for the outlet
   **/
  
  @Schema(description = "The postcode for the outlet")
  @JsonProperty("outlet_postcode")
  public Integer getOutletPostcode() {
    return outletPostcode;
  }
  public void setOutletPostcode(Integer outletPostcode) {
    this.outletPostcode = outletPostcode;
  }

  /**
   * The business hours on Monday
   **/
  
  @Schema(description = "The business hours on Monday")
  @JsonProperty("outlet_business_hour_mon")
  public String getOutletBusinessHourMon() {
    return outletBusinessHourMon;
  }
  public void setOutletBusinessHourMon(String outletBusinessHourMon) {
    this.outletBusinessHourMon = outletBusinessHourMon;
  }

  /**
   * The business hours on Tuesday
   **/
  
  @Schema(description = "The business hours on Tuesday")
  @JsonProperty("outlet_business_hour_tue")
  public String getOutletBusinessHourTue() {
    return outletBusinessHourTue;
  }
  public void setOutletBusinessHourTue(String outletBusinessHourTue) {
    this.outletBusinessHourTue = outletBusinessHourTue;
  }

  /**
   * The business hours on Wednesday
   **/
  
  @Schema(description = "The business hours on Wednesday")
  @JsonProperty("outlet_business_hour_wed")
  public String getOutletBusinessHourWed() {
    return outletBusinessHourWed;
  }
  public void setOutletBusinessHourWed(String outletBusinessHourWed) {
    this.outletBusinessHourWed = outletBusinessHourWed;
  }

  /**
   * The business hours on Thursday
   **/
  
  @Schema(description = "The business hours on Thursday")
  @JsonProperty("outlet_business_hour_thur")
  public String getOutletBusinessHourThur() {
    return outletBusinessHourThur;
  }
  public void setOutletBusinessHourThur(String outletBusinessHourThur) {
    this.outletBusinessHourThur = outletBusinessHourThur;
  }

  /**
   * The business hours on Friday
   **/
  
  @Schema(description = "The business hours on Friday")
  @JsonProperty("outlet_business_hour_fri")
  public String getOutletBusinessHourFri() {
    return outletBusinessHourFri;
  }
  public void setOutletBusinessHourFri(String outletBusinessHourFri) {
    this.outletBusinessHourFri = outletBusinessHourFri;
  }

  /**
   * The business hours on Saturday
   **/
  
  @Schema(description = "The business hours on Saturday")
  @JsonProperty("outlet_business_hour_sat")
  public String getOutletBusinessHourSat() {
    return outletBusinessHourSat;
  }
  public void setOutletBusinessHourSat(String outletBusinessHourSat) {
    this.outletBusinessHourSat = outletBusinessHourSat;
  }

  /**
   * The business hours on Sunday
   **/
  
  @Schema(description = "The business hours on Sunday")
  @JsonProperty("outlet_business_hour_sun")
  public String getOutletBusinessHourSun() {
    return outletBusinessHourSun;
  }
  public void setOutletBusinessHourSun(String outletBusinessHourSun) {
    this.outletBusinessHourSun = outletBusinessHourSun;
  }

  /**
   * Any additional notes for the outlet such as &#x27;Buy pre-loaded myki cards only&#x27;. May be null/empty.
   **/
  
  @Schema(description = "Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.")
  @JsonProperty("outlet_notes")
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
    V3Outlet v3Outlet = (V3Outlet) o;
    return Objects.equals(outletSlidSpid, v3Outlet.outletSlidSpid) &&
        Objects.equals(outletName, v3Outlet.outletName) &&
        Objects.equals(outletBusiness, v3Outlet.outletBusiness) &&
        Objects.equals(outletLatitude, v3Outlet.outletLatitude) &&
        Objects.equals(outletLongitude, v3Outlet.outletLongitude) &&
        Objects.equals(outletSuburb, v3Outlet.outletSuburb) &&
        Objects.equals(outletPostcode, v3Outlet.outletPostcode) &&
        Objects.equals(outletBusinessHourMon, v3Outlet.outletBusinessHourMon) &&
        Objects.equals(outletBusinessHourTue, v3Outlet.outletBusinessHourTue) &&
        Objects.equals(outletBusinessHourWed, v3Outlet.outletBusinessHourWed) &&
        Objects.equals(outletBusinessHourThur, v3Outlet.outletBusinessHourThur) &&
        Objects.equals(outletBusinessHourFri, v3Outlet.outletBusinessHourFri) &&
        Objects.equals(outletBusinessHourSat, v3Outlet.outletBusinessHourSat) &&
        Objects.equals(outletBusinessHourSun, v3Outlet.outletBusinessHourSun) &&
        Objects.equals(outletNotes, v3Outlet.outletNotes);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
