package io.swagger.model;

import io.swagger.model.V3BulkDeparturesRouteDirectionResponse;
import io.swagger.model.V3Departure;
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

public class V3BulkDeparturesUpdateResponse   {
  
  @Schema(description = "Timetabled and real-time service departures")
 /**
   * Timetabled and real-time service departures  
  **/
  private List<V3Departure> departures = null;
  
  @Schema(description = "Transport mode identifier")
 /**
   * Transport mode identifier  
  **/
  private Integer routeType = null;
  
  @Schema(description = "Stop identifier")
 /**
   * Stop identifier  
  **/
  private Integer stopId = null;
  
  @Schema(description = "")
  private V3BulkDeparturesRouteDirectionResponse requestedRouteDirection = null;
  public enum RouteDirectionStatusEnum {
    NUMBER_0(0),
    NUMBER_1(1);

    private Integer value;

    RouteDirectionStatusEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static RouteDirectionStatusEnum fromValue(String text) {
      for (RouteDirectionStatusEnum b : RouteDirectionStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied.")
 /**
   * The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied.  
  **/
  private RouteDirectionStatusEnum routeDirectionStatus = null;
  
  @Schema(description = "")
  private V3BulkDeparturesRouteDirectionResponse routeDirection = null;
 /**
   * Timetabled and real-time service departures
   * @return departures
  **/
  @JsonProperty("departures")
  public List<V3Departure> getDepartures() {
    return departures;
  }

  public void setDepartures(List<V3Departure> departures) {
    this.departures = departures;
  }

  public V3BulkDeparturesUpdateResponse departures(List<V3Departure> departures) {
    this.departures = departures;
    return this;
  }

  public V3BulkDeparturesUpdateResponse addDeparturesItem(V3Departure departuresItem) {
    this.departures.add(departuresItem);
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

  public V3BulkDeparturesUpdateResponse routeType(Integer routeType) {
    this.routeType = routeType;
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

  public V3BulkDeparturesUpdateResponse stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

 /**
   * Get requestedRouteDirection
   * @return requestedRouteDirection
  **/
  @JsonProperty("requested_route_direction")
  public V3BulkDeparturesRouteDirectionResponse getRequestedRouteDirection() {
    return requestedRouteDirection;
  }

  public void setRequestedRouteDirection(V3BulkDeparturesRouteDirectionResponse requestedRouteDirection) {
    this.requestedRouteDirection = requestedRouteDirection;
  }

  public V3BulkDeparturesUpdateResponse requestedRouteDirection(V3BulkDeparturesRouteDirectionResponse requestedRouteDirection) {
    this.requestedRouteDirection = requestedRouteDirection;
    return this;
  }

 /**
   * The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied.
   * @return routeDirectionStatus
  **/
  @JsonProperty("route_direction_status")
  public Integer getRouteDirectionStatus() {
    if (routeDirectionStatus == null) {
      return null;
    }
    return routeDirectionStatus.getValue();
  }

  public void setRouteDirectionStatus(RouteDirectionStatusEnum routeDirectionStatus) {
    this.routeDirectionStatus = routeDirectionStatus;
  }

  public V3BulkDeparturesUpdateResponse routeDirectionStatus(RouteDirectionStatusEnum routeDirectionStatus) {
    this.routeDirectionStatus = routeDirectionStatus;
    return this;
  }

 /**
   * Get routeDirection
   * @return routeDirection
  **/
  @JsonProperty("route_direction")
  public V3BulkDeparturesRouteDirectionResponse getRouteDirection() {
    return routeDirection;
  }

  public void setRouteDirection(V3BulkDeparturesRouteDirectionResponse routeDirection) {
    this.routeDirection = routeDirection;
  }

  public V3BulkDeparturesUpdateResponse routeDirection(V3BulkDeparturesRouteDirectionResponse routeDirection) {
    this.routeDirection = routeDirection;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3BulkDeparturesUpdateResponse {\n");
    
    sb.append("    departures: ").append(toIndentedString(departures)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    requestedRouteDirection: ").append(toIndentedString(requestedRouteDirection)).append("\n");
    sb.append("    routeDirectionStatus: ").append(toIndentedString(routeDirectionStatus)).append("\n");
    sb.append("    routeDirection: ").append(toIndentedString(routeDirection)).append("\n");
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
