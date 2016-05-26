#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_MethodInsnNode : NSObject
+ (x_org_objectweb_asm_tree_MethodInsnNode*) valueWithIntWithStringWithStringWithString:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3;
+ (x_org_objectweb_asm_tree_MethodInsnNode*) valueWithIntWithStringWithStringWithStringWithBoolean:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3 :(bool) arg4;
- (void) setOpcodeWithInt:(int) arg0;
- (int) getType;
- (void) acceptWithMethodVisitor:(id) arg0;
- (id) cloneWithMap:(id) arg0;
@end
