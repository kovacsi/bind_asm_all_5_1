#import "org_objectweb_asm_commons_InstructionAdapter.h"

@implementation org_objectweb_asm_commons_InstructionAdapter

- (void)visitInsnWithInt:(int)arg0 {

}

- (void)visitIntInsnWithInt:(int)arg0 withInt:(int)arg1 {

}

- (void)visitVarInsnWithInt:(int)arg0 withInt:(int)arg1 {

}

- (void)visitTypeInsnWithInt:(int)arg0 withString:(NSString*)arg1 {

}

- (void)visitFieldInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 {

}

- (void)visitMethodInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 {

}

- (void)visitMethodInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4 {

}

- (void)visitInvokeDynamicInsnWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(org_objectweb_asm_Handle*)arg2 withObject:(id)arg3 {

}

- (void)visitJumpInsnWithInt:(int)arg0 withLabel:(org_objectweb_asm_Label*)arg1 {

}

- (void)visitLabelWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)visitLdcInsnWithObject:(id)arg0 {

}

- (void)visitIincInsnWithInt:(int)arg0 withInt:(int)arg1 {

}

- (void)visitTableSwitchInsnWithInt:(int)arg0 withInt:(int)arg1 withLabel:(org_objectweb_asm_Label*)arg2 withLabel:(id)arg3 {

}

- (void)visitLookupSwitchInsnWithLabel:(org_objectweb_asm_Label*)arg0 withInt:(id)arg1 withLabel:(id)arg2 {

}

- (void)visitMultiANewArrayInsnWithString:(NSString*)arg0 withInt:(int)arg1 {

}

- (void)nop {

}

- (void)aconstWithObject:(id)arg0 {

}

- (void)iconstWithInt:(int)arg0 {

}

- (void)lconstWithLong:(long)arg0 {

}

- (void)fconstWithFloat:(float)arg0 {

}

- (void)dconstWithDouble:(double)arg0 {

}

- (void)tconstWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)hconstWithHandle:(org_objectweb_asm_Handle*)arg0 {

}

- (void)loadWithInt:(int)arg0 withType:(org_objectweb_asm_Type*)arg1 {

}

- (void)aloadWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)storeWithInt:(int)arg0 withType:(org_objectweb_asm_Type*)arg1 {

}

- (void)astoreWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)pop {

}

- (void)pop2 {

}

- (void)dup {

}

- (void)dup2 {

}

- (void)dupX1 {

}

- (void)dupX2 {

}

- (void)dup2X1 {

}

- (void)dup2X2 {

}

- (void)swap {

}

- (void)addWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)subWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)mulWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)divWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)remWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)negWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)shlWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)shrWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)ushrWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)andWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)orWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)xorWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)iincWithInt:(int)arg0 withInt:(int)arg1 {

}

- (void)castWithType:(org_objectweb_asm_Type*)arg0 withType:(org_objectweb_asm_Type*)arg1 {

}

- (void)lcmp {

}

- (void)cmplWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)cmpgWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)ifeqWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ifneWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ifltWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ifgeWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ifgtWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ifleWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ificmpeqWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ificmpneWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ificmpltWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ificmpgeWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ificmpgtWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ificmpleWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ifacmpeqWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ifacmpneWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)goToWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)jsrWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)retWithInt:(int)arg0 {

}

- (void)tableswitchWithInt:(int)arg0 withInt:(int)arg1 withLabel:(org_objectweb_asm_Label*)arg2 withLabel:(id)arg3 {

}

- (void)lookupswitchWithLabel:(org_objectweb_asm_Label*)arg0 withInt:(id)arg1 withLabel:(id)arg2 {

}

- (void)areturnWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)getstaticWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 {

}

- (void)putstaticWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 {

}

- (void)getfieldWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 {

}

- (void)putfieldWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 {

}

- (void)invokevirtualWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 {

}

- (void)invokevirtualWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3 {

}

- (void)invokespecialWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 {

}

- (void)invokespecialWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3 {

}

- (void)invokestaticWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 {

}

- (void)invokestaticWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3 {

}

- (void)invokeinterfaceWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 {

}

- (void)invokedynamicWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(org_objectweb_asm_Handle*)arg2 withObject:(id)arg3 {

}

- (void)anewWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)newarrayWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)arraylength {

}

- (void)athrow {

}

- (void)checkcastWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)instanceOfWithType:(org_objectweb_asm_Type*)arg0 {

}

- (void)monitorenter {

}

- (void)monitorexit {

}

- (void)multianewarrayWithString:(NSString*)arg0 withInt:(int)arg1 {

}

- (void)ifnullWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)ifnonnullWithLabel:(org_objectweb_asm_Label*)arg0 {

}

- (void)markWithLabel:(org_objectweb_asm_Label*)arg0 {

}

@end
