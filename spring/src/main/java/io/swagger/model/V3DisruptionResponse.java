package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3Disruption;
import io.swagger.model.V3Status;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3DisruptionResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3DisruptionResponse   {
  @JsonProperty("disruption")
  private V3Disruption disruption = null;

  @JsonProperty("status")
  private V3Status status = null;

  public V3DisruptionResponse disruption(V3Disruption disruption) {
    this.disruption = disruption;
    return this;
  }

  /**
   * Get disruption
   * @return disruption
   **/
  @Schema(description = "")
  
    @Valid
    public V3Disruption getDisruption() {
    return disruption;
  }

  public void setDisruption(V3Disruption disruption) {
    this.disruption = disruption;
  }

  public V3DisruptionResponse status(V3Status status) {
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
    V3DisruptionResponse v3DisruptionResponse = (V3DisruptionResponse) o;
    return Objects.equals(this.disruption, v3DisruptionResponse.disruption) &&
        Objects.equals(this.status, v3DisruptionResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruption, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DisruptionResponse {\n");
    
    sb.append("    disruption: ").append(toIndentedString(disruption)).append("\n");
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
