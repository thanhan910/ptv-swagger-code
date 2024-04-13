package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3DynamoDbTimetable   {
  private String tableName = null;
  private Long parserVersion = null;
  private String parserMappingVersion = null;
  private Long ptVersion = null;
  private String ptMappingVersion = null;
@XmlType(name="TransportTypeEnum")
@XmlEnum(Integer.class)
public enum TransportTypeEnum {

    @XmlEnumValue(0) NUMBER_0(Integer.valueOf(0)), @XmlEnumValue(1) NUMBER_1(Integer.valueOf(1)), @XmlEnumValue(2) NUMBER_2(Integer.valueOf(2)), @XmlEnumValue(3) NUMBER_3(Integer.valueOf(3)), @XmlEnumValue(4) NUMBER_4(Integer.valueOf(4));


    private Integer value;

    TransportTypeEnum (Integer v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TransportTypeEnum fromValue(String v) {
        for (TransportTypeEnum b : TransportTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private TransportTypeEnum transportType = null;
  private String applicableLocalDate = null;
  private Boolean exists = null;

  /**
   * Name of corresponding table in DynamoDB.
   **/
  public V3DynamoDbTimetable tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  
  
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
  public V3DynamoDbTimetable parserVersion(Long parserVersion) {
    this.parserVersion = parserVersion;
    return this;
  }

  
  
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
  public V3DynamoDbTimetable parserMappingVersion(String parserMappingVersion) {
    this.parserMappingVersion = parserMappingVersion;
    return this;
  }

  
  
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
  public V3DynamoDbTimetable ptVersion(Long ptVersion) {
    this.ptVersion = ptVersion;
    return this;
  }

  
  
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
  public V3DynamoDbTimetable ptMappingVersion(String ptMappingVersion) {
    this.ptMappingVersion = ptMappingVersion;
    return this;
  }

  
  
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
  public V3DynamoDbTimetable transportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
    return this;
  }

  
  
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
  public V3DynamoDbTimetable applicableLocalDate(String applicableLocalDate) {
    this.applicableLocalDate = applicableLocalDate;
    return this;
  }

  
  
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
  public V3DynamoDbTimetable exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

  
  
  @Schema(description = "True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.")
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
