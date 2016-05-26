#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_util_CheckClassAdapter : NSObject
+ (void) mainWithString:(id) arg0;
+ (void) verifyWithClassReaderWithClassLoaderWithBooleanWithPrintWriter:(id) arg0 :(id) arg1 :(bool) arg2 :(id) arg3;
+ (void) verifyWithClassReaderWithBooleanWithPrintWriter:(id) arg0 :(bool) arg1 :(id) arg2;
+ (x_org_objectweb_asm_util_CheckClassAdapter*) valueWithClassVisitor:(id) arg0;
+ (x_org_objectweb_asm_util_CheckClassAdapter*) valueWithClassVisitorWithBoolean:(id) arg0 :(bool) arg1;
- (void) visitWithIntWithIntWithStringWithStringWithStringWithString:(int) arg0 :(int) arg1 :(NSString*) arg2 :(NSString*) arg3 :(NSString*) arg4 :(id) arg5;
- (void) visitSourceWithStringWithString:(NSString*) arg0 :(NSString*) arg1;
- (void) visitOuterClassWithStringWithStringWithString:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2;
- (void) visitInnerClassWithStringWithStringWithStringWithInt:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2 :(int) arg3;
- (id) visitFieldWithIntWithStringWithStringWithStringWithObject:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3 :(NSObject*) arg4;
- (id) visitMethodWithIntWithStringWithStringWithStringWithString:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3 :(id) arg4;
- (id) visitAnnotationWithStringWithBoolean:(NSString*) arg0 :(bool) arg1;
- (id) visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (void) visitAttributeWithAttribute:(id) arg0;
- (void) visitEnd;
+ (void) checkClassSignatureWithString:(NSString*) arg0;
+ (void) checkMethodSignatureWithString:(NSString*) arg0;
+ (void) checkFieldSignatureWithString:(NSString*) arg0;
@end
