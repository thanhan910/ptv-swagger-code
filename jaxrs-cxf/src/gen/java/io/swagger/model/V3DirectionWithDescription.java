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

public class V3DirectionWithDescription   {
  
  @Schema(description = "")
  private String routeDirectionDescription = null;
  
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
  
  @Schema(description = "Route identifier")
 /**
   * Route identifier  
  **/
  private Integer routeId = null;
  
  @Schema(description = "Transport mode identifier")
 /**
   * Transport mode identifier  
  **/
  private Integer routeType = null;
 /**
   * Get routeDirectionDescription
   * @return routeDirectionDescription
  **/
  @JsonProperty("route_direction_description")
  public String getRouteDirectionDescription() {
    return routeDirectionDescription;
  }

  public void setRouteDirectionDescription(String routeDirectionDescription) {
    this.routeDirectionDescription = routeDirectionDescription;
  }

  public V3DirectionWithDescription routeDirectionDescription(String routeDirectionDescription) {
    this.routeDirectionDescription = routeDirectionDescription;
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

  public V3DirectionWithDescription directionId(Integer directionId) {
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

  public V3DirectionWithDescription directionName(String directionName) {
    this.directionName = directionName;
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

  public V3DirectionWithDescription routeId(Integer routeId) {
    this.routeId = routeId;
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

  public V3DirectionWithDescription routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DirectionWithDescription {\n");
    
    sb.append("    routeDirectionDescription: ").append(toIndentedString(routeDirectionDescription)).append("\n");
    sb.append("    directionId: ").append(toIndentedString(directionId)).append("\n");
    sb.append("    directionName: ").append(toIndentedString(directionName)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
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
