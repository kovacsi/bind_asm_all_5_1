#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_AnnotationNode : NSObject
+ (x_org_objectweb_asm_tree_AnnotationNode*) valueWithString:(NSString*) arg0;
+ (x_org_objectweb_asm_tree_AnnotationNode*) valueWithIntWithString:(int) arg0 :(NSString*) arg1;
- (void) visitWithStringWithObject:(NSString*) arg0 :(NSObject*) arg1;
- (void) visitEnumWithStringWithStringWithString:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2;
- (id) visitAnnotationWithStringWithString:(NSString*) arg0 :(NSString*) arg1;
- (id) visitArrayWithString:(NSString*) arg0;
- (void) visitEnd;
- (void) checkWithInt:(int) arg0;
- (void) acceptWithAnnotationVisitor:(id) arg0;
@end
