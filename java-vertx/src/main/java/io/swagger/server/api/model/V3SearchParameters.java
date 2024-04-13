package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3SearchParameters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3SearchParameters   {
  /**
   * Gets or Sets routeTypes
   */
  public enum RouteTypesEnum {
    _0("0"),
    _1("1"),
    _2("2"),
    _3("3"),
    _4("4");

    private Integer value;

    RouteTypesEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RouteTypesEnum fromValue(Integer value) {
      for (RouteTypesEnum b : RouteTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  
  private List<RouteTypesEnum> routeTypes = null;

  private Float latitude = null;

  private Float longitude = null;

  private Float maxDistance = null;

  private Boolean includeAddresses = null;

  private Boolean includeOutlets = null;

  private Boolean matchStopBySuburb = null;

  private Boolean matchRouteBySuburb = null;

  private Boolean matchStopByGtfsStopId = null;

  public V3SearchParameters routeTypes(List<RouteTypesEnum> routeTypes) {
    this.routeTypes = routeTypes;
    return this;
  }

  public V3SearchParameters addRouteTypesItem(RouteTypesEnum routeTypesItem) {
    if (this.routeTypes == null) {
      this.routeTypes = new ArrayList<RouteTypesEnum>();
    }
    this.routeTypes.add(routeTypesItem);
    return this;
  }

  /**
   * Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
   * @return routeTypes
   **/
    public List<RouteTypesEnum> getRouteTypes() {
    return routeTypes;
  }

  public void setRouteTypes(List<RouteTypesEnum> routeTypes) {
    this.routeTypes = routeTypes;
  }

  public V3SearchParameters latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Filter by geographic coordinate of latitude
   * @return latitude
   **/
    public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public V3SearchParameters longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Filter by geographic coordinate of longitude
   * @return longitude
   **/
    public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public V3SearchParameters maxDistance(Float maxDistance) {
    this.maxDistance = maxDistance;
    return this;
  }

  /**
   * Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
   * @return maxDistance
   **/
    public Float getMaxDistance() {
    return maxDistance;
  }

  public void setMaxDistance(Float maxDistance) {
    this.maxDistance = maxDistance;
  }

  public V3SearchParameters includeAddresses(Boolean includeAddresses) {
    this.includeAddresses = includeAddresses;
    return this;
  }

  /**
   * Placeholder for future development; currently unavailable
   * @return includeAddresses
   **/
    public Boolean isIncludeAddresses() {
    return includeAddresses;
  }

  public void setIncludeAddresses(Boolean includeAddresses) {
    this.includeAddresses = includeAddresses;
  }

  public V3SearchParameters includeOutlets(Boolean includeOutlets) {
    this.includeOutlets = includeOutlets;
    return this;
  }

  /**
   * Indicates if outlets will be returned in response (default = true)
   * @return includeOutlets
   **/
    public Boolean isIncludeOutlets() {
    return includeOutlets;
  }

  public void setIncludeOutlets(Boolean includeOutlets) {
    this.includeOutlets = includeOutlets;
  }

  public V3SearchParameters matchStopBySuburb(Boolean matchStopBySuburb) {
    this.matchStopBySuburb = matchStopBySuburb;
    return this;
  }

  /**
   * Indicates whether to find stops by suburbs in the search term (default = true)
   * @return matchStopBySuburb
   **/
    public Boolean isMatchStopBySuburb() {
    return matchStopBySuburb;
  }

  public void setMatchStopBySuburb(Boolean matchStopBySuburb) {
    this.matchStopBySuburb = matchStopBySuburb;
  }

  public V3SearchParameters matchRouteBySuburb(Boolean matchRouteBySuburb) {
    this.matchRouteBySuburb = matchRouteBySuburb;
    return this;
  }

  /**
   * Indicates whether to find routes by suburbs in the search term (default = true)
   * @return matchRouteBySuburb
   **/
    public Boolean isMatchRouteBySuburb() {
    return matchRouteBySuburb;
  }

  public void setMatchRouteBySuburb(Boolean matchRouteBySuburb) {
    this.matchRouteBySuburb = matchRouteBySuburb;
  }

  public V3SearchParameters matchStopByGtfsStopId(Boolean matchStopByGtfsStopId) {
    this.matchStopByGtfsStopId = matchStopByGtfsStopId;
    return this;
  }

  /**
   * Indicates whether to search for stops according to a metlink stop ID (default = false)
   * @return matchStopByGtfsStopId
   **/
    public Boolean isMatchStopByGtfsStopId() {
    return matchStopByGtfsStopId;
  }

  public void setMatchStopByGtfsStopId(Boolean matchStopByGtfsStopId) {
    this.matchStopByGtfsStopId = matchStopByGtfsStopId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SearchParameters v3SearchParameters = (V3SearchParameters) o;
    return Objects.equals(this.routeTypes, v3SearchParameters.routeTypes) &&
        Objects.equals(this.latitude, v3SearchParameters.latitude) &&
        Objects.equals(this.longitude, v3SearchParameters.longitude) &&
        Objects.equals(this.maxDistance, v3SearchParameters.maxDistance) &&
        Objects.equals(this.includeAddresses, v3SearchParameters.includeAddresses) &&
        Objects.equals(this.includeOutlets, v3SearchParameters.includeOutlets) &&
        Objects.equals(this.matchStopBySuburb, v3SearchParameters.matchStopBySuburb) &&
        Objects.equals(this.matchRouteBySuburb, v3SearchParameters.matchRouteBySuburb) &&
        Objects.equals(this.matchStopByGtfsStopId, v3SearchParameters.matchStopByGtfsStopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeTypes, latitude, longitude, maxDistance, includeAddresses, includeOutlets, matchStopBySuburb, matchRouteBySuburb, matchStopByGtfsStopId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SearchParameters {\n");
    
    sb.append("    routeTypes: ").append(toIndentedString(routeTypes)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    maxDistance: ").append(toIndentedString(maxDistance)).append("\n");
    sb.append("    includeAddresses: ").append(toIndentedString(includeAddresses)).append("\n");
    sb.append("    includeOutlets: ").append(toIndentedString(includeOutlets)).append("\n");
    sb.append("    matchStopBySuburb: ").append(toIndentedString(matchStopBySuburb)).append("\n");
    sb.append("    matchRouteBySuburb: ").append(toIndentedString(matchRouteBySuburb)).append("\n");
    sb.append("    matchStopByGtfsStopId: ").append(toIndentedString(matchStopByGtfsStopId)).append("\n");
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
