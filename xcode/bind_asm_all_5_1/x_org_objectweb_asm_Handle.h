#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_Handle : NSObject
+ (x_org_objectweb_asm_Handle*) valueWithIntWithStringWithStringWithString:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3;
+ (x_org_objectweb_asm_Handle*) valueWithIntWithStringWithStringWithStringWithBoolean:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3 :(bool) arg4;
- (int) getTag;
- (NSString*) getOwner;
- (NSString*) getName;
- (NSString*) getDesc;
- (bool) isInterface;
- (bool) equalsWithObject:(NSObject*) arg0;
- (int) hashCode;
- (NSString*) toString;
@end
