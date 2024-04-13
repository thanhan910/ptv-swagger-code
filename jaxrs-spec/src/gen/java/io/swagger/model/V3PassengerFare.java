package io.swagger.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3PassengerFare   {

  private @Valid String passengerType = null;

  private @Valid BigDecimal fare2HourPeak = null;

  private @Valid BigDecimal fare2HourOffPeak = null;

  private @Valid BigDecimal fareDailyPeak = null;

  private @Valid BigDecimal fareDailyOffPeak = null;

  private @Valid BigDecimal pass7Days = null;

  private @Valid BigDecimal pass28To69DayPerDay = null;

  private @Valid BigDecimal pass70PlusDayPerDay = null;

  private @Valid BigDecimal weekendCap = null;

  private @Valid BigDecimal holidayCap = null;

  /**
   **/
  public V3PassengerFare passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("PassengerType")

  public String getPassengerType() {
    return passengerType;
  }
  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }

  /**
   **/
  public V3PassengerFare fare2HourPeak(BigDecimal fare2HourPeak) {
    this.fare2HourPeak = fare2HourPeak;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Fare2HourPeak")

  public BigDecimal getFare2HourPeak() {
    return fare2HourPeak;
  }
  public void setFare2HourPeak(BigDecimal fare2HourPeak) {
    this.fare2HourPeak = fare2HourPeak;
  }

  /**
   **/
  public V3PassengerFare fare2HourOffPeak(BigDecimal fare2HourOffPeak) {
    this.fare2HourOffPeak = fare2HourOffPeak;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Fare2HourOffPeak")

  public BigDecimal getFare2HourOffPeak() {
    return fare2HourOffPeak;
  }
  public void setFare2HourOffPeak(BigDecimal fare2HourOffPeak) {
    this.fare2HourOffPeak = fare2HourOffPeak;
  }

  /**
   **/
  public V3PassengerFare fareDailyPeak(BigDecimal fareDailyPeak) {
    this.fareDailyPeak = fareDailyPeak;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("FareDailyPeak")

  public BigDecimal getFareDailyPeak() {
    return fareDailyPeak;
  }
  public void setFareDailyPeak(BigDecimal fareDailyPeak) {
    this.fareDailyPeak = fareDailyPeak;
  }

  /**
   **/
  public V3PassengerFare fareDailyOffPeak(BigDecimal fareDailyOffPeak) {
    this.fareDailyOffPeak = fareDailyOffPeak;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("FareDailyOffPeak")

  public BigDecimal getFareDailyOffPeak() {
    return fareDailyOffPeak;
  }
  public void setFareDailyOffPeak(BigDecimal fareDailyOffPeak) {
    this.fareDailyOffPeak = fareDailyOffPeak;
  }

  /**
   **/
  public V3PassengerFare pass7Days(BigDecimal pass7Days) {
    this.pass7Days = pass7Days;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Pass7Days")

  public BigDecimal getPass7Days() {
    return pass7Days;
  }
  public void setPass7Days(BigDecimal pass7Days) {
    this.pass7Days = pass7Days;
  }

  /**
   **/
  public V3PassengerFare pass28To69DayPerDay(BigDecimal pass28To69DayPerDay) {
    this.pass28To69DayPerDay = pass28To69DayPerDay;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Pass28To69DayPerDay")

  public BigDecimal getPass28To69DayPerDay() {
    return pass28To69DayPerDay;
  }
  public void setPass28To69DayPerDay(BigDecimal pass28To69DayPerDay) {
    this.pass28To69DayPerDay = pass28To69DayPerDay;
  }

  /**
   **/
  public V3PassengerFare pass70PlusDayPerDay(BigDecimal pass70PlusDayPerDay) {
    this.pass70PlusDayPerDay = pass70PlusDayPerDay;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Pass70PlusDayPerDay")

  public BigDecimal getPass70PlusDayPerDay() {
    return pass70PlusDayPerDay;
  }
  public void setPass70PlusDayPerDay(BigDecimal pass70PlusDayPerDay) {
    this.pass70PlusDayPerDay = pass70PlusDayPerDay;
  }

  /**
   **/
  public V3PassengerFare weekendCap(BigDecimal weekendCap) {
    this.weekendCap = weekendCap;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("WeekendCap")

  public BigDecimal getWeekendCap() {
    return weekendCap;
  }
  public void setWeekendCap(BigDecimal weekendCap) {
    this.weekendCap = weekendCap;
  }

  /**
   **/
  public V3PassengerFare holidayCap(BigDecimal holidayCap) {
    this.holidayCap = holidayCap;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("HolidayCap")

  public BigDecimal getHolidayCap() {
    return holidayCap;
  }
  public void setHolidayCap(BigDecimal holidayCap) {
    this.holidayCap = holidayCap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3PassengerFare v3PassengerFare = (V3PassengerFare) o;
    return Objects.equals(passengerType, v3PassengerFare.passengerType) &&
        Objects.equals(fare2HourPeak, v3PassengerFare.fare2HourPeak) &&
        Objects.equals(fare2HourOffPeak, v3PassengerFare.fare2HourOffPeak) &&
        Objects.equals(fareDailyPeak, v3PassengerFare.fareDailyPeak) &&
        Objects.equals(fareDailyOffPeak, v3PassengerFare.fareDailyOffPeak) &&
        Objects.equals(pass7Days, v3PassengerFare.pass7Days) &&
        Objects.equals(pass28To69DayPerDay, v3PassengerFare.pass28To69DayPerDay) &&
        Objects.equals(pass70PlusDayPerDay, v3PassengerFare.pass70PlusDayPerDay) &&
        Objects.equals(weekendCap, v3PassengerFare.weekendCap) &&
        Objects.equals(holidayCap, v3PassengerFare.holidayCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passengerType, fare2HourPeak, fare2HourOffPeak, fareDailyPeak, fareDailyOffPeak, pass7Days, pass28To69DayPerDay, pass70PlusDayPerDay, weekendCap, holidayCap);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
