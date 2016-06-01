#import <Foundation/Foundation.h>
#import "TypePath.h"
#import "Handle.h"
#import "Label.h"

@interface MethodRemapper : NSObject

+ (MethodRemapper*)valueWithMethodVisitor:(id)arg0 withRemapper:(id)arg1;
- (id)visitAnnotationDefault;
- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (id)visitParameterAnnotationWithInt:(int)arg0 withString:(NSString*)arg1 withBoolean:(bool)arg2;
- (void)visitFrameWithInt:(int)arg0 withInt:(int)arg1 withObject:(id)arg2 withInt:(int)arg3 withObject:(id)arg4;
- (void)visitFieldInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
- (void)visitMethodInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
- (void)visitMethodInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4;
- (void)visitInvokeDynamicInsnWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(org_objectweb_asm_Handle*)arg2 withObject:(id)arg3;
- (void)visitTypeInsnWithInt:(int)arg0 withString:(NSString*)arg1;
- (void)visitLdcInsnWithObject:(id)arg0;
- (void)visitMultiANewArrayInsnWithString:(NSString*)arg0 withInt:(int)arg1;
- (id)visitInsnAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitTryCatchBlockWithLabel:(Label*)arg0 withLabel:(Label*)arg1 withLabel:(Label*)arg2 withString:(NSString*)arg3;
- (id)visitTryCatchAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitLocalVariableWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withLabel:(Label*)arg3 withLabel:(Label*)arg4 withInt:(int)arg5;
- (id)visitLocalVariableAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withLabel:(id)arg2 withLabel:(id)arg3 withInt:(id)arg4 withString:(NSString*)arg5 withBoolean:(bool)arg6;

@end