#import <Foundation/Foundation.h>


@interface JBParameterNode : NSObject

+ (JBParameterNode*)valueWithString:(NSString*)arg0 withInt:(int)arg1;
- (void)acceptWithMethodVisitor:(id)arg0;

@end
