# coding: utf-8

"""
    Coinsecure Api Documentation

    To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.

    OpenAPI spec version: beta
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
"""

from __future__ import absolute_import

import os
import sys
import unittest

import swagger_client
from swagger_client.rest import ApiException
from swagger_client.apis.exchange_bank_actions_api import ExchangeBankActionsApi


class TestExchangeBankActionsApi(unittest.TestCase):
    """ ExchangeBankActionsApi unit test stubs """

    def setUp(self):
        self.api = swagger_client.apis.exchange_bank_actions_api.ExchangeBankActionsApi()

    def tearDown(self):
        pass

    def test_v1userexchangebankcoinwithdrawinitiate(self):
        """
        Test case for v1userexchangebankcoinwithdrawinitiate

        Initiate Bitcoin Withdrawal
        """
        pass

    def test_v1userexchangebankcoinwithdrawnew_verifycode(self):
        """
        Test case for v1userexchangebankcoinwithdrawnew_verifycode

        Gets a Verification Code.
        """
        pass

    def test_v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id(self):
        """
        Test case for v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id

        Cancel Bitcoin Withdrawal
        """
        pass

    def test_v1userexchangebankcoinwithdrawverify(self):
        """
        Test case for v1userexchangebankcoinwithdrawverify

        Verify Bitcoin Withdrawal
        """
        pass

    def test_v1userexchangebankfiataccountnew(self):
        """
        Test case for v1userexchangebankfiataccountnew

        New Bank Link
        """
        pass

    def test_v1userexchangebankfiatdepositcancel_deposit_id(self):
        """
        Test case for v1userexchangebankfiatdepositcancel_deposit_id

        Cancel Unverified Exchange Fiat Deposit
        """
        pass

    def test_v1userexchangebankfiatdepositnew(self):
        """
        Test case for v1userexchangebankfiatdepositnew

        New Exchange Fiat Deposit
        """
        pass

    def test_v1userexchangebankfiatwithdrawinitiate(self):
        """
        Test case for v1userexchangebankfiatwithdrawinitiate

        Initiate Fiat Withdrawal
        """
        pass

    def test_v1userexchangebankfiatwithdrawnew_verifycode(self):
        """
        Test case for v1userexchangebankfiatwithdrawnew_verifycode

        Gets a Fiat Verification Code.
        """
        pass

    def test_v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id(self):
        """
        Test case for v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id

        Cancel Fiat Withdrawal
        """
        pass

    def test_v1userexchangebankfiatwithdrawverify(self):
        """
        Test case for v1userexchangebankfiatwithdrawverify

        Verify Fiat Withdrawal
        """
        pass


if __name__ == '__main__':
    unittest.main()
