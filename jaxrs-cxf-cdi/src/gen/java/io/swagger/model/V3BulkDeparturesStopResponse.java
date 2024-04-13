package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3BulkDeparturesStopResponse   {
  private String stopName = null;
  private Integer stopId = null;
  private Float stopLatitude = null;
  private Float stopLongitude = null;
  private String stopSuburb = null;
  private String stopLandmark = null;

  /**
   * Name of stop
   **/
  public V3BulkDeparturesStopResponse stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

  
  
  @Schema(description = "Name of stop")
  @JsonProperty("stop_name")
  public String getStopName() {
    return stopName;
  }
  public void setStopName(String stopName) {
    this.stopName = stopName;
  }

  /**
   * Stop identifier
   **/
  public V3BulkDeparturesStopResponse stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

  
  
  @Schema(description = "Stop identifier")
  @JsonProperty("stop_id")
  public Integer getStopId() {
    return stopId;
  }
  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  /**
   * Geographic coordinate of latitude at stop
   **/
  public V3BulkDeparturesStopResponse stopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
    return this;
  }

  
  
  @Schema(description = "Geographic coordinate of latitude at stop")
  @JsonProperty("stop_latitude")
  public Float getStopLatitude() {
    return stopLatitude;
  }
  public void setStopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
  }

  /**
   * Geographic coordinate of longitude at stop
   **/
  public V3BulkDeparturesStopResponse stopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
    return this;
  }

  
  
  @Schema(description = "Geographic coordinate of longitude at stop")
  @JsonProperty("stop_longitude")
  public Float getStopLongitude() {
    return stopLongitude;
  }
  public void setStopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
  }

  /**
   * suburb of stop
   **/
  public V3BulkDeparturesStopResponse stopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
    return this;
  }

  
  
  @Schema(description = "suburb of stop")
  @JsonProperty("stop_suburb")
  public String getStopSuburb() {
    return stopSuburb;
  }
  public void setStopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
  }

  /**
   * Landmark in proximity of stop
   **/
  public V3BulkDeparturesStopResponse stopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
    return this;
  }

  
  
  @Schema(description = "Landmark in proximity of stop")
  @JsonProperty("stop_landmark")
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
    return Objects.equals(stopName, v3BulkDeparturesStopResponse.stopName) &&
        Objects.equals(stopId, v3BulkDeparturesStopResponse.stopId) &&
        Objects.equals(stopLatitude, v3BulkDeparturesStopResponse.stopLatitude) &&
        Objects.equals(stopLongitude, v3BulkDeparturesStopResponse.stopLongitude) &&
        Objects.equals(stopSuburb, v3BulkDeparturesStopResponse.stopSuburb) &&
        Objects.equals(stopLandmark, v3BulkDeparturesStopResponse.stopLandmark);
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
