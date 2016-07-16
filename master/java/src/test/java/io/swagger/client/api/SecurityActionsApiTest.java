package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.SuccessResult;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.MethodCountryMobile;
import io.swagger.client.model.Code;
import io.swagger.client.model.CodeCountryMobile;
import io.swagger.client.model.ChangePassword;
import io.swagger.client.model.ResetPassword;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityActionsApi
 */
public class SecurityActionsApiTest {

    private final SecurityActionsApi api = new SecurityActionsApi();

    
    /**
     * Initiate Authy Registration.
     *
     * Sends a Token via call or sms to begin the registration. This token needs to be used as the code in /v1/user/mfa/authy/initiate/register.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1mfaauthyinitiateTest() throws ApiException {
        MethodCountryMobile body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1mfaauthyinitiate(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Initiate GA Registration.
     *
     * Returns the Google Authenticator Secret and a QR code URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1mfagainitiateTest() throws ApiException {
        MethodCountryMobile body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1mfagainitiate(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Authy Call Code
     *
     * Calls valid phone user with a code.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1usermfaauthycallTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1usermfaauthycall(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Disable Authy
     *
     * Disables users Authy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1usermfaauthydisableTest() throws ApiException {
        Code body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1usermfaauthydisable(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Verify Authy Registration
     *
     * Verifies and registers the user with verification code sent to sms or call from /v1/mfa/authy/initiate.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1usermfaauthyinitiateenableTest() throws ApiException {
        CodeCountryMobile body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1usermfaauthyinitiateenable(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Authy Sms Code
     *
     * Disables users Authy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1usermfaauthysmsTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1usermfaauthysms(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Disable Google Authenticator
     *
     * Disables users Google Authenticator 2FA
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1usermfagadisableTest() throws ApiException {
        Code body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1usermfagadisable(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Enable Google Authenticator
     *
     * Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1usermfagainitiateenableTest() throws ApiException {
        CodeCountryMobile body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1usermfagainitiateenable(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Change Password.
     *
     * Changes an account Password.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userpasswordchangeTest() throws ApiException {
        ChangePassword body = null;
        String authorization = null;
        String accept = null;
        // SuccessResult response = api.v1userpasswordchange(body, authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Reset Password.
     *
     * Resets an account Password. Use forgotPassword to generate a token.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userpasswordresetTest() throws ApiException {
        ResetPassword body = null;
        String accept = null;
        // SuccessResult response = api.v1userpasswordreset(body, accept);

        // TODO: test validations
    }
    
}
