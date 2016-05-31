#import <Foundation/Foundation.h>
#import "org_objectweb_asm_tree_LabelNode.h"

@interface org_objectweb_asm_tree_TableSwitchInsnNode : NSObject

+ (org_objectweb_asm_tree_TableSwitchInsnNode*)valueWithInt:(int)arg0 withInt:(int)arg1 withLabelNode:(org_objectweb_asm_tree_LabelNode*)arg2 withLabelNode:(id)arg3;
- (int)getType;

@end