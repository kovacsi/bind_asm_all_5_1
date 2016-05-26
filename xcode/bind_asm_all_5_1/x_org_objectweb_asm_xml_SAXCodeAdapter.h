#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_xml_SAXCodeAdapter : NSObject
+ (x_org_objectweb_asm_xml_SAXCodeAdapter*) valueWithSAXAdapterWithInt:(id) arg0 :(int) arg1;
- (void) visitParameterWithStringWithInt:(NSString*) arg0 :(int) arg1;
- (void) visitCode;
- (void) visitFrameWithIntWithIntWithObjectWithIntWithObject:(int) arg0 :(int) arg1 :(id) arg2 :(int) arg3 :(id) arg4;
- (void) visitInsnWithInt:(int) arg0;
- (void) visitIntInsnWithIntWithInt:(int) arg0 :(int) arg1;
- (void) visitVarInsnWithIntWithInt:(int) arg0 :(int) arg1;
- (void) visitTypeInsnWithIntWithString:(int) arg0 :(NSString*) arg1;
- (void) visitFieldInsnWithIntWithStringWithStringWithString:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3;
- (void) visitMethodInsnWithIntWithStringWithStringWithStringWithBoolean:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3 :(bool) arg4;
- (void) visitInvokeDynamicInsnWithStringWithStringWithHandleWithObject:(NSString*) arg0 :(NSString*) arg1 :(id) arg2 :(id) arg3;
- (void) visitJumpInsnWithIntWithLabel:(int) arg0 :(id) arg1;
- (void) visitLabelWithLabel:(id) arg0;
- (void) visitLdcInsnWithObject:(NSObject*) arg0;
- (void) visitIincInsnWithIntWithInt:(int) arg0 :(int) arg1;
- (void) visitTableSwitchInsnWithIntWithIntWithLabelWithLabel:(int) arg0 :(int) arg1 :(id) arg2 :(id) arg3;
- (void) visitLookupSwitchInsnWithLabelWithIntWithLabel:(id) arg0 :(id) arg1 :(id) arg2;
- (void) visitMultiANewArrayInsnWithStringWithInt:(NSString*) arg0 :(int) arg1;
- (void) visitTryCatchBlockWithLabelWithLabelWithLabelWithString:(id) arg0 :(id) arg1 :(id) arg2 :(NSString*) arg3;
- (void) visitMaxsWithIntWithInt:(int) arg0 :(int) arg1;
- (void) visitLocalVariableWithStringWithStringWithStringWithLabelWithLabelWithInt:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2 :(id) arg3 :(id) arg4 :(int) arg5;
- (void) visitLineNumberWithIntWithLabel:(int) arg0 :(id) arg1;
- (id) visitAnnotationDefault;
- (id) visitAnnotationWithStringWithBoolean:(NSString*) arg0 :(bool) arg1;
- (id) visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (id) visitParameterAnnotationWithIntWithStringWithBoolean:(int) arg0 :(NSString*) arg1 :(bool) arg2;
- (id) visitInsnAnnotationWithIntWithTypePathWithStringWithBoolean:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (id) visitTryCatchAnnotationWithIntWithTypePathWithStringWithBoolean:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (id) visitLocalVariableAnnotationWithIntWithTypePathWithLabelWithLabelWithIntWithStringWithBoolean:(int) arg0 :(id) arg1 :(id) arg2 :(id) arg3 :(id) arg4 :(NSString*) arg5 :(bool) arg6;
- (void) visitEnd;
@end
