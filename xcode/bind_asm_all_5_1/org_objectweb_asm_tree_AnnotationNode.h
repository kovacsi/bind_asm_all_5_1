#import <Foundation/Foundation.h>

@interface org_objectweb_asm_tree_AnnotationNode : NSObject

+ (org_objectweb_asm_tree_AnnotationNode*)valueWithString:(NSString*)arg0;
+ (org_objectweb_asm_tree_AnnotationNode*)valueWithInt:(int)arg0 withString:(NSString*)arg1;
- (void)visitWithString:(NSString*)arg0 withObject:(id)arg1;
- (void)visitEnumWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (void)visitEnd;
- (void)checkWithInt:(int)arg0;

@end