#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_util_TraceFieldVisitor : NSObject
+ (x_org_objectweb_asm_util_TraceFieldVisitor*) valueWithPrinter:(id) arg0;
+ (x_org_objectweb_asm_util_TraceFieldVisitor*) valueWithFieldVisitorWithPrinter:(id) arg0 :(id) arg1;
- (id) visitAnnotationWithStringWithBoolean:(NSString*) arg0 :(bool) arg1;
- (id) visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (void) visitAttributeWithAttribute:(id) arg0;
- (void) visitEnd;
@end
