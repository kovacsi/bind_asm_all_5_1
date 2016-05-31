#import <Foundation/Foundation.h>
#import "org_objectweb_asm_tree_analysis_BasicValue.h"
#import "org_objectweb_asm_Type.h"

@interface org_objectweb_asm_tree_analysis_BasicInterpreter : NSObject

+ (org_objectweb_asm_tree_analysis_BasicInterpreter*)value;
- (org_objectweb_asm_tree_analysis_BasicValue*)mergeWithBasicValue:(org_objectweb_asm_tree_analysis_BasicValue*)arg0 withBasicValue:(org_objectweb_asm_tree_analysis_BasicValue*)arg1;
- (id)mergeWithValue:(id)arg0 withValue:(id)arg1;
- (id)newValueWithType:(org_objectweb_asm_Type*)arg0;

@end