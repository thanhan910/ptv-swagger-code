package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3ZoneInfo
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3ZoneInfo   {
  @JsonProperty("MinZone")
  private Integer minZone = null;

  @JsonProperty("MaxZone")
  private Integer maxZone = null;

  @JsonProperty("UniqueZones")
  @Valid
  private List<Integer> uniqueZones = null;

  public V3ZoneInfo minZone(Integer minZone) {
    this.minZone = minZone;
    return this;
  }

  /**
   * Get minZone
   * @return minZone
  **/
  @Schema(description = "")

  public Integer getMinZone() {
    return minZone;
  }

  public void setMinZone(Integer minZone) {
    this.minZone = minZone;
  }

  public V3ZoneInfo maxZone(Integer maxZone) {
    this.maxZone = maxZone;
    return this;
  }

  /**
   * Get maxZone
   * @return maxZone
  **/
  @Schema(description = "")

  public Integer getMaxZone() {
    return maxZone;
  }

  public void setMaxZone(Integer maxZone) {
    this.maxZone = maxZone;
  }

  public V3ZoneInfo uniqueZones(List<Integer> uniqueZones) {
    this.uniqueZones = uniqueZones;
    return this;
  }

  public V3ZoneInfo addUniqueZonesItem(Integer uniqueZonesItem) {
    if (this.uniqueZones == null) {
      this.uniqueZones = new ArrayList<Integer>();
    }
    this.uniqueZones.add(uniqueZonesItem);
    return this;
  }

  /**
   * Get uniqueZones
   * @return uniqueZones
  **/
  @Schema(description = "")

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
    return Objects.equals(this.minZone, v3ZoneInfo.minZone) &&
        Objects.equals(this.maxZone, v3ZoneInfo.maxZone) &&
        Objects.equals(this.uniqueZones, v3ZoneInfo.uniqueZones);
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
