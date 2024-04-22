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


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.V3Disruption;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V3Disruptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-22T17:22:49.642+10:00")
public class V3Disruptions {
  @SerializedName("general")
  private List<V3Disruption> general = null;

  @SerializedName("metro_train")
  private List<V3Disruption> metroTrain = null;

  @SerializedName("metro_tram")
  private List<V3Disruption> metroTram = null;

  @SerializedName("metro_bus")
  private List<V3Disruption> metroBus = null;

  @SerializedName("regional_train")
  private List<V3Disruption> regionalTrain = null;

  @SerializedName("regional_coach")
  private List<V3Disruption> regionalCoach = null;

  @SerializedName("regional_bus")
  private List<V3Disruption> regionalBus = null;

  @SerializedName("school_bus")
  private List<V3Disruption> schoolBus = null;

  @SerializedName("telebus")
  private List<V3Disruption> telebus = null;

  @SerializedName("night_bus")
  private List<V3Disruption> nightBus = null;

  @SerializedName("ferry")
  private List<V3Disruption> ferry = null;

  @SerializedName("interstate_train")
  private List<V3Disruption> interstateTrain = null;

  @SerializedName("skybus")
  private List<V3Disruption> skybus = null;

  @SerializedName("taxi")
  private List<V3Disruption> taxi = null;

  public V3Disruptions general(List<V3Disruption> general) {
    this.general = general;
    return this;
  }

