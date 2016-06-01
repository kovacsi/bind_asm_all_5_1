#import <Foundation/Foundation.h>


@interface JBSignatureReader : NSObject

+ (JBSignatureReader*)valueWithString:(NSString*)arg0;
- (void)acceptWithSignatureVisitor:(id)arg0;
- (void)acceptTypeWithSignatureVisitor:(id)arg0;

@end
