package io.swagger.model;


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

public class V3BulkDeparturesStopResponse   {
  
  @Schema(description = "Name of stop")
 /**
   * Name of stop  
  **/
  private String stopName = null;
  
  @Schema(description = "Stop identifier")
 /**
   * Stop identifier  
  **/
  private Integer stopId = null;
  
  @Schema(description = "Geographic coordinate of latitude at stop")
 /**
   * Geographic coordinate of latitude at stop  
  **/
  private Float stopLatitude = null;
  
  @Schema(description = "Geographic coordinate of longitude at stop")
 /**
   * Geographic coordinate of longitude at stop  
  **/
  private Float stopLongitude = null;
  
  @Schema(description = "suburb of stop")
 /**
   * suburb of stop  
  **/
  private String stopSuburb = null;
  
  @Schema(description = "Landmark in proximity of stop")
 /**
   * Landmark in proximity of stop  
  **/
  private String stopLandmark = null;
 /**
   * Name of stop
   * @return stopName
  **/
  @JsonProperty("stop_name")
  public String getStopName() {
    return stopName;
  }

  public void setStopName(String stopName) {
    this.stopName = stopName;
  }

  public V3BulkDeparturesStopResponse stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

 /**
   * Stop identifier
   * @return stopId
  **/
  @JsonProperty("stop_id")
  public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  public V3BulkDeparturesStopResponse stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

 /**
   * Geographic coordinate of latitude at stop
   * @return stopLatitude
  **/
  @JsonProperty("stop_latitude")
  public Float getStopLatitude() {
    return stopLatitude;
  }

  public void setStopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
  }

  public V3BulkDeparturesStopResponse stopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
    return this;
  }

 /**
   * Geographic coordinate of longitude at stop
   * @return stopLongitude
  **/
  @JsonProperty("stop_longitude")
  public Float getStopLongitude() {
    return stopLongitude;
  }

  public void setStopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
  }

  public V3BulkDeparturesStopResponse stopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
    return this;
  }

 /**
   * suburb of stop
   * @return stopSuburb
  **/
  @JsonProperty("stop_suburb")
  public String getStopSuburb() {
    return stopSuburb;
  }

  public void setStopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
  }

  public V3BulkDeparturesStopResponse stopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
    return this;
  }

 /**
   * Landmark in proximity of stop
   * @return stopLandmark
  **/
  @JsonProperty("stop_landmark")
  public String getStopLandmark() {
    return stopLandmark;
  }

  public void setStopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
  }

  public V3BulkDeparturesStopResponse stopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3BulkDeparturesStopResponse {\n");
    
    sb.append("    stopName: ").append(toIndentedString(stopName)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    stopLatitude: ").append(toIndentedString(stopLatitude)).append("\n");
    sb.append("    stopLongitude: ").append(toIndentedString(stopLongitude)).append("\n");
    sb.append("    stopSuburb: ").append(toIndentedString(stopSuburb)).append("\n");
    sb.append("    stopLandmark: ").append(toIndentedString(stopLandmark)).append("\n");
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
