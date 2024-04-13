package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.V3BulkDeparturesRouteDirectionResponse;
import io.swagger.model.V3Departure;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3BulkDeparturesUpdateResponse   {
  @JsonProperty("departures")
  private List<V3Departure> departures = null;
  @JsonProperty("route_type")
  private Integer routeType = null;
  @JsonProperty("stop_id")
  private Integer stopId = null;
  @JsonProperty("requested_route_direction")
  private V3BulkDeparturesRouteDirectionResponse requestedRouteDirection = null;
  /**
   * The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied.
   */
  public enum RouteDirectionStatusEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    RouteDirectionStatusEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RouteDirectionStatusEnum fromValue(String text) {
      for (RouteDirectionStatusEnum b : RouteDirectionStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("route_direction_status")
  private RouteDirectionStatusEnum routeDirectionStatus = null;
  @JsonProperty("route_direction")
  private V3BulkDeparturesRouteDirectionResponse routeDirection = null;
  /**
   * Timetabled and real-time service departures
   **/
  public V3BulkDeparturesUpdateResponse departures(List<V3Departure> departures) {
    this.departures = departures;
    return this;
  }

  
  @Schema(description = "Timetabled and real-time service departures")
  @JsonProperty("departures")
  public List<V3Departure> getDepartures() {
    return departures;
  }
  public void setDepartures(List<V3Departure> departures) {
    this.departures = departures;
  }

  /**
   * Transport mode identifier
   **/
  public V3BulkDeparturesUpdateResponse routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

  
  @Schema(description = "Transport mode identifier")
  @JsonProperty("route_type")
  public Integer getRouteType() {
    return routeType;
  }
  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  /**
   * Stop identifier
   **/
  public V3BulkDeparturesUpdateResponse stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

  
  @Schema(description = "Stop identifier")
  @JsonProperty("stop_id")
  public Integer getStopId() {
    return stopId;
  }
  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  /**
   **/
  public V3BulkDeparturesUpdateResponse requestedRouteDirection(V3BulkDeparturesRouteDirectionResponse requestedRouteDirection) {
    this.requestedRouteDirection = requestedRouteDirection;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("requested_route_direction")
  public V3BulkDeparturesRouteDirectionResponse getRequestedRouteDirection() {
    return requestedRouteDirection;
  }
  public void setRequestedRouteDirection(V3BulkDeparturesRouteDirectionResponse requestedRouteDirection) {
    this.requestedRouteDirection = requestedRouteDirection;
  }

  /**
   * The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied.
   **/
  public V3BulkDeparturesUpdateResponse routeDirectionStatus(RouteDirectionStatusEnum routeDirectionStatus) {
    this.routeDirectionStatus = routeDirectionStatus;
    return this;
  }

  
  @Schema(description = "The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied.")
  @JsonProperty("route_direction_status")
  public RouteDirectionStatusEnum getRouteDirectionStatus() {
    return routeDirectionStatus;
  }
  public void setRouteDirectionStatus(RouteDirectionStatusEnum routeDirectionStatus) {
    this.routeDirectionStatus = routeDirectionStatus;
  }

  /**
   **/
  public V3BulkDeparturesUpdateResponse routeDirection(V3BulkDeparturesRouteDirectionResponse routeDirection) {
    this.routeDirection = routeDirection;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("route_direction")
  public V3BulkDeparturesRouteDirectionResponse getRouteDirection() {
    return routeDirection;
  }
  public void setRouteDirection(V3BulkDeparturesRouteDirectionResponse routeDirection) {
    this.routeDirection = routeDirection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3BulkDeparturesUpdateResponse v3BulkDeparturesUpdateResponse = (V3BulkDeparturesUpdateResponse) o;
    return Objects.equals(departures, v3BulkDeparturesUpdateResponse.departures) &&
        Objects.equals(routeType, v3BulkDeparturesUpdateResponse.routeType) &&
        Objects.equals(stopId, v3BulkDeparturesUpdateResponse.stopId) &&
        Objects.equals(requestedRouteDirection, v3BulkDeparturesUpdateResponse.requestedRouteDirection) &&
        Objects.equals(routeDirectionStatus, v3BulkDeparturesUpdateResponse.routeDirectionStatus) &&
        Objects.equals(routeDirection, v3BulkDeparturesUpdateResponse.routeDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departures, routeType, stopId, requestedRouteDirection, routeDirectionStatus, routeDirection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3BulkDeparturesUpdateResponse {\n");
    sb.append("    departures: ").append(toIndentedString(departures)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    requestedRouteDirection: ").append(toIndentedString(requestedRouteDirection)).append("\n");
    sb.append("    routeDirectionStatus: ").append(toIndentedString(routeDirectionStatus)).append("\n");
    sb.append("    routeDirection: ").append(toIndentedString(routeDirection)).append("\n");
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
