package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3OutletGeolocationParameters   {
  @JsonProperty("max_distance")
  private Double maxDistance = null;
  @JsonProperty("max_results")
  private Integer maxResults = null;
  /**
   * Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)
   **/
  public V3OutletGeolocationParameters maxDistance(Double maxDistance) {
    this.maxDistance = maxDistance;
    return this;
  }

  
  @Schema(description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)")
  @JsonProperty("max_distance")
  public Double getMaxDistance() {
    return maxDistance;
  }
  public void setMaxDistance(Double maxDistance) {
    this.maxDistance = maxDistance;
  }

  /**
   * Maximum number of results returned (default = 30)
   **/
  public V3OutletGeolocationParameters maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  
  @Schema(description = "Maximum number of results returned (default = 30)")
  @JsonProperty("max_results")
  public Integer getMaxResults() {
    return maxResults;
  }
  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3OutletGeolocationParameters v3OutletGeolocationParameters = (V3OutletGeolocationParameters) o;
    return Objects.equals(maxDistance, v3OutletGeolocationParameters.maxDistance) &&
        Objects.equals(maxResults, v3OutletGeolocationParameters.maxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxDistance, maxResults);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
