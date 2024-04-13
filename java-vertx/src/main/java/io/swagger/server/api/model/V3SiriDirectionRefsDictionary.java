package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3SiriStopsRefsDictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3SiriDirectionRefsDictionary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3SiriDirectionRefsDictionary   {
  
  private Map<String, V3SiriStopsRefsDictionary> directionRefs = null;

  public V3SiriDirectionRefsDictionary directionRefs(Map<String, V3SiriStopsRefsDictionary> directionRefs) {
    this.directionRefs = directionRefs;
    return this;
  }

  public V3SiriDirectionRefsDictionary putDirectionRefsItem(String key, V3SiriStopsRefsDictionary directionRefsItem) {
    if (this.directionRefs == null) {
      this.directionRefs = new HashMap<String, V3SiriStopsRefsDictionary>();
    }
    this.directionRefs.put(key, directionRefsItem);
    return this;
  }

  /**
   * Get directionRefs
   * @return directionRefs
   **/
    public Map<String, V3SiriStopsRefsDictionary> getDirectionRefs() {
    return directionRefs;
  }

  public void setDirectionRefs(Map<String, V3SiriStopsRefsDictionary> directionRefs) {
    this.directionRefs = directionRefs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriDirectionRefsDictionary v3SiriDirectionRefsDictionary = (V3SiriDirectionRefsDictionary) o;
    return Objects.equals(this.directionRefs, v3SiriDirectionRefsDictionary.directionRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directionRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriDirectionRefsDictionary {\n");
    
    sb.append("    directionRefs: ").append(toIndentedString(directionRefs)).append("\n");
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