  public V3Disruptions addGeneralItem(V3Disruption generalItem) {
    if (this.general == null) {
      this.general = new ArrayList<V3Disruption>();
    }
    this.general.add(generalItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to multiple route_types
   * @return general
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to multiple route_types")
  public List<V3Disruption> getGeneral() {
    return general;
  }

  public void setGeneral(List<V3Disruption> general) {
    this.general = general;
  }

  public V3Disruptions metroTrain(List<V3Disruption> metroTrain) {
    this.metroTrain = metroTrain;
    return this;
  }

  public V3Disruptions addMetroTrainItem(V3Disruption metroTrainItem) {
    if (this.metroTrain == null) {
      this.metroTrain = new ArrayList<V3Disruption>();
    }
    this.metroTrain.add(metroTrainItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to metropolitan train
   * @return metroTrain
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to metropolitan train")
  public List<V3Disruption> getMetroTrain() {
    return metroTrain;
  }

  public void setMetroTrain(List<V3Disruption> metroTrain) {
    this.metroTrain = metroTrain;
  }

  public V3Disruptions metroTram(List<V3Disruption> metroTram) {
    this.metroTram = metroTram;
    return this;
  }

  public V3Disruptions addMetroTramItem(V3Disruption metroTramItem) {
    if (this.metroTram == null) {
      this.metroTram = new ArrayList<V3Disruption>();
    }
    this.metroTram.add(metroTramItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to metropolitan tram
   * @return metroTram
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to metropolitan tram")
  public List<V3Disruption> getMetroTram() {
    return metroTram;
  }

  public void setMetroTram(List<V3Disruption> metroTram) {
    this.metroTram = metroTram;
  }

  public V3Disruptions metroBus(List<V3Disruption> metroBus) {
    this.metroBus = metroBus;
    return this;
  }

  public V3Disruptions addMetroBusItem(V3Disruption metroBusItem) {
    if (this.metroBus == null) {
      this.metroBus = new ArrayList<V3Disruption>();
    }
    this.metroBus.add(metroBusItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to metropolitan bus
   * @return metroBus
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to metropolitan bus")
  public List<V3Disruption> getMetroBus() {
    return metroBus;
  }

  public void setMetroBus(List<V3Disruption> metroBus) {
    this.metroBus = metroBus;
  }

  public V3Disruptions regionalTrain(List<V3Disruption> regionalTrain) {
    this.regionalTrain = regionalTrain;
    return this;
  }

  public V3Disruptions addRegionalTrainItem(V3Disruption regionalTrainItem) {
    if (this.regionalTrain == null) {
      this.regionalTrain = new ArrayList<V3Disruption>();
    }
    this.regionalTrain.add(regionalTrainItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to V/Line train
   * @return regionalTrain
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to V/Line train")
  public List<V3Disruption> getRegionalTrain() {
    return regionalTrain;
  }

  public void setRegionalTrain(List<V3Disruption> regionalTrain) {
    this.regionalTrain = regionalTrain;
  }

  public V3Disruptions regionalCoach(List<V3Disruption> regionalCoach) {
    this.regionalCoach = regionalCoach;
    return this;
  }

  public V3Disruptions addRegionalCoachItem(V3Disruption regionalCoachItem) {
    if (this.regionalCoach == null) {
      this.regionalCoach = new ArrayList<V3Disruption>();
    }
    this.regionalCoach.add(regionalCoachItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to V/Line coach
   * @return regionalCoach
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to V/Line coach")
  public List<V3Disruption> getRegionalCoach() {
    return regionalCoach;
  }

  public void setRegionalCoach(List<V3Disruption> regionalCoach) {
    this.regionalCoach = regionalCoach;
  }

  public V3Disruptions regionalBus(List<V3Disruption> regionalBus) {
    this.regionalBus = regionalBus;
    return this;
  }

  public V3Disruptions addRegionalBusItem(V3Disruption regionalBusItem) {
    if (this.regionalBus == null) {
      this.regionalBus = new ArrayList<V3Disruption>();
    }
    this.regionalBus.add(regionalBusItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to regional bus
   * @return regionalBus
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to regional bus")
  public List<V3Disruption> getRegionalBus() {
    return regionalBus;
  }

  public void setRegionalBus(List<V3Disruption> regionalBus) {
    this.regionalBus = regionalBus;
  }

  public V3Disruptions schoolBus(List<V3Disruption> schoolBus) {
    this.schoolBus = schoolBus;
    return this;
  }

  public V3Disruptions addSchoolBusItem(V3Disruption schoolBusItem) {
    if (this.schoolBus == null) {
      this.schoolBus = new ArrayList<V3Disruption>();
    }
    this.schoolBus.add(schoolBusItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to school bus
   * @return schoolBus
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to school bus")
  public List<V3Disruption> getSchoolBus() {
    return schoolBus;
  }

  public void setSchoolBus(List<V3Disruption> schoolBus) {
    this.schoolBus = schoolBus;
  }

  public V3Disruptions telebus(List<V3Disruption> telebus) {
    this.telebus = telebus;
    return this;
  }

  public V3Disruptions addTelebusItem(V3Disruption telebusItem) {
    if (this.telebus == null) {
      this.telebus = new ArrayList<V3Disruption>();
    }
    this.telebus.add(telebusItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to telebus services
   * @return telebus
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to telebus services")
  public List<V3Disruption> getTelebus() {
    return telebus;
  }

  public void setTelebus(List<V3Disruption> telebus) {
    this.telebus = telebus;
  }

  public V3Disruptions nightBus(List<V3Disruption> nightBus) {
    this.nightBus = nightBus;
    return this;
  }

  public V3Disruptions addNightBusItem(V3Disruption nightBusItem) {
    if (this.nightBus == null) {
      this.nightBus = new ArrayList<V3Disruption>();
    }
    this.nightBus.add(nightBusItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to night bus
   * @return nightBus
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to night bus")
  public List<V3Disruption> getNightBus() {
    return nightBus;
  }

  public void setNightBus(List<V3Disruption> nightBus) {
    this.nightBus = nightBus;
  }

  public V3Disruptions ferry(List<V3Disruption> ferry) {
    this.ferry = ferry;
    return this;
  }

  public V3Disruptions addFerryItem(V3Disruption ferryItem) {
    if (this.ferry == null) {
      this.ferry = new ArrayList<V3Disruption>();
    }
    this.ferry.add(ferryItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to ferry
   * @return ferry
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to ferry")
  public List<V3Disruption> getFerry() {
    return ferry;
  }

  public void setFerry(List<V3Disruption> ferry) {
    this.ferry = ferry;
  }

  public V3Disruptions interstateTrain(List<V3Disruption> interstateTrain) {
    this.interstateTrain = interstateTrain;
    return this;
  }

  public V3Disruptions addInterstateTrainItem(V3Disruption interstateTrainItem) {
    if (this.interstateTrain == null) {
      this.interstateTrain = new ArrayList<V3Disruption>();
    }
    this.interstateTrain.add(interstateTrainItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to interstate train
   * @return interstateTrain
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to interstate train")
  public List<V3Disruption> getInterstateTrain() {
    return interstateTrain;
  }

  public void setInterstateTrain(List<V3Disruption> interstateTrain) {
    this.interstateTrain = interstateTrain;
  }

  public V3Disruptions skybus(List<V3Disruption> skybus) {
    this.skybus = skybus;
    return this;
  }

  public V3Disruptions addSkybusItem(V3Disruption skybusItem) {
    if (this.skybus == null) {
      this.skybus = new ArrayList<V3Disruption>();
    }
    this.skybus.add(skybusItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to skybus
   * @return skybus
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to skybus")
  public List<V3Disruption> getSkybus() {
    return skybus;
  }

  public void setSkybus(List<V3Disruption> skybus) {
    this.skybus = skybus;
  }

  public V3Disruptions taxi(List<V3Disruption> taxi) {
    this.taxi = taxi;
    return this;
  }

  public V3Disruptions addTaxiItem(V3Disruption taxiItem) {
    if (this.taxi == null) {
      this.taxi = new ArrayList<V3Disruption>();
    }
    this.taxi.add(taxiItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to taxi
   * @return taxi
  **/
  @ApiModelProperty(value = "Subset of disruption information applicable to taxi")
  public List<V3Disruption> getTaxi() {
    return taxi;
  }

  public void setTaxi(List<V3Disruption> taxi) {
    this.taxi = taxi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3Disruptions v3Disruptions = (V3Disruptions) o;
    return Objects.equals(this.general, v3Disruptions.general) &&
        Objects.equals(this.metroTrain, v3Disruptions.metroTrain) &&
        Objects.equals(this.metroTram, v3Disruptions.metroTram) &&
        Objects.equals(this.metroBus, v3Disruptions.metroBus) &&
        Objects.equals(this.regionalTrain, v3Disruptions.regionalTrain) &&
        Objects.equals(this.regionalCoach, v3Disruptions.regionalCoach) &&
        Objects.equals(this.regionalBus, v3Disruptions.regionalBus) &&
        Objects.equals(this.schoolBus, v3Disruptions.schoolBus) &&
        Objects.equals(this.telebus, v3Disruptions.telebus) &&
        Objects.equals(this.nightBus, v3Disruptions.nightBus) &&
        Objects.equals(this.ferry, v3Disruptions.ferry) &&
        Objects.equals(this.interstateTrain, v3Disruptions.interstateTrain) &&
        Objects.equals(this.skybus, v3Disruptions.skybus) &&
        Objects.equals(this.taxi, v3Disruptions.taxi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(general, metroTrain, metroTram, metroBus, regionalTrain, regionalCoach, regionalBus, schoolBus, telebus, nightBus, ferry, interstateTrain, skybus, taxi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3Disruptions {\n");
    
    sb.append("    general: ").append(toIndentedString(general)).append("\n");
    sb.append("    metroTrain: ").append(toIndentedString(metroTrain)).append("\n");
    sb.append("    metroTram: ").append(toIndentedString(metroTram)).append("\n");
    sb.append("    metroBus: ").append(toIndentedString(metroBus)).append("\n");
    sb.append("    regionalTrain: ").append(toIndentedString(regionalTrain)).append("\n");
    sb.append("    regionalCoach: ").append(toIndentedString(regionalCoach)).append("\n");
    sb.append("    regionalBus: ").append(toIndentedString(regionalBus)).append("\n");
    sb.append("    schoolBus: ").append(toIndentedString(schoolBus)).append("\n");
    sb.append("    telebus: ").append(toIndentedString(telebus)).append("\n");
    sb.append("    nightBus: ").append(toIndentedString(nightBus)).append("\n");
    sb.append("    ferry: ").append(toIndentedString(ferry)).append("\n");
    sb.append("    interstateTrain: ").append(toIndentedString(interstateTrain)).append("\n");
    sb.append("    skybus: ").append(toIndentedString(skybus)).append("\n");
    sb.append("    taxi: ").append(toIndentedString(taxi)).append("\n");
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

