#import "SWGAccountActionsApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGLoginFormNew.h"
#import "SWGFailResult.h"
#import "SWGStandardLoginResultData.h"
#import "SWGStandardInitiateLoginResultData.h"
#import "SWGLoginId.h"
#import "SWGSuccessResult.h"
#import "SWGEmail.h"
#import "SWGSignupForm.h"
#import "SWGNetkiNameAddress.h"
#import "SWGAddress.h"
#import "SWGNumberOtp.h"


@interface SWGAccountActionsApi ()

@property (nonatomic, strong) NSMutableDictionary *defaultHeaders;

@end

@implementation SWGAccountActionsApi

NSString* kSWGAccountActionsApiErrorDomain = @"SWGAccountActionsApiErrorDomain";
NSInteger kSWGAccountActionsApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    self = [super init];
    if (self) {
        SWGConfiguration *config = [SWGConfiguration sharedConfig];
        if (config.apiClient == nil) {
            config.apiClient = [[SWGApiClient alloc] init];
        }
        _apiClient = config.apiClient;
        _defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

- (id) initWithApiClient:(SWGApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

+ (instancetype)sharedAPI {
    static SWGAccountActionsApi *sharedAPI;
    static dispatch_once_t once;
    dispatch_once(&once, ^{
        sharedAPI = [[self alloc] init];
    });
    return sharedAPI;
}

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.defaultHeaders[key];
}

-(void) addHeader:(NSString*)value forKey:(NSString*)key {
    [self setDefaultHeaderValue:value forKey:key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.defaultHeaders setValue:value forKey:key];
}

-(NSUInteger) requestQueueSize {
    return [SWGApiClient requestQueueSize];
}

#pragma mark - Api Methods

///
/// Creates a Login Instance and returns an API Key.
/// Creates a Login Instance and returns an API Key
///  @param body Please send the form with valid inputs. 
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGStandardLoginResultData*
///
-(NSNumber*) v1loginWithBody: (SWGLoginFormNew*) body
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGStandardLoginResultData* output, NSError* error)) handler {
    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/login"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGStandardLoginResultData*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGStandardLoginResultData*)data, error);
                                }
                           }
          ];
}

///
/// Initiate Login
/// Sends an Email with a Verification Link.
///  @param body Enter a valid Login ID. This method will send an email with a token to be used for login. 
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGStandardInitiateLoginResultData*
///
-(NSNumber*) v1logininitiateWithBody: (SWGLoginId*) body
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGStandardInitiateLoginResultData* output, NSError* error)) handler {
    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/login/initiate"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGStandardInitiateLoginResultData*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGStandardInitiateLoginResultData*)data, error);
                                }
                           }
          ];
}

///
/// Sends an email with a password reset token
/// Sends an email with a password reset token
///  @param body Enter a valid and registered Email ID. 
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGSuccessResult*
///
-(NSNumber*) v1loginpasswordforgotWithBody: (SWGEmail*) body
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler {
    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/login/password/forgot"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGSuccessResult*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGSuccessResult*)data, error);
                                }
                           }
          ];
}

///
/// Creates a new Unverified Account.
/// Creates a new Unverified Account.
///  @param body Please send the form with valid inputs. 
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGSuccessResult*
///
-(NSNumber*) v1signupWithBody: (SWGSignupForm*) body
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler {
    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/signup"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGSuccessResult*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGSuccessResult*)data, error);
                                }
                           }
          ];
}

///
/// Send OTP for Bank Link
/// Send OTP for an additional Bank Link.
///  @param number  
///
///  @param authorization API object to be added (optional)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGStandardInitiateLoginResultData*
///
-(NSNumber*) v1userbankotpNumberWithNumber: (NSString*) number
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGStandardInitiateLoginResultData* output, NSError* error)) handler {
    // verify the required parameter 'number' is set
    if (number == nil) {
        NSParameterAssert(number);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"number"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/bank/otp/{number}"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (number != nil) {
        pathParams[@"number"] = number;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGStandardInitiateLoginResultData*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGStandardInitiateLoginResultData*)data, error);
                                }
                           }
          ];
}

