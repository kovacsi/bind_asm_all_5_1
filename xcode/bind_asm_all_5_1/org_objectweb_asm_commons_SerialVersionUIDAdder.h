#import <Foundation/Foundation.h>

@interface org_objectweb_asm_commons_SerialVersionUIDAdder : NSObject

- (void)visitWithInt:(int)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withString:(id)arg5;
- (void)visitInnerClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withInt:(int)arg3;
- (void)visitEnd;
- (bool)hasSVUID;

@end