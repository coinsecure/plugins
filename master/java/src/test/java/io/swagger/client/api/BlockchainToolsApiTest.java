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
        String any = "0e3e2357e806b6cdb1f70b54c3a3a17b6714ee1f0e68bebb44a74b1efd512098";
        String bitcoinAddress = "1BywzpJL87T7tMRPFaJ5SUz5FiKexdP1g4";
        String accept = "JSON";
        ValidAddressSearchDataResponse response = api.v1bitcoinsearchAddress(bitcoinAddress, accept);
        
        System.out.println(response);
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
