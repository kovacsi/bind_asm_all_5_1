#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_util_TraceAnnotationVisitor : NSObject
+ (x_org_objectweb_asm_util_TraceAnnotationVisitor*) valueWithPrinter:(id) arg0;
+ (x_org_objectweb_asm_util_TraceAnnotationVisitor*) valueWithAnnotationVisitorWithPrinter:(id) arg0 :(id) arg1;
- (void) visitWithStringWithObject:(NSString*) arg0 :(NSObject*) arg1;
- (void) visitEnumWithStringWithStringWithString:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2;
- (id) visitAnnotationWithStringWithString:(NSString*) arg0 :(NSString*) arg1;
- (id) visitArrayWithString:(NSString*) arg0;
- (void) visitEnd;
@end
