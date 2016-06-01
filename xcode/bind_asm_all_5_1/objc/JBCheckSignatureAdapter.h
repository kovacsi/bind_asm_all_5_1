#import <Foundation/Foundation.h>

#define CLASS_SIGNATURE 0
#define METHOD_SIGNATURE 1
#define TYPE_SIGNATURE 2

@interface JBCheckSignatureAdapter : NSObject

+ (JBCheckSignatureAdapter*)valueWithInt:(int)arg0 withSignatureVisitor:(id)arg1;
- (void)visitFormalTypeParameterWithString:(NSString*)arg0;
- (id)visitClassBound;
- (id)visitInterfaceBound;
- (id)visitSuperclass;
- (id)visitInterface;
- (id)visitParameterType;
- (id)visitReturnType;
- (id)visitExceptionType;
- (void)visitBaseTypeWithChar:(char)arg0;
- (void)visitTypeVariableWithString:(NSString*)arg0;
- (id)visitArrayType;
- (void)visitClassTypeWithString:(NSString*)arg0;
- (void)visitInnerClassTypeWithString:(NSString*)arg0;
- (void)visitTypeArgument;
- (id)visitTypeArgumentWithChar:(char)arg0;
- (void)visitEnd;

@end
