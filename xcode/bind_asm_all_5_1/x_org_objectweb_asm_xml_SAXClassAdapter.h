#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_xml_SAXClassAdapter : NSObject
+ (x_org_objectweb_asm_xml_SAXClassAdapter*) valueWithContentHandlerWithBoolean:(id) arg0 :(bool) arg1;
- (void) visitSourceWithStringWithString:(NSString*) arg0 :(NSString*) arg1;
- (void) visitOuterClassWithStringWithStringWithString:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2;
- (id) visitAnnotationWithStringWithBoolean:(NSString*) arg0 :(bool) arg1;
- (id) visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (void) visitWithIntWithIntWithStringWithStringWithStringWithString:(int) arg0 :(int) arg1 :(NSString*) arg2 :(NSString*) arg3 :(NSString*) arg4 :(id) arg5;
- (id) visitFieldWithIntWithStringWithStringWithStringWithObject:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3 :(NSObject*) arg4;
- (id) visitMethodWithIntWithStringWithStringWithStringWithString:(int) arg0 :(NSString*) arg1 :(NSString*) arg2 :(NSString*) arg3 :(id) arg4;
- (void) visitInnerClassWithStringWithStringWithStringWithInt:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2 :(int) arg3;
- (void) visitEnd;
@end
