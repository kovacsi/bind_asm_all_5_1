#import <Foundation/Foundation.h>
#import "JBSAXAdapter.h"
#import "JBHandle.h"
#import "JBLabel.h"
#import "JBTypePath.h"


@interface JBSAXCodeAdapter : NSObject

+ (JBSAXCodeAdapter*)valueWithSAXAdapter:(JBSAXAdapter*)arg0 withInt:(int)arg1;
- (void)visitParameterWithString:(NSString*)arg0 withInt:(int)arg1;
- (void)visitCode;
- (void)visitFrameWithInt:(int)arg0 withInt:(int)arg1 withObject:(id)arg2 withInt:(int)arg3 withObject:(id)arg4;
- (void)visitInsnWithInt:(int)arg0;
- (void)visitIntInsnWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitVarInsnWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitTypeInsnWithInt:(int)arg0 withString:(NSString*)arg1;
- (void)visitFieldInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
- (void)visitMethodInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4;
- (void)visitInvokeDynamicInsnWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(JBHandle*)arg2 withObject:(id)arg3;
- (void)visitJumpInsnWithInt:(int)arg0 withLabel:(JBLabel*)arg1;
- (void)visitLabelWithLabel:(JBLabel*)arg0;
- (void)visitLdcInsnWithObject:(id)arg0;
- (void)visitIincInsnWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitTableSwitchInsnWithInt:(int)arg0 withInt:(int)arg1 withLabel:(JBLabel*)arg2 withLabel:(id)arg3;
- (void)visitLookupSwitchInsnWithLabel:(JBLabel*)arg0 withInt:(id)arg1 withLabel:(id)arg2;
- (void)visitMultiANewArrayInsnWithString:(NSString*)arg0 withInt:(int)arg1;
- (void)visitTryCatchBlockWithLabel:(JBLabel*)arg0 withLabel:(JBLabel*)arg1 withLabel:(JBLabel*)arg2 withString:(NSString*)arg3;
- (void)visitMaxsWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitLocalVariableWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withLabel:(JBLabel*)arg3 withLabel:(JBLabel*)arg4 withInt:(int)arg5;
- (void)visitLineNumberWithInt:(int)arg0 withLabel:(JBLabel*)arg1;
- (id)visitAnnotationDefault;
- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (id)visitParameterAnnotationWithInt:(int)arg0 withString:(NSString*)arg1 withBoolean:(bool)arg2;
- (id)visitInsnAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (id)visitTryCatchAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (id)visitLocalVariableAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withLabel:(id)arg2 withLabel:(id)arg3 withInt:(id)arg4 withString:(NSString*)arg5 withBoolean:(bool)arg6;
- (void)visitEnd;

@end
