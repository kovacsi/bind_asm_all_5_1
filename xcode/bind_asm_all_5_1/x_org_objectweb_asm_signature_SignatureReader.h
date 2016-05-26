#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_signature_SignatureReader : NSObject
+ (x_org_objectweb_asm_signature_SignatureReader*) valueWithString:(NSString*) arg0;
- (void) acceptWithSignatureVisitor:(id) arg0;
- (void) acceptTypeWithSignatureVisitor:(id) arg0;
@end
