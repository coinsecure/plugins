package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.BankSummaryDataResponse;
import io.swagger.client.model.DoubleDataResponse;
import io.swagger.client.model.KYCDataResponse;
import io.swagger.client.model.SuccCoinRefDataResponse;
import io.swagger.client.model.SuccRefDataResponse;
import io.swagger.client.model.AllRefDataResponse;
import io.swagger.client.model.TradeSummaryDataResponse;
import io.swagger.client.model.SuccessResult;
import io.swagger.client.model.UserSummaryDataResponse;
import io.swagger.client.model.WalletSummaryDataResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountDataApi
 */
public class AccountDataApiTest {

    private final AccountDataApi api = new AccountDataApi();

    
    /**
     * Exchange Bank Summary
     *
     * Gets a Summary of Exchange Bank Data and Balances.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1exchangebanksummaryTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // BankSummaryDataResponse response = api.v1exchangebanksummary(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Users Coin Fee Percentage
     *
     * Returns the users coin fee percentage. The response is in percentage.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1exchangeusercoinfeeTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // DoubleDataResponse response = api.v1exchangeusercoinfee(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Users Fiat Fee Percentage
     *
     * Returns the users fiat fee percentage. The response is in percentage.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1exchangeuserfiatfeeTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // DoubleDataResponse response = api.v1exchangeuserfiatfee(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Coinsecure.me Netki Lookup
     *
     * Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1netkisearchNetkiNameTest() throws ApiException {
        String netkiName = null;
        String accept = null;
        // DoubleDataResponse response = api.v1netkisearchNetkiName(netkiName, accept);

        // TODO: test validations
    }
    
    /**
     * Gets KYC Status Details
     *
     * Gets Users KYC Status Details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangekycsTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // KYCDataResponse response = api.v1userexchangekycs(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Users Paid Fiat Referrals
     *
     * Returns the Users Paid Coin Referrals.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangereferralcoinpaidTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // SuccCoinRefDataResponse response = api.v1userexchangereferralcoinpaid(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Gets Users Successful Referral Links
     *
     * Gets Users Successful Referral Links that can be used during signup.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangereferralcoinsuccessfulTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // SuccRefDataResponse response = api.v1userexchangereferralcoinsuccessful(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Users Paid Fiat Referrals
     *
     * Returns the Users Paid Fiat Referrals.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangereferralfiatpaidTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // SuccCoinRefDataResponse response = api.v1userexchangereferralfiatpaid(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Gets Users Referral Links
     *
     * Gets Users Referral Links that can be used during signup.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangereferralsTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // AllRefDataResponse response = api.v1userexchangereferrals(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Exchange Trade Summary
     *
     * Gets a Summary of Exchange Trade Data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangetradesummaryTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // TradeSummaryDataResponse response = api.v1userexchangetradesummary(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Login Token Email
     *
     * Retrieves details of a Login Token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userlogintokenTokenTest() throws ApiException {
        String token = null;
        String accept = null;
        // SuccessResult response = api.v1userlogintokenToken(token, accept);

        // TODO: test validations
    }
    
    /**
     * Exchange Bank Summary
     *
     * Gets a Summary of Exchange Bank Data and Balances.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1usersummaryTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // UserSummaryDataResponse response = api.v1usersummary(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Exchange Bank Summary
     *
     * Gets a Summary of Exchange Bank Data and Balances.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userwalletsummaryTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // WalletSummaryDataResponse response = api.v1userwalletsummary(authorization, accept);

        // TODO: test validations
    }
    
}
