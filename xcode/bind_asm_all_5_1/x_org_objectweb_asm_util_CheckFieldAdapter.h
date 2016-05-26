#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_util_CheckFieldAdapter : NSObject
+ (x_org_objectweb_asm_util_CheckFieldAdapter*) valueWithFieldVisitor:(id) arg0;
- (id) visitAnnotationWithStringWithBoolean:(NSString*) arg0 :(bool) arg1;
- (id) visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (void) visitAttributeWithAttribute:(id) arg0;
- (void) visitEnd;
@end
