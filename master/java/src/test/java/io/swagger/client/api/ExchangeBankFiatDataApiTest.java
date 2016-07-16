package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.FiatBankDataResponse;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.RateDataResponse;
import io.swagger.client.model.FiatDepDataResponse;
import io.swagger.client.model.FiatWithDataResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExchangeBankFiatDataApi
 */
public class ExchangeBankFiatDataApiTest {

    private final ExchangeBankFiatDataApi api = new ExchangeBankFiatDataApi();

    
    /**
     * Exchange Bitcoin Deposit Addresses
     *
     * Gets a List of Users Exchange Bitcoin Addresses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiataccountsTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // FiatBankDataResponse response = api.v1userexchangebankfiataccounts(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Available Exchange Fiat Balance
     *
     * Returns balance which is in Available for Trades. The response is in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatbalanceavailableTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // RateDataResponse response = api.v1userexchangebankfiatbalanceavailable(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * In Trade Coin Balance
     *
     * Returns in-trade or pending fiat balance in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatbalancependingTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // RateDataResponse response = api.v1userexchangebankfiatbalancepending(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Total Exchange Fiat Balance
     *
     * Returns users total fiat balance in paisa. Pending + Available
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatbalancetotalTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // RateDataResponse response = api.v1userexchangebankfiatbalancetotal(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Cancelled Exchange Fiat Deposits
     *
     * Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatdepositcancelledTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // FiatDepDataResponse response = api.v1userexchangebankfiatdepositcancelled(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
    /**
     * Unverified Exchange Fiat Deposits
     *
     * Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatdepositunverifiedTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // FiatDepDataResponse response = api.v1userexchangebankfiatdepositunverified(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
    /**
     * Verified Exchange Fiat Deposits
     *
     * Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatdepositverifiedTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // FiatDepDataResponse response = api.v1userexchangebankfiatdepositverified(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
    /**
     * Cancelled Exchange Fiat Withdrawals
     *
     * Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatwithdrawcancelledTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // FiatWithDataResponse response = api.v1userexchangebankfiatwithdrawcancelled(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
    /**
     * Completed Exchange Fiat Withdrawals
     *
     * Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatwithdrawcompletedTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // FiatWithDataResponse response = api.v1userexchangebankfiatwithdrawcompleted(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
    /**
     * Unverified Exchange Fiat Withdrawals
     *
     * Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatwithdrawunverifiedTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // FiatWithDataResponse response = api.v1userexchangebankfiatwithdrawunverified(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
    /**
     * Verified Exchange Fiat Withdrawals
     *
     * Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatwithdrawverifiedTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // FiatWithDataResponse response = api.v1userexchangebankfiatwithdrawverified(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
}
