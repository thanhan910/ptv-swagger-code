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

public class V3StopStaffing   {
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String friAmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String friAmTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String friPmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String friPmTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String monAmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String monAmTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String monPmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String monPmTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String phAdditionalText = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String phFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String phTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String satAmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String satAmTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String satPmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String satPmTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String sunAmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String sunAmTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String sunPmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String sunPmTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String thuAmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String thuAmTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String thuPmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String thuPmTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String tueAmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String tueAmTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String tuePmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String tuePmTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String wedAmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String wedAmTo = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String wedPmFrom = null;
  
  @Schema(description = "Stop staffing hours")
 /**
   * Stop staffing hours  
  **/
  private String wedPmTo = null;
 /**
   * Stop staffing hours
   * @return friAmFrom
  **/
  @JsonProperty("fri_am_from")
  public String getFriAmFrom() {
    return friAmFrom;
  }

  public void setFriAmFrom(String friAmFrom) {
    this.friAmFrom = friAmFrom;
  }

  public V3StopStaffing friAmFrom(String friAmFrom) {
    this.friAmFrom = friAmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return friAmTo
  **/
  @JsonProperty("fri_am_to")
  public String getFriAmTo() {
    return friAmTo;
  }

  public void setFriAmTo(String friAmTo) {
    this.friAmTo = friAmTo;
  }

  public V3StopStaffing friAmTo(String friAmTo) {
    this.friAmTo = friAmTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return friPmFrom
  **/
  @JsonProperty("fri_pm_from")
  public String getFriPmFrom() {
    return friPmFrom;
  }

  public void setFriPmFrom(String friPmFrom) {
    this.friPmFrom = friPmFrom;
  }

  public V3StopStaffing friPmFrom(String friPmFrom) {
    this.friPmFrom = friPmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return friPmTo
  **/
  @JsonProperty("fri_pm_to")
  public String getFriPmTo() {
    return friPmTo;
  }

  public void setFriPmTo(String friPmTo) {
    this.friPmTo = friPmTo;
  }

  public V3StopStaffing friPmTo(String friPmTo) {
    this.friPmTo = friPmTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return monAmFrom
  **/
  @JsonProperty("mon_am_from")
  public String getMonAmFrom() {
    return monAmFrom;
  }

  public void setMonAmFrom(String monAmFrom) {
    this.monAmFrom = monAmFrom;
  }

  public V3StopStaffing monAmFrom(String monAmFrom) {
    this.monAmFrom = monAmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return monAmTo
  **/
  @JsonProperty("mon_am_to")
  public String getMonAmTo() {
    return monAmTo;
  }

  public void setMonAmTo(String monAmTo) {
    this.monAmTo = monAmTo;
  }

  public V3StopStaffing monAmTo(String monAmTo) {
    this.monAmTo = monAmTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return monPmFrom
  **/
  @JsonProperty("mon_pm_from")
  public String getMonPmFrom() {
    return monPmFrom;
  }

  public void setMonPmFrom(String monPmFrom) {
    this.monPmFrom = monPmFrom;
  }

  public V3StopStaffing monPmFrom(String monPmFrom) {
    this.monPmFrom = monPmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return monPmTo
  **/
  @JsonProperty("mon_pm_to")
  public String getMonPmTo() {
    return monPmTo;
  }

  public void setMonPmTo(String monPmTo) {
    this.monPmTo = monPmTo;
  }

  public V3StopStaffing monPmTo(String monPmTo) {
    this.monPmTo = monPmTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return phAdditionalText
  **/
  @JsonProperty("ph_additional_text")
  public String getPhAdditionalText() {
    return phAdditionalText;
  }

  public void setPhAdditionalText(String phAdditionalText) {
    this.phAdditionalText = phAdditionalText;
  }

  public V3StopStaffing phAdditionalText(String phAdditionalText) {
    this.phAdditionalText = phAdditionalText;
    return this;
  }

 /**
   * Stop staffing hours
   * @return phFrom
  **/
  @JsonProperty("ph_from")
  public String getPhFrom() {
    return phFrom;
  }

  public void setPhFrom(String phFrom) {
    this.phFrom = phFrom;
  }

  public V3StopStaffing phFrom(String phFrom) {
    this.phFrom = phFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return phTo
  **/
  @JsonProperty("ph_to")
  public String getPhTo() {
    return phTo;
  }

  public void setPhTo(String phTo) {
    this.phTo = phTo;
  }

  public V3StopStaffing phTo(String phTo) {
    this.phTo = phTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return satAmFrom
  **/
  @JsonProperty("sat_am_from")
  public String getSatAmFrom() {
    return satAmFrom;
  }

  public void setSatAmFrom(String satAmFrom) {
    this.satAmFrom = satAmFrom;
  }

  public V3StopStaffing satAmFrom(String satAmFrom) {
    this.satAmFrom = satAmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return satAmTo
  **/
  @JsonProperty("sat_am_to")
  public String getSatAmTo() {
    return satAmTo;
  }

  public void setSatAmTo(String satAmTo) {
    this.satAmTo = satAmTo;
  }

  public V3StopStaffing satAmTo(String satAmTo) {
    this.satAmTo = satAmTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return satPmFrom
  **/
  @JsonProperty("sat_pm_from")
  public String getSatPmFrom() {
    return satPmFrom;
  }

  public void setSatPmFrom(String satPmFrom) {
    this.satPmFrom = satPmFrom;
  }

  public V3StopStaffing satPmFrom(String satPmFrom) {
    this.satPmFrom = satPmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return satPmTo
  **/
  @JsonProperty("sat_pm_to")
  public String getSatPmTo() {
    return satPmTo;
  }

  public void setSatPmTo(String satPmTo) {
    this.satPmTo = satPmTo;
  }

  public V3StopStaffing satPmTo(String satPmTo) {
    this.satPmTo = satPmTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return sunAmFrom
  **/
  @JsonProperty("sun_am_from")
  public String getSunAmFrom() {
    return sunAmFrom;
  }

  public void setSunAmFrom(String sunAmFrom) {
    this.sunAmFrom = sunAmFrom;
  }

  public V3StopStaffing sunAmFrom(String sunAmFrom) {
    this.sunAmFrom = sunAmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return sunAmTo
  **/
  @JsonProperty("sun_am_to")
  public String getSunAmTo() {
    return sunAmTo;
  }

  public void setSunAmTo(String sunAmTo) {
    this.sunAmTo = sunAmTo;
  }

  public V3StopStaffing sunAmTo(String sunAmTo) {
    this.sunAmTo = sunAmTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return sunPmFrom
  **/
  @JsonProperty("sun_pm_from")
  public String getSunPmFrom() {
    return sunPmFrom;
  }

  public void setSunPmFrom(String sunPmFrom) {
    this.sunPmFrom = sunPmFrom;
  }

  public V3StopStaffing sunPmFrom(String sunPmFrom) {
    this.sunPmFrom = sunPmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return sunPmTo
  **/
  @JsonProperty("sun_pm_to")
  public String getSunPmTo() {
    return sunPmTo;
  }

  public void setSunPmTo(String sunPmTo) {
    this.sunPmTo = sunPmTo;
  }

  public V3StopStaffing sunPmTo(String sunPmTo) {
    this.sunPmTo = sunPmTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return thuAmFrom
  **/
  @JsonProperty("thu_am_from")
  public String getThuAmFrom() {
    return thuAmFrom;
  }

  public void setThuAmFrom(String thuAmFrom) {
    this.thuAmFrom = thuAmFrom;
  }

  public V3StopStaffing thuAmFrom(String thuAmFrom) {
    this.thuAmFrom = thuAmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return thuAmTo
  **/
  @JsonProperty("thu_am_to")
  public String getThuAmTo() {
    return thuAmTo;
  }

  public void setThuAmTo(String thuAmTo) {
    this.thuAmTo = thuAmTo;
  }

  public V3StopStaffing thuAmTo(String thuAmTo) {
    this.thuAmTo = thuAmTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return thuPmFrom
  **/
  @JsonProperty("thu_pm_from")
  public String getThuPmFrom() {
    return thuPmFrom;
  }

  public void setThuPmFrom(String thuPmFrom) {
    this.thuPmFrom = thuPmFrom;
  }

  public V3StopStaffing thuPmFrom(String thuPmFrom) {
    this.thuPmFrom = thuPmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return thuPmTo
  **/
  @JsonProperty("thu_pm_to")
  public String getThuPmTo() {
    return thuPmTo;
  }

  public void setThuPmTo(String thuPmTo) {
    this.thuPmTo = thuPmTo;
  }

  public V3StopStaffing thuPmTo(String thuPmTo) {
    this.thuPmTo = thuPmTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return tueAmFrom
  **/
  @JsonProperty("tue_am_from")
  public String getTueAmFrom() {
    return tueAmFrom;
  }

  public void setTueAmFrom(String tueAmFrom) {
    this.tueAmFrom = tueAmFrom;
  }

  public V3StopStaffing tueAmFrom(String tueAmFrom) {
    this.tueAmFrom = tueAmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return tueAmTo
  **/
  @JsonProperty("tue_am_to")
  public String getTueAmTo() {
    return tueAmTo;
  }

  public void setTueAmTo(String tueAmTo) {
    this.tueAmTo = tueAmTo;
  }

  public V3StopStaffing tueAmTo(String tueAmTo) {
    this.tueAmTo = tueAmTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return tuePmFrom
  **/
  @JsonProperty("tue_pm_from")
  public String getTuePmFrom() {
    return tuePmFrom;
  }

  public void setTuePmFrom(String tuePmFrom) {
    this.tuePmFrom = tuePmFrom;
  }

  public V3StopStaffing tuePmFrom(String tuePmFrom) {
    this.tuePmFrom = tuePmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return tuePmTo
  **/
  @JsonProperty("tue_pm_to")
  public String getTuePmTo() {
    return tuePmTo;
  }

  public void setTuePmTo(String tuePmTo) {
    this.tuePmTo = tuePmTo;
  }

  public V3StopStaffing tuePmTo(String tuePmTo) {
    this.tuePmTo = tuePmTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return wedAmFrom
  **/
  @JsonProperty("wed_am_from")
  public String getWedAmFrom() {
    return wedAmFrom;
  }

  public void setWedAmFrom(String wedAmFrom) {
    this.wedAmFrom = wedAmFrom;
  }

  public V3StopStaffing wedAmFrom(String wedAmFrom) {
    this.wedAmFrom = wedAmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return wedAmTo
  **/
  @JsonProperty("wed_am_to")
  public String getWedAmTo() {
    return wedAmTo;
  }

  public void setWedAmTo(String wedAmTo) {
    this.wedAmTo = wedAmTo;
  }

  public V3StopStaffing wedAmTo(String wedAmTo) {
    this.wedAmTo = wedAmTo;
    return this;
  }

 /**
   * Stop staffing hours
   * @return wedPmFrom
  **/
  @JsonProperty("wed_pm_from")
  public String getWedPmFrom() {
    return wedPmFrom;
  }

  public void setWedPmFrom(String wedPmFrom) {
    this.wedPmFrom = wedPmFrom;
  }

  public V3StopStaffing wedPmFrom(String wedPmFrom) {
    this.wedPmFrom = wedPmFrom;
    return this;
  }

 /**
   * Stop staffing hours
   * @return wedPmTo
  **/
  @JsonProperty("wed_pm_To")
  public String getWedPmTo() {
    return wedPmTo;
  }

  public void setWedPmTo(String wedPmTo) {
    this.wedPmTo = wedPmTo;
  }

  public V3StopStaffing wedPmTo(String wedPmTo) {
    this.wedPmTo = wedPmTo;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
