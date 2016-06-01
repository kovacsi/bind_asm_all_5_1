#import <Foundation/Foundation.h>
#import "Handle.h"

@interface InvokeDynamicInsnNode : NSObject

+ (InvokeDynamicInsnNode*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(org_objectweb_asm_Handle*)arg2 withObject:(id)arg3;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end