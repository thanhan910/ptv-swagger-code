package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3Direction   {

  private @Valid Integer directionId = null;

  private @Valid String directionName = null;

  private @Valid Integer routeId = null;

  private @Valid Integer routeType = null;

  /**
   * Direction of travel identifier
   **/
  public V3Direction directionId(Integer directionId) {
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
  public V3Direction directionName(String directionName) {
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
  public V3Direction routeId(Integer routeId) {
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
  public V3Direction routeType(Integer routeType) {
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
    V3Direction v3Direction = (V3Direction) o;
    return Objects.equals(directionId, v3Direction.directionId) &&
        Objects.equals(directionName, v3Direction.directionName) &&
        Objects.equals(routeId, v3Direction.routeId) &&
        Objects.equals(routeType, v3Direction.routeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directionId, directionName, routeId, routeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3Direction {\n");
    
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
