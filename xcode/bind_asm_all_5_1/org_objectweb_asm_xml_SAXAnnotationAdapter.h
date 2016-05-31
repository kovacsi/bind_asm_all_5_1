#import <Foundation/Foundation.h>
#import "org_objectweb_asm_xml_SAXAdapter.h"
#import "org_objectweb_asm_TypePath.h"

@interface org_objectweb_asm_xml_SAXAnnotationAdapter : NSObject

+ (org_objectweb_asm_xml_SAXAnnotationAdapter*)valueWithSAXAdapter:(org_objectweb_asm_xml_SAXAdapter*)arg0 withString:(NSString*)arg1 withInt:(int)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4;
+ (org_objectweb_asm_xml_SAXAnnotationAdapter*)valueWithSAXAdapter:(org_objectweb_asm_xml_SAXAdapter*)arg0 withString:(NSString*)arg1 withInt:(int)arg2 withInt:(int)arg3 withString:(NSString*)arg4;
+ (org_objectweb_asm_xml_SAXAnnotationAdapter*)valueWithSAXAdapter:(org_objectweb_asm_xml_SAXAdapter*)arg0 withString:(NSString*)arg1 withInt:(int)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withInt:(int)arg5 withTypePath:(org_objectweb_asm_TypePath*)arg6;
+ (org_objectweb_asm_xml_SAXAnnotationAdapter*)valueWithSAXAdapter:(org_objectweb_asm_xml_SAXAdapter*)arg0 withString:(NSString*)arg1 withInt:(int)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withInt:(int)arg5 withTypePath:(org_objectweb_asm_TypePath*)arg6 withString:(id)arg7 withString:(id)arg8 withInt:(id)arg9;
- (void)visitWithString:(NSString*)arg0 withObject:(id)arg1;
- (void)visitEnumWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (void)visitEnd;

@end