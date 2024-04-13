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

public class V3SiriLineRef   {
  
  @Schema(required = true, description = "Siri LineRef")
 /**
   * Siri LineRef  
  **/
  private String lineRef = null;
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
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static DirectionRefEnum fromValue(String text) {
      for (DirectionRefEnum b : DirectionRefEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)")
 /**
   * Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)  
  **/
  private DirectionRefEnum directionRef = null;
 /**
   * Siri LineRef
   * @return lineRef
  **/
  @JsonProperty("line_ref")
  @NotNull
  public String getLineRef() {
    return lineRef;
  }

  public void setLineRef(String lineRef) {
    this.lineRef = lineRef;
  }

  public V3SiriLineRef lineRef(String lineRef) {
    this.lineRef = lineRef;
    return this;
  }

 /**
   * Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
   * @return directionRef
  **/
  @JsonProperty("direction_ref")
  public Integer getDirectionRef() {
    if (directionRef == null) {
      return null;
    }
    return directionRef.getValue();
  }

  public void setDirectionRef(DirectionRefEnum directionRef) {
    this.directionRef = directionRef;
  }

  public V3SiriLineRef directionRef(DirectionRefEnum directionRef) {
    this.directionRef = directionRef;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
