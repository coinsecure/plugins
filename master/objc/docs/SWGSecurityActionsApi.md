# SWGSecurityActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1mfaauthyinitiate**](SWGSecurityActionsApi.md#v1mfaauthyinitiate) | **POST** /v1/mfa/authy/initiate | Initiate Authy Registration.
[**v1mfagainitiate**](SWGSecurityActionsApi.md#v1mfagainitiate) | **POST** /v1/mfa/ga/initiate | Initiate GA Registration.
[**v1usermfaauthycall**](SWGSecurityActionsApi.md#v1usermfaauthycall) | **GET** /v1/mfa/authy/call | Authy Call Code
[**v1usermfaauthydisable**](SWGSecurityActionsApi.md#v1usermfaauthydisable) | **DELETE** /v1/user/mfa/authy/disable | Disable Authy
[**v1usermfaauthyinitiateenable**](SWGSecurityActionsApi.md#v1usermfaauthyinitiateenable) | **PUT** /v1/user/mfa/authy/initiate/enable | Verify Authy Registration
[**v1usermfaauthysms**](SWGSecurityActionsApi.md#v1usermfaauthysms) | **GET** /v1/mfa/authy/sms | Authy Sms Code
[**v1usermfagadisable**](SWGSecurityActionsApi.md#v1usermfagadisable) | **DELETE** /v1/user/mfa/ga/disable | Disable Google Authenticator
[**v1usermfagainitiateenable**](SWGSecurityActionsApi.md#v1usermfagainitiateenable) | **PUT** /v1/user/mfa/ga/initiate/enable | Enable Google Authenticator
[**v1userpasswordchange**](SWGSecurityActionsApi.md#v1userpasswordchange) | **PATCH** /v1/user/password/change | Change Password.
[**v1userpasswordreset**](SWGSecurityActionsApi.md#v1userpasswordreset) | **PATCH** /v1/user/password/reset | Reset Password.


# **v1mfaauthyinitiate**
```objc
-(NSNumber*) v1mfaauthyinitiateWithBody: (SWGMethodCountryMobile*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Initiate Authy Registration.

Sends a Token via call or sms to begin the registration. This token needs to be used as the code in /v1/user/mfa/authy/initiate/register.

### Example 
```objc

SWGMethodCountryMobile* body = [[SWGMethodCountryMobile alloc] init]; // Please Send Valid Json as below.
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGSecurityActionsApi*apiInstance = [[SWGSecurityActionsApi alloc] init];

// Initiate Authy Registration.
[apiInstance v1mfaauthyinitiateWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSecurityActionsApi->v1mfaauthyinitiate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGMethodCountryMobile***](SWGMethodCountryMobile*.md)| Please Send Valid Json as below. | 
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

# **v1mfagainitiate**
```objc
-(NSNumber*) v1mfagainitiateWithBody: (SWGMethodCountryMobile*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Initiate GA Registration.

Returns the Google Authenticator Secret and a QR code URL.

### Example 
```objc

SWGMethodCountryMobile* body = [[SWGMethodCountryMobile alloc] init]; // Please Send Valid Json as below.
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGSecurityActionsApi*apiInstance = [[SWGSecurityActionsApi alloc] init];

// Initiate GA Registration.
[apiInstance v1mfagainitiateWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSecurityActionsApi->v1mfagainitiate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGMethodCountryMobile***](SWGMethodCountryMobile*.md)| Please Send Valid Json as below. | 
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

# **v1usermfaauthycall**
```objc
-(NSNumber*) v1usermfaauthycallWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Authy Call Code

Calls valid phone user with a code.

### Example 
```objc

NSString* authorization = @"authorization_example"; // Login Token or any Apikey to be added as Authorization in header (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGSecurityActionsApi*apiInstance = [[SWGSecurityActionsApi alloc] init];

// Authy Call Code
[apiInstance v1usermfaauthycallWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSecurityActionsApi->v1usermfaauthycall: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Login Token or any Apikey to be added as Authorization in header | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1usermfaauthydisable**
```objc
-(NSNumber*) v1usermfaauthydisableWithBody: (SWGCode*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Disable Authy

Disables users Authy

### Example 
```objc

SWGCode* body = [[SWGCode alloc] init]; // Please Send Valid Json as below.
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGSecurityActionsApi*apiInstance = [[SWGSecurityActionsApi alloc] init];

// Disable Authy
[apiInstance v1usermfaauthydisableWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSecurityActionsApi->v1usermfaauthydisable: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGCode***](SWGCode*.md)| Please Send Valid Json as below. | 
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

# **v1usermfaauthyinitiateenable**
```objc
-(NSNumber*) v1usermfaauthyinitiateenableWithBody: (SWGCodeCountryMobile*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Verify Authy Registration

Verifies and registers the user with verification code sent to sms or call from /v1/mfa/authy/initiate.

### Example 
```objc

SWGCodeCountryMobile* body = [[SWGCodeCountryMobile alloc] init]; // Please Send Valid Json as below.
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGSecurityActionsApi*apiInstance = [[SWGSecurityActionsApi alloc] init];

// Verify Authy Registration
[apiInstance v1usermfaauthyinitiateenableWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSecurityActionsApi->v1usermfaauthyinitiateenable: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGCodeCountryMobile***](SWGCodeCountryMobile*.md)| Please Send Valid Json as below. | 
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

# **v1usermfaauthysms**
```objc
-(NSNumber*) v1usermfaauthysmsWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Authy Sms Code

Disables users Authy

### Example 
```objc

NSString* authorization = @"authorization_example"; // Login Token or any Apikey to be added as Authorization in header (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGSecurityActionsApi*apiInstance = [[SWGSecurityActionsApi alloc] init];

// Authy Sms Code
[apiInstance v1usermfaauthysmsWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSecurityActionsApi->v1usermfaauthysms: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Login Token or any Apikey to be added as Authorization in header | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1usermfagadisable**
```objc
-(NSNumber*) v1usermfagadisableWithBody: (SWGCode*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Disable Google Authenticator

Disables users Google Authenticator 2FA

### Example 
```objc

SWGCode* body = [[SWGCode alloc] init]; // Please Send Valid Json as below.
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGSecurityActionsApi*apiInstance = [[SWGSecurityActionsApi alloc] init];

// Disable Google Authenticator
[apiInstance v1usermfagadisableWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSecurityActionsApi->v1usermfagadisable: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGCode***](SWGCode*.md)| Please Send Valid Json as below. | 
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

# **v1usermfagainitiateenable**
```objc
-(NSNumber*) v1usermfagainitiateenableWithBody: (SWGCodeCountryMobile*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Enable Google Authenticator

Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate.

### Example 
```objc

SWGCodeCountryMobile* body = [[SWGCodeCountryMobile alloc] init]; // Please Send Valid Json as below.
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGSecurityActionsApi*apiInstance = [[SWGSecurityActionsApi alloc] init];

// Enable Google Authenticator
[apiInstance v1usermfagainitiateenableWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSecurityActionsApi->v1usermfagainitiateenable: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGCodeCountryMobile***](SWGCodeCountryMobile*.md)| Please Send Valid Json as below. | 
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

# **v1userpasswordchange**
```objc
-(NSNumber*) v1userpasswordchangeWithBody: (SWGChangePassword*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Change Password.

Changes an account Password.

### Example 
```objc

SWGChangePassword* body = [[SWGChangePassword alloc] init]; // 
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGSecurityActionsApi*apiInstance = [[SWGSecurityActionsApi alloc] init];

// Change Password.
[apiInstance v1userpasswordchangeWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSecurityActionsApi->v1userpasswordchange: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGChangePassword***](SWGChangePassword*.md)|  | 
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

# **v1userpasswordreset**
```objc
-(NSNumber*) v1userpasswordresetWithBody: (SWGResetPassword*) body
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Reset Password.

Resets an account Password. Use forgotPassword to generate a token.

### Example 
```objc

SWGResetPassword* body = [[SWGResetPassword alloc] init]; // Please Send Valid Json as below.
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGSecurityActionsApi*apiInstance = [[SWGSecurityActionsApi alloc] init];

// Reset Password.
[apiInstance v1userpasswordresetWithBody:body
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSecurityActionsApi->v1userpasswordreset: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGResetPassword***](SWGResetPassword*.md)| Please Send Valid Json as below. | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

