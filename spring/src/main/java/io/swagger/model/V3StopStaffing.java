package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3StopStaffing
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3StopStaffing   {
  @JsonProperty("fri_am_from")
  private String friAmFrom = null;

  @JsonProperty("fri_am_to")
  private String friAmTo = null;

  @JsonProperty("fri_pm_from")
  private String friPmFrom = null;

  @JsonProperty("fri_pm_to")
  private String friPmTo = null;

  @JsonProperty("mon_am_from")
  private String monAmFrom = null;

  @JsonProperty("mon_am_to")
  private String monAmTo = null;

  @JsonProperty("mon_pm_from")
  private String monPmFrom = null;

  @JsonProperty("mon_pm_to")
  private String monPmTo = null;

  @JsonProperty("ph_additional_text")
  private String phAdditionalText = null;

  @JsonProperty("ph_from")
  private String phFrom = null;

  @JsonProperty("ph_to")
  private String phTo = null;

  @JsonProperty("sat_am_from")
  private String satAmFrom = null;

  @JsonProperty("sat_am_to")
  private String satAmTo = null;

  @JsonProperty("sat_pm_from")
  private String satPmFrom = null;

  @JsonProperty("sat_pm_to")
  private String satPmTo = null;

  @JsonProperty("sun_am_from")
  private String sunAmFrom = null;

  @JsonProperty("sun_am_to")
  private String sunAmTo = null;

  @JsonProperty("sun_pm_from")
  private String sunPmFrom = null;

  @JsonProperty("sun_pm_to")
  private String sunPmTo = null;

  @JsonProperty("thu_am_from")
  private String thuAmFrom = null;

  @JsonProperty("thu_am_to")
  private String thuAmTo = null;

  @JsonProperty("thu_pm_from")
  private String thuPmFrom = null;

  @JsonProperty("thu_pm_to")
  private String thuPmTo = null;

  @JsonProperty("tue_am_from")
  private String tueAmFrom = null;

  @JsonProperty("tue_am_to")
  private String tueAmTo = null;

  @JsonProperty("tue_pm_from")
  private String tuePmFrom = null;

  @JsonProperty("tue_pm_to")
  private String tuePmTo = null;

  @JsonProperty("wed_am_from")
  private String wedAmFrom = null;

  @JsonProperty("wed_am_to")
  private String wedAmTo = null;

  @JsonProperty("wed_pm_from")
  private String wedPmFrom = null;

  @JsonProperty("wed_pm_To")
  private String wedPmTo = null;

  public V3StopStaffing friAmFrom(String friAmFrom) {
    this.friAmFrom = friAmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return friAmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getFriAmFrom() {
    return friAmFrom;
  }

  public void setFriAmFrom(String friAmFrom) {
    this.friAmFrom = friAmFrom;
  }

  public V3StopStaffing friAmTo(String friAmTo) {
    this.friAmTo = friAmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return friAmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getFriAmTo() {
    return friAmTo;
  }

  public void setFriAmTo(String friAmTo) {
    this.friAmTo = friAmTo;
  }

  public V3StopStaffing friPmFrom(String friPmFrom) {
    this.friPmFrom = friPmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return friPmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getFriPmFrom() {
    return friPmFrom;
  }

  public void setFriPmFrom(String friPmFrom) {
    this.friPmFrom = friPmFrom;
  }

  public V3StopStaffing friPmTo(String friPmTo) {
    this.friPmTo = friPmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return friPmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getFriPmTo() {
    return friPmTo;
  }

  public void setFriPmTo(String friPmTo) {
    this.friPmTo = friPmTo;
  }

  public V3StopStaffing monAmFrom(String monAmFrom) {
    this.monAmFrom = monAmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return monAmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getMonAmFrom() {
    return monAmFrom;
  }

  public void setMonAmFrom(String monAmFrom) {
    this.monAmFrom = monAmFrom;
  }

  public V3StopStaffing monAmTo(String monAmTo) {
    this.monAmTo = monAmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return monAmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getMonAmTo() {
    return monAmTo;
  }

  public void setMonAmTo(String monAmTo) {
    this.monAmTo = monAmTo;
  }

  public V3StopStaffing monPmFrom(String monPmFrom) {
    this.monPmFrom = monPmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return monPmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getMonPmFrom() {
    return monPmFrom;
  }

  public void setMonPmFrom(String monPmFrom) {
    this.monPmFrom = monPmFrom;
  }

  public V3StopStaffing monPmTo(String monPmTo) {
    this.monPmTo = monPmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return monPmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getMonPmTo() {
    return monPmTo;
  }

  public void setMonPmTo(String monPmTo) {
    this.monPmTo = monPmTo;
  }

  public V3StopStaffing phAdditionalText(String phAdditionalText) {
    this.phAdditionalText = phAdditionalText;
    return this;
  }

  /**
   * Stop staffing hours
   * @return phAdditionalText
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getPhAdditionalText() {
    return phAdditionalText;
  }

  public void setPhAdditionalText(String phAdditionalText) {
    this.phAdditionalText = phAdditionalText;
  }

  public V3StopStaffing phFrom(String phFrom) {
    this.phFrom = phFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return phFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getPhFrom() {
    return phFrom;
  }

  public void setPhFrom(String phFrom) {
    this.phFrom = phFrom;
  }

  public V3StopStaffing phTo(String phTo) {
    this.phTo = phTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return phTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getPhTo() {
    return phTo;
  }

  public void setPhTo(String phTo) {
    this.phTo = phTo;
  }

  public V3StopStaffing satAmFrom(String satAmFrom) {
    this.satAmFrom = satAmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return satAmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getSatAmFrom() {
    return satAmFrom;
  }

  public void setSatAmFrom(String satAmFrom) {
    this.satAmFrom = satAmFrom;
  }

  public V3StopStaffing satAmTo(String satAmTo) {
    this.satAmTo = satAmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return satAmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getSatAmTo() {
    return satAmTo;
  }

  public void setSatAmTo(String satAmTo) {
    this.satAmTo = satAmTo;
  }

  public V3StopStaffing satPmFrom(String satPmFrom) {
    this.satPmFrom = satPmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return satPmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getSatPmFrom() {
    return satPmFrom;
  }

  public void setSatPmFrom(String satPmFrom) {
    this.satPmFrom = satPmFrom;
  }

  public V3StopStaffing satPmTo(String satPmTo) {
    this.satPmTo = satPmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return satPmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getSatPmTo() {
    return satPmTo;
  }

  public void setSatPmTo(String satPmTo) {
    this.satPmTo = satPmTo;
  }

  public V3StopStaffing sunAmFrom(String sunAmFrom) {
    this.sunAmFrom = sunAmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return sunAmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getSunAmFrom() {
    return sunAmFrom;
  }

  public void setSunAmFrom(String sunAmFrom) {
    this.sunAmFrom = sunAmFrom;
  }

  public V3StopStaffing sunAmTo(String sunAmTo) {
    this.sunAmTo = sunAmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return sunAmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getSunAmTo() {
    return sunAmTo;
  }

  public void setSunAmTo(String sunAmTo) {
    this.sunAmTo = sunAmTo;
  }

  public V3StopStaffing sunPmFrom(String sunPmFrom) {
    this.sunPmFrom = sunPmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return sunPmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getSunPmFrom() {
    return sunPmFrom;
  }

  public void setSunPmFrom(String sunPmFrom) {
    this.sunPmFrom = sunPmFrom;
  }

  public V3StopStaffing sunPmTo(String sunPmTo) {
    this.sunPmTo = sunPmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return sunPmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getSunPmTo() {
    return sunPmTo;
  }

  public void setSunPmTo(String sunPmTo) {
    this.sunPmTo = sunPmTo;
  }

  public V3StopStaffing thuAmFrom(String thuAmFrom) {
    this.thuAmFrom = thuAmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return thuAmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getThuAmFrom() {
    return thuAmFrom;
  }

  public void setThuAmFrom(String thuAmFrom) {
    this.thuAmFrom = thuAmFrom;
  }

  public V3StopStaffing thuAmTo(String thuAmTo) {
    this.thuAmTo = thuAmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return thuAmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getThuAmTo() {
    return thuAmTo;
  }

  public void setThuAmTo(String thuAmTo) {
    this.thuAmTo = thuAmTo;
  }

  public V3StopStaffing thuPmFrom(String thuPmFrom) {
    this.thuPmFrom = thuPmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return thuPmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getThuPmFrom() {
    return thuPmFrom;
  }

  public void setThuPmFrom(String thuPmFrom) {
    this.thuPmFrom = thuPmFrom;
  }

  public V3StopStaffing thuPmTo(String thuPmTo) {
    this.thuPmTo = thuPmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return thuPmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getThuPmTo() {
    return thuPmTo;
  }

  public void setThuPmTo(String thuPmTo) {
    this.thuPmTo = thuPmTo;
  }

  public V3StopStaffing tueAmFrom(String tueAmFrom) {
    this.tueAmFrom = tueAmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return tueAmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getTueAmFrom() {
    return tueAmFrom;
  }

  public void setTueAmFrom(String tueAmFrom) {
    this.tueAmFrom = tueAmFrom;
  }

  public V3StopStaffing tueAmTo(String tueAmTo) {
    this.tueAmTo = tueAmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return tueAmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getTueAmTo() {
    return tueAmTo;
  }

  public void setTueAmTo(String tueAmTo) {
    this.tueAmTo = tueAmTo;
  }

  public V3StopStaffing tuePmFrom(String tuePmFrom) {
    this.tuePmFrom = tuePmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return tuePmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getTuePmFrom() {
    return tuePmFrom;
  }

  public void setTuePmFrom(String tuePmFrom) {
    this.tuePmFrom = tuePmFrom;
  }

  public V3StopStaffing tuePmTo(String tuePmTo) {
    this.tuePmTo = tuePmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return tuePmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getTuePmTo() {
    return tuePmTo;
  }

  public void setTuePmTo(String tuePmTo) {
    this.tuePmTo = tuePmTo;
  }

  public V3StopStaffing wedAmFrom(String wedAmFrom) {
    this.wedAmFrom = wedAmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return wedAmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getWedAmFrom() {
    return wedAmFrom;
  }

  public void setWedAmFrom(String wedAmFrom) {
    this.wedAmFrom = wedAmFrom;
  }

  public V3StopStaffing wedAmTo(String wedAmTo) {
    this.wedAmTo = wedAmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return wedAmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getWedAmTo() {
    return wedAmTo;
  }

  public void setWedAmTo(String wedAmTo) {
    this.wedAmTo = wedAmTo;
  }

  public V3StopStaffing wedPmFrom(String wedPmFrom) {
    this.wedPmFrom = wedPmFrom;
    return this;
  }

  /**
   * Stop staffing hours
   * @return wedPmFrom
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getWedPmFrom() {
    return wedPmFrom;
  }

  public void setWedPmFrom(String wedPmFrom) {
    this.wedPmFrom = wedPmFrom;
  }

  public V3StopStaffing wedPmTo(String wedPmTo) {
    this.wedPmTo = wedPmTo;
    return this;
  }

  /**
   * Stop staffing hours
   * @return wedPmTo
   **/
  @Schema(description = "Stop staffing hours")
  
    public String getWedPmTo() {
    return wedPmTo;
  }

  public void setWedPmTo(String wedPmTo) {
    this.wedPmTo = wedPmTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopStaffing v3StopStaffing = (V3StopStaffing) o;
    return Objects.equals(this.friAmFrom, v3StopStaffing.friAmFrom) &&
        Objects.equals(this.friAmTo, v3StopStaffing.friAmTo) &&
        Objects.equals(this.friPmFrom, v3StopStaffing.friPmFrom) &&
        Objects.equals(this.friPmTo, v3StopStaffing.friPmTo) &&
        Objects.equals(this.monAmFrom, v3StopStaffing.monAmFrom) &&
        Objects.equals(this.monAmTo, v3StopStaffing.monAmTo) &&
        Objects.equals(this.monPmFrom, v3StopStaffing.monPmFrom) &&
        Objects.equals(this.monPmTo, v3StopStaffing.monPmTo) &&
        Objects.equals(this.phAdditionalText, v3StopStaffing.phAdditionalText) &&
        Objects.equals(this.phFrom, v3StopStaffing.phFrom) &&
        Objects.equals(this.phTo, v3StopStaffing.phTo) &&
        Objects.equals(this.satAmFrom, v3StopStaffing.satAmFrom) &&
        Objects.equals(this.satAmTo, v3StopStaffing.satAmTo) &&
        Objects.equals(this.satPmFrom, v3StopStaffing.satPmFrom) &&
        Objects.equals(this.satPmTo, v3StopStaffing.satPmTo) &&
        Objects.equals(this.sunAmFrom, v3StopStaffing.sunAmFrom) &&
        Objects.equals(this.sunAmTo, v3StopStaffing.sunAmTo) &&
        Objects.equals(this.sunPmFrom, v3StopStaffing.sunPmFrom) &&
        Objects.equals(this.sunPmTo, v3StopStaffing.sunPmTo) &&
        Objects.equals(this.thuAmFrom, v3StopStaffing.thuAmFrom) &&
        Objects.equals(this.thuAmTo, v3StopStaffing.thuAmTo) &&
        Objects.equals(this.thuPmFrom, v3StopStaffing.thuPmFrom) &&
        Objects.equals(this.thuPmTo, v3StopStaffing.thuPmTo) &&
        Objects.equals(this.tueAmFrom, v3StopStaffing.tueAmFrom) &&
        Objects.equals(this.tueAmTo, v3StopStaffing.tueAmTo) &&
        Objects.equals(this.tuePmFrom, v3StopStaffing.tuePmFrom) &&
        Objects.equals(this.tuePmTo, v3StopStaffing.tuePmTo) &&
        Objects.equals(this.wedAmFrom, v3StopStaffing.wedAmFrom) &&
        Objects.equals(this.wedAmTo, v3StopStaffing.wedAmTo) &&
        Objects.equals(this.wedPmFrom, v3StopStaffing.wedPmFrom) &&
        Objects.equals(this.wedPmTo, v3StopStaffing.wedPmTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(friAmFrom, friAmTo, friPmFrom, friPmTo, monAmFrom, monAmTo, monPmFrom, monPmTo, phAdditionalText, phFrom, phTo, satAmFrom, satAmTo, satPmFrom, satPmTo, sunAmFrom, sunAmTo, sunPmFrom, sunPmTo, thuAmFrom, thuAmTo, thuPmFrom, thuPmTo, tueAmFrom, tueAmTo, tuePmFrom, tuePmTo, wedAmFrom, wedAmTo, wedPmFrom, wedPmTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopStaffing {\n");
    
    sb.append("    friAmFrom: ").append(toIndentedString(friAmFrom)).append("\n");
    sb.append("    friAmTo: ").append(toIndentedString(friAmTo)).append("\n");
    sb.append("    friPmFrom: ").append(toIndentedString(friPmFrom)).append("\n");
    sb.append("    friPmTo: ").append(toIndentedString(friPmTo)).append("\n");
    sb.append("    monAmFrom: ").append(toIndentedString(monAmFrom)).append("\n");
    sb.append("    monAmTo: ").append(toIndentedString(monAmTo)).append("\n");
    sb.append("    monPmFrom: ").append(toIndentedString(monPmFrom)).append("\n");
    sb.append("    monPmTo: ").append(toIndentedString(monPmTo)).append("\n");
    sb.append("    phAdditionalText: ").append(toIndentedString(phAdditionalText)).append("\n");
    sb.append("    phFrom: ").append(toIndentedString(phFrom)).append("\n");
    sb.append("    phTo: ").append(toIndentedString(phTo)).append("\n");
    sb.append("    satAmFrom: ").append(toIndentedString(satAmFrom)).append("\n");
    sb.append("    satAmTo: ").append(toIndentedString(satAmTo)).append("\n");
    sb.append("    satPmFrom: ").append(toIndentedString(satPmFrom)).append("\n");
    sb.append("    satPmTo: ").append(toIndentedString(satPmTo)).append("\n");
    sb.append("    sunAmFrom: ").append(toIndentedString(sunAmFrom)).append("\n");
    sb.append("    sunAmTo: ").append(toIndentedString(sunAmTo)).append("\n");
    sb.append("    sunPmFrom: ").append(toIndentedString(sunPmFrom)).append("\n");
    sb.append("    sunPmTo: ").append(toIndentedString(sunPmTo)).append("\n");
    sb.append("    thuAmFrom: ").append(toIndentedString(thuAmFrom)).append("\n");
    sb.append("    thuAmTo: ").append(toIndentedString(thuAmTo)).append("\n");
    sb.append("    thuPmFrom: ").append(toIndentedString(thuPmFrom)).append("\n");
    sb.append("    thuPmTo: ").append(toIndentedString(thuPmTo)).append("\n");
    sb.append("    tueAmFrom: ").append(toIndentedString(tueAmFrom)).append("\n");
    sb.append("    tueAmTo: ").append(toIndentedString(tueAmTo)).append("\n");
    sb.append("    tuePmFrom: ").append(toIndentedString(tuePmFrom)).append("\n");
    sb.append("    tuePmTo: ").append(toIndentedString(tuePmTo)).append("\n");
    sb.append("    wedAmFrom: ").append(toIndentedString(wedAmFrom)).append("\n");
    sb.append("    wedAmTo: ").append(toIndentedString(wedAmTo)).append("\n");
    sb.append("    wedPmFrom: ").append(toIndentedString(wedPmFrom)).append("\n");
    sb.append("    wedPmTo: ").append(toIndentedString(wedPmTo)).append("\n");
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
