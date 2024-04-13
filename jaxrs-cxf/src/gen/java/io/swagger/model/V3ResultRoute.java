package io.swagger.model;

import io.swagger.model.V3RouteServiceStatus;
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

public class V3ResultRoute   {
  
  @Schema(description = "Name of route")
 /**
   * Name of route  
  **/
  private String routeName = null;
  
  @Schema(description = "Route number presented to public (nb. not route_id)")
 /**
   * Route number presented to public (nb. not route_id)  
  **/
  private String routeNumber = null;
  
  @Schema(description = "Transport mode identifier")
 /**
   * Transport mode identifier  
  **/
  private Integer routeType = null;
  
  @Schema(description = "Route identifier")
 /**
   * Route identifier  
  **/
  private Integer routeId = null;
  
  @Schema(description = "GTFS Identifer of the route")
 /**
   * GTFS Identifer of the route  
  **/
  private String routeGtfsId = null;
  
  @Schema(description = "")
  private V3RouteServiceStatus routeServiceStatus = null;
 /**
   * Name of route
   * @return routeName
  **/
  @JsonProperty("route_name")
  public String getRouteName() {
    return routeName;
  }

  public void setRouteName(String routeName) {
    this.routeName = routeName;
  }

  public V3ResultRoute routeName(String routeName) {
    this.routeName = routeName;
    return this;
  }

 /**
   * Route number presented to public (nb. not route_id)
   * @return routeNumber
  **/
  @JsonProperty("route_number")
  public String getRouteNumber() {
    return routeNumber;
  }

  public void setRouteNumber(String routeNumber) {
    this.routeNumber = routeNumber;
  }

  public V3ResultRoute routeNumber(String routeNumber) {
    this.routeNumber = routeNumber;
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

  public V3ResultRoute routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

 /**
   * Route identifier
   * @return routeId
  **/
  @JsonProperty("route_id")
  public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public V3ResultRoute routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

 /**
   * GTFS Identifer of the route
   * @return routeGtfsId
  **/
  @JsonProperty("route_gtfs_id")
  public String getRouteGtfsId() {
    return routeGtfsId;
  }

  public void setRouteGtfsId(String routeGtfsId) {
    this.routeGtfsId = routeGtfsId;
  }

  public V3ResultRoute routeGtfsId(String routeGtfsId) {
    this.routeGtfsId = routeGtfsId;
    return this;
  }

 /**
   * Get routeServiceStatus
   * @return routeServiceStatus
  **/
  @JsonProperty("route_service_status")
  public V3RouteServiceStatus getRouteServiceStatus() {
    return routeServiceStatus;
  }

  public void setRouteServiceStatus(V3RouteServiceStatus routeServiceStatus) {
    this.routeServiceStatus = routeServiceStatus;
  }

  public V3ResultRoute routeServiceStatus(V3RouteServiceStatus routeServiceStatus) {
    this.routeServiceStatus = routeServiceStatus;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3ResultRoute {\n");
    
    sb.append("    routeName: ").append(toIndentedString(routeName)).append("\n");
    sb.append("    routeNumber: ").append(toIndentedString(routeNumber)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    routeGtfsId: ").append(toIndentedString(routeGtfsId)).append("\n");
    sb.append("    routeServiceStatus: ").append(toIndentedString(routeServiceStatus)).append("\n");
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
