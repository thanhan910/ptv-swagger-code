package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3RouteType;
import io.swagger.server.api.model.V3Status;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3RouteTypesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3RouteTypesResponse   {
  
  private List<V3RouteType> routeTypes = null;

  private V3Status status = null;

  public V3RouteTypesResponse routeTypes(List<V3RouteType> routeTypes) {
    this.routeTypes = routeTypes;
    return this;
  }

  public V3RouteTypesResponse addRouteTypesItem(V3RouteType routeTypesItem) {
    if (this.routeTypes == null) {
      this.routeTypes = new ArrayList<V3RouteType>();
    }
    this.routeTypes.add(routeTypesItem);
    return this;
  }

  /**
   * Transport mode identifiers
   * @return routeTypes
   **/
    public List<V3RouteType> getRouteTypes() {
    return routeTypes;
  }

  public void setRouteTypes(List<V3RouteType> routeTypes) {
    this.routeTypes = routeTypes;
  }

  public V3RouteTypesResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
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
    V3RouteTypesResponse v3RouteTypesResponse = (V3RouteTypesResponse) o;
    return Objects.equals(this.routeTypes, v3RouteTypesResponse.routeTypes) &&
        Objects.equals(this.status, v3RouteTypesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeTypes, status);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
