package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3Disruption;
import io.swagger.model.V3Status;
import io.swagger.model.V3StopGeosearch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3StopsByDistanceResponse   {
  private List<V3StopGeosearch> stops = new ArrayList<V3StopGeosearch>();
  private Map<String, V3Disruption> disruptions = new HashMap<String, V3Disruption>();
  private V3Status status = null;

  /**
   * Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
   **/
  public V3StopsByDistanceResponse stops(List<V3StopGeosearch> stops) {
    this.stops = stops;
    return this;
  }

  
  
  @Schema(description = "Train stations, tram stops, bus stops, regional coach stops or Night Bus stops")
  @JsonProperty("stops")
  @Valid
  public List<V3StopGeosearch> getStops() {
    return stops;
  }
  public void setStops(List<V3StopGeosearch> stops) {
    this.stops = stops;
  }

  /**
   * Disruption information applicable to relevant routes or stops
   **/
  public V3StopsByDistanceResponse disruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  
  
  @Schema(description = "Disruption information applicable to relevant routes or stops")
  @JsonProperty("disruptions")
  @Valid
  public Map<String, V3Disruption> getDisruptions() {
    return disruptions;
  }
  public void setDisruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
  }

  /**
   **/
  public V3StopsByDistanceResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("status")
  @Valid
  public V3Status getStatus() {
    return status;
  }
  public void setStatus(V3Status status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopsByDistanceResponse v3StopsByDistanceResponse = (V3StopsByDistanceResponse) o;
    return Objects.equals(stops, v3StopsByDistanceResponse.stops) &&
        Objects.equals(disruptions, v3StopsByDistanceResponse.disruptions) &&
        Objects.equals(status, v3StopsByDistanceResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stops, disruptions, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopsByDistanceResponse {\n");
    
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
