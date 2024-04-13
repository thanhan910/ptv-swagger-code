package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3DisruptionMode;
import io.swagger.model.V3Status;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3DisruptionModesResponse   {
  private List<V3DisruptionMode> disruptionModes = new ArrayList<V3DisruptionMode>();
  private V3Status status = null;

  /**
   * Transport mode identifiers
   **/
  public V3DisruptionModesResponse disruptionModes(List<V3DisruptionMode> disruptionModes) {
    this.disruptionModes = disruptionModes;
    return this;
  }

  
  
  @Schema(description = "Transport mode identifiers")
  @JsonProperty("disruption_modes")
  @Valid
  public List<V3DisruptionMode> getDisruptionModes() {
    return disruptionModes;
  }
  public void setDisruptionModes(List<V3DisruptionMode> disruptionModes) {
    this.disruptionModes = disruptionModes;
  }

  /**
   **/
  public V3DisruptionModesResponse status(V3Status status) {
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
    V3DisruptionModesResponse v3DisruptionModesResponse = (V3DisruptionModesResponse) o;
    return Objects.equals(disruptionModes, v3DisruptionModesResponse.disruptionModes) &&
        Objects.equals(status, v3DisruptionModesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptionModes, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DisruptionModesResponse {\n");
    
    sb.append("    disruptionModes: ").append(toIndentedString(disruptionModes)).append("\n");
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
