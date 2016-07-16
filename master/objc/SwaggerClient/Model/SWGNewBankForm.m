#import "SWGNewBankForm.h"

@implementation SWGNewBankForm

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"acct_nick": @"acctNick", @"name": @"name", @"ban": @"ban", @"ifsc": @"ifsc", @"message": @"message", @"banType": @"banType", @"phone": @"phone", @"otp": @"otp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"message", ];
  return [optionalProperties containsObject:propertyName];
}

@end
