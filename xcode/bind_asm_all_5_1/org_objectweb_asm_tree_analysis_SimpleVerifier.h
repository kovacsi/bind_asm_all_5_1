#import <Foundation/Foundation.h>
#import "org_objectweb_asm_Type.h"
#import "org_objectweb_asm_tree_analysis_BasicValue.h"

@interface org_objectweb_asm_tree_analysis_SimpleVerifier : NSObject

+ (org_objectweb_asm_tree_analysis_SimpleVerifier*)value;
+ (org_objectweb_asm_tree_analysis_SimpleVerifier*)valueWithType:(org_objectweb_asm_Type*)arg0 withType:(org_objectweb_asm_Type*)arg1 withBoolean:(bool)arg2;
+ (org_objectweb_asm_tree_analysis_SimpleVerifier*)valueWithType:(org_objectweb_asm_Type*)arg0 withType:(org_objectweb_asm_Type*)arg1 withList:(id)arg2 withBoolean:(bool)arg3;
- (void)setClassLoaderWithClassLoader:(id)arg0;
- (org_objectweb_asm_tree_analysis_BasicValue*)mergeWithBasicValue:(org_objectweb_asm_tree_analysis_BasicValue*)arg0 withBasicValue:(org_objectweb_asm_tree_analysis_BasicValue*)arg1;
- (id)mergeWithValue:(id)arg0 withValue:(id)arg1;
- (id)newValueWithType:(org_objectweb_asm_Type*)arg0;

@end