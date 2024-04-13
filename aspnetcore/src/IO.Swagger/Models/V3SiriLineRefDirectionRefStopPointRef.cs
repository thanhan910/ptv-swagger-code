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
    public partial class V3SiriLineRefDirectionRefStopPointRef : IEquatable<V3SiriLineRefDirectionRefStopPointRef>
    { 
        /// <summary>
        /// Siri LineRef
        /// </summary>
        /// <value>Siri LineRef</value>
        [Required]

        [DataMember(Name="line_ref")]
        public string LineRef { get; set; }

        /// <summary>
        /// Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
        /// </summary>
        /// <value>Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)</value>
        
        public enum DirectionRefEnum
        {
            /// <summary>
            /// Enum NUMBER_1 for 1
            /// </summary>
            
            NUMBER_1 = 1,
            /// <summary>
            /// Enum NUMBER_2 for 2
            /// </summary>
            
            NUMBER_2 = 2,
            /// <summary>
            /// Enum NUMBER_5 for 5
            /// </summary>
            
            NUMBER_5 = 5,
            /// <summary>
            /// Enum NUMBER_10 for 10
            /// </summary>
            
            NUMBER_10 = 10,
            /// <summary>
            /// Enum NUMBER_16 for 16
            /// </summary>
            
            NUMBER_16 = 16,
            /// <summary>
            /// Enum NUMBER_32 for 32
            /// </summary>
            
            NUMBER_32 = 32,
            /// <summary>
            /// Enum NUMBER_65 for 65
            /// </summary>
            
            NUMBER_65 = 65,
            /// <summary>
            /// Enum NUMBER_130 for 130
            /// </summary>
            
            NUMBER_130 = 130        }

        /// <summary>
        /// Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
        /// </summary>
        /// <value>Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)</value>
        [Required]

        [DataMember(Name="direction_ref")]
        public DirectionRefEnum? DirectionRef { get; set; }

        /// <summary>
        /// Siri StopPointRef
        /// </summary>
        /// <value>Siri StopPointRef</value>
        [Required]

        [DataMember(Name="stop_point_ref")]
        public int? StopPointRef { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3SiriLineRefDirectionRefStopPointRef {\n");
            sb.Append("  LineRef: ").Append(LineRef).Append("\n");
            sb.Append("  DirectionRef: ").Append(DirectionRef).Append("\n");
            sb.Append("  StopPointRef: ").Append(StopPointRef).Append("\n");
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
            return obj.GetType() == GetType() && Equals((V3SiriLineRefDirectionRefStopPointRef)obj);
        }

        /// <summary>
        /// Returns true if V3SiriLineRefDirectionRefStopPointRef instances are equal
        /// </summary>
        /// <param name="other">Instance of V3SiriLineRefDirectionRefStopPointRef to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3SiriLineRefDirectionRefStopPointRef other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    LineRef == other.LineRef ||
                    LineRef != null &&
                    LineRef.Equals(other.LineRef)
                ) && 
                (
                    DirectionRef == other.DirectionRef ||
                    DirectionRef != null &&
                    DirectionRef.Equals(other.DirectionRef)
                ) && 
                (
                    StopPointRef == other.StopPointRef ||
                    StopPointRef != null &&
                    StopPointRef.Equals(other.StopPointRef)
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
                    if (LineRef != null)
                    hashCode = hashCode * 59 + LineRef.GetHashCode();
                    if (DirectionRef != null)
                    hashCode = hashCode * 59 + DirectionRef.GetHashCode();
                    if (StopPointRef != null)
                    hashCode = hashCode * 59 + StopPointRef.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(V3SiriLineRefDirectionRefStopPointRef left, V3SiriLineRefDirectionRefStopPointRef right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(V3SiriLineRefDirectionRefStopPointRef left, V3SiriLineRefDirectionRefStopPointRef right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
