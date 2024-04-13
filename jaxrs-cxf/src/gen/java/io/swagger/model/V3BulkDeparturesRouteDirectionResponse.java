package io.swagger.model;

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

public class V3BulkDeparturesRouteDirectionResponse   {
  
  @Schema(description = "Route identifier")
 /**
   * Route identifier  
  **/
  private String routeId = null;
  
  @Schema(description = "Direction of travel identifier")
 /**
   * Direction of travel identifier  
  **/
  private Integer directionId = null;
  
  @Schema(description = "Name of direction of travel")
 /**
   * Name of direction of travel  
  **/
  private String directionName = null;
 /**
   * Route identifier
   * @return routeId
  **/
  @JsonProperty("route_id")
  public String getRouteId() {
    return routeId;
  }

  public void setRouteId(String routeId) {
    this.routeId = routeId;
  }

  public V3BulkDeparturesRouteDirectionResponse routeId(String routeId) {
    this.routeId = routeId;
    return this;
  }

 /**
   * Direction of travel identifier
   * @return directionId
  **/
  @JsonProperty("direction_id")
  public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  public V3BulkDeparturesRouteDirectionResponse directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

 /**
   * Name of direction of travel
   * @return directionName
  **/
  @JsonProperty("direction_name")
  public String getDirectionName() {
    return directionName;
  }

  public void setDirectionName(String directionName) {
    this.directionName = directionName;
  }

  public V3BulkDeparturesRouteDirectionResponse directionName(String directionName) {
    this.directionName = directionName;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
