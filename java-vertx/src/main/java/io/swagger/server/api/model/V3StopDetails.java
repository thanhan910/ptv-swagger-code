package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3StopAccessibility;
import io.swagger.server.api.model.V3StopAmenityDetails;
import io.swagger.server.api.model.V3StopLocation;
import io.swagger.server.api.model.V3StopStaffing;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3StopDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3StopDetails   {
  
  private List<Long> disruptionIds = null;

  private String stationType = null;

  private String stationDescription = null;

  private Integer routeType = null;

  private V3StopLocation stopLocation = null;

  private V3StopAmenityDetails stopAmenities = null;

  private V3StopAccessibility stopAccessibility = null;

  private V3StopStaffing stopStaffing = null;

  
  private List<Object> routes = null;

  private Integer stopId = null;

  private String stopName = null;

  private String stopLandmark = null;

  public V3StopDetails disruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
    return this;
  }

  public V3StopDetails addDisruptionIdsItem(Long disruptionIdsItem) {
    if (this.disruptionIds == null) {
      this.disruptionIds = new ArrayList<Long>();
    }
    this.disruptionIds.add(disruptionIdsItem);
    return this;
  }

  /**
   * Disruption information identifier(s)
   * @return disruptionIds
   **/
    public List<Long> getDisruptionIds() {
    return disruptionIds;
  }

  public void setDisruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
  }

  public V3StopDetails stationType(String stationType) {
    this.stationType = stationType;
    return this;
  }

  /**
   * Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train
   * @return stationType
   **/
    public String getStationType() {
    return stationType;
  }

  public void setStationType(String stationType) {
    this.stationType = stationType;
  }

  public V3StopDetails stationDescription(String stationDescription) {
    this.stationDescription = stationDescription;
    return this;
  }

  /**
   * The definition applicable to the station_type; returns null for V/Line train
   * @return stationDescription
   **/
    public String getStationDescription() {
    return stationDescription;
  }

  public void setStationDescription(String stationDescription) {
    this.stationDescription = stationDescription;
  }

  public V3StopDetails routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

  /**
   * Transport mode identifier
   * @return routeType
   **/
    public Integer getRouteType() {
    return routeType;
  }

  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  public V3StopDetails stopLocation(V3StopLocation stopLocation) {
    this.stopLocation = stopLocation;
    return this;
  }

  /**
   * Get stopLocation
   * @return stopLocation
   **/
    public V3StopLocation getStopLocation() {
    return stopLocation;
  }

  public void setStopLocation(V3StopLocation stopLocation) {
    this.stopLocation = stopLocation;
  }

  public V3StopDetails stopAmenities(V3StopAmenityDetails stopAmenities) {
    this.stopAmenities = stopAmenities;
    return this;
  }

  /**
   * Get stopAmenities
   * @return stopAmenities
   **/
    public V3StopAmenityDetails getStopAmenities() {
    return stopAmenities;
  }

  public void setStopAmenities(V3StopAmenityDetails stopAmenities) {
    this.stopAmenities = stopAmenities;
  }

  public V3StopDetails stopAccessibility(V3StopAccessibility stopAccessibility) {
    this.stopAccessibility = stopAccessibility;
    return this;
  }

  /**
   * Get stopAccessibility
   * @return stopAccessibility
   **/
    public V3StopAccessibility getStopAccessibility() {
    return stopAccessibility;
  }

  public void setStopAccessibility(V3StopAccessibility stopAccessibility) {
    this.stopAccessibility = stopAccessibility;
  }

  public V3StopDetails stopStaffing(V3StopStaffing stopStaffing) {
    this.stopStaffing = stopStaffing;
    return this;
  }

  /**
   * Get stopStaffing
   * @return stopStaffing
   **/
    public V3StopStaffing getStopStaffing() {
    return stopStaffing;
  }

  public void setStopStaffing(V3StopStaffing stopStaffing) {
    this.stopStaffing = stopStaffing;
  }

  public V3StopDetails routes(List<Object> routes) {
    this.routes = routes;
    return this;
  }

  public V3StopDetails addRoutesItem(Object routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<Object>();
    }
    this.routes.add(routesItem);
    return this;
  }

  /**
   * Routes travelling through the stop
   * @return routes
   **/
    public List<Object> getRoutes() {
    return routes;
  }

  public void setRoutes(List<Object> routes) {
    this.routes = routes;
  }

  public V3StopDetails stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

  /**
   * Stop identifier
   * @return stopId
   **/
    public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  public V3StopDetails stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

  /**
   * Name of stop
   * @return stopName
   **/
    public String getStopName() {
    return stopName;
  }

  public void setStopName(String stopName) {
    this.stopName = stopName;
  }

  public V3StopDetails stopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
    return this;
  }

  /**
   * Landmark in proximity of stop
   * @return stopLandmark
   **/
    public String getStopLandmark() {
    return stopLandmark;
  }

  public void setStopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopDetails v3StopDetails = (V3StopDetails) o;
    return Objects.equals(this.disruptionIds, v3StopDetails.disruptionIds) &&
        Objects.equals(this.stationType, v3StopDetails.stationType) &&
        Objects.equals(this.stationDescription, v3StopDetails.stationDescription) &&
        Objects.equals(this.routeType, v3StopDetails.routeType) &&
        Objects.equals(this.stopLocation, v3StopDetails.stopLocation) &&
        Objects.equals(this.stopAmenities, v3StopDetails.stopAmenities) &&
        Objects.equals(this.stopAccessibility, v3StopDetails.stopAccessibility) &&
        Objects.equals(this.stopStaffing, v3StopDetails.stopStaffing) &&
        Objects.equals(this.routes, v3StopDetails.routes) &&
        Objects.equals(this.stopId, v3StopDetails.stopId) &&
        Objects.equals(this.stopName, v3StopDetails.stopName) &&
        Objects.equals(this.stopLandmark, v3StopDetails.stopLandmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptionIds, stationType, stationDescription, routeType, stopLocation, stopAmenities, stopAccessibility, stopStaffing, routes, stopId, stopName, stopLandmark);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
