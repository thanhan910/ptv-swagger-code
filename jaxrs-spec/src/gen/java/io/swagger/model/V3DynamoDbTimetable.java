package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3DynamoDbTimetable   {

  private @Valid String tableName = null;

  private @Valid Long parserVersion = null;

  private @Valid String parserMappingVersion = null;

  private @Valid Long ptVersion = null;

  private @Valid String ptMappingVersion = null;

public enum TransportTypeEnum {

    NUMBER_0(Integer.valueOf(0)), NUMBER_1(Integer.valueOf(1)), NUMBER_2(Integer.valueOf(2)), NUMBER_3(Integer.valueOf(3)), NUMBER_4(Integer.valueOf(4));


    private Integer value;

    TransportTypeEnum (Integer v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TransportTypeEnum fromValue(String v) {
        for (TransportTypeEnum b : TransportTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private @Valid TransportTypeEnum transportType = null;

  private @Valid String applicableLocalDate = null;

  private @Valid Boolean exists = null;

  /**
   * Name of corresponding table in DynamoDB.
   **/
  public V3DynamoDbTimetable tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of corresponding table in DynamoDB.")
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
  public V3DynamoDbTimetable parserVersion(Long parserVersion) {
    this.parserVersion = parserVersion;
    return this;
  }

  
  @ApiModelProperty(value = "Parser verison")
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
  public V3DynamoDbTimetable parserMappingVersion(String parserMappingVersion) {
    this.parserMappingVersion = parserMappingVersion;
    return this;
  }

  
  @ApiModelProperty(value = "Diva Mapping Version used to load Parser into DynamoDB")
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
  public V3DynamoDbTimetable ptVersion(Long ptVersion) {
    this.ptVersion = ptVersion;
    return this;
  }

  
  @ApiModelProperty(value = "PT version")
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
  public V3DynamoDbTimetable ptMappingVersion(String ptMappingVersion) {
    this.ptMappingVersion = ptMappingVersion;
    return this;
  }

  
  @ApiModelProperty(value = "Diva Mapping Version used to load PT into DynamoDB")
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
  public V3DynamoDbTimetable transportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
    return this;
  }

  
  @ApiModelProperty(value = "A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)")
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
  public V3DynamoDbTimetable applicableLocalDate(String applicableLocalDate) {
    this.applicableLocalDate = applicableLocalDate;
    return this;
  }

  
  @ApiModelProperty(value = "Formated date string of applicable date")
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
  public V3DynamoDbTimetable exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

  
  @ApiModelProperty(value = "True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.")
  @JsonProperty("exists")

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
