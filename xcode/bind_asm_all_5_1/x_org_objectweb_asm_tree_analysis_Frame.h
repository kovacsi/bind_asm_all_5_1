#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_analysis_Frame : NSObject
+ (x_org_objectweb_asm_tree_analysis_Frame*) valueWithIntWithInt:(int) arg0 :(int) arg1;
+ (x_org_objectweb_asm_tree_analysis_Frame*) valueWithId:(id) arg0;
- (id) initWithId:(id) arg0;
- (void) setReturnWithId:(id) arg0;
- (int) getLocals;
- (int) getMaxStackSize;
- (id) getLocalWithInt:(int) arg0;
- (void) setLocalWithIntWithId:(int) arg0 :(id) arg1;
- (int) getStackSize;
- (id) getStackWithInt:(int) arg0;
- (void) clearStack;
- (void) executeWithIdWithId:(id) arg0 :(id) arg1;
- (bool) mergeWithIdWithId:(id) arg0 :(id) arg1;
@end
