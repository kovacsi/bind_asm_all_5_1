#import <Foundation/Foundation.h>

@interface org_objectweb_asm_ByteVector : NSObject

+ (org_objectweb_asm_ByteVector*)value;
+ (org_objectweb_asm_ByteVector*)valueWithInt:(int)arg0;
- (org_objectweb_asm_ByteVector*)putByteWithInt:(int)arg0;
- (org_objectweb_asm_ByteVector*)putShortWithInt:(int)arg0;
- (org_objectweb_asm_ByteVector*)putIntWithInt:(int)arg0;
- (org_objectweb_asm_ByteVector*)putLongWithLong:(long)arg0;
- (org_objectweb_asm_ByteVector*)putUTF8WithString:(NSString*)arg0;
- (org_objectweb_asm_ByteVector*)putByteArrayWithByte:(id)arg0 withInt:(int)arg1 withInt:(int)arg2;

@end