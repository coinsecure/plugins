/* 
 * Coinsecure Api Documentation
 *
 * To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.
 *
 * OpenAPI spec version: 1.0b
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
    ///  Class for testing AccountActionsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class AccountActionsApiTests
    {
        private AccountActionsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new AccountActionsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of AccountActionsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            Assert.IsInstanceOf<AccountActionsApi> (instance, "instance is a AccountActionsApi");
        }

        
        /// <summary>
        /// Test V1login
        /// </summary>
        [Test]
        public void V1loginTest()
        {
            // TODO: add unit test for the method 'V1login'
            LoginFormNew body = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1login(body, accept);
            Assert.IsInstanceOf<StandardLoginResultData> (response, "response is StandardLoginResultData");
        }
        
        /// <summary>
        /// Test V1logininitiate
        /// </summary>
        [Test]
        public void V1logininitiateTest()
        {
            // TODO: add unit test for the method 'V1logininitiate'
            LoginId body = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1logininitiate(body, accept);
            Assert.IsInstanceOf<StandardInitiateLoginResultData> (response, "response is StandardInitiateLoginResultData");
        }
        
        /// <summary>
        /// Test V1loginpasswordforgot
        /// </summary>
        [Test]
        public void V1loginpasswordforgotTest()
        {
            // TODO: add unit test for the method 'V1loginpasswordforgot'
            Email body = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1loginpasswordforgot(body, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1signup
        /// </summary>
        [Test]
        public void V1signupTest()
        {
            // TODO: add unit test for the method 'V1signup'
            SignupForm body = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1signup(body, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1userbankotpNumber
        /// </summary>
        [Test]
        public void V1userbankotpNumberTest()
        {
            // TODO: add unit test for the method 'V1userbankotpNumber'
            string number = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1userbankotpNumber(number, authorization, accept);
            Assert.IsInstanceOf<StandardInitiateLoginResultData> (response, "response is StandardInitiateLoginResultData");
        }
        
        /// <summary>
        /// Test V1userexchangekyc
        /// </summary>
        [Test]
        public void V1userexchangekycTest()
        {
            // TODO: add unit test for the method 'V1userexchangekyc'
            string panNumber = null; // TODO: replace null with proper value
            string acctNick = null; // TODO: replace null with proper value
            string name = null; // TODO: replace null with proper value
            string ban = null; // TODO: replace null with proper value
            string ifsc = null; // TODO: replace null with proper value
            string acctType = null; // TODO: replace null with proper value
            string banType = null; // TODO: replace null with proper value
            string phone = null; // TODO: replace null with proper value
            string otp = null; // TODO: replace null with proper value
            System.IO.Stream file = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string message = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1userexchangekyc(panNumber, acctNick, name, ban, ifsc, acctType, banType, phone, otp, file, authorization, message, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1usergcmCode
        /// </summary>
        [Test]
        public void V1usergcmCodeTest()
        {
            // TODO: add unit test for the method 'V1usergcmCode'
            string code = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1usergcmCode(code, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1userkycotpNumber
        /// </summary>
        [Test]
        public void V1userkycotpNumberTest()
        {
            // TODO: add unit test for the method 'V1userkycotpNumber'
            string number = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1userkycotpNumber(number, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1userlogout
        /// </summary>
        [Test]
        public void V1userlogoutTest()
        {
            // TODO: add unit test for the method 'V1userlogout'
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1userlogout(authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1usernetkicreate
        /// </summary>
        [Test]
        public void V1usernetkicreateTest()
        {
            // TODO: add unit test for the method 'V1usernetkicreate'
            NetkiNameAddress body = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1usernetkicreate(body, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1usernetkiupdate
        /// </summary>
        [Test]
        public void V1usernetkiupdateTest()
        {
            // TODO: add unit test for the method 'V1usernetkiupdate'
            Address body = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1usernetkiupdate(body, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1userprofileimagedelete
        /// </summary>
        [Test]
        public void V1userprofileimagedeleteTest()
        {
            // TODO: add unit test for the method 'V1userprofileimagedelete'
            NetkiName body = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1userprofileimagedelete(body, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1userprofileimageupdate
        /// </summary>
        [Test]
        public void V1userprofileimageupdateTest()
        {
            // TODO: add unit test for the method 'V1userprofileimageupdate'
            string netkiName = null; // TODO: replace null with proper value
            bool? isPublic = null; // TODO: replace null with proper value
            System.IO.Stream file = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1userprofileimageupdate(netkiName, isPublic, file, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1userprofilephone
        /// </summary>
        [Test]
        public void V1userprofilephoneTest()
        {
            // TODO: add unit test for the method 'V1userprofilephone'
            NumberOtp body = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1userprofilephone(body, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1userprofilephoneNumber
        /// </summary>
        [Test]
        public void V1userprofilephoneNumberTest()
        {
            // TODO: add unit test for the method 'V1userprofilephoneNumber'
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1userprofilephoneNumber(authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1userprofilephoneotpNumber
        /// </summary>
        [Test]
        public void V1userprofilephoneotpNumberTest()
        {
            // TODO: add unit test for the method 'V1userprofilephoneotpNumber'
            string number = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1userprofilephoneotpNumber(number, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
    }

}