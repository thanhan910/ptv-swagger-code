package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3DisruptionDirection
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3DisruptionDirection   {
  @JsonProperty("route_direction_id")
  private Integer routeDirectionId = null;

  @JsonProperty("direction_id")
  private Integer directionId = null;

  @JsonProperty("direction_name")
  private String directionName = null;

  @JsonProperty("service_time")
  private String serviceTime = null;

  public V3DisruptionDirection routeDirectionId(Integer routeDirectionId) {
    this.routeDirectionId = routeDirectionId;
    return this;
  }

  /**
   * Route and direction of travel combination identifier
   * @return routeDirectionId
   **/
  @Schema(description = "Route and direction of travel combination identifier")
  
    public Integer getRouteDirectionId() {
    return routeDirectionId;
  }

  public void setRouteDirectionId(Integer routeDirectionId) {
    this.routeDirectionId = routeDirectionId;
  }

  public V3DisruptionDirection directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

  /**
   * Direction of travel identifier
   * @return directionId
   **/
  @Schema(description = "Direction of travel identifier")
  
    public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  public V3DisruptionDirection directionName(String directionName) {
    this.directionName = directionName;
    return this;
  }

  /**
   * Name of direction of travel
   * @return directionName
   **/
  @Schema(description = "Name of direction of travel")
  
    public String getDirectionName() {
    return directionName;
  }

  public void setDirectionName(String directionName) {
    this.directionName = directionName;
  }

  public V3DisruptionDirection serviceTime(String serviceTime) {
    this.serviceTime = serviceTime;
    return this;
  }

  /**
   * Time of service to which disruption applies, in 24 hour clock format (HH:MM:SS) AEDT/AEST; returns null if disruption applies to multiple (or no) services
   * @return serviceTime
   **/
  @Schema(description = "Time of service to which disruption applies, in 24 hour clock format (HH:MM:SS) AEDT/AEST; returns null if disruption applies to multiple (or no) services")
  
    public String getServiceTime() {
    return serviceTime;
  }

  public void setServiceTime(String serviceTime) {
    this.serviceTime = serviceTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DisruptionDirection v3DisruptionDirection = (V3DisruptionDirection) o;
    return Objects.equals(this.routeDirectionId, v3DisruptionDirection.routeDirectionId) &&
        Objects.equals(this.directionId, v3DisruptionDirection.directionId) &&
        Objects.equals(this.directionName, v3DisruptionDirection.directionName) &&
        Objects.equals(this.serviceTime, v3DisruptionDirection.serviceTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeDirectionId, directionId, directionName, serviceTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DisruptionDirection {\n");
    
    sb.append("    routeDirectionId: ").append(toIndentedString(routeDirectionId)).append("\n");
    sb.append("    directionId: ").append(toIndentedString(directionId)).append("\n");
    sb.append("    directionName: ").append(toIndentedString(directionName)).append("\n");
    sb.append("    serviceTime: ").append(toIndentedString(serviceTime)).append("\n");
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
