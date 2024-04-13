package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3Run;
import io.swagger.model.V3Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3RunsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3RunsResponse   {
  @JsonProperty("runs")
  @Valid
  private List<V3Run> runs = null;

  @JsonProperty("status")
  private V3Status status = null;

  public V3RunsResponse runs(List<V3Run> runs) {
    this.runs = runs;
    return this;
  }

  public V3RunsResponse addRunsItem(V3Run runsItem) {
    if (this.runs == null) {
      this.runs = new ArrayList<V3Run>();
    }
    this.runs.add(runsItem);
    return this;
  }

  /**
   * Individual trips/services of a route
   * @return runs
   **/
  @Schema(description = "Individual trips/services of a route")
      @Valid
    public List<V3Run> getRuns() {
    return runs;
  }

  public void setRuns(List<V3Run> runs) {
    this.runs = runs;
  }

  public V3RunsResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
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
    return Objects.equals(this.runs, v3RunsResponse.runs) &&
        Objects.equals(this.status, v3RunsResponse.status);
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
