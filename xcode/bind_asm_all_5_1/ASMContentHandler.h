#import <Foundation/Foundation.h>

@interface ASMContentHandler : NSObject

+ (ASMContentHandler*)valueWithClassVisitor:(id)arg0;
- (void)startElementWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withAttributes:(id)arg3;
- (void)endElementWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;

@end