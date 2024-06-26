/*
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V3StopTicket
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-22T22:16:54.146562100+10:00[Australia/Sydney]")

public class V3StopTicket {
  @SerializedName("ticket_type")
  private String ticketType = null;

  @SerializedName("zone")
  private String zone = null;

  @SerializedName("is_free_fare_zone")
  private Boolean isFreeFareZone = null;

  @SerializedName("ticket_machine")
  private Boolean ticketMachine = null;

  @SerializedName("ticket_checks")
  private Boolean ticketChecks = null;

  @SerializedName("vline_reservation")
  private Boolean vlineReservation = null;

  @SerializedName("ticket_zones")
  private List<Integer> ticketZones = null;

  public V3StopTicket ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

   /**
   * Indicates the ticket type for the stop (myki, paper or both)
   * @return ticketType
  **/
  @Schema(description = "Indicates the ticket type for the stop (myki, paper or both)")
  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public V3StopTicket zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Description of the zone
   * @return zone
  **/
  @Schema(description = "Description of the zone")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public V3StopTicket isFreeFareZone(Boolean isFreeFareZone) {
    this.isFreeFareZone = isFreeFareZone;
    return this;
  }

   /**
   * Indicates whether the stop is inside the free fare zone
   * @return isFreeFareZone
  **/
  @Schema(description = "Indicates whether the stop is inside the free fare zone")
  public Boolean isIsFreeFareZone() {
    return isFreeFareZone;
  }

  public void setIsFreeFareZone(Boolean isFreeFareZone) {
    this.isFreeFareZone = isFreeFareZone;
  }

  public V3StopTicket ticketMachine(Boolean ticketMachine) {
    this.ticketMachine = ticketMachine;
    return this;
  }

   /**
   * Get ticketMachine
   * @return ticketMachine
  **/
  @Schema(description = "")
  public Boolean isTicketMachine() {
    return ticketMachine;
  }

  public void setTicketMachine(Boolean ticketMachine) {
    this.ticketMachine = ticketMachine;
  }

  public V3StopTicket ticketChecks(Boolean ticketChecks) {
    this.ticketChecks = ticketChecks;
    return this;
  }

   /**
   * Get ticketChecks
   * @return ticketChecks
  **/
  @Schema(description = "")
  public Boolean isTicketChecks() {
    return ticketChecks;
  }

  public void setTicketChecks(Boolean ticketChecks) {
    this.ticketChecks = ticketChecks;
  }

  public V3StopTicket vlineReservation(Boolean vlineReservation) {
    this.vlineReservation = vlineReservation;
    return this;
  }

   /**
   * Get vlineReservation
   * @return vlineReservation
  **/
  @Schema(description = "")
  public Boolean isVlineReservation() {
    return vlineReservation;
  }

  public void setVlineReservation(Boolean vlineReservation) {
    this.vlineReservation = vlineReservation;
  }

  public V3StopTicket ticketZones(List<Integer> ticketZones) {
    this.ticketZones = ticketZones;
    return this;
  }

  public V3StopTicket addTicketZonesItem(Integer ticketZonesItem) {
    if (this.ticketZones == null) {
      this.ticketZones = new ArrayList<Integer>();
    }
    this.ticketZones.add(ticketZonesItem);
    return this;
  }

   /**
   * Get ticketZones
   * @return ticketZones
  **/
  @Schema(description = "")
  public List<Integer> getTicketZones() {
    return ticketZones;
  }

  public void setTicketZones(List<Integer> ticketZones) {
    this.ticketZones = ticketZones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopTicket v3StopTicket = (V3StopTicket) o;
    return Objects.equals(this.ticketType, v3StopTicket.ticketType) &&
        Objects.equals(this.zone, v3StopTicket.zone) &&
        Objects.equals(this.isFreeFareZone, v3StopTicket.isFreeFareZone) &&
        Objects.equals(this.ticketMachine, v3StopTicket.ticketMachine) &&
        Objects.equals(this.ticketChecks, v3StopTicket.ticketChecks) &&
        Objects.equals(this.vlineReservation, v3StopTicket.vlineReservation) &&
        Objects.equals(this.ticketZones, v3StopTicket.ticketZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketType, zone, isFreeFareZone, ticketMachine, ticketChecks, vlineReservation, ticketZones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopTicket {\n");
    
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    isFreeFareZone: ").append(toIndentedString(isFreeFareZone)).append("\n");
    sb.append("    ticketMachine: ").append(toIndentedString(ticketMachine)).append("\n");
    sb.append("    ticketChecks: ").append(toIndentedString(ticketChecks)).append("\n");
    sb.append("    vlineReservation: ").append(toIndentedString(vlineReservation)).append("\n");
    sb.append("    ticketZones: ").append(toIndentedString(ticketZones)).append("\n");
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
