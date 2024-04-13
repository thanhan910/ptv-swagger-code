package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
public class V3PassengerFare   {
  private String passengerType = null;
  private BigDecimal fare2HourPeak = null;
  private BigDecimal fare2HourOffPeak = null;
  private BigDecimal fareDailyPeak = null;
  private BigDecimal fareDailyOffPeak = null;
  private BigDecimal pass7Days = null;
  private BigDecimal pass28To69DayPerDay = null;
  private BigDecimal pass70PlusDayPerDay = null;
  private BigDecimal weekendCap = null;
  private BigDecimal holidayCap = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("PassengerType")
  public String getPassengerType() {
    return passengerType;
  }
  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("Fare2HourPeak")
  public BigDecimal getFare2HourPeak() {
    return fare2HourPeak;
  }
  public void setFare2HourPeak(BigDecimal fare2HourPeak) {
    this.fare2HourPeak = fare2HourPeak;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("Fare2HourOffPeak")
  public BigDecimal getFare2HourOffPeak() {
    return fare2HourOffPeak;
  }
  public void setFare2HourOffPeak(BigDecimal fare2HourOffPeak) {
    this.fare2HourOffPeak = fare2HourOffPeak;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("FareDailyPeak")
  public BigDecimal getFareDailyPeak() {
    return fareDailyPeak;
  }
  public void setFareDailyPeak(BigDecimal fareDailyPeak) {
    this.fareDailyPeak = fareDailyPeak;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("FareDailyOffPeak")
  public BigDecimal getFareDailyOffPeak() {
    return fareDailyOffPeak;
  }
  public void setFareDailyOffPeak(BigDecimal fareDailyOffPeak) {
    this.fareDailyOffPeak = fareDailyOffPeak;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("Pass7Days")
  public BigDecimal getPass7Days() {
    return pass7Days;
  }
  public void setPass7Days(BigDecimal pass7Days) {
    this.pass7Days = pass7Days;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("Pass28To69DayPerDay")
  public BigDecimal getPass28To69DayPerDay() {
    return pass28To69DayPerDay;
  }
  public void setPass28To69DayPerDay(BigDecimal pass28To69DayPerDay) {
    this.pass28To69DayPerDay = pass28To69DayPerDay;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("Pass70PlusDayPerDay")
  public BigDecimal getPass70PlusDayPerDay() {
    return pass70PlusDayPerDay;
  }
  public void setPass70PlusDayPerDay(BigDecimal pass70PlusDayPerDay) {
    this.pass70PlusDayPerDay = pass70PlusDayPerDay;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("WeekendCap")
  public BigDecimal getWeekendCap() {
    return weekendCap;
  }
  public void setWeekendCap(BigDecimal weekendCap) {
    this.weekendCap = weekendCap;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("HolidayCap")
  public BigDecimal getHolidayCap() {
    return holidayCap;
  }
  public void setHolidayCap(BigDecimal holidayCap) {
    this.holidayCap = holidayCap;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
