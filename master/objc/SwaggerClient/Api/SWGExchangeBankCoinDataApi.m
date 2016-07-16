#import "SWGExchangeBankCoinDataApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGFailResult.h"
#import "SWGTradeAddressDataResponse.h"
#import "SWGVolDataResponse.h"
#import "SWGCoinDepDataResponse.h"
#import "SWGTradeCoinWithdrawDataResponse.h"


@interface SWGExchangeBankCoinDataApi ()

@property (nonatomic, strong) NSMutableDictionary *defaultHeaders;

@end

@implementation SWGExchangeBankCoinDataApi

NSString* kSWGExchangeBankCoinDataApiErrorDomain = @"SWGExchangeBankCoinDataApiErrorDomain";
NSInteger kSWGExchangeBankCoinDataApiMissingParamErrorCode = 234513;

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
    static SWGExchangeBankCoinDataApi *sharedAPI;
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
/// Exchange Coin Addresses
/// Gets a List of Users Exchange Bitcoin Deposit Addresses.
///  @param authorization API object to be added 
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGTradeAddressDataResponse*
///
-(NSNumber*) v1userexchangebankcoinaddressesWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGTradeAddressDataResponse* output, NSError* error)) handler {
    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kSWGExchangeBankCoinDataApiErrorDomain code:kSWGExchangeBankCoinDataApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/exchange/bank/coin/addresses"];

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
                              responseType: @"SWGTradeAddressDataResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGTradeAddressDataResponse*)data, error);
                                }
                           }
          ];
}

///
/// Available Exchange Coin Balance
/// Returns balance which is in Available for Trades. The response is in satoshis.
///  @param authorization API object to be added 
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGVolDataResponse*
///
-(NSNumber*) v1userexchangebankcoinbalanceavailableWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGVolDataResponse* output, NSError* error)) handler {
    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kSWGExchangeBankCoinDataApiErrorDomain code:kSWGExchangeBankCoinDataApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/exchange/bank/coin/balance/total"];

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
                              responseType: @"SWGVolDataResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGVolDataResponse*)data, error);
                                }
                           }
          ];
}

///
/// In Trade Coin Balance
/// Returns in-trade or pending coin balance in satoshi.
///  @param authorization API object to be added 
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGVolDataResponse*
///
-(NSNumber*) v1userexchangebankcoinbalancependingWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGVolDataResponse* output, NSError* error)) handler {
    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kSWGExchangeBankCoinDataApiErrorDomain code:kSWGExchangeBankCoinDataApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/exchange/bank/coin/balance/pending"];

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
                              responseType: @"SWGVolDataResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGVolDataResponse*)data, error);
                                }
                           }
          ];
}

///
/// Total Exchange Coin Balance
/// Returns users total coin balance in satoshis. Pending + Available
///  @param authorization API object to be added 
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGVolDataResponse*
///
-(NSNumber*) v1userexchangebankcoinbalancetotalWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGVolDataResponse* output, NSError* error)) handler {
    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kSWGExchangeBankCoinDataApiErrorDomain code:kSWGExchangeBankCoinDataApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/exchange/bank/coin/balance/available"];

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
                              responseType: @"SWGVolDataResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGVolDataResponse*)data, error);
                                }
                           }
          ];
}

///
/// Cancelled Exchange Coin Deposits
/// Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.
///  @param authorization API object to be added 
///
///  @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
///
///  @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
///
///  @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
///
///  @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGCoinDepDataResponse*
///
-(NSNumber*) v1userexchangebankcoindepositcancelledWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGCoinDepDataResponse* output, NSError* error)) handler {
    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kSWGExchangeBankCoinDataApiErrorDomain code:kSWGExchangeBankCoinDataApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/exchange/bank/coin/deposit/cancelled"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (from != nil) {
        queryParams[@"from"] = from;
    }
    if (to != nil) {
        queryParams[@"to"] = to;
    }
    if (max != nil) {
        queryParams[@"max"] = max;
    }
    if (offset != nil) {
        queryParams[@"offset"] = offset;
    }
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
                              responseType: @"SWGCoinDepDataResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGCoinDepDataResponse*)data, error);
                                }
                           }
          ];
}

///
/// Unverified Exchange Coin Deposits
/// Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.
///  @param authorization API object to be added 
///
///  @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
///
///  @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
///
///  @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
///
///  @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGCoinDepDataResponse*
///
-(NSNumber*) v1userexchangebankcoindepositunverifiedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGCoinDepDataResponse* output, NSError* error)) handler {
    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kSWGExchangeBankCoinDataApiErrorDomain code:kSWGExchangeBankCoinDataApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/exchange/bank/coin/deposit/unverified"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (from != nil) {
        queryParams[@"from"] = from;
    }
    if (to != nil) {
        queryParams[@"to"] = to;
    }
    if (max != nil) {
        queryParams[@"max"] = max;
    }
    if (offset != nil) {
        queryParams[@"offset"] = offset;
    }
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
                              responseType: @"SWGCoinDepDataResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGCoinDepDataResponse*)data, error);
                                }
                           }
          ];
}

