#import <Foundation/Foundation.h>
#import "LabelNode.h"

@interface LookupSwitchInsnNode : NSObject

+ (LookupSwitchInsnNode*)valueWithLabelNode:(LabelNode*)arg0 withInt:(id)arg1 withLabelNode:(id)arg2;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end