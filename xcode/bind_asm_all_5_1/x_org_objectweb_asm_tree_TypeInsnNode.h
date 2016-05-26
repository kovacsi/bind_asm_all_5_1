#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_TypeInsnNode : NSObject
+ (x_org_objectweb_asm_tree_TypeInsnNode*) valueWithIntWithString:(int) arg0 :(NSString*) arg1;
- (void) setOpcodeWithInt:(int) arg0;
- (int) getType;
- (void) acceptWithMethodVisitor:(id) arg0;
- (id) cloneWithMap:(id) arg0;
@end
