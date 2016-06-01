#import <Foundation/Foundation.h>

@interface VarInsnNode : NSObject

+ (VarInsnNode*)valueWithInt:(int)arg0 withInt:(int)arg1;
- (void)setOpcodeWithInt:(int)arg0;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end