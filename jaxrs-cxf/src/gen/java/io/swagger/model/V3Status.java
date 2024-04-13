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

public class V3Status   {
  
  @Schema(description = "API Version number")
 /**
   * API Version number  
  **/
  private String version = null;
  public enum HealthEnum {
    NUMBER_0(0),
    NUMBER_1(1);

    private Integer value;

    HealthEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static HealthEnum fromValue(String text) {
      for (HealthEnum b : HealthEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "API system health status (0=offline, 1=online)")
 /**
   * API system health status (0=offline, 1=online)  
  **/
  private HealthEnum health = null;
 /**
   * API Version number
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public V3Status version(String version) {
    this.version = version;
    return this;
  }

 /**
   * API system health status (0&#x3D;offline, 1&#x3D;online)
   * @return health
  **/
  @JsonProperty("health")
  public Integer getHealth() {
    if (health == null) {
      return null;
    }
    return health.getValue();
  }

  public void setHealth(HealthEnum health) {
    this.health = health;
  }

  public V3Status health(HealthEnum health) {
    this.health = health;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3Status {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
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
