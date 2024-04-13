package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TransportTypeEnum transportType = null;
  private String applicableLocalDate = null;
  private Boolean exists = null;

  /**
   * Name of corresponding table in DynamoDB.
   **/
  
  @Schema(description = "Name of corresponding table in DynamoDB.")
  @JsonProperty("table_name")
  public String getTableName() {
    return tableName;
  }
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  /**
   * Parser verison
   **/
  
  @Schema(description = "Parser verison")
  @JsonProperty("parser_version")
  public Long getParserVersion() {
    return parserVersion;
  }
  public void setParserVersion(Long parserVersion) {
    this.parserVersion = parserVersion;
  }

  /**
   * Diva Mapping Version used to load Parser into DynamoDB
   **/
  
  @Schema(description = "Diva Mapping Version used to load Parser into DynamoDB")
  @JsonProperty("parser_mapping_version")
  public String getParserMappingVersion() {
    return parserMappingVersion;
  }
  public void setParserMappingVersion(String parserMappingVersion) {
    this.parserMappingVersion = parserMappingVersion;
  }

  /**
   * PT version
   **/
  
  @Schema(description = "PT version")
  @JsonProperty("pt_version")
  public Long getPtVersion() {
    return ptVersion;
  }
  public void setPtVersion(Long ptVersion) {
    this.ptVersion = ptVersion;
  }

  /**
   * Diva Mapping Version used to load PT into DynamoDB
   **/
  
  @Schema(description = "Diva Mapping Version used to load PT into DynamoDB")
  @JsonProperty("pt_mapping_version")
  public String getPtMappingVersion() {
    return ptMappingVersion;
  }
  public void setPtMappingVersion(String ptMappingVersion) {
    this.ptMappingVersion = ptMappingVersion;
  }

  /**
   * A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)
   **/
  
  @Schema(description = "A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)")
  @JsonProperty("transport_type")
  public TransportTypeEnum getTransportType() {
    return transportType;
  }
  public void setTransportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
  }

  /**
   * Formated date string of applicable date
   **/
  
  @Schema(description = "Formated date string of applicable date")
  @JsonProperty("applicable_local_date")
  public String getApplicableLocalDate() {
    return applicableLocalDate;
  }
  public void setApplicableLocalDate(String applicableLocalDate) {
    this.applicableLocalDate = applicableLocalDate;
  }

  /**
   * True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.
   **/
  
  @Schema(description = "True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.")
  @JsonProperty("exists")
  public Boolean isExists() {
    return exists;
  }
  public void setExists(Boolean exists) {
    this.exists = exists;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DynamoDbTimetable v3DynamoDbTimetable = (V3DynamoDbTimetable) o;
    return Objects.equals(tableName, v3DynamoDbTimetable.tableName) &&
        Objects.equals(parserVersion, v3DynamoDbTimetable.parserVersion) &&
        Objects.equals(parserMappingVersion, v3DynamoDbTimetable.parserMappingVersion) &&
        Objects.equals(ptVersion, v3DynamoDbTimetable.ptVersion) &&
        Objects.equals(ptMappingVersion, v3DynamoDbTimetable.ptMappingVersion) &&
        Objects.equals(transportType, v3DynamoDbTimetable.transportType) &&
        Objects.equals(applicableLocalDate, v3DynamoDbTimetable.applicableLocalDate) &&
        Objects.equals(exists, v3DynamoDbTimetable.exists);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
