#import <Foundation/Foundation.h>
#import "JBLabelNode.h"


@interface JBTryCatchBlockNode : NSObject

+ (JBTryCatchBlockNode*)valueWithLabelNode:(JBLabelNode*)arg0 withLabelNode:(JBLabelNode*)arg1 withLabelNode:(JBLabelNode*)arg2 withString:(NSString*)arg3;
- (void)updateIndexWithInt:(int)arg0;
- (void)acceptWithMethodVisitor:(id)arg0;

@end
