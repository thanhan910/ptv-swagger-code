package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3FareEstimateResultStatus   {
  private Integer statusCode = null;
  private String message = null;

  /**
   **/
  public V3FareEstimateResultStatus statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("StatusCode")
  public Integer getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  /**
   **/
  public V3FareEstimateResultStatus message(String message) {
    this.message = message;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("Message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3FareEstimateResultStatus v3FareEstimateResultStatus = (V3FareEstimateResultStatus) o;
    return Objects.equals(statusCode, v3FareEstimateResultStatus.statusCode) &&
        Objects.equals(message, v3FareEstimateResultStatus.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3FareEstimateResultStatus {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
