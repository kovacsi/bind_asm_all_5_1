#import <Foundation/Foundation.h>

@interface org_objectweb_asm_tree_TypeInsnNode : NSObject

+ (org_objectweb_asm_tree_TypeInsnNode*)valueWithInt:(int)arg0 withString:(NSString*)arg1;
- (void)setOpcodeWithInt:(int)arg0;
- (int)getType;

@end