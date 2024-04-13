package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3VehicleDescriptor
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3VehicleDescriptor   {
  private String operator = null;

  private String id = null;

  private Boolean lowFloor = null;

  private Boolean airConditioned = null;

  private String description = null;

  private String supplier = null;

  private String length = null;

  public V3VehicleDescriptor operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Operator name of the vehicle such as \"Metro Trains Melbourne\", \"Yarra Trams\", \"Ventura Bus Line\", \"CDC\" or \"Sita Bus Lines\" . May be null/empty.  Only available for train, tram, v/line and some bus runs.
   * @return operator
   **/
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
   * Operator identifier of the vehicle such as \"26094\". May be null/empty. Only available for some tram and bus runs.
   * @return id
   **/
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
   * Vehicle description such as \"6 Car Comeng\", \"6 Car Xtrapolis\", \"3 Car Comeng\", \"6 Car Siemens\", \"3 Car Siemens\". May be null/empty.  Only available for some metropolitan train runs.
   * @return description
   **/
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
