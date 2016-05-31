#import <Foundation/Foundation.h>

@interface org_objectweb_asm_TypeReference : NSObject

+ (org_objectweb_asm_TypeReference*)valueWithInt:(int)arg0;
+ (org_objectweb_asm_TypeReference*)newTypeReferenceWithInt:(int)arg0;
+ (org_objectweb_asm_TypeReference*)newTypeParameterReferenceWithInt:(int)arg0 withInt:(int)arg1;
+ (org_objectweb_asm_TypeReference*)newTypeParameterBoundReferenceWithInt:(int)arg0 withInt:(int)arg1 withInt:(int)arg2;
+ (org_objectweb_asm_TypeReference*)newSuperTypeReferenceWithInt:(int)arg0;
+ (org_objectweb_asm_TypeReference*)newFormalParameterReferenceWithInt:(int)arg0;
+ (org_objectweb_asm_TypeReference*)newExceptionReferenceWithInt:(int)arg0;
+ (org_objectweb_asm_TypeReference*)newTryCatchReferenceWithInt:(int)arg0;
+ (org_objectweb_asm_TypeReference*)newTypeArgumentReferenceWithInt:(int)arg0 withInt:(int)arg1;
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