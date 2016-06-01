#import <Foundation/Foundation.h>

@interface ByteVector : NSObject

+ (ByteVector*)value;
+ (ByteVector*)valueWithInt:(int)arg0;
- (ByteVector*)putByteWithInt:(int)arg0;
- (ByteVector*)putShortWithInt:(int)arg0;
- (ByteVector*)putIntWithInt:(int)arg0;
- (ByteVector*)putLongWithLong:(long)arg0;
- (ByteVector*)putUTF8WithString:(NSString*)arg0;
- (ByteVector*)putByteArrayWithByte:(id)arg0 withInt:(int)arg1 withInt:(int)arg2;

@end