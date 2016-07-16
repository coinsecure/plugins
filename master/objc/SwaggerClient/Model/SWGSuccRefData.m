#import "SWGSuccRefData.h"

@implementation SWGSuccRefData

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.emailVerified = @0;
    self.kycComplete = @0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"refPercent": @"refPercent", @"time": @"time", @"refID": @"refID", @"emailVerified": @"emailVerified", @"kycComplete": @"kycComplete", @"btcEarned": @"btcEarned", @"fiatEarned": @"fiatEarned" }];
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
