#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_commons_Method : NSObject
+ (x_org_objectweb_asm_commons_Method*) valueWithStringWithString:(NSString*) arg0 :(NSString*) arg1;
+ (x_org_objectweb_asm_commons_Method*) valueWithStringWithTypeWithType:(NSString*) arg0 :(id) arg1 :(id) arg2;
+ (id) getMethodWithMethod:(id) arg0;
+ (id) getMethodWithConstructor:(id) arg0;
+ (id) getMethodWithString:(NSString*) arg0;
+ (id) getMethodWithStringWithBoolean:(NSString*) arg0 :(bool) arg1;
- (NSString*) getName;
- (NSString*) getDescriptor;
- (id) getReturnType;
- (id) getArgumentTypes;
- (NSString*) toString;
- (bool) equalsWithObject:(NSObject*) arg0;
- (int) hashCode;
@end
