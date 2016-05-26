#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_InvokeDynamicInsnNode : NSObject
+ (x_org_objectweb_asm_tree_InvokeDynamicInsnNode*) valueWithStringWithStringWithHandleWithObject:(NSString*) arg0 :(NSString*) arg1 :(id) arg2 :(id) arg3;
- (int) getType;
- (void) acceptWithMethodVisitor:(id) arg0;
- (id) cloneWithMap:(id) arg0;
@end
