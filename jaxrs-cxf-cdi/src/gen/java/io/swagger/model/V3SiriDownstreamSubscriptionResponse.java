package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3SiriDownstreamSubscriptionResponse   {
  private java.util.Date validUntil = null;

  /**
   * The Data Horizon of Chronos
   **/
  public V3SiriDownstreamSubscriptionResponse validUntil(java.util.Date validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  
  
  @Schema(description = "The Data Horizon of Chronos")
  @JsonProperty("valid_until")
  @Valid
  public java.util.Date getValidUntil() {
    return validUntil;
  }
  public void setValidUntil(java.util.Date validUntil) {
    this.validUntil = validUntil;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriDownstreamSubscriptionResponse v3SiriDownstreamSubscriptionResponse = (V3SiriDownstreamSubscriptionResponse) o;
    return Objects.equals(validUntil, v3SiriDownstreamSubscriptionResponse.validUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validUntil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriDownstreamSubscriptionResponse {\n");
    
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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
