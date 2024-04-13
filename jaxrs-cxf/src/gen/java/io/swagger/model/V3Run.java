package io.swagger.model;

import io.swagger.model.V3VehicleDescriptor;
import io.swagger.model.V3VehiclePosition;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

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

public class V3Run   {
  
  @Schema(description = "Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric")
 /**
   * Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric  
  **/
  private Integer runId = null;
  
  @Schema(description = "Alphanumeric trip/service run identifier")
 /**
   * Alphanumeric trip/service run identifier  
  **/
  private String runRef = null;
  
  @Schema(description = "Route identifier")
 /**
   * Route identifier  
  **/
  private Integer routeId = null;
  
  @Schema(description = "Transport mode identifier")
 /**
   * Transport mode identifier  
  **/
  private Integer routeType = null;
  
  @Schema(description = "stop_id of final stop of run")
 /**
   * stop_id of final stop of run  
  **/
  private Integer finalStopId = null;
  
  @Schema(description = "Name of destination of run")
 /**
   * Name of destination of run  
  **/
  private String destinationName = null;
  
  @Schema(description = "Status of metropolitan train run; returns \"scheduled\" for other modes")
 /**
   * Status of metropolitan train run; returns \"scheduled\" for other modes  
  **/
  private String status = null;
  
  @Schema(description = "Direction of travel identifier")
 /**
   * Direction of travel identifier  
  **/
  private Integer directionId = null;
  
  @Schema(description = "Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.")
 /**
   * Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.  
  **/
  private Integer runSequence = null;
  
  @Schema(description = "The number of remaining skipped/express stations for the run/service from a stop")
 /**
   * The number of remaining skipped/express stations for the run/service from a stop  
  **/
  private Integer expressStopCount = null;
  
  @Schema(description = "")
  private V3VehiclePosition vehiclePosition = null;
  
  @Schema(description = "")
  private V3VehicleDescriptor vehicleDescriptor = null;
  
  @Schema(description = "Geopath of the route")
 /**
   * Geopath of the route  
  **/
  private List<Object> geopath = null;
 /**
   * Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
   * @return runId
  **/
  @JsonProperty("run_id")
  public Integer getRunId() {
    return runId;
  }


 /**
   * Alphanumeric trip/service run identifier
   * @return runRef
  **/
  @JsonProperty("run_ref")
  public String getRunRef() {
    return runRef;
  }

  public void setRunRef(String runRef) {
    this.runRef = runRef;
  }

  public V3Run runRef(String runRef) {
    this.runRef = runRef;
    return this;
  }

 /**
   * Route identifier
   * @return routeId
  **/
  @JsonProperty("route_id")
  public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public V3Run routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

 /**
   * Transport mode identifier
   * @return routeType
  **/
  @JsonProperty("route_type")
  public Integer getRouteType() {
    return routeType;
  }

  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  public V3Run routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

 /**
   * stop_id of final stop of run
   * @return finalStopId
  **/
  @JsonProperty("final_stop_id")
  public Integer getFinalStopId() {
    return finalStopId;
  }

  public void setFinalStopId(Integer finalStopId) {
    this.finalStopId = finalStopId;
  }

  public V3Run finalStopId(Integer finalStopId) {
    this.finalStopId = finalStopId;
    return this;
  }

 /**
   * Name of destination of run
   * @return destinationName
  **/
  @JsonProperty("destination_name")
  public String getDestinationName() {
    return destinationName;
  }

  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  public V3Run destinationName(String destinationName) {
    this.destinationName = destinationName;
    return this;
  }

 /**
   * Status of metropolitan train run; returns \&quot;scheduled\&quot; for other modes
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V3Run status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Direction of travel identifier
   * @return directionId
  **/
  @JsonProperty("direction_id")
  public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  public V3Run directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

 /**
   * Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.
   * @return runSequence
  **/
  @JsonProperty("run_sequence")
  public Integer getRunSequence() {
    return runSequence;
  }

  public void setRunSequence(Integer runSequence) {
    this.runSequence = runSequence;
  }

  public V3Run runSequence(Integer runSequence) {
    this.runSequence = runSequence;
    return this;
  }

 /**
   * The number of remaining skipped/express stations for the run/service from a stop
   * @return expressStopCount
  **/
  @JsonProperty("express_stop_count")
  public Integer getExpressStopCount() {
    return expressStopCount;
  }

  public void setExpressStopCount(Integer expressStopCount) {
    this.expressStopCount = expressStopCount;
  }

  public V3Run expressStopCount(Integer expressStopCount) {
    this.expressStopCount = expressStopCount;
    return this;
  }

 /**
   * Get vehiclePosition
   * @return vehiclePosition
  **/
  @JsonProperty("vehicle_position")
  public V3VehiclePosition getVehiclePosition() {
    return vehiclePosition;
  }

  public void setVehiclePosition(V3VehiclePosition vehiclePosition) {
    this.vehiclePosition = vehiclePosition;
  }

  public V3Run vehiclePosition(V3VehiclePosition vehiclePosition) {
    this.vehiclePosition = vehiclePosition;
    return this;
  }

 /**
   * Get vehicleDescriptor
   * @return vehicleDescriptor
  **/
  @JsonProperty("vehicle_descriptor")
  public V3VehicleDescriptor getVehicleDescriptor() {
    return vehicleDescriptor;
  }

  public void setVehicleDescriptor(V3VehicleDescriptor vehicleDescriptor) {
    this.vehicleDescriptor = vehicleDescriptor;
  }

  public V3Run vehicleDescriptor(V3VehicleDescriptor vehicleDescriptor) {
    this.vehicleDescriptor = vehicleDescriptor;
    return this;
  }

 /**
   * Geopath of the route
   * @return geopath
  **/
  @JsonProperty("geopath")
  public List<Object> getGeopath() {
    return geopath;
  }

  public void setGeopath(List<Object> geopath) {
    this.geopath = geopath;
  }

  public V3Run geopath(List<Object> geopath) {
    this.geopath = geopath;
    return this;
  }

  public V3Run addGeopathItem(Object geopathItem) {
    this.geopath.add(geopathItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
