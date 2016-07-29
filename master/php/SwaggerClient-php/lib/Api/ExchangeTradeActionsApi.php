<?php
/**
 * ExchangeTradeActionsApi
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
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

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Api;

use \Swagger\Client\Configuration;
use \Swagger\Client\ApiClient;
use \Swagger\Client\ApiException;
use \Swagger\Client\ObjectSerializer;

/**
 * ExchangeTradeActionsApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class ExchangeTradeActionsApi
{

    /**
     * API Client
     *
     * @var \Swagger\Client\ApiClient instance of the ApiClient
     */
    protected $apiClient;

    /**
     * Constructor
     *
     * @param \Swagger\Client\ApiClient|null $apiClient The api client to use
     */
    public function __construct(\Swagger\Client\ApiClient $apiClient = null)
    {
        if ($apiClient == null) {
            $apiClient = new ApiClient();
            $apiClient->getConfig()->setHost('https://api.coinsecure.in');
        }

        $this->apiClient = $apiClient;
    }

    /**
     * Get API client
     *
     * @return \Swagger\Client\ApiClient get the API client
     */
    public function getApiClient()
    {
        return $this->apiClient;
    }

    /**
     * Set the API client
     *
     * @param \Swagger\Client\ApiClient $apiClient set the API client
     *
     * @return ExchangeTradeActionsApi
     */
    public function setApiClient(\Swagger\Client\ApiClient $apiClient)
    {
        $this->apiClient = $apiClient;
        return $this;
    }

    /**
     * Operation v1userexchangeaskcancel
     *
     * Cancel Open Sell Order.
     *
     * @param \Swagger\Client\Model\AskID $body Please send the form with valid inputs. (required)
     * @param string $authorization Enter a valid Api Key. (optional)
     * @param string $accept JSON, XML or CSV can be returned (Optional) (optional)
     *
     * @return \Swagger\Client\Model\SuccessResult
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function v1userexchangeaskcancel($body, $authorization = null, $accept = null)
    {
        list($response) = $this->v1userexchangeaskcancelWithHttpInfo($body, $authorization, $accept);
        return $response;
    }


    /**
     * Operation v1userexchangeaskcancelWithHttpInfo
     *
     * Cancel Open Sell Order.
     *
     * @param \Swagger\Client\Model\AskID $body Please send the form with valid inputs. (required)
     * @param string $authorization Enter a valid Api Key. (optional)
     * @param string $accept JSON, XML or CSV can be returned (Optional) (optional)
     *
     * @return Array of \Swagger\Client\Model\SuccessResult, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function v1userexchangeaskcancelWithHttpInfo($body, $authorization = null, $accept = null)
    {
        
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling v1userexchangeaskcancel');
        }

        // parse inputs
        $resourcePath = "/v1/user/exchange/ask/cancel";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/json', 'application/xml', 'application/csv'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array('application/json'));

        
        // header params
        if ($authorization !== null) {
            $headerParams['Authorization'] = $this->apiClient->getSerializer()->toHeaderValue($authorization);
        }// header params
        if ($accept !== null) {
            $headerParams['accept'] = $this->apiClient->getSerializer()->toHeaderValue($accept);
        }
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // body params
        $_tempBody = null;
        if (isset($body)) {
            $_tempBody = $body;
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'DELETE',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\SuccessResult'
            );
            if (!$response) {
                return array(null, $statusCode, $httpHeader);
            }

            return array($this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\SuccessResult', $httpHeader), $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\SuccessResult', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 400:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\FailResult', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }
    /**
     * Operation v1userexchangeasknew
     *
     * BTC Sell Order.
     *
     * @param \Swagger\Client\Model\RateVolData $body Please send the form with valid inputs. (required)
     * @param string $authorization Enter a valid Api Key. (optional)
     * @param string $accept JSON, XML or CSV can be returned (Optional) (optional)
     *
     * @return \Swagger\Client\Model\SuccessResultList
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function v1userexchangeasknew($body, $authorization = null, $accept = null)
    {
        list($response) = $this->v1userexchangeasknewWithHttpInfo($body, $authorization, $accept);
        return $response;
    }


    /**
     * Operation v1userexchangeasknewWithHttpInfo
     *
     * BTC Sell Order.
     *
     * @param \Swagger\Client\Model\RateVolData $body Please send the form with valid inputs. (required)
     * @param string $authorization Enter a valid Api Key. (optional)
     * @param string $accept JSON, XML or CSV can be returned (Optional) (optional)
     *
     * @return Array of \Swagger\Client\Model\SuccessResultList, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function v1userexchangeasknewWithHttpInfo($body, $authorization = null, $accept = null)
    {
        
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling v1userexchangeasknew');
        }

        // parse inputs
        $resourcePath = "/v1/user/exchange/ask/new";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/json', 'application/xml', 'application/csv'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array('application/json'));

        
        // header params
        if ($authorization !== null) {
            $headerParams['Authorization'] = $this->apiClient->getSerializer()->toHeaderValue($authorization);
        }// header params
        if ($accept !== null) {
            $headerParams['accept'] = $this->apiClient->getSerializer()->toHeaderValue($accept);
        }
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // body params
        $_tempBody = null;
        if (isset($body)) {
            $_tempBody = $body;
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'PUT',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\SuccessResultList'
            );
            if (!$response) {
                return array(null, $statusCode, $httpHeader);
            }

            return array($this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\SuccessResultList', $httpHeader), $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\SuccessResultList', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 400:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\FailResult', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }
    /**
     * Operation v1userexchangebidcancel
     *
     * Cancel Open Buy Order.
     *
     * @param \Swagger\Client\Model\BidID $body Please send the form with valid inputs. (required)
     * @param string $authorization Enter a valid Api Key. (optional)
     * @param string $accept JSON, XML or CSV can be returned (Optional) (optional)
     *
     * @return \Swagger\Client\Model\SuccessResult
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function v1userexchangebidcancel($body, $authorization = null, $accept = null)
    {
        list($response) = $this->v1userexchangebidcancelWithHttpInfo($body, $authorization, $accept);
        return $response;
    }


    /**
     * Operation v1userexchangebidcancelWithHttpInfo
     *
     * Cancel Open Buy Order.
     *
     * @param \Swagger\Client\Model\BidID $body Please send the form with valid inputs. (required)
     * @param string $authorization Enter a valid Api Key. (optional)
     * @param string $accept JSON, XML or CSV can be returned (Optional) (optional)
     *
     * @return Array of \Swagger\Client\Model\SuccessResult, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function v1userexchangebidcancelWithHttpInfo($body, $authorization = null, $accept = null)
    {
        
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling v1userexchangebidcancel');
        }

        // parse inputs
        $resourcePath = "/v1/user/exchange/bid/cancel";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/json', 'application/xml', 'application/csv'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array('application/json'));

        
        // header params
        if ($authorization !== null) {
            $headerParams['Authorization'] = $this->apiClient->getSerializer()->toHeaderValue($authorization);
        }// header params
        if ($accept !== null) {
            $headerParams['accept'] = $this->apiClient->getSerializer()->toHeaderValue($accept);
        }
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // body params
        $_tempBody = null;
        if (isset($body)) {
            $_tempBody = $body;
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'DELETE',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\SuccessResult'
            );
            if (!$response) {
                return array(null, $statusCode, $httpHeader);
            }

            return array($this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\SuccessResult', $httpHeader), $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\SuccessResult', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 400:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\FailResult', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }
    /**
     * Operation v1userexchangebidnew
     *
     * BTC Buy Order.
     *
     * @param \Swagger\Client\Model\RateVolData $body Please send the form with valid inputs. (required)
     * @param string $authorization Enter a valid Api Key. (optional)
     * @param string $accept JSON, XML or CSV can be returned (Optional) (optional)
     *
     * @return \Swagger\Client\Model\SuccessResultList
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function v1userexchangebidnew($body, $authorization = null, $accept = null)
    {
        list($response) = $this->v1userexchangebidnewWithHttpInfo($body, $authorization, $accept);
        return $response;
    }


    /**
     * Operation v1userexchangebidnewWithHttpInfo
     *
     * BTC Buy Order.
     *
     * @param \Swagger\Client\Model\RateVolData $body Please send the form with valid inputs. (required)
     * @param string $authorization Enter a valid Api Key. (optional)
     * @param string $accept JSON, XML or CSV can be returned (Optional) (optional)
     *
     * @return Array of \Swagger\Client\Model\SuccessResultList, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function v1userexchangebidnewWithHttpInfo($body, $authorization = null, $accept = null)
    {
        
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling v1userexchangebidnew');
        }

        // parse inputs
        $resourcePath = "/v1/user/exchange/bid/new";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/json', 'application/xml', 'application/csv'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array('application/json'));

        
        // header params
        if ($authorization !== null) {
            $headerParams['Authorization'] = $this->apiClient->getSerializer()->toHeaderValue($authorization);
        }// header params
        if ($accept !== null) {
            $headerParams['accept'] = $this->apiClient->getSerializer()->toHeaderValue($accept);
        }
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // body params
        $_tempBody = null;
        if (isset($body)) {
            $_tempBody = $body;
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'PUT',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\SuccessResultList'
            );
            if (!$response) {
                return array(null, $statusCode, $httpHeader);
            }

            return array($this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\SuccessResultList', $httpHeader), $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\SuccessResultList', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 400:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\FailResult', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }
    /**
     * Operation v1userexchangeinstantbuy
     *
     * Instantly Buy BTC.
     *
     * @param \Swagger\Client\Model\MinFiat $body Please send the form with valid inputs. (required)
     * @param string $authorization Enter a valid Api Key. (optional)
     * @param string $accept JSON, XML or CSV can be returned (Optional) (optional)
     *
     * @return \Swagger\Client\Model\SuccessResultList
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function v1userexchangeinstantbuy($body, $authorization = null, $accept = null)
    {
        list($response) = $this->v1userexchangeinstantbuyWithHttpInfo($body, $authorization, $accept);
        return $response;
    }


    /**
     * Operation v1userexchangeinstantbuyWithHttpInfo
     *
     * Instantly Buy BTC.
     *
     * @param \Swagger\Client\Model\MinFiat $body Please send the form with valid inputs. (required)
     * @param string $authorization Enter a valid Api Key. (optional)
     * @param string $accept JSON, XML or CSV can be returned (Optional) (optional)
     *
     * @return Array of \Swagger\Client\Model\SuccessResultList, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function v1userexchangeinstantbuyWithHttpInfo($body, $authorization = null, $accept = null)
    {
        
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling v1userexchangeinstantbuy');
        }

        // parse inputs
        $resourcePath = "/v1/user/exchange/instant/buy";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/json', 'application/xml', 'application/csv'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array('application/json'));

        
        // header params
        if ($authorization !== null) {
            $headerParams['Authorization'] = $this->apiClient->getSerializer()->toHeaderValue($authorization);
        }// header params
        if ($accept !== null) {
            $headerParams['accept'] = $this->apiClient->getSerializer()->toHeaderValue($accept);
        }
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // body params
        $_tempBody = null;
        if (isset($body)) {
            $_tempBody = $body;
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'PUT',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\SuccessResultList'
            );
            if (!$response) {
                return array(null, $statusCode, $httpHeader);
            }

            return array($this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\SuccessResultList', $httpHeader), $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\SuccessResultList', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 400:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\FailResult', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }
    /**
     * Operation v1userexchangeinstantsell
     *
     * Instantly Sell BTC.
     *
     * @param \Swagger\Client\Model\MaxVol $body Please send the form with valid inputs. (required)
     * @param string $authorization Enter a valid Api Key. (optional)
     * @param string $accept JSON, XML or CSV can be returned (Optional) (optional)
     *
     * @return \Swagger\Client\Model\SuccessResultList
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function v1userexchangeinstantsell($body, $authorization = null, $accept = null)
    {
        list($response) = $this->v1userexchangeinstantsellWithHttpInfo($body, $authorization, $accept);
        return $response;
    }


    /**
     * Operation v1userexchangeinstantsellWithHttpInfo
     *
     * Instantly Sell BTC.
     *
     * @param \Swagger\Client\Model\MaxVol $body Please send the form with valid inputs. (required)
     * @param string $authorization Enter a valid Api Key. (optional)
     * @param string $accept JSON, XML or CSV can be returned (Optional) (optional)
     *
     * @return Array of \Swagger\Client\Model\SuccessResultList, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function v1userexchangeinstantsellWithHttpInfo($body, $authorization = null, $accept = null)
    {
        
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling v1userexchangeinstantsell');
        }

        // parse inputs
        $resourcePath = "/v1/user/exchange/instant/sell";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/json', 'application/xml', 'application/csv'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array('application/json'));

        
        // header params
        if ($authorization !== null) {
            $headerParams['Authorization'] = $this->apiClient->getSerializer()->toHeaderValue($authorization);
        }// header params
        if ($accept !== null) {
            $headerParams['accept'] = $this->apiClient->getSerializer()->toHeaderValue($accept);
        }
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // body params
        $_tempBody = null;
        if (isset($body)) {
            $_tempBody = $body;
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'PUT',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\SuccessResultList'
            );
            if (!$response) {
                return array(null, $statusCode, $httpHeader);
            }

            return array($this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\SuccessResultList', $httpHeader), $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\SuccessResultList', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 400:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\FailResult', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }
}
