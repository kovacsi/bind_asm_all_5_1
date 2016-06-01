#import "ClassReader.h"

@implementation ClassReader

+ (ClassReader*)valueWithByte:(id)arg0 {
	return nil;
}

+ (ClassReader*)valueWithByte:(id)arg0 withInt:(int)arg1 withInt:(int)arg2 {
	return nil;
}

- (int)getAccess {
	return 0;
}

- (NSString*)getClassName {
	return nil;
}

- (NSString*)getSuperName {
	return nil;
}

- (id)getInterfaces {
	return nil;
}

+ (ClassReader*)valueWithInputStream:(id)arg0 {
	return nil;
}

+ (ClassReader*)valueWithString:(NSString*)arg0 {
	return nil;
}

- (void)acceptWithClassVisitor:(id)arg0 withInt:(int)arg1 {

}

- (void)acceptWithClassVisitor:(id)arg0 withAttribute:(id)arg1 withInt:(int)arg2 {

}

- (int)getItemCount {
	return 0;
}

- (int)getItemWithInt:(int)arg0 {
	return 0;
}

- (int)getMaxStringLength {
	return 0;
}

- (int)readByteWithInt:(int)arg0 {
	return 0;
}

- (int)readUnsignedShortWithInt:(int)arg0 {
	return 0;
}

- (id)readShortWithInt:(int)arg0 {
	return nil;
}

- (int)readIntWithInt:(int)arg0 {
	return 0;
}

- (long)readLongWithInt:(int)arg0 {
	return 0;
}

- (NSString*)readUTF8WithInt:(int)arg0 withChar:(id)arg1 {
	return nil;
}

- (NSString*)readClassWithInt:(int)arg0 withChar:(id)arg1 {
	return nil;
}

- (id)readConstWithInt:(int)arg0 withChar:(id)arg1 {
	return nil;
}

@end
