/*
 * Catapult REST Endpoints
 *
 * OpenAPI Specification of catapult-rest
 *
 * The version of the OpenAPI document: 1.0.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing RestrictionMosaicRoutesApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class RestrictionMosaicRoutesApiTests : IDisposable
    {
        private RestrictionMosaicRoutesApi instance;

        public RestrictionMosaicRoutesApiTests()
        {
            instance = new RestrictionMosaicRoutesApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of RestrictionMosaicRoutesApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' RestrictionMosaicRoutesApi
            //Assert.IsType<RestrictionMosaicRoutesApi>(instance);
        }

        /// <summary>
        /// Test GetMosaicRestrictions
        /// </summary>
        [Fact]
        public void GetMosaicRestrictionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string compositeHash = null;
            //var response = instance.GetMosaicRestrictions(compositeHash);
            //Assert.IsType<MosaicRestrictionDTO>(response);
        }

        /// <summary>
        /// Test GetMosaicRestrictionsMerkle
        /// </summary>
        [Fact]
        public void GetMosaicRestrictionsMerkleTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string compositeHash = null;
            //var response = instance.GetMosaicRestrictionsMerkle(compositeHash);
            //Assert.IsType<MerkleStateInfoDTO>(response);
        }

        /// <summary>
        /// Test SearchMosaicRestrictions
        /// </summary>
        [Fact]
        public void SearchMosaicRestrictionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string? mosaicId = null;
            //MosaicRestrictionEntryTypeEnum? entryType = null;
            //string? targetAddress = null;
            //int? pageSize = null;
            //int? pageNumber = null;
            //string? offset = null;
            //Order? order = null;
            //var response = instance.SearchMosaicRestrictions(mosaicId, entryType, targetAddress, pageSize, pageNumber, offset, order);
            //Assert.IsType<MosaicRestrictionsPage>(response);
        }
    }
}
