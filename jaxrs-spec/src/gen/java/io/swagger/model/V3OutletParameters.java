package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3OutletParameters   {

  private @Valid Integer maxResults = null;

  /**
   * Maximum number of results returned (default &#x3D; 30)
   **/
  public V3OutletParameters maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  
  @ApiModelProperty(value = "Maximum number of results returned (default = 30)")
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
    V3OutletParameters v3OutletParameters = (V3OutletParameters) o;
    return Objects.equals(maxResults, v3OutletParameters.maxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3OutletParameters {\n");
    
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
