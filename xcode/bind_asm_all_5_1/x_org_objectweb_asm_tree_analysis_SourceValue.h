#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_analysis_SourceValue : NSObject
+ (x_org_objectweb_asm_tree_analysis_SourceValue*) valueWithInt:(int) arg0;
+ (x_org_objectweb_asm_tree_analysis_SourceValue*) valueWithIntWithAbstractInsnNode:(int) arg0 :(id) arg1;
+ (x_org_objectweb_asm_tree_analysis_SourceValue*) valueWithIntWithSet:(int) arg0 :(id) arg1;
- (int) getSize;
- (bool) equalsWithObject:(NSObject*) arg0;
- (int) hashCode;
@end
