#import <Foundation/Foundation.h>
#import "org_objectweb_asm_Attribute.h"

@interface org_objectweb_asm_tree_FieldNode : NSObject

+ (org_objectweb_asm_tree_FieldNode*)valueWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withObject:(id)arg4;
+ (org_objectweb_asm_tree_FieldNode*)valueWithInt:(int)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withObject:(id)arg5;
- (void)visitAttributeWithAttribute:(org_objectweb_asm_Attribute*)arg0;
- (void)visitEnd;
- (void)checkWithInt:(int)arg0;

@end