#import "SWGBankSummaryData.h"

@implementation SWGBankSummaryData

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.hasTradeNetki = @0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"pendingCoinBalance": @"pendingCoinBalance", @"pendingFiatBalance": @"pendingFiatBalance", @"availableCoinBalance": @"availableCoinBalance", @"availableFiatBalance": @"availableFiatBalance", @"totalCoinBalance": @"totalCoinBalance", @"totalFiatBalance": @"totalFiatBalance", @"coinFeePercentage": @"coinFeePercentage", @"fiatFeePercentage": @"fiatFeePercentage", @"bankLinkStatus": @"bankLinkStatus", @"hasTradeNetki": @"hasTradeNetki", @"tradeNetkiName": @"tradeNetkiName", @"tradeNetkiAddress": @"tradeNetkiAddress" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[];
  return [optionalProperties containsObject:propertyName];
}

@end
