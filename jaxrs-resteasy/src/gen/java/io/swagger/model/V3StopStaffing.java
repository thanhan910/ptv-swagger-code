package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3StopStaffing   {
  private String friAmFrom = null;  private String friAmTo = null;  private String friPmFrom = null;  private String friPmTo = null;  private String monAmFrom = null;  private String monAmTo = null;  private String monPmFrom = null;  private String monPmTo = null;  private String phAdditionalText = null;  private String phFrom = null;  private String phTo = null;  private String satAmFrom = null;  private String satAmTo = null;  private String satPmFrom = null;  private String satPmTo = null;  private String sunAmFrom = null;  private String sunAmTo = null;  private String sunPmFrom = null;  private String sunPmTo = null;  private String thuAmFrom = null;  private String thuAmTo = null;  private String thuPmFrom = null;  private String thuPmTo = null;  private String tueAmFrom = null;  private String tueAmTo = null;  private String tuePmFrom = null;  private String tuePmTo = null;  private String wedAmFrom = null;  private String wedAmTo = null;  private String wedPmFrom = null;  private String wedPmTo = null;

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("fri_am_from")
  public String getFriAmFrom() {
    return friAmFrom;
  }
  public void setFriAmFrom(String friAmFrom) {
    this.friAmFrom = friAmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("fri_am_to")
  public String getFriAmTo() {
    return friAmTo;
  }
  public void setFriAmTo(String friAmTo) {
    this.friAmTo = friAmTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("fri_pm_from")
  public String getFriPmFrom() {
    return friPmFrom;
  }
  public void setFriPmFrom(String friPmFrom) {
    this.friPmFrom = friPmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("fri_pm_to")
  public String getFriPmTo() {
    return friPmTo;
  }
  public void setFriPmTo(String friPmTo) {
    this.friPmTo = friPmTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("mon_am_from")
  public String getMonAmFrom() {
    return monAmFrom;
  }
  public void setMonAmFrom(String monAmFrom) {
    this.monAmFrom = monAmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("mon_am_to")
  public String getMonAmTo() {
    return monAmTo;
  }
  public void setMonAmTo(String monAmTo) {
    this.monAmTo = monAmTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("mon_pm_from")
  public String getMonPmFrom() {
    return monPmFrom;
  }
  public void setMonPmFrom(String monPmFrom) {
    this.monPmFrom = monPmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("mon_pm_to")
  public String getMonPmTo() {
    return monPmTo;
  }
  public void setMonPmTo(String monPmTo) {
    this.monPmTo = monPmTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("ph_additional_text")
  public String getPhAdditionalText() {
    return phAdditionalText;
  }
  public void setPhAdditionalText(String phAdditionalText) {
    this.phAdditionalText = phAdditionalText;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("ph_from")
  public String getPhFrom() {
    return phFrom;
  }
  public void setPhFrom(String phFrom) {
    this.phFrom = phFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("ph_to")
  public String getPhTo() {
    return phTo;
  }
  public void setPhTo(String phTo) {
    this.phTo = phTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("sat_am_from")
  public String getSatAmFrom() {
    return satAmFrom;
  }
  public void setSatAmFrom(String satAmFrom) {
    this.satAmFrom = satAmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("sat_am_to")
  public String getSatAmTo() {
    return satAmTo;
  }
  public void setSatAmTo(String satAmTo) {
    this.satAmTo = satAmTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("sat_pm_from")
  public String getSatPmFrom() {
    return satPmFrom;
  }
  public void setSatPmFrom(String satPmFrom) {
    this.satPmFrom = satPmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("sat_pm_to")
  public String getSatPmTo() {
    return satPmTo;
  }
  public void setSatPmTo(String satPmTo) {
    this.satPmTo = satPmTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("sun_am_from")
  public String getSunAmFrom() {
    return sunAmFrom;
  }
  public void setSunAmFrom(String sunAmFrom) {
    this.sunAmFrom = sunAmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("sun_am_to")
  public String getSunAmTo() {
    return sunAmTo;
  }
  public void setSunAmTo(String sunAmTo) {
    this.sunAmTo = sunAmTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("sun_pm_from")
  public String getSunPmFrom() {
    return sunPmFrom;
  }
  public void setSunPmFrom(String sunPmFrom) {
    this.sunPmFrom = sunPmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("sun_pm_to")
  public String getSunPmTo() {
    return sunPmTo;
  }
  public void setSunPmTo(String sunPmTo) {
    this.sunPmTo = sunPmTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("thu_am_from")
  public String getThuAmFrom() {
    return thuAmFrom;
  }
  public void setThuAmFrom(String thuAmFrom) {
    this.thuAmFrom = thuAmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("thu_am_to")
  public String getThuAmTo() {
    return thuAmTo;
  }
  public void setThuAmTo(String thuAmTo) {
    this.thuAmTo = thuAmTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("thu_pm_from")
  public String getThuPmFrom() {
    return thuPmFrom;
  }
  public void setThuPmFrom(String thuPmFrom) {
    this.thuPmFrom = thuPmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("thu_pm_to")
  public String getThuPmTo() {
    return thuPmTo;
  }
  public void setThuPmTo(String thuPmTo) {
    this.thuPmTo = thuPmTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("tue_am_from")
  public String getTueAmFrom() {
    return tueAmFrom;
  }
  public void setTueAmFrom(String tueAmFrom) {
    this.tueAmFrom = tueAmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("tue_am_to")
  public String getTueAmTo() {
    return tueAmTo;
  }
  public void setTueAmTo(String tueAmTo) {
    this.tueAmTo = tueAmTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("tue_pm_from")
  public String getTuePmFrom() {
    return tuePmFrom;
  }
  public void setTuePmFrom(String tuePmFrom) {
    this.tuePmFrom = tuePmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("tue_pm_to")
  public String getTuePmTo() {
    return tuePmTo;
  }
  public void setTuePmTo(String tuePmTo) {
    this.tuePmTo = tuePmTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("wed_am_from")
  public String getWedAmFrom() {
    return wedAmFrom;
  }
  public void setWedAmFrom(String wedAmFrom) {
    this.wedAmFrom = wedAmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("wed_am_to")
  public String getWedAmTo() {
    return wedAmTo;
  }
  public void setWedAmTo(String wedAmTo) {
    this.wedAmTo = wedAmTo;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("wed_pm_from")
  public String getWedPmFrom() {
    return wedPmFrom;
  }
  public void setWedPmFrom(String wedPmFrom) {
    this.wedPmFrom = wedPmFrom;
  }

  /**
   * Stop staffing hours
   **/
  
  @Schema(description = "Stop staffing hours")
  @JsonProperty("wed_pm_To")
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
    return Objects.equals(friAmFrom, v3StopStaffing.friAmFrom) &&
        Objects.equals(friAmTo, v3StopStaffing.friAmTo) &&
        Objects.equals(friPmFrom, v3StopStaffing.friPmFrom) &&
        Objects.equals(friPmTo, v3StopStaffing.friPmTo) &&
        Objects.equals(monAmFrom, v3StopStaffing.monAmFrom) &&
        Objects.equals(monAmTo, v3StopStaffing.monAmTo) &&
        Objects.equals(monPmFrom, v3StopStaffing.monPmFrom) &&
        Objects.equals(monPmTo, v3StopStaffing.monPmTo) &&
        Objects.equals(phAdditionalText, v3StopStaffing.phAdditionalText) &&
        Objects.equals(phFrom, v3StopStaffing.phFrom) &&
        Objects.equals(phTo, v3StopStaffing.phTo) &&
        Objects.equals(satAmFrom, v3StopStaffing.satAmFrom) &&
        Objects.equals(satAmTo, v3StopStaffing.satAmTo) &&
        Objects.equals(satPmFrom, v3StopStaffing.satPmFrom) &&
        Objects.equals(satPmTo, v3StopStaffing.satPmTo) &&
        Objects.equals(sunAmFrom, v3StopStaffing.sunAmFrom) &&
        Objects.equals(sunAmTo, v3StopStaffing.sunAmTo) &&
        Objects.equals(sunPmFrom, v3StopStaffing.sunPmFrom) &&
        Objects.equals(sunPmTo, v3StopStaffing.sunPmTo) &&
        Objects.equals(thuAmFrom, v3StopStaffing.thuAmFrom) &&
        Objects.equals(thuAmTo, v3StopStaffing.thuAmTo) &&
        Objects.equals(thuPmFrom, v3StopStaffing.thuPmFrom) &&
        Objects.equals(thuPmTo, v3StopStaffing.thuPmTo) &&
        Objects.equals(tueAmFrom, v3StopStaffing.tueAmFrom) &&
        Objects.equals(tueAmTo, v3StopStaffing.tueAmTo) &&
        Objects.equals(tuePmFrom, v3StopStaffing.tuePmFrom) &&
        Objects.equals(tuePmTo, v3StopStaffing.tuePmTo) &&
        Objects.equals(wedAmFrom, v3StopStaffing.wedAmFrom) &&
        Objects.equals(wedAmTo, v3StopStaffing.wedAmTo) &&
        Objects.equals(wedPmFrom, v3StopStaffing.wedPmFrom) &&
        Objects.equals(wedPmTo, v3StopStaffing.wedPmTo);
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
