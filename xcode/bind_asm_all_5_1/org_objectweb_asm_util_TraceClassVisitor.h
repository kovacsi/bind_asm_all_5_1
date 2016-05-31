#import <Foundation/Foundation.h>
#import "org_objectweb_asm_Attribute.h"

@interface org_objectweb_asm_util_TraceClassVisitor : NSObject

+ (org_objectweb_asm_util_TraceClassVisitor*)valueWithPrintWriter:(id)arg0;
- (void)visitWithInt:(int)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withString:(id)arg5;
- (void)visitSourceWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (void)visitOuterClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (void)visitAttributeWithAttribute:(org_objectweb_asm_Attribute*)arg0;
- (void)visitInnerClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withInt:(int)arg3;
- (void)visitEnd;

@end