#import <Foundation/Foundation.h>

@interface org_objectweb_asm_tree_analysis_SourceValue : NSObject

+ (org_objectweb_asm_tree_analysis_SourceValue*)valueWithInt:(int)arg0;
+ (org_objectweb_asm_tree_analysis_SourceValue*)valueWithInt:(int)arg0 withSet:(id)arg1;
- (int)getSize;
- (bool)equalsWithObject:(id)arg0;
- (int)hashCode;

@end