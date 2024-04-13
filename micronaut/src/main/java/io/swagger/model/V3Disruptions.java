package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3Disruption;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3Disruptions
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3Disruptions   {
  @JsonProperty("general")
  @Valid
  private List<V3Disruption> general = null;

  @JsonProperty("metro_train")
  @Valid
  private List<V3Disruption> metroTrain = null;

  @JsonProperty("metro_tram")
  @Valid
  private List<V3Disruption> metroTram = null;

  @JsonProperty("metro_bus")
  @Valid
  private List<V3Disruption> metroBus = null;

  @JsonProperty("regional_train")
  @Valid
  private List<V3Disruption> regionalTrain = null;

  @JsonProperty("regional_coach")
  @Valid
  private List<V3Disruption> regionalCoach = null;

  @JsonProperty("regional_bus")
  @Valid
  private List<V3Disruption> regionalBus = null;

  @JsonProperty("school_bus")
  @Valid
  private List<V3Disruption> schoolBus = null;

  @JsonProperty("telebus")
  @Valid
  private List<V3Disruption> telebus = null;

  @JsonProperty("night_bus")
  @Valid
  private List<V3Disruption> nightBus = null;

  @JsonProperty("ferry")
  @Valid
  private List<V3Disruption> ferry = null;

  @JsonProperty("interstate_train")
  @Valid
  private List<V3Disruption> interstateTrain = null;

  @JsonProperty("skybus")
  @Valid
  private List<V3Disruption> skybus = null;

  @JsonProperty("taxi")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to multiple route_types")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to metropolitan train")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to metropolitan tram")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to metropolitan bus")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to V/Line train")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to V/Line coach")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to regional bus")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to school bus")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to telebus services")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to night bus")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to ferry")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to interstate train")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to skybus")
  @Valid
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
  @Schema(description = "Subset of disruption information applicable to taxi")
  @Valid
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
