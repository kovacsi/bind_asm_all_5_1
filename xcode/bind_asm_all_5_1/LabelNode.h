#import <Foundation/Foundation.h>
#import "Label.h"

@interface LabelNode : NSObject

+ (LabelNode*)value;
+ (LabelNode*)valueWithLabel:(Label*)arg0;
- (int)getType;
- (Label*)getLabel;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;
- (void)resetLabel;

@end