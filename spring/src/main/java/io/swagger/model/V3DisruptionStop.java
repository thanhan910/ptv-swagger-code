package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3DisruptionStop
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3DisruptionStop   {
  @JsonProperty("stop_id")
  private Integer stopId = null;

  @JsonProperty("stop_name")
  private String stopName = null;

  public V3DisruptionStop stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

  /**
   * Get stopId
   * @return stopId
   **/
  @Schema(description = "")
  
    public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  public V3DisruptionStop stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

  /**
   * Get stopName
   * @return stopName
   **/
  @Schema(description = "")
  
    public String getStopName() {
    return stopName;
  }

  public void setStopName(String stopName) {
    this.stopName = stopName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DisruptionStop v3DisruptionStop = (V3DisruptionStop) o;
    return Objects.equals(this.stopId, v3DisruptionStop.stopId) &&
        Objects.equals(this.stopName, v3DisruptionStop.stopName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopId, stopName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DisruptionStop {\n");
    
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    stopName: ").append(toIndentedString(stopName)).append("\n");
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
