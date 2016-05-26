#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_ClassWriter : NSObject
+ (x_org_objectweb_asm_ClassWriter*) valueWithInt:(int) arg0;
+ (x_org_objectweb_asm_ClassWriter*) valueWithClassReaderWithInt:(id) arg0 :(int) arg1;
- (void) visitWithIntWithIntWithStringWithStringWithStringWithString:(int) arg0 :(int) arg1 :(NSString*) arg2 :(NSString*) arg3 :(NSString*) arg4 :(id) arg5;
- (void) visitSourceWithStringWithString:(NSString*) arg0 :(NSString*) arg1;
- (void) visitOuterClassWithStringWithStringWithString:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2;
- (id) visitAnnotationWithStringWithBoolean:(NSString*) arg0 :(bool) arg1;
- (id) visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (void) visitAttributeWithAttribute:(id) arg0;
- (void) visitInnerClassWithStringWithStringWithStringWithInt:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2 :(int) arg3;
- (id) visitFieldWithIntWithStringWithStringWithStringWithObject:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3 :(NSObject*) arg4;
- (id) visitMethodWithIntWithStringWithStringWithStringWithString:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3 :(id) arg4;
- (void) visitEnd;
- (id) toByteArray;
- (int) newConstWithObject:(NSObject*) arg0;
- (int) newUTF8WithString:(NSString*) arg0;
- (int) newClassWithString:(NSString*) arg0;
- (int) newMethodTypeWithString:(NSString*) arg0;
- (int) newHandleWithIntWithStringWithStringWithString:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3;
- (int) newHandleWithIntWithStringWithStringWithStringWithBoolean:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3 :(bool) arg4;
- (int) newInvokeDynamicWithStringWithStringWithHandleWithObject:(NSString*) arg0 :(NSString*) arg1 :(id) arg2 :(id) arg3;
- (int) newFieldWithStringWithStringWithString:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2;
- (int) newMethodWithStringWithStringWithStringWithBoolean:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2 :(bool) arg3;
- (int) newNameTypeWithStringWithString:(NSString*) arg0 :(NSString*) arg1;
@end
