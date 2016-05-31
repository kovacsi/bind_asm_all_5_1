#import <Foundation/Foundation.h>

@interface org_objectweb_asm_ClassReader : NSObject

+ (org_objectweb_asm_ClassReader*)valueWithByte:(id)arg0;
+ (org_objectweb_asm_ClassReader*)valueWithByte:(id)arg0 withInt:(int)arg1 withInt:(int)arg2;
- (int)getAccess;
- (NSString*)getClassName;
- (NSString*)getSuperName;
- (id)getInterfaces;
+ (org_objectweb_asm_ClassReader*)valueWithInputStream:(id)arg0;
+ (org_objectweb_asm_ClassReader*)valueWithString:(NSString*)arg0;
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