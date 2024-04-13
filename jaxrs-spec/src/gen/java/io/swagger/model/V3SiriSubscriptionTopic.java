package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3SiriSubscriptionTopic   {

  private @Valid String lineRef = null;

public enum DirectionRefEnum {

    NUMBER_1(Integer.valueOf(1)), NUMBER_2(Integer.valueOf(2)), NUMBER_5(Integer.valueOf(5)), NUMBER_10(Integer.valueOf(10)), NUMBER_16(Integer.valueOf(16)), NUMBER_32(Integer.valueOf(32)), NUMBER_65(Integer.valueOf(65)), NUMBER_130(Integer.valueOf(130));


    private Integer value;

    DirectionRefEnum (Integer v) {
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
    public static DirectionRefEnum fromValue(String v) {
        for (DirectionRefEnum b : DirectionRefEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private @Valid DirectionRefEnum directionRef = null;

public enum RouteTypeEnum {

    NUMBER_0(Integer.valueOf(0)), NUMBER_1(Integer.valueOf(1)), NUMBER_2(Integer.valueOf(2)), NUMBER_3(Integer.valueOf(3)), NUMBER_4(Integer.valueOf(4));


    private Integer value;

    RouteTypeEnum (Integer v) {
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
    public static RouteTypeEnum fromValue(String v) {
        for (RouteTypeEnum b : RouteTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private @Valid RouteTypeEnum routeType = null;

  /**
   * Siri LineRef
   **/
  public V3SiriSubscriptionTopic lineRef(String lineRef) {
    this.lineRef = lineRef;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Siri LineRef")
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
  public V3SiriSubscriptionTopic directionRef(DirectionRefEnum directionRef) {
    this.directionRef = directionRef;
    return this;
  }

  
  @ApiModelProperty(value = "Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)")
  @JsonProperty("direction_ref")

  public DirectionRefEnum getDirectionRef() {
    return directionRef;
  }
  public void setDirectionRef(DirectionRefEnum directionRef) {
    this.directionRef = directionRef;
  }

  /**
   * Route Type eg. 0 (Train) 1 (Tram) 2 (Bus) 3 (Vline) 4 (NightRider)
   **/
  public V3SiriSubscriptionTopic routeType(RouteTypeEnum routeType) {
    this.routeType = routeType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Route Type eg. 0 (Train) 1 (Tram) 2 (Bus) 3 (Vline) 4 (NightRider)")
  @JsonProperty("route_type")
  @NotNull

  public RouteTypeEnum getRouteType() {
    return routeType;
  }
  public void setRouteType(RouteTypeEnum routeType) {
    this.routeType = routeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriSubscriptionTopic v3SiriSubscriptionTopic = (V3SiriSubscriptionTopic) o;
    return Objects.equals(lineRef, v3SiriSubscriptionTopic.lineRef) &&
        Objects.equals(directionRef, v3SiriSubscriptionTopic.directionRef) &&
        Objects.equals(routeType, v3SiriSubscriptionTopic.routeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineRef, directionRef, routeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriSubscriptionTopic {\n");
    
    sb.append("    lineRef: ").append(toIndentedString(lineRef)).append("\n");
    sb.append("    directionRef: ").append(toIndentedString(directionRef)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
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
