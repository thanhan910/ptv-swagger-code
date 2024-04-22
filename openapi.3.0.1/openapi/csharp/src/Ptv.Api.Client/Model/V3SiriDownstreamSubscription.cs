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
    /// V3SiriDownstreamSubscription
    /// </summary>
    [DataContract(Name = "V3.SiriDownstreamSubscription")]
    public partial class V3SiriDownstreamSubscription : IValidatableObject
    {
        /// <summary>
        /// Defines MessageType
        /// </summary>
        public enum MessageTypeEnum
        {
            /// <summary>
            /// Enum NUMBER_0 for value: 0
            /// </summary>
            NUMBER_0 = 0,

            /// <summary>
            /// Enum NUMBER_1 for value: 1
            /// </summary>
            NUMBER_1 = 1
        }


        /// <summary>
        /// Gets or Sets MessageType
        /// </summary>
        [DataMember(Name = "message_type", EmitDefaultValue = false)]
        public MessageTypeEnum? MessageType { get; set; }
        /// <summary>
        /// Defines SiriFormat
        /// </summary>
        public enum SiriFormatEnum
        {
            /// <summary>
            /// Enum NUMBER_0 for value: 0
            /// </summary>
            NUMBER_0 = 0,

            /// <summary>
            /// Enum NUMBER_1 for value: 1
            /// </summary>
            NUMBER_1 = 1
        }


        /// <summary>
        /// Gets or Sets SiriFormat
        /// </summary>
        [DataMember(Name = "siri_format", EmitDefaultValue = false)]
        public SiriFormatEnum? SiriFormat { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="V3SiriDownstreamSubscription" /> class.
        /// </summary>
        /// <param name="subscriberRef">subscriberRef.</param>
        /// <param name="subscriptionRef">subscriptionRef.</param>
        /// <param name="messageType">messageType.</param>
        /// <param name="siriFormat">siriFormat.</param>
        /// <param name="siriVersion">siriVersion.</param>
        /// <param name="consumerAddress">consumerAddress.</param>
        /// <param name="initialTerminationTime">initialTerminationTime.</param>
        /// <param name="validityPeriodStart">validityPeriodStart.</param>
        /// <param name="validityPeriodEnd">validityPeriodEnd.</param>
        /// <param name="previewInterval">previewInterval.</param>
        /// <param name="topics">topics.</param>
        public V3SiriDownstreamSubscription(string subscriberRef = default(string), string subscriptionRef = default(string), MessageTypeEnum? messageType = default(MessageTypeEnum?), SiriFormatEnum? siriFormat = default(SiriFormatEnum?), string siriVersion = default(string), string consumerAddress = default(string), DateTime initialTerminationTime = default(DateTime), DateTime validityPeriodStart = default(DateTime), DateTime validityPeriodEnd = default(DateTime), string previewInterval = default(string), List<V3SiriDownstreamSubscriptionTopic> topics = default(List<V3SiriDownstreamSubscriptionTopic>))
        {
            this.SubscriberRef = subscriberRef;
            this.SubscriptionRef = subscriptionRef;
            this.MessageType = messageType;
            this.SiriFormat = siriFormat;
            this.SiriVersion = siriVersion;
            this.ConsumerAddress = consumerAddress;
            this.InitialTerminationTime = initialTerminationTime;
            this.ValidityPeriodStart = validityPeriodStart;
            this.ValidityPeriodEnd = validityPeriodEnd;
            this.PreviewInterval = previewInterval;
            this.Topics = topics;
        }

        /// <summary>
        /// Gets or Sets SubscriberRef
        /// </summary>
        [DataMember(Name = "subscriber_ref", EmitDefaultValue = false)]
        public string SubscriberRef { get; set; }

        /// <summary>
        /// Gets or Sets SubscriptionRef
        /// </summary>
        [DataMember(Name = "subscription_ref", EmitDefaultValue = false)]
        public string SubscriptionRef { get; set; }

        /// <summary>
        /// Gets or Sets SiriVersion
        /// </summary>
        [DataMember(Name = "siri_version", EmitDefaultValue = false)]
        public string SiriVersion { get; set; }

        /// <summary>
        /// Gets or Sets ConsumerAddress
        /// </summary>
        [DataMember(Name = "consumer_address", EmitDefaultValue = false)]
        public string ConsumerAddress { get; set; }

        /// <summary>
        /// Gets or Sets InitialTerminationTime
        /// </summary>
        [DataMember(Name = "initial_termination_time", EmitDefaultValue = false)]
        public DateTime InitialTerminationTime { get; set; }

        /// <summary>
        /// Gets or Sets ValidityPeriodStart
        /// </summary>
        [DataMember(Name = "validity_period_start", EmitDefaultValue = false)]
        public DateTime ValidityPeriodStart { get; set; }

        /// <summary>
        /// Gets or Sets ValidityPeriodEnd
        /// </summary>
        [DataMember(Name = "validity_period_end", EmitDefaultValue = false)]
        public DateTime ValidityPeriodEnd { get; set; }

        /// <summary>
        /// Gets or Sets PreviewInterval
        /// </summary>
        [DataMember(Name = "preview_interval", EmitDefaultValue = false)]
        public string PreviewInterval { get; set; }

        /// <summary>
        /// Gets or Sets Topics
        /// </summary>
        [DataMember(Name = "topics", EmitDefaultValue = false)]
        public List<V3SiriDownstreamSubscriptionTopic> Topics { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class V3SiriDownstreamSubscription {\n");
            sb.Append("  SubscriberRef: ").Append(SubscriberRef).Append("\n");
            sb.Append("  SubscriptionRef: ").Append(SubscriptionRef).Append("\n");
            sb.Append("  MessageType: ").Append(MessageType).Append("\n");
            sb.Append("  SiriFormat: ").Append(SiriFormat).Append("\n");
            sb.Append("  SiriVersion: ").Append(SiriVersion).Append("\n");
            sb.Append("  ConsumerAddress: ").Append(ConsumerAddress).Append("\n");
            sb.Append("  InitialTerminationTime: ").Append(InitialTerminationTime).Append("\n");
            sb.Append("  ValidityPeriodStart: ").Append(ValidityPeriodStart).Append("\n");
            sb.Append("  ValidityPeriodEnd: ").Append(ValidityPeriodEnd).Append("\n");
            sb.Append("  PreviewInterval: ").Append(PreviewInterval).Append("\n");
            sb.Append("  Topics: ").Append(Topics).Append("\n");
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
            if (this.SiriVersion != null) {
                // SiriVersion (string) pattern
                Regex regexSiriVersion = new Regex(@"1.3|2.0", RegexOptions.CultureInvariant);
                if (!regexSiriVersion.Match(this.SiriVersion).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for SiriVersion, must match a pattern of " + regexSiriVersion, new [] { "SiriVersion" });
                }
            }

            yield break;
        }
    }

}