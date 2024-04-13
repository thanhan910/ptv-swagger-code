package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3VehicleDescriptor;
import io.swagger.model.V3VehiclePosition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3Run
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3Run   {
  @JsonProperty("run_id")
  private Integer runId = null;

  @JsonProperty("run_ref")
  private String runRef = null;

  @JsonProperty("route_id")
  private Integer routeId = null;

  @JsonProperty("route_type")
  private Integer routeType = null;

  @JsonProperty("final_stop_id")
  private Integer finalStopId = null;

  @JsonProperty("destination_name")
  private String destinationName = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("direction_id")
  private Integer directionId = null;

  @JsonProperty("run_sequence")
  private Integer runSequence = null;

  @JsonProperty("express_stop_count")
  private Integer expressStopCount = null;

  @JsonProperty("vehicle_position")
  private V3VehiclePosition vehiclePosition = null;

  @JsonProperty("vehicle_descriptor")
  private V3VehicleDescriptor vehicleDescriptor = null;

  @JsonProperty("geopath")
  @Valid
  private List<Object> geopath = null;

  public V3Run runId(Integer runId) {
    this.runId = runId;
    return this;
  }

  /**
   * Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
   * @return runId
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric")
  
    public Integer getRunId() {
    return runId;
  }

  public void setRunId(Integer runId) {
    this.runId = runId;
  }

  public V3Run runRef(String runRef) {
    this.runRef = runRef;
    return this;
  }

  /**
   * Alphanumeric trip/service run identifier
   * @return runRef
   **/
  @Schema(description = "Alphanumeric trip/service run identifier")
  
    public String getRunRef() {
    return runRef;
  }

  public void setRunRef(String runRef) {
    this.runRef = runRef;
  }

  public V3Run routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * Route identifier
   * @return routeId
   **/
  @Schema(description = "Route identifier")
  
    public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public V3Run routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

  /**
   * Transport mode identifier
   * @return routeType
   **/
  @Schema(description = "Transport mode identifier")
  
    public Integer getRouteType() {
    return routeType;
  }

  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  public V3Run finalStopId(Integer finalStopId) {
    this.finalStopId = finalStopId;
    return this;
  }

  /**
   * stop_id of final stop of run
   * @return finalStopId
   **/
  @Schema(description = "stop_id of final stop of run")
  
    public Integer getFinalStopId() {
    return finalStopId;
  }

  public void setFinalStopId(Integer finalStopId) {
    this.finalStopId = finalStopId;
  }

  public V3Run destinationName(String destinationName) {
    this.destinationName = destinationName;
    return this;
  }

  /**
   * Name of destination of run
   * @return destinationName
   **/
  @Schema(description = "Name of destination of run")
  
    public String getDestinationName() {
    return destinationName;
  }

  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  public V3Run status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of metropolitan train run; returns \"scheduled\" for other modes
   * @return status
   **/
  @Schema(description = "Status of metropolitan train run; returns \"scheduled\" for other modes")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V3Run directionId(Integer directionId) {
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

  public V3Run runSequence(Integer runSequence) {
    this.runSequence = runSequence;
    return this;
  }

  /**
   * Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.
   * @return runSequence
   **/
  @Schema(description = "Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.")
  
    public Integer getRunSequence() {
    return runSequence;
  }

  public void setRunSequence(Integer runSequence) {
    this.runSequence = runSequence;
  }

  public V3Run expressStopCount(Integer expressStopCount) {
    this.expressStopCount = expressStopCount;
    return this;
  }

  /**
   * The number of remaining skipped/express stations for the run/service from a stop
   * @return expressStopCount
   **/
  @Schema(description = "The number of remaining skipped/express stations for the run/service from a stop")
  
    public Integer getExpressStopCount() {
    return expressStopCount;
  }

  public void setExpressStopCount(Integer expressStopCount) {
    this.expressStopCount = expressStopCount;
  }

  public V3Run vehiclePosition(V3VehiclePosition vehiclePosition) {
    this.vehiclePosition = vehiclePosition;
    return this;
  }

  /**
   * Get vehiclePosition
   * @return vehiclePosition
   **/
  @Schema(description = "")
  
    @Valid
    public V3VehiclePosition getVehiclePosition() {
    return vehiclePosition;
  }

  public void setVehiclePosition(V3VehiclePosition vehiclePosition) {
    this.vehiclePosition = vehiclePosition;
  }

  public V3Run vehicleDescriptor(V3VehicleDescriptor vehicleDescriptor) {
    this.vehicleDescriptor = vehicleDescriptor;
    return this;
  }

  /**
   * Get vehicleDescriptor
   * @return vehicleDescriptor
   **/
  @Schema(description = "")
  
    @Valid
    public V3VehicleDescriptor getVehicleDescriptor() {
    return vehicleDescriptor;
  }

  public void setVehicleDescriptor(V3VehicleDescriptor vehicleDescriptor) {
    this.vehicleDescriptor = vehicleDescriptor;
  }

  public V3Run geopath(List<Object> geopath) {
    this.geopath = geopath;
    return this;
  }

  public V3Run addGeopathItem(Object geopathItem) {
    if (this.geopath == null) {
      this.geopath = new ArrayList<Object>();
    }
    this.geopath.add(geopathItem);
    return this;
  }

  /**
   * Geopath of the route
   * @return geopath
   **/
  @Schema(description = "Geopath of the route")
  
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
    return Objects.equals(this.runId, v3Run.runId) &&
        Objects.equals(this.runRef, v3Run.runRef) &&
        Objects.equals(this.routeId, v3Run.routeId) &&
        Objects.equals(this.routeType, v3Run.routeType) &&
        Objects.equals(this.finalStopId, v3Run.finalStopId) &&
        Objects.equals(this.destinationName, v3Run.destinationName) &&
        Objects.equals(this.status, v3Run.status) &&
        Objects.equals(this.directionId, v3Run.directionId) &&
        Objects.equals(this.runSequence, v3Run.runSequence) &&
        Objects.equals(this.expressStopCount, v3Run.expressStopCount) &&
        Objects.equals(this.vehiclePosition, v3Run.vehiclePosition) &&
        Objects.equals(this.vehicleDescriptor, v3Run.vehicleDescriptor) &&
        Objects.equals(this.geopath, v3Run.geopath);
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
