#import <Foundation/Foundation.h>
#import "org_objectweb_asm_tree_LabelNode.h"

@interface org_objectweb_asm_tree_JumpInsnNode : NSObject

+ (org_objectweb_asm_tree_JumpInsnNode*)valueWithInt:(int)arg0 withLabelNode:(org_objectweb_asm_tree_LabelNode*)arg1;
- (void)setOpcodeWithInt:(int)arg0;
- (int)getType;

@end