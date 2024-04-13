package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3Direction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3Direction   {
  @JsonProperty("direction_id")
  private Integer directionId = null;

  @JsonProperty("direction_name")
  private String directionName = null;

  @JsonProperty("route_id")
  private Integer routeId = null;

  @JsonProperty("route_type")
  private Integer routeType = null;

  public V3Direction directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

  /**
   * Direction of travel identifier
   * @return directionId
   **/
  @Schema(description = "Direction of travel identifier")
  
    public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  public V3Direction directionName(String directionName) {
    this.directionName = directionName;
    return this;
  }

  /**
   * Name of direction of travel
   * @return directionName
   **/
  @Schema(description = "Name of direction of travel")
  
    public String getDirectionName() {
    return directionName;
  }

  public void setDirectionName(String directionName) {
    this.directionName = directionName;
  }

  public V3Direction routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * Route identifier
   * @return routeId
   **/
  @Schema(description = "Route identifier")
  
    public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public V3Direction routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

  /**
   * Transport mode identifier
   * @return routeType
   **/
  @Schema(description = "Transport mode identifier")
  
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
    return Objects.equals(this.directionId, v3Direction.directionId) &&
        Objects.equals(this.directionName, v3Direction.directionName) &&
        Objects.equals(this.routeId, v3Direction.routeId) &&
        Objects.equals(this.routeType, v3Direction.routeType);
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
