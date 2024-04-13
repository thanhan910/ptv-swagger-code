package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3SiriDownstreamSubscriptionTopic   {
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
@XmlType(name="RouteTypeEnum")
@XmlEnum(Integer.class)
public enum RouteTypeEnum {

    @XmlEnumValue(0) NUMBER_0(Integer.valueOf(0)), @XmlEnumValue(1) NUMBER_1(Integer.valueOf(1)), @XmlEnumValue(2) NUMBER_2(Integer.valueOf(2)), @XmlEnumValue(3) NUMBER_3(Integer.valueOf(3)), @XmlEnumValue(4) NUMBER_4(Integer.valueOf(4));


    private Integer value;

    RouteTypeEnum (Integer v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RouteTypeEnum fromValue(String v) {
        for (RouteTypeEnum b : RouteTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private RouteTypeEnum routeType = null;

  /**
   **/
  public V3SiriDownstreamSubscriptionTopic lineRef(String lineRef) {
    this.lineRef = lineRef;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("line_ref")
  public String getLineRef() {
    return lineRef;
  }
  public void setLineRef(String lineRef) {
    this.lineRef = lineRef;
  }

  /**
   **/
  public V3SiriDownstreamSubscriptionTopic directionRef(DirectionRefEnum directionRef) {
    this.directionRef = directionRef;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("direction_ref")
  public DirectionRefEnum getDirectionRef() {
    return directionRef;
  }
  public void setDirectionRef(DirectionRefEnum directionRef) {
    this.directionRef = directionRef;
  }

  /**
   **/
  public V3SiriDownstreamSubscriptionTopic routeType(RouteTypeEnum routeType) {
    this.routeType = routeType;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("route_type")
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
    V3SiriDownstreamSubscriptionTopic v3SiriDownstreamSubscriptionTopic = (V3SiriDownstreamSubscriptionTopic) o;
    return Objects.equals(lineRef, v3SiriDownstreamSubscriptionTopic.lineRef) &&
        Objects.equals(directionRef, v3SiriDownstreamSubscriptionTopic.directionRef) &&
        Objects.equals(routeType, v3SiriDownstreamSubscriptionTopic.routeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineRef, directionRef, routeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriDownstreamSubscriptionTopic {\n");
    
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
