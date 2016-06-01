#import <Foundation/Foundation.h>

@interface ParameterNode : NSObject

+ (ParameterNode*)valueWithString:(NSString*)arg0 withInt:(int)arg1;
- (void)acceptWithMethodVisitor:(id)arg0;

@end