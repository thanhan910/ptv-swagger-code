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
    /// V3DeparturesBroadParameters
    /// </summary>
    [DataContract]
    public partial class V3DeparturesBroadParameters :  IEquatable<V3DeparturesBroadParameters>, IValidatableObject
    {
        /// <summary>
        /// Defines Expand
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ExpandEnum
        {
            
            /// <summary>
            /// Enum All for value: All
            /// </summary>
            [EnumMember(Value = "All")]
            All = 1,
            
            /// <summary>
            /// Enum Stop for value: Stop
            /// </summary>
            [EnumMember(Value = "Stop")]
            Stop = 2,
            
            /// <summary>
            /// Enum Route for value: Route
            /// </summary>
            [EnumMember(Value = "Route")]
            Route = 3,
            
            /// <summary>
            /// Enum Run for value: Run
            /// </summary>
            [EnumMember(Value = "Run")]
            Run = 4,
            
            /// <summary>
            /// Enum Direction for value: Direction
            /// </summary>
            [EnumMember(Value = "Direction")]
            Direction = 5,
            
            /// <summary>
            /// Enum Disruption for value: Disruption
            /// </summary>
            [EnumMember(Value = "Disruption")]
            Disruption = 6,
            
            /// <summary>
            /// Enum VehicleDescriptor for value: VehicleDescriptor
            /// </summary>
            [EnumMember(Value = "VehicleDescriptor")]
            VehicleDescriptor = 7,
            
            /// <summary>
            /// Enum VehiclePosition for value: VehiclePosition
            /// </summary>
            [EnumMember(Value = "VehiclePosition")]
            VehiclePosition = 8,
            
            /// <summary>
            /// Enum None for value: None
            /// </summary>
            [EnumMember(Value = "None")]
            None = 9
        }


        /// <summary>
        /// List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
        /// </summary>
        /// <value>List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.</value>
        [DataMember(Name="expand", EmitDefaultValue=false)]
        public List<ExpandEnum> Expand { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="V3DeparturesBroadParameters" /> class.
        /// </summary>
        /// <param name="platformNumbers">Filter by platform number at stop.</param>
        /// <param name="directionId">Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}.</param>
        /// <param name="gtfs">Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data.</param>
        /// <param name="dateUtc">Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time).</param>
        /// <param name="maxResults">Maximum number of results returned.</param>
        /// <param name="includeCancelled">Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only.</param>
        /// <param name="lookBackwards">Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0..</param>
        /// <param name="expand">List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information..</param>
        /// <param name="includeGeopath">Indicates if the route geopath should be returned.</param>
        public V3DeparturesBroadParameters(List<int?> platformNumbers = default(List<int?>), int? directionId = default(int?), bool? gtfs = default(bool?), DateTime? dateUtc = default(DateTime?), int? maxResults = default(int?), bool? includeCancelled = default(bool?), bool? lookBackwards = default(bool?), List<ExpandEnum> expand = default(List<ExpandEnum>), bool? includeGeopath = default(bool?))
        {
            this.PlatformNumbers = platformNumbers;
            this.DirectionId = directionId;
            this.Gtfs = gtfs;
            this.DateUtc = dateUtc;
            this.MaxResults = maxResults;
            this.IncludeCancelled = includeCancelled;
            this.LookBackwards = lookBackwards;
            this.Expand = expand;
            this.IncludeGeopath = includeGeopath;
        }
        
        /// <summary>
        /// Filter by platform number at stop
        /// </summary>
        /// <value>Filter by platform number at stop</value>
        [DataMember(Name="platform_numbers", EmitDefaultValue=false)]
        public List<int?> PlatformNumbers { get; set; }

        /// <summary>
        /// Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
        /// </summary>
        /// <value>Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}</value>
        [DataMember(Name="direction_id", EmitDefaultValue=false)]
        public int? DirectionId { get; set; }

        /// <summary>
        /// Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data
        /// </summary>
        /// <value>Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data</value>
        [DataMember(Name="gtfs", EmitDefaultValue=false)]
        public bool? Gtfs { get; set; }

        /// <summary>
        /// Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)
        /// </summary>
        /// <value>Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)</value>
        [DataMember(Name="date_utc", EmitDefaultValue=false)]
        public DateTime? DateUtc { get; set; }

        /// <summary>
        /// Maximum number of results returned
        /// </summary>
        /// <value>Maximum number of results returned</value>
        [DataMember(Name="max_results", EmitDefaultValue=false)]
        public int? MaxResults { get; set; }

        /// <summary>
        /// Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only
        /// </summary>
        /// <value>Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only</value>
        [DataMember(Name="include_cancelled", EmitDefaultValue=false)]
        public bool? IncludeCancelled { get; set; }

        /// <summary>
        /// Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.
        /// </summary>
        /// <value>Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.</value>
        [DataMember(Name="look_backwards", EmitDefaultValue=false)]
        public bool? LookBackwards { get; set; }


        /// <summary>
        /// Indicates if the route geopath should be returned
        /// </summary>
        /// <value>Indicates if the route geopath should be returned</value>
        [DataMember(Name="include_geopath", EmitDefaultValue=false)]
        public bool? IncludeGeopath { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3DeparturesBroadParameters {\n");
            sb.Append("  PlatformNumbers: ").Append(PlatformNumbers).Append("\n");
            sb.Append("  DirectionId: ").Append(DirectionId).Append("\n");
            sb.Append("  Gtfs: ").Append(Gtfs).Append("\n");
            sb.Append("  DateUtc: ").Append(DateUtc).Append("\n");
            sb.Append("  MaxResults: ").Append(MaxResults).Append("\n");
            sb.Append("  IncludeCancelled: ").Append(IncludeCancelled).Append("\n");
            sb.Append("  LookBackwards: ").Append(LookBackwards).Append("\n");
            sb.Append("  Expand: ").Append(Expand).Append("\n");
            sb.Append("  IncludeGeopath: ").Append(IncludeGeopath).Append("\n");
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
            return this.Equals(input as V3DeparturesBroadParameters);
        }

        /// <summary>
        /// Returns true if V3DeparturesBroadParameters instances are equal
        /// </summary>
        /// <param name="input">Instance of V3DeparturesBroadParameters to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3DeparturesBroadParameters input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PlatformNumbers == input.PlatformNumbers ||
                    this.PlatformNumbers != null &&
                    this.PlatformNumbers.SequenceEqual(input.PlatformNumbers)
                ) && 
                (
                    this.DirectionId == input.DirectionId ||
                    (this.DirectionId != null &&
                    this.DirectionId.Equals(input.DirectionId))
                ) && 
                (
                    this.Gtfs == input.Gtfs ||
                    (this.Gtfs != null &&
                    this.Gtfs.Equals(input.Gtfs))
                ) && 
                (
                    this.DateUtc == input.DateUtc ||
                    (this.DateUtc != null &&
                    this.DateUtc.Equals(input.DateUtc))
                ) && 
                (
                    this.MaxResults == input.MaxResults ||
                    (this.MaxResults != null &&
                    this.MaxResults.Equals(input.MaxResults))
                ) && 
                (
                    this.IncludeCancelled == input.IncludeCancelled ||
                    (this.IncludeCancelled != null &&
                    this.IncludeCancelled.Equals(input.IncludeCancelled))
                ) && 
                (
                    this.LookBackwards == input.LookBackwards ||
                    (this.LookBackwards != null &&
                    this.LookBackwards.Equals(input.LookBackwards))
                ) && 
                (
                    this.Expand == input.Expand ||
                    this.Expand != null &&
                    this.Expand.SequenceEqual(input.Expand)
                ) && 
                (
                    this.IncludeGeopath == input.IncludeGeopath ||
                    (this.IncludeGeopath != null &&
                    this.IncludeGeopath.Equals(input.IncludeGeopath))
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
                if (this.PlatformNumbers != null)
                    hashCode = hashCode * 59 + this.PlatformNumbers.GetHashCode();
                if (this.DirectionId != null)
                    hashCode = hashCode * 59 + this.DirectionId.GetHashCode();
                if (this.Gtfs != null)
                    hashCode = hashCode * 59 + this.Gtfs.GetHashCode();
                if (this.DateUtc != null)
                    hashCode = hashCode * 59 + this.DateUtc.GetHashCode();
                if (this.MaxResults != null)
                    hashCode = hashCode * 59 + this.MaxResults.GetHashCode();
                if (this.IncludeCancelled != null)
                    hashCode = hashCode * 59 + this.IncludeCancelled.GetHashCode();
                if (this.LookBackwards != null)
                    hashCode = hashCode * 59 + this.LookBackwards.GetHashCode();
                if (this.Expand != null)
                    hashCode = hashCode * 59 + this.Expand.GetHashCode();
                if (this.IncludeGeopath != null)
                    hashCode = hashCode * 59 + this.IncludeGeopath.GetHashCode();
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
