package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3OutletGeolocation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3OutletGeolocation   {
  private Float outletDistance = null;

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

  public V3OutletGeolocation outletDistance(Float outletDistance) {
    this.outletDistance = outletDistance;
    return this;
  }

  /**
   * Distance of outlet from input location (in metres); returns 0 if no location is input
   * @return outletDistance
   **/
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
