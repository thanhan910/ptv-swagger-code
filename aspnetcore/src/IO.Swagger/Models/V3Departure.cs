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
    public partial class V3Departure : IEquatable<V3Departure>
    { 
        /// <summary>
        /// Stop identifier
        /// </summary>
        /// <value>Stop identifier</value>

        [DataMember(Name="stop_id")]
        public int? StopId { get; set; }

        /// <summary>
        /// Route identifier
        /// </summary>
        /// <value>Route identifier</value>

        [DataMember(Name="route_id")]
        public int? RouteId { get; set; }

        /// <summary>
        /// Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
        /// </summary>
        /// <value>Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric</value>

        [DataMember(Name="run_id")]
        public int? RunId { get; private set; }

        /// <summary>
        /// Alphanumeric trip/service run identifier
        /// </summary>
        /// <value>Alphanumeric trip/service run identifier</value>

        [DataMember(Name="run_ref")]
        public string RunRef { get; set; }

        /// <summary>
        /// Direction of travel identifier
        /// </summary>
        /// <value>Direction of travel identifier</value>

        [DataMember(Name="direction_id")]
        public int? DirectionId { get; set; }

        /// <summary>
        /// Disruption information identifier(s)
        /// </summary>
        /// <value>Disruption information identifier(s)</value>

        [DataMember(Name="disruption_ids")]
        public List<long?> DisruptionIds { get; set; }

        /// <summary>
        /// Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format
        /// </summary>
        /// <value>Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format</value>

        [DataMember(Name="scheduled_departure_utc")]
        public DateTime? ScheduledDepartureUtc { get; set; }

        /// <summary>
        /// Real-time estimate of departure time and date in ISO 8601 UTC format
        /// </summary>
        /// <value>Real-time estimate of departure time and date in ISO 8601 UTC format</value>

        [DataMember(Name="estimated_departure_utc")]
        public DateTime? EstimatedDepartureUtc { get; set; }

        /// <summary>
        /// Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes
        /// </summary>
        /// <value>Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes</value>

        [DataMember(Name="at_platform")]
        public bool? AtPlatform { get; set; }

        /// <summary>
        /// Platform number at stop (metropolitan train only; returns null for other modes)
        /// </summary>
        /// <value>Platform number at stop (metropolitan train only; returns null for other modes)</value>

        [DataMember(Name="platform_number")]
        public string PlatformNumber { get; set; }

        /// <summary>
        /// Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)
        /// </summary>
        /// <value>Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)</value>

        [DataMember(Name="flags")]
        public string Flags { get; set; }

        /// <summary>
        /// Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4
        /// </summary>
        /// <value>Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4</value>

        [DataMember(Name="departure_sequence")]
        public int? DepartureSequence { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3Departure {\n");
            sb.Append("  StopId: ").Append(StopId).Append("\n");
            sb.Append("  RouteId: ").Append(RouteId).Append("\n");
            sb.Append("  RunId: ").Append(RunId).Append("\n");
            sb.Append("  RunRef: ").Append(RunRef).Append("\n");
            sb.Append("  DirectionId: ").Append(DirectionId).Append("\n");
            sb.Append("  DisruptionIds: ").Append(DisruptionIds).Append("\n");
            sb.Append("  ScheduledDepartureUtc: ").Append(ScheduledDepartureUtc).Append("\n");
            sb.Append("  EstimatedDepartureUtc: ").Append(EstimatedDepartureUtc).Append("\n");
            sb.Append("  AtPlatform: ").Append(AtPlatform).Append("\n");
            sb.Append("  PlatformNumber: ").Append(PlatformNumber).Append("\n");
            sb.Append("  Flags: ").Append(Flags).Append("\n");
            sb.Append("  DepartureSequence: ").Append(DepartureSequence).Append("\n");
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
            return obj.GetType() == GetType() && Equals((V3Departure)obj);
        }

        /// <summary>
        /// Returns true if V3Departure instances are equal
        /// </summary>
        /// <param name="other">Instance of V3Departure to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3Departure other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    StopId == other.StopId ||
                    StopId != null &&
                    StopId.Equals(other.StopId)
                ) && 
                (
                    RouteId == other.RouteId ||
                    RouteId != null &&
                    RouteId.Equals(other.RouteId)
                ) && 
                (
                    RunId == other.RunId ||
                    RunId != null &&
                    RunId.Equals(other.RunId)
                ) && 
                (
                    RunRef == other.RunRef ||
                    RunRef != null &&
                    RunRef.Equals(other.RunRef)
                ) && 
                (
                    DirectionId == other.DirectionId ||
                    DirectionId != null &&
                    DirectionId.Equals(other.DirectionId)
                ) && 
                (
                    DisruptionIds == other.DisruptionIds ||
                    DisruptionIds != null &&
                    DisruptionIds.SequenceEqual(other.DisruptionIds)
                ) && 
                (
                    ScheduledDepartureUtc == other.ScheduledDepartureUtc ||
                    ScheduledDepartureUtc != null &&
                    ScheduledDepartureUtc.Equals(other.ScheduledDepartureUtc)
                ) && 
                (
                    EstimatedDepartureUtc == other.EstimatedDepartureUtc ||
                    EstimatedDepartureUtc != null &&
                    EstimatedDepartureUtc.Equals(other.EstimatedDepartureUtc)
                ) && 
                (
                    AtPlatform == other.AtPlatform ||
                    AtPlatform != null &&
                    AtPlatform.Equals(other.AtPlatform)
                ) && 
                (
                    PlatformNumber == other.PlatformNumber ||
                    PlatformNumber != null &&
                    PlatformNumber.Equals(other.PlatformNumber)
                ) && 
                (
                    Flags == other.Flags ||
                    Flags != null &&
                    Flags.Equals(other.Flags)
                ) && 
                (
                    DepartureSequence == other.DepartureSequence ||
                    DepartureSequence != null &&
                    DepartureSequence.Equals(other.DepartureSequence)
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
                    if (StopId != null)
                    hashCode = hashCode * 59 + StopId.GetHashCode();
                    if (RouteId != null)
                    hashCode = hashCode * 59 + RouteId.GetHashCode();
                    if (RunId != null)
                    hashCode = hashCode * 59 + RunId.GetHashCode();
                    if (RunRef != null)
                    hashCode = hashCode * 59 + RunRef.GetHashCode();
                    if (DirectionId != null)
                    hashCode = hashCode * 59 + DirectionId.GetHashCode();
                    if (DisruptionIds != null)
                    hashCode = hashCode * 59 + DisruptionIds.GetHashCode();
                    if (ScheduledDepartureUtc != null)
                    hashCode = hashCode * 59 + ScheduledDepartureUtc.GetHashCode();
                    if (EstimatedDepartureUtc != null)
                    hashCode = hashCode * 59 + EstimatedDepartureUtc.GetHashCode();
                    if (AtPlatform != null)
                    hashCode = hashCode * 59 + AtPlatform.GetHashCode();
                    if (PlatformNumber != null)
                    hashCode = hashCode * 59 + PlatformNumber.GetHashCode();
                    if (Flags != null)
                    hashCode = hashCode * 59 + Flags.GetHashCode();
                    if (DepartureSequence != null)
                    hashCode = hashCode * 59 + DepartureSequence.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(V3Departure left, V3Departure right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(V3Departure left, V3Departure right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
