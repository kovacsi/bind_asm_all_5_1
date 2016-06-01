#import <Foundation/Foundation.h>
#import "JBLabelNode.h"


@interface JBJumpInsnNode : NSObject

+ (JBJumpInsnNode*)valueWithInt:(int)arg0 withLabelNode:(JBLabelNode*)arg1;
- (void)setOpcodeWithInt:(int)arg0;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end
