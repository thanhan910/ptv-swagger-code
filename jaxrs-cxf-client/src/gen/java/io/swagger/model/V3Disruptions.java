package io.swagger.model;

import io.swagger.model.V3Disruption;
import java.util.ArrayList;
import java.util.List;

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

public class V3Disruptions   {
  
  @Schema(description = "Subset of disruption information applicable to multiple route_types")
 /**
   * Subset of disruption information applicable to multiple route_types  
  **/
  private List<V3Disruption> general = null;
  
  @Schema(description = "Subset of disruption information applicable to metropolitan train")
 /**
   * Subset of disruption information applicable to metropolitan train  
  **/
  private List<V3Disruption> metroTrain = null;
  
  @Schema(description = "Subset of disruption information applicable to metropolitan tram")
 /**
   * Subset of disruption information applicable to metropolitan tram  
  **/
  private List<V3Disruption> metroTram = null;
  
  @Schema(description = "Subset of disruption information applicable to metropolitan bus")
 /**
   * Subset of disruption information applicable to metropolitan bus  
  **/
  private List<V3Disruption> metroBus = null;
  
  @Schema(description = "Subset of disruption information applicable to V/Line train")
 /**
   * Subset of disruption information applicable to V/Line train  
  **/
  private List<V3Disruption> regionalTrain = null;
  
  @Schema(description = "Subset of disruption information applicable to V/Line coach")
 /**
   * Subset of disruption information applicable to V/Line coach  
  **/
  private List<V3Disruption> regionalCoach = null;
  
  @Schema(description = "Subset of disruption information applicable to regional bus")
 /**
   * Subset of disruption information applicable to regional bus  
  **/
  private List<V3Disruption> regionalBus = null;
  
  @Schema(description = "Subset of disruption information applicable to school bus")
 /**
   * Subset of disruption information applicable to school bus  
  **/
  private List<V3Disruption> schoolBus = null;
  
  @Schema(description = "Subset of disruption information applicable to telebus services")
 /**
   * Subset of disruption information applicable to telebus services  
  **/
  private List<V3Disruption> telebus = null;
  
  @Schema(description = "Subset of disruption information applicable to night bus")
 /**
   * Subset of disruption information applicable to night bus  
  **/
  private List<V3Disruption> nightBus = null;
  
  @Schema(description = "Subset of disruption information applicable to ferry")
 /**
   * Subset of disruption information applicable to ferry  
  **/
  private List<V3Disruption> ferry = null;
  
  @Schema(description = "Subset of disruption information applicable to interstate train")
 /**
   * Subset of disruption information applicable to interstate train  
  **/
  private List<V3Disruption> interstateTrain = null;
  
  @Schema(description = "Subset of disruption information applicable to skybus")
 /**
   * Subset of disruption information applicable to skybus  
  **/
  private List<V3Disruption> skybus = null;
  
  @Schema(description = "Subset of disruption information applicable to taxi")
 /**
   * Subset of disruption information applicable to taxi  
  **/
  private List<V3Disruption> taxi = null;
 /**
   * Subset of disruption information applicable to multiple route_types
   * @return general
  **/
  @JsonProperty("general")
  public List<V3Disruption> getGeneral() {
    return general;
  }

  public void setGeneral(List<V3Disruption> general) {
    this.general = general;
  }

  public V3Disruptions general(List<V3Disruption> general) {
    this.general = general;
    return this;
  }

  public V3Disruptions addGeneralItem(V3Disruption generalItem) {
    this.general.add(generalItem);
    return this;
  }

 /**
   * Subset of disruption information applicable to metropolitan train
   * @return metroTrain
  **/
  @JsonProperty("metro_train")
  public List<V3Disruption> getMetroTrain() {
    return metroTrain;
  }

  public void setMetroTrain(List<V3Disruption> metroTrain) {
    this.metroTrain = metroTrain;
  }

  public V3Disruptions metroTrain(List<V3Disruption> metroTrain) {
    this.metroTrain = metroTrain;
    return this;
  }

  public V3Disruptions addMetroTrainItem(V3Disruption metroTrainItem) {
    this.metroTrain.add(metroTrainItem);
    return this;
  }

 /**
   * Subset of disruption information applicable to metropolitan tram
   * @return metroTram
  **/
  @JsonProperty("metro_tram")
  public List<V3Disruption> getMetroTram() {
    return metroTram;
  }

  public void setMetroTram(List<V3Disruption> metroTram) {
    this.metroTram = metroTram;
  }

  public V3Disruptions metroTram(List<V3Disruption> metroTram) {
    this.metroTram = metroTram;
    return this;
  }

  public V3Disruptions addMetroTramItem(V3Disruption metroTramItem) {
    this.metroTram.add(metroTramItem);
    return this;
  }

 /**
   * Subset of disruption information applicable to metropolitan bus
   * @return metroBus
  **/
  @JsonProperty("metro_bus")
  public List<V3Disruption> getMetroBus() {
    return metroBus;
  }

  public void setMetroBus(List<V3Disruption> metroBus) {
    this.metroBus = metroBus;
  }

  public V3Disruptions metroBus(List<V3Disruption> metroBus) {
    this.metroBus = metroBus;
    return this;
  }

  public V3Disruptions addMetroBusItem(V3Disruption metroBusItem) {
    this.metroBus.add(metroBusItem);
    return this;
  }

 /**
   * Subset of disruption information applicable to V/Line train
   * @return regionalTrain
  **/
  @JsonProperty("regional_train")
  public List<V3Disruption> getRegionalTrain() {
    return regionalTrain;
  }

  public void setRegionalTrain(List<V3Disruption> regionalTrain) {
    this.regionalTrain = regionalTrain;
  }

