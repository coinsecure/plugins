package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.TradeAddressDataResponse;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.VolDataResponse;
import io.swagger.client.model.CoinDepDataResponse;
import io.swagger.client.model.TradeCoinWithdrawDataResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExchangeBankCoinDataApi
 */
public class ExchangeBankCoinDataApiTest {

    private final ExchangeBankCoinDataApi api = new ExchangeBankCoinDataApi();

    
    /**
     * Exchange Coin Addresses
     *
     * Gets a List of Users Exchange Bitcoin Deposit Addresses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoinaddressesTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // TradeAddressDataResponse response = api.v1userexchangebankcoinaddresses(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Available Exchange Coin Balance
     *
     * Returns balance which is in Available for Trades. The response is in satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoinbalanceavailableTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // VolDataResponse response = api.v1userexchangebankcoinbalanceavailable(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * In Trade Coin Balance
     *
     * Returns in-trade or pending coin balance in satoshi.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoinbalancependingTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // VolDataResponse response = api.v1userexchangebankcoinbalancepending(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Total Exchange Coin Balance
     *
     * Returns users total coin balance in satoshis. Pending + Available
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoinbalancetotalTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // VolDataResponse response = api.v1userexchangebankcoinbalancetotal(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Cancelled Exchange Coin Deposits
     *
     * Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoindepositcancelledTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // CoinDepDataResponse response = api.v1userexchangebankcoindepositcancelled(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
    /**
     * Unverified Exchange Coin Deposits
     *
     * Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoindepositunverifiedTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // CoinDepDataResponse response = api.v1userexchangebankcoindepositunverified(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
    /**
     * Verified Exchange Coin Deposits
     *
     * Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoindepositverifiedTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // CoinDepDataResponse response = api.v1userexchangebankcoindepositverified(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
    /**
     * Cancelled Exchange Coin Withdrawals
     *
     * Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoinwithdrawcancelledTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // TradeCoinWithdrawDataResponse response = api.v1userexchangebankcoinwithdrawcancelled(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
    /**
     * Completed Exchange Coin Withdrawals
     *
     * Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoinwithdrawcompletedTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // TradeCoinWithdrawDataResponse response = api.v1userexchangebankcoinwithdrawcompleted(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
    /**
     * Unverified Exchange Coin Withdrawals
     *
     * Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoinwithdrawunverifiedTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // TradeCoinWithdrawDataResponse response = api.v1userexchangebankcoinwithdrawunverified(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
    /**
     * Verified Exchange Coin Withdrawals
     *
     * Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoinwithdrawverifiedTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // TradeCoinWithdrawDataResponse response = api.v1userexchangebankcoinwithdrawverified(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
}
