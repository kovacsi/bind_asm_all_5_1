#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_util_CheckAnnotationAdapter : NSObject
+ (x_org_objectweb_asm_util_CheckAnnotationAdapter*) valueWithAnnotationVisitor:(id) arg0;
- (void) visitWithStringWithObject:(NSString*) arg0 :(NSObject*) arg1;
- (void) visitEnumWithStringWithStringWithString:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2;
- (id) visitAnnotationWithStringWithString:(NSString*) arg0 :(NSString*) arg1;
- (id) visitArrayWithString:(NSString*) arg0;
- (void) visitEnd;
@end
