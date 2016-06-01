#import <Foundation/Foundation.h>
#import "LabelNode.h"

@interface LineNumberNode : NSObject

+ (LineNumberNode*)valueWithInt:(int)arg0 withLabelNode:(LabelNode*)arg1;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end