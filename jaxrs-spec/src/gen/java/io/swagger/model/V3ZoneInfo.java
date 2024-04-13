package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3ZoneInfo   {

  private @Valid Integer minZone = null;

  private @Valid Integer maxZone = null;

  private @Valid List<Integer> uniqueZones = new ArrayList<Integer>();

  /**
   **/
  public V3ZoneInfo minZone(Integer minZone) {
    this.minZone = minZone;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("MinZone")

  public Integer getMinZone() {
    return minZone;
  }
  public void setMinZone(Integer minZone) {
    this.minZone = minZone;
  }

  /**
   **/
  public V3ZoneInfo maxZone(Integer maxZone) {
    this.maxZone = maxZone;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("MaxZone")

  public Integer getMaxZone() {
    return maxZone;
  }
  public void setMaxZone(Integer maxZone) {
    this.maxZone = maxZone;
  }

  /**
   **/
  public V3ZoneInfo uniqueZones(List<Integer> uniqueZones) {
    this.uniqueZones = uniqueZones;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("UniqueZones")

  public List<Integer> getUniqueZones() {
    return uniqueZones;
  }
  public void setUniqueZones(List<Integer> uniqueZones) {
    this.uniqueZones = uniqueZones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3ZoneInfo v3ZoneInfo = (V3ZoneInfo) o;
    return Objects.equals(minZone, v3ZoneInfo.minZone) &&
        Objects.equals(maxZone, v3ZoneInfo.maxZone) &&
        Objects.equals(uniqueZones, v3ZoneInfo.uniqueZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minZone, maxZone, uniqueZones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3ZoneInfo {\n");
    
    sb.append("    minZone: ").append(toIndentedString(minZone)).append("\n");
    sb.append("    maxZone: ").append(toIndentedString(maxZone)).append("\n");
    sb.append("    uniqueZones: ").append(toIndentedString(uniqueZones)).append("\n");
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
