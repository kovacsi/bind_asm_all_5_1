#import <Foundation/Foundation.h>
#import "org_objectweb_asm_tree_analysis_SourceValue.h"
#import "org_objectweb_asm_Type.h"

@interface org_objectweb_asm_tree_analysis_SourceInterpreter : NSObject

+ (org_objectweb_asm_tree_analysis_SourceInterpreter*)value;
- (org_objectweb_asm_tree_analysis_SourceValue*)mergeWithSourceValue:(org_objectweb_asm_tree_analysis_SourceValue*)arg0 withSourceValue:(org_objectweb_asm_tree_analysis_SourceValue*)arg1;
- (id)mergeWithValue:(id)arg0 withValue:(id)arg1;
- (id)newValueWithType:(org_objectweb_asm_Type*)arg0;

@end