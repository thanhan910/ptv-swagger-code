package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3StopPoint   {
  private Integer stopId = null;

  /**
   **/
  public V3StopPoint stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("stop_id")
  public Integer getStopId() {
    return stopId;
  }
  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopPoint v3StopPoint = (V3StopPoint) o;
    return Objects.equals(stopId, v3StopPoint.stopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopPoint {\n");
    
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
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
