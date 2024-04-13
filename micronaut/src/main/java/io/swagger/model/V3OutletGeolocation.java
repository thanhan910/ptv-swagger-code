package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3OutletGeolocation
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3OutletGeolocation   {
  @JsonProperty("outlet_distance")
  private Float outletDistance = null;

  @JsonProperty("outlet_slid_spid")
  private String outletSlidSpid = null;

  @JsonProperty("outlet_name")
  private String outletName = null;

  @JsonProperty("outlet_business")
  private String outletBusiness = null;

  @JsonProperty("outlet_latitude")
  private Float outletLatitude = null;

  @JsonProperty("outlet_longitude")
  private Float outletLongitude = null;

  @JsonProperty("outlet_suburb")
  private String outletSuburb = null;

  @JsonProperty("outlet_postcode")
  private Integer outletPostcode = null;

  @JsonProperty("outlet_business_hour_mon")
  private String outletBusinessHourMon = null;

  @JsonProperty("outlet_business_hour_tue")
  private String outletBusinessHourTue = null;

  @JsonProperty("outlet_business_hour_wed")
  private String outletBusinessHourWed = null;

  @JsonProperty("outlet_business_hour_thur")
  private String outletBusinessHourThur = null;

  @JsonProperty("outlet_business_hour_fri")
  private String outletBusinessHourFri = null;

  @JsonProperty("outlet_business_hour_sat")
  private String outletBusinessHourSat = null;

  @JsonProperty("outlet_business_hour_sun")
  private String outletBusinessHourSun = null;

  @JsonProperty("outlet_notes")
  private String outletNotes = null;

  public V3OutletGeolocation outletDistance(Float outletDistance) {
    this.outletDistance = outletDistance;
    return this;
  }

  /**
   * Distance of outlet from input location (in metres); returns 0 if no location is input
   * @return outletDistance
  **/
  @Schema(description = "Distance of outlet from input location (in metres); returns 0 if no location is input")

  public Float getOutletDistance() {
    return outletDistance;
  }

  public void setOutletDistance(Float outletDistance) {
    this.outletDistance = outletDistance;
  }

  public V3OutletGeolocation outletSlidSpid(String outletSlidSpid) {
    this.outletSlidSpid = outletSlidSpid;
    return this;
  }

  /**
   * The SLID / SPID
   * @return outletSlidSpid
  **/
  @Schema(description = "The SLID / SPID")

  public String getOutletSlidSpid() {
    return outletSlidSpid;
  }

  public void setOutletSlidSpid(String outletSlidSpid) {
    this.outletSlidSpid = outletSlidSpid;
  }

  public V3OutletGeolocation outletName(String outletName) {
    this.outletName = outletName;
    return this;
  }

  /**
   * The location name of the outlet
   * @return outletName
  **/
  @Schema(description = "The location name of the outlet")

  public String getOutletName() {
    return outletName;
  }

  public void setOutletName(String outletName) {
    this.outletName = outletName;
  }

  public V3OutletGeolocation outletBusiness(String outletBusiness) {
    this.outletBusiness = outletBusiness;
    return this;
  }

  /**
   * The business name of the outlet
   * @return outletBusiness
  **/
  @Schema(description = "The business name of the outlet")

  public String getOutletBusiness() {
    return outletBusiness;
  }

  public void setOutletBusiness(String outletBusiness) {
    this.outletBusiness = outletBusiness;
  }

  public V3OutletGeolocation outletLatitude(Float outletLatitude) {
    this.outletLatitude = outletLatitude;
    return this;
  }

  /**
   * Geographic coordinate of latitude at outlet
   * @return outletLatitude
  **/
  @Schema(description = "Geographic coordinate of latitude at outlet")

  public Float getOutletLatitude() {
    return outletLatitude;
  }

  public void setOutletLatitude(Float outletLatitude) {
    this.outletLatitude = outletLatitude;
  }

  public V3OutletGeolocation outletLongitude(Float outletLongitude) {
    this.outletLongitude = outletLongitude;
    return this;
  }

  /**
   * Geographic coordinate of longitude at outlet
   * @return outletLongitude
  **/
  @Schema(description = "Geographic coordinate of longitude at outlet")

  public Float getOutletLongitude() {
    return outletLongitude;
  }

  public void setOutletLongitude(Float outletLongitude) {
    this.outletLongitude = outletLongitude;
  }

  public V3OutletGeolocation outletSuburb(String outletSuburb) {
    this.outletSuburb = outletSuburb;
    return this;
  }

  /**
   * The city/municipality the outlet is in
   * @return outletSuburb
  **/
  @Schema(description = "The city/municipality the outlet is in")

  public String getOutletSuburb() {
    return outletSuburb;
  }

  public void setOutletSuburb(String outletSuburb) {
    this.outletSuburb = outletSuburb;
  }

  public V3OutletGeolocation outletPostcode(Integer outletPostcode) {
    this.outletPostcode = outletPostcode;
    return this;
  }

  /**
   * The postcode for the outlet
   * @return outletPostcode
  **/
  @Schema(description = "The postcode for the outlet")

  public Integer getOutletPostcode() {
    return outletPostcode;
  }

  public void setOutletPostcode(Integer outletPostcode) {
    this.outletPostcode = outletPostcode;
  }

  public V3OutletGeolocation outletBusinessHourMon(String outletBusinessHourMon) {
    this.outletBusinessHourMon = outletBusinessHourMon;
    return this;
  }

  /**
   * The business hours on Monday
   * @return outletBusinessHourMon
  **/
  @Schema(description = "The business hours on Monday")

  public String getOutletBusinessHourMon() {
    return outletBusinessHourMon;
  }

  public void setOutletBusinessHourMon(String outletBusinessHourMon) {
    this.outletBusinessHourMon = outletBusinessHourMon;
  }

  public V3OutletGeolocation outletBusinessHourTue(String outletBusinessHourTue) {
    this.outletBusinessHourTue = outletBusinessHourTue;
    return this;
  }

  /**
   * The business hours on Tuesday
   * @return outletBusinessHourTue
  **/
  @Schema(description = "The business hours on Tuesday")

  public String getOutletBusinessHourTue() {
    return outletBusinessHourTue;
  }

  public void setOutletBusinessHourTue(String outletBusinessHourTue) {
    this.outletBusinessHourTue = outletBusinessHourTue;
  }

  public V3OutletGeolocation outletBusinessHourWed(String outletBusinessHourWed) {
    this.outletBusinessHourWed = outletBusinessHourWed;
    return this;
  }

  /**
   * The business hours on Wednesday
   * @return outletBusinessHourWed
  **/
  @Schema(description = "The business hours on Wednesday")

  public String getOutletBusinessHourWed() {
    return outletBusinessHourWed;
  }

  public void setOutletBusinessHourWed(String outletBusinessHourWed) {
    this.outletBusinessHourWed = outletBusinessHourWed;
  }

  public V3OutletGeolocation outletBusinessHourThur(String outletBusinessHourThur) {
    this.outletBusinessHourThur = outletBusinessHourThur;
    return this;
  }

  /**
   * The business hours on Thursday
   * @return outletBusinessHourThur
  **/
  @Schema(description = "The business hours on Thursday")

  public String getOutletBusinessHourThur() {
    return outletBusinessHourThur;
  }

  public void setOutletBusinessHourThur(String outletBusinessHourThur) {
    this.outletBusinessHourThur = outletBusinessHourThur;
  }

  public V3OutletGeolocation outletBusinessHourFri(String outletBusinessHourFri) {
    this.outletBusinessHourFri = outletBusinessHourFri;
    return this;
  }

  /**
   * The business hours on Friday
   * @return outletBusinessHourFri
  **/
  @Schema(description = "The business hours on Friday")

  public String getOutletBusinessHourFri() {
    return outletBusinessHourFri;
  }

  public void setOutletBusinessHourFri(String outletBusinessHourFri) {
    this.outletBusinessHourFri = outletBusinessHourFri;
  }

  public V3OutletGeolocation outletBusinessHourSat(String outletBusinessHourSat) {
    this.outletBusinessHourSat = outletBusinessHourSat;
    return this;
  }

  /**
   * The business hours on Saturday
   * @return outletBusinessHourSat
  **/
  @Schema(description = "The business hours on Saturday")

  public String getOutletBusinessHourSat() {
    return outletBusinessHourSat;
  }

  public void setOutletBusinessHourSat(String outletBusinessHourSat) {
    this.outletBusinessHourSat = outletBusinessHourSat;
  }

  public V3OutletGeolocation outletBusinessHourSun(String outletBusinessHourSun) {
    this.outletBusinessHourSun = outletBusinessHourSun;
    return this;
  }

  /**
   * The business hours on Sunday
   * @return outletBusinessHourSun
  **/
  @Schema(description = "The business hours on Sunday")

  public String getOutletBusinessHourSun() {
    return outletBusinessHourSun;
  }

  public void setOutletBusinessHourSun(String outletBusinessHourSun) {
    this.outletBusinessHourSun = outletBusinessHourSun;
  }

  public V3OutletGeolocation outletNotes(String outletNotes) {
    this.outletNotes = outletNotes;
    return this;
  }

  /**
   * Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.
   * @return outletNotes
  **/
  @Schema(description = "Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.")

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
    V3OutletGeolocation v3OutletGeolocation = (V3OutletGeolocation) o;
    return Objects.equals(this.outletDistance, v3OutletGeolocation.outletDistance) &&
        Objects.equals(this.outletSlidSpid, v3OutletGeolocation.outletSlidSpid) &&
        Objects.equals(this.outletName, v3OutletGeolocation.outletName) &&
        Objects.equals(this.outletBusiness, v3OutletGeolocation.outletBusiness) &&
        Objects.equals(this.outletLatitude, v3OutletGeolocation.outletLatitude) &&
        Objects.equals(this.outletLongitude, v3OutletGeolocation.outletLongitude) &&
        Objects.equals(this.outletSuburb, v3OutletGeolocation.outletSuburb) &&
        Objects.equals(this.outletPostcode, v3OutletGeolocation.outletPostcode) &&
        Objects.equals(this.outletBusinessHourMon, v3OutletGeolocation.outletBusinessHourMon) &&
        Objects.equals(this.outletBusinessHourTue, v3OutletGeolocation.outletBusinessHourTue) &&
        Objects.equals(this.outletBusinessHourWed, v3OutletGeolocation.outletBusinessHourWed) &&
        Objects.equals(this.outletBusinessHourThur, v3OutletGeolocation.outletBusinessHourThur) &&
        Objects.equals(this.outletBusinessHourFri, v3OutletGeolocation.outletBusinessHourFri) &&
        Objects.equals(this.outletBusinessHourSat, v3OutletGeolocation.outletBusinessHourSat) &&
        Objects.equals(this.outletBusinessHourSun, v3OutletGeolocation.outletBusinessHourSun) &&
        Objects.equals(this.outletNotes, v3OutletGeolocation.outletNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outletDistance, outletSlidSpid, outletName, outletBusiness, outletLatitude, outletLongitude, outletSuburb, outletPostcode, outletBusinessHourMon, outletBusinessHourTue, outletBusinessHourWed, outletBusinessHourThur, outletBusinessHourFri, outletBusinessHourSat, outletBusinessHourSun, outletNotes);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
