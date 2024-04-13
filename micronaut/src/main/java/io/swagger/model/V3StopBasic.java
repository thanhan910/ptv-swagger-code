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
 * V3StopBasic
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3StopBasic   {
  @JsonProperty("stop_id")
  private Integer stopId = null;

  @JsonProperty("stop_name")
  private String stopName = null;

  public V3StopBasic stopId(Integer stopId) {
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

  public V3StopBasic stopName(String stopName) {
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
    V3StopBasic v3StopBasic = (V3StopBasic) o;
    return Objects.equals(this.stopId, v3StopBasic.stopId) &&
        Objects.equals(this.stopName, v3StopBasic.stopName);
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
