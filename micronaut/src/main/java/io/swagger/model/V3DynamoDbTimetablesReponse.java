package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3DynamoDbTimetable;
import io.swagger.model.V3Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3DynamoDbTimetablesReponse
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3DynamoDbTimetablesReponse   {
  @JsonProperty("timetables")
  @Valid
  private List<V3DynamoDbTimetable> timetables = null;

  @JsonProperty("status")
  private V3Status status = null;

  public V3DynamoDbTimetablesReponse timetables(List<V3DynamoDbTimetable> timetables) {
    this.timetables = timetables;
    return this;
  }

  public V3DynamoDbTimetablesReponse addTimetablesItem(V3DynamoDbTimetable timetablesItem) {
    if (this.timetables == null) {
      this.timetables = new ArrayList<V3DynamoDbTimetable>();
    }
    this.timetables.add(timetablesItem);
    return this;
  }

  /**
   * Get timetables
   * @return timetables
  **/
  @Schema(description = "")
  @Valid
  public List<V3DynamoDbTimetable> getTimetables() {
    return timetables;
  }

  public void setTimetables(List<V3DynamoDbTimetable> timetables) {
    this.timetables = timetables;
  }

  public V3DynamoDbTimetablesReponse status(V3Status status) {
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
    V3DynamoDbTimetablesReponse v3DynamoDbTimetablesReponse = (V3DynamoDbTimetablesReponse) o;
    return Objects.equals(this.timetables, v3DynamoDbTimetablesReponse.timetables) &&
        Objects.equals(this.status, v3DynamoDbTimetablesReponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timetables, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DynamoDbTimetablesReponse {\n");
    
    sb.append("    timetables: ").append(toIndentedString(timetables)).append("\n");
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
