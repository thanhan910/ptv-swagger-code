package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3SiriLineRef   {
  private String lineRef = null;  /**
   * Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
   */
  public enum DirectionRefEnum {
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_5(5),
    NUMBER_10(10),
    NUMBER_16(16),
    NUMBER_32(32),
    NUMBER_65(65),
    NUMBER_130(130);
    private Integer value;

    DirectionRefEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionRefEnum directionRef = null;

  /**
   * Siri LineRef
   **/
  
  @Schema(required = true, description = "Siri LineRef")
  @JsonProperty("line_ref")
  @NotNull
  public String getLineRef() {
    return lineRef;
  }
  public void setLineRef(String lineRef) {
    this.lineRef = lineRef;
  }

  /**
   * Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
   **/
  
  @Schema(description = "Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)")
  @JsonProperty("direction_ref")
  public DirectionRefEnum getDirectionRef() {
    return directionRef;
  }
  public void setDirectionRef(DirectionRefEnum directionRef) {
    this.directionRef = directionRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriLineRef v3SiriLineRef = (V3SiriLineRef) o;
    return Objects.equals(lineRef, v3SiriLineRef.lineRef) &&
        Objects.equals(directionRef, v3SiriLineRef.directionRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineRef, directionRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriLineRef {\n");
    
    sb.append("    lineRef: ").append(toIndentedString(lineRef)).append("\n");
    sb.append("    directionRef: ").append(toIndentedString(directionRef)).append("\n");
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
