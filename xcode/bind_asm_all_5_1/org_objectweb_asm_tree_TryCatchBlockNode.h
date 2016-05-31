#import <Foundation/Foundation.h>
#import "org_objectweb_asm_tree_LabelNode.h"

@interface org_objectweb_asm_tree_TryCatchBlockNode : NSObject

+ (org_objectweb_asm_tree_TryCatchBlockNode*)valueWithLabelNode:(org_objectweb_asm_tree_LabelNode*)arg0 withLabelNode:(org_objectweb_asm_tree_LabelNode*)arg1 withLabelNode:(org_objectweb_asm_tree_LabelNode*)arg2 withString:(NSString*)arg3;
- (void)updateIndexWithInt:(int)arg0;

@end