#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_Type : NSObject
+ (id) getTypeWithString:(NSString*) arg0;
+ (id) getObjectTypeWithString:(NSString*) arg0;
+ (id) getMethodTypeWithString:(NSString*) arg0;
+ (id) getMethodTypeWithIdWithId:(id) arg0 :(id) arg1;
+ (id) getTypeWithId:(id) arg0;
+ (id) getArgumentTypesWithString:(NSString*) arg0;
+ (id) getArgumentTypesWithId:(id) arg0;
+ (id) getReturnTypeWithString:(NSString*) arg0;
+ (id) getReturnTypeWithId:(id) arg0;
+ (int) getArgumentsAndReturnSizesWithString:(NSString*) arg0;
- (int) getSort;
- (int) getDimensions;
- (id) getElementType;
- (NSString*) getInternalName;
- (id) getArgumentTypes;
- (id) getReturnType;
- (int) getArgumentsAndReturnSizes;
- (NSString*) getDescriptor;
+ (NSString*) getMethodDescriptorWithIdWithId:(id) arg0 :(id) arg1;
+ (NSString*) getInternalNameWithId:(id) arg0;
+ (NSString*) getDescriptorWithId:(id) arg0;
+ (NSString*) getConstructorDescriptorWithId:(id) arg0;
+ (NSString*) getMethodDescriptorWithId:(id) arg0;
- (int) getSize;
- (int) getOpcodeWithInt:(int) arg0;
@end
