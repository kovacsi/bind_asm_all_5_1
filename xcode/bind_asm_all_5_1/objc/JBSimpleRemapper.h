#import <Foundation/Foundation.h>


@interface JBSimpleRemapper : NSObject

+ (JBSimpleRemapper*)valueWithMap:(id)arg0;
+ (JBSimpleRemapper*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (NSString*)mapMethodNameWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (NSString*)mapInvokeDynamicMethodNameWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (NSString*)mapFieldNameWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (NSString*)mapWithString:(NSString*)arg0;

@end
