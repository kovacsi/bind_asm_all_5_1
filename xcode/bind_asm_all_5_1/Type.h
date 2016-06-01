#import <Foundation/Foundation.h>

@interface Type : NSObject

+ (Type*)getTypeWithString:(NSString*)arg0;
+ (Type*)getObjectTypeWithString:(NSString*)arg0;
+ (Type*)getMethodTypeWithString:(NSString*)arg0;
+ (Type*)getMethodTypeWithType:(Type*)arg0 withType:(id)arg1;
+ (Type*)getTypeWithClass:(id)arg0;
+ (Type*)getTypeWithConstructor:(id)arg0;
+ (Type*)getTypeWithMethod:(id)arg0;
+ (id)getArgumentTypesWithString:(NSString*)arg0;
+ (id)getArgumentTypesWithMethod:(id)arg0;
+ (Type*)getReturnTypeWithString:(NSString*)arg0;
+ (Type*)getReturnTypeWithMethod:(id)arg0;
+ (int)getArgumentsAndReturnSizesWithString:(NSString*)arg0;
- (int)getSort;
- (int)getDimensions;
- (Type*)getElementType;
- (NSString*)getClassName;
- (NSString*)getInternalName;
- (id)getArgumentTypes;
- (Type*)getReturnType;
- (int)getArgumentsAndReturnSizes;
- (NSString*)getDescriptor;
+ (NSString*)getMethodDescriptorWithType:(Type*)arg0 withType:(id)arg1;
+ (NSString*)getInternalNameWithClass:(id)arg0;
+ (NSString*)getDescriptorWithClass:(id)arg0;
+ (NSString*)getConstructorDescriptorWithConstructor:(id)arg0;
+ (NSString*)getMethodDescriptorWithMethod:(id)arg0;
- (int)getSize;
- (int)getOpcodeWithInt:(int)arg0;
- (bool)equalsWithObject:(id)arg0;
- (int)hashCode;
- (NSString*)toString;

@end