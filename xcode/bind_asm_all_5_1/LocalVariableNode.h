#import <Foundation/Foundation.h>
#import "LabelNode.h"

@interface LocalVariableNode : NSObject

+ (LocalVariableNode*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withLabelNode:(LabelNode*)arg3 withLabelNode:(LabelNode*)arg4 withInt:(int)arg5;
- (void)acceptWithMethodVisitor:(id)arg0;

@end