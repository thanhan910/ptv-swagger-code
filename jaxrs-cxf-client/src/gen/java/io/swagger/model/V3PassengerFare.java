package io.swagger.model;

import java.math.BigDecimal;

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

public class V3PassengerFare   {
  
  @Schema(description = "")
  private String passengerType = null;
  
  @Schema(description = "")
  private BigDecimal fare2HourPeak = null;
  
  @Schema(description = "")
  private BigDecimal fare2HourOffPeak = null;
  
  @Schema(description = "")
  private BigDecimal fareDailyPeak = null;
  
  @Schema(description = "")
  private BigDecimal fareDailyOffPeak = null;
  
  @Schema(description = "")
  private BigDecimal pass7Days = null;
  
  @Schema(description = "")
  private BigDecimal pass28To69DayPerDay = null;
  
  @Schema(description = "")
  private BigDecimal pass70PlusDayPerDay = null;
  
  @Schema(description = "")
  private BigDecimal weekendCap = null;
  
  @Schema(description = "")
  private BigDecimal holidayCap = null;
 /**
   * Get passengerType
   * @return passengerType
  **/
  @JsonProperty("PassengerType")
  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }

  public V3PassengerFare passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

 /**
   * Get fare2HourPeak
   * @return fare2HourPeak
  **/
  @JsonProperty("Fare2HourPeak")
  public BigDecimal getFare2HourPeak() {
    return fare2HourPeak;
  }

  public void setFare2HourPeak(BigDecimal fare2HourPeak) {
    this.fare2HourPeak = fare2HourPeak;
  }

  public V3PassengerFare fare2HourPeak(BigDecimal fare2HourPeak) {
    this.fare2HourPeak = fare2HourPeak;
    return this;
  }

 /**
   * Get fare2HourOffPeak
   * @return fare2HourOffPeak
  **/
  @JsonProperty("Fare2HourOffPeak")
  public BigDecimal getFare2HourOffPeak() {
    return fare2HourOffPeak;
  }

  public void setFare2HourOffPeak(BigDecimal fare2HourOffPeak) {
    this.fare2HourOffPeak = fare2HourOffPeak;
  }

  public V3PassengerFare fare2HourOffPeak(BigDecimal fare2HourOffPeak) {
    this.fare2HourOffPeak = fare2HourOffPeak;
    return this;
  }

 /**
   * Get fareDailyPeak
   * @return fareDailyPeak
  **/
  @JsonProperty("FareDailyPeak")
  public BigDecimal getFareDailyPeak() {
    return fareDailyPeak;
  }

  public void setFareDailyPeak(BigDecimal fareDailyPeak) {
    this.fareDailyPeak = fareDailyPeak;
  }

  public V3PassengerFare fareDailyPeak(BigDecimal fareDailyPeak) {
    this.fareDailyPeak = fareDailyPeak;
    return this;
  }

 /**
   * Get fareDailyOffPeak
   * @return fareDailyOffPeak
  **/
  @JsonProperty("FareDailyOffPeak")
  public BigDecimal getFareDailyOffPeak() {
    return fareDailyOffPeak;
  }

  public void setFareDailyOffPeak(BigDecimal fareDailyOffPeak) {
    this.fareDailyOffPeak = fareDailyOffPeak;
  }

  public V3PassengerFare fareDailyOffPeak(BigDecimal fareDailyOffPeak) {
    this.fareDailyOffPeak = fareDailyOffPeak;
    return this;
  }

 /**
   * Get pass7Days
   * @return pass7Days
  **/
  @JsonProperty("Pass7Days")
  public BigDecimal getPass7Days() {
    return pass7Days;
  }

  public void setPass7Days(BigDecimal pass7Days) {
    this.pass7Days = pass7Days;
  }

  public V3PassengerFare pass7Days(BigDecimal pass7Days) {
    this.pass7Days = pass7Days;
    return this;
  }

 /**
   * Get pass28To69DayPerDay
   * @return pass28To69DayPerDay
  **/
  @JsonProperty("Pass28To69DayPerDay")
  public BigDecimal getPass28To69DayPerDay() {
    return pass28To69DayPerDay;
  }

  public void setPass28To69DayPerDay(BigDecimal pass28To69DayPerDay) {
    this.pass28To69DayPerDay = pass28To69DayPerDay;
  }

  public V3PassengerFare pass28To69DayPerDay(BigDecimal pass28To69DayPerDay) {
    this.pass28To69DayPerDay = pass28To69DayPerDay;
    return this;
  }

 /**
   * Get pass70PlusDayPerDay
   * @return pass70PlusDayPerDay
  **/
  @JsonProperty("Pass70PlusDayPerDay")
  public BigDecimal getPass70PlusDayPerDay() {
    return pass70PlusDayPerDay;
  }

  public void setPass70PlusDayPerDay(BigDecimal pass70PlusDayPerDay) {
    this.pass70PlusDayPerDay = pass70PlusDayPerDay;
  }

  public V3PassengerFare pass70PlusDayPerDay(BigDecimal pass70PlusDayPerDay) {
    this.pass70PlusDayPerDay = pass70PlusDayPerDay;
    return this;
  }

 /**
   * Get weekendCap
   * @return weekendCap
  **/
  @JsonProperty("WeekendCap")
  public BigDecimal getWeekendCap() {
    return weekendCap;
  }

  public void setWeekendCap(BigDecimal weekendCap) {
    this.weekendCap = weekendCap;
  }

  public V3PassengerFare weekendCap(BigDecimal weekendCap) {
    this.weekendCap = weekendCap;
    return this;
  }

 /**
   * Get holidayCap
   * @return holidayCap
  **/
  @JsonProperty("HolidayCap")
  public BigDecimal getHolidayCap() {
    return holidayCap;
  }

  public void setHolidayCap(BigDecimal holidayCap) {
    this.holidayCap = holidayCap;
  }

  public V3PassengerFare holidayCap(BigDecimal holidayCap) {
    this.holidayCap = holidayCap;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3PassengerFare {\n");
    
    sb.append("    passengerType: ").append(toIndentedString(passengerType)).append("\n");
    sb.append("    fare2HourPeak: ").append(toIndentedString(fare2HourPeak)).append("\n");
    sb.append("    fare2HourOffPeak: ").append(toIndentedString(fare2HourOffPeak)).append("\n");
    sb.append("    fareDailyPeak: ").append(toIndentedString(fareDailyPeak)).append("\n");
    sb.append("    fareDailyOffPeak: ").append(toIndentedString(fareDailyOffPeak)).append("\n");
    sb.append("    pass7Days: ").append(toIndentedString(pass7Days)).append("\n");
    sb.append("    pass28To69DayPerDay: ").append(toIndentedString(pass28To69DayPerDay)).append("\n");
    sb.append("    pass70PlusDayPerDay: ").append(toIndentedString(pass70PlusDayPerDay)).append("\n");
    sb.append("    weekendCap: ").append(toIndentedString(weekendCap)).append("\n");
    sb.append("    holidayCap: ").append(toIndentedString(holidayCap)).append("\n");
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