///
/// Submits a New Bank Link and initial KYC Documents.
/// Submits a New Bank Link and initial KYC Documents.
///  @param panNumber Please enter your Pan Card Number 
///
///  @param acctNick Please enter an Account NickName 
///
///  @param name Please enter your Name as it appears on your Bank account. 
///
///  @param ban Please enter your Bank account number. 
///
///  @param ifsc Please enter your IFSC Code. 
///
///  @param acctType Please enter your Coinsecure account type. Allowable Values are Personal or Company. 
///
///  @param banType Please enter your Bank account type. Allowable Values are Savings or Current. 
///
///  @param phone Please enter your Valid Phone Number. 
///
///  @param otp Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number. 
///
///  @param file Enter a valid image, pdf or zip file under 5 MB in size. 
///
///  @param authorization Enter a valid Api Key. (optional)
///
///  @param message Please enter an optional message if needed. (optional)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGSuccessResult*
///
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
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler {
    // verify the required parameter 'panNumber' is set
    if (panNumber == nil) {
        NSParameterAssert(panNumber);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"panNumber"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'acctNick' is set
    if (acctNick == nil) {
        NSParameterAssert(acctNick);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"acctNick"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'ban' is set
    if (ban == nil) {
        NSParameterAssert(ban);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"ban"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'ifsc' is set
    if (ifsc == nil) {
        NSParameterAssert(ifsc);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"ifsc"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'acctType' is set
    if (acctType == nil) {
        NSParameterAssert(acctType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"acctType"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'banType' is set
    if (banType == nil) {
        NSParameterAssert(banType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"banType"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'phone' is set
    if (phone == nil) {
        NSParameterAssert(phone);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phone"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'otp' is set
    if (otp == nil) {
        NSParameterAssert(otp);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"otp"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'file' is set
    if (file == nil) {
        NSParameterAssert(file);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"file"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/exchange/kyc"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (panNumber) {
        formParams[@"panNumber"] = panNumber;
    }
    if (acctNick) {
        formParams[@"acctNick"] = acctNick;
    }
    if (name) {
        formParams[@"name"] = name;
    }
    if (ban) {
        formParams[@"ban"] = ban;
    }
    if (ifsc) {
        formParams[@"ifsc"] = ifsc;
    }
    if (acctType) {
        formParams[@"acctType"] = acctType;
    }
    if (message) {
        formParams[@"message"] = message;
    }
    if (banType) {
        formParams[@"banType"] = banType;
    }
    if (phone) {
        formParams[@"phone"] = phone;
    }
    if (otp) {
        formParams[@"otp"] = otp;
    }
    localVarFiles[@"file"] = file;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PUT"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGSuccessResult*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGSuccessResult*)data, error);
                                }
                           }
          ];
}

///
/// Delete GCM Code
/// Delete GCM Code and associated API Key.
///  @param code  
///
///  @param authorization API object to be added (optional)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGSuccessResult*
///
-(NSNumber*) v1usergcmCodeWithCode: (NSString*) code
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler {
    // verify the required parameter 'code' is set
    if (code == nil) {
        NSParameterAssert(code);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"code"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/gcm/{code}"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (code != nil) {
        pathParams[@"code"] = code;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGSuccessResult*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGSuccessResult*)data, error);
                                }
                           }
          ];
}

///
/// Send OTP for KYC Link
/// Send OTP for KYC Link.
///  @param number  
///
///  @param authorization API object to be added (optional)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGSuccessResult*
///
-(NSNumber*) v1userkycotpNumberWithNumber: (NSString*) number
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler {
    // verify the required parameter 'number' is set
    if (number == nil) {
        NSParameterAssert(number);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"number"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/kyc/otp/{number}"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (number != nil) {
        pathParams[@"number"] = number;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGSuccessResult*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGSuccessResult*)data, error);
                                }
                           }
          ];
}

///
/// Logout User
/// Logs out user and Deletes the api key and associated session data.
///  @param authorization Enter a valid Api Key. (optional)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGSuccessResult*
///
-(NSNumber*) v1userlogoutWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/logout"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGSuccessResult*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGSuccessResult*)data, error);
                                }
                           }
          ];
}

