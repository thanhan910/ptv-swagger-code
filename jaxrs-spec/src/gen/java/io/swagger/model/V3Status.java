package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3Status   {

  private @Valid String version = null;

public enum HealthEnum {

    NUMBER_0(Integer.valueOf(0)), NUMBER_1(Integer.valueOf(1));


    private Integer value;

    HealthEnum (Integer v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static HealthEnum fromValue(String v) {
        for (HealthEnum b : HealthEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private @Valid HealthEnum health = null;

  /**
   * API Version number
   **/
  public V3Status version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(value = "API Version number")
  @JsonProperty("version")

  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * API system health status (0&#x3D;offline, 1&#x3D;online)
   **/
  public V3Status health(HealthEnum health) {
    this.health = health;
    return this;
  }

  
  @ApiModelProperty(value = "API system health status (0=offline, 1=online)")
  @JsonProperty("health")

  public HealthEnum getHealth() {
    return health;
  }
  public void setHealth(HealthEnum health) {
    this.health = health;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3Status v3Status = (V3Status) o;
    return Objects.equals(version, v3Status.version) &&
        Objects.equals(health, v3Status.health);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, health);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
