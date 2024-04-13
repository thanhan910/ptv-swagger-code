package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3DirectionWithDescription   {

  private @Valid String routeDirectionDescription = null;

  private @Valid Integer directionId = null;

  private @Valid String directionName = null;

  private @Valid Integer routeId = null;

  private @Valid Integer routeType = null;

  /**
   **/
  public V3DirectionWithDescription routeDirectionDescription(String routeDirectionDescription) {
    this.routeDirectionDescription = routeDirectionDescription;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("route_direction_description")

  public String getRouteDirectionDescription() {
    return routeDirectionDescription;
  }
  public void setRouteDirectionDescription(String routeDirectionDescription) {
    this.routeDirectionDescription = routeDirectionDescription;
  }

  /**
   * Direction of travel identifier
   **/
  public V3DirectionWithDescription directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

  
  @ApiModelProperty(value = "Direction of travel identifier")
  @JsonProperty("direction_id")

  public Integer getDirectionId() {
    return directionId;
  }
  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  /**
   * Name of direction of travel
   **/
  public V3DirectionWithDescription directionName(String directionName) {
    this.directionName = directionName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of direction of travel")
  @JsonProperty("direction_name")

  public String getDirectionName() {
    return directionName;
  }
  public void setDirectionName(String directionName) {
    this.directionName = directionName;
  }

  /**
   * Route identifier
   **/
  public V3DirectionWithDescription routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

  
  @ApiModelProperty(value = "Route identifier")
  @JsonProperty("route_id")

  public Integer getRouteId() {
    return routeId;
  }
  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  /**
   * Transport mode identifier
   **/
  public V3DirectionWithDescription routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

  
  @ApiModelProperty(value = "Transport mode identifier")
  @JsonProperty("route_type")

  public Integer getRouteType() {
    return routeType;
  }
  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DirectionWithDescription v3DirectionWithDescription = (V3DirectionWithDescription) o;
    return Objects.equals(routeDirectionDescription, v3DirectionWithDescription.routeDirectionDescription) &&
        Objects.equals(directionId, v3DirectionWithDescription.directionId) &&
        Objects.equals(directionName, v3DirectionWithDescription.directionName) &&
        Objects.equals(routeId, v3DirectionWithDescription.routeId) &&
        Objects.equals(routeType, v3DirectionWithDescription.routeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeDirectionDescription, directionId, directionName, routeId, routeType);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
