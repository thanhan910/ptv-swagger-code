package io.swagger.model;

import io.swagger.model.V3DynamoDbTimetable;
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

public class V3DynamoDbTimetablesReponse   {
  
  @Schema(description = "")
  private List<V3DynamoDbTimetable> timetables = null;
  
  @Schema(description = "")
  private V3Status status = null;
 /**
   * Get timetables
   * @return timetables
  **/
  @JsonProperty("timetables")
  public List<V3DynamoDbTimetable> getTimetables() {
    return timetables;
  }

  public void setTimetables(List<V3DynamoDbTimetable> timetables) {
    this.timetables = timetables;
  }

  public V3DynamoDbTimetablesReponse timetables(List<V3DynamoDbTimetable> timetables) {
    this.timetables = timetables;
    return this;
  }

  public V3DynamoDbTimetablesReponse addTimetablesItem(V3DynamoDbTimetable timetablesItem) {
    this.timetables.add(timetablesItem);
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

  public V3DynamoDbTimetablesReponse status(V3Status status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
