package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3SearchParameters   {
@XmlType(name="RouteTypesEnum")
@XmlEnum(Integer.class)
public enum RouteTypesEnum {

    @XmlEnumValue("0") _0(Integer.valueOf("0")), @XmlEnumValue("1") _1(Integer.valueOf("1")), @XmlEnumValue("2") _2(Integer.valueOf("2")), @XmlEnumValue("3") _3(Integer.valueOf("3")), @XmlEnumValue("4") _4(Integer.valueOf("4"));


    private Integer value;

    RouteTypesEnum (Integer v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RouteTypesEnum fromValue(String v) {
        for (RouteTypesEnum b : RouteTypesEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private List<RouteTypesEnum> routeTypes = new ArrayList<RouteTypesEnum>();
  private Float latitude = null;
  private Float longitude = null;
  private Float maxDistance = null;
  private Boolean includeAddresses = null;
  private Boolean includeOutlets = null;
  private Boolean matchStopBySuburb = null;
  private Boolean matchRouteBySuburb = null;
  private Boolean matchStopByGtfsStopId = null;

  /**
   * Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
   **/
  public V3SearchParameters routeTypes(List<RouteTypesEnum> routeTypes) {
    this.routeTypes = routeTypes;
    return this;
  }

  
  
  @Schema(description = "Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)")
  @JsonProperty("route_types")
  public List<RouteTypesEnum> getRouteTypes() {
    return routeTypes;
  }
  public void setRouteTypes(List<RouteTypesEnum> routeTypes) {
    this.routeTypes = routeTypes;
  }

  /**
   * Filter by geographic coordinate of latitude
   **/
  public V3SearchParameters latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  
  
  @Schema(description = "Filter by geographic coordinate of latitude")
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  /**
   * Filter by geographic coordinate of longitude
   **/
  public V3SearchParameters longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  
  
  @Schema(description = "Filter by geographic coordinate of longitude")
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  /**
   * Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
   **/
  public V3SearchParameters maxDistance(Float maxDistance) {
    this.maxDistance = maxDistance;
    return this;
  }

  
  
  @Schema(description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters")
  @JsonProperty("max_distance")
  public Float getMaxDistance() {
    return maxDistance;
  }
  public void setMaxDistance(Float maxDistance) {
    this.maxDistance = maxDistance;
  }

  /**
   * Placeholder for future development; currently unavailable
   **/
  public V3SearchParameters includeAddresses(Boolean includeAddresses) {
    this.includeAddresses = includeAddresses;
    return this;
  }

  
  
  @Schema(description = "Placeholder for future development; currently unavailable")
  @JsonProperty("include_addresses")
  public Boolean isIncludeAddresses() {
    return includeAddresses;
  }
  public void setIncludeAddresses(Boolean includeAddresses) {
    this.includeAddresses = includeAddresses;
  }

  /**
   * Indicates if outlets will be returned in response (default &#x3D; true)
   **/
  public V3SearchParameters includeOutlets(Boolean includeOutlets) {
    this.includeOutlets = includeOutlets;
    return this;
  }

  
  
  @Schema(description = "Indicates if outlets will be returned in response (default = true)")
  @JsonProperty("include_outlets")
  public Boolean isIncludeOutlets() {
    return includeOutlets;
  }
  public void setIncludeOutlets(Boolean includeOutlets) {
    this.includeOutlets = includeOutlets;
  }

  /**
   * Indicates whether to find stops by suburbs in the search term (default &#x3D; true)
   **/
  public V3SearchParameters matchStopBySuburb(Boolean matchStopBySuburb) {
    this.matchStopBySuburb = matchStopBySuburb;
    return this;
  }

  
  
  @Schema(description = "Indicates whether to find stops by suburbs in the search term (default = true)")
  @JsonProperty("match_stop_by_suburb")
  public Boolean isMatchStopBySuburb() {
    return matchStopBySuburb;
  }
  public void setMatchStopBySuburb(Boolean matchStopBySuburb) {
    this.matchStopBySuburb = matchStopBySuburb;
  }

  /**
   * Indicates whether to find routes by suburbs in the search term (default &#x3D; true)
   **/
  public V3SearchParameters matchRouteBySuburb(Boolean matchRouteBySuburb) {
    this.matchRouteBySuburb = matchRouteBySuburb;
    return this;
  }

  
  
  @Schema(description = "Indicates whether to find routes by suburbs in the search term (default = true)")
  @JsonProperty("match_route_by_suburb")
  public Boolean isMatchRouteBySuburb() {
    return matchRouteBySuburb;
  }
  public void setMatchRouteBySuburb(Boolean matchRouteBySuburb) {
    this.matchRouteBySuburb = matchRouteBySuburb;
  }

  /**
   * Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false)
   **/
  public V3SearchParameters matchStopByGtfsStopId(Boolean matchStopByGtfsStopId) {
    this.matchStopByGtfsStopId = matchStopByGtfsStopId;
    return this;
  }

  
  
  @Schema(description = "Indicates whether to search for stops according to a metlink stop ID (default = false)")
  @JsonProperty("match_stop_by_gtfs_stop_id")
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
    return Objects.equals(routeTypes, v3SearchParameters.routeTypes) &&
        Objects.equals(latitude, v3SearchParameters.latitude) &&
        Objects.equals(longitude, v3SearchParameters.longitude) &&
        Objects.equals(maxDistance, v3SearchParameters.maxDistance) &&
        Objects.equals(includeAddresses, v3SearchParameters.includeAddresses) &&
        Objects.equals(includeOutlets, v3SearchParameters.includeOutlets) &&
        Objects.equals(matchStopBySuburb, v3SearchParameters.matchStopBySuburb) &&
        Objects.equals(matchRouteBySuburb, v3SearchParameters.matchRouteBySuburb) &&
        Objects.equals(matchStopByGtfsStopId, v3SearchParameters.matchStopByGtfsStopId);
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
