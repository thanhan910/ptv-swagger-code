package io.swagger.model;

import java.util.ArrayList;
import java.util.List;

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

public class V3ZoneInfo   {
  
  @Schema(description = "")
  private Integer minZone = null;
  
  @Schema(description = "")
  private Integer maxZone = null;
  
  @Schema(description = "")
  private List<Integer> uniqueZones = null;
 /**
   * Get minZone
   * @return minZone
  **/
  @JsonProperty("MinZone")
  public Integer getMinZone() {
    return minZone;
  }

  public void setMinZone(Integer minZone) {
    this.minZone = minZone;
  }

  public V3ZoneInfo minZone(Integer minZone) {
    this.minZone = minZone;
    return this;
  }

 /**
   * Get maxZone
   * @return maxZone
  **/
  @JsonProperty("MaxZone")
  public Integer getMaxZone() {
    return maxZone;
  }

  public void setMaxZone(Integer maxZone) {
    this.maxZone = maxZone;
  }

  public V3ZoneInfo maxZone(Integer maxZone) {
    this.maxZone = maxZone;
    return this;
  }

 /**
   * Get uniqueZones
   * @return uniqueZones
  **/
  @JsonProperty("UniqueZones")
  public List<Integer> getUniqueZones() {
    return uniqueZones;
  }

  public void setUniqueZones(List<Integer> uniqueZones) {
    this.uniqueZones = uniqueZones;
  }

  public V3ZoneInfo uniqueZones(List<Integer> uniqueZones) {
    this.uniqueZones = uniqueZones;
    return this;
  }

  public V3ZoneInfo addUniqueZonesItem(Integer uniqueZonesItem) {
    this.uniqueZones.add(uniqueZonesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
