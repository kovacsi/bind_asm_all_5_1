#import <Foundation/Foundation.h>


@interface JBByteVector : NSObject

+ (JBByteVector*)value;
+ (JBByteVector*)valueWithInt:(int)arg0;
- (JBByteVector*)putByteWithInt:(int)arg0;
- (JBByteVector*)putShortWithInt:(int)arg0;
- (JBByteVector*)putIntWithInt:(int)arg0;
- (JBByteVector*)putLongWithLong:(long)arg0;
- (JBByteVector*)putUTF8WithString:(NSString*)arg0;
- (JBByteVector*)putByteArrayWithByte:(id)arg0 withInt:(int)arg1 withInt:(int)arg2;

@end
