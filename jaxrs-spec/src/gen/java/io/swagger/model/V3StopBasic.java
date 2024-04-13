package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3StopBasic   {

  private @Valid Integer stopId = null;

  private @Valid String stopName = null;

  /**
   **/
  public V3StopBasic stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stop_id")

  public Integer getStopId() {
    return stopId;
  }
  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  /**
   **/
  public V3StopBasic stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stop_name")

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
    V3StopBasic v3StopBasic = (V3StopBasic) o;
    return Objects.equals(stopId, v3StopBasic.stopId) &&
        Objects.equals(stopName, v3StopBasic.stopName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopId, stopName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopBasic {\n");
    
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
