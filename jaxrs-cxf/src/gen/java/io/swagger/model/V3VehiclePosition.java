package io.swagger.model;

import java.util.Date;
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

public class V3VehiclePosition   {
  
  @Schema(description = "Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs.")
 /**
   * Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs.  
  **/
  private Double latitude = null;
  
  @Schema(description = "Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs.")
 /**
   * Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs.  
  **/
  private Double longitude = null;
  
  @Schema(description = "CIS - Metro Train Vehicle Location Easting coordinate")
 /**
   * CIS - Metro Train Vehicle Location Easting coordinate  
  **/
  private Double easting = null;
  
  @Schema(description = "CIS - Metro Train Vehicle Location Northing coordinate")
 /**
   * CIS - Metro Train Vehicle Location Northing coordinate  
  **/
  private Double northing = null;
  
  @Schema(description = "CIS - Metro Train Vehicle Location Direction")
 /**
   * CIS - Metro Train Vehicle Location Direction  
  **/
  private String direction = null;
  
  @Schema(description = "Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs.")
 /**
   * Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs.  
  **/
  private Double bearing = null;
  
  @Schema(description = "Supplier of vehicle position data.")
 /**
   * Supplier of vehicle position data.  
  **/
  private String supplier = null;
  
  @Schema(description = "Date and time that the vehicle position data was supplied.")
 /**
   * Date and time that the vehicle position data was supplied.  
  **/
  private Date datetimeUtc = null;
  
  @Schema(description = "CIS - Metro Train Vehicle Location data expiry time")
 /**
   * CIS - Metro Train Vehicle Location data expiry time  
  **/
  private Date expiryTime = null;
 /**
   * Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs.
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public V3VehiclePosition latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs.
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public V3VehiclePosition longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * CIS - Metro Train Vehicle Location Easting coordinate
   * @return easting
  **/
  @JsonProperty("easting")
  public Double getEasting() {
    return easting;
  }

  public void setEasting(Double easting) {
    this.easting = easting;
  }

  public V3VehiclePosition easting(Double easting) {
    this.easting = easting;
    return this;
  }

 /**
   * CIS - Metro Train Vehicle Location Northing coordinate
   * @return northing
  **/
  @JsonProperty("northing")
  public Double getNorthing() {
    return northing;
  }

  public void setNorthing(Double northing) {
    this.northing = northing;
  }

  public V3VehiclePosition northing(Double northing) {
    this.northing = northing;
    return this;
  }

 /**
   * CIS - Metro Train Vehicle Location Direction
   * @return direction
  **/
  @JsonProperty("direction")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public V3VehiclePosition direction(String direction) {
    this.direction = direction;
    return this;
  }

 /**
   * Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs.
   * @return bearing
  **/
  @JsonProperty("bearing")
  public Double getBearing() {
    return bearing;
  }

  public void setBearing(Double bearing) {
    this.bearing = bearing;
  }

  public V3VehiclePosition bearing(Double bearing) {
    this.bearing = bearing;
    return this;
  }

 /**
   * Supplier of vehicle position data.
   * @return supplier
  **/
  @JsonProperty("supplier")
  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public V3VehiclePosition supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

 /**
   * Date and time that the vehicle position data was supplied.
   * @return datetimeUtc
  **/
  @JsonProperty("datetime_utc")
  public Date getDatetimeUtc() {
    return datetimeUtc;
  }

  public void setDatetimeUtc(Date datetimeUtc) {
    this.datetimeUtc = datetimeUtc;
  }

  public V3VehiclePosition datetimeUtc(Date datetimeUtc) {
    this.datetimeUtc = datetimeUtc;
    return this;
  }

 /**
   * CIS - Metro Train Vehicle Location data expiry time
   * @return expiryTime
  **/
  @JsonProperty("expiry_time")
  public Date getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(Date expiryTime) {
    this.expiryTime = expiryTime;
  }

  public V3VehiclePosition expiryTime(Date expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3VehiclePosition {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    easting: ").append(toIndentedString(easting)).append("\n");
    sb.append("    northing: ").append(toIndentedString(northing)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    bearing: ").append(toIndentedString(bearing)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    datetimeUtc: ").append(toIndentedString(datetimeUtc)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
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
