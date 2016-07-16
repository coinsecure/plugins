/* 
 * coinMerchant Api Documentation
 *
 * To generate an API key, please visit <a href='https://pay.coinsecure.in/payment-tools/api' target='_new' class='homeapi'>https://pay.coinsecure.in/payment-tools/api</a>.<br>Guidelines for use can be accessed at <a href='https://pay.coinsecure.in/api/guidelines'>https://pay.coinsecure.in/api/guidelines</a>.
 *
 * OpenAPI spec version: 1.0B
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing Invoice
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class InvoiceTests
    {
        private Invoice instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new Invoice();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of Invoice
        /// </summary>
        [Test]
        public void InvoiceInstanceTest()
        {
            Assert.IsInstanceOf<Invoice> (instance, "instance is a Invoice");
        }

        /// <summary>
        /// Test the property 'Address'
        /// </summary>
        [Test]
        public void AddressTest()
        {
            // TODO: unit test for the property 'Address'
        }
        /// <summary>
        /// Test the property 'BuyerEmail'
        /// </summary>
        [Test]
        public void BuyerEmailTest()
        {
            // TODO: unit test for the property 'BuyerEmail'
        }
        /// <summary>
        /// Test the property 'CancelURL'
        /// </summary>
        [Test]
        public void CancelURLTest()
        {
            // TODO: unit test for the property 'CancelURL'
        }
        /// <summary>
        /// Test the property 'ExpireTime'
        /// </summary>
        [Test]
        public void ExpireTimeTest()
        {
            // TODO: unit test for the property 'ExpireTime'
        }
        /// <summary>
        /// Test the property 'SuccURL'
        /// </summary>
        [Test]
        public void SuccURLTest()
        {
            // TODO: unit test for the property 'SuccURL'
        }
        /// <summary>
        /// Test the property 'InvoiceID'
        /// </summary>
        [Test]
        public void InvoiceIDTest()
        {
            // TODO: unit test for the property 'InvoiceID'
        }
        /// <summary>
        /// Test the property 'BitpayInvoiceID'
        /// </summary>
        [Test]
        public void BitpayInvoiceIDTest()
        {
            // TODO: unit test for the property 'BitpayInvoiceID'
        }
        /// <summary>
        /// Test the property 'NotifyEmail'
        /// </summary>
        [Test]
        public void NotifyEmailTest()
        {
            // TODO: unit test for the property 'NotifyEmail'
        }
        /// <summary>
        /// Test the property 'Status'
        /// </summary>
        [Test]
        public void StatusTest()
        {
            // TODO: unit test for the property 'Status'
        }
        /// <summary>
        /// Test the property 'Time'
        /// </summary>
        [Test]
        public void TimeTest()
        {
            // TODO: unit test for the property 'Time'
        }
        /// <summary>
        /// Test the property 'FiatCents'
        /// </summary>
        [Test]
        public void FiatCentsTest()
        {
            // TODO: unit test for the property 'FiatCents'
        }
        /// <summary>
        /// Test the property 'Satoshis'
        /// </summary>
        [Test]
        public void SatoshisTest()
        {
            // TODO: unit test for the property 'Satoshis'
        }
        /// <summary>
        /// Test the property 'Info'
        /// </summary>
        [Test]
        public void InfoTest()
        {
            // TODO: unit test for the property 'Info'
        }

    }

}