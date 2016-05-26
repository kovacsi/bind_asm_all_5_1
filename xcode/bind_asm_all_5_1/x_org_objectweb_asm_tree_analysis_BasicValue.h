#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_analysis_BasicValue : NSObject
+ (x_org_objectweb_asm_tree_analysis_BasicValue*) valueWithType:(id) arg0;
- (id) getType;
- (int) getSize;
- (bool) isReference;
- (bool) equalsWithObject:(NSObject*) arg0;
- (int) hashCode;
- (NSString*) toString;
@end
