package io.swagger.model;

import io.swagger.model.V3FareEstimateResult;
import io.swagger.model.V3FareEstimateResultStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3FareEstimateResponse   {

  private @Valid V3FareEstimateResultStatus fareEstimateResultStatus = null;

  private @Valid V3FareEstimateResult fareEstimateResult = null;

  /**
   **/
  public V3FareEstimateResponse fareEstimateResultStatus(V3FareEstimateResultStatus fareEstimateResultStatus) {
    this.fareEstimateResultStatus = fareEstimateResultStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("FareEstimateResultStatus")

  public V3FareEstimateResultStatus getFareEstimateResultStatus() {
    return fareEstimateResultStatus;
  }
  public void setFareEstimateResultStatus(V3FareEstimateResultStatus fareEstimateResultStatus) {
    this.fareEstimateResultStatus = fareEstimateResultStatus;
  }

  /**
   **/
  public V3FareEstimateResponse fareEstimateResult(V3FareEstimateResult fareEstimateResult) {
    this.fareEstimateResult = fareEstimateResult;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("FareEstimateResult")

  public V3FareEstimateResult getFareEstimateResult() {
    return fareEstimateResult;
  }
  public void setFareEstimateResult(V3FareEstimateResult fareEstimateResult) {
    this.fareEstimateResult = fareEstimateResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3FareEstimateResponse v3FareEstimateResponse = (V3FareEstimateResponse) o;
    return Objects.equals(fareEstimateResultStatus, v3FareEstimateResponse.fareEstimateResultStatus) &&
        Objects.equals(fareEstimateResult, v3FareEstimateResponse.fareEstimateResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fareEstimateResultStatus, fareEstimateResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3FareEstimateResponse {\n");
    
    sb.append("    fareEstimateResultStatus: ").append(toIndentedString(fareEstimateResultStatus)).append("\n");
    sb.append("    fareEstimateResult: ").append(toIndentedString(fareEstimateResult)).append("\n");
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
