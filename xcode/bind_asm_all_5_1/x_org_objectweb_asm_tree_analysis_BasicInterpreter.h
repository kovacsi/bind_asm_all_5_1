#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_analysis_BasicInterpreter : NSObject
- (id) newValueWithId:(id) arg0;
- (id) newOperationWithId:(id) arg0;
- (id) copyOperationWithIdWithId:(id) arg0 :(id) arg1;
- (id) unaryOperationWithIdWithId:(id) arg0 :(id) arg1;
- (id) binaryOperationWithIdWithIdWithId:(id) arg0 :(id) arg1 :(id) arg2;
- (id) ternaryOperationWithIdWithIdWithIdWithId:(id) arg0 :(id) arg1 :(id) arg2 :(id) arg3;
- (id) naryOperationWithIdWithId:(id) arg0 :(id) arg1;
- (void) returnOperationWithIdWithIdWithId:(id) arg0 :(id) arg1 :(id) arg2;
- (id) mergeWithIdWithId:(id) arg0 :(id) arg1;
@end
