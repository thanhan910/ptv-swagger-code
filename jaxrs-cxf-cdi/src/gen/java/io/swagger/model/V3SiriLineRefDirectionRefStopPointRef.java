package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3SiriLineRefDirectionRefStopPointRef   {
  private String lineRef = null;
@XmlType(name="DirectionRefEnum")
@XmlEnum(Integer.class)
public enum DirectionRefEnum {

    @XmlEnumValue(1) NUMBER_1(Integer.valueOf(1)), @XmlEnumValue(2) NUMBER_2(Integer.valueOf(2)), @XmlEnumValue(5) NUMBER_5(Integer.valueOf(5)), @XmlEnumValue(10) NUMBER_10(Integer.valueOf(10)), @XmlEnumValue(16) NUMBER_16(Integer.valueOf(16)), @XmlEnumValue(32) NUMBER_32(Integer.valueOf(32)), @XmlEnumValue(65) NUMBER_65(Integer.valueOf(65)), @XmlEnumValue(130) NUMBER_130(Integer.valueOf(130));


    private Integer value;

    DirectionRefEnum (Integer v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DirectionRefEnum fromValue(String v) {
        for (DirectionRefEnum b : DirectionRefEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private DirectionRefEnum directionRef = null;
  private Integer stopPointRef = null;

  /**
   * Siri LineRef
   **/
  public V3SiriLineRefDirectionRefStopPointRef lineRef(String lineRef) {
    this.lineRef = lineRef;
    return this;
  }

  
  
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
  public V3SiriLineRefDirectionRefStopPointRef directionRef(DirectionRefEnum directionRef) {
    this.directionRef = directionRef;
    return this;
  }

  
  
  @Schema(required = true, description = "Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)")
  @JsonProperty("direction_ref")
  @NotNull
  public DirectionRefEnum getDirectionRef() {
    return directionRef;
  }
  public void setDirectionRef(DirectionRefEnum directionRef) {
    this.directionRef = directionRef;
  }

  /**
   * Siri StopPointRef
   **/
  public V3SiriLineRefDirectionRefStopPointRef stopPointRef(Integer stopPointRef) {
    this.stopPointRef = stopPointRef;
    return this;
  }

  
  
  @Schema(required = true, description = "Siri StopPointRef")
  @JsonProperty("stop_point_ref")
  @NotNull
  public Integer getStopPointRef() {
    return stopPointRef;
  }
  public void setStopPointRef(Integer stopPointRef) {
    this.stopPointRef = stopPointRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriLineRefDirectionRefStopPointRef v3SiriLineRefDirectionRefStopPointRef = (V3SiriLineRefDirectionRefStopPointRef) o;
    return Objects.equals(lineRef, v3SiriLineRefDirectionRefStopPointRef.lineRef) &&
        Objects.equals(directionRef, v3SiriLineRefDirectionRefStopPointRef.directionRef) &&
        Objects.equals(stopPointRef, v3SiriLineRefDirectionRefStopPointRef.stopPointRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineRef, directionRef, stopPointRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriLineRefDirectionRefStopPointRef {\n");
    
    sb.append("    lineRef: ").append(toIndentedString(lineRef)).append("\n");
    sb.append("    directionRef: ").append(toIndentedString(directionRef)).append("\n");
    sb.append("    stopPointRef: ").append(toIndentedString(stopPointRef)).append("\n");
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
