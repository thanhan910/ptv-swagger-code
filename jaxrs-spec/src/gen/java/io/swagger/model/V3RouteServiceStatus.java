package io.swagger.model;

import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3RouteServiceStatus   {

  private @Valid String description = null;

  private @Valid Date timestamp = null;

  /**
   **/
  public V3RouteServiceStatus description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public V3RouteServiceStatus timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")

  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3RouteServiceStatus v3RouteServiceStatus = (V3RouteServiceStatus) o;
    return Objects.equals(description, v3RouteServiceStatus.description) &&
        Objects.equals(timestamp, v3RouteServiceStatus.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3RouteServiceStatus {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
