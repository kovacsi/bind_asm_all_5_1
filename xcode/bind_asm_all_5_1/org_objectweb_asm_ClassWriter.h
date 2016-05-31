#import <Foundation/Foundation.h>
#import "org_objectweb_asm_ClassReader.h"
#import "org_objectweb_asm_Attribute.h"
#import "org_objectweb_asm_Handle.h"

@interface org_objectweb_asm_ClassWriter : NSObject

+ (org_objectweb_asm_ClassWriter*)valueWithInt:(int)arg0;
+ (org_objectweb_asm_ClassWriter*)valueWithClassReader:(org_objectweb_asm_ClassReader*)arg0 withInt:(int)arg1;
- (void)visitWithInt:(int)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withString:(id)arg5;
- (void)visitSourceWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (void)visitOuterClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (void)visitAttributeWithAttribute:(org_objectweb_asm_Attribute*)arg0;
- (void)visitInnerClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withInt:(int)arg3;
- (void)visitEnd;
- (id)toByteArray;
- (int)newConstWithObject:(id)arg0;
- (int)newUTF8WithString:(NSString*)arg0;
- (int)newClassWithString:(NSString*)arg0;
- (int)newMethodTypeWithString:(NSString*)arg0;
- (int)newHandleWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
- (int)newHandleWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4;
- (int)newInvokeDynamicWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(org_objectweb_asm_Handle*)arg2 withObject:(id)arg3;
- (int)newFieldWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (int)newMethodWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (int)newNameTypeWithString:(NSString*)arg0 withString:(NSString*)arg1;

@end