package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3BulkDeparturesRouteDirectionResponse   {

  private @Valid String routeId = null;

  private @Valid Integer directionId = null;

  private @Valid String directionName = null;

  /**
   * Route identifier
   **/
  public V3BulkDeparturesRouteDirectionResponse routeId(String routeId) {
    this.routeId = routeId;
    return this;
  }

  
  @ApiModelProperty(value = "Route identifier")
  @JsonProperty("route_id")

  public String getRouteId() {
    return routeId;
  }
  public void setRouteId(String routeId) {
    this.routeId = routeId;
  }

  /**
   * Direction of travel identifier
   **/
  public V3BulkDeparturesRouteDirectionResponse directionId(Integer directionId) {
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
  public V3BulkDeparturesRouteDirectionResponse directionName(String directionName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3BulkDeparturesRouteDirectionResponse v3BulkDeparturesRouteDirectionResponse = (V3BulkDeparturesRouteDirectionResponse) o;
    return Objects.equals(routeId, v3BulkDeparturesRouteDirectionResponse.routeId) &&
        Objects.equals(directionId, v3BulkDeparturesRouteDirectionResponse.directionId) &&
        Objects.equals(directionName, v3BulkDeparturesRouteDirectionResponse.directionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeId, directionId, directionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3BulkDeparturesRouteDirectionResponse {\n");
    
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
