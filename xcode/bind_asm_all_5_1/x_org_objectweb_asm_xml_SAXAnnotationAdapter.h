#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_xml_SAXAnnotationAdapter : NSObject
+ (x_org_objectweb_asm_xml_SAXAnnotationAdapter*) valueWithSAXAdapterWithStringWithIntWithStringWithString:(id) arg0 :(NSString*) arg1 :(int) arg2 :(NSString*) arg3 :(NSString*) arg4;
+ (x_org_objectweb_asm_xml_SAXAnnotationAdapter*) valueWithSAXAdapterWithStringWithIntWithIntWithString:(id) arg0 :(NSString*) arg1 :(int) arg2 :(int) arg3 :(NSString*) arg4;
+ (x_org_objectweb_asm_xml_SAXAnnotationAdapter*) valueWithSAXAdapterWithStringWithIntWithStringWithStringWithIntWithTypePath:(id) arg0 :(NSString*) arg1 :(int) arg2 :(NSString*) arg3 :(NSString*) arg4 :(int) arg5 :(id) arg6;
+ (x_org_objectweb_asm_xml_SAXAnnotationAdapter*) valueWithSAXAdapterWithStringWithIntWithStringWithStringWithIntWithTypePathWithStringWithStringWithInt:(id) arg0 :(NSString*) arg1 :(int) arg2 :(NSString*) arg3 :(NSString*) arg4 :(int) arg5 :(id) arg6 :(id) arg7 :(id) arg8 :(id) arg9;
- (void) visitWithStringWithObject:(NSString*) arg0 :(NSObject*) arg1;
- (void) visitEnumWithStringWithStringWithString:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2;
- (id) visitAnnotationWithStringWithString:(NSString*) arg0 :(NSString*) arg1;
- (id) visitArrayWithString:(NSString*) arg0;
- (void) visitEnd;
@end
