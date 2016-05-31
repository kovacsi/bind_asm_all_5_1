#import <Foundation/Foundation.h>
#import "org_objectweb_asm_Label.h"

@interface org_objectweb_asm_tree_LabelNode : NSObject

+ (org_objectweb_asm_tree_LabelNode*)value;
+ (org_objectweb_asm_tree_LabelNode*)valueWithLabel:(org_objectweb_asm_Label*)arg0;
- (int)getType;
- (org_objectweb_asm_Label*)getLabel;
- (void)resetLabel;

@end