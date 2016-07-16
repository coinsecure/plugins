package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.SuccessResult;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.AskID;
import io.swagger.client.model.SuccessResultList;
import io.swagger.client.model.RateVolData;
import io.swagger.client.model.BidID;
import io.swagger.client.model.MinFiat;
import io.swagger.client.model.MaxVol;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExchangeTradeActionsApi
 */
public class ExchangeTradeActionsApiTest {

    private final ExchangeTradeActionsApi api = new ExchangeTradeActionsApi();

    
    /**
     * Cancel Open Sell Order
     *
     * Cancels a BTC Sell Order. Orders can only be cancelled if they are in a pending state.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangeaskcancelTest() throws ApiException {
        AskID body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangeaskcancel(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * BTC Sell Order
     *
     * Creates a BTC Sell Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangeasknewTest() throws ApiException {
        RateVolData body = null;
        String authorization = null;
        String accept = null;
        // SuccessResultList response = api.v1userexchangeasknew(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Cancel Open Buy Order
     *
     * Cancels a BTC Buy Order. Orders can only be cancelled if they are in a pending state.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebidcancelTest() throws ApiException {
        BidID body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangebidcancel(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * BTC Buy Order
     *
     * Creates a BTC Buy Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebidnewTest() throws ApiException {
        RateVolData body = null;
        String authorization = null;
        String accept = null;
        // SuccessResultList response = api.v1userexchangebidnew(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Instantly Buy BTC
     *
     * Instantly buys BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangeinstantbuyTest() throws ApiException {
        MinFiat body = null;
        String authorization = null;
        String accept = null;
        // SuccessResultList response = api.v1userexchangeinstantbuy(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Instantly Sell BTC
     *
     * Instantly sells BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangeinstantsellTest() throws ApiException {
        MaxVol body = null;
        String authorization = null;
        String accept = null;
        // SuccessResultList response = api.v1userexchangeinstantsell(body, authorization, accept);

        // TODO: test validations
    }
    
}
