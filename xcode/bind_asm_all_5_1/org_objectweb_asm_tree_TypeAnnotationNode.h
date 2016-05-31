#import <Foundation/Foundation.h>
#import "org_objectweb_asm_TypePath.h"

@interface org_objectweb_asm_tree_TypeAnnotationNode : NSObject

+ (org_objectweb_asm_tree_TypeAnnotationNode*)valueWithInt:(int)arg0 withTypePath:(org_objectweb_asm_TypePath*)arg1 withString:(NSString*)arg2;
+ (org_objectweb_asm_tree_TypeAnnotationNode*)valueWithInt:(int)arg0 withInt:(int)arg1 withTypePath:(org_objectweb_asm_TypePath*)arg2 withString:(NSString*)arg3;

@end