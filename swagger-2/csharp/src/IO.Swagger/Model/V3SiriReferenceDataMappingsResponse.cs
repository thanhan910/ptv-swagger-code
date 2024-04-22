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
    /// V3SiriReferenceDataMappingsResponse
    /// </summary>
    [DataContract]
    public partial class V3SiriReferenceDataMappingsResponse :  IEquatable<V3SiriReferenceDataMappingsResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V3SiriReferenceDataMappingsResponse" /> class.
        /// </summary>
        /// <param name="status">API Status / Metadata.</param>
        public V3SiriReferenceDataMappingsResponse(V3Status status = default(V3Status))
        {
            this.Status = status;
        }
        
        /// <summary>
        /// Gets or Sets MappingVersion
        /// </summary>
        [DataMember(Name="mapping_version", EmitDefaultValue=false)]
        public string MappingVersion { get; private set; }

        /// <summary>
        /// SIRI LineRef
        /// </summary>
        /// <value>SIRI LineRef</value>
        [DataMember(Name="line_refs", EmitDefaultValue=false)]
        public Dictionary<string, V3SiriDirectionRefsDictionary> LineRefs { get; private set; }

        /// <summary>
        /// Gets or Sets StopPointRefs
        /// </summary>
        [DataMember(Name="stop_point_refs", EmitDefaultValue=false)]
        public Dictionary<string, V3StopPoint> StopPointRefs { get; private set; }

        /// <summary>
        /// API Status / Metadata
        /// </summary>
        /// <value>API Status / Metadata</value>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public V3Status Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3SiriReferenceDataMappingsResponse {\n");
            sb.Append("  MappingVersion: ").Append(MappingVersion).Append("\n");
            sb.Append("  LineRefs: ").Append(LineRefs).Append("\n");
            sb.Append("  StopPointRefs: ").Append(StopPointRefs).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
            return this.Equals(input as V3SiriReferenceDataMappingsResponse);
        }

        /// <summary>
        /// Returns true if V3SiriReferenceDataMappingsResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of V3SiriReferenceDataMappingsResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3SiriReferenceDataMappingsResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.MappingVersion == input.MappingVersion ||
                    (this.MappingVersion != null &&
                    this.MappingVersion.Equals(input.MappingVersion))
                ) && 
                (
                    this.LineRefs == input.LineRefs ||
                    this.LineRefs != null &&
                    this.LineRefs.SequenceEqual(input.LineRefs)
                ) && 
                (
                    this.StopPointRefs == input.StopPointRefs ||
                    this.StopPointRefs != null &&
                    this.StopPointRefs.SequenceEqual(input.StopPointRefs)
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
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
                if (this.MappingVersion != null)
                    hashCode = hashCode * 59 + this.MappingVersion.GetHashCode();
                if (this.LineRefs != null)
                    hashCode = hashCode * 59 + this.LineRefs.GetHashCode();
                if (this.StopPointRefs != null)
                    hashCode = hashCode * 59 + this.StopPointRefs.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
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
