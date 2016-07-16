#import "SWGWalletSummaryData.h"

@implementation SWGWalletSummaryData

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.hasWalletNetki = @0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"walletConfirmedBalance": @"walletConfirmedBalance", @"walletUncofirmedBalance": @"walletUncofirmedBalance", @"hasWalletNetki": @"hasWalletNetki", @"walletNetki": @"walletNetki", @"walletNetkiAddress": @"walletNetkiAddress", @"walletNetkiWalletId": @"walletNetkiWalletId" }];
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
