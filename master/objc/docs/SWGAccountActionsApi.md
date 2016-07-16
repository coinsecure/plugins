# SWGAccountActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1login**](SWGAccountActionsApi.md#v1login) | **POST** /v1/login | Creates a Login Instance and returns an API Key.
[**v1logininitiate**](SWGAccountActionsApi.md#v1logininitiate) | **POST** /v1/login/initiate | Initiate Login
[**v1loginpasswordforgot**](SWGAccountActionsApi.md#v1loginpasswordforgot) | **POST** /v1/login/password/forgot | Sends an email with a password reset token
[**v1signup**](SWGAccountActionsApi.md#v1signup) | **POST** /v1/signup | Creates a new Unverified Account.
[**v1userbankotpNumber**](SWGAccountActionsApi.md#v1userbankotpnumber) | **GET** /v1/user/bank/otp/{number} | Send OTP for Bank Link
[**v1userexchangekyc**](SWGAccountActionsApi.md#v1userexchangekyc) | **PUT** /v1/user/exchange/kyc | Submits a New Bank Link and initial KYC Documents.
[**v1usergcmCode**](SWGAccountActionsApi.md#v1usergcmcode) | **DELETE** /v1/user/gcm/{code} | Delete GCM Code
[**v1userkycotpNumber**](SWGAccountActionsApi.md#v1userkycotpnumber) | **GET** /v1/user/kyc/otp/{number} | Send OTP for KYC Link
[**v1userlogout**](SWGAccountActionsApi.md#v1userlogout) | **DELETE** /v1/user/logout | Logout User
[**v1usernetkicreate**](SWGAccountActionsApi.md#v1usernetkicreate) | **PUT** /v1/user/netki/create | Create Neki Wallet Name
[**v1usernetkiupdate**](SWGAccountActionsApi.md#v1usernetkiupdate) | **PATCH** /v1/user/netki/update | Update Netki Address
[**v1userprofileimagedelete**](SWGAccountActionsApi.md#v1userprofileimagedelete) | **POST** /v1/user/contact | Delete Profile Image
[**v1userprofileimageupdate**](SWGAccountActionsApi.md#v1userprofileimageupdate) | **PATCH** /v1/user/profile/image/update | Update Profile Image
[**v1userprofilephone**](SWGAccountActionsApi.md#v1userprofilephone) | **PUT** /v1/user/profile/phone/new | New Profile Phone
[**v1userprofilephoneNumber**](SWGAccountActionsApi.md#v1userprofilephonenumber) | **DELETE** /v1/user/profile/phone/delete | Delete Profile Phone Number
[**v1userprofilephoneotpNumber**](SWGAccountActionsApi.md#v1userprofilephoneotpnumber) | **GET** /v1/user/profile/phone/otp/{number} | Send OTP for Profile Phone


# **v1login**
```objc
-(NSNumber*) v1loginWithBody: (SWGLoginFormNew*) body
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGStandardLoginResultData* output, NSError* error)) handler;
```

Creates a Login Instance and returns an API Key.

Creates a Login Instance and returns an API Key

### Example 
```objc

SWGLoginFormNew* body = [[SWGLoginFormNew alloc] init]; // Please send the form with valid inputs.
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Creates a Login Instance and returns an API Key.
[apiInstance v1loginWithBody:body
              accept:accept
          completionHandler: ^(SWGStandardLoginResultData* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1login: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGLoginFormNew***](SWGLoginFormNew*.md)| Please send the form with valid inputs. | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGStandardLoginResultData***](SWGStandardLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1logininitiate**
```objc
-(NSNumber*) v1logininitiateWithBody: (SWGLoginId*) body
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGStandardInitiateLoginResultData* output, NSError* error)) handler;
```

Initiate Login

Sends an Email with a Verification Link.

### Example 
```objc

SWGLoginId* body = [[SWGLoginId alloc] init]; // Enter a valid Login ID. This method will send an email with a token to be used for login.
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Initiate Login
[apiInstance v1logininitiateWithBody:body
              accept:accept
          completionHandler: ^(SWGStandardInitiateLoginResultData* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1logininitiate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGLoginId***](SWGLoginId*.md)| Enter a valid Login ID. This method will send an email with a token to be used for login. | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGStandardInitiateLoginResultData***](SWGStandardInitiateLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1loginpasswordforgot**
```objc
-(NSNumber*) v1loginpasswordforgotWithBody: (SWGEmail*) body
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Sends an email with a password reset token

Sends an email with a password reset token

### Example 
```objc

SWGEmail* body = [[SWGEmail alloc] init]; // Enter a valid and registered Email ID.
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Sends an email with a password reset token
[apiInstance v1loginpasswordforgotWithBody:body
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1loginpasswordforgot: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGEmail***](SWGEmail*.md)| Enter a valid and registered Email ID. | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1signup**
```objc
-(NSNumber*) v1signupWithBody: (SWGSignupForm*) body
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Creates a new Unverified Account.

Creates a new Unverified Account.

### Example 
```objc

SWGSignupForm* body = [[SWGSignupForm alloc] init]; // Please send the form with valid inputs.
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Creates a new Unverified Account.
[apiInstance v1signupWithBody:body
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1signup: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGSignupForm***](SWGSignupForm*.md)| Please send the form with valid inputs. | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userbankotpNumber**
```objc
-(NSNumber*) v1userbankotpNumberWithNumber: (NSString*) number
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGStandardInitiateLoginResultData* output, NSError* error)) handler;
```

Send OTP for Bank Link

Send OTP for an additional Bank Link.

### Example 
```objc

NSString* number = @"number_example"; // 
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Send OTP for Bank Link
[apiInstance v1userbankotpNumberWithNumber:number
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGStandardInitiateLoginResultData* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1userbankotpNumber: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **NSString***|  | 
 **authorization** | **NSString***| API object to be added | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGStandardInitiateLoginResultData***](SWGStandardInitiateLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangekyc**
```objc
-(NSNumber*) v1userexchangekycWithPanNumber: (NSString*) panNumber
    acctNick: (NSString*) acctNick
    name: (NSString*) name
    ban: (NSString*) ban
    ifsc: (NSString*) ifsc
    acctType: (NSString*) acctType
    banType: (NSString*) banType
    phone: (NSString*) phone
    otp: (NSString*) otp
    file: (NSURL*) file
    authorization: (NSString*) authorization
    message: (NSString*) message
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Submits a New Bank Link and initial KYC Documents.

Submits a New Bank Link and initial KYC Documents.

### Example 
```objc

NSString* panNumber = @"panNumber_example"; // Please enter your Pan Card Number
NSString* acctNick = @"acctNick_example"; // Please enter an Account NickName
NSString* name = @"name_example"; // Please enter your Name as it appears on your Bank account.
NSString* ban = @"ban_example"; // Please enter your Bank account number.
NSString* ifsc = @"ifsc_example"; // Please enter your IFSC Code.
NSString* acctType = @"acctType_example"; // Please enter your Coinsecure account type. Allowable Values are Personal or Company.
NSString* banType = @"banType_example"; // Please enter your Bank account type. Allowable Values are Savings or Current.
NSString* phone = @"phone_example"; // Please enter your Valid Phone Number.
NSString* otp = @"otp_example"; // Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number.
NSURL* file = [NSURL fileURLWithPath:@"/path/to/file.txt"]; // Enter a valid image, pdf or zip file under 5 MB in size.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* message = @"message_example"; // Please enter an optional message if needed. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Submits a New Bank Link and initial KYC Documents.
[apiInstance v1userexchangekycWithPanNumber:panNumber
              acctNick:acctNick
              name:name
              ban:ban
              ifsc:ifsc
              acctType:acctType
              banType:banType
              phone:phone
              otp:otp
              file:file
              authorization:authorization
              message:message
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1userexchangekyc: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **panNumber** | **NSString***| Please enter your Pan Card Number | 
 **acctNick** | **NSString***| Please enter an Account NickName | 
 **name** | **NSString***| Please enter your Name as it appears on your Bank account. | 
 **ban** | **NSString***| Please enter your Bank account number. | 
 **ifsc** | **NSString***| Please enter your IFSC Code. | 
 **acctType** | **NSString***| Please enter your Coinsecure account type. Allowable Values are Personal or Company. | 
 **banType** | **NSString***| Please enter your Bank account type. Allowable Values are Savings or Current. | 
 **phone** | **NSString***| Please enter your Valid Phone Number. | 
 **otp** | **NSString***| Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number. | 
 **file** | **NSURL***| Enter a valid image, pdf or zip file under 5 MB in size. | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **message** | **NSString***| Please enter an optional message if needed. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1usergcmCode**
```objc
-(NSNumber*) v1usergcmCodeWithCode: (NSString*) code
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Delete GCM Code

Delete GCM Code and associated API Key.

### Example 
```objc

NSString* code = @"code_example"; // 
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Delete GCM Code
[apiInstance v1usergcmCodeWithCode:code
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1usergcmCode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **NSString***|  | 
 **authorization** | **NSString***| API object to be added | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userkycotpNumber**
```objc
-(NSNumber*) v1userkycotpNumberWithNumber: (NSString*) number
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Send OTP for KYC Link

Send OTP for KYC Link.

### Example 
```objc

NSString* number = @"number_example"; // 
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Send OTP for KYC Link
[apiInstance v1userkycotpNumberWithNumber:number
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1userkycotpNumber: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **NSString***|  | 
 **authorization** | **NSString***| API object to be added | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userlogout**
```objc
-(NSNumber*) v1userlogoutWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Logout User

Logs out user and Deletes the api key and associated session data.

### Example 
```objc

NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Logout User
[apiInstance v1userlogoutWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1userlogout: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1usernetkicreate**
```objc
-(NSNumber*) v1usernetkicreateWithBody: (SWGNetkiNameAddress*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Create Neki Wallet Name

Creates a new Netki Wallet Name.

### Example 
```objc

SWGNetkiNameAddress* body = [[SWGNetkiNameAddress alloc] init]; // Enter a valid Netki name and Bitcoin address from Wallet or Exchange.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Create Neki Wallet Name
[apiInstance v1usernetkicreateWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1usernetkicreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGNetkiNameAddress***](SWGNetkiNameAddress*.md)| Enter a valid Netki name and Bitcoin address from Wallet or Exchange. | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1usernetkiupdate**
```objc
-(NSNumber*) v1usernetkiupdateWithBody: (SWGAddress*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Update Netki Address

Updates the address on an existing wallet name.

### Example 
```objc

SWGAddress* body = [[SWGAddress alloc] init]; // Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Update Netki Address
[apiInstance v1usernetkiupdateWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1usernetkiupdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGAddress***](SWGAddress*.md)| Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name. | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userprofileimagedelete**
```objc
-(NSNumber*) v1userprofileimagedeleteWithBody: (SWGNetkiName*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Delete Profile Image

Deletes a profile Image.

### Example 
```objc

SWGNetkiName* body = [[SWGNetkiName alloc] init]; // Please enter a valid Netki name associated with your prfile Image.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Delete Profile Image
[apiInstance v1userprofileimagedeleteWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1userprofileimagedelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGNetkiName***](SWGNetkiName*.md)| Please enter a valid Netki name associated with your prfile Image. | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userprofileimageupdate**
```objc
-(NSNumber*) v1userprofileimageupdateWithNetkiName: (NSString*) netkiName
    isPublic: (NSNumber*) isPublic
    file: (NSURL*) file
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Update Profile Image

Updates Profile Image and allows public or private options for netki profile page.

### Example 
```objc

NSString* netkiName = @"netkiName_example"; // Please enter your Netki Wallet Name.
NSNumber* isPublic = @true; // Please enter if this image can be public.
NSURL* file = [NSURL fileURLWithPath:@"/path/to/file.txt"]; // Enter a valid image, pdf or zip file under 5 MB in size.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Update Profile Image
[apiInstance v1userprofileimageupdateWithNetkiName:netkiName
              isPublic:isPublic
              file:file
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1userprofileimageupdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netkiName** | **NSString***| Please enter your Netki Wallet Name. | 
 **isPublic** | **NSNumber***| Please enter if this image can be public. | 
 **file** | **NSURL***| Enter a valid image, pdf or zip file under 5 MB in size. | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userprofilephone**
```objc
-(NSNumber*) v1userprofilephoneWithBody: (SWGNumberOtp*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

New Profile Phone

Set a New Profile Phone Number.

### Example 
```objc

SWGNumberOtp* body = [[SWGNumberOtp alloc] init]; // You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// New Profile Phone
[apiInstance v1userprofilephoneWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1userprofilephone: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGNumberOtp***](SWGNumberOtp*.md)| You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userprofilephoneNumber**
```objc
-(NSNumber*) v1userprofilephoneNumberWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Delete Profile Phone Number

Delete Profile Phone Number.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Delete Profile Phone Number
[apiInstance v1userprofilephoneNumberWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1userprofilephoneNumber: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userprofilephoneotpNumber**
```objc
-(NSNumber*) v1userprofilephoneotpNumberWithNumber: (NSString*) number
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Send OTP for Profile Phone

Send OTP for Profile Phone addition or updation.

### Example 
```objc

NSString* number = @"number_example"; // 
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountActionsApi*apiInstance = [[SWGAccountActionsApi alloc] init];

// Send OTP for Profile Phone
[apiInstance v1userprofilephoneotpNumberWithNumber:number
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountActionsApi->v1userprofilephoneotpNumber: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **NSString***|  | 
 **authorization** | **NSString***| API object to be added | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

