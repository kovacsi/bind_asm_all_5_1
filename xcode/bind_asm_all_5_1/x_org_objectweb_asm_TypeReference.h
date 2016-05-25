#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_TypeReference : NSObject
+ (x_org_objectweb_asm_TypeReference*) valueWithInt:(int) arg0;
+ (id) newTypeReferenceWithInt:(int) arg0;
+ (id) newTypeParameterReferenceWithIntWithInt:(int) arg0 :(int) arg1;
+ (id) newTypeParameterBoundReferenceWithIntWithIntWithInt:(int) arg0 :(int) arg1 :(int) arg2;
+ (id) newSuperTypeReferenceWithInt:(int) arg0;
+ (id) newFormalParameterReferenceWithInt:(int) arg0;
+ (id) newExceptionReferenceWithInt:(int) arg0;
+ (id) newTryCatchReferenceWithInt:(int) arg0;
+ (id) newTypeArgumentReferenceWithIntWithInt:(int) arg0 :(int) arg1;
- (int) getTypeParameterIndex;
- (int) getTypeParameterBoundIndex;
- (int) getSuperTypeIndex;
- (int) getFormalParameterIndex;
- (int) getExceptionIndex;
- (int) getTryCatchBlockIndex;
- (int) getTypeArgumentIndex;
- (int) getValue;
@end
