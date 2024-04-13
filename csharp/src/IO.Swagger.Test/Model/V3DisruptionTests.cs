/* 
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using IO.Swagger.Api;
using IO.Swagger.Model;
using IO.Swagger.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing V3Disruption
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class V3DisruptionTests
    {
        // TODO uncomment below to declare an instance variable for V3Disruption
        //private V3Disruption instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of V3Disruption
            //instance = new V3Disruption();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of V3Disruption
        /// </summary>
        [Test]
        public void V3DisruptionInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" V3Disruption
            //Assert.IsInstanceOfType<V3Disruption> (instance, "variable 'instance' is a V3Disruption");
        }


        /// <summary>
        /// Test the property 'DisruptionId'
        /// </summary>
        [Test]
        public void DisruptionIdTest()
        {
            // TODO unit test for the property 'DisruptionId'
        }
        /// <summary>
        /// Test the property 'Title'
        /// </summary>
        [Test]
        public void TitleTest()
        {
            // TODO unit test for the property 'Title'
        }
        /// <summary>
        /// Test the property 'Url'
        /// </summary>
        [Test]
        public void UrlTest()
        {
            // TODO unit test for the property 'Url'
        }
        /// <summary>
        /// Test the property 'Description'
        /// </summary>
        [Test]
        public void DescriptionTest()
        {
            // TODO unit test for the property 'Description'
        }
        /// <summary>
        /// Test the property 'DisruptionStatus'
        /// </summary>
        [Test]
        public void DisruptionStatusTest()
        {
            // TODO unit test for the property 'DisruptionStatus'
        }
        /// <summary>
        /// Test the property 'DisruptionType'
        /// </summary>
        [Test]
        public void DisruptionTypeTest()
        {
            // TODO unit test for the property 'DisruptionType'
        }
        /// <summary>
        /// Test the property 'PublishedOn'
        /// </summary>
        [Test]
        public void PublishedOnTest()
        {
            // TODO unit test for the property 'PublishedOn'
        }
        /// <summary>
        /// Test the property 'LastUpdated'
        /// </summary>
        [Test]
        public void LastUpdatedTest()
        {
            // TODO unit test for the property 'LastUpdated'
        }
        /// <summary>
        /// Test the property 'FromDate'
        /// </summary>
        [Test]
        public void FromDateTest()
        {
            // TODO unit test for the property 'FromDate'
        }
        /// <summary>
        /// Test the property 'ToDate'
        /// </summary>
        [Test]
        public void ToDateTest()
        {
            // TODO unit test for the property 'ToDate'
        }
        /// <summary>
        /// Test the property 'Routes'
        /// </summary>
        [Test]
        public void RoutesTest()
        {
            // TODO unit test for the property 'Routes'
        }
        /// <summary>
        /// Test the property 'Stops'
        /// </summary>
        [Test]
        public void StopsTest()
        {
            // TODO unit test for the property 'Stops'
        }
        /// <summary>
        /// Test the property 'Colour'
        /// </summary>
        [Test]
        public void ColourTest()
        {
            // TODO unit test for the property 'Colour'
        }
        /// <summary>
        /// Test the property 'DisplayOnBoard'
        /// </summary>
        [Test]
        public void DisplayOnBoardTest()
        {
            // TODO unit test for the property 'DisplayOnBoard'
        }
        /// <summary>
        /// Test the property 'DisplayStatus'
        /// </summary>
        [Test]
        public void DisplayStatusTest()
        {
            // TODO unit test for the property 'DisplayStatus'
        }

    }

}
