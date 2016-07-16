# coding: utf-8

"""
    Coinsecure Api Documentation

    To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.

    OpenAPI spec version: 1.0b
    
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

import sys
import os
import re

# python 2 and python 3 compatibility library
from six import iteritems

from ..configuration import Configuration
from ..api_client import ApiClient


class BlockchainToolsApi(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        config = Configuration()
        if api_client:
            self.api_client = api_client
        else:
            if not config.api_client:
                config.api_client = ApiClient()
            self.api_client = config.api_client

    def v1bitcoinsearch_address(self, any, **kwargs):
        """
        Search Bitcoin Blockchain
        Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.v1bitcoinsearch_address(any, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str any:  (required)
        :param str accept: JSON, XML or CSV can be returned (Optional)
        :return: ValidAddressSearchDataResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['any', 'accept']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method v1bitcoinsearch_address" % key
                )
            params[key] = val
        del params['kwargs']

        # verify the required parameter 'any' is set
        if ('any' not in params) or (params['any'] is None):
            raise ValueError("Missing the required parameter `any` when calling `v1bitcoinsearch_address`")


        resource_path = '/v1/bitcoin/search/{any}'.replace('{format}', 'json')
        path_params = {}
        if 'any' in params:
            path_params['any'] = params['any']

        query_params = {}

        header_params = {}
        if 'accept' in params:
            header_params['accept'] = params['accept']

        form_params = []
        local_var_files = {}

        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', 'application/xml', 'application/csv'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type(['application/json'])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, 'GET',
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=local_var_files,
                                            response_type='ValidAddressSearchDataResponse',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response

    def v1bitcoinsearch_txid(self, txid, **kwargs):
        """
        Get Confirmations
        Searches for a Number of Confirmations on a transaction ID.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.v1bitcoinsearch_txid(txid, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str txid:  (required)
        :param str accept: JSON, XML or CSV can be returned (Optional)
        :return: ConfirmDataResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['txid', 'accept']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method v1bitcoinsearch_txid" % key
                )
            params[key] = val
        del params['kwargs']

        # verify the required parameter 'txid' is set
        if ('txid' not in params) or (params['txid'] is None):
            raise ValueError("Missing the required parameter `txid` when calling `v1bitcoinsearch_txid`")


        resource_path = '/v1/bitcoin/search/confirmation/{txid}'.replace('{format}', 'json')
        path_params = {}
        if 'txid' in params:
            path_params['txid'] = params['txid']

        query_params = {}

        header_params = {}
        if 'accept' in params:
            header_params['accept'] = params['accept']

        form_params = []
        local_var_files = {}

        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', 'application/xml', 'application/csv'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type(['application/json'])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, 'GET',
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=local_var_files,
                                            response_type='ConfirmDataResponse',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response