package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3StopAmenityDetails   {

  private @Valid Boolean toilet = null;

  private @Valid Boolean taxiRank = null;

  private @Valid String carParking = null;

  private @Valid Boolean cctv = null;

  /**
   * Indicates if there is a public toilet at or near the stop
   **/
  public V3StopAmenityDetails toilet(Boolean toilet) {
    this.toilet = toilet;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates if there is a public toilet at or near the stop")
  @JsonProperty("toilet")

  public Boolean isToilet() {
    return toilet;
  }
  public void setToilet(Boolean toilet) {
    this.toilet = toilet;
  }

  /**
   * Indicates if there is a taxi rank at or near the stop
   **/
  public V3StopAmenityDetails taxiRank(Boolean taxiRank) {
    this.taxiRank = taxiRank;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates if there is a taxi rank at or near the stop")
  @JsonProperty("taxi_rank")

  public Boolean isTaxiRank() {
    return taxiRank;
  }
  public void setTaxiRank(Boolean taxiRank) {
    this.taxiRank = taxiRank;
  }

  /**
   * The number of free car parking spots at the stop
   **/
  public V3StopAmenityDetails carParking(String carParking) {
    this.carParking = carParking;
    return this;
  }

  
  @ApiModelProperty(value = "The number of free car parking spots at the stop")
  @JsonProperty("car_parking")

  public String getCarParking() {
    return carParking;
  }
  public void setCarParking(String carParking) {
    this.carParking = carParking;
  }

  /**
   * Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop
   **/
  public V3StopAmenityDetails cctv(Boolean cctv) {
    this.cctv = cctv;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop")
  @JsonProperty("cctv")

  public Boolean isCctv() {
    return cctv;
  }
  public void setCctv(Boolean cctv) {
    this.cctv = cctv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopAmenityDetails v3StopAmenityDetails = (V3StopAmenityDetails) o;
    return Objects.equals(toilet, v3StopAmenityDetails.toilet) &&
        Objects.equals(taxiRank, v3StopAmenityDetails.taxiRank) &&
        Objects.equals(carParking, v3StopAmenityDetails.carParking) &&
        Objects.equals(cctv, v3StopAmenityDetails.cctv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toilet, taxiRank, carParking, cctv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopAmenityDetails {\n");
    
    sb.append("    toilet: ").append(toIndentedString(toilet)).append("\n");
    sb.append("    taxiRank: ").append(toIndentedString(taxiRank)).append("\n");
    sb.append("    carParking: ").append(toIndentedString(carParking)).append("\n");
    sb.append("    cctv: ").append(toIndentedString(cctv)).append("\n");
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
