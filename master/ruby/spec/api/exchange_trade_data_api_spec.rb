=begin
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

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::ExchangeTradeDataApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ExchangeTradeDataApi' do
  before do
    # run before each test
    @instance = SwaggerClient::ExchangeTradeDataApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ExchangeTradeDataApi' do
    it 'should create an instact of ExchangeTradeDataApi' do
      expect(@instance).to be_instance_of(SwaggerClient::ExchangeTradeDataApi)
    end
  end

  # unit tests for v1exchangeasklow
  # Lowest Ask
  # Returns the Lowest Ask Rate in Json. The Amount is in Paisa.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [RateDataResponse]
  describe 'v1exchangeasklow test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1exchangeaskorders
  # All Sell Orders
  # Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [RateVolDataResponse]
  describe 'v1exchangeaskorders test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1exchangebidhigh
  # Returns the Highest Bid in the Order Book
  # Highest Bid.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [RateDataResponse]
  describe 'v1exchangebidhigh test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1exchangebidorders
  # All Buy Orders
  # Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [RateVolDataResponse]
  describe 'v1exchangebidorders test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1exchangelast_trade
  # Last Trade
  # Returns a summary of data from the Exchange.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [LastTradeDataResponse]
  describe 'v1exchangelast_trade test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1exchangemax24_hr
  # Max 24 Hour Rate
  # Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [RateDiffDataResponse]
  describe 'v1exchangemax24_hr test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1exchangemin24_hr
  # Min 24 Hour Rate
  # Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [RateDiffDataResponse]
  describe 'v1exchangemin24_hr test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1exchangeticker
  # Exchange Ticker
  # Returns a summary of data from the Exchange.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [StandardTickerResultData]
  describe 'v1exchangeticker test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangeaskcancelled
  # Cancelled User Sell Orders
  # Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [OrderDataResponse]
  describe 'v1userexchangeaskcancelled test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangeaskcompleted
  # Completed User Sell Orders
  # Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  # @option opts [Integer] :offset Offset defaults to 0 if input is invalid. (Optional)
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [OrderDataResponse]
  describe 'v1userexchangeaskcompleted test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangeaskpending
  # Pending User Sell Orders
  # Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [OrderDataResponse]
  describe 'v1userexchangeaskpending test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebidcancelled
  # Cancelled User Buy Orders
  # Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [OrderDataResponse]
  describe 'v1userexchangebidcancelled test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebidcompleted
  # Completed User Buy Orders
  # Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [OrderDataResponse]
  describe 'v1userexchangebidcompleted test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebidpending
  # Pending User Buy Orders
  # Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [OrderDataResponse]
  describe 'v1userexchangebidpending test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end