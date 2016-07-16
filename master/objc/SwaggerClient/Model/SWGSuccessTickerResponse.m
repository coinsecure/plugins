#import "SWGSuccessTickerResponse.h"

@implementation SWGSuccessTickerResponse

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"lastPrice": @"lastPrice", @"timestamp": @"timestamp", @"bid": @"bid", @"ask": @"ask", @"fiatVolume": @"fiatVolume", @"coinVolume": @"coinVolume", @"open": @"open", @"high": @"high", @"low": @"low" }];
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
