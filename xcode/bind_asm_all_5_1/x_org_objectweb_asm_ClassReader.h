#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_ClassReader : NSObject
+ (x_org_objectweb_asm_ClassReader*) valueWithId:(id) arg0;
+ (x_org_objectweb_asm_ClassReader*) valueWithIdWithIntWithInt:(id) arg0 :(int) arg1 :(int) arg2;
- (int) getAccess;
- (NSString*) getClassName;
- (NSString*) getSuperName;
- (id) getInterfaces;
+ (x_org_objectweb_asm_ClassReader*) valueWithString:(NSString*) arg0;
- (void) acceptWithIdWithInt:(id) arg0 :(int) arg1;
- (void) acceptWithIdWithIdWithInt:(id) arg0 :(id) arg1 :(int) arg2;
- (int) getItemCount;
- (int) getItemWithInt:(int) arg0;
- (int) getMaxStringLength;
- (int) readByteWithInt:(int) arg0;
- (int) readUnsignedShortWithInt:(int) arg0;
- (id) readShortWithInt:(int) arg0;
- (int) readIntWithInt:(int) arg0;
- (long) readLongWithInt:(int) arg0;
- (NSString*) readUTF8WithIntWithId:(int) arg0 :(id) arg1;
- (NSString*) readClassWithIntWithId:(int) arg0 :(id) arg1;
- (NSObject*) readConstWithIntWithId:(int) arg0 :(id) arg1;
@end