#import <Foundation/Foundation.h>
#import "JBTypePath.h"
#import "JBAttribute.h"
#import "JBHandle.h"
#import "JBLabel.h"

#define INTERNAL_NAME 0
#define FIELD_DESCRIPTOR 1
#define FIELD_SIGNATURE 2
#define METHOD_DESCRIPTOR 3
#define METHOD_SIGNATURE 4
#define CLASS_SIGNATURE 5
#define TYPE_DECLARATION 6
#define CLASS_DECLARATION 7
#define PARAMETERS_DECLARATION 8
#define HANDLE_DESCRIPTOR 9

@interface JBTextifier : NSObject

+ (JBTextifier*)value;
+ (void)mainWithString:(id)arg0;
- (void)visitWithInt:(int)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withString:(id)arg5;
- (void)visitSourceWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (void)visitOuterClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (id)visitClassTypeAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitClassAttributeWithAttribute:(JBAttribute*)arg0;
- (void)visitInnerClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withInt:(int)arg3;
- (void)visitClassEnd;
- (void)visitWithString:(NSString*)arg0 withObject:(id)arg1;
- (void)visitEnumWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (void)visitAnnotationEnd;
- (id)visitFieldTypeAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitFieldAttributeWithAttribute:(JBAttribute*)arg0;
- (void)visitFieldEnd;
- (void)visitParameterWithString:(NSString*)arg0 withInt:(int)arg1;
- (id)visitMethodTypeAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitMethodAttributeWithAttribute:(JBAttribute*)arg0;
- (void)visitCode;
- (void)visitFrameWithInt:(int)arg0 withInt:(int)arg1 withObject:(id)arg2 withInt:(int)arg3 withObject:(id)arg4;
- (void)visitInsnWithInt:(int)arg0;
- (void)visitIntInsnWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitVarInsnWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitTypeInsnWithInt:(int)arg0 withString:(NSString*)arg1;
- (void)visitFieldInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
- (void)visitMethodInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
- (void)visitMethodInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4;
- (void)visitInvokeDynamicInsnWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(JBHandle*)arg2 withObject:(id)arg3;
- (void)visitJumpInsnWithInt:(int)arg0 withLabel:(JBLabel*)arg1;
- (void)visitLabelWithLabel:(JBLabel*)arg0;
- (void)visitLdcInsnWithObject:(id)arg0;
- (void)visitIincInsnWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitTableSwitchInsnWithInt:(int)arg0 withInt:(int)arg1 withLabel:(JBLabel*)arg2 withLabel:(id)arg3;
- (void)visitLookupSwitchInsnWithLabel:(JBLabel*)arg0 withInt:(id)arg1 withLabel:(id)arg2;
- (void)visitMultiANewArrayInsnWithString:(NSString*)arg0 withInt:(int)arg1;
- (id)visitInsnAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitTryCatchBlockWithLabel:(JBLabel*)arg0 withLabel:(JBLabel*)arg1 withLabel:(JBLabel*)arg2 withString:(NSString*)arg3;
- (id)visitTryCatchAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitLocalVariableWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withLabel:(JBLabel*)arg3 withLabel:(JBLabel*)arg4 withInt:(int)arg5;
- (id)visitLocalVariableAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withLabel:(id)arg2 withLabel:(id)arg3 withInt:(id)arg4 withString:(NSString*)arg5 withBoolean:(bool)arg6;
- (void)visitLineNumberWithInt:(int)arg0 withLabel:(JBLabel*)arg1;
- (void)visitMaxsWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitMethodEnd;
- (JBTextifier*)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (JBTextifier*)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitAttributeWithAttribute:(JBAttribute*)arg0;
- (id)visitParameterAnnotationWithInt:(int)arg0 withString:(NSString*)arg1 withBoolean:(bool)arg2;
- (id)visitMethodAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitAnnotationDefault;
- (id)visitFieldAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitArrayWithString:(NSString*)arg0;
- (id)visitAnnotationWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (id)visitMethodWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(id)arg4;
- (id)visitFieldWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withObject:(id)arg4;
- (id)visitClassAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;

@end
