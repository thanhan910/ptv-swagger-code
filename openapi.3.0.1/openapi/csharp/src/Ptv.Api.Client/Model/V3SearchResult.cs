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
    /// V3SearchResult
    /// </summary>
    [DataContract(Name = "V3.SearchResult")]
    public partial class V3SearchResult : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V3SearchResult" /> class.
        /// </summary>
        /// <param name="stops">Train stations, tram stops, bus stops, regional coach stops or Night Bus stops.</param>
        /// <param name="routes">Train lines, tram routes, bus routes, regional coach routes, Night Bus routes.</param>
        /// <param name="outlets">myki ticket outlets.</param>
        /// <param name="status">status.</param>
        public V3SearchResult(List<V3ResultStop> stops = default(List<V3ResultStop>), List<V3ResultRoute> routes = default(List<V3ResultRoute>), List<V3ResultOutlet> outlets = default(List<V3ResultOutlet>), V3Status status = default(V3Status))
        {
            this.Stops = stops;
            this.Routes = routes;
            this.Outlets = outlets;
            this.Status = status;
        }

        /// <summary>
        /// Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
        /// </summary>
        /// <value>Train stations, tram stops, bus stops, regional coach stops or Night Bus stops</value>
        [DataMember(Name = "stops", EmitDefaultValue = false)]
        public List<V3ResultStop> Stops { get; set; }

        /// <summary>
        /// Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
        /// </summary>
        /// <value>Train lines, tram routes, bus routes, regional coach routes, Night Bus routes</value>
        [DataMember(Name = "routes", EmitDefaultValue = false)]
        public List<V3ResultRoute> Routes { get; set; }

        /// <summary>
        /// myki ticket outlets
        /// </summary>
        /// <value>myki ticket outlets</value>
        [DataMember(Name = "outlets", EmitDefaultValue = false)]
        public List<V3ResultOutlet> Outlets { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public V3Status Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class V3SearchResult {\n");
            sb.Append("  Stops: ").Append(Stops).Append("\n");
            sb.Append("  Routes: ").Append(Routes).Append("\n");
            sb.Append("  Outlets: ").Append(Outlets).Append("\n");
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
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
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