///
/// Verified Exchange Coin Deposits
/// Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.
///  @param authorization API object to be added 
///
///  @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
///
///  @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
///
///  @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
///
///  @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGCoinDepDataResponse*
///
-(NSNumber*) v1userexchangebankcoindepositverifiedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGCoinDepDataResponse* output, NSError* error)) handler {
    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kSWGExchangeBankCoinDataApiErrorDomain code:kSWGExchangeBankCoinDataApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/exchange/bank/coin/deposit/verified"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (from != nil) {
        queryParams[@"from"] = from;
    }
    if (to != nil) {
        queryParams[@"to"] = to;
    }
    if (max != nil) {
        queryParams[@"max"] = max;
    }
    if (offset != nil) {
        queryParams[@"offset"] = offset;
    }
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
                              responseType: @"SWGCoinDepDataResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGCoinDepDataResponse*)data, error);
                                }
                           }
          ];
}

///
/// Cancelled Exchange Coin Withdrawals
/// Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.
///  @param authorization API object to be added 
///
///  @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
///
///  @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
///
///  @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
///
///  @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGTradeCoinWithdrawDataResponse*
///
-(NSNumber*) v1userexchangebankcoinwithdrawcancelledWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGTradeCoinWithdrawDataResponse* output, NSError* error)) handler {
    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kSWGExchangeBankCoinDataApiErrorDomain code:kSWGExchangeBankCoinDataApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/exchange/bank/coin/withdraw/cancelled"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (from != nil) {
        queryParams[@"from"] = from;
    }
    if (to != nil) {
        queryParams[@"to"] = to;
    }
    if (max != nil) {
        queryParams[@"max"] = max;
    }
    if (offset != nil) {
        queryParams[@"offset"] = offset;
    }
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
                              responseType: @"SWGTradeCoinWithdrawDataResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGTradeCoinWithdrawDataResponse*)data, error);
                                }
                           }
          ];
}

///
/// Completed Exchange Coin Withdrawals
/// Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.
///  @param authorization API object to be added 
///
///  @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
///
///  @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
///
///  @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
///
///  @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGTradeCoinWithdrawDataResponse*
///
-(NSNumber*) v1userexchangebankcoinwithdrawcompletedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGTradeCoinWithdrawDataResponse* output, NSError* error)) handler {
    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kSWGExchangeBankCoinDataApiErrorDomain code:kSWGExchangeBankCoinDataApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/exchange/bank/coin/withdraw/completed"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (from != nil) {
        queryParams[@"from"] = from;
    }
    if (to != nil) {
        queryParams[@"to"] = to;
    }
    if (max != nil) {
        queryParams[@"max"] = max;
    }
    if (offset != nil) {
        queryParams[@"offset"] = offset;
    }
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
                              responseType: @"SWGTradeCoinWithdrawDataResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGTradeCoinWithdrawDataResponse*)data, error);
                                }
                           }
          ];
}

///
/// Unverified Exchange Coin Withdrawals
/// Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.
///  @param authorization API object to be added 
///
///  @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
///
///  @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
///
///  @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
///
///  @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGTradeCoinWithdrawDataResponse*
///
-(NSNumber*) v1userexchangebankcoinwithdrawunverifiedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGTradeCoinWithdrawDataResponse* output, NSError* error)) handler {
    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kSWGExchangeBankCoinDataApiErrorDomain code:kSWGExchangeBankCoinDataApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/exchange/bank/coin/withdraw/unverified"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (from != nil) {
        queryParams[@"from"] = from;
    }
    if (to != nil) {
        queryParams[@"to"] = to;
    }
    if (max != nil) {
        queryParams[@"max"] = max;
    }
    if (offset != nil) {
        queryParams[@"offset"] = offset;
    }
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
                              responseType: @"SWGTradeCoinWithdrawDataResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGTradeCoinWithdrawDataResponse*)data, error);
                                }
                           }
          ];
}

///
/// Verified Exchange Coin Withdrawals
/// Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.
///  @param authorization API object to be added 
///
///  @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
///
///  @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
///
///  @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
///
///  @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
///
///  @param accept JSON, XML or CSV can be returned (Optional) (optional)
///
///  @returns SWGTradeCoinWithdrawDataResponse*
///
-(NSNumber*) v1userexchangebankcoinwithdrawverifiedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGTradeCoinWithdrawDataResponse* output, NSError* error)) handler {
    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kSWGExchangeBankCoinDataApiErrorDomain code:kSWGExchangeBankCoinDataApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1/user/exchange/bank/coin/withdraw/verified"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (from != nil) {
        queryParams[@"from"] = from;
    }
    if (to != nil) {
        queryParams[@"to"] = to;
    }
    if (max != nil) {
        queryParams[@"max"] = max;
    }
    if (offset != nil) {
        queryParams[@"offset"] = offset;
    }
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
                              responseType: @"SWGTradeCoinWithdrawDataResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGTradeCoinWithdrawDataResponse*)data, error);
                                }
                           }
          ];
}



@end
