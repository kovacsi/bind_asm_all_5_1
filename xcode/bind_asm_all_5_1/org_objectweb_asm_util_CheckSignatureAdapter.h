#import <Foundation/Foundation.h>

@interface org_objectweb_asm_util_CheckSignatureAdapter : NSObject

- (void)visitFormalTypeParameterWithString:(NSString*)arg0;
- (void)visitBaseTypeWithChar:(char)arg0;
- (void)visitTypeVariableWithString:(NSString*)arg0;
- (void)visitClassTypeWithString:(NSString*)arg0;
- (void)visitInnerClassTypeWithString:(NSString*)arg0;
- (void)visitTypeArgument;
- (void)visitEnd;

@end