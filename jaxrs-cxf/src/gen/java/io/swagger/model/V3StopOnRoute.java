package io.swagger.model;

import io.swagger.model.V3StopTicket;
import java.util.ArrayList;
import java.util.List;
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

public class V3StopOnRoute   {
  
  @Schema(description = "Disruption information identifier(s)")
 /**
   * Disruption information identifier(s)  
  **/
  private List<Long> disruptionIds = null;
  
  @Schema(description = "suburb of stop")
 /**
   * suburb of stop  
  **/
  private String stopSuburb = null;
  
  @Schema(description = "Transport mode identifier")
 /**
   * Transport mode identifier  
  **/
  private Integer routeType = null;
  
  @Schema(description = "Geographic coordinate of latitude at stop")
 /**
   * Geographic coordinate of latitude at stop  
  **/
  private Float stopLatitude = null;
  
  @Schema(description = "Geographic coordinate of longitude at stop")
 /**
   * Geographic coordinate of longitude at stop  
  **/
  private Float stopLongitude = null;
  
  @Schema(description = "Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.")
 /**
   * Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.  
  **/
  private Integer stopSequence = null;
  
  @Schema(description = "")
  private V3StopTicket stopTicket = null;
  
  @Schema(description = "Stop identifier")
 /**
   * Stop identifier  
  **/
  private Integer stopId = null;
  
  @Schema(description = "Name of stop")
 /**
   * Name of stop  
  **/
  private String stopName = null;
  
  @Schema(description = "Landmark in proximity of stop")
 /**
   * Landmark in proximity of stop  
  **/
  private String stopLandmark = null;
 /**
   * Disruption information identifier(s)
   * @return disruptionIds
  **/
  @JsonProperty("disruption_ids")
  public List<Long> getDisruptionIds() {
    return disruptionIds;
  }

  public void setDisruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
  }

  public V3StopOnRoute disruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
    return this;
  }

  public V3StopOnRoute addDisruptionIdsItem(Long disruptionIdsItem) {
    this.disruptionIds.add(disruptionIdsItem);
    return this;
  }

 /**
   * suburb of stop
   * @return stopSuburb
  **/
  @JsonProperty("stop_suburb")
  public String getStopSuburb() {
    return stopSuburb;
  }

  public void setStopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
  }

  public V3StopOnRoute stopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
    return this;
  }

 /**
   * Transport mode identifier
   * @return routeType
  **/
  @JsonProperty("route_type")
  public Integer getRouteType() {
    return routeType;
  }

  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  public V3StopOnRoute routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

 /**
   * Geographic coordinate of latitude at stop
   * @return stopLatitude
  **/
  @JsonProperty("stop_latitude")
  public Float getStopLatitude() {
    return stopLatitude;
  }

  public void setStopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
  }

  public V3StopOnRoute stopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
    return this;
  }

 /**
   * Geographic coordinate of longitude at stop
   * @return stopLongitude
  **/
  @JsonProperty("stop_longitude")
  public Float getStopLongitude() {
    return stopLongitude;
  }

  public void setStopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
  }

  public V3StopOnRoute stopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
    return this;
  }

 /**
   * Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
   * @return stopSequence
  **/
  @JsonProperty("stop_sequence")
  public Integer getStopSequence() {
    return stopSequence;
  }

  public void setStopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
  }

  public V3StopOnRoute stopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
    return this;
  }

 /**
   * Get stopTicket
   * @return stopTicket
  **/
  @JsonProperty("stop_ticket")
  public V3StopTicket getStopTicket() {
    return stopTicket;
  }

  public void setStopTicket(V3StopTicket stopTicket) {
    this.stopTicket = stopTicket;
  }

  public V3StopOnRoute stopTicket(V3StopTicket stopTicket) {
    this.stopTicket = stopTicket;
    return this;
  }

 /**
   * Stop identifier
   * @return stopId
  **/
  @JsonProperty("stop_id")
  public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  public V3StopOnRoute stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

 /**
   * Name of stop
   * @return stopName
  **/
  @JsonProperty("stop_name")
  public String getStopName() {
    return stopName;
  }

  public void setStopName(String stopName) {
    this.stopName = stopName;
  }

  public V3StopOnRoute stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

 /**
   * Landmark in proximity of stop
   * @return stopLandmark
  **/
  @JsonProperty("stop_landmark")
  public String getStopLandmark() {
    return stopLandmark;
  }

  public void setStopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
  }

  public V3StopOnRoute stopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopOnRoute {\n");
    
    sb.append("    disruptionIds: ").append(toIndentedString(disruptionIds)).append("\n");
    sb.append("    stopSuburb: ").append(toIndentedString(stopSuburb)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    stopLatitude: ").append(toIndentedString(stopLatitude)).append("\n");
    sb.append("    stopLongitude: ").append(toIndentedString(stopLongitude)).append("\n");
    sb.append("    stopSequence: ").append(toIndentedString(stopSequence)).append("\n");
    sb.append("    stopTicket: ").append(toIndentedString(stopTicket)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    stopName: ").append(toIndentedString(stopName)).append("\n");
    sb.append("    stopLandmark: ").append(toIndentedString(stopLandmark)).append("\n");
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
