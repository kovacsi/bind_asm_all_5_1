#import <Foundation/Foundation.h>
#import "BasicValue.h"
#import "Type.h"

@interface BasicInterpreter : NSObject

+ (BasicInterpreter*)value;
- (BasicValue*)copyOperationWithAbstractInsnNode:(id)arg0 withBasicValue:(BasicValue*)arg1;
- (BasicValue*)unaryOperationWithAbstractInsnNode:(id)arg0 withBasicValue:(BasicValue*)arg1;
- (BasicValue*)binaryOperationWithAbstractInsnNode:(id)arg0 withBasicValue:(BasicValue*)arg1 withBasicValue:(BasicValue*)arg2;
- (BasicValue*)ternaryOperationWithAbstractInsnNode:(id)arg0 withBasicValue:(BasicValue*)arg1 withBasicValue:(BasicValue*)arg2 withBasicValue:(BasicValue*)arg3;
- (void)returnOperationWithAbstractInsnNode:(id)arg0 withBasicValue:(BasicValue*)arg1 withBasicValue:(BasicValue*)arg2;
- (BasicValue*)mergeWithBasicValue:(BasicValue*)arg0 withBasicValue:(BasicValue*)arg1;
- (id)mergeWithValue:(id)arg0 withValue:(id)arg1;
- (void)returnOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1 withValue:(id)arg2;
- (id)naryOperationWithAbstractInsnNode:(id)arg0 withList:(id)arg1;
- (id)ternaryOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1 withValue:(id)arg2 withValue:(id)arg3;
- (id)binaryOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1 withValue:(id)arg2;
- (id)unaryOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1;
- (id)copyOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1;
- (id)newOperationWithAbstractInsnNode:(id)arg0;
- (id)newValueWithType:(Type*)arg0;

@end