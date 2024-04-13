package io.swagger.model;

import io.swagger.model.V3VehicleDescriptor;
import io.swagger.model.V3VehiclePosition;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3Run   {

  private @Valid Integer runId = null;

  private @Valid String runRef = null;

  private @Valid Integer routeId = null;

  private @Valid Integer routeType = null;

  private @Valid Integer finalStopId = null;

  private @Valid String destinationName = null;

  private @Valid String status = null;

  private @Valid Integer directionId = null;

  private @Valid Integer runSequence = null;

  private @Valid Integer expressStopCount = null;

  private @Valid V3VehiclePosition vehiclePosition = null;

  private @Valid V3VehicleDescriptor vehicleDescriptor = null;

  private @Valid List<Object> geopath = new ArrayList<Object>();

  /**
   * Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
   **/
  public V3Run runId(Integer runId) {
    this.runId = runId;
    return this;
  }

  
  @ApiModelProperty(value = "Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric")
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
  public V3Run runRef(String runRef) {
    this.runRef = runRef;
    return this;
  }

  
  @ApiModelProperty(value = "Alphanumeric trip/service run identifier")
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
  public V3Run routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

  
  @ApiModelProperty(value = "Route identifier")
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
  public V3Run routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

  
  @ApiModelProperty(value = "Transport mode identifier")
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
  public V3Run finalStopId(Integer finalStopId) {
    this.finalStopId = finalStopId;
    return this;
  }

  
  @ApiModelProperty(value = "stop_id of final stop of run")
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
  public V3Run destinationName(String destinationName) {
    this.destinationName = destinationName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of destination of run")
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
  public V3Run status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Status of metropolitan train run; returns \"scheduled\" for other modes")
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
  public V3Run directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

  
  @ApiModelProperty(value = "Direction of travel identifier")
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
  public V3Run runSequence(Integer runSequence) {
    this.runSequence = runSequence;
    return this;
  }

  
  @ApiModelProperty(value = "Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.")
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
  public V3Run expressStopCount(Integer expressStopCount) {
    this.expressStopCount = expressStopCount;
    return this;
  }

  
  @ApiModelProperty(value = "The number of remaining skipped/express stations for the run/service from a stop")
  @JsonProperty("express_stop_count")

  public Integer getExpressStopCount() {
    return expressStopCount;
  }
  public void setExpressStopCount(Integer expressStopCount) {
    this.expressStopCount = expressStopCount;
  }

  /**
   **/
  public V3Run vehiclePosition(V3VehiclePosition vehiclePosition) {
    this.vehiclePosition = vehiclePosition;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("vehicle_position")

  public V3VehiclePosition getVehiclePosition() {
    return vehiclePosition;
  }
  public void setVehiclePosition(V3VehiclePosition vehiclePosition) {
    this.vehiclePosition = vehiclePosition;
  }

  /**
   **/
  public V3Run vehicleDescriptor(V3VehicleDescriptor vehicleDescriptor) {
    this.vehicleDescriptor = vehicleDescriptor;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
  public V3Run geopath(List<Object> geopath) {
    this.geopath = geopath;
    return this;
  }

  
  @ApiModelProperty(value = "Geopath of the route")
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
