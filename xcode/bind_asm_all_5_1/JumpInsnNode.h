#import <Foundation/Foundation.h>
#import "LabelNode.h"

@interface JumpInsnNode : NSObject

+ (JumpInsnNode*)valueWithInt:(int)arg0 withLabelNode:(LabelNode*)arg1;
- (void)setOpcodeWithInt:(int)arg0;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end