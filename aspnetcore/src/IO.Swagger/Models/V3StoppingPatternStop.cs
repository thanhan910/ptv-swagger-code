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
    public partial class V3StoppingPatternStop : IEquatable<V3StoppingPatternStop>
    { 
        /// <summary>
        /// Gets or Sets StopTicket
        /// </summary>

        [DataMember(Name="stop_ticket")]
        public V3StopTicket StopTicket { get; set; }

        /// <summary>
        /// Distance of stop from input location (in metres); returns 0 if no location is input
        /// </summary>
        /// <value>Distance of stop from input location (in metres); returns 0 if no location is input</value>

        [DataMember(Name="stop_distance")]
        public float? StopDistance { get; set; }

        /// <summary>
        /// suburb of stop
        /// </summary>
        /// <value>suburb of stop</value>

        [DataMember(Name="stop_suburb")]
        public string StopSuburb { get; set; }

        /// <summary>
        /// Name of stop
        /// </summary>
        /// <value>Name of stop</value>

        [DataMember(Name="stop_name")]
        public string StopName { get; set; }

        /// <summary>
        /// Stop identifier
        /// </summary>
        /// <value>Stop identifier</value>

        [DataMember(Name="stop_id")]
        public int? StopId { get; set; }

        /// <summary>
        /// Transport mode identifier
        /// </summary>
        /// <value>Transport mode identifier</value>

        [DataMember(Name="route_type")]
        public int? RouteType { get; set; }

        /// <summary>
        /// Geographic coordinate of latitude at stop
        /// </summary>
        /// <value>Geographic coordinate of latitude at stop</value>

        [DataMember(Name="stop_latitude")]
        public float? StopLatitude { get; set; }

        /// <summary>
        /// Geographic coordinate of longitude at stop
        /// </summary>
        /// <value>Geographic coordinate of longitude at stop</value>

        [DataMember(Name="stop_longitude")]
        public float? StopLongitude { get; set; }

        /// <summary>
        /// Landmark in proximity of stop
        /// </summary>
        /// <value>Landmark in proximity of stop</value>

        [DataMember(Name="stop_landmark")]
        public string StopLandmark { get; set; }

        /// <summary>
        /// Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
        /// </summary>
        /// <value>Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.</value>

        [DataMember(Name="stop_sequence")]
        public int? StopSequence { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3StoppingPatternStop {\n");
            sb.Append("  StopTicket: ").Append(StopTicket).Append("\n");
            sb.Append("  StopDistance: ").Append(StopDistance).Append("\n");
            sb.Append("  StopSuburb: ").Append(StopSuburb).Append("\n");
            sb.Append("  StopName: ").Append(StopName).Append("\n");
            sb.Append("  StopId: ").Append(StopId).Append("\n");
            sb.Append("  RouteType: ").Append(RouteType).Append("\n");
            sb.Append("  StopLatitude: ").Append(StopLatitude).Append("\n");
            sb.Append("  StopLongitude: ").Append(StopLongitude).Append("\n");
            sb.Append("  StopLandmark: ").Append(StopLandmark).Append("\n");
            sb.Append("  StopSequence: ").Append(StopSequence).Append("\n");
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
            return obj.GetType() == GetType() && Equals((V3StoppingPatternStop)obj);
        }

        /// <summary>
        /// Returns true if V3StoppingPatternStop instances are equal
        /// </summary>
        /// <param name="other">Instance of V3StoppingPatternStop to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3StoppingPatternStop other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    StopTicket == other.StopTicket ||
                    StopTicket != null &&
                    StopTicket.Equals(other.StopTicket)
                ) && 
                (
                    StopDistance == other.StopDistance ||
                    StopDistance != null &&
                    StopDistance.Equals(other.StopDistance)
                ) && 
                (
                    StopSuburb == other.StopSuburb ||
                    StopSuburb != null &&
                    StopSuburb.Equals(other.StopSuburb)
                ) && 
                (
                    StopName == other.StopName ||
                    StopName != null &&
                    StopName.Equals(other.StopName)
                ) && 
                (
                    StopId == other.StopId ||
                    StopId != null &&
                    StopId.Equals(other.StopId)
                ) && 
                (
                    RouteType == other.RouteType ||
                    RouteType != null &&
                    RouteType.Equals(other.RouteType)
                ) && 
                (
                    StopLatitude == other.StopLatitude ||
                    StopLatitude != null &&
                    StopLatitude.Equals(other.StopLatitude)
                ) && 
                (
                    StopLongitude == other.StopLongitude ||
                    StopLongitude != null &&
                    StopLongitude.Equals(other.StopLongitude)
                ) && 
                (
                    StopLandmark == other.StopLandmark ||
                    StopLandmark != null &&
                    StopLandmark.Equals(other.StopLandmark)
                ) && 
                (
                    StopSequence == other.StopSequence ||
                    StopSequence != null &&
                    StopSequence.Equals(other.StopSequence)
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
                    if (StopTicket != null)
                    hashCode = hashCode * 59 + StopTicket.GetHashCode();
                    if (StopDistance != null)
                    hashCode = hashCode * 59 + StopDistance.GetHashCode();
                    if (StopSuburb != null)
                    hashCode = hashCode * 59 + StopSuburb.GetHashCode();
                    if (StopName != null)
                    hashCode = hashCode * 59 + StopName.GetHashCode();
                    if (StopId != null)
                    hashCode = hashCode * 59 + StopId.GetHashCode();
                    if (RouteType != null)
                    hashCode = hashCode * 59 + RouteType.GetHashCode();
                    if (StopLatitude != null)
                    hashCode = hashCode * 59 + StopLatitude.GetHashCode();
                    if (StopLongitude != null)
                    hashCode = hashCode * 59 + StopLongitude.GetHashCode();
                    if (StopLandmark != null)
                    hashCode = hashCode * 59 + StopLandmark.GetHashCode();
                    if (StopSequence != null)
                    hashCode = hashCode * 59 + StopSequence.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(V3StoppingPatternStop left, V3StoppingPatternStop right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(V3StoppingPatternStop left, V3StoppingPatternStop right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
