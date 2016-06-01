#import <Foundation/Foundation.h>
#import "Type.h"
#import "BasicValue.h"

@interface SimpleVerifier : NSObject

+ (SimpleVerifier*)value;
+ (SimpleVerifier*)valueWithType:(Type*)arg0 withType:(Type*)arg1 withBoolean:(bool)arg2;
+ (SimpleVerifier*)valueWithType:(Type*)arg0 withType:(Type*)arg1 withList:(id)arg2 withBoolean:(bool)arg3;
- (void)setClassLoaderWithClassLoader:(id)arg0;
- (BasicValue*)mergeWithBasicValue:(BasicValue*)arg0 withBasicValue:(BasicValue*)arg1;
- (id)mergeWithValue:(id)arg0 withValue:(id)arg1;
- (id)newValueWithType:(Type*)arg0;

@end