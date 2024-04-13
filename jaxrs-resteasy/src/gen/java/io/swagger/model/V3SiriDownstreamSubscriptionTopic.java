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
public class V3SiriDownstreamSubscriptionTopic   {
  private String lineRef = null;  /**
   * Gets or Sets directionRef
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
  private DirectionRefEnum directionRef = null;  /**
   * Gets or Sets routeType
   */
  public enum RouteTypeEnum {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4);
    private Integer value;

    RouteTypeEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RouteTypeEnum routeType = null;

  /**
   **/
  
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
