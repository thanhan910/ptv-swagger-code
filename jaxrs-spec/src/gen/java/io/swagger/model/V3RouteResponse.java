package io.swagger.model;

import io.swagger.model.V3RouteWithStatus;
import io.swagger.model.V3Status;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3RouteResponse   {

  private @Valid V3RouteWithStatus route = null;

  private @Valid V3Status status = null;

  /**
   **/
  public V3RouteResponse route(V3RouteWithStatus route) {
    this.route = route;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("route")

  public V3RouteWithStatus getRoute() {
    return route;
  }
  public void setRoute(V3RouteWithStatus route) {
    this.route = route;
  }

  /**
   **/
  public V3RouteResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")

  public V3Status getStatus() {
    return status;
  }
  public void setStatus(V3Status status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3RouteResponse v3RouteResponse = (V3RouteResponse) o;
    return Objects.equals(route, v3RouteResponse.route) &&
        Objects.equals(status, v3RouteResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(route, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3RouteResponse {\n");
    
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
