package io.swagger.model;

import io.swagger.model.V3RouteType;
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

public class V3RouteTypesResponse   {
  
  @Schema(description = "Transport mode identifiers")
 /**
   * Transport mode identifiers  
  **/
  private List<V3RouteType> routeTypes = null;
  
  @Schema(description = "")
  private V3Status status = null;
 /**
   * Transport mode identifiers
   * @return routeTypes
  **/
  @JsonProperty("route_types")
  public List<V3RouteType> getRouteTypes() {
    return routeTypes;
  }

  public void setRouteTypes(List<V3RouteType> routeTypes) {
    this.routeTypes = routeTypes;
  }

  public V3RouteTypesResponse routeTypes(List<V3RouteType> routeTypes) {
    this.routeTypes = routeTypes;
    return this;
  }

  public V3RouteTypesResponse addRouteTypesItem(V3RouteType routeTypesItem) {
    this.routeTypes.add(routeTypesItem);
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

  public V3RouteTypesResponse status(V3Status status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3RouteTypesResponse {\n");
    
    sb.append("    routeTypes: ").append(toIndentedString(routeTypes)).append("\n");
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
