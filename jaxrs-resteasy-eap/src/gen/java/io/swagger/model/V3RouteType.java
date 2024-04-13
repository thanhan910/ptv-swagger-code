package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
public class V3RouteType   {
  private String routeTypeName = null;
  private Integer routeType = null;

  /**
   * Name of transport mode
   **/
  
  @Schema(description = "Name of transport mode")
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
  
  @Schema(description = "Transport mode identifier")
  @JsonProperty("route_type")
  public Integer getRouteType() {
    return routeType;
  }
  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
