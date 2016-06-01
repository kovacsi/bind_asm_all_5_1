#import <Foundation/Foundation.h>
#import "LabelNode.h"

@interface TryCatchBlockNode : NSObject

+ (TryCatchBlockNode*)valueWithLabelNode:(LabelNode*)arg0 withLabelNode:(LabelNode*)arg1 withLabelNode:(LabelNode*)arg2 withString:(NSString*)arg3;
- (void)updateIndexWithInt:(int)arg0;
- (void)acceptWithMethodVisitor:(id)arg0;

@end