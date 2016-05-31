#import <Foundation/Foundation.h>
#import "org_objectweb_asm_TypePath.h"
#import "org_objectweb_asm_Attribute.h"
#import "org_objectweb_asm_Handle.h"
#import "org_objectweb_asm_Label.h"

@interface org_objectweb_asm_util_ASMifier : NSObject

+ (org_objectweb_asm_util_ASMifier*)value;
+ (void)mainWithString:(id)arg0;
- (void)visitWithInt:(int)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withString:(id)arg5;
- (void)visitSourceWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (void)visitOuterClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (org_objectweb_asm_util_ASMifier*)visitClassAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (org_objectweb_asm_util_ASMifier*)visitClassTypeAnnotationWithInt:(int)arg0 withTypePath:(org_objectweb_asm_TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitClassAttributeWithAttribute:(org_objectweb_asm_Attribute*)arg0;
- (void)visitInnerClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withInt:(int)arg3;
- (org_objectweb_asm_util_ASMifier*)visitFieldWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withObject:(id)arg4;
- (org_objectweb_asm_util_ASMifier*)visitMethodWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(id)arg4;
- (void)visitClassEnd;
- (void)visitWithString:(NSString*)arg0 withObject:(id)arg1;
- (void)visitEnumWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (org_objectweb_asm_util_ASMifier*)visitAnnotationWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (org_objectweb_asm_util_ASMifier*)visitArrayWithString:(NSString*)arg0;
- (void)visitAnnotationEnd;
- (org_objectweb_asm_util_ASMifier*)visitFieldAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (org_objectweb_asm_util_ASMifier*)visitFieldTypeAnnotationWithInt:(int)arg0 withTypePath:(org_objectweb_asm_TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitFieldAttributeWithAttribute:(org_objectweb_asm_Attribute*)arg0;
- (void)visitFieldEnd;
- (void)visitParameterWithString:(NSString*)arg0 withInt:(int)arg1;
- (org_objectweb_asm_util_ASMifier*)visitAnnotationDefault;
- (org_objectweb_asm_util_ASMifier*)visitMethodAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (org_objectweb_asm_util_ASMifier*)visitMethodTypeAnnotationWithInt:(int)arg0 withTypePath:(org_objectweb_asm_TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (org_objectweb_asm_util_ASMifier*)visitParameterAnnotationWithInt:(int)arg0 withString:(NSString*)arg1 withBoolean:(bool)arg2;
- (void)visitMethodAttributeWithAttribute:(org_objectweb_asm_Attribute*)arg0;
- (void)visitCode;
- (void)visitFrameWithInt:(int)arg0 withInt:(int)arg1 withObject:(id)arg2 withInt:(int)arg3 withObject:(id)arg4;
- (void)visitInsnWithInt:(int)arg0;
- (void)visitIntInsnWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitVarInsnWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitTypeInsnWithInt:(int)arg0 withString:(NSString*)arg1;
- (void)visitFieldInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
- (void)visitMethodInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
- (void)visitMethodInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4;
- (void)visitInvokeDynamicInsnWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(org_objectweb_asm_Handle*)arg2 withObject:(id)arg3;
- (void)visitJumpInsnWithInt:(int)arg0 withLabel:(org_objectweb_asm_Label*)arg1;
- (void)visitLabelWithLabel:(org_objectweb_asm_Label*)arg0;
- (void)visitLdcInsnWithObject:(id)arg0;
- (void)visitIincInsnWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitTableSwitchInsnWithInt:(int)arg0 withInt:(int)arg1 withLabel:(org_objectweb_asm_Label*)arg2 withLabel:(id)arg3;
- (void)visitLookupSwitchInsnWithLabel:(org_objectweb_asm_Label*)arg0 withInt:(id)arg1 withLabel:(id)arg2;
- (void)visitMultiANewArrayInsnWithString:(NSString*)arg0 withInt:(int)arg1;
- (org_objectweb_asm_util_ASMifier*)visitInsnAnnotationWithInt:(int)arg0 withTypePath:(org_objectweb_asm_TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitTryCatchBlockWithLabel:(org_objectweb_asm_Label*)arg0 withLabel:(org_objectweb_asm_Label*)arg1 withLabel:(org_objectweb_asm_Label*)arg2 withString:(NSString*)arg3;
- (org_objectweb_asm_util_ASMifier*)visitTryCatchAnnotationWithInt:(int)arg0 withTypePath:(org_objectweb_asm_TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitLocalVariableWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withLabel:(org_objectweb_asm_Label*)arg3 withLabel:(org_objectweb_asm_Label*)arg4 withInt:(int)arg5;
- (void)visitLineNumberWithInt:(int)arg0 withLabel:(org_objectweb_asm_Label*)arg1;
- (void)visitMaxsWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitMethodEnd;
- (org_objectweb_asm_util_ASMifier*)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (org_objectweb_asm_util_ASMifier*)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(org_objectweb_asm_TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (org_objectweb_asm_util_ASMifier*)visitTypeAnnotationWithString:(NSString*)arg0 withInt:(int)arg1 withTypePath:(org_objectweb_asm_TypePath*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4;
- (void)visitAttributeWithAttribute:(org_objectweb_asm_Attribute*)arg0;

@end