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

public class V3OutletGeolocationParameters   {
  
  @Schema(description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)")
 /**
   * Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)  
  **/
  private Double maxDistance = null;
  
  @Schema(description = "Maximum number of results returned (default = 30)")
 /**
   * Maximum number of results returned (default = 30)  
  **/
  private Integer maxResults = null;
 /**
   * Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300)
   * @return maxDistance
  **/
  @JsonProperty("max_distance")
  public Double getMaxDistance() {
    return maxDistance;
  }

  public void setMaxDistance(Double maxDistance) {
    this.maxDistance = maxDistance;
  }

  public V3OutletGeolocationParameters maxDistance(Double maxDistance) {
    this.maxDistance = maxDistance;
    return this;
  }

 /**
   * Maximum number of results returned (default &#x3D; 30)
   * @return maxResults
  **/
  @JsonProperty("max_results")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public V3OutletGeolocationParameters maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3OutletGeolocationParameters {\n");
    
    sb.append("    maxDistance: ").append(toIndentedString(maxDistance)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
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
