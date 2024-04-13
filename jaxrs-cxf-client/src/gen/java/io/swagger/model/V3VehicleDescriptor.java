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

public class V3VehicleDescriptor   {
  
  @Schema(description = "Operator name of the vehicle such as \"Metro Trains Melbourne\", \"Yarra Trams\", \"Ventura Bus Line\", \"CDC\" or \"Sita Bus Lines\" . May be null/empty.  Only available for train, tram, v/line and some bus runs.")
 /**
   * Operator name of the vehicle such as \"Metro Trains Melbourne\", \"Yarra Trams\", \"Ventura Bus Line\", \"CDC\" or \"Sita Bus Lines\" . May be null/empty.  Only available for train, tram, v/line and some bus runs.  
  **/
  private String operator = null;
  
  @Schema(description = "Operator identifier of the vehicle such as \"26094\". May be null/empty. Only available for some tram and bus runs.")
 /**
   * Operator identifier of the vehicle such as \"26094\". May be null/empty. Only available for some tram and bus runs.  
  **/
  private String id = null;
  
  @Schema(description = "Indicator if vehicle has a low floor. May be null. Only available for some tram runs.")
 /**
   * Indicator if vehicle has a low floor. May be null. Only available for some tram runs.  
  **/
  private Boolean lowFloor = null;
  
  @Schema(description = "Indicator if vehicle is air conditioned. May be null. Only available for some tram runs.")
 /**
   * Indicator if vehicle is air conditioned. May be null. Only available for some tram runs.  
  **/
  private Boolean airConditioned = null;
  
  @Schema(description = "Vehicle description such as \"6 Car Comeng\", \"6 Car Xtrapolis\", \"3 Car Comeng\", \"6 Car Siemens\", \"3 Car Siemens\". May be null/empty.  Only available for some metropolitan train runs.")
 /**
   * Vehicle description such as \"6 Car Comeng\", \"6 Car Xtrapolis\", \"3 Car Comeng\", \"6 Car Siemens\", \"3 Car Siemens\". May be null/empty.  Only available for some metropolitan train runs.  
  **/
  private String description = null;
  
  @Schema(description = "Supplier of vehicle descriptor data.")
 /**
   * Supplier of vehicle descriptor data.  
  **/
  private String supplier = null;
  
  @Schema(description = "The length of the vehicle. Applies to CIS - Metro Trains")
 /**
   * The length of the vehicle. Applies to CIS - Metro Trains  
  **/
  private String length = null;
 /**
   * Operator name of the vehicle such as \&quot;Metro Trains Melbourne\&quot;, \&quot;Yarra Trams\&quot;, \&quot;Ventura Bus Line\&quot;, \&quot;CDC\&quot; or \&quot;Sita Bus Lines\&quot; . May be null/empty.  Only available for train, tram, v/line and some bus runs.
   * @return operator
  **/
  @JsonProperty("operator")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public V3VehicleDescriptor operator(String operator) {
    this.operator = operator;
    return this;
  }

 /**
   * Operator identifier of the vehicle such as \&quot;26094\&quot;. May be null/empty. Only available for some tram and bus runs.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V3VehicleDescriptor id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Indicator if vehicle has a low floor. May be null. Only available for some tram runs.
   * @return lowFloor
  **/
  @JsonProperty("low_floor")
  public Boolean isLowFloor() {
    return lowFloor;
  }

  public void setLowFloor(Boolean lowFloor) {
    this.lowFloor = lowFloor;
  }

  public V3VehicleDescriptor lowFloor(Boolean lowFloor) {
    this.lowFloor = lowFloor;
    return this;
  }

 /**
   * Indicator if vehicle is air conditioned. May be null. Only available for some tram runs.
   * @return airConditioned
  **/
  @JsonProperty("air_conditioned")
  public Boolean isAirConditioned() {
    return airConditioned;
  }

  public void setAirConditioned(Boolean airConditioned) {
    this.airConditioned = airConditioned;
  }

  public V3VehicleDescriptor airConditioned(Boolean airConditioned) {
    this.airConditioned = airConditioned;
    return this;
  }

 /**
   * Vehicle description such as \&quot;6 Car Comeng\&quot;, \&quot;6 Car Xtrapolis\&quot;, \&quot;3 Car Comeng\&quot;, \&quot;6 Car Siemens\&quot;, \&quot;3 Car Siemens\&quot;. May be null/empty.  Only available for some metropolitan train runs.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V3VehicleDescriptor description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Supplier of vehicle descriptor data.
   * @return supplier
  **/
  @JsonProperty("supplier")
  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public V3VehicleDescriptor supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

 /**
   * The length of the vehicle. Applies to CIS - Metro Trains
   * @return length
  **/
  @JsonProperty("length")
  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public V3VehicleDescriptor length(String length) {
    this.length = length;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
