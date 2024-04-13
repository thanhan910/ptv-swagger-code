package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3DynamoDbTimetable
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3DynamoDbTimetable   {
  private String tableName = null;

  private Long parserVersion = null;

  private String parserMappingVersion = null;

  private Long ptVersion = null;

  private String ptMappingVersion = null;

  /**
   * A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)
   */
  public enum TransportTypeEnum {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4);

    private Integer value;

    TransportTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransportTypeEnum fromValue(Integer value) {
      for (TransportTypeEnum b : TransportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private TransportTypeEnum transportType = null;

  private String applicableLocalDate = null;

  private Boolean exists = null;

  public V3DynamoDbTimetable tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * Name of corresponding table in DynamoDB.
   * @return tableName
   **/
    public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public V3DynamoDbTimetable parserVersion(Long parserVersion) {
    this.parserVersion = parserVersion;
    return this;
  }

  /**
   * Parser verison
   * @return parserVersion
   **/
    public Long getParserVersion() {
    return parserVersion;
  }

  public void setParserVersion(Long parserVersion) {
    this.parserVersion = parserVersion;
  }

  public V3DynamoDbTimetable parserMappingVersion(String parserMappingVersion) {
    this.parserMappingVersion = parserMappingVersion;
    return this;
  }

  /**
   * Diva Mapping Version used to load Parser into DynamoDB
   * @return parserMappingVersion
   **/
    public String getParserMappingVersion() {
    return parserMappingVersion;
  }

  public void setParserMappingVersion(String parserMappingVersion) {
    this.parserMappingVersion = parserMappingVersion;
  }

  public V3DynamoDbTimetable ptVersion(Long ptVersion) {
    this.ptVersion = ptVersion;
    return this;
  }

  /**
   * PT version
   * @return ptVersion
   **/
    public Long getPtVersion() {
    return ptVersion;
  }

  public void setPtVersion(Long ptVersion) {
    this.ptVersion = ptVersion;
  }

  public V3DynamoDbTimetable ptMappingVersion(String ptMappingVersion) {
    this.ptMappingVersion = ptMappingVersion;
    return this;
  }

  /**
   * Diva Mapping Version used to load PT into DynamoDB
   * @return ptMappingVersion
   **/
    public String getPtMappingVersion() {
    return ptMappingVersion;
  }

  public void setPtMappingVersion(String ptMappingVersion) {
    this.ptMappingVersion = ptMappingVersion;
  }

  public V3DynamoDbTimetable transportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
    return this;
  }

  /**
   * A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)
   * @return transportType
   **/
    public TransportTypeEnum getTransportType() {
    return transportType;
  }

  public void setTransportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
  }

  public V3DynamoDbTimetable applicableLocalDate(String applicableLocalDate) {
    this.applicableLocalDate = applicableLocalDate;
    return this;
  }

  /**
   * Formated date string of applicable date
   * @return applicableLocalDate
   **/
    public String getApplicableLocalDate() {
    return applicableLocalDate;
  }

  public void setApplicableLocalDate(String applicableLocalDate) {
    this.applicableLocalDate = applicableLocalDate;
  }

  public V3DynamoDbTimetable exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

  /**
   * True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.
   * @return exists
   **/
    public Boolean isExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DynamoDbTimetable v3DynamoDbTimetable = (V3DynamoDbTimetable) o;
    return Objects.equals(this.tableName, v3DynamoDbTimetable.tableName) &&
        Objects.equals(this.parserVersion, v3DynamoDbTimetable.parserVersion) &&
        Objects.equals(this.parserMappingVersion, v3DynamoDbTimetable.parserMappingVersion) &&
        Objects.equals(this.ptVersion, v3DynamoDbTimetable.ptVersion) &&
        Objects.equals(this.ptMappingVersion, v3DynamoDbTimetable.ptMappingVersion) &&
        Objects.equals(this.transportType, v3DynamoDbTimetable.transportType) &&
        Objects.equals(this.applicableLocalDate, v3DynamoDbTimetable.applicableLocalDate) &&
        Objects.equals(this.exists, v3DynamoDbTimetable.exists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName, parserVersion, parserMappingVersion, ptVersion, ptMappingVersion, transportType, applicableLocalDate, exists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DynamoDbTimetable {\n");
    
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    parserVersion: ").append(toIndentedString(parserVersion)).append("\n");
    sb.append("    parserMappingVersion: ").append(toIndentedString(parserMappingVersion)).append("\n");
    sb.append("    ptVersion: ").append(toIndentedString(ptVersion)).append("\n");
    sb.append("    ptMappingVersion: ").append(toIndentedString(ptMappingVersion)).append("\n");
    sb.append("    transportType: ").append(toIndentedString(transportType)).append("\n");
    sb.append("    applicableLocalDate: ").append(toIndentedString(applicableLocalDate)).append("\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
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
