/*
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * V3VehicleDescriptor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen", date = "2024-04-14T03:35:34.831658800+10:00[Australia/Sydney]")
public class V3VehicleDescriptor   {
  @JsonProperty("operator")
  private String operator = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("low_floor")
  private Boolean lowFloor = null;

  @JsonProperty("air_conditioned")
  private Boolean airConditioned = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("supplier")
  private String supplier = null;

  @JsonProperty("length")
  private String length = null;

  public V3VehicleDescriptor operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Operator name of the vehicle such as \&quot;Metro Trains Melbourne\&quot;, \&quot;Yarra Trams\&quot;, \&quot;Ventura Bus Line\&quot;, \&quot;CDC\&quot; or \&quot;Sita Bus Lines\&quot; . May be null/empty.  Only available for train, tram, v/line and some bus runs.
   * @return operator
   **/
  @JsonProperty("operator")
  @Schema(description = "Operator name of the vehicle such as \"Metro Trains Melbourne\", \"Yarra Trams\", \"Ventura Bus Line\", \"CDC\" or \"Sita Bus Lines\" . May be null/empty.  Only available for train, tram, v/line and some bus runs.")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public V3VehicleDescriptor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Operator identifier of the vehicle such as \&quot;26094\&quot;. May be null/empty. Only available for some tram and bus runs.
   * @return id
   **/
  @JsonProperty("id")
  @Schema(description = "Operator identifier of the vehicle such as \"26094\". May be null/empty. Only available for some tram and bus runs.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V3VehicleDescriptor lowFloor(Boolean lowFloor) {
    this.lowFloor = lowFloor;
    return this;
  }

  /**
   * Indicator if vehicle has a low floor. May be null. Only available for some tram runs.
   * @return lowFloor
   **/
  @JsonProperty("low_floor")
  @Schema(description = "Indicator if vehicle has a low floor. May be null. Only available for some tram runs.")
  public Boolean isLowFloor() {
    return lowFloor;
  }

  public void setLowFloor(Boolean lowFloor) {
    this.lowFloor = lowFloor;
  }

  public V3VehicleDescriptor airConditioned(Boolean airConditioned) {
    this.airConditioned = airConditioned;
    return this;
  }

  /**
   * Indicator if vehicle is air conditioned. May be null. Only available for some tram runs.
   * @return airConditioned
   **/
  @JsonProperty("air_conditioned")
  @Schema(description = "Indicator if vehicle is air conditioned. May be null. Only available for some tram runs.")
  public Boolean isAirConditioned() {
    return airConditioned;
  }

  public void setAirConditioned(Boolean airConditioned) {
    this.airConditioned = airConditioned;
  }

  public V3VehicleDescriptor description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Vehicle description such as \&quot;6 Car Comeng\&quot;, \&quot;6 Car Xtrapolis\&quot;, \&quot;3 Car Comeng\&quot;, \&quot;6 Car Siemens\&quot;, \&quot;3 Car Siemens\&quot;. May be null/empty.  Only available for some metropolitan train runs.
   * @return description
   **/
  @JsonProperty("description")
  @Schema(description = "Vehicle description such as \"6 Car Comeng\", \"6 Car Xtrapolis\", \"3 Car Comeng\", \"6 Car Siemens\", \"3 Car Siemens\". May be null/empty.  Only available for some metropolitan train runs.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V3VehicleDescriptor supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

  /**
   * Supplier of vehicle descriptor data.
   * @return supplier
   **/
  @JsonProperty("supplier")
  @Schema(description = "Supplier of vehicle descriptor data.")
  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public V3VehicleDescriptor length(String length) {
    this.length = length;
    return this;
  }

  /**
   * The length of the vehicle. Applies to CIS - Metro Trains
   * @return length
   **/
  @JsonProperty("length")
  @Schema(description = "The length of the vehicle. Applies to CIS - Metro Trains")
  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3VehicleDescriptor v3VehicleDescriptor = (V3VehicleDescriptor) o;
    return Objects.equals(this.operator, v3VehicleDescriptor.operator) &&
        Objects.equals(this.id, v3VehicleDescriptor.id) &&
        Objects.equals(this.lowFloor, v3VehicleDescriptor.lowFloor) &&
        Objects.equals(this.airConditioned, v3VehicleDescriptor.airConditioned) &&
        Objects.equals(this.description, v3VehicleDescriptor.description) &&
        Objects.equals(this.supplier, v3VehicleDescriptor.supplier) &&
        Objects.equals(this.length, v3VehicleDescriptor.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, id, lowFloor, airConditioned, description, supplier, length);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3VehicleDescriptor {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lowFloor: ").append(toIndentedString(lowFloor)).append("\n");
    sb.append("    airConditioned: ").append(toIndentedString(airConditioned)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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
