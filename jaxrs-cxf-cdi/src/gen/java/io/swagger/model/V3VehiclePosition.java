package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3VehiclePosition   {
  private Double latitude = null;
  private Double longitude = null;
  private Double easting = null;
  private Double northing = null;
  private String direction = null;
  private Double bearing = null;
  private String supplier = null;
  private java.util.Date datetimeUtc = null;
  private java.util.Date expiryTime = null;

  /**
   * Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs.
   **/
  public V3VehiclePosition latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  
  
  @Schema(description = "Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs.")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   * Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs.
   **/
  public V3VehiclePosition longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  
  
  @Schema(description = "Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs.")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   * CIS - Metro Train Vehicle Location Easting coordinate
   **/
  public V3VehiclePosition easting(Double easting) {
    this.easting = easting;
    return this;
  }

  
  
  @Schema(description = "CIS - Metro Train Vehicle Location Easting coordinate")
  @JsonProperty("easting")
  public Double getEasting() {
    return easting;
  }
  public void setEasting(Double easting) {
    this.easting = easting;
  }

  /**
   * CIS - Metro Train Vehicle Location Northing coordinate
   **/
  public V3VehiclePosition northing(Double northing) {
    this.northing = northing;
    return this;
  }

  
  
  @Schema(description = "CIS - Metro Train Vehicle Location Northing coordinate")
  @JsonProperty("northing")
  public Double getNorthing() {
    return northing;
  }
  public void setNorthing(Double northing) {
    this.northing = northing;
  }

  /**
   * CIS - Metro Train Vehicle Location Direction
   **/
  public V3VehiclePosition direction(String direction) {
    this.direction = direction;
    return this;
  }

  
  
  @Schema(description = "CIS - Metro Train Vehicle Location Direction")
  @JsonProperty("direction")
  public String getDirection() {
    return direction;
  }
  public void setDirection(String direction) {
    this.direction = direction;
  }

  /**
   * Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs.
   **/
  public V3VehiclePosition bearing(Double bearing) {
    this.bearing = bearing;
    return this;
  }

  
  
  @Schema(description = "Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs.")
  @JsonProperty("bearing")
  public Double getBearing() {
    return bearing;
  }
  public void setBearing(Double bearing) {
    this.bearing = bearing;
  }

  /**
   * Supplier of vehicle position data.
   **/
  public V3VehiclePosition supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

  
  
  @Schema(description = "Supplier of vehicle position data.")
  @JsonProperty("supplier")
  public String getSupplier() {
    return supplier;
  }
  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  /**
   * Date and time that the vehicle position data was supplied.
   **/
  public V3VehiclePosition datetimeUtc(java.util.Date datetimeUtc) {
    this.datetimeUtc = datetimeUtc;
    return this;
  }

  
  
  @Schema(description = "Date and time that the vehicle position data was supplied.")
  @JsonProperty("datetime_utc")
  @Valid
  public java.util.Date getDatetimeUtc() {
    return datetimeUtc;
  }
  public void setDatetimeUtc(java.util.Date datetimeUtc) {
    this.datetimeUtc = datetimeUtc;
  }

  /**
   * CIS - Metro Train Vehicle Location data expiry time
   **/
  public V3VehiclePosition expiryTime(java.util.Date expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  
  
  @Schema(description = "CIS - Metro Train Vehicle Location data expiry time")
  @JsonProperty("expiry_time")
  @Valid
  public java.util.Date getExpiryTime() {
    return expiryTime;
  }
  public void setExpiryTime(java.util.Date expiryTime) {
    this.expiryTime = expiryTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3VehiclePosition v3VehiclePosition = (V3VehiclePosition) o;
    return Objects.equals(latitude, v3VehiclePosition.latitude) &&
        Objects.equals(longitude, v3VehiclePosition.longitude) &&
        Objects.equals(easting, v3VehiclePosition.easting) &&
        Objects.equals(northing, v3VehiclePosition.northing) &&
        Objects.equals(direction, v3VehiclePosition.direction) &&
        Objects.equals(bearing, v3VehiclePosition.bearing) &&
        Objects.equals(supplier, v3VehiclePosition.supplier) &&
        Objects.equals(datetimeUtc, v3VehiclePosition.datetimeUtc) &&
        Objects.equals(expiryTime, v3VehiclePosition.expiryTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, easting, northing, direction, bearing, supplier, datetimeUtc, expiryTime);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
