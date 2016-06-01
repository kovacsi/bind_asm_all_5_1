#import <Foundation/Foundation.h>
#import "JBLabelNode.h"


@interface JBLocalVariableNode : NSObject

+ (JBLocalVariableNode*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withLabelNode:(JBLabelNode*)arg3 withLabelNode:(JBLabelNode*)arg4 withInt:(int)arg5;
- (void)acceptWithMethodVisitor:(id)arg0;

@end
