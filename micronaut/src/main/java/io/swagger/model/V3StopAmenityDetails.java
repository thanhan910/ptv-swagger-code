package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3StopAmenityDetails
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3StopAmenityDetails   {
  @JsonProperty("toilet")
  private Boolean toilet = null;

  @JsonProperty("taxi_rank")
  private Boolean taxiRank = null;

  @JsonProperty("car_parking")
  private String carParking = null;

  @JsonProperty("cctv")
  private Boolean cctv = null;

  public V3StopAmenityDetails toilet(Boolean toilet) {
    this.toilet = toilet;
    return this;
  }

  /**
   * Indicates if there is a public toilet at or near the stop
   * @return toilet
  **/
  @Schema(description = "Indicates if there is a public toilet at or near the stop")

  public Boolean isToilet() {
    return toilet;
  }

  public void setToilet(Boolean toilet) {
    this.toilet = toilet;
  }

  public V3StopAmenityDetails taxiRank(Boolean taxiRank) {
    this.taxiRank = taxiRank;
    return this;
  }

  /**
   * Indicates if there is a taxi rank at or near the stop
   * @return taxiRank
  **/
  @Schema(description = "Indicates if there is a taxi rank at or near the stop")

  public Boolean isTaxiRank() {
    return taxiRank;
  }

  public void setTaxiRank(Boolean taxiRank) {
    this.taxiRank = taxiRank;
  }

  public V3StopAmenityDetails carParking(String carParking) {
    this.carParking = carParking;
    return this;
  }

  /**
   * The number of free car parking spots at the stop
   * @return carParking
  **/
  @Schema(description = "The number of free car parking spots at the stop")

  public String getCarParking() {
    return carParking;
  }

  public void setCarParking(String carParking) {
    this.carParking = carParking;
  }

  public V3StopAmenityDetails cctv(Boolean cctv) {
    this.cctv = cctv;
    return this;
  }

  /**
   * Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop
   * @return cctv
  **/
  @Schema(description = "Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop")

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
    return Objects.equals(this.toilet, v3StopAmenityDetails.toilet) &&
        Objects.equals(this.taxiRank, v3StopAmenityDetails.taxiRank) &&
        Objects.equals(this.carParking, v3StopAmenityDetails.carParking) &&
        Objects.equals(this.cctv, v3StopAmenityDetails.cctv);
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
