#import <Foundation/Foundation.h>

@interface SimpleRemapper : NSObject

+ (SimpleRemapper*)valueWithMap:(id)arg0;
+ (SimpleRemapper*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (NSString*)mapMethodNameWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (NSString*)mapInvokeDynamicMethodNameWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (NSString*)mapFieldNameWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (NSString*)mapWithString:(NSString*)arg0;

@end