package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3DirectionWithDescription;
import io.swagger.model.V3Status;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3DirectionsResponse   {
  private List<V3DirectionWithDescription> directions = new ArrayList<V3DirectionWithDescription>();  private V3Status status = null;

  /**
   * Directions of travel of route
   **/
  
  @Schema(description = "Directions of travel of route")
  @JsonProperty("directions")
  public List<V3DirectionWithDescription> getDirections() {
    return directions;
  }
  public void setDirections(List<V3DirectionWithDescription> directions) {
    this.directions = directions;
  }

  /**
   **/
  
  @Schema(description = "")
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
    V3DirectionsResponse v3DirectionsResponse = (V3DirectionsResponse) o;
    return Objects.equals(directions, v3DirectionsResponse.directions) &&
        Objects.equals(status, v3DirectionsResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directions, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DirectionsResponse {\n");
    
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
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
