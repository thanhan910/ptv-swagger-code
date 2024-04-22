/*
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * The version of the OpenAPI document: v3
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Ptv.Api.Client.Model;
using Ptv.Api.Client.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Ptv.Api.Client.Test.Model
{
    /// <summary>
    ///  Class for testing V3DynamoDbTimetable
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class V3DynamoDbTimetableTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for V3DynamoDbTimetable
        //private V3DynamoDbTimetable instance;

        public V3DynamoDbTimetableTests()
        {
            // TODO uncomment below to create an instance of V3DynamoDbTimetable
            //instance = new V3DynamoDbTimetable();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of V3DynamoDbTimetable
        /// </summary>
        [Fact]
        public void V3DynamoDbTimetableInstanceTest()
        {
            // TODO uncomment below to test "IsType" V3DynamoDbTimetable
            //Assert.IsType<V3DynamoDbTimetable>(instance);
        }

        /// <summary>
        /// Test the property 'TableName'
        /// </summary>
        [Fact]
        public void TableNameTest()
        {
            // TODO unit test for the property 'TableName'
        }

        /// <summary>
        /// Test the property 'ParserVersion'
        /// </summary>
        [Fact]
        public void ParserVersionTest()
        {
            // TODO unit test for the property 'ParserVersion'
        }

        /// <summary>
        /// Test the property 'ParserMappingVersion'
        /// </summary>
        [Fact]
        public void ParserMappingVersionTest()
        {
            // TODO unit test for the property 'ParserMappingVersion'
        }

        /// <summary>
        /// Test the property 'PtVersion'
        /// </summary>
        [Fact]
        public void PtVersionTest()
        {
            // TODO unit test for the property 'PtVersion'
        }

        /// <summary>
        /// Test the property 'PtMappingVersion'
        /// </summary>
        [Fact]
        public void PtMappingVersionTest()
        {
            // TODO unit test for the property 'PtMappingVersion'
        }

        /// <summary>
        /// Test the property 'TransportType'
        /// </summary>
        [Fact]
        public void TransportTypeTest()
        {
            // TODO unit test for the property 'TransportType'
        }

        /// <summary>
        /// Test the property 'ApplicableLocalDate'
        /// </summary>
        [Fact]
        public void ApplicableLocalDateTest()
        {
            // TODO unit test for the property 'ApplicableLocalDate'
        }

        /// <summary>
        /// Test the property 'Exists'
        /// </summary>
        [Fact]
        public void ExistsTest()
        {
            // TODO unit test for the property 'Exists'
        }
    }
}
