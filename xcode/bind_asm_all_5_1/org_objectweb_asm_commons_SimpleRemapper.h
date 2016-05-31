#import <Foundation/Foundation.h>

@interface org_objectweb_asm_commons_SimpleRemapper : NSObject

+ (org_objectweb_asm_commons_SimpleRemapper*)valueWithMap:(id)arg0;
+ (org_objectweb_asm_commons_SimpleRemapper*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (NSString*)mapMethodNameWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (NSString*)mapInvokeDynamicMethodNameWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (NSString*)mapFieldNameWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (NSString*)mapWithString:(NSString*)arg0;

@end