#import "Type.h"

@implementation Type

+ (Type*)getTypeWithString:(NSString*)arg0 {
	return nil;
}

+ (Type*)getObjectTypeWithString:(NSString*)arg0 {
	return nil;
}

+ (Type*)getMethodTypeWithString:(NSString*)arg0 {
	return nil;
}

+ (Type*)getMethodTypeWithType:(Type*)arg0 withType:(id)arg1 {
	return nil;
}

+ (Type*)getTypeWithClass:(id)arg0 {
	return nil;
}

+ (Type*)getTypeWithConstructor:(id)arg0 {
	return nil;
}

+ (Type*)getTypeWithMethod:(id)arg0 {
	return nil;
}

+ (id)getArgumentTypesWithString:(NSString*)arg0 {
	return nil;
}

+ (id)getArgumentTypesWithMethod:(id)arg0 {
	return nil;
}

+ (Type*)getReturnTypeWithString:(NSString*)arg0 {
	return nil;
}

+ (Type*)getReturnTypeWithMethod:(id)arg0 {
	return nil;
}

+ (int)getArgumentsAndReturnSizesWithString:(NSString*)arg0 {
	return 0;
}

- (int)getSort {
	return 0;
}

- (int)getDimensions {
	return 0;
}

- (Type*)getElementType {
	return nil;
}

- (NSString*)getClassName {
	return nil;
}

- (NSString*)getInternalName {
	return nil;
}

- (id)getArgumentTypes {
	return nil;
}

- (Type*)getReturnType {
	return nil;
}

- (int)getArgumentsAndReturnSizes {
	return 0;
}

- (NSString*)getDescriptor {
	return nil;
}

+ (NSString*)getMethodDescriptorWithType:(Type*)arg0 withType:(id)arg1 {
	return nil;
}

+ (NSString*)getInternalNameWithClass:(id)arg0 {
	return nil;
}

+ (NSString*)getDescriptorWithClass:(id)arg0 {
	return nil;
}

+ (NSString*)getConstructorDescriptorWithConstructor:(id)arg0 {
	return nil;
}

+ (NSString*)getMethodDescriptorWithMethod:(id)arg0 {
	return nil;
}

- (int)getSize {
	return 0;
}

- (int)getOpcodeWithInt:(int)arg0 {
	return 0;
}

- (bool)equalsWithObject:(id)arg0 {
	return 0;
}

- (int)hashCode {
	return 0;
}

- (NSString*)toString {
	return nil;
}

@end
