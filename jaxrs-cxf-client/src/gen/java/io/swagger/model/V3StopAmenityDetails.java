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

public class V3StopAmenityDetails   {
  
  @Schema(description = "Indicates if there is a public toilet at or near the stop")
 /**
   * Indicates if there is a public toilet at or near the stop  
  **/
  private Boolean toilet = null;
  
  @Schema(description = "Indicates if there is a taxi rank at or near the stop")
 /**
   * Indicates if there is a taxi rank at or near the stop  
  **/
  private Boolean taxiRank = null;
  
  @Schema(description = "The number of free car parking spots at the stop")
 /**
   * The number of free car parking spots at the stop  
  **/
  private String carParking = null;
  
  @Schema(description = "Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop")
 /**
   * Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop  
  **/
  private Boolean cctv = null;
 /**
   * Indicates if there is a public toilet at or near the stop
   * @return toilet
  **/
  @JsonProperty("toilet")
  public Boolean isToilet() {
    return toilet;
  }

  public void setToilet(Boolean toilet) {
    this.toilet = toilet;
  }

  public V3StopAmenityDetails toilet(Boolean toilet) {
    this.toilet = toilet;
    return this;
  }

 /**
   * Indicates if there is a taxi rank at or near the stop
   * @return taxiRank
  **/
  @JsonProperty("taxi_rank")
  public Boolean isTaxiRank() {
    return taxiRank;
  }

  public void setTaxiRank(Boolean taxiRank) {
    this.taxiRank = taxiRank;
  }

  public V3StopAmenityDetails taxiRank(Boolean taxiRank) {
    this.taxiRank = taxiRank;
    return this;
  }

 /**
   * The number of free car parking spots at the stop
   * @return carParking
  **/
  @JsonProperty("car_parking")
  public String getCarParking() {
    return carParking;
  }

  public void setCarParking(String carParking) {
    this.carParking = carParking;
  }

  public V3StopAmenityDetails carParking(String carParking) {
    this.carParking = carParking;
    return this;
  }

 /**
   * Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop
   * @return cctv
  **/
  @JsonProperty("cctv")
  public Boolean isCctv() {
    return cctv;
  }

  public void setCctv(Boolean cctv) {
    this.cctv = cctv;
  }

  public V3StopAmenityDetails cctv(Boolean cctv) {
    this.cctv = cctv;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
