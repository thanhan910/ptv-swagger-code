package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3StopDepartureRequestRouteDirection   {
  private String routeId = null;
  private Integer directionId = null;
  private String directionName = null;

  /**
   * Identifier of route; values returned by Routes API - v3/routes
   **/
  public V3StopDepartureRequestRouteDirection routeId(String routeId) {
    this.routeId = routeId;
    return this;
  }

  
  
  @Schema(description = "Identifier of route; values returned by Routes API - v3/routes")
  @JsonProperty("route_id")
  public String getRouteId() {
    return routeId;
  }
  public void setRouteId(String routeId) {
    this.routeId = routeId;
  }

  /**
   * Direction of travel identifier; values returned by Directions API - v3/directions
   * minimum: 0
   * maximum: 2147483647
   **/
  public V3StopDepartureRequestRouteDirection directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

  
  
  @Schema(description = "Direction of travel identifier; values returned by Directions API - v3/directions")
  @JsonProperty("direction_id")
 @Min(0) @Max(2147483647)  public Integer getDirectionId() {
    return directionId;
  }
  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  /**
   * Name of direction of travel; values returned by Directions API - v3/directions
   **/
  public V3StopDepartureRequestRouteDirection directionName(String directionName) {
    this.directionName = directionName;
    return this;
  }

  
  
  @Schema(required = true, description = "Name of direction of travel; values returned by Directions API - v3/directions")
  @JsonProperty("direction_name")
  @NotNull
  public String getDirectionName() {
    return directionName;
  }
  public void setDirectionName(String directionName) {
    this.directionName = directionName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopDepartureRequestRouteDirection v3StopDepartureRequestRouteDirection = (V3StopDepartureRequestRouteDirection) o;
    return Objects.equals(routeId, v3StopDepartureRequestRouteDirection.routeId) &&
        Objects.equals(directionId, v3StopDepartureRequestRouteDirection.directionId) &&
        Objects.equals(directionName, v3StopDepartureRequestRouteDirection.directionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeId, directionId, directionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopDepartureRequestRouteDirection {\n");
    
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    directionId: ").append(toIndentedString(directionId)).append("\n");
    sb.append("    directionName: ").append(toIndentedString(directionName)).append("\n");
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
