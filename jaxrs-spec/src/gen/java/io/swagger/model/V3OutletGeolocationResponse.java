package io.swagger.model;

import io.swagger.model.V3OutletGeolocation;
import io.swagger.model.V3Status;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3OutletGeolocationResponse   {

  private @Valid List<V3OutletGeolocation> outlets = new ArrayList<V3OutletGeolocation>();

  private @Valid V3Status status = null;

  /**
   * myki ticket outlets
   **/
  public V3OutletGeolocationResponse outlets(List<V3OutletGeolocation> outlets) {
    this.outlets = outlets;
    return this;
  }

  
  @ApiModelProperty(value = "myki ticket outlets")
  @JsonProperty("outlets")

  public List<V3OutletGeolocation> getOutlets() {
    return outlets;
  }
  public void setOutlets(List<V3OutletGeolocation> outlets) {
    this.outlets = outlets;
  }

  /**
   **/
  public V3OutletGeolocationResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")

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
    V3OutletGeolocationResponse v3OutletGeolocationResponse = (V3OutletGeolocationResponse) o;
    return Objects.equals(outlets, v3OutletGeolocationResponse.outlets) &&
        Objects.equals(status, v3OutletGeolocationResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outlets, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3OutletGeolocationResponse {\n");
    
    sb.append("    outlets: ").append(toIndentedString(outlets)).append("\n");
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
