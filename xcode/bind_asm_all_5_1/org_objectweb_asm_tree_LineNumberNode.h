#import <Foundation/Foundation.h>
#import "org_objectweb_asm_tree_LabelNode.h"

@interface org_objectweb_asm_tree_LineNumberNode : NSObject

+ (org_objectweb_asm_tree_LineNumberNode*)valueWithInt:(int)arg0 withLabelNode:(org_objectweb_asm_tree_LabelNode*)arg1;
- (int)getType;

@end