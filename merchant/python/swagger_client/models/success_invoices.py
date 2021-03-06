# coding: utf-8

"""
    coinMerchant Api Documentation

    To generate an API key, please visit <a href='https://pay.coinsecure.in/payment-tools/api' target='_new' class='homeapi'>https://pay.coinsecure.in/payment-tools/api</a>.<br>Guidelines for use can be accessed at <a href='https://pay.coinsecure.in/api/guidelines'>https://pay.coinsecure.in/api/guidelines</a>.

    OpenAPI spec version: 1.0B
    
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

from pprint import pformat
from six import iteritems
import re


class SuccessInvoices(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self):
        """
        SuccessInvoices - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'success': 'bool',
            'message': 'list[Invoice]',
            'time': 'datetime',
            'method': 'str',
            'title': 'str'
        }

        self.attribute_map = {
            'success': 'success',
            'message': 'message',
            'time': 'time',
            'method': 'method',
            'title': 'title'
        }

        self._success = False
        self._message = None
        self._time = None
        self._method = None
        self._title = None

    @property
    def success(self):
        """
        Gets the success of this SuccessInvoices.


        :return: The success of this SuccessInvoices.
        :rtype: bool
        """
        return self._success

    @success.setter
    def success(self, success):
        """
        Sets the success of this SuccessInvoices.


        :param success: The success of this SuccessInvoices.
        :type: bool
        """
        
        self._success = success

    @property
    def message(self):
        """
        Gets the message of this SuccessInvoices.


        :return: The message of this SuccessInvoices.
        :rtype: list[Invoice]
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this SuccessInvoices.


        :param message: The message of this SuccessInvoices.
        :type: list[Invoice]
        """
        
        self._message = message

    @property
    def time(self):
        """
        Gets the time of this SuccessInvoices.


        :return: The time of this SuccessInvoices.
        :rtype: datetime
        """
        return self._time

    @time.setter
    def time(self, time):
        """
        Sets the time of this SuccessInvoices.


        :param time: The time of this SuccessInvoices.
        :type: datetime
        """
        
        self._time = time

    @property
    def method(self):
        """
        Gets the method of this SuccessInvoices.


        :return: The method of this SuccessInvoices.
        :rtype: str
        """
        return self._method

    @method.setter
    def method(self, method):
        """
        Sets the method of this SuccessInvoices.


        :param method: The method of this SuccessInvoices.
        :type: str
        """
        
        self._method = method

    @property
    def title(self):
        """
        Gets the title of this SuccessInvoices.


        :return: The title of this SuccessInvoices.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """
        Sets the title of this SuccessInvoices.


        :param title: The title of this SuccessInvoices.
        :type: str
        """
        
        self._title = title

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other

