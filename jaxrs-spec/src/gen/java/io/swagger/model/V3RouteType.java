package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3RouteType   {

  private @Valid String routeTypeName = null;

  private @Valid Integer routeType = null;

  /**
   * Name of transport mode
   **/
  public V3RouteType routeTypeName(String routeTypeName) {
    this.routeTypeName = routeTypeName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of transport mode")
  @JsonProperty("route_type_name")

  public String getRouteTypeName() {
    return routeTypeName;
  }
  public void setRouteTypeName(String routeTypeName) {
    this.routeTypeName = routeTypeName;
  }

  /**
   * Transport mode identifier
   **/
  public V3RouteType routeType(Integer routeType) {
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
    V3RouteType v3RouteType = (V3RouteType) o;
    return Objects.equals(routeTypeName, v3RouteType.routeTypeName) &&
        Objects.equals(routeType, v3RouteType.routeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeTypeName, routeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3RouteType {\n");
    
    sb.append("    routeTypeName: ").append(toIndentedString(routeTypeName)).append("\n");
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
