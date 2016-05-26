#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_InsnNode : NSObject
+ (x_org_objectweb_asm_tree_InsnNode*) valueWithInt:(int) arg0;
- (int) getType;
- (void) acceptWithMethodVisitor:(id) arg0;
- (id) cloneWithMap:(id) arg0;
@end
