package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3RouteType;
import io.swagger.model.V3Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3RouteTypesResponse   {
  @JsonProperty("route_types")
  private List<V3RouteType> routeTypes = null;
  @JsonProperty("status")
  private V3Status status = null;
  /**
   * Transport mode identifiers
   **/
  public V3RouteTypesResponse routeTypes(List<V3RouteType> routeTypes) {
    this.routeTypes = routeTypes;
    return this;
  }

  
  @Schema(description = "Transport mode identifiers")
  @JsonProperty("route_types")
  public List<V3RouteType> getRouteTypes() {
    return routeTypes;
  }
  public void setRouteTypes(List<V3RouteType> routeTypes) {
    this.routeTypes = routeTypes;
  }

  /**
   **/
  public V3RouteTypesResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  
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
    V3RouteTypesResponse v3RouteTypesResponse = (V3RouteTypesResponse) o;
    return Objects.equals(routeTypes, v3RouteTypesResponse.routeTypes) &&
        Objects.equals(status, v3RouteTypesResponse.status);
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
