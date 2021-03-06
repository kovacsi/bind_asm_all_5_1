#import <Foundation/Foundation.h>


@interface JBRemappingSignatureAdapter : NSObject

+ (JBRemappingSignatureAdapter*)valueWithSignatureVisitor:(id)arg0 withRemapper:(id)arg1;
- (void)visitClassTypeWithString:(NSString*)arg0;
- (void)visitInnerClassTypeWithString:(NSString*)arg0;
- (void)visitFormalTypeParameterWithString:(NSString*)arg0;
- (void)visitTypeVariableWithString:(NSString*)arg0;
- (id)visitArrayType;
- (void)visitBaseTypeWithChar:(char)arg0;
- (id)visitClassBound;
- (id)visitExceptionType;
- (id)visitInterface;
- (id)visitInterfaceBound;
- (id)visitParameterType;
- (id)visitReturnType;
- (id)visitSuperclass;
- (void)visitTypeArgument;
- (id)visitTypeArgumentWithChar:(char)arg0;
- (void)visitEnd;

@end
