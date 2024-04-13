package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3OutletGeolocation;
import io.swagger.server.api.model.V3Status;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3OutletGeolocationResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3OutletGeolocationResponse   {
  
  private List<V3OutletGeolocation> outlets = null;

  private V3Status status = null;

  public V3OutletGeolocationResponse outlets(List<V3OutletGeolocation> outlets) {
    this.outlets = outlets;
    return this;
  }

  public V3OutletGeolocationResponse addOutletsItem(V3OutletGeolocation outletsItem) {
    if (this.outlets == null) {
      this.outlets = new ArrayList<V3OutletGeolocation>();
    }
    this.outlets.add(outletsItem);
    return this;
  }

  /**
   * myki ticket outlets
   * @return outlets
   **/
    public List<V3OutletGeolocation> getOutlets() {
    return outlets;
  }

  public void setOutlets(List<V3OutletGeolocation> outlets) {
    this.outlets = outlets;
  }

  public V3OutletGeolocationResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
    public V3Status getStatus() {
    return status;
  }

  public void setStatus(V3Status status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3OutletGeolocationResponse v3OutletGeolocationResponse = (V3OutletGeolocationResponse) o;
    return Objects.equals(this.outlets, v3OutletGeolocationResponse.outlets) &&
        Objects.equals(this.status, v3OutletGeolocationResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outlets, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3OutletGeolocationResponse {\n");
    
    sb.append("    outlets: ").append(toIndentedString(outlets)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
