package io.swagger.model;

import io.swagger.model.V3FareEstimateResult;
import io.swagger.model.V3FareEstimateResultStatus;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class V3FareEstimateResponse   {
  
  @Schema(description = "")
  private V3FareEstimateResultStatus fareEstimateResultStatus = null;
  
  @Schema(description = "")
  private V3FareEstimateResult fareEstimateResult = null;
 /**
   * Get fareEstimateResultStatus
   * @return fareEstimateResultStatus
  **/
  @JsonProperty("FareEstimateResultStatus")
  public V3FareEstimateResultStatus getFareEstimateResultStatus() {
    return fareEstimateResultStatus;
  }

  public void setFareEstimateResultStatus(V3FareEstimateResultStatus fareEstimateResultStatus) {
    this.fareEstimateResultStatus = fareEstimateResultStatus;
  }

  public V3FareEstimateResponse fareEstimateResultStatus(V3FareEstimateResultStatus fareEstimateResultStatus) {
    this.fareEstimateResultStatus = fareEstimateResultStatus;
    return this;
  }

 /**
   * Get fareEstimateResult
   * @return fareEstimateResult
  **/
  @JsonProperty("FareEstimateResult")
  public V3FareEstimateResult getFareEstimateResult() {
    return fareEstimateResult;
  }

  public void setFareEstimateResult(V3FareEstimateResult fareEstimateResult) {
    this.fareEstimateResult = fareEstimateResult;
  }

  public V3FareEstimateResponse fareEstimateResult(V3FareEstimateResult fareEstimateResult) {
    this.fareEstimateResult = fareEstimateResult;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
