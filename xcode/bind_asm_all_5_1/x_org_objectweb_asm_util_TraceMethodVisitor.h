#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_util_TraceMethodVisitor : NSObject
+ (x_org_objectweb_asm_util_TraceMethodVisitor*) valueWithPrinter:(id) arg0;
+ (x_org_objectweb_asm_util_TraceMethodVisitor*) valueWithMethodVisitorWithPrinter:(id) arg0 :(id) arg1;
- (void) visitParameterWithStringWithInt:(NSString*) arg0 :(int) arg1;
- (id) visitAnnotationWithStringWithBoolean:(NSString*) arg0 :(bool) arg1;
- (id) visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (void) visitAttributeWithAttribute:(id) arg0;
- (id) visitAnnotationDefault;
- (id) visitParameterAnnotationWithIntWithStringWithBoolean:(int) arg0 :(NSString*) arg1 :(bool) arg2;
- (void) visitCode;
- (void) visitFrameWithIntWithIntWithObjectWithIntWithObject:(int) arg0 :(int) arg1 :(id) arg2 :(int) arg3 :(id) arg4;
- (void) visitInsnWithInt:(int) arg0;
- (void) visitIntInsnWithIntWithInt:(int) arg0 :(int) arg1;
- (void) visitVarInsnWithIntWithInt:(int) arg0 :(int) arg1;
- (void) visitTypeInsnWithIntWithString:(int) arg0 :(NSString*) arg1;
- (void) visitFieldInsnWithIntWithStringWithStringWithString:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3;
- (void) visitMethodInsnWithIntWithStringWithStringWithString:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3;
- (void) visitMethodInsnWithIntWithStringWithStringWithStringWithBoolean:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3 :(bool) arg4;
- (void) visitInvokeDynamicInsnWithStringWithStringWithHandleWithObject:(NSString*) arg0 :(NSString*) arg1 :(id) arg2 :(id) arg3;
- (void) visitJumpInsnWithIntWithLabel:(int) arg0 :(id) arg1;
- (void) visitLabelWithLabel:(id) arg0;
- (void) visitLdcInsnWithObject:(NSObject*) arg0;
- (void) visitIincInsnWithIntWithInt:(int) arg0 :(int) arg1;
- (void) visitTableSwitchInsnWithIntWithIntWithLabelWithLabel:(int) arg0 :(int) arg1 :(id) arg2 :(id) arg3;
- (void) visitLookupSwitchInsnWithLabelWithIntWithLabel:(id) arg0 :(id) arg1 :(id) arg2;
- (void) visitMultiANewArrayInsnWithStringWithInt:(NSString*) arg0 :(int) arg1;
- (id) visitInsnAnnotationWithIntWithTypePathWithStringWithBoolean:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (void) visitTryCatchBlockWithLabelWithLabelWithLabelWithString:(id) arg0 :(id) arg1 :(id) arg2 :(NSString*) arg3;
- (id) visitTryCatchAnnotationWithIntWithTypePathWithStringWithBoolean:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (void) visitLocalVariableWithStringWithStringWithStringWithLabelWithLabelWithInt:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2 :(id) arg3 :(id) arg4 :(int) arg5;
- (id) visitLocalVariableAnnotationWithIntWithTypePathWithLabelWithLabelWithIntWithStringWithBoolean:(int) arg0 :(id) arg1 :(id) arg2 :(id) arg3 :(id) arg4 :(NSString*) arg5 :(bool) arg6;
- (void) visitLineNumberWithIntWithLabel:(int) arg0 :(id) arg1;
- (void) visitMaxsWithIntWithInt:(int) arg0 :(int) arg1;
- (void) visitEnd;
@end
