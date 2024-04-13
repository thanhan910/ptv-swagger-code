package io.swagger.model;

import java.util.ArrayList;
import java.util.List;

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

public class V3StopTicket   {
  
  @Schema(description = "Indicates the ticket type for the stop (myki, paper or both)")
 /**
   * Indicates the ticket type for the stop (myki, paper or both)  
  **/
  private String ticketType = null;
  
  @Schema(description = "Description of the zone")
 /**
   * Description of the zone  
  **/
  private String zone = null;
  
  @Schema(description = "Indicates whether the stop is inside the free fare zone")
 /**
   * Indicates whether the stop is inside the free fare zone  
  **/
  private Boolean isFreeFareZone = null;
  
  @Schema(description = "")
  private Boolean ticketMachine = null;
  
  @Schema(description = "")
  private Boolean ticketChecks = null;
  
  @Schema(description = "")
  private Boolean vlineReservation = null;
  
  @Schema(description = "")
  private List<Integer> ticketZones = null;
 /**
   * Indicates the ticket type for the stop (myki, paper or both)
   * @return ticketType
  **/
  @JsonProperty("ticket_type")
  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public V3StopTicket ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

 /**
   * Description of the zone
   * @return zone
  **/
  @JsonProperty("zone")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public V3StopTicket zone(String zone) {
    this.zone = zone;
    return this;
  }

 /**
   * Indicates whether the stop is inside the free fare zone
   * @return isFreeFareZone
  **/
  @JsonProperty("is_free_fare_zone")
  public Boolean isIsFreeFareZone() {
    return isFreeFareZone;
  }

  public void setIsFreeFareZone(Boolean isFreeFareZone) {
    this.isFreeFareZone = isFreeFareZone;
  }

  public V3StopTicket isFreeFareZone(Boolean isFreeFareZone) {
    this.isFreeFareZone = isFreeFareZone;
    return this;
  }

 /**
   * Get ticketMachine
   * @return ticketMachine
  **/
  @JsonProperty("ticket_machine")
  public Boolean isTicketMachine() {
    return ticketMachine;
  }

  public void setTicketMachine(Boolean ticketMachine) {
    this.ticketMachine = ticketMachine;
  }

  public V3StopTicket ticketMachine(Boolean ticketMachine) {
    this.ticketMachine = ticketMachine;
    return this;
  }

 /**
   * Get ticketChecks
   * @return ticketChecks
  **/
  @JsonProperty("ticket_checks")
  public Boolean isTicketChecks() {
    return ticketChecks;
  }

  public void setTicketChecks(Boolean ticketChecks) {
    this.ticketChecks = ticketChecks;
  }

  public V3StopTicket ticketChecks(Boolean ticketChecks) {
    this.ticketChecks = ticketChecks;
    return this;
  }

 /**
   * Get vlineReservation
   * @return vlineReservation
  **/
  @JsonProperty("vline_reservation")
  public Boolean isVlineReservation() {
    return vlineReservation;
  }

  public void setVlineReservation(Boolean vlineReservation) {
    this.vlineReservation = vlineReservation;
  }

  public V3StopTicket vlineReservation(Boolean vlineReservation) {
    this.vlineReservation = vlineReservation;
    return this;
  }

 /**
   * Get ticketZones
   * @return ticketZones
  **/
  @JsonProperty("ticket_zones")
  public List<Integer> getTicketZones() {
    return ticketZones;
  }

  public void setTicketZones(List<Integer> ticketZones) {
    this.ticketZones = ticketZones;
  }

  public V3StopTicket ticketZones(List<Integer> ticketZones) {
    this.ticketZones = ticketZones;
    return this;
  }

  public V3StopTicket addTicketZonesItem(Integer ticketZonesItem) {
    this.ticketZones.add(ticketZonesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
