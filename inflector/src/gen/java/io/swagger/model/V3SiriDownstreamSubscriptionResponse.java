package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3SiriDownstreamSubscriptionResponse   {
  @JsonProperty("valid_until")
  private Date validUntil = null;
  /**
   * The Data Horizon of Chronos
   **/
  public V3SiriDownstreamSubscriptionResponse validUntil(Date validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  
  @Schema(description = "The Data Horizon of Chronos")
  @JsonProperty("valid_until")
  public Date getValidUntil() {
    return validUntil;
  }
  public void setValidUntil(Date validUntil) {
    this.validUntil = validUntil;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriDownstreamSubscriptionResponse v3SiriDownstreamSubscriptionResponse = (V3SiriDownstreamSubscriptionResponse) o;
    return Objects.equals(validUntil, v3SiriDownstreamSubscriptionResponse.validUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validUntil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriDownstreamSubscriptionResponse {\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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
