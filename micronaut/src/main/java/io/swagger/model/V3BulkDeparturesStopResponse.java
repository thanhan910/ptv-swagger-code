package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3BulkDeparturesStopResponse
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3BulkDeparturesStopResponse   {
  @JsonProperty("stop_name")
  private String stopName = null;

  @JsonProperty("stop_id")
  private Integer stopId = null;

  @JsonProperty("stop_latitude")
  private Float stopLatitude = null;

  @JsonProperty("stop_longitude")
  private Float stopLongitude = null;

  @JsonProperty("stop_suburb")
  private String stopSuburb = null;

  @JsonProperty("stop_landmark")
  private String stopLandmark = null;

  public V3BulkDeparturesStopResponse stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

  /**
   * Name of stop
   * @return stopName
  **/
  @Schema(description = "Name of stop")

  public String getStopName() {
    return stopName;
  }

  public void setStopName(String stopName) {
    this.stopName = stopName;
  }

  public V3BulkDeparturesStopResponse stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

  /**
   * Stop identifier
   * @return stopId
  **/
  @Schema(description = "Stop identifier")

  public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  public V3BulkDeparturesStopResponse stopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
    return this;
  }

  /**
   * Geographic coordinate of latitude at stop
   * @return stopLatitude
  **/
  @Schema(description = "Geographic coordinate of latitude at stop")

  public Float getStopLatitude() {
    return stopLatitude;
  }

  public void setStopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
  }

  public V3BulkDeparturesStopResponse stopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
    return this;
  }

  /**
   * Geographic coordinate of longitude at stop
   * @return stopLongitude
  **/
  @Schema(description = "Geographic coordinate of longitude at stop")

  public Float getStopLongitude() {
    return stopLongitude;
  }

  public void setStopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
  }

  public V3BulkDeparturesStopResponse stopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
    return this;
  }

  /**
   * suburb of stop
   * @return stopSuburb
  **/
  @Schema(description = "suburb of stop")

  public String getStopSuburb() {
    return stopSuburb;
  }

  public void setStopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
  }

  public V3BulkDeparturesStopResponse stopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
    return this;
  }

  /**
   * Landmark in proximity of stop
   * @return stopLandmark
  **/
  @Schema(description = "Landmark in proximity of stop")

  public String getStopLandmark() {
    return stopLandmark;
  }

  public void setStopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3BulkDeparturesStopResponse v3BulkDeparturesStopResponse = (V3BulkDeparturesStopResponse) o;
    return Objects.equals(this.stopName, v3BulkDeparturesStopResponse.stopName) &&
        Objects.equals(this.stopId, v3BulkDeparturesStopResponse.stopId) &&
        Objects.equals(this.stopLatitude, v3BulkDeparturesStopResponse.stopLatitude) &&
        Objects.equals(this.stopLongitude, v3BulkDeparturesStopResponse.stopLongitude) &&
        Objects.equals(this.stopSuburb, v3BulkDeparturesStopResponse.stopSuburb) &&
        Objects.equals(this.stopLandmark, v3BulkDeparturesStopResponse.stopLandmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopName, stopId, stopLatitude, stopLongitude, stopSuburb, stopLandmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3BulkDeparturesStopResponse {\n");
    
    sb.append("    stopName: ").append(toIndentedString(stopName)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    stopLatitude: ").append(toIndentedString(stopLatitude)).append("\n");
    sb.append("    stopLongitude: ").append(toIndentedString(stopLongitude)).append("\n");
    sb.append("    stopSuburb: ").append(toIndentedString(stopSuburb)).append("\n");
    sb.append("    stopLandmark: ").append(toIndentedString(stopLandmark)).append("\n");
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
