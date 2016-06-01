#import <Foundation/Foundation.h>
#import "JBHandle.h"
#import "JBLabel.h"
#import "JBType.h"


@interface JBInstructionAdapter : NSObject

+ (JBInstructionAdapter*)valueWithMethodVisitor:(id)arg0;
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
- (void)nop;
- (void)aconstWithObject:(id)arg0;
- (void)iconstWithInt:(int)arg0;
- (void)lconstWithLong:(long)arg0;
- (void)fconstWithFloat:(float)arg0;
- (void)dconstWithDouble:(double)arg0;
- (void)tconstWithType:(JBType*)arg0;
- (void)hconstWithHandle:(JBHandle*)arg0;
- (void)loadWithInt:(int)arg0 withType:(JBType*)arg1;
- (void)aloadWithType:(JBType*)arg0;
- (void)storeWithInt:(int)arg0 withType:(JBType*)arg1;
- (void)astoreWithType:(JBType*)arg0;
- (void)pop;
- (void)pop2;
- (void)dup;
- (void)dup2;
- (void)dupX1;
- (void)dupX2;
- (void)dup2X1;
- (void)dup2X2;
- (void)swap;
- (void)addWithType:(JBType*)arg0;
- (void)subWithType:(JBType*)arg0;
- (void)mulWithType:(JBType*)arg0;
- (void)divWithType:(JBType*)arg0;
- (void)remWithType:(JBType*)arg0;
- (void)negWithType:(JBType*)arg0;
- (void)shlWithType:(JBType*)arg0;
- (void)shrWithType:(JBType*)arg0;
- (void)ushrWithType:(JBType*)arg0;
- (void)andWithType:(JBType*)arg0;
- (void)orWithType:(JBType*)arg0;
- (void)xorWithType:(JBType*)arg0;
- (void)iincWithInt:(int)arg0 withInt:(int)arg1;
- (void)castWithType:(JBType*)arg0 withType:(JBType*)arg1;
- (void)lcmp;
- (void)cmplWithType:(JBType*)arg0;
- (void)cmpgWithType:(JBType*)arg0;
- (void)ifeqWithLabel:(JBLabel*)arg0;
- (void)ifneWithLabel:(JBLabel*)arg0;
- (void)ifltWithLabel:(JBLabel*)arg0;
- (void)ifgeWithLabel:(JBLabel*)arg0;
- (void)ifgtWithLabel:(JBLabel*)arg0;
- (void)ifleWithLabel:(JBLabel*)arg0;
- (void)ificmpeqWithLabel:(JBLabel*)arg0;
- (void)ificmpneWithLabel:(JBLabel*)arg0;
- (void)ificmpltWithLabel:(JBLabel*)arg0;
- (void)ificmpgeWithLabel:(JBLabel*)arg0;
- (void)ificmpgtWithLabel:(JBLabel*)arg0;
- (void)ificmpleWithLabel:(JBLabel*)arg0;
- (void)ifacmpeqWithLabel:(JBLabel*)arg0;
- (void)ifacmpneWithLabel:(JBLabel*)arg0;
- (void)goToWithLabel:(JBLabel*)arg0;
- (void)jsrWithLabel:(JBLabel*)arg0;
- (void)retWithInt:(int)arg0;
- (void)tableswitchWithInt:(int)arg0 withInt:(int)arg1 withLabel:(JBLabel*)arg2 withLabel:(id)arg3;
- (void)lookupswitchWithLabel:(JBLabel*)arg0 withInt:(id)arg1 withLabel:(id)arg2;
- (void)areturnWithType:(JBType*)arg0;
- (void)getstaticWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (void)putstaticWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (void)getfieldWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (void)putfieldWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (void)invokevirtualWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (void)invokevirtualWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)invokespecialWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (void)invokespecialWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)invokestaticWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (void)invokestaticWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)invokeinterfaceWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (void)invokedynamicWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(JBHandle*)arg2 withObject:(id)arg3;
- (void)anewWithType:(JBType*)arg0;
- (void)newarrayWithType:(JBType*)arg0;
- (void)arraylength;
- (void)athrow;
- (void)checkcastWithType:(JBType*)arg0;
- (void)instanceOfWithType:(JBType*)arg0;
- (void)monitorenter;
- (void)monitorexit;
- (void)multianewarrayWithString:(NSString*)arg0 withInt:(int)arg1;
- (void)ifnullWithLabel:(JBLabel*)arg0;
- (void)ifnonnullWithLabel:(JBLabel*)arg0;
- (void)markWithLabel:(JBLabel*)arg0;

@end
