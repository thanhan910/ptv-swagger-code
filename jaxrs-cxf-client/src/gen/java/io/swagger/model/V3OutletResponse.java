package io.swagger.model;

import io.swagger.model.V3Outlet;
import io.swagger.model.V3Status;
import java.util.ArrayList;
import java.util.List;

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

public class V3OutletResponse   {
  
  @Schema(description = "myki ticket outlets")
 /**
   * myki ticket outlets  
  **/
  private List<V3Outlet> outlets = null;
  
  @Schema(description = "")
  private V3Status status = null;
 /**
   * myki ticket outlets
   * @return outlets
  **/
  @JsonProperty("outlets")
  public List<V3Outlet> getOutlets() {
    return outlets;
  }

  public void setOutlets(List<V3Outlet> outlets) {
    this.outlets = outlets;
  }

  public V3OutletResponse outlets(List<V3Outlet> outlets) {
    this.outlets = outlets;
    return this;
  }

  public V3OutletResponse addOutletsItem(V3Outlet outletsItem) {
    this.outlets.add(outletsItem);
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

  public V3OutletResponse status(V3Status status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3OutletResponse {\n");
    
    sb.append("    outlets: ").append(toIndentedString(outlets)).append("\n");
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
