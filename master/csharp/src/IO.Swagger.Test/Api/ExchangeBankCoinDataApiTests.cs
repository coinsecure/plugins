/* 
 * Coinsecure Api Documentation
 *
 * To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.
 *
 * OpenAPI spec version: beta
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

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing ExchangeBankCoinDataApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ExchangeBankCoinDataApiTests
    {
        private ExchangeBankCoinDataApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ExchangeBankCoinDataApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ExchangeBankCoinDataApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ExchangeBankCoinDataApi
            //Assert.IsInstanceOfType(typeof(ExchangeBankCoinDataApi), instance, "instance is a ExchangeBankCoinDataApi");
        }

        
        /// <summary>
        /// Test V1userexchangebankcoinaddresses
        /// </summary>
        [Test]
        public void V1userexchangebankcoinaddressesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1userexchangebankcoinaddresses(authorization, accept);
            //Assert.IsInstanceOf<TradeAddressDataResponse> (response, "response is TradeAddressDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangebankcoinbalanceavailable
        /// </summary>
        [Test]
        public void V1userexchangebankcoinbalanceavailableTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1userexchangebankcoinbalanceavailable(authorization, accept);
            //Assert.IsInstanceOf<VolDataResponse> (response, "response is VolDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangebankcoinbalancepending
        /// </summary>
        [Test]
        public void V1userexchangebankcoinbalancependingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1userexchangebankcoinbalancepending(authorization, accept);
            //Assert.IsInstanceOf<VolDataResponse> (response, "response is VolDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangebankcoinbalancetotal
        /// </summary>
        [Test]
        public void V1userexchangebankcoinbalancetotalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1userexchangebankcoinbalancetotal(authorization, accept);
            //Assert.IsInstanceOf<VolDataResponse> (response, "response is VolDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangebankcoindepositcancelled
        /// </summary>
        [Test]
        public void V1userexchangebankcoindepositcancelledTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //long? from = null;
            //long? to = null;
            //int? max = null;
            //long? offset = null;
            //string accept = null;
            //var response = instance.V1userexchangebankcoindepositcancelled(authorization, from, to, max, offset, accept);
            //Assert.IsInstanceOf<CoinDepDataResponse> (response, "response is CoinDepDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangebankcoindepositunverified
        /// </summary>
        [Test]
        public void V1userexchangebankcoindepositunverifiedTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //long? from = null;
            //long? to = null;
            //int? max = null;
            //long? offset = null;
            //string accept = null;
            //var response = instance.V1userexchangebankcoindepositunverified(authorization, from, to, max, offset, accept);
            //Assert.IsInstanceOf<CoinDepDataResponse> (response, "response is CoinDepDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangebankcoindepositverified
        /// </summary>
        [Test]
        public void V1userexchangebankcoindepositverifiedTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //long? from = null;
            //long? to = null;
            //int? max = null;
            //long? offset = null;
            //string accept = null;
            //var response = instance.V1userexchangebankcoindepositverified(authorization, from, to, max, offset, accept);
            //Assert.IsInstanceOf<CoinDepDataResponse> (response, "response is CoinDepDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangebankcoinwithdrawcancelled
        /// </summary>
        [Test]
        public void V1userexchangebankcoinwithdrawcancelledTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //long? from = null;
            //long? to = null;
            //int? max = null;
            //long? offset = null;
            //string accept = null;
            //var response = instance.V1userexchangebankcoinwithdrawcancelled(authorization, from, to, max, offset, accept);
            //Assert.IsInstanceOf<TradeCoinWithdrawDataResponse> (response, "response is TradeCoinWithdrawDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangebankcoinwithdrawcompleted
        /// </summary>
        [Test]
        public void V1userexchangebankcoinwithdrawcompletedTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //long? from = null;
            //long? to = null;
            //int? max = null;
            //long? offset = null;
            //string accept = null;
            //var response = instance.V1userexchangebankcoinwithdrawcompleted(authorization, from, to, max, offset, accept);
            //Assert.IsInstanceOf<TradeCoinWithdrawDataResponse> (response, "response is TradeCoinWithdrawDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangebankcoinwithdrawunverified
        /// </summary>
        [Test]
        public void V1userexchangebankcoinwithdrawunverifiedTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //long? from = null;
            //long? to = null;
            //int? max = null;
            //long? offset = null;
            //string accept = null;
            //var response = instance.V1userexchangebankcoinwithdrawunverified(authorization, from, to, max, offset, accept);
            //Assert.IsInstanceOf<TradeCoinWithdrawDataResponse> (response, "response is TradeCoinWithdrawDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangebankcoinwithdrawverified
        /// </summary>
        [Test]
        public void V1userexchangebankcoinwithdrawverifiedTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //long? from = null;
            //long? to = null;
            //int? max = null;
            //long? offset = null;
            //string accept = null;
            //var response = instance.V1userexchangebankcoinwithdrawverified(authorization, from, to, max, offset, accept);
            //Assert.IsInstanceOf<TradeCoinWithdrawDataResponse> (response, "response is TradeCoinWithdrawDataResponse");
        }
        
    }

}
