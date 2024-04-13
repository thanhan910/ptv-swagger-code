package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
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

public class V3SearchParameters   {
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
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static RouteTypesEnum fromValue(String text) {
      for (RouteTypesEnum b : RouteTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)")
 /**
   * Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)  
  **/
  private List<RouteTypesEnum> routeTypes = null;
  
  @Schema(description = "Filter by geographic coordinate of latitude")
 /**
   * Filter by geographic coordinate of latitude  
  **/
  private Float latitude = null;
  
  @Schema(description = "Filter by geographic coordinate of longitude")
 /**
   * Filter by geographic coordinate of longitude  
  **/
  private Float longitude = null;
  
  @Schema(description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters")
 /**
   * Filter by maximum distance (in metres) from location specified via latitude and longitude parameters  
  **/
  private Float maxDistance = null;
  
  @Schema(description = "Placeholder for future development; currently unavailable")
 /**
   * Placeholder for future development; currently unavailable  
  **/
  private Boolean includeAddresses = null;
  
  @Schema(description = "Indicates if outlets will be returned in response (default = true)")
 /**
   * Indicates if outlets will be returned in response (default = true)  
  **/
  private Boolean includeOutlets = null;
  
  @Schema(description = "Indicates whether to find stops by suburbs in the search term (default = true)")
 /**
   * Indicates whether to find stops by suburbs in the search term (default = true)  
  **/
  private Boolean matchStopBySuburb = null;
  
  @Schema(description = "Indicates whether to find routes by suburbs in the search term (default = true)")
 /**
   * Indicates whether to find routes by suburbs in the search term (default = true)  
  **/
  private Boolean matchRouteBySuburb = null;
  
  @Schema(description = "Indicates whether to search for stops according to a metlink stop ID (default = false)")
 /**
   * Indicates whether to search for stops according to a metlink stop ID (default = false)  
  **/
  private Boolean matchStopByGtfsStopId = null;
 /**
   * Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
   * @return routeTypes
  **/
  @JsonProperty("route_types")
  public List<RouteTypesEnum> getRouteTypes() {
    return routeTypes;
  }

  public void setRouteTypes(List<RouteTypesEnum> routeTypes) {
    this.routeTypes = routeTypes;
  }

  public V3SearchParameters routeTypes(List<RouteTypesEnum> routeTypes) {
    this.routeTypes = routeTypes;
    return this;
  }

  public V3SearchParameters addRouteTypesItem(RouteTypesEnum routeTypesItem) {
    this.routeTypes.add(routeTypesItem);
    return this;
  }

 /**
   * Filter by geographic coordinate of latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public V3SearchParameters latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Filter by geographic coordinate of longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public V3SearchParameters longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
   * @return maxDistance
  **/
  @JsonProperty("max_distance")
  public Float getMaxDistance() {
    return maxDistance;
  }

  public void setMaxDistance(Float maxDistance) {
    this.maxDistance = maxDistance;
  }

  public V3SearchParameters maxDistance(Float maxDistance) {
    this.maxDistance = maxDistance;
    return this;
  }

 /**
   * Placeholder for future development; currently unavailable
   * @return includeAddresses
  **/
  @JsonProperty("include_addresses")
  public Boolean isIncludeAddresses() {
    return includeAddresses;
  }

  public void setIncludeAddresses(Boolean includeAddresses) {
    this.includeAddresses = includeAddresses;
  }

  public V3SearchParameters includeAddresses(Boolean includeAddresses) {
    this.includeAddresses = includeAddresses;
    return this;
  }

 /**
   * Indicates if outlets will be returned in response (default &#x3D; true)
   * @return includeOutlets
  **/
  @JsonProperty("include_outlets")
  public Boolean isIncludeOutlets() {
    return includeOutlets;
  }

  public void setIncludeOutlets(Boolean includeOutlets) {
    this.includeOutlets = includeOutlets;
  }

  public V3SearchParameters includeOutlets(Boolean includeOutlets) {
    this.includeOutlets = includeOutlets;
    return this;
  }

 /**
   * Indicates whether to find stops by suburbs in the search term (default &#x3D; true)
   * @return matchStopBySuburb
  **/
  @JsonProperty("match_stop_by_suburb")
  public Boolean isMatchStopBySuburb() {
    return matchStopBySuburb;
  }

  public void setMatchStopBySuburb(Boolean matchStopBySuburb) {
    this.matchStopBySuburb = matchStopBySuburb;
  }

  public V3SearchParameters matchStopBySuburb(Boolean matchStopBySuburb) {
    this.matchStopBySuburb = matchStopBySuburb;
    return this;
  }

 /**
   * Indicates whether to find routes by suburbs in the search term (default &#x3D; true)
   * @return matchRouteBySuburb
  **/
  @JsonProperty("match_route_by_suburb")
  public Boolean isMatchRouteBySuburb() {
    return matchRouteBySuburb;
  }

  public void setMatchRouteBySuburb(Boolean matchRouteBySuburb) {
    this.matchRouteBySuburb = matchRouteBySuburb;
  }

  public V3SearchParameters matchRouteBySuburb(Boolean matchRouteBySuburb) {
    this.matchRouteBySuburb = matchRouteBySuburb;
    return this;
  }

 /**
   * Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false)
   * @return matchStopByGtfsStopId
  **/
  @JsonProperty("match_stop_by_gtfs_stop_id")
  public Boolean isMatchStopByGtfsStopId() {
    return matchStopByGtfsStopId;
  }

  public void setMatchStopByGtfsStopId(Boolean matchStopByGtfsStopId) {
    this.matchStopByGtfsStopId = matchStopByGtfsStopId;
  }

  public V3SearchParameters matchStopByGtfsStopId(Boolean matchStopByGtfsStopId) {
    this.matchStopByGtfsStopId = matchStopByGtfsStopId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
