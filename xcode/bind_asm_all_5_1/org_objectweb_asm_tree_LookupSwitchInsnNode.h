#import <Foundation/Foundation.h>
#import "org_objectweb_asm_tree_LabelNode.h"

@interface org_objectweb_asm_tree_LookupSwitchInsnNode : NSObject

+ (org_objectweb_asm_tree_LookupSwitchInsnNode*)valueWithLabelNode:(org_objectweb_asm_tree_LabelNode*)arg0 withInt:(id)arg1 withLabelNode:(id)arg2;
- (int)getType;

@end