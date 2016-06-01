#import <Foundation/Foundation.h>
#import "JBType.h"
#import "JBBasicValue.h"


@interface JBSimpleVerifier : NSObject

+ (JBSimpleVerifier*)value;
+ (JBSimpleVerifier*)valueWithType:(JBType*)arg0 withType:(JBType*)arg1 withBoolean:(bool)arg2;
+ (JBSimpleVerifier*)valueWithType:(JBType*)arg0 withType:(JBType*)arg1 withList:(id)arg2 withBoolean:(bool)arg3;
- (void)setClassLoaderWithClassLoader:(id)arg0;
- (JBBasicValue*)mergeWithBasicValue:(JBBasicValue*)arg0 withBasicValue:(JBBasicValue*)arg1;
- (id)mergeWithValue:(id)arg0 withValue:(id)arg1;
- (id)newValueWithType:(JBType*)arg0;

@end
