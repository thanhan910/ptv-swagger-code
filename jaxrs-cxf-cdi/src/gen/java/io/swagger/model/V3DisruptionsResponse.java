package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3Disruptions;
import io.swagger.model.V3Status;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3DisruptionsResponse   {
  private V3Disruptions disruptions = null;
  private V3Status status = null;

  /**
   **/
  public V3DisruptionsResponse disruptions(V3Disruptions disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("disruptions")
  @Valid
  public V3Disruptions getDisruptions() {
    return disruptions;
  }
  public void setDisruptions(V3Disruptions disruptions) {
    this.disruptions = disruptions;
  }

  /**
   **/
  public V3DisruptionsResponse status(V3Status status) {
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
    V3DisruptionsResponse v3DisruptionsResponse = (V3DisruptionsResponse) o;
    return Objects.equals(disruptions, v3DisruptionsResponse.disruptions) &&
        Objects.equals(status, v3DisruptionsResponse.status);
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
