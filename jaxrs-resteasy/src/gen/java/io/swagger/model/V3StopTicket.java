package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3StopTicket   {
  private String ticketType = null;  private String zone = null;  private Boolean isFreeFareZone = null;  private Boolean ticketMachine = null;  private Boolean ticketChecks = null;  private Boolean vlineReservation = null;  private List<Integer> ticketZones = new ArrayList<Integer>();

  /**
   * Indicates the ticket type for the stop (myki, paper or both)
   **/
  
  @Schema(description = "Indicates the ticket type for the stop (myki, paper or both)")
  @JsonProperty("ticket_type")
  public String getTicketType() {
    return ticketType;
  }
  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  /**
   * Description of the zone
   **/
  
  @Schema(description = "Description of the zone")
  @JsonProperty("zone")
  public String getZone() {
    return zone;
  }
  public void setZone(String zone) {
    this.zone = zone;
  }

  /**
   * Indicates whether the stop is inside the free fare zone
   **/
  
  @Schema(description = "Indicates whether the stop is inside the free fare zone")
  @JsonProperty("is_free_fare_zone")
  public Boolean isIsFreeFareZone() {
    return isFreeFareZone;
  }
  public void setIsFreeFareZone(Boolean isFreeFareZone) {
    this.isFreeFareZone = isFreeFareZone;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("ticket_machine")
  public Boolean isTicketMachine() {
    return ticketMachine;
  }
  public void setTicketMachine(Boolean ticketMachine) {
    this.ticketMachine = ticketMachine;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("ticket_checks")
  public Boolean isTicketChecks() {
    return ticketChecks;
  }
  public void setTicketChecks(Boolean ticketChecks) {
    this.ticketChecks = ticketChecks;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("vline_reservation")
  public Boolean isVlineReservation() {
    return vlineReservation;
  }
  public void setVlineReservation(Boolean vlineReservation) {
    this.vlineReservation = vlineReservation;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("ticket_zones")
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
    return Objects.equals(ticketType, v3StopTicket.ticketType) &&
        Objects.equals(zone, v3StopTicket.zone) &&
        Objects.equals(isFreeFareZone, v3StopTicket.isFreeFareZone) &&
        Objects.equals(ticketMachine, v3StopTicket.ticketMachine) &&
        Objects.equals(ticketChecks, v3StopTicket.ticketChecks) &&
        Objects.equals(vlineReservation, v3StopTicket.vlineReservation) &&
        Objects.equals(ticketZones, v3StopTicket.ticketZones);
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
