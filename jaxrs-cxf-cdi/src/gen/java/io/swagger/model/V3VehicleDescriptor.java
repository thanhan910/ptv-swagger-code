package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3VehicleDescriptor   {
  private String operator = null;
  private String id = null;
  private Boolean lowFloor = null;
  private Boolean airConditioned = null;
  private String description = null;
  private String supplier = null;
  private String length = null;

  /**
   * Operator name of the vehicle such as \&quot;Metro Trains Melbourne\&quot;, \&quot;Yarra Trams\&quot;, \&quot;Ventura Bus Line\&quot;, \&quot;CDC\&quot; or \&quot;Sita Bus Lines\&quot; . May be null/empty.  Only available for train, tram, v/line and some bus runs.
   **/
  public V3VehicleDescriptor operator(String operator) {
    this.operator = operator;
    return this;
  }

  
  
  @Schema(description = "Operator name of the vehicle such as \"Metro Trains Melbourne\", \"Yarra Trams\", \"Ventura Bus Line\", \"CDC\" or \"Sita Bus Lines\" . May be null/empty.  Only available for train, tram, v/line and some bus runs.")
  @JsonProperty("operator")
  public String getOperator() {
    return operator;
  }
  public void setOperator(String operator) {
    this.operator = operator;
  }

  /**
   * Operator identifier of the vehicle such as \&quot;26094\&quot;. May be null/empty. Only available for some tram and bus runs.
   **/
  public V3VehicleDescriptor id(String id) {
    this.id = id;
    return this;
  }

  
  
  @Schema(description = "Operator identifier of the vehicle such as \"26094\". May be null/empty. Only available for some tram and bus runs.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Indicator if vehicle has a low floor. May be null. Only available for some tram runs.
   **/
  public V3VehicleDescriptor lowFloor(Boolean lowFloor) {
    this.lowFloor = lowFloor;
    return this;
  }

  
  
  @Schema(description = "Indicator if vehicle has a low floor. May be null. Only available for some tram runs.")
  @JsonProperty("low_floor")
  public Boolean isLowFloor() {
    return lowFloor;
  }
  public void setLowFloor(Boolean lowFloor) {
    this.lowFloor = lowFloor;
  }

  /**
   * Indicator if vehicle is air conditioned. May be null. Only available for some tram runs.
   **/
  public V3VehicleDescriptor airConditioned(Boolean airConditioned) {
    this.airConditioned = airConditioned;
    return this;
  }

  
  
  @Schema(description = "Indicator if vehicle is air conditioned. May be null. Only available for some tram runs.")
  @JsonProperty("air_conditioned")
  public Boolean isAirConditioned() {
    return airConditioned;
  }
  public void setAirConditioned(Boolean airConditioned) {
    this.airConditioned = airConditioned;
  }

  /**
   * Vehicle description such as \&quot;6 Car Comeng\&quot;, \&quot;6 Car Xtrapolis\&quot;, \&quot;3 Car Comeng\&quot;, \&quot;6 Car Siemens\&quot;, \&quot;3 Car Siemens\&quot;. May be null/empty.  Only available for some metropolitan train runs.
   **/
  public V3VehicleDescriptor description(String description) {
    this.description = description;
    return this;
  }

  
  
  @Schema(description = "Vehicle description such as \"6 Car Comeng\", \"6 Car Xtrapolis\", \"3 Car Comeng\", \"6 Car Siemens\", \"3 Car Siemens\". May be null/empty.  Only available for some metropolitan train runs.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Supplier of vehicle descriptor data.
   **/
  public V3VehicleDescriptor supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

  
  
  @Schema(description = "Supplier of vehicle descriptor data.")
  @JsonProperty("supplier")
  public String getSupplier() {
    return supplier;
  }
  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  /**
   * The length of the vehicle. Applies to CIS - Metro Trains
   **/
  public V3VehicleDescriptor length(String length) {
    this.length = length;
    return this;
  }

  
  
  @Schema(description = "The length of the vehicle. Applies to CIS - Metro Trains")
  @JsonProperty("length")
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
    return Objects.equals(operator, v3VehicleDescriptor.operator) &&
        Objects.equals(id, v3VehicleDescriptor.id) &&
        Objects.equals(lowFloor, v3VehicleDescriptor.lowFloor) &&
        Objects.equals(airConditioned, v3VehicleDescriptor.airConditioned) &&
        Objects.equals(description, v3VehicleDescriptor.description) &&
        Objects.equals(supplier, v3VehicleDescriptor.supplier) &&
        Objects.equals(length, v3VehicleDescriptor.length);
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
