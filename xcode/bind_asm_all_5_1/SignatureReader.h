#import <Foundation/Foundation.h>

@interface SignatureReader : NSObject

+ (SignatureReader*)valueWithString:(NSString*)arg0;
- (void)acceptWithSignatureVisitor:(id)arg0;
- (void)acceptTypeWithSignatureVisitor:(id)arg0;

@end