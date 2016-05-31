#import <Foundation/Foundation.h>

@interface org_objectweb_asm_util_TraceSignatureVisitor : NSObject

+ (org_objectweb_asm_util_TraceSignatureVisitor*)valueWithInt:(int)arg0;
- (void)visitFormalTypeParameterWithString:(NSString*)arg0;
- (void)visitBaseTypeWithChar:(char)arg0;
- (void)visitTypeVariableWithString:(NSString*)arg0;
- (void)visitClassTypeWithString:(NSString*)arg0;
- (void)visitInnerClassTypeWithString:(NSString*)arg0;
- (void)visitTypeArgument;
- (void)visitEnd;
- (NSString*)getDeclaration;
- (NSString*)getReturnType;
- (NSString*)getExceptions;

@end