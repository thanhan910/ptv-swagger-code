package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3DisruptionDirection   {
  private Integer routeDirectionId = null;  private Integer directionId = null;  private String directionName = null;  private String serviceTime = null;

  /**
   * Route and direction of travel combination identifier
   **/
  
  @Schema(description = "Route and direction of travel combination identifier")
  @JsonProperty("route_direction_id")
  public Integer getRouteDirectionId() {
    return routeDirectionId;
  }
  public void setRouteDirectionId(Integer routeDirectionId) {
    this.routeDirectionId = routeDirectionId;
  }

  /**
   * Direction of travel identifier
   **/
  
  @Schema(description = "Direction of travel identifier")
  @JsonProperty("direction_id")
  public Integer getDirectionId() {
    return directionId;
  }
  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  /**
   * Name of direction of travel
   **/
  
  @Schema(description = "Name of direction of travel")
  @JsonProperty("direction_name")
  public String getDirectionName() {
    return directionName;
  }
  public void setDirectionName(String directionName) {
    this.directionName = directionName;
  }

  /**
   * Time of service to which disruption applies, in 24 hour clock format (HH:MM:SS) AEDT/AEST; returns null if disruption applies to multiple (or no) services
   **/
  
  @Schema(description = "Time of service to which disruption applies, in 24 hour clock format (HH:MM:SS) AEDT/AEST; returns null if disruption applies to multiple (or no) services")
  @JsonProperty("service_time")
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
    return Objects.equals(routeDirectionId, v3DisruptionDirection.routeDirectionId) &&
        Objects.equals(directionId, v3DisruptionDirection.directionId) &&
        Objects.equals(directionName, v3DisruptionDirection.directionName) &&
        Objects.equals(serviceTime, v3DisruptionDirection.serviceTime);
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