  public V3Disruptions regionalTrain(List<V3Disruption> regionalTrain) {
    this.regionalTrain = regionalTrain;
    return this;
  }

  public V3Disruptions addRegionalTrainItem(V3Disruption regionalTrainItem) {
    this.regionalTrain.add(regionalTrainItem);
    return this;
  }

 /**
   * Subset of disruption information applicable to V/Line coach
   * @return regionalCoach
  **/
  @JsonProperty("regional_coach")
  public List<V3Disruption> getRegionalCoach() {
    return regionalCoach;
  }

  public void setRegionalCoach(List<V3Disruption> regionalCoach) {
    this.regionalCoach = regionalCoach;
  }

  public V3Disruptions regionalCoach(List<V3Disruption> regionalCoach) {
    this.regionalCoach = regionalCoach;
    return this;
  }

  public V3Disruptions addRegionalCoachItem(V3Disruption regionalCoachItem) {
    this.regionalCoach.add(regionalCoachItem);
    return this;
  }

 /**
   * Subset of disruption information applicable to regional bus
   * @return regionalBus
  **/
  @JsonProperty("regional_bus")
  public List<V3Disruption> getRegionalBus() {
    return regionalBus;
  }

  public void setRegionalBus(List<V3Disruption> regionalBus) {
    this.regionalBus = regionalBus;
  }

  public V3Disruptions regionalBus(List<V3Disruption> regionalBus) {
    this.regionalBus = regionalBus;
    return this;
  }

  public V3Disruptions addRegionalBusItem(V3Disruption regionalBusItem) {
    this.regionalBus.add(regionalBusItem);
    return this;
  }

 /**
   * Subset of disruption information applicable to school bus
   * @return schoolBus
  **/
  @JsonProperty("school_bus")
  public List<V3Disruption> getSchoolBus() {
    return schoolBus;
  }

  public void setSchoolBus(List<V3Disruption> schoolBus) {
    this.schoolBus = schoolBus;
  }

  public V3Disruptions schoolBus(List<V3Disruption> schoolBus) {
    this.schoolBus = schoolBus;
    return this;
  }

  public V3Disruptions addSchoolBusItem(V3Disruption schoolBusItem) {
    this.schoolBus.add(schoolBusItem);
    return this;
  }

 /**
   * Subset of disruption information applicable to telebus services
   * @return telebus
  **/
  @JsonProperty("telebus")
  public List<V3Disruption> getTelebus() {
    return telebus;
  }

  public void setTelebus(List<V3Disruption> telebus) {
    this.telebus = telebus;
  }

  public V3Disruptions telebus(List<V3Disruption> telebus) {
    this.telebus = telebus;
    return this;
  }

  public V3Disruptions addTelebusItem(V3Disruption telebusItem) {
    this.telebus.add(telebusItem);
    return this;
  }

 /**
   * Subset of disruption information applicable to night bus
   * @return nightBus
  **/
  @JsonProperty("night_bus")
  public List<V3Disruption> getNightBus() {
    return nightBus;
  }

  public void setNightBus(List<V3Disruption> nightBus) {
    this.nightBus = nightBus;
  }

  public V3Disruptions nightBus(List<V3Disruption> nightBus) {
    this.nightBus = nightBus;
    return this;
  }

  public V3Disruptions addNightBusItem(V3Disruption nightBusItem) {
    this.nightBus.add(nightBusItem);
    return this;
  }

 /**
   * Subset of disruption information applicable to ferry
   * @return ferry
  **/
  @JsonProperty("ferry")
  public List<V3Disruption> getFerry() {
    return ferry;
  }

  public void setFerry(List<V3Disruption> ferry) {
    this.ferry = ferry;
  }

  public V3Disruptions ferry(List<V3Disruption> ferry) {
    this.ferry = ferry;
    return this;
  }

  public V3Disruptions addFerryItem(V3Disruption ferryItem) {
    this.ferry.add(ferryItem);
    return this;
  }

 /**
   * Subset of disruption information applicable to interstate train
   * @return interstateTrain
  **/
  @JsonProperty("interstate_train")
  public List<V3Disruption> getInterstateTrain() {
    return interstateTrain;
  }

  public void setInterstateTrain(List<V3Disruption> interstateTrain) {
    this.interstateTrain = interstateTrain;
  }

  public V3Disruptions interstateTrain(List<V3Disruption> interstateTrain) {
    this.interstateTrain = interstateTrain;
    return this;
  }

  public V3Disruptions addInterstateTrainItem(V3Disruption interstateTrainItem) {
    this.interstateTrain.add(interstateTrainItem);
    return this;
  }

 /**
   * Subset of disruption information applicable to skybus
   * @return skybus
  **/
  @JsonProperty("skybus")
  public List<V3Disruption> getSkybus() {
    return skybus;
  }

  public void setSkybus(List<V3Disruption> skybus) {
    this.skybus = skybus;
  }

  public V3Disruptions skybus(List<V3Disruption> skybus) {
    this.skybus = skybus;
    return this;
  }

  public V3Disruptions addSkybusItem(V3Disruption skybusItem) {
    this.skybus.add(skybusItem);
    return this;
  }

 /**
   * Subset of disruption information applicable to taxi
   * @return taxi
  **/
  @JsonProperty("taxi")
  public List<V3Disruption> getTaxi() {
    return taxi;
  }

  public void setTaxi(List<V3Disruption> taxi) {
    this.taxi = taxi;
  }

  public V3Disruptions taxi(List<V3Disruption> taxi) {
    this.taxi = taxi;
    return this;
  }

  public V3Disruptions addTaxiItem(V3Disruption taxiItem) {
    this.taxi.add(taxiItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
