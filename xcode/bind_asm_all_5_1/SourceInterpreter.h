#import <Foundation/Foundation.h>
#import "SourceValue.h"
#import "Type.h"

@interface SourceInterpreter : NSObject

+ (SourceInterpreter*)value;
- (SourceValue*)copyOperationWithAbstractInsnNode:(id)arg0 withSourceValue:(SourceValue*)arg1;
- (SourceValue*)unaryOperationWithAbstractInsnNode:(id)arg0 withSourceValue:(SourceValue*)arg1;
- (SourceValue*)binaryOperationWithAbstractInsnNode:(id)arg0 withSourceValue:(SourceValue*)arg1 withSourceValue:(SourceValue*)arg2;
- (SourceValue*)ternaryOperationWithAbstractInsnNode:(id)arg0 withSourceValue:(SourceValue*)arg1 withSourceValue:(SourceValue*)arg2 withSourceValue:(SourceValue*)arg3;
- (void)returnOperationWithAbstractInsnNode:(id)arg0 withSourceValue:(SourceValue*)arg1 withSourceValue:(SourceValue*)arg2;
- (SourceValue*)mergeWithSourceValue:(SourceValue*)arg0 withSourceValue:(SourceValue*)arg1;
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