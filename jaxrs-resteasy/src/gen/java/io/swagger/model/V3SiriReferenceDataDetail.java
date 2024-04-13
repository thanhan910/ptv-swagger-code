package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3SiriReferenceDataDetail   {
  private Integer routeId = null;  private String routeNumberShort = null;  private Integer directionId = null;  private Integer trackingSupplierId = null;  private Integer routeType = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("route_id")
  public Integer getRouteId() {
    return routeId;
  }
  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  /**
   * Route number
   **/
  
  @Schema(description = "Route number")
  @JsonProperty("route_number_short")
  public String getRouteNumberShort() {
    return routeNumberShort;
  }
  public void setRouteNumberShort(String routeNumberShort) {
    this.routeNumberShort = routeNumberShort;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("direction_id")
  public Integer getDirectionId() {
    return directionId;
  }
  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  /**
   * Authority (Upstream SIRI provider) of a route and direction
   **/
  
  @Schema(description = "Authority (Upstream SIRI provider) of a route and direction")
  @JsonProperty("tracking_supplier_id")
  public Integer getTrackingSupplierId() {
    return trackingSupplierId;
  }
  public void setTrackingSupplierId(Integer trackingSupplierId) {
    this.trackingSupplierId = trackingSupplierId;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("route_type")
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
    V3SiriReferenceDataDetail v3SiriReferenceDataDetail = (V3SiriReferenceDataDetail) o;
    return Objects.equals(routeId, v3SiriReferenceDataDetail.routeId) &&
        Objects.equals(routeNumberShort, v3SiriReferenceDataDetail.routeNumberShort) &&
        Objects.equals(directionId, v3SiriReferenceDataDetail.directionId) &&
        Objects.equals(trackingSupplierId, v3SiriReferenceDataDetail.trackingSupplierId) &&
        Objects.equals(routeType, v3SiriReferenceDataDetail.routeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeId, routeNumberShort, directionId, trackingSupplierId, routeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriReferenceDataDetail {\n");
    
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    routeNumberShort: ").append(toIndentedString(routeNumberShort)).append("\n");
    sb.append("    directionId: ").append(toIndentedString(directionId)).append("\n");
    sb.append("    trackingSupplierId: ").append(toIndentedString(trackingSupplierId)).append("\n");
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
