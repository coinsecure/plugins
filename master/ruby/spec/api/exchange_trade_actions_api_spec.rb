=begin
#Coinsecure Api Documentation

#To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.

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

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::ExchangeTradeActionsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ExchangeTradeActionsApi' do
  before do
    # run before each test
    @instance = SwaggerClient::ExchangeTradeActionsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ExchangeTradeActionsApi' do
    it 'should create an instact of ExchangeTradeActionsApi' do
      expect(@instance).to be_instance_of(SwaggerClient::ExchangeTradeActionsApi)
    end
  end

  # unit tests for v1userexchangeaskcancel_order_id
  # Cancel Open Sell Order
  # Cancels a BTC Sell Order. Orders can only be cancelled if they are in a pending state.
  # @param order_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :authorization Enter a valid Api Key.
  # @return [SuccessCancelDataResponse]
  describe 'v1userexchangeaskcancel_order_id test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangeasknew
  # BTC Sell Order
  # Creates a BTC Sell Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.
  # @param body Please send the form with valid inputs.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :authorization Enter a valid Api Key.
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [SuccessOrderDataResponse]
  describe 'v1userexchangeasknew test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebidcancel_order_id
  # Cancel Open Buy Order
  # Cancels a BTC Buy Order. Orders can only be cancelled if they are in a pending state.
  # @param order_id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :authorization Enter a valid Api Key.
  # @return [SuccessCancelDataResponse]
  describe 'v1userexchangebidcancel_order_id test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebidnew
  # BTC Buy Order
  # Creates a BTC Buy Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.
  # @param body Please send the form with valid inputs.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :authorization Enter a valid Api Key.
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [SuccessOrderDataResponse]
  describe 'v1userexchangebidnew test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangeinstantbuy
  # Instantly Buy BTC
  # Instantly buys BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.
  # @param body Please send the form with valid inputs.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :authorization Enter a valid Api Key.
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [SuccessOrderDataResponse]
  describe 'v1userexchangeinstantbuy test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangeinstantsell
  # Instantly Sell BTC
  # Instantly sells BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.
  # @param body Please send the form with valid inputs.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :authorization Enter a valid Api Key.
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [SuccessOrderDataResponse]
  describe 'v1userexchangeinstantsell test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
