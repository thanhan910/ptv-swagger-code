package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3StopDepartureRequestRouteDirection
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3StopDepartureRequestRouteDirection   {
  @JsonProperty("route_id")
  private String routeId = null;

  @JsonProperty("direction_id")
  private Integer directionId = null;

  @JsonProperty("direction_name")
  private String directionName = null;

  public V3StopDepartureRequestRouteDirection routeId(String routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * Identifier of route; values returned by Routes API - v3/routes
   * @return routeId
  **/
  @Schema(description = "Identifier of route; values returned by Routes API - v3/routes")

  public String getRouteId() {
    return routeId;
  }

  public void setRouteId(String routeId) {
    this.routeId = routeId;
  }

  public V3StopDepartureRequestRouteDirection directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

  /**
   * Direction of travel identifier; values returned by Directions API - v3/directions
   * minimum: 0
   * maximum: 2147483647
   * @return directionId
  **/
  @Schema(description = "Direction of travel identifier; values returned by Directions API - v3/directions")

@Min(0) @Max(2147483647)   public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  public V3StopDepartureRequestRouteDirection directionName(String directionName) {
    this.directionName = directionName;
    return this;
  }

  /**
   * Name of direction of travel; values returned by Directions API - v3/directions
   * @return directionName
  **/
  @Schema(required = true, description = "Name of direction of travel; values returned by Directions API - v3/directions")
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
    return Objects.equals(this.routeId, v3StopDepartureRequestRouteDirection.routeId) &&
        Objects.equals(this.directionId, v3StopDepartureRequestRouteDirection.directionId) &&
        Objects.equals(this.directionName, v3StopDepartureRequestRouteDirection.directionName);
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
