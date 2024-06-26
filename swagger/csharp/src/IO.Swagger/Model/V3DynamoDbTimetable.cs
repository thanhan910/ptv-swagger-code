/* 
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;
namespace IO.Swagger.Model
{
    /// <summary>
    /// V3DynamoDbTimetable
    /// </summary>
    [DataContract]
        public partial class V3DynamoDbTimetable :  IEquatable<V3DynamoDbTimetable>, IValidatableObject
    {
        /// <summary>
        /// A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)
        /// </summary>
        /// <value>A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)</value>
                public enum TransportTypeEnum
        {
            /// <summary>
            /// Enum NUMBER_0 for value: 0
            /// </summary>
            
            NUMBER_0 = 0,
            /// <summary>
            /// Enum NUMBER_1 for value: 1
            /// </summary>
            
            NUMBER_1 = 1,
            /// <summary>
            /// Enum NUMBER_2 for value: 2
            /// </summary>
            
            NUMBER_2 = 2,
            /// <summary>
            /// Enum NUMBER_3 for value: 3
            /// </summary>
            
            NUMBER_3 = 3,
            /// <summary>
            /// Enum NUMBER_4 for value: 4
            /// </summary>
            
            NUMBER_4 = 4        }
        /// <summary>
        /// A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)
        /// </summary>
        /// <value>A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)</value>
        [DataMember(Name="transport_type", EmitDefaultValue=false)]
        public TransportTypeEnum? TransportType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="V3DynamoDbTimetable" /> class.
        /// </summary>
        /// <param name="tableName">Name of corresponding table in DynamoDB..</param>
        /// <param name="parserVersion">Parser verison.</param>
        /// <param name="parserMappingVersion">Diva Mapping Version used to load Parser into DynamoDB.</param>
        /// <param name="ptVersion">PT version.</param>
        /// <param name="ptMappingVersion">Diva Mapping Version used to load PT into DynamoDB.</param>
        /// <param name="transportType">A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider).</param>
        /// <param name="exists">True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type..</param>
        public V3DynamoDbTimetable(string tableName = default(string), long? parserVersion = default(long?), string parserMappingVersion = default(string), long? ptVersion = default(long?), string ptMappingVersion = default(string), TransportTypeEnum? transportType = default(TransportTypeEnum?), bool? exists = default(bool?))
        {
            this.TableName = tableName;
            this.ParserVersion = parserVersion;
            this.ParserMappingVersion = parserMappingVersion;
            this.PtVersion = ptVersion;
            this.PtMappingVersion = ptMappingVersion;
            this.TransportType = transportType;
            this.Exists = exists;
        }
        
        /// <summary>
        /// Name of corresponding table in DynamoDB.
        /// </summary>
        /// <value>Name of corresponding table in DynamoDB.</value>
        [DataMember(Name="table_name", EmitDefaultValue=false)]
        public string TableName { get; set; }

        /// <summary>
        /// Parser verison
        /// </summary>
        /// <value>Parser verison</value>
        [DataMember(Name="parser_version", EmitDefaultValue=false)]
        public long? ParserVersion { get; set; }

        /// <summary>
        /// Diva Mapping Version used to load Parser into DynamoDB
        /// </summary>
        /// <value>Diva Mapping Version used to load Parser into DynamoDB</value>
        [DataMember(Name="parser_mapping_version", EmitDefaultValue=false)]
        public string ParserMappingVersion { get; set; }

        /// <summary>
        /// PT version
        /// </summary>
        /// <value>PT version</value>
        [DataMember(Name="pt_version", EmitDefaultValue=false)]
        public long? PtVersion { get; set; }

        /// <summary>
        /// Diva Mapping Version used to load PT into DynamoDB
        /// </summary>
        /// <value>Diva Mapping Version used to load PT into DynamoDB</value>
        [DataMember(Name="pt_mapping_version", EmitDefaultValue=false)]
        public string PtMappingVersion { get; set; }


        /// <summary>
        /// Formated date string of applicable date
        /// </summary>
        /// <value>Formated date string of applicable date</value>
        [DataMember(Name="applicable_local_date", EmitDefaultValue=false)]
        public string ApplicableLocalDate { get; private set; }

        /// <summary>
        /// True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.
        /// </summary>
        /// <value>True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.</value>
        [DataMember(Name="exists", EmitDefaultValue=false)]
        public bool? Exists { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3DynamoDbTimetable {\n");
            sb.Append("  TableName: ").Append(TableName).Append("\n");
            sb.Append("  ParserVersion: ").Append(ParserVersion).Append("\n");
            sb.Append("  ParserMappingVersion: ").Append(ParserMappingVersion).Append("\n");
            sb.Append("  PtVersion: ").Append(PtVersion).Append("\n");
            sb.Append("  PtMappingVersion: ").Append(PtMappingVersion).Append("\n");
            sb.Append("  TransportType: ").Append(TransportType).Append("\n");
            sb.Append("  ApplicableLocalDate: ").Append(ApplicableLocalDate).Append("\n");
            sb.Append("  Exists: ").Append(Exists).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as V3DynamoDbTimetable);
        }

        /// <summary>
        /// Returns true if V3DynamoDbTimetable instances are equal
        /// </summary>
        /// <param name="input">Instance of V3DynamoDbTimetable to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3DynamoDbTimetable input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.TableName == input.TableName ||
                    (this.TableName != null &&
                    this.TableName.Equals(input.TableName))
                ) && 
                (
                    this.ParserVersion == input.ParserVersion ||
                    (this.ParserVersion != null &&
                    this.ParserVersion.Equals(input.ParserVersion))
                ) && 
                (
                    this.ParserMappingVersion == input.ParserMappingVersion ||
                    (this.ParserMappingVersion != null &&
                    this.ParserMappingVersion.Equals(input.ParserMappingVersion))
                ) && 
                (
                    this.PtVersion == input.PtVersion ||
                    (this.PtVersion != null &&
                    this.PtVersion.Equals(input.PtVersion))
                ) && 
                (
                    this.PtMappingVersion == input.PtMappingVersion ||
                    (this.PtMappingVersion != null &&
                    this.PtMappingVersion.Equals(input.PtMappingVersion))
                ) && 
                (
                    this.TransportType == input.TransportType ||
                    (this.TransportType != null &&
                    this.TransportType.Equals(input.TransportType))
                ) && 
                (
                    this.ApplicableLocalDate == input.ApplicableLocalDate ||
                    (this.ApplicableLocalDate != null &&
                    this.ApplicableLocalDate.Equals(input.ApplicableLocalDate))
                ) && 
                (
                    this.Exists == input.Exists ||
                    (this.Exists != null &&
                    this.Exists.Equals(input.Exists))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.TableName != null)
                    hashCode = hashCode * 59 + this.TableName.GetHashCode();
                if (this.ParserVersion != null)
                    hashCode = hashCode * 59 + this.ParserVersion.GetHashCode();
                if (this.ParserMappingVersion != null)
                    hashCode = hashCode * 59 + this.ParserMappingVersion.GetHashCode();
                if (this.PtVersion != null)
                    hashCode = hashCode * 59 + this.PtVersion.GetHashCode();
                if (this.PtMappingVersion != null)
                    hashCode = hashCode * 59 + this.PtMappingVersion.GetHashCode();
                if (this.TransportType != null)
                    hashCode = hashCode * 59 + this.TransportType.GetHashCode();
                if (this.ApplicableLocalDate != null)
                    hashCode = hashCode * 59 + this.ApplicableLocalDate.GetHashCode();
                if (this.Exists != null)
                    hashCode = hashCode * 59 + this.Exists.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}
