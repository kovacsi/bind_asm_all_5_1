#import <Foundation/Foundation.h>

@interface org_objectweb_asm_tree_MethodInsnNode : NSObject

+ (org_objectweb_asm_tree_MethodInsnNode*)valueWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
+ (org_objectweb_asm_tree_MethodInsnNode*)valueWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4;
- (void)setOpcodeWithInt:(int)arg0;
- (int)getType;

@end