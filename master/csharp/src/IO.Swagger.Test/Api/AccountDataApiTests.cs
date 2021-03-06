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
    ///  Class for testing AccountDataApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class AccountDataApiTests
    {
        private AccountDataApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new AccountDataApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of AccountDataApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' AccountDataApi
            //Assert.IsInstanceOfType(typeof(AccountDataApi), instance, "instance is a AccountDataApi");
        }

        
        /// <summary>
        /// Test V1exchangebanksummary
        /// </summary>
        [Test]
        public void V1exchangebanksummaryTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1exchangebanksummary(authorization, accept);
            //Assert.IsInstanceOf<BankSummaryDataResponse> (response, "response is BankSummaryDataResponse");
        }
        
        /// <summary>
        /// Test V1exchangeusercoinfee
        /// </summary>
        [Test]
        public void V1exchangeusercoinfeeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1exchangeusercoinfee(authorization, accept);
            //Assert.IsInstanceOf<DoubleDataResponse> (response, "response is DoubleDataResponse");
        }
        
        /// <summary>
        /// Test V1exchangeuserfiatfee
        /// </summary>
        [Test]
        public void V1exchangeuserfiatfeeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1exchangeuserfiatfee(authorization, accept);
            //Assert.IsInstanceOf<DoubleDataResponse> (response, "response is DoubleDataResponse");
        }
        
        /// <summary>
        /// Test V1netkisearchNetkiName
        /// </summary>
        [Test]
        public void V1netkisearchNetkiNameTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string netkiName = null;
            //string accept = null;
            //var response = instance.V1netkisearchNetkiName(netkiName, accept);
            //Assert.IsInstanceOf<DoubleDataResponse> (response, "response is DoubleDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangekycs
        /// </summary>
        [Test]
        public void V1userexchangekycsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1userexchangekycs(authorization, accept);
            //Assert.IsInstanceOf<KYCDataResponse> (response, "response is KYCDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangereferralcoinpaid
        /// </summary>
        [Test]
        public void V1userexchangereferralcoinpaidTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1userexchangereferralcoinpaid(authorization, accept);
            //Assert.IsInstanceOf<SuccCoinRefDataResponse> (response, "response is SuccCoinRefDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangereferralcoinsuccessful
        /// </summary>
        [Test]
        public void V1userexchangereferralcoinsuccessfulTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1userexchangereferralcoinsuccessful(authorization, accept);
            //Assert.IsInstanceOf<SuccRefDataResponse> (response, "response is SuccRefDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangereferralfiatpaid
        /// </summary>
        [Test]
        public void V1userexchangereferralfiatpaidTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1userexchangereferralfiatpaid(authorization, accept);
            //Assert.IsInstanceOf<SuccCoinRefDataResponse> (response, "response is SuccCoinRefDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangereferrals
        /// </summary>
        [Test]
        public void V1userexchangereferralsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1userexchangereferrals(authorization, accept);
            //Assert.IsInstanceOf<AllRefDataResponse> (response, "response is AllRefDataResponse");
        }
        
        /// <summary>
        /// Test V1userexchangetradesummary
        /// </summary>
        [Test]
        public void V1userexchangetradesummaryTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1userexchangetradesummary(authorization, accept);
            //Assert.IsInstanceOf<TradeSummaryDataResponse> (response, "response is TradeSummaryDataResponse");
        }
        
        /// <summary>
        /// Test V1userlogintokenToken
        /// </summary>
        [Test]
        public void V1userlogintokenTokenTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string token = null;
            //string accept = null;
            //var response = instance.V1userlogintokenToken(token, accept);
            //Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1usersummary
        /// </summary>
        [Test]
        public void V1usersummaryTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1usersummary(authorization, accept);
            //Assert.IsInstanceOf<UserSummaryDataResponse> (response, "response is UserSummaryDataResponse");
        }
        
        /// <summary>
        /// Test V1userwalletsummary
        /// </summary>
        [Test]
        public void V1userwalletsummaryTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string accept = null;
            //var response = instance.V1userwalletsummary(authorization, accept);
            //Assert.IsInstanceOf<WalletSummaryDataResponse> (response, "response is WalletSummaryDataResponse");
        }
        
    }

}
