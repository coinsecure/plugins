#import "SWGWalletSummaryDataResponse.h"

@implementation SWGWalletSummaryDataResponse

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.success = @0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"success": @"success", @"message": @"message", @"method": @"method", @"title": @"title", @"time": @"time" }];
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