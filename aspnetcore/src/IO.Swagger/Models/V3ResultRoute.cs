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
    public partial class V3ResultRoute : IEquatable<V3ResultRoute>
    { 
        /// <summary>
        /// Name of route
        /// </summary>
        /// <value>Name of route</value>

        [DataMember(Name="route_name")]
        public string RouteName { get; set; }

        /// <summary>
        /// Route number presented to public (nb. not route_id)
        /// </summary>
        /// <value>Route number presented to public (nb. not route_id)</value>

        [DataMember(Name="route_number")]
        public string RouteNumber { get; set; }

        /// <summary>
        /// Transport mode identifier
        /// </summary>
        /// <value>Transport mode identifier</value>

        [DataMember(Name="route_type")]
        public int? RouteType { get; set; }

        /// <summary>
        /// Route identifier
        /// </summary>
        /// <value>Route identifier</value>

        [DataMember(Name="route_id")]
        public int? RouteId { get; set; }

        /// <summary>
        /// GTFS Identifer of the route
        /// </summary>
        /// <value>GTFS Identifer of the route</value>

        [DataMember(Name="route_gtfs_id")]
        public string RouteGtfsId { get; set; }

        /// <summary>
        /// Gets or Sets RouteServiceStatus
        /// </summary>

        [DataMember(Name="route_service_status")]
        public V3RouteServiceStatus RouteServiceStatus { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3ResultRoute {\n");
            sb.Append("  RouteName: ").Append(RouteName).Append("\n");
            sb.Append("  RouteNumber: ").Append(RouteNumber).Append("\n");
            sb.Append("  RouteType: ").Append(RouteType).Append("\n");
            sb.Append("  RouteId: ").Append(RouteId).Append("\n");
            sb.Append("  RouteGtfsId: ").Append(RouteGtfsId).Append("\n");
            sb.Append("  RouteServiceStatus: ").Append(RouteServiceStatus).Append("\n");
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
            return obj.GetType() == GetType() && Equals((V3ResultRoute)obj);
        }

        /// <summary>
        /// Returns true if V3ResultRoute instances are equal
        /// </summary>
        /// <param name="other">Instance of V3ResultRoute to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3ResultRoute other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    RouteName == other.RouteName ||
                    RouteName != null &&
                    RouteName.Equals(other.RouteName)
                ) && 
                (
                    RouteNumber == other.RouteNumber ||
                    RouteNumber != null &&
                    RouteNumber.Equals(other.RouteNumber)
                ) && 
                (
                    RouteType == other.RouteType ||
                    RouteType != null &&
                    RouteType.Equals(other.RouteType)
                ) && 
                (
                    RouteId == other.RouteId ||
                    RouteId != null &&
                    RouteId.Equals(other.RouteId)
                ) && 
                (
                    RouteGtfsId == other.RouteGtfsId ||
                    RouteGtfsId != null &&
                    RouteGtfsId.Equals(other.RouteGtfsId)
                ) && 
                (
                    RouteServiceStatus == other.RouteServiceStatus ||
                    RouteServiceStatus != null &&
                    RouteServiceStatus.Equals(other.RouteServiceStatus)
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
                    if (RouteName != null)
                    hashCode = hashCode * 59 + RouteName.GetHashCode();
                    if (RouteNumber != null)
                    hashCode = hashCode * 59 + RouteNumber.GetHashCode();
                    if (RouteType != null)
                    hashCode = hashCode * 59 + RouteType.GetHashCode();
                    if (RouteId != null)
                    hashCode = hashCode * 59 + RouteId.GetHashCode();
                    if (RouteGtfsId != null)
                    hashCode = hashCode * 59 + RouteGtfsId.GetHashCode();
                    if (RouteServiceStatus != null)
                    hashCode = hashCode * 59 + RouteServiceStatus.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(V3ResultRoute left, V3ResultRoute right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(V3ResultRoute left, V3ResultRoute right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
