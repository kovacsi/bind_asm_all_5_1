#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_analysis_Frame : NSObject
+ (x_org_objectweb_asm_tree_analysis_Frame*) valueWithIntWithInt:(int) arg0 :(int) arg1;
+ (x_org_objectweb_asm_tree_analysis_Frame*) valueWithFrame:(id) arg0;
- (id) initWithFrame:(id) arg0;
- (void) setReturnWithValue:(id) arg0;
- (int) getLocals;
- (int) getMaxStackSize;
- (id) getLocalWithInt:(int) arg0;
- (void) setLocalWithIntWithValue:(int) arg0 :(id) arg1;
- (int) getStackSize;
- (id) getStackWithInt:(int) arg0;
- (void) clearStack;
- (id) pop;
- (void) pushWithValue:(id) arg0;
- (void) executeWithAbstractInsnNodeWithInterpreter:(id) arg0 :(id) arg1;
- (bool) mergeWithFrameWithInterpreter:(id) arg0 :(id) arg1;
- (bool) mergeWithFrameWithBoolean:(id) arg0 :(id) arg1;
- (NSString*) toString;
@end
