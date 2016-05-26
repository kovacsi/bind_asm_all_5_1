#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_signature_SignatureWriter : NSObject
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
- (NSString*) toString;
@end
