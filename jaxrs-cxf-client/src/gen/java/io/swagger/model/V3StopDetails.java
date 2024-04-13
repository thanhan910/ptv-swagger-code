package io.swagger.model;

import io.swagger.model.V3StopAccessibility;
import io.swagger.model.V3StopAmenityDetails;
import io.swagger.model.V3StopLocation;
import io.swagger.model.V3StopStaffing;
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

public class V3StopDetails   {
  
  @Schema(description = "Disruption information identifier(s)")
 /**
   * Disruption information identifier(s)  
  **/
  private List<Long> disruptionIds = null;
  
  @Schema(description = "Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train")
 /**
   * Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train  
  **/
  private String stationType = null;
  
  @Schema(description = "The definition applicable to the station_type; returns null for V/Line train")
 /**
   * The definition applicable to the station_type; returns null for V/Line train  
  **/
  private String stationDescription = null;
  
  @Schema(description = "Transport mode identifier")
 /**
   * Transport mode identifier  
  **/
  private Integer routeType = null;
  
  @Schema(description = "")
  private V3StopLocation stopLocation = null;
  
  @Schema(description = "")
  private V3StopAmenityDetails stopAmenities = null;
  
  @Schema(description = "")
  private V3StopAccessibility stopAccessibility = null;
  
  @Schema(description = "")
  private V3StopStaffing stopStaffing = null;
  
  @Schema(description = "Routes travelling through the stop")
 /**
   * Routes travelling through the stop  
  **/
  private List<Object> routes = null;
  
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

  public V3StopDetails disruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
    return this;
  }

  public V3StopDetails addDisruptionIdsItem(Long disruptionIdsItem) {
    this.disruptionIds.add(disruptionIdsItem);
    return this;
  }

 /**
   * Type of metropolitan train station (i.e. \&quot;Premium\&quot;, \&quot;Host\&quot; or \&quot;Unstaffed\&quot; station); returns null for V/Line train
   * @return stationType
  **/
  @JsonProperty("station_type")
  public String getStationType() {
    return stationType;
  }

  public void setStationType(String stationType) {
    this.stationType = stationType;
  }

  public V3StopDetails stationType(String stationType) {
    this.stationType = stationType;
    return this;
  }

 /**
   * The definition applicable to the station_type; returns null for V/Line train
   * @return stationDescription
  **/
  @JsonProperty("station_description")
  public String getStationDescription() {
    return stationDescription;
  }

  public void setStationDescription(String stationDescription) {
    this.stationDescription = stationDescription;
  }

  public V3StopDetails stationDescription(String stationDescription) {
    this.stationDescription = stationDescription;
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

  public V3StopDetails routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

 /**
   * Get stopLocation
   * @return stopLocation
  **/
  @JsonProperty("stop_location")
  public V3StopLocation getStopLocation() {
    return stopLocation;
  }

  public void setStopLocation(V3StopLocation stopLocation) {
    this.stopLocation = stopLocation;
  }

  public V3StopDetails stopLocation(V3StopLocation stopLocation) {
    this.stopLocation = stopLocation;
    return this;
  }

 /**
   * Get stopAmenities
   * @return stopAmenities
  **/
  @JsonProperty("stop_amenities")
  public V3StopAmenityDetails getStopAmenities() {
    return stopAmenities;
  }

  public void setStopAmenities(V3StopAmenityDetails stopAmenities) {
    this.stopAmenities = stopAmenities;
  }

  public V3StopDetails stopAmenities(V3StopAmenityDetails stopAmenities) {
    this.stopAmenities = stopAmenities;
    return this;
  }

 /**
   * Get stopAccessibility
   * @return stopAccessibility
  **/
  @JsonProperty("stop_accessibility")
  public V3StopAccessibility getStopAccessibility() {
    return stopAccessibility;
  }

  public void setStopAccessibility(V3StopAccessibility stopAccessibility) {
    this.stopAccessibility = stopAccessibility;
  }

  public V3StopDetails stopAccessibility(V3StopAccessibility stopAccessibility) {
    this.stopAccessibility = stopAccessibility;
    return this;
  }

 /**
   * Get stopStaffing
   * @return stopStaffing
  **/
  @JsonProperty("stop_staffing")
  public V3StopStaffing getStopStaffing() {
    return stopStaffing;
  }

  public void setStopStaffing(V3StopStaffing stopStaffing) {
    this.stopStaffing = stopStaffing;
  }

  public V3StopDetails stopStaffing(V3StopStaffing stopStaffing) {
    this.stopStaffing = stopStaffing;
    return this;
  }

 /**
   * Routes travelling through the stop
   * @return routes
  **/
  @JsonProperty("routes")
  public List<Object> getRoutes() {
    return routes;
  }

  public void setRoutes(List<Object> routes) {
    this.routes = routes;
  }

  public V3StopDetails routes(List<Object> routes) {
    this.routes = routes;
    return this;
  }

  public V3StopDetails addRoutesItem(Object routesItem) {
    this.routes.add(routesItem);
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

  public V3StopDetails stopId(Integer stopId) {
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

  public V3StopDetails stopName(String stopName) {
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

  public V3StopDetails stopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopDetails {\n");
    
    sb.append("    disruptionIds: ").append(toIndentedString(disruptionIds)).append("\n");
    sb.append("    stationType: ").append(toIndentedString(stationType)).append("\n");
    sb.append("    stationDescription: ").append(toIndentedString(stationDescription)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    stopLocation: ").append(toIndentedString(stopLocation)).append("\n");
    sb.append("    stopAmenities: ").append(toIndentedString(stopAmenities)).append("\n");
    sb.append("    stopAccessibility: ").append(toIndentedString(stopAccessibility)).append("\n");
    sb.append("    stopStaffing: ").append(toIndentedString(stopStaffing)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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
