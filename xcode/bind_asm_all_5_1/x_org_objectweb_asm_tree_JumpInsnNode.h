#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_JumpInsnNode : NSObject
+ (x_org_objectweb_asm_tree_JumpInsnNode*) valueWithIntWithLabelNode:(int) arg0 :(id) arg1;
- (void) setOpcodeWithInt:(int) arg0;
- (int) getType;
- (void) acceptWithMethodVisitor:(id) arg0;
- (id) cloneWithMap:(id) arg0;
@end
