#import <Foundation/Foundation.h>

@interface org_objectweb_asm_signature_SignatureWriter : NSObject

+ (org_objectweb_asm_signature_SignatureWriter*)value;
- (void)visitFormalTypeParameterWithString:(NSString*)arg0;
- (void)visitBaseTypeWithChar:(char)arg0;
- (void)visitTypeVariableWithString:(NSString*)arg0;
- (void)visitClassTypeWithString:(NSString*)arg0;
- (void)visitInnerClassTypeWithString:(NSString*)arg0;
- (void)visitTypeArgument;
- (void)visitEnd;
- (NSString*)toString;

@end