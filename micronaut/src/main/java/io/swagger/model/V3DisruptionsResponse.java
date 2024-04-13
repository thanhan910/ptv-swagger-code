package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3Disruptions;
import io.swagger.model.V3Status;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3DisruptionsResponse
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3DisruptionsResponse   {
  @JsonProperty("disruptions")
  private V3Disruptions disruptions = null;

  @JsonProperty("status")
  private V3Status status = null;

  public V3DisruptionsResponse disruptions(V3Disruptions disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  /**
   * Get disruptions
   * @return disruptions
  **/
  @Schema(description = "")

  @Valid
  public V3Disruptions getDisruptions() {
    return disruptions;
  }

  public void setDisruptions(V3Disruptions disruptions) {
    this.disruptions = disruptions;
  }

  public V3DisruptionsResponse status(V3Status status) {
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
    V3DisruptionsResponse v3DisruptionsResponse = (V3DisruptionsResponse) o;
    return Objects.equals(this.disruptions, v3DisruptionsResponse.disruptions) &&
        Objects.equals(this.status, v3DisruptionsResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptions, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DisruptionsResponse {\n");
    
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
