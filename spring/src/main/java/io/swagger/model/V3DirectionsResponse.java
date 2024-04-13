package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3DirectionWithDescription;
import io.swagger.model.V3Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3DirectionsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3DirectionsResponse   {
  @JsonProperty("directions")
  @Valid
  private List<V3DirectionWithDescription> directions = null;

  @JsonProperty("status")
  private V3Status status = null;

  public V3DirectionsResponse directions(List<V3DirectionWithDescription> directions) {
    this.directions = directions;
    return this;
  }

  public V3DirectionsResponse addDirectionsItem(V3DirectionWithDescription directionsItem) {
    if (this.directions == null) {
      this.directions = new ArrayList<V3DirectionWithDescription>();
    }
    this.directions.add(directionsItem);
    return this;
  }

  /**
   * Directions of travel of route
   * @return directions
   **/
  @Schema(description = "Directions of travel of route")
      @Valid
    public List<V3DirectionWithDescription> getDirections() {
    return directions;
  }

  public void setDirections(List<V3DirectionWithDescription> directions) {
    this.directions = directions;
  }

  public V3DirectionsResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
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
    return Objects.equals(this.directions, v3DirectionsResponse.directions) &&
        Objects.equals(this.status, v3DirectionsResponse.status);
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
