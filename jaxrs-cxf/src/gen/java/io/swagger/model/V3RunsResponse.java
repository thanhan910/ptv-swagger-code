package io.swagger.model;

import io.swagger.model.V3Run;
import io.swagger.model.V3Status;
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

public class V3RunsResponse   {
  
  @Schema(description = "Individual trips/services of a route")
 /**
   * Individual trips/services of a route  
  **/
  private List<V3Run> runs = null;
  
  @Schema(description = "")
  private V3Status status = null;
 /**
   * Individual trips/services of a route
   * @return runs
  **/
  @JsonProperty("runs")
  public List<V3Run> getRuns() {
    return runs;
  }

  public void setRuns(List<V3Run> runs) {
    this.runs = runs;
  }

  public V3RunsResponse runs(List<V3Run> runs) {
    this.runs = runs;
    return this;
  }

  public V3RunsResponse addRunsItem(V3Run runsItem) {
    this.runs.add(runsItem);
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public V3Status getStatus() {
    return status;
  }

  public void setStatus(V3Status status) {
    this.status = status;
  }

  public V3RunsResponse status(V3Status status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
