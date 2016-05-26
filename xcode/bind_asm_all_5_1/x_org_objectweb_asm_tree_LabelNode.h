#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_LabelNode : NSObject
+ (x_org_objectweb_asm_tree_LabelNode*) valueWithLabel:(id) arg0;
- (int) getType;
- (id) getLabel;
- (void) acceptWithMethodVisitor:(id) arg0;
- (id) cloneWithMap:(id) arg0;
- (void) resetLabel;
@end
