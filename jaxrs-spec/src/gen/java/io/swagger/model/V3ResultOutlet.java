package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3ResultOutlet   {

  private @Valid Float outletDistance = null;

  private @Valid String outletSlidSpid = null;

  private @Valid String outletName = null;

  private @Valid String outletBusiness = null;

  private @Valid Float outletLatitude = null;

  private @Valid Float outletLongitude = null;

  private @Valid String outletSuburb = null;

  private @Valid Integer outletPostcode = null;

  private @Valid String outletBusinessHourMon = null;

  private @Valid String outletBusinessHourTue = null;

  private @Valid String outletBusinessHourWed = null;

  private @Valid String outletBusinessHourThur = null;

  private @Valid String outletBusinessHourFri = null;

  private @Valid String outletBusinessHourSat = null;

  private @Valid String outletBusinessHourSun = null;

  private @Valid String outletNotes = null;

  /**
   * Distance of outlet from input location (in metres); returns 0 if no location is input
   **/
  public V3ResultOutlet outletDistance(Float outletDistance) {
    this.outletDistance = outletDistance;
    return this;
  }

  
  @ApiModelProperty(value = "Distance of outlet from input location (in metres); returns 0 if no location is input")
  @JsonProperty("outlet_distance")

  public Float getOutletDistance() {
    return outletDistance;
  }
  public void setOutletDistance(Float outletDistance) {
    this.outletDistance = outletDistance;
  }

  /**
   * The SLID / SPID
   **/
  public V3ResultOutlet outletSlidSpid(String outletSlidSpid) {
    this.outletSlidSpid = outletSlidSpid;
    return this;
  }

  
  @ApiModelProperty(value = "The SLID / SPID")
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
  public V3ResultOutlet outletName(String outletName) {
    this.outletName = outletName;
    return this;
  }

  
  @ApiModelProperty(value = "The location name of the outlet")
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
  public V3ResultOutlet outletBusiness(String outletBusiness) {
    this.outletBusiness = outletBusiness;
    return this;
  }

  
  @ApiModelProperty(value = "The business name of the outlet")
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
  public V3ResultOutlet outletLatitude(Float outletLatitude) {
    this.outletLatitude = outletLatitude;
    return this;
  }

  
  @ApiModelProperty(value = "Geographic coordinate of latitude at outlet")
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
  public V3ResultOutlet outletLongitude(Float outletLongitude) {
    this.outletLongitude = outletLongitude;
    return this;
  }

  
  @ApiModelProperty(value = "Geographic coordinate of longitude at outlet")
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
  public V3ResultOutlet outletSuburb(String outletSuburb) {
    this.outletSuburb = outletSuburb;
    return this;
  }

  
  @ApiModelProperty(value = "The city/municipality the outlet is in")
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
  public V3ResultOutlet outletPostcode(Integer outletPostcode) {
    this.outletPostcode = outletPostcode;
    return this;
  }

  
  @ApiModelProperty(value = "The postcode for the outlet")
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
  public V3ResultOutlet outletBusinessHourMon(String outletBusinessHourMon) {
    this.outletBusinessHourMon = outletBusinessHourMon;
    return this;
  }

  
  @ApiModelProperty(value = "The business hours on Monday")
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
  public V3ResultOutlet outletBusinessHourTue(String outletBusinessHourTue) {
    this.outletBusinessHourTue = outletBusinessHourTue;
    return this;
  }

  
  @ApiModelProperty(value = "The business hours on Tuesday")
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
  public V3ResultOutlet outletBusinessHourWed(String outletBusinessHourWed) {
    this.outletBusinessHourWed = outletBusinessHourWed;
    return this;
  }

  
  @ApiModelProperty(value = "The business hours on Wednesday")
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
  public V3ResultOutlet outletBusinessHourThur(String outletBusinessHourThur) {
    this.outletBusinessHourThur = outletBusinessHourThur;
    return this;
  }

  
  @ApiModelProperty(value = "The business hours on Thursday")
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
  public V3ResultOutlet outletBusinessHourFri(String outletBusinessHourFri) {
    this.outletBusinessHourFri = outletBusinessHourFri;
    return this;
  }

  
  @ApiModelProperty(value = "The business hours on Friday")
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
  public V3ResultOutlet outletBusinessHourSat(String outletBusinessHourSat) {
    this.outletBusinessHourSat = outletBusinessHourSat;
    return this;
  }

  
  @ApiModelProperty(value = "The business hours on Saturday")
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
  public V3ResultOutlet outletBusinessHourSun(String outletBusinessHourSun) {
    this.outletBusinessHourSun = outletBusinessHourSun;
    return this;
  }

  
  @ApiModelProperty(value = "The business hours on Sunday")
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
  public V3ResultOutlet outletNotes(String outletNotes) {
    this.outletNotes = outletNotes;
    return this;
  }

  
  @ApiModelProperty(value = "Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.")
  @JsonProperty("outlet_notes")

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
    V3ResultOutlet v3ResultOutlet = (V3ResultOutlet) o;
    return Objects.equals(outletDistance, v3ResultOutlet.outletDistance) &&
        Objects.equals(outletSlidSpid, v3ResultOutlet.outletSlidSpid) &&
        Objects.equals(outletName, v3ResultOutlet.outletName) &&
        Objects.equals(outletBusiness, v3ResultOutlet.outletBusiness) &&
        Objects.equals(outletLatitude, v3ResultOutlet.outletLatitude) &&
        Objects.equals(outletLongitude, v3ResultOutlet.outletLongitude) &&
        Objects.equals(outletSuburb, v3ResultOutlet.outletSuburb) &&
        Objects.equals(outletPostcode, v3ResultOutlet.outletPostcode) &&
        Objects.equals(outletBusinessHourMon, v3ResultOutlet.outletBusinessHourMon) &&
        Objects.equals(outletBusinessHourTue, v3ResultOutlet.outletBusinessHourTue) &&
        Objects.equals(outletBusinessHourWed, v3ResultOutlet.outletBusinessHourWed) &&
        Objects.equals(outletBusinessHourThur, v3ResultOutlet.outletBusinessHourThur) &&
        Objects.equals(outletBusinessHourFri, v3ResultOutlet.outletBusinessHourFri) &&
        Objects.equals(outletBusinessHourSat, v3ResultOutlet.outletBusinessHourSat) &&
        Objects.equals(outletBusinessHourSun, v3ResultOutlet.outletBusinessHourSun) &&
        Objects.equals(outletNotes, v3ResultOutlet.outletNotes);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
