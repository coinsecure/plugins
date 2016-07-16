<?php
/**
 * WalletSummaryData
 *
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

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * WalletSummaryData Class Doc Comment
 *
 * @category    Class
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class WalletSummaryData implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'WalletSummaryData';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = array(
        'wallet_confirmed_balance' => 'int',
        'wallet_uncofirmed_balance' => 'int',
        'has_wallet_netki' => 'bool',
        'wallet_netki' => 'string',
        'wallet_netki_address' => 'string',
        'wallet_netki_wallet_id' => 'string'
    );

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = array(
        'wallet_confirmed_balance' => 'walletConfirmedBalance',
        'wallet_uncofirmed_balance' => 'walletUncofirmedBalance',
        'has_wallet_netki' => 'hasWalletNetki',
        'wallet_netki' => 'walletNetki',
        'wallet_netki_address' => 'walletNetkiAddress',
        'wallet_netki_wallet_id' => 'walletNetkiWalletId'
    );

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = array(
        'wallet_confirmed_balance' => 'setWalletConfirmedBalance',
        'wallet_uncofirmed_balance' => 'setWalletUncofirmedBalance',
        'has_wallet_netki' => 'setHasWalletNetki',
        'wallet_netki' => 'setWalletNetki',
        'wallet_netki_address' => 'setWalletNetkiAddress',
        'wallet_netki_wallet_id' => 'setWalletNetkiWalletId'
    );

    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = array(
        'wallet_confirmed_balance' => 'getWalletConfirmedBalance',
        'wallet_uncofirmed_balance' => 'getWalletUncofirmedBalance',
        'has_wallet_netki' => 'getHasWalletNetki',
        'wallet_netki' => 'getWalletNetki',
        'wallet_netki_address' => 'getWalletNetkiAddress',
        'wallet_netki_wallet_id' => 'getWalletNetkiWalletId'
    );

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = array();

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['wallet_confirmed_balance'] = isset($data['wallet_confirmed_balance']) ? $data['wallet_confirmed_balance'] : null;
        $this->container['wallet_uncofirmed_balance'] = isset($data['wallet_uncofirmed_balance']) ? $data['wallet_uncofirmed_balance'] : null;
        $this->container['has_wallet_netki'] = isset($data['has_wallet_netki']) ? $data['has_wallet_netki'] : false;
        $this->container['wallet_netki'] = isset($data['wallet_netki']) ? $data['wallet_netki'] : null;
        $this->container['wallet_netki_address'] = isset($data['wallet_netki_address']) ? $data['wallet_netki_address'] : null;
        $this->container['wallet_netki_wallet_id'] = isset($data['wallet_netki_wallet_id']) ? $data['wallet_netki_wallet_id'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = array();
        if ($this->container['wallet_confirmed_balance'] === null) {
            $invalid_properties[] = "'wallet_confirmed_balance' can't be null";
        }
        if ($this->container['wallet_uncofirmed_balance'] === null) {
            $invalid_properties[] = "'wallet_uncofirmed_balance' can't be null";
        }
        if ($this->container['has_wallet_netki'] === null) {
            $invalid_properties[] = "'has_wallet_netki' can't be null";
        }
        if ($this->container['wallet_netki'] === null) {
            $invalid_properties[] = "'wallet_netki' can't be null";
        }
        if ($this->container['wallet_netki_address'] === null) {
            $invalid_properties[] = "'wallet_netki_address' can't be null";
        }
        if ($this->container['wallet_netki_wallet_id'] === null) {
            $invalid_properties[] = "'wallet_netki_wallet_id' can't be null";
        }
        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properteis are valid
     */
    public function valid()
    {
        if ($this->container['wallet_confirmed_balance'] === null) {
            return false;
        }
        if ($this->container['wallet_uncofirmed_balance'] === null) {
            return false;
        }
        if ($this->container['has_wallet_netki'] === null) {
            return false;
        }
        if ($this->container['wallet_netki'] === null) {
            return false;
        }
        if ($this->container['wallet_netki_address'] === null) {
            return false;
        }
        if ($this->container['wallet_netki_wallet_id'] === null) {
            return false;
        }
        return true;
    }


    /**
     * Gets wallet_confirmed_balance
     * @return int
     */
    public function getWalletConfirmedBalance()
    {
        return $this->container['wallet_confirmed_balance'];
    }

    /**
     * Sets wallet_confirmed_balance
     * @param int $wallet_confirmed_balance
     * @return $this
     */
    public function setWalletConfirmedBalance($wallet_confirmed_balance)
    {
        $this->container['wallet_confirmed_balance'] = $wallet_confirmed_balance;

        return $this;
    }

    /**
     * Gets wallet_uncofirmed_balance
     * @return int
     */
    public function getWalletUncofirmedBalance()
    {
        return $this->container['wallet_uncofirmed_balance'];
    }

    /**
     * Sets wallet_uncofirmed_balance
     * @param int $wallet_uncofirmed_balance
     * @return $this
     */
    public function setWalletUncofirmedBalance($wallet_uncofirmed_balance)
    {
        $this->container['wallet_uncofirmed_balance'] = $wallet_uncofirmed_balance;

        return $this;
    }

    /**
     * Gets has_wallet_netki
     * @return bool
     */
    public function getHasWalletNetki()
    {
        return $this->container['has_wallet_netki'];
    }

    /**
     * Sets has_wallet_netki
     * @param bool $has_wallet_netki
     * @return $this
     */
    public function setHasWalletNetki($has_wallet_netki)
    {
        $this->container['has_wallet_netki'] = $has_wallet_netki;

        return $this;
    }

    /**
     * Gets wallet_netki
     * @return string
     */
    public function getWalletNetki()
    {
        return $this->container['wallet_netki'];
    }

    /**
     * Sets wallet_netki
     * @param string $wallet_netki
     * @return $this
     */
    public function setWalletNetki($wallet_netki)
    {
        $this->container['wallet_netki'] = $wallet_netki;

        return $this;
    }

    /**
     * Gets wallet_netki_address
     * @return string
     */
    public function getWalletNetkiAddress()
    {
        return $this->container['wallet_netki_address'];
    }

    /**
     * Sets wallet_netki_address
     * @param string $wallet_netki_address
     * @return $this
     */
    public function setWalletNetkiAddress($wallet_netki_address)
    {
        $this->container['wallet_netki_address'] = $wallet_netki_address;

        return $this;
    }

    /**
     * Gets wallet_netki_wallet_id
     * @return string
     */
    public function getWalletNetkiWalletId()
    {
        return $this->container['wallet_netki_wallet_id'];
    }

    /**
     * Sets wallet_netki_wallet_id
     * @param string $wallet_netki_wallet_id
     * @return $this
     */
    public function setWalletNetkiWalletId($wallet_netki_wallet_id)
    {
        $this->container['wallet_netki_wallet_id'] = $wallet_netki_wallet_id;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}