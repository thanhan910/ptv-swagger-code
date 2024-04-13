package io.swagger.model;

import javax.validation.constraints.*;

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

public class V3DisruptionMode   {
  
  @Schema(description = "Name of disruption mode")
 /**
   * Name of disruption mode  
  **/
  private String disruptionModeName = null;
  
  @Schema(description = "Disruption mode identifier")
 /**
   * Disruption mode identifier  
  **/
  private Integer disruptionMode = null;
 /**
   * Name of disruption mode
   * @return disruptionModeName
  **/
  @JsonProperty("disruption_mode_name")
  public String getDisruptionModeName() {
    return disruptionModeName;
  }

  public void setDisruptionModeName(String disruptionModeName) {
    this.disruptionModeName = disruptionModeName;
  }

  public V3DisruptionMode disruptionModeName(String disruptionModeName) {
    this.disruptionModeName = disruptionModeName;
    return this;
  }

 /**
   * Disruption mode identifier
   * @return disruptionMode
  **/
  @JsonProperty("disruption_mode")
  public Integer getDisruptionMode() {
    return disruptionMode;
  }

  public void setDisruptionMode(Integer disruptionMode) {
    this.disruptionMode = disruptionMode;
  }

  public V3DisruptionMode disruptionMode(Integer disruptionMode) {
    this.disruptionMode = disruptionMode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DisruptionMode {\n");
    
    sb.append("    disruptionModeName: ").append(toIndentedString(disruptionModeName)).append("\n");
    sb.append("    disruptionMode: ").append(toIndentedString(disruptionMode)).append("\n");
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
