package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3Run;
import io.swagger.model.V3Status;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3RunsResponse   {
  private List<V3Run> runs = new ArrayList<V3Run>();
  private V3Status status = null;

  /**
   * Individual trips/services of a route
   **/
  public V3RunsResponse runs(List<V3Run> runs) {
    this.runs = runs;
    return this;
  }

  
  
  @Schema(description = "Individual trips/services of a route")
  @JsonProperty("runs")
  @Valid
  public List<V3Run> getRuns() {
    return runs;
  }
  public void setRuns(List<V3Run> runs) {
    this.runs = runs;
  }

  /**
   **/
  public V3RunsResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("status")
  @Valid
  public V3Status getStatus() {
    return status;
  }
  public void setStatus(V3Status status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3RunsResponse v3RunsResponse = (V3RunsResponse) o;
    return Objects.equals(runs, v3RunsResponse.runs) &&
        Objects.equals(status, v3RunsResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runs, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3RunsResponse {\n");
    
    sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
