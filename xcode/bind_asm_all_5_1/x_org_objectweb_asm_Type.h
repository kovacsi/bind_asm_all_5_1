#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_Type : NSObject
+ (id) getTypeWithString:(NSString*) arg0;
+ (id) getObjectTypeWithString:(NSString*) arg0;
+ (id) getMethodTypeWithString:(NSString*) arg0;
+ (id) getMethodTypeWithTypeWithType:(id) arg0 :(id) arg1;
+ (id) getTypeWithClass:(id) arg0;
+ (id) getTypeWithConstructor:(id) arg0;
+ (id) getTypeWithMethod:(id) arg0;
+ (id) getArgumentTypesWithString:(NSString*) arg0;
+ (id) getArgumentTypesWithMethod:(id) arg0;
+ (id) getReturnTypeWithString:(NSString*) arg0;
+ (id) getReturnTypeWithMethod:(id) arg0;
+ (int) getArgumentsAndReturnSizesWithString:(NSString*) arg0;
- (int) getSort;
- (int) getDimensions;
- (id) getElementType;
- (NSString*) getClassName;
- (NSString*) getInternalName;
- (id) getArgumentTypes;
- (id) getReturnType;
- (int) getArgumentsAndReturnSizes;
- (NSString*) getDescriptor;
+ (NSString*) getMethodDescriptorWithTypeWithType:(id) arg0 :(id) arg1;
+ (NSString*) getInternalNameWithClass:(id) arg0;
+ (NSString*) getDescriptorWithClass:(id) arg0;
+ (NSString*) getConstructorDescriptorWithConstructor:(id) arg0;
+ (NSString*) getMethodDescriptorWithMethod:(id) arg0;
- (int) getSize;
- (int) getOpcodeWithInt:(int) arg0;
- (bool) equalsWithObject:(NSObject*) arg0;
- (int) hashCode;
- (NSString*) toString;
@end
