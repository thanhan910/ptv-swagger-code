package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3SiriLineRefDirectionRefStopPointRef   {
  @JsonProperty("line_ref")
  private String lineRef = null;
  /**
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
  @JsonProperty("direction_ref")
  private DirectionRefEnum directionRef = null;
  @JsonProperty("stop_point_ref")
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
