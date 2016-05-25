#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_ByteVector : NSObject
+ (x_org_objectweb_asm_ByteVector*) valueWithInt:(int) arg0;
- (id) putByteWithInt:(int) arg0;
- (id) putShortWithInt:(int) arg0;
- (id) putIntWithInt:(int) arg0;
- (id) putLongWithLong:(long) arg0;
- (id) putUTF8WithString:(NSString*) arg0;
- (id) putByteArrayWithIdWithIntWithInt:(id) arg0 :(int) arg1 :(int) arg2;
@end
