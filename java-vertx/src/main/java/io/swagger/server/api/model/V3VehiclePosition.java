package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3VehiclePosition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3VehiclePosition   {
  private Double latitude = null;

  private Double longitude = null;

  private Double easting = null;

  private Double northing = null;

  private String direction = null;

  private Double bearing = null;

  private String supplier = null;

  private OffsetDateTime datetimeUtc = null;

  private OffsetDateTime expiryTime = null;

  public V3VehiclePosition latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs.
   * @return latitude
   **/
    public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public V3VehiclePosition longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs.
   * @return longitude
   **/
    public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public V3VehiclePosition easting(Double easting) {
    this.easting = easting;
    return this;
  }

  /**
   * CIS - Metro Train Vehicle Location Easting coordinate
   * @return easting
   **/
    public Double getEasting() {
    return easting;
  }

  public void setEasting(Double easting) {
    this.easting = easting;
  }

  public V3VehiclePosition northing(Double northing) {
    this.northing = northing;
    return this;
  }

  /**
   * CIS - Metro Train Vehicle Location Northing coordinate
   * @return northing
   **/
    public Double getNorthing() {
    return northing;
  }

  public void setNorthing(Double northing) {
    this.northing = northing;
  }

  public V3VehiclePosition direction(String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * CIS - Metro Train Vehicle Location Direction
   * @return direction
   **/
    public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public V3VehiclePosition bearing(Double bearing) {
    this.bearing = bearing;
    return this;
  }

  /**
   * Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs.
   * @return bearing
   **/
    public Double getBearing() {
    return bearing;
  }

  public void setBearing(Double bearing) {
    this.bearing = bearing;
  }

  public V3VehiclePosition supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

  /**
   * Supplier of vehicle position data.
   * @return supplier
   **/
    public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public V3VehiclePosition datetimeUtc(OffsetDateTime datetimeUtc) {
    this.datetimeUtc = datetimeUtc;
    return this;
  }

  /**
   * Date and time that the vehicle position data was supplied.
   * @return datetimeUtc
   **/
    public OffsetDateTime getDatetimeUtc() {
    return datetimeUtc;
  }

  public void setDatetimeUtc(OffsetDateTime datetimeUtc) {
    this.datetimeUtc = datetimeUtc;
  }

  public V3VehiclePosition expiryTime(OffsetDateTime expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  /**
   * CIS - Metro Train Vehicle Location data expiry time
   * @return expiryTime
   **/
    public OffsetDateTime getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(OffsetDateTime expiryTime) {
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
    return Objects.equals(this.latitude, v3VehiclePosition.latitude) &&
        Objects.equals(this.longitude, v3VehiclePosition.longitude) &&
        Objects.equals(this.easting, v3VehiclePosition.easting) &&
        Objects.equals(this.northing, v3VehiclePosition.northing) &&
        Objects.equals(this.direction, v3VehiclePosition.direction) &&
        Objects.equals(this.bearing, v3VehiclePosition.bearing) &&
        Objects.equals(this.supplier, v3VehiclePosition.supplier) &&
        Objects.equals(this.datetimeUtc, v3VehiclePosition.datetimeUtc) &&
        Objects.equals(this.expiryTime, v3VehiclePosition.expiryTime);
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
