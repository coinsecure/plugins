package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.LoginFormNew;
import io.swagger.client.model.StandardLoginResultData;
import io.swagger.client.model.LoginId;
import io.swagger.client.model.StandardInitiateLoginResultData;
import io.swagger.client.model.Email;
import io.swagger.client.model.SuccessResult;
import io.swagger.client.model.SignupForm;
import java.io.File;
import io.swagger.client.model.NetkiNameAddress;
import io.swagger.client.model.Address;
import io.swagger.client.model.NetkiName;
import io.swagger.client.model.NumberOtp;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountActionsApi
 */
public class AccountActionsApiTest {

    private final AccountActionsApi api = new AccountActionsApi();

    
    /**
     * Creates a Login Instance and returns an API Key.
     *
     * Creates a Login Instance and returns an API Key
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1loginTest() throws ApiException {
        LoginFormNew body = null;
        String accept = null;
        // StandardLoginResultData response = api.v1login(body, accept);

        // TODO: test validations
    }
    
    /**
     * Initiate Login
     *
     * Sends an Email with a Verification Link.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1logininitiateTest() throws ApiException {
        LoginId body = null;
        String accept = null;
        // StandardInitiateLoginResultData response = api.v1logininitiate(body, accept);

        // TODO: test validations
    }
    
    /**
     * Sends an email with a password reset token
     *
     * Sends an email with a password reset token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1loginpasswordforgotTest() throws ApiException {
        Email body = null;
        String accept = null;
        // SuccessResult response = api.v1loginpasswordforgot(body, accept);

        // TODO: test validations
    }
    
    /**
     * Creates a new Unverified Account.
     *
     * Creates a new Unverified Account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1signupTest() throws ApiException {
        SignupForm body = null;
        String accept = null;
        // SuccessResult response = api.v1signup(body, accept);

        // TODO: test validations
    }
    
    /**
     * Send OTP for Bank Link
     *
     * Send OTP for an additional Bank Link.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userbankotpNumberTest() throws ApiException {
        String number = null;
        String authorization = null;
        String accept = null;
        // StandardInitiateLoginResultData response = api.v1userbankotpNumber(number, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Submits a New Bank Link and initial KYC Documents.
     *
     * Submits a New Bank Link and initial KYC Documents.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangekycTest() throws ApiException {
        String panNumber = null;
        String acctNick = null;
        String name = null;
        String ban = null;
        String ifsc = null;
        String acctType = null;
        String banType = null;
        String phone = null;
        String otp = null;
        File file = null;
        String authorization = null;
        String message = null;
        String accept = null;
        // SuccessResult response = api.v1userexchangekyc(panNumber, acctNick, name, ban, ifsc, acctType, banType, phone, otp, file, authorization, message, accept);

        // TODO: test validations
    }
    
    /**
     * Delete GCM Code
     *
     * Delete GCM Code and associated API Key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1usergcmCodeTest() throws ApiException {
        String code = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1usergcmCode(code, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Send OTP for KYC Link
     *
     * Send OTP for KYC Link.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userkycotpNumberTest() throws ApiException {
        String number = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userkycotpNumber(number, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Logout User
     *
     * Logs out user and Deletes the api key and associated session data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userlogoutTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userlogout(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Create Neki Wallet Name
     *
     * Creates a new Netki Wallet Name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1usernetkicreateTest() throws ApiException {
        NetkiNameAddress body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1usernetkicreate(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Update Netki Address
     *
     * Updates the address on an existing wallet name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1usernetkiupdateTest() throws ApiException {
        Address body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1usernetkiupdate(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Delete Profile Image
     *
     * Deletes a profile Image.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userprofileimagedeleteTest() throws ApiException {
        NetkiName body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userprofileimagedelete(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Update Profile Image
     *
     * Updates Profile Image and allows public or private options for netki profile page.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userprofileimageupdateTest() throws ApiException {
        String netkiName = null;
        Boolean isPublic = null;
        File file = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userprofileimageupdate(netkiName, isPublic, file, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * New Profile Phone
     *
     * Set a New Profile Phone Number.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userprofilephoneTest() throws ApiException {
        NumberOtp body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userprofilephone(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Delete Profile Phone Number
     *
     * Delete Profile Phone Number.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userprofilephoneNumberTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userprofilephoneNumber(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Send OTP for Profile Phone
     *
     * Send OTP for Profile Phone addition or updation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userprofilephoneotpNumberTest() throws ApiException {
        String number = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userprofilephoneotpNumber(number, authorization, accept);

        // TODO: test validations
    }
    
}
