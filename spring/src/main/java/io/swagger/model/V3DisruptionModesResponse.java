package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3DisruptionMode;
import io.swagger.model.V3Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3DisruptionModesResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3DisruptionModesResponse   {
  @JsonProperty("disruption_modes")
  @Valid
  private List<V3DisruptionMode> disruptionModes = null;

  @JsonProperty("status")
  private V3Status status = null;

  public V3DisruptionModesResponse disruptionModes(List<V3DisruptionMode> disruptionModes) {
    this.disruptionModes = disruptionModes;
    return this;
  }

  public V3DisruptionModesResponse addDisruptionModesItem(V3DisruptionMode disruptionModesItem) {
    if (this.disruptionModes == null) {
      this.disruptionModes = new ArrayList<V3DisruptionMode>();
    }
    this.disruptionModes.add(disruptionModesItem);
    return this;
  }

  /**
   * Transport mode identifiers
   * @return disruptionModes
   **/
  @Schema(description = "Transport mode identifiers")
      @Valid
    public List<V3DisruptionMode> getDisruptionModes() {
    return disruptionModes;
  }

  public void setDisruptionModes(List<V3DisruptionMode> disruptionModes) {
    this.disruptionModes = disruptionModes;
  }

  public V3DisruptionModesResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
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
    return Objects.equals(this.disruptionModes, v3DisruptionModesResponse.disruptionModes) &&
        Objects.equals(this.status, v3DisruptionModesResponse.status);
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
