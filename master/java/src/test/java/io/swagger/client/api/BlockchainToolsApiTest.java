package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.ValidAddressSearchDataResponse;
import io.swagger.client.model.ConfirmDataResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlockchainToolsApi
 */
public class BlockchainToolsApiTest {

    private final BlockchainToolsApi api = new BlockchainToolsApi();

    
    /**
     * Search Bitcoin Blockchain
     *
     * Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1bitcoinsearchAddressTest() throws ApiException {
        String any = null;
        String accept = null;
        // ValidAddressSearchDataResponse response = api.v1bitcoinsearchAddress(any, accept);

        // TODO: test validations
    }
    
    /**
     * Get Confirmations
     *
     * Searches for a Number of Confirmations on a transaction ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1bitcoinsearchTxidTest() throws ApiException {
        String txid = null;
        String accept = null;
        // ConfirmDataResponse response = api.v1bitcoinsearchTxid(txid, accept);

        // TODO: test validations
    }
    
}
