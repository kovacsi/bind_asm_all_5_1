#import <Foundation/Foundation.h>
#import "JBLabelNode.h"


@interface JBLookupSwitchInsnNode : NSObject

+ (JBLookupSwitchInsnNode*)valueWithLabelNode:(JBLabelNode*)arg0 withInt:(id)arg1 withLabelNode:(id)arg2;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end
