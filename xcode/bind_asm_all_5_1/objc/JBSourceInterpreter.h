#import <Foundation/Foundation.h>
#import "JBSourceValue.h"
#import "JBType.h"


@interface JBSourceInterpreter : NSObject

+ (JBSourceInterpreter*)value;
- (JBSourceValue*)copyOperationWithAbstractInsnNode:(id)arg0 withSourceValue:(JBSourceValue*)arg1;
- (JBSourceValue*)unaryOperationWithAbstractInsnNode:(id)arg0 withSourceValue:(JBSourceValue*)arg1;
- (JBSourceValue*)binaryOperationWithAbstractInsnNode:(id)arg0 withSourceValue:(JBSourceValue*)arg1 withSourceValue:(JBSourceValue*)arg2;
- (JBSourceValue*)ternaryOperationWithAbstractInsnNode:(id)arg0 withSourceValue:(JBSourceValue*)arg1 withSourceValue:(JBSourceValue*)arg2 withSourceValue:(JBSourceValue*)arg3;
- (void)returnOperationWithAbstractInsnNode:(id)arg0 withSourceValue:(JBSourceValue*)arg1 withSourceValue:(JBSourceValue*)arg2;
- (JBSourceValue*)mergeWithSourceValue:(JBSourceValue*)arg0 withSourceValue:(JBSourceValue*)arg1;
- (id)mergeWithValue:(id)arg0 withValue:(id)arg1;
- (void)returnOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1 withValue:(id)arg2;
- (id)naryOperationWithAbstractInsnNode:(id)arg0 withList:(id)arg1;
- (id)ternaryOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1 withValue:(id)arg2 withValue:(id)arg3;
- (id)binaryOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1 withValue:(id)arg2;
- (id)unaryOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1;
- (id)copyOperationWithAbstractInsnNode:(id)arg0 withValue:(id)arg1;
- (id)newOperationWithAbstractInsnNode:(id)arg0;
- (id)newValueWithType:(JBType*)arg0;

@end
