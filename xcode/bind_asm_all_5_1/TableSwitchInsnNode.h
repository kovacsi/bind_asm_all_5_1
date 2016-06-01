#import <Foundation/Foundation.h>
#import "LabelNode.h"

@interface TableSwitchInsnNode : NSObject

+ (TableSwitchInsnNode*)valueWithInt:(int)arg0 withInt:(int)arg1 withLabelNode:(LabelNode*)arg2 withLabelNode:(id)arg3;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end