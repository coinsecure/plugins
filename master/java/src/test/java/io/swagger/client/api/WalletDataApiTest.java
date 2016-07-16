package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.WalletAddressDataResponse;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.WalletsDataResponse;
import io.swagger.client.model.WalletCoinWithdrawDataResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletDataApi
 */
public class WalletDataApiTest {

    private final WalletDataApi api = new WalletDataApi();

    
    /**
     * Wallet Bitcoin Addresses
     *
     * Gets a List of Users Bitcoin Deposit Addresses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userwalletcoinaddressWalletIDTest() throws ApiException {
        String walletID = null;
        String authorization = null;
        String accept = null;
        // WalletAddressDataResponse response = api.v1userwalletcoinaddressWalletID(walletID, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Confirmed Wallet Transactions
     *
     * Gets your Confirmed Wallet Bitcoin Transactions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userwalletcoindepositconfirmedWalletIDTest() throws ApiException {
        String walletID = null;
        String authorization = null;
        String accept = null;
        // WalletAddressDataResponse response = api.v1userwalletcoindepositconfirmedWalletID(walletID, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Confirmed Wallet Deposit
     *
     * Gets the total confirmed transactions across all accounts and addresses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userwalletcoindepositconfirmedallTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // WalletAddressDataResponse response = api.v1userwalletcoindepositconfirmedall(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Unconfirmed Transactions in Wallet
     *
     * Gets the unconfirmed transactions on an account/ wallet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userwalletcoindepositunconfirmedWalletIDTest() throws ApiException {
        String walletID = null;
        String authorization = null;
        String accept = null;
        // api.v1userwalletcoindepositunconfirmedWalletID(walletID, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * All Unconfirmed Deposits
     *
     * Gets the total unconfirmed transactions across all accounts and addresses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userwalletcoindepositunconfirmedallTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // api.v1userwalletcoindepositunconfirmedall(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Wallet Details
     *
     * Gets a List of Users Wallets.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userwalletcoinwalletsTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // WalletsDataResponse response = api.v1userwalletcoinwallets(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Cancelled Coin Withdrawals
     *
     * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1walletwithdrawcancelledTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // WalletCoinWithdrawDataResponse response = api.v1walletwithdrawcancelled(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Completed Coin Withdrawals
     *
     * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1walletwithdrawcompletedTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // WalletCoinWithdrawDataResponse response = api.v1walletwithdrawcompleted(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Unverified Coin Withdrawals
     *
     * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1walletwithdrawunverifiedTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // WalletCoinWithdrawDataResponse response = api.v1walletwithdrawunverified(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Verified Coin Withdrawals
     *
     * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1walletwithdrawverifiedTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // WalletCoinWithdrawDataResponse response = api.v1walletwithdrawverified(authorization, accept);

        // TODO: test validations
    }
    
}
