#import <Foundation/Foundation.h>
#import "JBLabelNode.h"


@interface JBTableSwitchInsnNode : NSObject

+ (JBTableSwitchInsnNode*)valueWithInt:(int)arg0 withInt:(int)arg1 withLabelNode:(JBLabelNode*)arg2 withLabelNode:(id)arg3;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end
