package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3SiriReferenceDataDetail
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3SiriReferenceDataDetail   {
  private Integer routeId = null;

  private String routeNumberShort = null;

  private Integer directionId = null;

  private Integer trackingSupplierId = null;

  private Integer routeType = null;

  public V3SiriReferenceDataDetail routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * Get routeId
   * @return routeId
   **/
    public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public V3SiriReferenceDataDetail routeNumberShort(String routeNumberShort) {
    this.routeNumberShort = routeNumberShort;
    return this;
  }

  /**
   * Route number
   * @return routeNumberShort
   **/
    public String getRouteNumberShort() {
    return routeNumberShort;
  }

  public void setRouteNumberShort(String routeNumberShort) {
    this.routeNumberShort = routeNumberShort;
  }

  public V3SiriReferenceDataDetail directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

  /**
   * Get directionId
   * @return directionId
   **/
    public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  public V3SiriReferenceDataDetail trackingSupplierId(Integer trackingSupplierId) {
    this.trackingSupplierId = trackingSupplierId;
    return this;
  }

  /**
   * Authority (Upstream SIRI provider) of a route and direction
   * @return trackingSupplierId
   **/
    public Integer getTrackingSupplierId() {
    return trackingSupplierId;
  }

  public void setTrackingSupplierId(Integer trackingSupplierId) {
    this.trackingSupplierId = trackingSupplierId;
  }

  public V3SiriReferenceDataDetail routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

  /**
   * Get routeType
   * @return routeType
   **/
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
    return Objects.equals(this.routeId, v3SiriReferenceDataDetail.routeId) &&
        Objects.equals(this.routeNumberShort, v3SiriReferenceDataDetail.routeNumberShort) &&
        Objects.equals(this.directionId, v3SiriReferenceDataDetail.directionId) &&
        Objects.equals(this.trackingSupplierId, v3SiriReferenceDataDetail.trackingSupplierId) &&
        Objects.equals(this.routeType, v3SiriReferenceDataDetail.routeType);
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
