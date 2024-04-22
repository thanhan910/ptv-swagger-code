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
    /// V3RouteWithStatus
    /// </summary>
    [DataContract]
    public partial class V3RouteWithStatus :  IEquatable<V3RouteWithStatus>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V3RouteWithStatus" /> class.
        /// </summary>
        /// <param name="routeServiceStatus">Service status for the route (indicates disruptions).</param>
        /// <param name="routeType">Transport mode identifier.</param>
        /// <param name="routeId">Route identifier.</param>
        /// <param name="routeName">Name of route.</param>
        /// <param name="routeNumber">Route number presented to public (nb. not route_id).</param>
        /// <param name="routeGtfsId">GTFS Identifer of the route.</param>
        /// <param name="geopath">GeoPath of the route.</param>
        public V3RouteWithStatus(V3RouteServiceStatus routeServiceStatus = default(V3RouteServiceStatus), int? routeType = default(int?), int? routeId = default(int?), string routeName = default(string), string routeNumber = default(string), string routeGtfsId = default(string), List<Object> geopath = default(List<Object>))
        {
            this.RouteServiceStatus = routeServiceStatus;
            this.RouteType = routeType;
            this.RouteId = routeId;
            this.RouteName = routeName;
            this.RouteNumber = routeNumber;
            this.RouteGtfsId = routeGtfsId;
            this.Geopath = geopath;
        }
        
        /// <summary>
        /// Service status for the route (indicates disruptions)
        /// </summary>
        /// <value>Service status for the route (indicates disruptions)</value>
        [DataMember(Name="route_service_status", EmitDefaultValue=false)]
        public V3RouteServiceStatus RouteServiceStatus { get; set; }

        /// <summary>
        /// Transport mode identifier
        /// </summary>
        /// <value>Transport mode identifier</value>
        [DataMember(Name="route_type", EmitDefaultValue=false)]
        public int? RouteType { get; set; }

        /// <summary>
        /// Route identifier
        /// </summary>
        /// <value>Route identifier</value>
        [DataMember(Name="route_id", EmitDefaultValue=false)]
        public int? RouteId { get; set; }

        /// <summary>
        /// Name of route
        /// </summary>
        /// <value>Name of route</value>
        [DataMember(Name="route_name", EmitDefaultValue=false)]
        public string RouteName { get; set; }

        /// <summary>
        /// Route number presented to public (nb. not route_id)
        /// </summary>
        /// <value>Route number presented to public (nb. not route_id)</value>
        [DataMember(Name="route_number", EmitDefaultValue=false)]
        public string RouteNumber { get; set; }

        /// <summary>
        /// GTFS Identifer of the route
        /// </summary>
        /// <value>GTFS Identifer of the route</value>
        [DataMember(Name="route_gtfs_id", EmitDefaultValue=false)]
        public string RouteGtfsId { get; set; }

        /// <summary>
        /// GeoPath of the route
        /// </summary>
        /// <value>GeoPath of the route</value>
        [DataMember(Name="geopath", EmitDefaultValue=false)]
        public List<Object> Geopath { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3RouteWithStatus {\n");
            sb.Append("  RouteServiceStatus: ").Append(RouteServiceStatus).Append("\n");
            sb.Append("  RouteType: ").Append(RouteType).Append("\n");
            sb.Append("  RouteId: ").Append(RouteId).Append("\n");
            sb.Append("  RouteName: ").Append(RouteName).Append("\n");
            sb.Append("  RouteNumber: ").Append(RouteNumber).Append("\n");
            sb.Append("  RouteGtfsId: ").Append(RouteGtfsId).Append("\n");
            sb.Append("  Geopath: ").Append(Geopath).Append("\n");
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
            return this.Equals(input as V3RouteWithStatus);
        }

        /// <summary>
        /// Returns true if V3RouteWithStatus instances are equal
        /// </summary>
        /// <param name="input">Instance of V3RouteWithStatus to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3RouteWithStatus input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RouteServiceStatus == input.RouteServiceStatus ||
                    (this.RouteServiceStatus != null &&
                    this.RouteServiceStatus.Equals(input.RouteServiceStatus))
                ) && 
                (
                    this.RouteType == input.RouteType ||
                    (this.RouteType != null &&
                    this.RouteType.Equals(input.RouteType))
                ) && 
                (
                    this.RouteId == input.RouteId ||
                    (this.RouteId != null &&
                    this.RouteId.Equals(input.RouteId))
                ) && 
                (
                    this.RouteName == input.RouteName ||
                    (this.RouteName != null &&
                    this.RouteName.Equals(input.RouteName))
                ) && 
                (
                    this.RouteNumber == input.RouteNumber ||
                    (this.RouteNumber != null &&
                    this.RouteNumber.Equals(input.RouteNumber))
                ) && 
                (
                    this.RouteGtfsId == input.RouteGtfsId ||
                    (this.RouteGtfsId != null &&
                    this.RouteGtfsId.Equals(input.RouteGtfsId))
                ) && 
                (
                    this.Geopath == input.Geopath ||
                    this.Geopath != null &&
                    this.Geopath.SequenceEqual(input.Geopath)
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
                if (this.RouteServiceStatus != null)
                    hashCode = hashCode * 59 + this.RouteServiceStatus.GetHashCode();
                if (this.RouteType != null)
                    hashCode = hashCode * 59 + this.RouteType.GetHashCode();
                if (this.RouteId != null)
                    hashCode = hashCode * 59 + this.RouteId.GetHashCode();
                if (this.RouteName != null)
                    hashCode = hashCode * 59 + this.RouteName.GetHashCode();
                if (this.RouteNumber != null)
                    hashCode = hashCode * 59 + this.RouteNumber.GetHashCode();
                if (this.RouteGtfsId != null)
                    hashCode = hashCode * 59 + this.RouteGtfsId.GetHashCode();
                if (this.Geopath != null)
                    hashCode = hashCode * 59 + this.Geopath.GetHashCode();
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
