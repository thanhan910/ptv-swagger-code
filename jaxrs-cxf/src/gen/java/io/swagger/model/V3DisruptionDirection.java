package io.swagger.model;

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

public class V3DisruptionDirection   {
  
  @Schema(description = "Route and direction of travel combination identifier")
 /**
   * Route and direction of travel combination identifier  
  **/
  private Integer routeDirectionId = null;
  
  @Schema(description = "Direction of travel identifier")
 /**
   * Direction of travel identifier  
  **/
  private Integer directionId = null;
  
  @Schema(description = "Name of direction of travel")
 /**
   * Name of direction of travel  
  **/
  private String directionName = null;
  
  @Schema(description = "Time of service to which disruption applies, in 24 hour clock format (HH:MM:SS) AEDT/AEST; returns null if disruption applies to multiple (or no) services")
 /**
   * Time of service to which disruption applies, in 24 hour clock format (HH:MM:SS) AEDT/AEST; returns null if disruption applies to multiple (or no) services  
  **/
  private String serviceTime = null;
 /**
   * Route and direction of travel combination identifier
   * @return routeDirectionId
  **/
  @JsonProperty("route_direction_id")
  public Integer getRouteDirectionId() {
    return routeDirectionId;
  }

  public void setRouteDirectionId(Integer routeDirectionId) {
    this.routeDirectionId = routeDirectionId;
  }

  public V3DisruptionDirection routeDirectionId(Integer routeDirectionId) {
    this.routeDirectionId = routeDirectionId;
    return this;
  }

 /**
   * Direction of travel identifier
   * @return directionId
  **/
  @JsonProperty("direction_id")
  public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  public V3DisruptionDirection directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

 /**
   * Name of direction of travel
   * @return directionName
  **/
  @JsonProperty("direction_name")
  public String getDirectionName() {
    return directionName;
  }

  public void setDirectionName(String directionName) {
    this.directionName = directionName;
  }

  public V3DisruptionDirection directionName(String directionName) {
    this.directionName = directionName;
    return this;
  }

 /**
   * Time of service to which disruption applies, in 24 hour clock format (HH:MM:SS) AEDT/AEST; returns null if disruption applies to multiple (or no) services
   * @return serviceTime
  **/
  @JsonProperty("service_time")
  public String getServiceTime() {
    return serviceTime;
  }

  public void setServiceTime(String serviceTime) {
    this.serviceTime = serviceTime;
  }

  public V3DisruptionDirection serviceTime(String serviceTime) {
    this.serviceTime = serviceTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DisruptionDirection {\n");
    
    sb.append("    routeDirectionId: ").append(toIndentedString(routeDirectionId)).append("\n");
    sb.append("    directionId: ").append(toIndentedString(directionId)).append("\n");
    sb.append("    directionName: ").append(toIndentedString(directionName)).append("\n");
    sb.append("    serviceTime: ").append(toIndentedString(serviceTime)).append("\n");
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
