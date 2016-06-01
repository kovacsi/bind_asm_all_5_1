#import <Foundation/Foundation.h>

@interface TypeReference : NSObject

+ (TypeReference*)valueWithInt:(int)arg0;
+ (TypeReference*)newTypeReferenceWithInt:(int)arg0;
+ (TypeReference*)newTypeParameterReferenceWithInt:(int)arg0 withInt:(int)arg1;
+ (TypeReference*)newTypeParameterBoundReferenceWithInt:(int)arg0 withInt:(int)arg1 withInt:(int)arg2;
+ (TypeReference*)newSuperTypeReferenceWithInt:(int)arg0;
+ (TypeReference*)newFormalParameterReferenceWithInt:(int)arg0;
+ (TypeReference*)newExceptionReferenceWithInt:(int)arg0;
+ (TypeReference*)newTryCatchReferenceWithInt:(int)arg0;
+ (TypeReference*)newTypeArgumentReferenceWithInt:(int)arg0 withInt:(int)arg1;
- (int)getSort;
- (int)getTypeParameterIndex;
- (int)getTypeParameterBoundIndex;
- (int)getSuperTypeIndex;
- (int)getFormalParameterIndex;
- (int)getExceptionIndex;
- (int)getTryCatchBlockIndex;
- (int)getTypeArgumentIndex;
- (int)getValue;

@end