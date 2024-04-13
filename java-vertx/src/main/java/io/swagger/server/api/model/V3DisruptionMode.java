package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3DisruptionMode
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3DisruptionMode   {
  private String disruptionModeName = null;

  private Integer disruptionMode = null;

  public V3DisruptionMode disruptionModeName(String disruptionModeName) {
    this.disruptionModeName = disruptionModeName;
    return this;
  }

  /**
   * Name of disruption mode
   * @return disruptionModeName
   **/
    public String getDisruptionModeName() {
    return disruptionModeName;
  }

  public void setDisruptionModeName(String disruptionModeName) {
    this.disruptionModeName = disruptionModeName;
  }

  public V3DisruptionMode disruptionMode(Integer disruptionMode) {
    this.disruptionMode = disruptionMode;
    return this;
  }

  /**
   * Disruption mode identifier
   * @return disruptionMode
   **/
    public Integer getDisruptionMode() {
    return disruptionMode;
  }

  public void setDisruptionMode(Integer disruptionMode) {
    this.disruptionMode = disruptionMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DisruptionMode v3DisruptionMode = (V3DisruptionMode) o;
    return Objects.equals(this.disruptionModeName, v3DisruptionMode.disruptionModeName) &&
        Objects.equals(this.disruptionMode, v3DisruptionMode.disruptionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptionModeName, disruptionMode);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
