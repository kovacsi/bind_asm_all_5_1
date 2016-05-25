#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_MethodNode : NSObject
+ (x_org_objectweb_asm_tree_MethodNode*) valueWithInt:(int) arg0;
+ (x_org_objectweb_asm_tree_MethodNode*) valueWithIntWithStringWithStringWithStringWithId:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3 :(id) arg4;
+ (x_org_objectweb_asm_tree_MethodNode*) valueWithIntWithIntWithStringWithStringWithStringWithId:(int) arg0 :(int) arg1 :(NSString*) arg2 :(NSString*) arg3 :(NSString*) arg4 :(id) arg5;
- (void) visitParameterWithStringWithInt:(NSString*) arg0 :(int) arg1;
- (void) visitCode;
- (void) visitLineNumberWithIntWithId:(int) arg0 :(id) arg1;
@end
