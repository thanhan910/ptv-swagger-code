package io.swagger.model;

import io.swagger.model.V3DirectionWithDescription;
import io.swagger.model.V3Status;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class V3DirectionsResponse   {
  
  @Schema(description = "Directions of travel of route")
 /**
   * Directions of travel of route  
  **/
  private List<V3DirectionWithDescription> directions = null;
  
  @Schema(description = "")
  private V3Status status = null;
 /**
   * Directions of travel of route
   * @return directions
  **/
  @JsonProperty("directions")
  public List<V3DirectionWithDescription> getDirections() {
    return directions;
  }

  public void setDirections(List<V3DirectionWithDescription> directions) {
    this.directions = directions;
  }

  public V3DirectionsResponse directions(List<V3DirectionWithDescription> directions) {
    this.directions = directions;
    return this;
  }

  public V3DirectionsResponse addDirectionsItem(V3DirectionWithDescription directionsItem) {
    this.directions.add(directionsItem);
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public V3Status getStatus() {
    return status;
  }

  public void setStatus(V3Status status) {
    this.status = status;
  }

  public V3DirectionsResponse status(V3Status status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
