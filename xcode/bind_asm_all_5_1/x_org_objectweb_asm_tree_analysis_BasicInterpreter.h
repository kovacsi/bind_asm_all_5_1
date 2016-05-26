#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_analysis_BasicInterpreter : NSObject
- (id) newValueWithType:(id) arg0;
- (id) newOperationWithAbstractInsnNode:(id) arg0;
- (id) copyOperationWithAbstractInsnNodeWithBasicValue:(id) arg0 :(id) arg1;
- (id) unaryOperationWithAbstractInsnNodeWithBasicValue:(id) arg0 :(id) arg1;
- (id) binaryOperationWithAbstractInsnNodeWithBasicValueWithBasicValue:(id) arg0 :(id) arg1 :(id) arg2;
- (id) ternaryOperationWithAbstractInsnNodeWithBasicValueWithBasicValueWithBasicValue:(id) arg0 :(id) arg1 :(id) arg2 :(id) arg3;
- (id) naryOperationWithAbstractInsnNodeWithList:(id) arg0 :(id) arg1;
- (void) returnOperationWithAbstractInsnNodeWithBasicValueWithBasicValue:(id) arg0 :(id) arg1 :(id) arg2;
- (id) mergeWithBasicValueWithBasicValue:(id) arg0 :(id) arg1;
- (id) mergeWithValueWithValue:(id) arg0 :(id) arg1;
- (void) returnOperationWithAbstractInsnNodeWithValueWithValue:(id) arg0 :(id) arg1 :(id) arg2;
- (id) ternaryOperationWithAbstractInsnNodeWithValueWithValueWithValue:(id) arg0 :(id) arg1 :(id) arg2 :(id) arg3;
- (id) binaryOperationWithAbstractInsnNodeWithValueWithValue:(id) arg0 :(id) arg1 :(id) arg2;
- (id) unaryOperationWithAbstractInsnNodeWithValue:(id) arg0 :(id) arg1;
- (id) copyOperationWithAbstractInsnNodeWithValue:(id) arg0 :(id) arg1;
@end
