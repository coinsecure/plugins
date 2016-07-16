package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.SendCoin;
import io.swagger.client.model.SuccessResult;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.WithdrawID;
import io.swagger.client.model.Code;
import io.swagger.client.model.NewBankForm;
import io.swagger.client.model.DepositID;
import io.swagger.client.model.NewFiatBankDeposit;
import io.swagger.client.model.WithdrawFiat;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExchangeBankActionsApi
 */
public class ExchangeBankActionsApiTest {

    private final ExchangeBankActionsApi api = new ExchangeBankActionsApi();

    
    /**
     * Initiate Bitcoin Withdrawal
     *
     * The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoinwithdrawinitiateTest() throws ApiException {
        SendCoin body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangebankcoinwithdrawinitiate(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Gets a Verification Code.
     *
     * Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoinwithdrawnewVerifycodeTest() throws ApiException {
        WithdrawID body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangebankcoinwithdrawnewVerifycode(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Cancel Bitcoin Withdrawal
     *
     * Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoinwithdrawunverifiedcancelTest() throws ApiException {
        WithdrawID body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangebankcoinwithdrawunverifiedcancel(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Verify Bitcoin Withdrawal
     *
     * Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankcoinwithdrawverifyTest() throws ApiException {
        Code body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangebankcoinwithdrawverify(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * New Bank Link
     *
     * Submits a New Bank Link on KYC Verified Accounts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiataccountnewTest() throws ApiException {
        NewBankForm body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangebankfiataccountnew(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Cancel Unverified Exchange Fiat Deposit
     *
     * Cancels an unverified Exchange Fiat Deposit.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatdepositcancelTest() throws ApiException {
        DepositID body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangebankfiatdepositcancel(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * New Exchange Fiat Deposit
     *
     * Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatdepositnewTest() throws ApiException {
        NewFiatBankDeposit body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangebankfiatdepositnew(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Initiate Fiat Withdrawal
     *
     * The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatwithdrawinitiateTest() throws ApiException {
        WithdrawFiat body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangebankfiatwithdrawinitiate(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Gets a Fiat Verification Code.
     *
     * Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatwithdrawnewVerifycodeTest() throws ApiException {
        WithdrawID body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangebankfiatwithdrawnewVerifycode(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Cancel Fiat Withdrawal
     *
     * Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatwithdrawunverifiedcancelTest() throws ApiException {
        WithdrawID body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangebankfiatwithdrawunverifiedcancel(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Verify Fiat Withdrawal
     *
     * Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebankfiatwithdrawverifyTest() throws ApiException {
        Code body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangebankfiatwithdrawverify(body, authorization, accept);

        // TODO: test validations
    }
    
}