///
/// Create Neki Wallet Name
/// Creates a new Netki Wallet Name.
///  @param body Enter a valid Netki name and Bitcoin address from Wallet or Exchange. 
///
///  @param authorization Enter a valid Api Key. (optional)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGSuccessResult*
///
-(NSNumber*) v1usernetkicreateWithBody: (SWGNetkiNameAddress*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler {
    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/netki/create"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PUT"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGSuccessResult*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGSuccessResult*)data, error);
                                }
                           }
          ];
}

///
/// Update Netki Address
/// Updates the address on an existing wallet name.
///  @param body Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name. 
///
///  @param authorization Enter a valid Api Key. (optional)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGSuccessResult*
///
-(NSNumber*) v1usernetkiupdateWithBody: (SWGAddress*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler {
    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/netki/update"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGSuccessResult*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGSuccessResult*)data, error);
                                }
                           }
          ];
}

///
/// Delete Profile Image
/// Deletes a profile Image.
///  @param netkiName  
///
///  @param authorization Enter a valid Api Key. (optional)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGSuccessResult*
///
-(NSNumber*) v1userprofileimagedeleteNetkiNameWithNetkiName: (NSString*) netkiName
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler {
    // verify the required parameter 'netkiName' is set
    if (netkiName == nil) {
        NSParameterAssert(netkiName);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"netkiName"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/profile/image/delete/{netkiName}"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (netkiName != nil) {
        pathParams[@"netkiName"] = netkiName;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGSuccessResult*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGSuccessResult*)data, error);
                                }
                           }
          ];
}

///
/// Update Profile Image
/// Updates Profile Image and allows public or private options for netki profile page.
///  @param netkiName Please enter your Netki Wallet Name. 
///
///  @param isPublic Please enter if this image can be public. 
///
///  @param file Enter a valid image, pdf or zip file under 5 MB in size. 
///
///  @param authorization Enter a valid Api Key. (optional)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGSuccessResult*
///
-(NSNumber*) v1userprofileimageupdateWithNetkiName: (NSString*) netkiName
    isPublic: (NSNumber*) isPublic
    file: (NSURL*) file
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler {
    // verify the required parameter 'netkiName' is set
    if (netkiName == nil) {
        NSParameterAssert(netkiName);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"netkiName"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'isPublic' is set
    if (isPublic == nil) {
        NSParameterAssert(isPublic);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"isPublic"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'file' is set
    if (file == nil) {
        NSParameterAssert(file);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"file"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/profile/image/update"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (netkiName) {
        formParams[@"netkiName"] = netkiName;
    }
    if (isPublic) {
        formParams[@"isPublic"] = isPublic;
    }
    localVarFiles[@"file"] = file;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGSuccessResult*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGSuccessResult*)data, error);
                                }
                           }
          ];
}

///
/// New Profile Phone
/// Set a New Profile Phone Number.
///  @param body You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number 
///
///  @param authorization Enter a valid Api Key. (optional)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGSuccessResult*
///
-(NSNumber*) v1userprofilephoneWithBody: (SWGNumberOtp*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler {
    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/profile/phone/new"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PUT"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGSuccessResult*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGSuccessResult*)data, error);
                                }
                           }
          ];
}

///
/// Delete Profile Phone Number
/// Delete Profile Phone Number.
///  @param authorization API object to be added (optional)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGSuccessResult*
///
-(NSNumber*) v1userprofilephoneNumberWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/profile/phone/delete"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGSuccessResult*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGSuccessResult*)data, error);
                                }
                           }
          ];
}

///
/// Send OTP for Profile Phone
/// Send OTP for Profile Phone addition or updation.
///  @param number  
///
///  @param authorization API object to be added (optional)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGSuccessResult*
///
-(NSNumber*) v1userprofilephoneotpNumberWithNumber: (NSString*) number
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler {
    // verify the required parameter 'number' is set
    if (number == nil) {
        NSParameterAssert(number);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"number"] };
            NSError* error = [NSError errorWithDomain:kSWGAccountActionsApiErrorDomain code:kSWGAccountActionsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/profile/phone/otp/{number}"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (number != nil) {
        pathParams[@"number"] = number;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (accept != nil) {
        headerParams[@"accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json", @"application/xml", @"application/csv"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGSuccessResult*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGSuccessResult*)data, error);
                                }
                           }
          ];
}



@end
