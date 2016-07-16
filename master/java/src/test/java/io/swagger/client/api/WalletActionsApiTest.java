package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.WalletAddressDataResponse;
import io.swagger.client.model.NewAddress;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.NewWallet;
import io.swagger.client.model.SendCoinWallet;
import io.swagger.client.model.SuccessResult;
import io.swagger.client.model.SendExchange;
import io.swagger.client.model.WithdrawID;
import io.swagger.client.model.Code;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletActionsApi
 */
public class WalletActionsApiTest {

    private final WalletActionsApi api = new WalletActionsApi();

    
    /**
     * New Bitcoin Address
     *
     * Generates a New Bitcoin Address to store coins.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userwalletcoinaddressnewTest() throws ApiException {
        NewAddress body = null;
        String authorization = null;
        String accept = null;
        // WalletAddressDataResponse response = api.v1userwalletcoinaddressnew(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Create New Wallet
     *
     * Creates a New wallet to store addresses. This method also creates a single default address in each new wallet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userwalletcoinnewTest() throws ApiException {
        NewWallet body = null;
        String authorization = null;
        String accept = null;
        // WalletAddressDataResponse response = api.v1userwalletcoinnew(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Initiate Bitcoin Withdrawal
     *
     * The code for verifying the withdrawal can be called from /v1/wallet/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userwalletcoinwithdrawinitiateTest() throws ApiException {
        SendCoinWallet body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userwalletcoinwithdrawinitiate(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Send to Exchange
     *
     * This function transfers funds to yout Exchange Balance without the need for any confirmations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userwalletcoinwithdrawsendToExchangeTest() throws ApiException {
        SendExchange body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userwalletcoinwithdrawsendToExchange(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Cancel Bitcoin Withdrawal
     *
     * Cancels an unverified withdrawal. You can get the code from /wallet/unverifiedWithdraws.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userwalletcoinwithdrawunverifiedcancelTest() throws ApiException {
        String authorization = null;
        WithdrawID body = null;
        String accept = null;
        // SuccessResult response = api.v1userwalletcoinwithdrawunverifiedcancel(authorization, body, accept);

        // TODO: test validations
    }
    
    /**
     * Verify Bitcoin Withdrawal
     *
     * Verifies an unverified withdrawal. You can get the code from /v1/wallet/coin/withdraw/newVerifycode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userwalletcoinwithdrawverifyTest() throws ApiException {
        String authorization = null;
        Code body = null;
        String accept = null;
        // SuccessResult response = api.v1userwalletcoinwithdrawverify(authorization, body, accept);

        // TODO: test validations
    }
    
    /**
     * Gets a Verification Code
     *
     * Gets Coin Unverified Withdraws Codes to call and apply on /v1/wallet/coin/withdraw/unverified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1walletcoinwithdrawnewVerifycodeTest() throws ApiException {
        WithdrawID body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1walletcoinwithdrawnewVerifycode(body, authorization, accept);

        // TODO: test validations
    }
    
}
