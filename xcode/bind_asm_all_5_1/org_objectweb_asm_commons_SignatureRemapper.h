#import <Foundation/Foundation.h>

@interface org_objectweb_asm_commons_SignatureRemapper : NSObject

- (void)visitClassTypeWithString:(NSString*)arg0;
- (void)visitInnerClassTypeWithString:(NSString*)arg0;
- (void)visitFormalTypeParameterWithString:(NSString*)arg0;
- (void)visitTypeVariableWithString:(NSString*)arg0;
- (void)visitBaseTypeWithChar:(char)arg0;
- (void)visitTypeArgument;
- (void)visitEnd;

@end