#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_FrameNode : NSObject
+ (x_org_objectweb_asm_tree_FrameNode*) valueWithIntWithIntWithObjectWithIntWithObject:(int) arg0 :(int) arg1 :(id) arg2 :(int) arg3 :(id) arg4;
- (int) getType;
- (void) acceptWithMethodVisitor:(id) arg0;
- (id) cloneWithMap:(id) arg0;
@end
