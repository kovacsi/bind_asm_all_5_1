#import <Foundation/Foundation.h>
#import "JBLabel.h"


@interface JBLabelNode : NSObject

+ (JBLabelNode*)value;
+ (JBLabelNode*)valueWithLabel:(JBLabel*)arg0;
- (int)getType;
- (JBLabel*)getLabel;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;
- (void)resetLabel;

@end
