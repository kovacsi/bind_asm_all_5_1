#import <Foundation/Foundation.h>
#import "org_objectweb_asm_xml_SAXAdapter.h"

@interface org_objectweb_asm_xml_SAXFieldAdapter : NSObject

+ (org_objectweb_asm_xml_SAXFieldAdapter*)valueWithSAXAdapter:(org_objectweb_asm_xml_SAXAdapter*)arg0 withAttributes:(id)arg1;
- (void)visitEnd;

@end