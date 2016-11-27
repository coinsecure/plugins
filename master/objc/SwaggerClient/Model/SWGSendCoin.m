#import "SWGSendCoin.h"

@implementation SWGSendCoin

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"satoshis": @"satoshis", @"toAddr": @"toAddr", @"msg": @"msg", @"pin": @"pin", @"fees": @"fees" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"msg", @"pin", @"fees"];
  return [optionalProperties containsObject:propertyName];
}

@end
