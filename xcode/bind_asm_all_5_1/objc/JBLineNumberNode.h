#import <Foundation/Foundation.h>
#import "JBLabelNode.h"


@interface JBLineNumberNode : NSObject

+ (JBLineNumberNode*)valueWithInt:(int)arg0 withLabelNode:(JBLabelNode*)arg1;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end
