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
    /// V3StopOnRoute
    /// </summary>
    [DataContract]
        public partial class V3StopOnRoute :  IEquatable<V3StopOnRoute>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V3StopOnRoute" /> class.
        /// </summary>
        /// <param name="disruptionIds">Disruption information identifier(s).</param>
        /// <param name="stopSuburb">suburb of stop.</param>
        /// <param name="routeType">Transport mode identifier.</param>
        /// <param name="stopLatitude">Geographic coordinate of latitude at stop.</param>
        /// <param name="stopLongitude">Geographic coordinate of longitude at stop.</param>
        /// <param name="stopSequence">Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id..</param>
        /// <param name="stopTicket">stopTicket.</param>
        /// <param name="stopId">Stop identifier.</param>
        /// <param name="stopName">Name of stop.</param>
        /// <param name="stopLandmark">Landmark in proximity of stop.</param>
        public V3StopOnRoute(List<long?> disruptionIds = default(List<long?>), string stopSuburb = default(string), int? routeType = default(int?), float? stopLatitude = default(float?), float? stopLongitude = default(float?), int? stopSequence = default(int?), V3StopTicket stopTicket = default(V3StopTicket), int? stopId = default(int?), string stopName = default(string), string stopLandmark = default(string))
        {
            this.DisruptionIds = disruptionIds;
            this.StopSuburb = stopSuburb;
            this.RouteType = routeType;
            this.StopLatitude = stopLatitude;
            this.StopLongitude = stopLongitude;
            this.StopSequence = stopSequence;
            this.StopTicket = stopTicket;
            this.StopId = stopId;
            this.StopName = stopName;
            this.StopLandmark = stopLandmark;
        }
        
        /// <summary>
        /// Disruption information identifier(s)
        /// </summary>
        /// <value>Disruption information identifier(s)</value>
        [DataMember(Name="disruption_ids", EmitDefaultValue=false)]
        public List<long?> DisruptionIds { get; set; }

        /// <summary>
        /// suburb of stop
        /// </summary>
        /// <value>suburb of stop</value>
        [DataMember(Name="stop_suburb", EmitDefaultValue=false)]
        public string StopSuburb { get; set; }

        /// <summary>
        /// Transport mode identifier
        /// </summary>
        /// <value>Transport mode identifier</value>
        [DataMember(Name="route_type", EmitDefaultValue=false)]
        public int? RouteType { get; set; }

        /// <summary>
        /// Geographic coordinate of latitude at stop
        /// </summary>
        /// <value>Geographic coordinate of latitude at stop</value>
        [DataMember(Name="stop_latitude", EmitDefaultValue=false)]
        public float? StopLatitude { get; set; }

        /// <summary>
        /// Geographic coordinate of longitude at stop
        /// </summary>
        /// <value>Geographic coordinate of longitude at stop</value>
        [DataMember(Name="stop_longitude", EmitDefaultValue=false)]
        public float? StopLongitude { get; set; }

        /// <summary>
        /// Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
        /// </summary>
        /// <value>Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.</value>
        [DataMember(Name="stop_sequence", EmitDefaultValue=false)]
        public int? StopSequence { get; set; }

        /// <summary>
        /// Gets or Sets StopTicket
        /// </summary>
        [DataMember(Name="stop_ticket", EmitDefaultValue=false)]
        public V3StopTicket StopTicket { get; set; }

        /// <summary>
        /// Stop identifier
        /// </summary>
        /// <value>Stop identifier</value>
        [DataMember(Name="stop_id", EmitDefaultValue=false)]
        public int? StopId { get; set; }

        /// <summary>
        /// Name of stop
        /// </summary>
        /// <value>Name of stop</value>
        [DataMember(Name="stop_name", EmitDefaultValue=false)]
        public string StopName { get; set; }

        /// <summary>
        /// Landmark in proximity of stop
        /// </summary>
        /// <value>Landmark in proximity of stop</value>
        [DataMember(Name="stop_landmark", EmitDefaultValue=false)]
        public string StopLandmark { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3StopOnRoute {\n");
            sb.Append("  DisruptionIds: ").Append(DisruptionIds).Append("\n");
            sb.Append("  StopSuburb: ").Append(StopSuburb).Append("\n");
            sb.Append("  RouteType: ").Append(RouteType).Append("\n");
            sb.Append("  StopLatitude: ").Append(StopLatitude).Append("\n");
            sb.Append("  StopLongitude: ").Append(StopLongitude).Append("\n");
            sb.Append("  StopSequence: ").Append(StopSequence).Append("\n");
            sb.Append("  StopTicket: ").Append(StopTicket).Append("\n");
            sb.Append("  StopId: ").Append(StopId).Append("\n");
            sb.Append("  StopName: ").Append(StopName).Append("\n");
            sb.Append("  StopLandmark: ").Append(StopLandmark).Append("\n");
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
            return this.Equals(input as V3StopOnRoute);
        }

        /// <summary>
        /// Returns true if V3StopOnRoute instances are equal
        /// </summary>
        /// <param name="input">Instance of V3StopOnRoute to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3StopOnRoute input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DisruptionIds == input.DisruptionIds ||
                    this.DisruptionIds != null &&
                    input.DisruptionIds != null &&
                    this.DisruptionIds.SequenceEqual(input.DisruptionIds)
                ) && 
                (
                    this.StopSuburb == input.StopSuburb ||
                    (this.StopSuburb != null &&
                    this.StopSuburb.Equals(input.StopSuburb))
                ) && 
                (
                    this.RouteType == input.RouteType ||
                    (this.RouteType != null &&
                    this.RouteType.Equals(input.RouteType))
                ) && 
                (
                    this.StopLatitude == input.StopLatitude ||
                    (this.StopLatitude != null &&
                    this.StopLatitude.Equals(input.StopLatitude))
                ) && 
                (
                    this.StopLongitude == input.StopLongitude ||
                    (this.StopLongitude != null &&
                    this.StopLongitude.Equals(input.StopLongitude))
                ) && 
                (
                    this.StopSequence == input.StopSequence ||
                    (this.StopSequence != null &&
                    this.StopSequence.Equals(input.StopSequence))
                ) && 
                (
                    this.StopTicket == input.StopTicket ||
                    (this.StopTicket != null &&
                    this.StopTicket.Equals(input.StopTicket))
                ) && 
                (
                    this.StopId == input.StopId ||
                    (this.StopId != null &&
                    this.StopId.Equals(input.StopId))
                ) && 
                (
                    this.StopName == input.StopName ||
                    (this.StopName != null &&
                    this.StopName.Equals(input.StopName))
                ) && 
                (
                    this.StopLandmark == input.StopLandmark ||
                    (this.StopLandmark != null &&
                    this.StopLandmark.Equals(input.StopLandmark))
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
                if (this.DisruptionIds != null)
                    hashCode = hashCode * 59 + this.DisruptionIds.GetHashCode();
                if (this.StopSuburb != null)
                    hashCode = hashCode * 59 + this.StopSuburb.GetHashCode();
                if (this.RouteType != null)
                    hashCode = hashCode * 59 + this.RouteType.GetHashCode();
                if (this.StopLatitude != null)
                    hashCode = hashCode * 59 + this.StopLatitude.GetHashCode();
                if (this.StopLongitude != null)
                    hashCode = hashCode * 59 + this.StopLongitude.GetHashCode();
                if (this.StopSequence != null)
                    hashCode = hashCode * 59 + this.StopSequence.GetHashCode();
                if (this.StopTicket != null)
                    hashCode = hashCode * 59 + this.StopTicket.GetHashCode();
                if (this.StopId != null)
                    hashCode = hashCode * 59 + this.StopId.GetHashCode();
                if (this.StopName != null)
                    hashCode = hashCode * 59 + this.StopName.GetHashCode();
                if (this.StopLandmark != null)
                    hashCode = hashCode * 59 + this.StopLandmark.GetHashCode();
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