/*
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * The version of the OpenAPI document: v3
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ptv.Api.Client.Client.OpenAPIDateConverter;

namespace Ptv.Api.Client.Model
{
    /// <summary>
    /// V3StopDepartureRequest
    /// </summary>
    [DataContract(Name = "V3.StopDepartureRequest")]
    public partial class V3StopDepartureRequest : IValidatableObject
    {
        /// <summary>
        /// Number identifying transport mode; values returned via RouteTypes API
        /// </summary>
        /// <value>Number identifying transport mode; values returned via RouteTypes API</value>
        public enum RouteTypeEnum
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
            NUMBER_4 = 4
        }


        /// <summary>
        /// Number identifying transport mode; values returned via RouteTypes API
        /// </summary>
        /// <value>Number identifying transport mode; values returned via RouteTypes API</value>
        [DataMember(Name = "route_type", EmitDefaultValue = false)]
        public RouteTypeEnum? RouteType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="V3StopDepartureRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected V3StopDepartureRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="V3StopDepartureRequest" /> class.
        /// </summary>
        /// <param name="routeType">Number identifying transport mode; values returned via RouteTypes API.</param>
        /// <param name="stopId">Identifier of stop; values returned by Stops API.</param>
        /// <param name="maxResults">Maximum number of results returned.</param>
        /// <param name="gtfs">Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data and route_directions[x].route_id parameters will accept route_gtfs_id data.</param>
        /// <param name="routeDirections">The route directions to find departures for at this stop. (required).</param>
        public V3StopDepartureRequest(RouteTypeEnum? routeType = default(RouteTypeEnum?), int stopId = default(int), int maxResults = default(int), bool gtfs = default(bool), List<V3StopDepartureRequestRouteDirection> routeDirections = default(List<V3StopDepartureRequestRouteDirection>))
        {
            // to ensure "routeDirections" is required (not null)
            if (routeDirections == null)
            {
                throw new ArgumentNullException("routeDirections is a required property for V3StopDepartureRequest and cannot be null");
            }
            this.RouteDirections = routeDirections;
            this.RouteType = routeType;
            this.StopId = stopId;
            this.MaxResults = maxResults;
            this.Gtfs = gtfs;
        }

        /// <summary>
        /// Identifier of stop; values returned by Stops API
        /// </summary>
        /// <value>Identifier of stop; values returned by Stops API</value>
        [DataMember(Name = "stop_id", EmitDefaultValue = false)]
        public int StopId { get; set; }

        /// <summary>
        /// Maximum number of results returned
        /// </summary>
        /// <value>Maximum number of results returned</value>
        [DataMember(Name = "max_results", EmitDefaultValue = false)]
        public int MaxResults { get; set; }

        /// <summary>
        /// Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data and route_directions[x].route_id parameters will accept route_gtfs_id data
        /// </summary>
        /// <value>Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data and route_directions[x].route_id parameters will accept route_gtfs_id data</value>
        [DataMember(Name = "gtfs", EmitDefaultValue = true)]
        public bool Gtfs { get; set; }

        /// <summary>
        /// The route directions to find departures for at this stop.
        /// </summary>
        /// <value>The route directions to find departures for at this stop.</value>
        [DataMember(Name = "route_directions", IsRequired = true, EmitDefaultValue = true)]
        public List<V3StopDepartureRequestRouteDirection> RouteDirections { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class V3StopDepartureRequest {\n");
            sb.Append("  RouteType: ").Append(RouteType).Append("\n");
            sb.Append("  StopId: ").Append(StopId).Append("\n");
            sb.Append("  MaxResults: ").Append(MaxResults).Append("\n");
            sb.Append("  Gtfs: ").Append(Gtfs).Append("\n");
            sb.Append("  RouteDirections: ").Append(RouteDirections).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // StopId (int) maximum
            if (this.StopId > (int)2147483647)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for StopId, must be a value less than or equal to 2147483647.", new [] { "StopId" });
            }

            // StopId (int) minimum
            if (this.StopId < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for StopId, must be a value greater than or equal to 0.", new [] { "StopId" });
            }

            // MaxResults (int) maximum
            if (this.MaxResults > (int)2147483647)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MaxResults, must be a value less than or equal to 2147483647.", new [] { "MaxResults" });
            }

            // MaxResults (int) minimum
            if (this.MaxResults < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MaxResults, must be a value greater than or equal to 0.", new [] { "MaxResults" });
            }

            yield break;
        }
    }

}
