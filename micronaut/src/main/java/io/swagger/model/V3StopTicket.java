package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3StopTicket
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3StopTicket   {
  @JsonProperty("ticket_type")
  private String ticketType = null;

  @JsonProperty("zone")
  private String zone = null;

  @JsonProperty("is_free_fare_zone")
  private Boolean isFreeFareZone = null;

  @JsonProperty("ticket_machine")
  private Boolean ticketMachine = null;

  @JsonProperty("ticket_checks")
  private Boolean ticketChecks = null;

  @JsonProperty("vline_reservation")
  private Boolean vlineReservation = null;

  @JsonProperty("ticket_zones")
  @Valid
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
