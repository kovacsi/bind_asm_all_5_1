#import <Foundation/Foundation.h>

@interface InnerClassNode : NSObject

+ (InnerClassNode*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withInt:(int)arg3;
- (void)acceptWithClassVisitor:(id)arg0;

@end