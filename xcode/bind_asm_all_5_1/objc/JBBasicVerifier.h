#import <Foundation/Foundation.h>
#import "JBBasicValue.h"


@interface JBBasicVerifier : NSObject

+ (JBBasicVerifier*)value;
- (JBBasicValue*)copyOperationWithAbstractInsnNode:(id)arg0 withBasicValue:(JBBasicValue*)arg1;
- (JBBasicValue*)unaryOperationWithAbstractInsnNode:(id)arg0 withBasicValue:(JBBasicValue*)arg1;
- (JBBasicValue*)binaryOperationWithAbstractInsnNode:(id)arg0 withBasicValue:(JBBasicValue*)arg1 withBasicValue:(JBBasicValue*)arg2;
- (JBBasicValue*)ternaryOperationWithAbstractInsnNode:(id)arg0 withBasicValue:(JBBasicValue*)arg1 withBasicValue:(JBBasicValue*)arg2 withBasicValue:(JBBasicValue*)arg3;
- (void)returnOperationWithAbstractInsnNode:(id)arg0 withBasicValue:(JBBasicValue*)arg1 withBasicValue:(JBBasicValue*)arg2;
- (void)returnOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1 withValue:(id)arg2;
- (id)naryOperationWithAbstractInsnNode:(id)arg0 withList:(id)arg1;
- (id)ternaryOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1 withValue:(id)arg2 withValue:(id)arg3;
- (id)binaryOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1 withValue:(id)arg2;
- (id)unaryOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1;
- (id)copyOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1;

@end
