#import <Foundation/Foundation.h>

#define CLASS_TYPE_PARAMETER 0
#define METHOD_TYPE_PARAMETER 1
#define CLASS_EXTENDS 16
#define CLASS_TYPE_PARAMETER_BOUND 17
#define METHOD_TYPE_PARAMETER_BOUND 18
#define FIELD 19
#define METHOD_RETURN 20
#define METHOD_RECEIVER 21
#define METHOD_FORMAL_PARAMETER 22
#define THROWS 23
#define LOCAL_VARIABLE 64
#define RESOURCE_VARIABLE 65
#define EXCEPTION_PARAMETER 66
#define INSTANCEOF 67
#define NEW 68
#define CONSTRUCTOR_REFERENCE 69
#define METHOD_REFERENCE 70
#define CAST 71
#define CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT 72
#define METHOD_INVOCATION_TYPE_ARGUMENT 73
#define CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT 74
#define METHOD_REFERENCE_TYPE_ARGUMENT 75

@interface JBTypeReference : NSObject

+ (JBTypeReference*)valueWithInt:(int)arg0;
+ (JBTypeReference*)newTypeReferenceWithInt:(int)arg0;
+ (JBTypeReference*)newTypeParameterReferenceWithInt:(int)arg0 withInt:(int)arg1;
+ (JBTypeReference*)newTypeParameterBoundReferenceWithInt:(int)arg0 withInt:(int)arg1 withInt:(int)arg2;
+ (JBTypeReference*)newSuperTypeReferenceWithInt:(int)arg0;
+ (JBTypeReference*)newFormalParameterReferenceWithInt:(int)arg0;
+ (JBTypeReference*)newExceptionReferenceWithInt:(int)arg0;
+ (JBTypeReference*)newTryCatchReferenceWithInt:(int)arg0;
+ (JBTypeReference*)newTypeArgumentReferenceWithInt:(int)arg0 withInt:(int)arg1;
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
