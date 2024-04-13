package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3DisruptionMode   {
  @JsonProperty("disruption_mode_name")
  private String disruptionModeName = null;
  @JsonProperty("disruption_mode")
  private Integer disruptionMode = null;
  /**
   * Name of disruption mode
   **/
  public V3DisruptionMode disruptionModeName(String disruptionModeName) {
    this.disruptionModeName = disruptionModeName;
    return this;
  }

  
  @Schema(description = "Name of disruption mode")
  @JsonProperty("disruption_mode_name")
  public String getDisruptionModeName() {
    return disruptionModeName;
  }
  public void setDisruptionModeName(String disruptionModeName) {
    this.disruptionModeName = disruptionModeName;
  }

  /**
   * Disruption mode identifier
   **/
  public V3DisruptionMode disruptionMode(Integer disruptionMode) {
    this.disruptionMode = disruptionMode;
    return this;
  }

  
  @Schema(description = "Disruption mode identifier")
  @JsonProperty("disruption_mode")
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
    return Objects.equals(disruptionModeName, v3DisruptionMode.disruptionModeName) &&
        Objects.equals(disruptionMode, v3DisruptionMode.disruptionMode);
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
