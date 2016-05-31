#import <Foundation/Foundation.h>
#import "org_objectweb_asm_Type.h"

@interface org_objectweb_asm_commons_Method : NSObject

+ (org_objectweb_asm_commons_Method*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1;
+ (org_objectweb_asm_commons_Method*)valueWithString:(NSString*)arg0 withType:(org_objectweb_asm_Type*)arg1 withType:(id)arg2;
+ (org_objectweb_asm_commons_Method*)getMethodWithMethod:(id)arg0;
+ (org_objectweb_asm_commons_Method*)getMethodWithConstructor:(id)arg0;
+ (org_objectweb_asm_commons_Method*)getMethodWithString:(NSString*)arg0;
+ (org_objectweb_asm_commons_Method*)getMethodWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (NSString*)getName;
- (NSString*)getDescriptor;
- (org_objectweb_asm_Type*)getReturnType;
- (id)getArgumentTypes;
- (NSString*)toString;
- (bool)equalsWithObject:(id)arg0;
- (int)hashCode;

@end