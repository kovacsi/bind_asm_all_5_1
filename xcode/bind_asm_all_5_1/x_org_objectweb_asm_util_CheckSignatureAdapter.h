#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_util_CheckSignatureAdapter : NSObject
+ (x_org_objectweb_asm_util_CheckSignatureAdapter*) valueWithIntWithSignatureVisitor:(int) arg0 :(id) arg1;
- (void) visitFormalTypeParameterWithString:(NSString*) arg0;
- (id) visitClassBound;
- (id) visitInterfaceBound;
- (id) visitSuperclass;
- (id) visitInterface;
- (id) visitParameterType;
- (id) visitReturnType;
- (id) visitExceptionType;
- (void) visitBaseTypeWithChar:(char) arg0;
- (void) visitTypeVariableWithString:(NSString*) arg0;
- (id) visitArrayType;
- (void) visitClassTypeWithString:(NSString*) arg0;
- (void) visitInnerClassTypeWithString:(NSString*) arg0;
- (void) visitTypeArgument;
- (id) visitTypeArgumentWithChar:(char) arg0;
- (void) visitEnd;
@end
