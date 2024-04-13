package io.swagger.model;

import javax.validation.constraints.*;

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

public class V3DynamoDbTimetable   {
  
  @Schema(description = "Name of corresponding table in DynamoDB.")
 /**
   * Name of corresponding table in DynamoDB.  
  **/
  private String tableName = null;
  
  @Schema(description = "Parser verison")
 /**
   * Parser verison  
  **/
  private Long parserVersion = null;
  
  @Schema(description = "Diva Mapping Version used to load Parser into DynamoDB")
 /**
   * Diva Mapping Version used to load Parser into DynamoDB  
  **/
  private String parserMappingVersion = null;
  
  @Schema(description = "PT version")
 /**
   * PT version  
  **/
  private Long ptVersion = null;
  
  @Schema(description = "Diva Mapping Version used to load PT into DynamoDB")
 /**
   * Diva Mapping Version used to load PT into DynamoDB  
  **/
  private String ptMappingVersion = null;
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
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TransportTypeEnum fromValue(String text) {
      for (TransportTypeEnum b : TransportTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)")
 /**
   * A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)  
  **/
  private TransportTypeEnum transportType = null;
  
  @Schema(description = "Formated date string of applicable date")
 /**
   * Formated date string of applicable date  
  **/
  private String applicableLocalDate = null;
  
  @Schema(description = "True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.")
 /**
   * True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.  
  **/
  private Boolean exists = null;
 /**
   * Name of corresponding table in DynamoDB.
   * @return tableName
  **/
  @JsonProperty("table_name")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public V3DynamoDbTimetable tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

 /**
   * Parser verison
   * @return parserVersion
  **/
  @JsonProperty("parser_version")
  public Long getParserVersion() {
    return parserVersion;
  }

  public void setParserVersion(Long parserVersion) {
    this.parserVersion = parserVersion;
  }

  public V3DynamoDbTimetable parserVersion(Long parserVersion) {
    this.parserVersion = parserVersion;
    return this;
  }

 /**
   * Diva Mapping Version used to load Parser into DynamoDB
   * @return parserMappingVersion
  **/
  @JsonProperty("parser_mapping_version")
  public String getParserMappingVersion() {
    return parserMappingVersion;
  }

  public void setParserMappingVersion(String parserMappingVersion) {
    this.parserMappingVersion = parserMappingVersion;
  }

  public V3DynamoDbTimetable parserMappingVersion(String parserMappingVersion) {
    this.parserMappingVersion = parserMappingVersion;
    return this;
  }

 /**
   * PT version
   * @return ptVersion
  **/
  @JsonProperty("pt_version")
  public Long getPtVersion() {
    return ptVersion;
  }

  public void setPtVersion(Long ptVersion) {
    this.ptVersion = ptVersion;
  }

  public V3DynamoDbTimetable ptVersion(Long ptVersion) {
    this.ptVersion = ptVersion;
    return this;
  }

 /**
   * Diva Mapping Version used to load PT into DynamoDB
   * @return ptMappingVersion
  **/
  @JsonProperty("pt_mapping_version")
  public String getPtMappingVersion() {
    return ptMappingVersion;
  }

  public void setPtMappingVersion(String ptMappingVersion) {
    this.ptMappingVersion = ptMappingVersion;
  }

  public V3DynamoDbTimetable ptMappingVersion(String ptMappingVersion) {
    this.ptMappingVersion = ptMappingVersion;
    return this;
  }

 /**
   * A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)
   * @return transportType
  **/
  @JsonProperty("transport_type")
  public Integer getTransportType() {
    if (transportType == null) {
      return null;
    }
    return transportType.getValue();
  }

  public void setTransportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
  }

  public V3DynamoDbTimetable transportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
    return this;
  }

 /**
   * Formated date string of applicable date
   * @return applicableLocalDate
  **/
  @JsonProperty("applicable_local_date")
  public String getApplicableLocalDate() {
    return applicableLocalDate;
  }


 /**
   * True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.
   * @return exists
  **/
  @JsonProperty("exists")
  public Boolean isExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }

  public V3DynamoDbTimetable exists(Boolean exists) {
    this.exists = exists;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
