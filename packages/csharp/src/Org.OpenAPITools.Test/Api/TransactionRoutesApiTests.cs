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
    ///  Class for testing TransactionRoutesApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class TransactionRoutesApiTests : IDisposable
    {
        private TransactionRoutesApi instance;

        public TransactionRoutesApiTests()
        {
            instance = new TransactionRoutesApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of TransactionRoutesApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' TransactionRoutesApi
            //Assert.IsType<TransactionRoutesApi>(instance);
        }

        /// <summary>
        /// Test AnnounceCosignatureTransaction
        /// </summary>
        [Fact]
        public void AnnounceCosignatureTransactionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Cosignature cosignature = null;
            //var response = instance.AnnounceCosignatureTransaction(cosignature);
            //Assert.IsType<AnnounceTransactionInfoDTO>(response);
        }

        /// <summary>
        /// Test AnnouncePartialTransaction
        /// </summary>
        [Fact]
        public void AnnouncePartialTransactionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //TransactionPayload transactionPayload = null;
            //var response = instance.AnnouncePartialTransaction(transactionPayload);
            //Assert.IsType<AnnounceTransactionInfoDTO>(response);
        }

        /// <summary>
        /// Test AnnounceTransaction
        /// </summary>
        [Fact]
        public void AnnounceTransactionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //TransactionPayload transactionPayload = null;
            //var response = instance.AnnounceTransaction(transactionPayload);
            //Assert.IsType<AnnounceTransactionInfoDTO>(response);
        }

        /// <summary>
        /// Test GetConfirmedTransaction
        /// </summary>
        [Fact]
        public void GetConfirmedTransactionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string transactionId = null;
            //var response = instance.GetConfirmedTransaction(transactionId);
            //Assert.IsType<TransactionInfoDTO>(response);
        }

        /// <summary>
        /// Test GetConfirmedTransactions
        /// </summary>
        [Fact]
        public void GetConfirmedTransactionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //TransactionIds transactionIds = null;
            //var response = instance.GetConfirmedTransactions(transactionIds);
            //Assert.IsType<List<TransactionInfoDTO>>(response);
        }

        /// <summary>
        /// Test GetPartialTransaction
        /// </summary>
        [Fact]
        public void GetPartialTransactionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string transactionId = null;
            //var response = instance.GetPartialTransaction(transactionId);
            //Assert.IsType<TransactionInfoDTO>(response);
        }

        /// <summary>
        /// Test GetPartialTransactions
        /// </summary>
        [Fact]
        public void GetPartialTransactionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //TransactionIds transactionIds = null;
            //var response = instance.GetPartialTransactions(transactionIds);
            //Assert.IsType<List<TransactionInfoDTO>>(response);
        }

        /// <summary>
        /// Test GetUnconfirmedTransaction
        /// </summary>
        [Fact]
        public void GetUnconfirmedTransactionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string transactionId = null;
            //var response = instance.GetUnconfirmedTransaction(transactionId);
            //Assert.IsType<TransactionInfoDTO>(response);
        }

        /// <summary>
        /// Test GetUnconfirmedTransactions
        /// </summary>
        [Fact]
        public void GetUnconfirmedTransactionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //TransactionIds transactionIds = null;
            //var response = instance.GetUnconfirmedTransactions(transactionIds);
            //Assert.IsType<List<TransactionInfoDTO>>(response);
        }

        /// <summary>
        /// Test SearchConfirmedTransactions
        /// </summary>
        [Fact]
        public void SearchConfirmedTransactionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string? address = null;
            //string? recipientAddress = null;
            //string? signerPublicKey = null;
            //string? height = null;
            //string? fromHeight = null;
            //string? toHeight = null;
            //string? fromTransferAmount = null;
            //string? toTransferAmount = null;
            //List<TransactionTypeEnum>? type = null;
            //bool? embedded = null;
            //string? transferMosaicId = null;
            //int? pageSize = null;
            //int? pageNumber = null;
            //string? offset = null;
            //Order? order = null;
            //var response = instance.SearchConfirmedTransactions(address, recipientAddress, signerPublicKey, height, fromHeight, toHeight, fromTransferAmount, toTransferAmount, type, embedded, transferMosaicId, pageSize, pageNumber, offset, order);
            //Assert.IsType<TransactionPage>(response);
        }

        /// <summary>
        /// Test SearchPartialTransactions
        /// </summary>
        [Fact]
        public void SearchPartialTransactionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string? address = null;
            //string? recipientAddress = null;
            //string? signerPublicKey = null;
            //string? height = null;
            //string? fromHeight = null;
            //string? toHeight = null;
            //string? fromTransferAmount = null;
            //string? toTransferAmount = null;
            //List<TransactionTypeEnum>? type = null;
            //bool? embedded = null;
            //string? transferMosaicId = null;
            //int? pageSize = null;
            //int? pageNumber = null;
            //string? offset = null;
            //Order? order = null;
            //var response = instance.SearchPartialTransactions(address, recipientAddress, signerPublicKey, height, fromHeight, toHeight, fromTransferAmount, toTransferAmount, type, embedded, transferMosaicId, pageSize, pageNumber, offset, order);
            //Assert.IsType<TransactionPage>(response);
        }

        /// <summary>
        /// Test SearchUnconfirmedTransactions
        /// </summary>
        [Fact]
        public void SearchUnconfirmedTransactionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string? address = null;
            //string? recipientAddress = null;
            //string? signerPublicKey = null;
            //string? height = null;
            //string? fromHeight = null;
            //string? toHeight = null;
            //string? fromTransferAmount = null;
            //string? toTransferAmount = null;
            //List<TransactionTypeEnum>? type = null;
            //bool? embedded = null;
            //string? transferMosaicId = null;
            //int? pageSize = null;
            //int? pageNumber = null;
            //string? offset = null;
            //Order? order = null;
            //var response = instance.SearchUnconfirmedTransactions(address, recipientAddress, signerPublicKey, height, fromHeight, toHeight, fromTransferAmount, toTransferAmount, type, embedded, transferMosaicId, pageSize, pageNumber, offset, order);
            //Assert.IsType<TransactionPage>(response);
        }
    }
}
