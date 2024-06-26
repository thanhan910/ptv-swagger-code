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
    /// V3SearchParameters
    /// </summary>
    [DataContract]
    public partial class V3SearchParameters :  IEquatable<V3SearchParameters>, IValidatableObject
    {
        /// <summary>
        /// Defines RouteTypes
        /// </summary>
        public enum RouteTypesEnum
        {
            
            /// <summary>
            /// Enum _0 for value: 0
            /// </summary>
            
            _0 = 0,
            
            /// <summary>
            /// Enum _1 for value: 1
            /// </summary>
            
            _1 = 1,
            
            /// <summary>
            /// Enum _2 for value: 2
            /// </summary>
            
            _2 = 2,
            
            /// <summary>
            /// Enum _3 for value: 3
            /// </summary>
            
            _3 = 3,
            
            /// <summary>
            /// Enum _4 for value: 4
            /// </summary>
            
            _4 = 4
        }


        /// <summary>
        /// Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
        /// </summary>
        /// <value>Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)</value>
        [DataMember(Name="route_types", EmitDefaultValue=false)]
        public List<RouteTypesEnum> RouteTypes { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="V3SearchParameters" /> class.
        /// </summary>
        /// <param name="routeTypes">Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified).</param>
        /// <param name="latitude">Filter by geographic coordinate of latitude.</param>
        /// <param name="longitude">Filter by geographic coordinate of longitude.</param>
        /// <param name="maxDistance">Filter by maximum distance (in metres) from location specified via latitude and longitude parameters.</param>
        /// <param name="includeAddresses">Placeholder for future development; currently unavailable.</param>
        /// <param name="includeOutlets">Indicates if outlets will be returned in response (default &#x3D; true).</param>
        /// <param name="matchStopBySuburb">Indicates whether to find stops by suburbs in the search term (default &#x3D; true).</param>
        /// <param name="matchRouteBySuburb">Indicates whether to find routes by suburbs in the search term (default &#x3D; true).</param>
        /// <param name="matchStopByGtfsStopId">Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false).</param>
        public V3SearchParameters(List<RouteTypesEnum> routeTypes = default(List<RouteTypesEnum>), float? latitude = default(float?), float? longitude = default(float?), float? maxDistance = default(float?), bool? includeAddresses = default(bool?), bool? includeOutlets = default(bool?), bool? matchStopBySuburb = default(bool?), bool? matchRouteBySuburb = default(bool?), bool? matchStopByGtfsStopId = default(bool?))
        {
            this.RouteTypes = routeTypes;
            this.Latitude = latitude;
            this.Longitude = longitude;
            this.MaxDistance = maxDistance;
            this.IncludeAddresses = includeAddresses;
            this.IncludeOutlets = includeOutlets;
            this.MatchStopBySuburb = matchStopBySuburb;
            this.MatchRouteBySuburb = matchRouteBySuburb;
            this.MatchStopByGtfsStopId = matchStopByGtfsStopId;
        }
        

        /// <summary>
        /// Filter by geographic coordinate of latitude
        /// </summary>
        /// <value>Filter by geographic coordinate of latitude</value>
        [DataMember(Name="latitude", EmitDefaultValue=false)]
        public float? Latitude { get; set; }

        /// <summary>
        /// Filter by geographic coordinate of longitude
        /// </summary>
        /// <value>Filter by geographic coordinate of longitude</value>
        [DataMember(Name="longitude", EmitDefaultValue=false)]
        public float? Longitude { get; set; }

        /// <summary>
        /// Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
        /// </summary>
        /// <value>Filter by maximum distance (in metres) from location specified via latitude and longitude parameters</value>
        [DataMember(Name="max_distance", EmitDefaultValue=false)]
        public float? MaxDistance { get; set; }

        /// <summary>
        /// Placeholder for future development; currently unavailable
        /// </summary>
        /// <value>Placeholder for future development; currently unavailable</value>
        [DataMember(Name="include_addresses", EmitDefaultValue=false)]
        public bool? IncludeAddresses { get; set; }

        /// <summary>
        /// Indicates if outlets will be returned in response (default &#x3D; true)
        /// </summary>
        /// <value>Indicates if outlets will be returned in response (default &#x3D; true)</value>
        [DataMember(Name="include_outlets", EmitDefaultValue=false)]
        public bool? IncludeOutlets { get; set; }

        /// <summary>
        /// Indicates whether to find stops by suburbs in the search term (default &#x3D; true)
        /// </summary>
        /// <value>Indicates whether to find stops by suburbs in the search term (default &#x3D; true)</value>
        [DataMember(Name="match_stop_by_suburb", EmitDefaultValue=false)]
        public bool? MatchStopBySuburb { get; set; }

        /// <summary>
        /// Indicates whether to find routes by suburbs in the search term (default &#x3D; true)
        /// </summary>
        /// <value>Indicates whether to find routes by suburbs in the search term (default &#x3D; true)</value>
        [DataMember(Name="match_route_by_suburb", EmitDefaultValue=false)]
        public bool? MatchRouteBySuburb { get; set; }

        /// <summary>
        /// Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false)
        /// </summary>
        /// <value>Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false)</value>
        [DataMember(Name="match_stop_by_gtfs_stop_id", EmitDefaultValue=false)]
        public bool? MatchStopByGtfsStopId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3SearchParameters {\n");
            sb.Append("  RouteTypes: ").Append(RouteTypes).Append("\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
            sb.Append("  MaxDistance: ").Append(MaxDistance).Append("\n");
            sb.Append("  IncludeAddresses: ").Append(IncludeAddresses).Append("\n");
            sb.Append("  IncludeOutlets: ").Append(IncludeOutlets).Append("\n");
            sb.Append("  MatchStopBySuburb: ").Append(MatchStopBySuburb).Append("\n");
            sb.Append("  MatchRouteBySuburb: ").Append(MatchRouteBySuburb).Append("\n");
            sb.Append("  MatchStopByGtfsStopId: ").Append(MatchStopByGtfsStopId).Append("\n");
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
            return this.Equals(input as V3SearchParameters);
        }

        /// <summary>
        /// Returns true if V3SearchParameters instances are equal
        /// </summary>
        /// <param name="input">Instance of V3SearchParameters to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3SearchParameters input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RouteTypes == input.RouteTypes ||
                    this.RouteTypes != null &&
                    this.RouteTypes.SequenceEqual(input.RouteTypes)
                ) && 
                (
                    this.Latitude == input.Latitude ||
                    (this.Latitude != null &&
                    this.Latitude.Equals(input.Latitude))
                ) && 
                (
                    this.Longitude == input.Longitude ||
                    (this.Longitude != null &&
                    this.Longitude.Equals(input.Longitude))
                ) && 
                (
                    this.MaxDistance == input.MaxDistance ||
                    (this.MaxDistance != null &&
                    this.MaxDistance.Equals(input.MaxDistance))
                ) && 
                (
                    this.IncludeAddresses == input.IncludeAddresses ||
                    (this.IncludeAddresses != null &&
                    this.IncludeAddresses.Equals(input.IncludeAddresses))
                ) && 
                (
                    this.IncludeOutlets == input.IncludeOutlets ||
                    (this.IncludeOutlets != null &&
                    this.IncludeOutlets.Equals(input.IncludeOutlets))
                ) && 
                (
                    this.MatchStopBySuburb == input.MatchStopBySuburb ||
                    (this.MatchStopBySuburb != null &&
                    this.MatchStopBySuburb.Equals(input.MatchStopBySuburb))
                ) && 
                (
                    this.MatchRouteBySuburb == input.MatchRouteBySuburb ||
                    (this.MatchRouteBySuburb != null &&
                    this.MatchRouteBySuburb.Equals(input.MatchRouteBySuburb))
                ) && 
                (
                    this.MatchStopByGtfsStopId == input.MatchStopByGtfsStopId ||
                    (this.MatchStopByGtfsStopId != null &&
                    this.MatchStopByGtfsStopId.Equals(input.MatchStopByGtfsStopId))
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
                if (this.RouteTypes != null)
                    hashCode = hashCode * 59 + this.RouteTypes.GetHashCode();
                if (this.Latitude != null)
                    hashCode = hashCode * 59 + this.Latitude.GetHashCode();
                if (this.Longitude != null)
                    hashCode = hashCode * 59 + this.Longitude.GetHashCode();
                if (this.MaxDistance != null)
                    hashCode = hashCode * 59 + this.MaxDistance.GetHashCode();
                if (this.IncludeAddresses != null)
                    hashCode = hashCode * 59 + this.IncludeAddresses.GetHashCode();
                if (this.IncludeOutlets != null)
                    hashCode = hashCode * 59 + this.IncludeOutlets.GetHashCode();
                if (this.MatchStopBySuburb != null)
                    hashCode = hashCode * 59 + this.MatchStopBySuburb.GetHashCode();
                if (this.MatchRouteBySuburb != null)
                    hashCode = hashCode * 59 + this.MatchRouteBySuburb.GetHashCode();
                if (this.MatchStopByGtfsStopId != null)
                    hashCode = hashCode * 59 + this.MatchStopByGtfsStopId.GetHashCode();
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
