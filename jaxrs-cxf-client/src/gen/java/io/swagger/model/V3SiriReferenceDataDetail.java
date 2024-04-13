package io.swagger.model;


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

public class V3SiriReferenceDataDetail   {
  
  @Schema(description = "")
  private Integer routeId = null;
  
  @Schema(description = "Route number")
 /**
   * Route number  
  **/
  private String routeNumberShort = null;
  
  @Schema(description = "")
  private Integer directionId = null;
  
  @Schema(description = "Authority (Upstream SIRI provider) of a route and direction")
 /**
   * Authority (Upstream SIRI provider) of a route and direction  
  **/
  private Integer trackingSupplierId = null;
  
  @Schema(description = "")
  private Integer routeType = null;
 /**
   * Get routeId
   * @return routeId
  **/
  @JsonProperty("route_id")
  public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public V3SiriReferenceDataDetail routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

 /**
   * Route number
   * @return routeNumberShort
  **/
  @JsonProperty("route_number_short")
  public String getRouteNumberShort() {
    return routeNumberShort;
  }

  public void setRouteNumberShort(String routeNumberShort) {
    this.routeNumberShort = routeNumberShort;
  }

  public V3SiriReferenceDataDetail routeNumberShort(String routeNumberShort) {
    this.routeNumberShort = routeNumberShort;
    return this;
  }

 /**
   * Get directionId
   * @return directionId
  **/
  @JsonProperty("direction_id")
  public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  public V3SiriReferenceDataDetail directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

 /**
   * Authority (Upstream SIRI provider) of a route and direction
   * @return trackingSupplierId
  **/
  @JsonProperty("tracking_supplier_id")
  public Integer getTrackingSupplierId() {
    return trackingSupplierId;
  }

  public void setTrackingSupplierId(Integer trackingSupplierId) {
    this.trackingSupplierId = trackingSupplierId;
  }

  public V3SiriReferenceDataDetail trackingSupplierId(Integer trackingSupplierId) {
    this.trackingSupplierId = trackingSupplierId;
    return this;
  }

 /**
   * Get routeType
   * @return routeType
  **/
  @JsonProperty("route_type")
  public Integer getRouteType() {
    return routeType;
  }

  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  public V3SiriReferenceDataDetail routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
