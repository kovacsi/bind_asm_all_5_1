#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_FieldNode : NSObject
+ (x_org_objectweb_asm_tree_FieldNode*) valueWithIntWithStringWithStringWithStringWithObject:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3 :(NSObject*) arg4;
+ (x_org_objectweb_asm_tree_FieldNode*) valueWithIntWithIntWithStringWithStringWithStringWithObject:(int) arg0 :(int) arg1 :(NSString*) arg2 :(NSString*) arg3 :(NSString*) arg4 :(NSObject*) arg5;
- (id) visitAnnotationWithStringWithBoolean:(NSString*) arg0 :(bool) arg1;
- (id) visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (void) visitAttributeWithAttribute:(id) arg0;
- (void) visitEnd;
- (void) checkWithInt:(int) arg0;
- (void) acceptWithClassVisitor:(id) arg0;
@end
