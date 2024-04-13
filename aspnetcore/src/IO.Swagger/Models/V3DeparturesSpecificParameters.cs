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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Models
{
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class V3DeparturesSpecificParameters : IEquatable<V3DeparturesSpecificParameters>
    { 
        /// <summary>
        /// Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
        /// </summary>
        /// <value>Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}</value>

        [DataMember(Name="direction_id")]
        public int? DirectionId { get; set; }

        /// <summary>
        /// Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data
        /// </summary>
        /// <value>Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data</value>

        [DataMember(Name="gtfs")]
        public bool? Gtfs { get; set; }

        /// <summary>
        /// Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)
        /// </summary>
        /// <value>Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)</value>

        [DataMember(Name="date_utc")]
        public DateTime? DateUtc { get; set; }

        /// <summary>
        /// Maximum number of results returned
        /// </summary>
        /// <value>Maximum number of results returned</value>

        [DataMember(Name="max_results")]
        public int? MaxResults { get; set; }

        /// <summary>
        /// Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only
        /// </summary>
        /// <value>Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only</value>

        [DataMember(Name="include_cancelled")]
        public bool? IncludeCancelled { get; set; }

        /// <summary>
        /// Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.
        /// </summary>
        /// <value>Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.</value>

        [DataMember(Name="look_backwards")]
        public bool? LookBackwards { get; set; }

        /// <summary>
        /// Gets or Sets Expand
        /// </summary>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ExpandEnum
        {
            /// <summary>
            /// Enum AllEnum for All
            /// </summary>
            [EnumMember(Value = "All")]
            AllEnum = 0,
            /// <summary>
            /// Enum StopEnum for Stop
            /// </summary>
            [EnumMember(Value = "Stop")]
            StopEnum = 1,
            /// <summary>
            /// Enum RouteEnum for Route
            /// </summary>
            [EnumMember(Value = "Route")]
            RouteEnum = 2,
            /// <summary>
            /// Enum RunEnum for Run
            /// </summary>
            [EnumMember(Value = "Run")]
            RunEnum = 3,
            /// <summary>
            /// Enum DirectionEnum for Direction
            /// </summary>
            [EnumMember(Value = "Direction")]
            DirectionEnum = 4,
            /// <summary>
            /// Enum DisruptionEnum for Disruption
            /// </summary>
            [EnumMember(Value = "Disruption")]
            DisruptionEnum = 5,
            /// <summary>
            /// Enum VehicleDescriptorEnum for VehicleDescriptor
            /// </summary>
            [EnumMember(Value = "VehicleDescriptor")]
            VehicleDescriptorEnum = 6,
            /// <summary>
            /// Enum VehiclePositionEnum for VehiclePosition
            /// </summary>
            [EnumMember(Value = "VehiclePosition")]
            VehiclePositionEnum = 7,
            /// <summary>
            /// Enum NoneEnum for None
            /// </summary>
            [EnumMember(Value = "None")]
            NoneEnum = 8        }

        /// <summary>
        /// List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
        /// </summary>
        /// <value>List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.</value>

        [DataMember(Name="expand")]
        public List<ExpandEnum> Expand { get; set; }

        /// <summary>
        /// Indicates if the route geopath should be returned
        /// </summary>
        /// <value>Indicates if the route geopath should be returned</value>

        [DataMember(Name="include_geopath")]
        public bool? IncludeGeopath { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3DeparturesSpecificParameters {\n");
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
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((V3DeparturesSpecificParameters)obj);
        }

        /// <summary>
        /// Returns true if V3DeparturesSpecificParameters instances are equal
        /// </summary>
        /// <param name="other">Instance of V3DeparturesSpecificParameters to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3DeparturesSpecificParameters other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DirectionId == other.DirectionId ||
                    DirectionId != null &&
                    DirectionId.Equals(other.DirectionId)
                ) && 
                (
                    Gtfs == other.Gtfs ||
                    Gtfs != null &&
                    Gtfs.Equals(other.Gtfs)
                ) && 
                (
                    DateUtc == other.DateUtc ||
                    DateUtc != null &&
                    DateUtc.Equals(other.DateUtc)
                ) && 
                (
                    MaxResults == other.MaxResults ||
                    MaxResults != null &&
                    MaxResults.Equals(other.MaxResults)
                ) && 
                (
                    IncludeCancelled == other.IncludeCancelled ||
                    IncludeCancelled != null &&
                    IncludeCancelled.Equals(other.IncludeCancelled)
                ) && 
                (
                    LookBackwards == other.LookBackwards ||
                    LookBackwards != null &&
                    LookBackwards.Equals(other.LookBackwards)
                ) && 
                (
                    Expand == other.Expand ||
                    Expand != null &&
                    Expand.SequenceEqual(other.Expand)
                ) && 
                (
                    IncludeGeopath == other.IncludeGeopath ||
                    IncludeGeopath != null &&
                    IncludeGeopath.Equals(other.IncludeGeopath)
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
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (DirectionId != null)
                    hashCode = hashCode * 59 + DirectionId.GetHashCode();
                    if (Gtfs != null)
                    hashCode = hashCode * 59 + Gtfs.GetHashCode();
                    if (DateUtc != null)
                    hashCode = hashCode * 59 + DateUtc.GetHashCode();
                    if (MaxResults != null)
                    hashCode = hashCode * 59 + MaxResults.GetHashCode();
                    if (IncludeCancelled != null)
                    hashCode = hashCode * 59 + IncludeCancelled.GetHashCode();
                    if (LookBackwards != null)
                    hashCode = hashCode * 59 + LookBackwards.GetHashCode();
                    if (Expand != null)
                    hashCode = hashCode * 59 + Expand.GetHashCode();
                    if (IncludeGeopath != null)
                    hashCode = hashCode * 59 + IncludeGeopath.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(V3DeparturesSpecificParameters left, V3DeparturesSpecificParameters right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(V3DeparturesSpecificParameters left, V3DeparturesSpecificParameters right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
