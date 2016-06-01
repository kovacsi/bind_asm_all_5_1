#import <Foundation/Foundation.h>

#define SKIP_CODE 1
#define SKIP_DEBUG 2
#define SKIP_FRAMES 4
#define EXPAND_FRAMES 8
@interface ClassReader : NSObject

+ (ClassReader*)valueWithByte:(id)arg0;
+ (ClassReader*)valueWithByte:(id)arg0 withInt:(int)arg1 withInt:(int)arg2;
- (int)getAccess;
- (NSString*)getClassName;
- (NSString*)getSuperName;
- (id)getInterfaces;
+ (ClassReader*)valueWithInputStream:(id)arg0;
+ (ClassReader*)valueWithString:(NSString*)arg0;
- (void)acceptWithClassVisitor:(id)arg0 withInt:(int)arg1;
- (void)acceptWithClassVisitor:(id)arg0 withAttribute:(id)arg1 withInt:(int)arg2;
- (int)getItemCount;
- (int)getItemWithInt:(int)arg0;
- (int)getMaxStringLength;
- (int)readByteWithInt:(int)arg0;
- (int)readUnsignedShortWithInt:(int)arg0;
- (id)readShortWithInt:(int)arg0;
- (int)readIntWithInt:(int)arg0;
- (long)readLongWithInt:(int)arg0;
- (NSString*)readUTF8WithInt:(int)arg0 withChar:(id)arg1;
- (NSString*)readClassWithInt:(int)arg0 withChar:(id)arg1;
- (id)readConstWithInt:(int)arg0 withChar:(id)arg1;

@end