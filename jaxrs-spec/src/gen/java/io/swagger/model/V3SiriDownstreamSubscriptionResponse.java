package io.swagger.model;

import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3SiriDownstreamSubscriptionResponse   {

  private @Valid Date validUntil = null;

  /**
   * The Data Horizon of Chronos
   **/
  public V3SiriDownstreamSubscriptionResponse validUntil(Date validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  
  @ApiModelProperty(value = "The Data Horizon of Chronos")
  @JsonProperty("valid_until")

  public Date getValidUntil() {
    return validUntil;
  }
  public void setValidUntil(Date validUntil) {
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
