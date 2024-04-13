package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3DirectionWithDescription   {
  private String routeDirectionDescription = null;  private Integer directionId = null;  private String directionName = null;  private Integer routeId = null;  private Integer routeType = null;

  /**
   **/
  
  @Schema(description = "")
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
  
  @Schema(description = "Direction of travel identifier")
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
  
  @Schema(description = "Name of direction of travel")
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
  
  @Schema(description = "Route identifier")
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
  
  @Schema(description = "Transport mode identifier")
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
