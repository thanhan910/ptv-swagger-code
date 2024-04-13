package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3SiriReferenceDataDetail   {
  @JsonProperty("route_id")
  private Integer routeId = null;
  @JsonProperty("route_number_short")
  private String routeNumberShort = null;
  @JsonProperty("direction_id")
  private Integer directionId = null;
  @JsonProperty("tracking_supplier_id")
  private Integer trackingSupplierId = null;
  @JsonProperty("route_type")
  private Integer routeType = null;
  /**
   **/
  public V3SiriReferenceDataDetail routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

  
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
  public V3SiriReferenceDataDetail routeNumberShort(String routeNumberShort) {
    this.routeNumberShort = routeNumberShort;
    return this;
  }

  
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
  public V3SiriReferenceDataDetail directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

  
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
  public V3SiriReferenceDataDetail trackingSupplierId(Integer trackingSupplierId) {
    this.trackingSupplierId = trackingSupplierId;
    return this;
  }

  
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
  public V3SiriReferenceDataDetail routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

  
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
