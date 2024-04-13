package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3VehicleDescriptor;
import io.swagger.model.V3VehiclePosition;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3Run   {
  private Integer runId = null;  private String runRef = null;  private Integer routeId = null;  private Integer routeType = null;  private Integer finalStopId = null;  private String destinationName = null;  private String status = null;  private Integer directionId = null;  private Integer runSequence = null;  private Integer expressStopCount = null;  private V3VehiclePosition vehiclePosition = null;  private V3VehicleDescriptor vehicleDescriptor = null;  private List<Object> geopath = new ArrayList<Object>();

  /**
   * Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
   **/
  
  @Schema(description = "Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric")
  @JsonProperty("run_id")
  public Integer getRunId() {
    return runId;
  }
  public void setRunId(Integer runId) {
    this.runId = runId;
  }

  /**
   * Alphanumeric trip/service run identifier
   **/
  
  @Schema(description = "Alphanumeric trip/service run identifier")
  @JsonProperty("run_ref")
  public String getRunRef() {
    return runRef;
  }
  public void setRunRef(String runRef) {
    this.runRef = runRef;
  }

  /**
   * Route identifier
   **/
  
  @Schema(description = "Route identifier")
  @JsonProperty("route_id")
  public Integer getRouteId() {
    return routeId;
  }
  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  /**
   * Transport mode identifier
   **/
  
  @Schema(description = "Transport mode identifier")
  @JsonProperty("route_type")
  public Integer getRouteType() {
    return routeType;
  }
  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  /**
   * stop_id of final stop of run
   **/
  
  @Schema(description = "stop_id of final stop of run")
  @JsonProperty("final_stop_id")
  public Integer getFinalStopId() {
    return finalStopId;
  }
  public void setFinalStopId(Integer finalStopId) {
    this.finalStopId = finalStopId;
  }

  /**
   * Name of destination of run
   **/
  
  @Schema(description = "Name of destination of run")
  @JsonProperty("destination_name")
  public String getDestinationName() {
    return destinationName;
  }
  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  /**
   * Status of metropolitan train run; returns \&quot;scheduled\&quot; for other modes
   **/
  
  @Schema(description = "Status of metropolitan train run; returns \"scheduled\" for other modes")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
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
   * Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.
   **/
  
  @Schema(description = "Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.")
  @JsonProperty("run_sequence")
  public Integer getRunSequence() {
    return runSequence;
  }
  public void setRunSequence(Integer runSequence) {
    this.runSequence = runSequence;
  }

  /**
   * The number of remaining skipped/express stations for the run/service from a stop
   **/
  
  @Schema(description = "The number of remaining skipped/express stations for the run/service from a stop")
  @JsonProperty("express_stop_count")
  public Integer getExpressStopCount() {
    return expressStopCount;
  }
  public void setExpressStopCount(Integer expressStopCount) {
    this.expressStopCount = expressStopCount;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("vehicle_position")
  public V3VehiclePosition getVehiclePosition() {
    return vehiclePosition;
  }
  public void setVehiclePosition(V3VehiclePosition vehiclePosition) {
    this.vehiclePosition = vehiclePosition;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("vehicle_descriptor")
  public V3VehicleDescriptor getVehicleDescriptor() {
    return vehicleDescriptor;
  }
  public void setVehicleDescriptor(V3VehicleDescriptor vehicleDescriptor) {
    this.vehicleDescriptor = vehicleDescriptor;
  }

  /**
   * Geopath of the route
   **/
  
  @Schema(description = "Geopath of the route")
  @JsonProperty("geopath")
  public List<Object> getGeopath() {
    return geopath;
  }
  public void setGeopath(List<Object> geopath) {
    this.geopath = geopath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3Run v3Run = (V3Run) o;
    return Objects.equals(runId, v3Run.runId) &&
        Objects.equals(runRef, v3Run.runRef) &&
        Objects.equals(routeId, v3Run.routeId) &&
        Objects.equals(routeType, v3Run.routeType) &&
        Objects.equals(finalStopId, v3Run.finalStopId) &&
        Objects.equals(destinationName, v3Run.destinationName) &&
        Objects.equals(status, v3Run.status) &&
        Objects.equals(directionId, v3Run.directionId) &&
        Objects.equals(runSequence, v3Run.runSequence) &&
        Objects.equals(expressStopCount, v3Run.expressStopCount) &&
        Objects.equals(vehiclePosition, v3Run.vehiclePosition) &&
        Objects.equals(vehicleDescriptor, v3Run.vehicleDescriptor) &&
        Objects.equals(geopath, v3Run.geopath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, runRef, routeId, routeType, finalStopId, destinationName, status, directionId, runSequence, expressStopCount, vehiclePosition, vehicleDescriptor, geopath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3Run {\n");
    
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    runRef: ").append(toIndentedString(runRef)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    finalStopId: ").append(toIndentedString(finalStopId)).append("\n");
    sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    directionId: ").append(toIndentedString(directionId)).append("\n");
    sb.append("    runSequence: ").append(toIndentedString(runSequence)).append("\n");
    sb.append("    expressStopCount: ").append(toIndentedString(expressStopCount)).append("\n");
    sb.append("    vehiclePosition: ").append(toIndentedString(vehiclePosition)).append("\n");
    sb.append("    vehicleDescriptor: ").append(toIndentedString(vehicleDescriptor)).append("\n");
    sb.append("    geopath: ").append(toIndentedString(geopath)).append("\n");
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
