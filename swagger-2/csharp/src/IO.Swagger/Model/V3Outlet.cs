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
    /// V3Outlet
    /// </summary>
    [DataContract]
    public partial class V3Outlet :  IEquatable<V3Outlet>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V3Outlet" /> class.
        /// </summary>
        /// <param name="outletSlidSpid">The SLID / SPID.</param>
        /// <param name="outletName">The location name of the outlet.</param>
        /// <param name="outletBusiness">The business name of the outlet.</param>
        /// <param name="outletLatitude">Geographic coordinate of latitude at outlet.</param>
        /// <param name="outletLongitude">Geographic coordinate of longitude at outlet.</param>
        /// <param name="outletSuburb">The city/municipality the outlet is in.</param>
        /// <param name="outletPostcode">The postcode for the outlet.</param>
        /// <param name="outletBusinessHourMon">The business hours on Monday.</param>
        /// <param name="outletBusinessHourTue">The business hours on Tuesday.</param>
        /// <param name="outletBusinessHourWed">The business hours on Wednesday.</param>
        /// <param name="outletBusinessHourThur">The business hours on Thursday.</param>
        /// <param name="outletBusinessHourFri">The business hours on Friday.</param>
        /// <param name="outletBusinessHourSat">The business hours on Saturday.</param>
        /// <param name="outletBusinessHourSun">The business hours on Sunday.</param>
        /// <param name="outletNotes">Any additional notes for the outlet such as &#39;Buy pre-loaded myki cards only&#39;. May be null/empty..</param>
        public V3Outlet(string outletSlidSpid = default(string), string outletName = default(string), string outletBusiness = default(string), float? outletLatitude = default(float?), float? outletLongitude = default(float?), string outletSuburb = default(string), int? outletPostcode = default(int?), string outletBusinessHourMon = default(string), string outletBusinessHourTue = default(string), string outletBusinessHourWed = default(string), string outletBusinessHourThur = default(string), string outletBusinessHourFri = default(string), string outletBusinessHourSat = default(string), string outletBusinessHourSun = default(string), string outletNotes = default(string))
        {
            this.OutletSlidSpid = outletSlidSpid;
            this.OutletName = outletName;
            this.OutletBusiness = outletBusiness;
            this.OutletLatitude = outletLatitude;
            this.OutletLongitude = outletLongitude;
            this.OutletSuburb = outletSuburb;
            this.OutletPostcode = outletPostcode;
            this.OutletBusinessHourMon = outletBusinessHourMon;
            this.OutletBusinessHourTue = outletBusinessHourTue;
            this.OutletBusinessHourWed = outletBusinessHourWed;
            this.OutletBusinessHourThur = outletBusinessHourThur;
            this.OutletBusinessHourFri = outletBusinessHourFri;
            this.OutletBusinessHourSat = outletBusinessHourSat;
            this.OutletBusinessHourSun = outletBusinessHourSun;
            this.OutletNotes = outletNotes;
        }
        
        /// <summary>
        /// The SLID / SPID
        /// </summary>
        /// <value>The SLID / SPID</value>
        [DataMember(Name="outlet_slid_spid", EmitDefaultValue=false)]
        public string OutletSlidSpid { get; set; }

        /// <summary>
        /// The location name of the outlet
        /// </summary>
        /// <value>The location name of the outlet</value>
        [DataMember(Name="outlet_name", EmitDefaultValue=false)]
        public string OutletName { get; set; }

        /// <summary>
        /// The business name of the outlet
        /// </summary>
        /// <value>The business name of the outlet</value>
        [DataMember(Name="outlet_business", EmitDefaultValue=false)]
        public string OutletBusiness { get; set; }

        /// <summary>
        /// Geographic coordinate of latitude at outlet
        /// </summary>
        /// <value>Geographic coordinate of latitude at outlet</value>
        [DataMember(Name="outlet_latitude", EmitDefaultValue=false)]
        public float? OutletLatitude { get; set; }

        /// <summary>
        /// Geographic coordinate of longitude at outlet
        /// </summary>
        /// <value>Geographic coordinate of longitude at outlet</value>
        [DataMember(Name="outlet_longitude", EmitDefaultValue=false)]
        public float? OutletLongitude { get; set; }

        /// <summary>
        /// The city/municipality the outlet is in
        /// </summary>
        /// <value>The city/municipality the outlet is in</value>
        [DataMember(Name="outlet_suburb", EmitDefaultValue=false)]
        public string OutletSuburb { get; set; }

        /// <summary>
        /// The postcode for the outlet
        /// </summary>
        /// <value>The postcode for the outlet</value>
        [DataMember(Name="outlet_postcode", EmitDefaultValue=false)]
        public int? OutletPostcode { get; set; }

        /// <summary>
        /// The business hours on Monday
        /// </summary>
        /// <value>The business hours on Monday</value>
        [DataMember(Name="outlet_business_hour_mon", EmitDefaultValue=false)]
        public string OutletBusinessHourMon { get; set; }

        /// <summary>
        /// The business hours on Tuesday
        /// </summary>
        /// <value>The business hours on Tuesday</value>
        [DataMember(Name="outlet_business_hour_tue", EmitDefaultValue=false)]
        public string OutletBusinessHourTue { get; set; }

        /// <summary>
        /// The business hours on Wednesday
        /// </summary>
        /// <value>The business hours on Wednesday</value>
        [DataMember(Name="outlet_business_hour_wed", EmitDefaultValue=false)]
        public string OutletBusinessHourWed { get; set; }

        /// <summary>
        /// The business hours on Thursday
        /// </summary>
        /// <value>The business hours on Thursday</value>
        [DataMember(Name="outlet_business_hour_thur", EmitDefaultValue=false)]
        public string OutletBusinessHourThur { get; set; }

        /// <summary>
        /// The business hours on Friday
        /// </summary>
        /// <value>The business hours on Friday</value>
        [DataMember(Name="outlet_business_hour_fri", EmitDefaultValue=false)]
        public string OutletBusinessHourFri { get; set; }

        /// <summary>
        /// The business hours on Saturday
        /// </summary>
        /// <value>The business hours on Saturday</value>
        [DataMember(Name="outlet_business_hour_sat", EmitDefaultValue=false)]
        public string OutletBusinessHourSat { get; set; }

        /// <summary>
        /// The business hours on Sunday
        /// </summary>
        /// <value>The business hours on Sunday</value>
        [DataMember(Name="outlet_business_hour_sun", EmitDefaultValue=false)]
        public string OutletBusinessHourSun { get; set; }

        /// <summary>
        /// Any additional notes for the outlet such as &#39;Buy pre-loaded myki cards only&#39;. May be null/empty.
        /// </summary>
        /// <value>Any additional notes for the outlet such as &#39;Buy pre-loaded myki cards only&#39;. May be null/empty.</value>
        [DataMember(Name="outlet_notes", EmitDefaultValue=false)]
        public string OutletNotes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3Outlet {\n");
            sb.Append("  OutletSlidSpid: ").Append(OutletSlidSpid).Append("\n");
            sb.Append("  OutletName: ").Append(OutletName).Append("\n");
            sb.Append("  OutletBusiness: ").Append(OutletBusiness).Append("\n");
            sb.Append("  OutletLatitude: ").Append(OutletLatitude).Append("\n");
            sb.Append("  OutletLongitude: ").Append(OutletLongitude).Append("\n");
            sb.Append("  OutletSuburb: ").Append(OutletSuburb).Append("\n");
            sb.Append("  OutletPostcode: ").Append(OutletPostcode).Append("\n");
            sb.Append("  OutletBusinessHourMon: ").Append(OutletBusinessHourMon).Append("\n");
            sb.Append("  OutletBusinessHourTue: ").Append(OutletBusinessHourTue).Append("\n");
            sb.Append("  OutletBusinessHourWed: ").Append(OutletBusinessHourWed).Append("\n");
            sb.Append("  OutletBusinessHourThur: ").Append(OutletBusinessHourThur).Append("\n");
            sb.Append("  OutletBusinessHourFri: ").Append(OutletBusinessHourFri).Append("\n");
            sb.Append("  OutletBusinessHourSat: ").Append(OutletBusinessHourSat).Append("\n");
            sb.Append("  OutletBusinessHourSun: ").Append(OutletBusinessHourSun).Append("\n");
            sb.Append("  OutletNotes: ").Append(OutletNotes).Append("\n");
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
            return this.Equals(input as V3Outlet);
        }

        /// <summary>
        /// Returns true if V3Outlet instances are equal
        /// </summary>
        /// <param name="input">Instance of V3Outlet to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3Outlet input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.OutletSlidSpid == input.OutletSlidSpid ||
                    (this.OutletSlidSpid != null &&
                    this.OutletSlidSpid.Equals(input.OutletSlidSpid))
                ) && 
                (
                    this.OutletName == input.OutletName ||
                    (this.OutletName != null &&
                    this.OutletName.Equals(input.OutletName))
                ) && 
                (
                    this.OutletBusiness == input.OutletBusiness ||
                    (this.OutletBusiness != null &&
                    this.OutletBusiness.Equals(input.OutletBusiness))
                ) && 
                (
                    this.OutletLatitude == input.OutletLatitude ||
                    (this.OutletLatitude != null &&
                    this.OutletLatitude.Equals(input.OutletLatitude))
                ) && 
                (
                    this.OutletLongitude == input.OutletLongitude ||
                    (this.OutletLongitude != null &&
                    this.OutletLongitude.Equals(input.OutletLongitude))
                ) && 
                (
                    this.OutletSuburb == input.OutletSuburb ||
                    (this.OutletSuburb != null &&
                    this.OutletSuburb.Equals(input.OutletSuburb))
                ) && 
                (
                    this.OutletPostcode == input.OutletPostcode ||
                    (this.OutletPostcode != null &&
                    this.OutletPostcode.Equals(input.OutletPostcode))
                ) && 
                (
                    this.OutletBusinessHourMon == input.OutletBusinessHourMon ||
                    (this.OutletBusinessHourMon != null &&
                    this.OutletBusinessHourMon.Equals(input.OutletBusinessHourMon))
                ) && 
                (
                    this.OutletBusinessHourTue == input.OutletBusinessHourTue ||
                    (this.OutletBusinessHourTue != null &&
                    this.OutletBusinessHourTue.Equals(input.OutletBusinessHourTue))
                ) && 
                (
                    this.OutletBusinessHourWed == input.OutletBusinessHourWed ||
                    (this.OutletBusinessHourWed != null &&
                    this.OutletBusinessHourWed.Equals(input.OutletBusinessHourWed))
                ) && 
                (
                    this.OutletBusinessHourThur == input.OutletBusinessHourThur ||
                    (this.OutletBusinessHourThur != null &&
                    this.OutletBusinessHourThur.Equals(input.OutletBusinessHourThur))
                ) && 
                (
                    this.OutletBusinessHourFri == input.OutletBusinessHourFri ||
                    (this.OutletBusinessHourFri != null &&
                    this.OutletBusinessHourFri.Equals(input.OutletBusinessHourFri))
                ) && 
                (
                    this.OutletBusinessHourSat == input.OutletBusinessHourSat ||
                    (this.OutletBusinessHourSat != null &&
                    this.OutletBusinessHourSat.Equals(input.OutletBusinessHourSat))
                ) && 
                (
                    this.OutletBusinessHourSun == input.OutletBusinessHourSun ||
                    (this.OutletBusinessHourSun != null &&
                    this.OutletBusinessHourSun.Equals(input.OutletBusinessHourSun))
                ) && 
                (
                    this.OutletNotes == input.OutletNotes ||
                    (this.OutletNotes != null &&
                    this.OutletNotes.Equals(input.OutletNotes))
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
                if (this.OutletSlidSpid != null)
                    hashCode = hashCode * 59 + this.OutletSlidSpid.GetHashCode();
                if (this.OutletName != null)
                    hashCode = hashCode * 59 + this.OutletName.GetHashCode();
                if (this.OutletBusiness != null)
                    hashCode = hashCode * 59 + this.OutletBusiness.GetHashCode();
                if (this.OutletLatitude != null)
                    hashCode = hashCode * 59 + this.OutletLatitude.GetHashCode();
                if (this.OutletLongitude != null)
                    hashCode = hashCode * 59 + this.OutletLongitude.GetHashCode();
                if (this.OutletSuburb != null)
                    hashCode = hashCode * 59 + this.OutletSuburb.GetHashCode();
                if (this.OutletPostcode != null)
                    hashCode = hashCode * 59 + this.OutletPostcode.GetHashCode();
                if (this.OutletBusinessHourMon != null)
                    hashCode = hashCode * 59 + this.OutletBusinessHourMon.GetHashCode();
                if (this.OutletBusinessHourTue != null)
                    hashCode = hashCode * 59 + this.OutletBusinessHourTue.GetHashCode();
                if (this.OutletBusinessHourWed != null)
                    hashCode = hashCode * 59 + this.OutletBusinessHourWed.GetHashCode();
                if (this.OutletBusinessHourThur != null)
                    hashCode = hashCode * 59 + this.OutletBusinessHourThur.GetHashCode();
                if (this.OutletBusinessHourFri != null)
                    hashCode = hashCode * 59 + this.OutletBusinessHourFri.GetHashCode();
                if (this.OutletBusinessHourSat != null)
                    hashCode = hashCode * 59 + this.OutletBusinessHourSat.GetHashCode();
                if (this.OutletBusinessHourSun != null)
                    hashCode = hashCode * 59 + this.OutletBusinessHourSun.GetHashCode();
                if (this.OutletNotes != null)
                    hashCode = hashCode * 59 + this.OutletNotes.GetHashCode();
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
