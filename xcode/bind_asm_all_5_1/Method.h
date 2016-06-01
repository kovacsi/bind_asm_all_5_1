#import <Foundation/Foundation.h>
#import "Type.h"

@interface Method : NSObject

+ (Method*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1;
+ (Method*)valueWithString:(NSString*)arg0 withType:(Type*)arg1 withType:(id)arg2;
+ (Method*)getMethodWithMethod:(id)arg0;
+ (Method*)getMethodWithConstructor:(id)arg0;
+ (Method*)getMethodWithString:(NSString*)arg0;
+ (Method*)getMethodWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (NSString*)getName;
- (NSString*)getDescriptor;
- (Type*)getReturnType;
- (id)getArgumentTypes;
- (NSString*)toString;
- (bool)equalsWithObject:(id)arg0;
- (int)hashCode;

@end