#import <Foundation/Foundation.h>

@interface org_objectweb_asm_Type : NSObject

+ (org_objectweb_asm_Type*)getTypeWithString:(NSString*)arg0;
+ (org_objectweb_asm_Type*)getObjectTypeWithString:(NSString*)arg0;
+ (org_objectweb_asm_Type*)getMethodTypeWithString:(NSString*)arg0;
+ (org_objectweb_asm_Type*)getMethodTypeWithType:(org_objectweb_asm_Type*)arg0 withType:(id)arg1;
+ (org_objectweb_asm_Type*)getTypeWithClass:(id)arg0;
+ (org_objectweb_asm_Type*)getTypeWithConstructor:(id)arg0;
+ (org_objectweb_asm_Type*)getTypeWithMethod:(id)arg0;
+ (id)getArgumentTypesWithString:(NSString*)arg0;
+ (id)getArgumentTypesWithMethod:(id)arg0;
+ (org_objectweb_asm_Type*)getReturnTypeWithString:(NSString*)arg0;
+ (org_objectweb_asm_Type*)getReturnTypeWithMethod:(id)arg0;
+ (int)getArgumentsAndReturnSizesWithString:(NSString*)arg0;
- (int)getSort;
- (int)getDimensions;
- (org_objectweb_asm_Type*)getElementType;
- (NSString*)getClassName;
- (NSString*)getInternalName;
- (id)getArgumentTypes;
- (org_objectweb_asm_Type*)getReturnType;
- (int)getArgumentsAndReturnSizes;
- (NSString*)getDescriptor;
+ (NSString*)getMethodDescriptorWithType:(org_objectweb_asm_Type*)arg0 withType:(id)arg1;
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