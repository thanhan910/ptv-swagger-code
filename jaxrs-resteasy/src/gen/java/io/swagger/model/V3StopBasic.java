package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3StopBasic   {
  private Integer stopId = null;  private String stopName = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("stop_id")
  public Integer getStopId() {
    return stopId;
  }
  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  /**
   **/
  
  @Schema(description = "")
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
