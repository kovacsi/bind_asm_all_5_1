#import <Foundation/Foundation.h>
#import "org_objectweb_asm_Handle.h"

@interface org_objectweb_asm_tree_InvokeDynamicInsnNode : NSObject

+ (org_objectweb_asm_tree_InvokeDynamicInsnNode*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(org_objectweb_asm_Handle*)arg2 withObject:(id)arg3;
- (int)getType;

@end