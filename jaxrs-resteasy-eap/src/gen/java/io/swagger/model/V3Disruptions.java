package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3Disruption;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
public class V3Disruptions   {
  private List<V3Disruption> general = new ArrayList<V3Disruption>();
  private List<V3Disruption> metroTrain = new ArrayList<V3Disruption>();
  private List<V3Disruption> metroTram = new ArrayList<V3Disruption>();
  private List<V3Disruption> metroBus = new ArrayList<V3Disruption>();
  private List<V3Disruption> regionalTrain = new ArrayList<V3Disruption>();
  private List<V3Disruption> regionalCoach = new ArrayList<V3Disruption>();
  private List<V3Disruption> regionalBus = new ArrayList<V3Disruption>();
  private List<V3Disruption> schoolBus = new ArrayList<V3Disruption>();
  private List<V3Disruption> telebus = new ArrayList<V3Disruption>();
  private List<V3Disruption> nightBus = new ArrayList<V3Disruption>();
  private List<V3Disruption> ferry = new ArrayList<V3Disruption>();
  private List<V3Disruption> interstateTrain = new ArrayList<V3Disruption>();
  private List<V3Disruption> skybus = new ArrayList<V3Disruption>();
  private List<V3Disruption> taxi = new ArrayList<V3Disruption>();

  /**
   * Subset of disruption information applicable to multiple route_types
   **/
  
  @Schema(description = "Subset of disruption information applicable to multiple route_types")
  @JsonProperty("general")
  public List<V3Disruption> getGeneral() {
    return general;
  }
  public void setGeneral(List<V3Disruption> general) {
    this.general = general;
  }

  /**
   * Subset of disruption information applicable to metropolitan train
   **/
  
  @Schema(description = "Subset of disruption information applicable to metropolitan train")
  @JsonProperty("metro_train")
  public List<V3Disruption> getMetroTrain() {
    return metroTrain;
  }
  public void setMetroTrain(List<V3Disruption> metroTrain) {
    this.metroTrain = metroTrain;
  }

  /**
   * Subset of disruption information applicable to metropolitan tram
   **/
  
  @Schema(description = "Subset of disruption information applicable to metropolitan tram")
  @JsonProperty("metro_tram")
  public List<V3Disruption> getMetroTram() {
    return metroTram;
  }
  public void setMetroTram(List<V3Disruption> metroTram) {
    this.metroTram = metroTram;
  }

  /**
   * Subset of disruption information applicable to metropolitan bus
   **/
  
  @Schema(description = "Subset of disruption information applicable to metropolitan bus")
  @JsonProperty("metro_bus")
  public List<V3Disruption> getMetroBus() {
    return metroBus;
  }
  public void setMetroBus(List<V3Disruption> metroBus) {
    this.metroBus = metroBus;
  }

  /**
   * Subset of disruption information applicable to V/Line train
   **/
  
  @Schema(description = "Subset of disruption information applicable to V/Line train")
  @JsonProperty("regional_train")
  public List<V3Disruption> getRegionalTrain() {
    return regionalTrain;
  }
  public void setRegionalTrain(List<V3Disruption> regionalTrain) {
    this.regionalTrain = regionalTrain;
  }

  /**
   * Subset of disruption information applicable to V/Line coach
   **/
  
  @Schema(description = "Subset of disruption information applicable to V/Line coach")
  @JsonProperty("regional_coach")
  public List<V3Disruption> getRegionalCoach() {
    return regionalCoach;
  }
  public void setRegionalCoach(List<V3Disruption> regionalCoach) {
    this.regionalCoach = regionalCoach;
  }

  /**
   * Subset of disruption information applicable to regional bus
   **/
  
  @Schema(description = "Subset of disruption information applicable to regional bus")
  @JsonProperty("regional_bus")
  public List<V3Disruption> getRegionalBus() {
    return regionalBus;
  }
  public void setRegionalBus(List<V3Disruption> regionalBus) {
    this.regionalBus = regionalBus;
  }

  /**
   * Subset of disruption information applicable to school bus
   **/
  
  @Schema(description = "Subset of disruption information applicable to school bus")
  @JsonProperty("school_bus")
  public List<V3Disruption> getSchoolBus() {
    return schoolBus;
  }
  public void setSchoolBus(List<V3Disruption> schoolBus) {
    this.schoolBus = schoolBus;
  }

  /**
   * Subset of disruption information applicable to telebus services
   **/
  
  @Schema(description = "Subset of disruption information applicable to telebus services")
  @JsonProperty("telebus")
  public List<V3Disruption> getTelebus() {
    return telebus;
  }
  public void setTelebus(List<V3Disruption> telebus) {
    this.telebus = telebus;
  }

  /**
   * Subset of disruption information applicable to night bus
   **/
  
  @Schema(description = "Subset of disruption information applicable to night bus")
  @JsonProperty("night_bus")
  public List<V3Disruption> getNightBus() {
    return nightBus;
  }
  public void setNightBus(List<V3Disruption> nightBus) {
    this.nightBus = nightBus;
  }

  /**
   * Subset of disruption information applicable to ferry
   **/
  
  @Schema(description = "Subset of disruption information applicable to ferry")
  @JsonProperty("ferry")
  public List<V3Disruption> getFerry() {
    return ferry;
  }
  public void setFerry(List<V3Disruption> ferry) {
    this.ferry = ferry;
  }

  /**
   * Subset of disruption information applicable to interstate train
   **/
  
  @Schema(description = "Subset of disruption information applicable to interstate train")
  @JsonProperty("interstate_train")
  public List<V3Disruption> getInterstateTrain() {
    return interstateTrain;
  }
  public void setInterstateTrain(List<V3Disruption> interstateTrain) {
    this.interstateTrain = interstateTrain;
  }

  /**
   * Subset of disruption information applicable to skybus
   **/
  
  @Schema(description = "Subset of disruption information applicable to skybus")
  @JsonProperty("skybus")
  public List<V3Disruption> getSkybus() {
    return skybus;
  }
  public void setSkybus(List<V3Disruption> skybus) {
    this.skybus = skybus;
  }

  /**
   * Subset of disruption information applicable to taxi
   **/
  
  @Schema(description = "Subset of disruption information applicable to taxi")
  @JsonProperty("taxi")
  public List<V3Disruption> getTaxi() {
    return taxi;
  }
  public void setTaxi(List<V3Disruption> taxi) {
    this.taxi = taxi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3Disruptions v3Disruptions = (V3Disruptions) o;
    return Objects.equals(general, v3Disruptions.general) &&
        Objects.equals(metroTrain, v3Disruptions.metroTrain) &&
        Objects.equals(metroTram, v3Disruptions.metroTram) &&
        Objects.equals(metroBus, v3Disruptions.metroBus) &&
        Objects.equals(regionalTrain, v3Disruptions.regionalTrain) &&
        Objects.equals(regionalCoach, v3Disruptions.regionalCoach) &&
        Objects.equals(regionalBus, v3Disruptions.regionalBus) &&
        Objects.equals(schoolBus, v3Disruptions.schoolBus) &&
        Objects.equals(telebus, v3Disruptions.telebus) &&
        Objects.equals(nightBus, v3Disruptions.nightBus) &&
        Objects.equals(ferry, v3Disruptions.ferry) &&
        Objects.equals(interstateTrain, v3Disruptions.interstateTrain) &&
        Objects.equals(skybus, v3Disruptions.skybus) &&
        Objects.equals(taxi, v3Disruptions.taxi);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
