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

public class V3StopAccessibilityWheelchair   {
  
  @Schema(description = "")
  private Boolean accessibleRamp = null;
  
  @Schema(description = "Indicates if there is at least one accessible parking spot at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
 /**
   * Indicates if there is at least one accessible parking spot at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)  
  **/
  private Boolean parking = null;
  
  @Schema(description = "Indicates if there is at least one accessible telephone at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
 /**
   * Indicates if there is at least one accessible telephone at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)  
  **/
  private Boolean telephone = null;
  
  @Schema(description = "Indicates if there is at least one accessible toilet at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
 /**
   * Indicates if there is at least one accessible toilet at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)  
  **/
  private Boolean toilet = null;
  
  @Schema(description = "Indicates if there is at least one low ticket counter at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
 /**
   * Indicates if there is at least one low ticket counter at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)  
  **/
  private Boolean lowTicketCounter = null;
  
  @Schema(description = "Indicates if there is a space for mobility device to board on or off a transport mode")
 /**
   * Indicates if there is a space for mobility device to board on or off a transport mode  
  **/
  private Boolean manouvering = null;
  
  @Schema(description = "Indicates if there is a raised platform to board a train")
 /**
   * Indicates if there is a raised platform to board a train  
  **/
  private Boolean raisedPlatform = null;
  
  @Schema(description = "Indicates if there are ramps (&lt;1:14) at the stop/platform")
 /**
   * Indicates if there are ramps (&lt;1:14) at the stop/platform  
  **/
  private Boolean ramp = null;
  
  @Schema(description = "Indicates if there is a path beyond the stop which is accessible")
 /**
   * Indicates if there is a path beyond the stop which is accessible  
  **/
  private Boolean secondaryPath = null;
  
  @Schema(description = "Indicates if there is shelter near the raised platform")
 /**
   * Indicates if there is shelter near the raised platform  
  **/
  private Boolean raisedPlatformShelther = null;
  
  @Schema(description = "Indicates if there are ramps (&gt;1:14) at the stop/platform")
 /**
   * Indicates if there are ramps (&gt;1:14) at the stop/platform  
  **/
  private Boolean steepRamp = null;
 /**
   * Get accessibleRamp
   * @return accessibleRamp
  **/
  @JsonProperty("accessible_ramp")
  public Boolean isAccessibleRamp() {
    return accessibleRamp;
  }

  public void setAccessibleRamp(Boolean accessibleRamp) {
    this.accessibleRamp = accessibleRamp;
  }

  public V3StopAccessibilityWheelchair accessibleRamp(Boolean accessibleRamp) {
    this.accessibleRamp = accessibleRamp;
    return this;
  }

 /**
   * Indicates if there is at least one accessible parking spot at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
   * @return parking
  **/
  @JsonProperty("parking")
  public Boolean isParking() {
    return parking;
  }

  public void setParking(Boolean parking) {
    this.parking = parking;
  }

  public V3StopAccessibilityWheelchair parking(Boolean parking) {
    this.parking = parking;
    return this;
  }

 /**
   * Indicates if there is at least one accessible telephone at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
   * @return telephone
  **/
  @JsonProperty("telephone")
  public Boolean isTelephone() {
    return telephone;
  }

  public void setTelephone(Boolean telephone) {
    this.telephone = telephone;
  }

  public V3StopAccessibilityWheelchair telephone(Boolean telephone) {
    this.telephone = telephone;
    return this;
  }

 /**
   * Indicates if there is at least one accessible toilet at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
   * @return toilet
  **/
  @JsonProperty("toilet")
  public Boolean isToilet() {
    return toilet;
  }

  public void setToilet(Boolean toilet) {
    this.toilet = toilet;
  }

  public V3StopAccessibilityWheelchair toilet(Boolean toilet) {
    this.toilet = toilet;
    return this;
  }

 /**
   * Indicates if there is at least one low ticket counter at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
   * @return lowTicketCounter
  **/
  @JsonProperty("low_ticket_counter")
  public Boolean isLowTicketCounter() {
    return lowTicketCounter;
  }

  public void setLowTicketCounter(Boolean lowTicketCounter) {
    this.lowTicketCounter = lowTicketCounter;
  }

  public V3StopAccessibilityWheelchair lowTicketCounter(Boolean lowTicketCounter) {
    this.lowTicketCounter = lowTicketCounter;
    return this;
  }

 /**
   * Indicates if there is a space for mobility device to board on or off a transport mode
   * @return manouvering
  **/
  @JsonProperty("manouvering")
  public Boolean isManouvering() {
    return manouvering;
  }

  public void setManouvering(Boolean manouvering) {
    this.manouvering = manouvering;
  }

  public V3StopAccessibilityWheelchair manouvering(Boolean manouvering) {
    this.manouvering = manouvering;
    return this;
  }

 /**
   * Indicates if there is a raised platform to board a train
   * @return raisedPlatform
  **/
  @JsonProperty("raised_platform")
  public Boolean isRaisedPlatform() {
    return raisedPlatform;
  }

  public void setRaisedPlatform(Boolean raisedPlatform) {
    this.raisedPlatform = raisedPlatform;
  }

  public V3StopAccessibilityWheelchair raisedPlatform(Boolean raisedPlatform) {
    this.raisedPlatform = raisedPlatform;
    return this;
  }

 /**
   * Indicates if there are ramps (&amp;lt;1:14) at the stop/platform
   * @return ramp
  **/
  @JsonProperty("ramp")
  public Boolean isRamp() {
    return ramp;
  }

  public void setRamp(Boolean ramp) {
    this.ramp = ramp;
  }

  public V3StopAccessibilityWheelchair ramp(Boolean ramp) {
    this.ramp = ramp;
    return this;
  }

 /**
   * Indicates if there is a path beyond the stop which is accessible
   * @return secondaryPath
  **/
  @JsonProperty("secondary_path")
  public Boolean isSecondaryPath() {
    return secondaryPath;
  }

  public void setSecondaryPath(Boolean secondaryPath) {
    this.secondaryPath = secondaryPath;
  }

  public V3StopAccessibilityWheelchair secondaryPath(Boolean secondaryPath) {
    this.secondaryPath = secondaryPath;
    return this;
  }

 /**
   * Indicates if there is shelter near the raised platform
   * @return raisedPlatformShelther
  **/
  @JsonProperty("raised_platform_shelther")
  public Boolean isRaisedPlatformShelther() {
    return raisedPlatformShelther;
  }

  public void setRaisedPlatformShelther(Boolean raisedPlatformShelther) {
    this.raisedPlatformShelther = raisedPlatformShelther;
  }

  public V3StopAccessibilityWheelchair raisedPlatformShelther(Boolean raisedPlatformShelther) {
    this.raisedPlatformShelther = raisedPlatformShelther;
    return this;
  }

 /**
   * Indicates if there are ramps (&amp;gt;1:14) at the stop/platform
   * @return steepRamp
  **/
  @JsonProperty("steep_ramp")
  public Boolean isSteepRamp() {
    return steepRamp;
  }

  public void setSteepRamp(Boolean steepRamp) {
    this.steepRamp = steepRamp;
  }

  public V3StopAccessibilityWheelchair steepRamp(Boolean steepRamp) {
    this.steepRamp = steepRamp;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
