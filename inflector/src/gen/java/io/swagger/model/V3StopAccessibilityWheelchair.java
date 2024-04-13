package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3StopAccessibilityWheelchair   {
  @JsonProperty("accessible_ramp")
  private Boolean accessibleRamp = null;
  @JsonProperty("parking")
  private Boolean parking = null;
  @JsonProperty("telephone")
  private Boolean telephone = null;
  @JsonProperty("toilet")
  private Boolean toilet = null;
  @JsonProperty("low_ticket_counter")
  private Boolean lowTicketCounter = null;
  @JsonProperty("manouvering")
  private Boolean manouvering = null;
  @JsonProperty("raised_platform")
  private Boolean raisedPlatform = null;
  @JsonProperty("ramp")
  private Boolean ramp = null;
  @JsonProperty("secondary_path")
  private Boolean secondaryPath = null;
  @JsonProperty("raised_platform_shelther")
  private Boolean raisedPlatformShelther = null;
  @JsonProperty("steep_ramp")
  private Boolean steepRamp = null;
  /**
   **/
  public V3StopAccessibilityWheelchair accessibleRamp(Boolean accessibleRamp) {
    this.accessibleRamp = accessibleRamp;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("accessible_ramp")
  public Boolean isAccessibleRamp() {
    return accessibleRamp;
  }
  public void setAccessibleRamp(Boolean accessibleRamp) {
    this.accessibleRamp = accessibleRamp;
  }

  /**
   * Indicates if there is at least one accessible parking spot at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
   **/
  public V3StopAccessibilityWheelchair parking(Boolean parking) {
    this.parking = parking;
    return this;
  }

  
  @Schema(description = "Indicates if there is at least one accessible parking spot at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
  @JsonProperty("parking")
  public Boolean isParking() {
    return parking;
  }
  public void setParking(Boolean parking) {
    this.parking = parking;
  }

  /**
   * Indicates if there is at least one accessible telephone at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
   **/
  public V3StopAccessibilityWheelchair telephone(Boolean telephone) {
    this.telephone = telephone;
    return this;
  }

  
  @Schema(description = "Indicates if there is at least one accessible telephone at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
  @JsonProperty("telephone")
  public Boolean isTelephone() {
    return telephone;
  }
  public void setTelephone(Boolean telephone) {
    this.telephone = telephone;
  }

  /**
   * Indicates if there is at least one accessible toilet at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
   **/
  public V3StopAccessibilityWheelchair toilet(Boolean toilet) {
    this.toilet = toilet;
    return this;
  }

  
  @Schema(description = "Indicates if there is at least one accessible toilet at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
  @JsonProperty("toilet")
  public Boolean isToilet() {
    return toilet;
  }
  public void setToilet(Boolean toilet) {
    this.toilet = toilet;
  }

  /**
   * Indicates if there is at least one low ticket counter at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
   **/
  public V3StopAccessibilityWheelchair lowTicketCounter(Boolean lowTicketCounter) {
    this.lowTicketCounter = lowTicketCounter;
    return this;
  }

  
  @Schema(description = "Indicates if there is at least one low ticket counter at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
  @JsonProperty("low_ticket_counter")
  public Boolean isLowTicketCounter() {
    return lowTicketCounter;
  }
  public void setLowTicketCounter(Boolean lowTicketCounter) {
    this.lowTicketCounter = lowTicketCounter;
  }

  /**
   * Indicates if there is a space for mobility device to board on or off a transport mode
   **/
  public V3StopAccessibilityWheelchair manouvering(Boolean manouvering) {
    this.manouvering = manouvering;
    return this;
  }

  
  @Schema(description = "Indicates if there is a space for mobility device to board on or off a transport mode")
  @JsonProperty("manouvering")
  public Boolean isManouvering() {
    return manouvering;
  }
  public void setManouvering(Boolean manouvering) {
    this.manouvering = manouvering;
  }

  /**
   * Indicates if there is a raised platform to board a train
   **/
  public V3StopAccessibilityWheelchair raisedPlatform(Boolean raisedPlatform) {
    this.raisedPlatform = raisedPlatform;
    return this;
  }

  
  @Schema(description = "Indicates if there is a raised platform to board a train")
  @JsonProperty("raised_platform")
  public Boolean isRaisedPlatform() {
    return raisedPlatform;
  }
  public void setRaisedPlatform(Boolean raisedPlatform) {
    this.raisedPlatform = raisedPlatform;
  }

  /**
   * Indicates if there are ramps (&lt;1:14) at the stop/platform
   **/
  public V3StopAccessibilityWheelchair ramp(Boolean ramp) {
    this.ramp = ramp;
    return this;
  }

  
  @Schema(description = "Indicates if there are ramps (&lt;1:14) at the stop/platform")
  @JsonProperty("ramp")
  public Boolean isRamp() {
    return ramp;
  }
  public void setRamp(Boolean ramp) {
    this.ramp = ramp;
  }

  /**
   * Indicates if there is a path beyond the stop which is accessible
   **/
  public V3StopAccessibilityWheelchair secondaryPath(Boolean secondaryPath) {
    this.secondaryPath = secondaryPath;
    return this;
  }

  
  @Schema(description = "Indicates if there is a path beyond the stop which is accessible")
  @JsonProperty("secondary_path")
  public Boolean isSecondaryPath() {
    return secondaryPath;
  }
  public void setSecondaryPath(Boolean secondaryPath) {
    this.secondaryPath = secondaryPath;
  }

  /**
   * Indicates if there is shelter near the raised platform
   **/
  public V3StopAccessibilityWheelchair raisedPlatformShelther(Boolean raisedPlatformShelther) {
    this.raisedPlatformShelther = raisedPlatformShelther;
    return this;
  }

  
  @Schema(description = "Indicates if there is shelter near the raised platform")
  @JsonProperty("raised_platform_shelther")
  public Boolean isRaisedPlatformShelther() {
    return raisedPlatformShelther;
  }
  public void setRaisedPlatformShelther(Boolean raisedPlatformShelther) {
    this.raisedPlatformShelther = raisedPlatformShelther;
  }

  /**
   * Indicates if there are ramps (&gt;1:14) at the stop/platform
   **/
  public V3StopAccessibilityWheelchair steepRamp(Boolean steepRamp) {
    this.steepRamp = steepRamp;
    return this;
  }

  
  @Schema(description = "Indicates if there are ramps (&gt;1:14) at the stop/platform")
  @JsonProperty("steep_ramp")
  public Boolean isSteepRamp() {
    return steepRamp;
  }
  public void setSteepRamp(Boolean steepRamp) {
    this.steepRamp = steepRamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopAccessibilityWheelchair v3StopAccessibilityWheelchair = (V3StopAccessibilityWheelchair) o;
    return Objects.equals(accessibleRamp, v3StopAccessibilityWheelchair.accessibleRamp) &&
        Objects.equals(parking, v3StopAccessibilityWheelchair.parking) &&
        Objects.equals(telephone, v3StopAccessibilityWheelchair.telephone) &&
        Objects.equals(toilet, v3StopAccessibilityWheelchair.toilet) &&
        Objects.equals(lowTicketCounter, v3StopAccessibilityWheelchair.lowTicketCounter) &&
        Objects.equals(manouvering, v3StopAccessibilityWheelchair.manouvering) &&
        Objects.equals(raisedPlatform, v3StopAccessibilityWheelchair.raisedPlatform) &&
        Objects.equals(ramp, v3StopAccessibilityWheelchair.ramp) &&
        Objects.equals(secondaryPath, v3StopAccessibilityWheelchair.secondaryPath) &&
        Objects.equals(raisedPlatformShelther, v3StopAccessibilityWheelchair.raisedPlatformShelther) &&
        Objects.equals(steepRamp, v3StopAccessibilityWheelchair.steepRamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibleRamp, parking, telephone, toilet, lowTicketCounter, manouvering, raisedPlatform, ramp, secondaryPath, raisedPlatformShelther, steepRamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopAccessibilityWheelchair {\n");
    sb.append("    accessibleRamp: ").append(toIndentedString(accessibleRamp)).append("\n");
    sb.append("    parking: ").append(toIndentedString(parking)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    toilet: ").append(toIndentedString(toilet)).append("\n");
    sb.append("    lowTicketCounter: ").append(toIndentedString(lowTicketCounter)).append("\n");
    sb.append("    manouvering: ").append(toIndentedString(manouvering)).append("\n");
    sb.append("    raisedPlatform: ").append(toIndentedString(raisedPlatform)).append("\n");
    sb.append("    ramp: ").append(toIndentedString(ramp)).append("\n");
    sb.append("    secondaryPath: ").append(toIndentedString(secondaryPath)).append("\n");
    sb.append("    raisedPlatformShelther: ").append(toIndentedString(raisedPlatformShelther)).append("\n");
    sb.append("    steepRamp: ").append(toIndentedString(steepRamp)).append("\n");
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
