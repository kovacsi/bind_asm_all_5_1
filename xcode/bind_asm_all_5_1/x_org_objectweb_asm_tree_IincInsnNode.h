#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_IincInsnNode : NSObject
+ (x_org_objectweb_asm_tree_IincInsnNode*) valueWithIntWithInt:(int) arg0 :(int) arg1;
- (int) getType;
- (void) acceptWithMethodVisitor:(id) arg0;
- (id) cloneWithMap:(id) arg0;
@end
