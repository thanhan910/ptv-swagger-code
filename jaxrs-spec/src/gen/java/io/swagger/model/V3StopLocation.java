package io.swagger.model;

import io.swagger.model.V3StopGps;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3StopLocation   {

  private @Valid V3StopGps gps = null;

  /**
   **/
  public V3StopLocation gps(V3StopGps gps) {
    this.gps = gps;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("gps")

  public V3StopGps getGps() {
    return gps;
  }
  public void setGps(V3StopGps gps) {
    this.gps = gps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopLocation v3StopLocation = (V3StopLocation) o;
    return Objects.equals(gps, v3StopLocation.gps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopLocation {\n");
    
    sb.append("    gps: ").append(toIndentedString(gps)).append("\n");
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
