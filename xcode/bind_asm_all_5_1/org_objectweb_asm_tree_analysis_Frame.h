#import <Foundation/Foundation.h>

@interface org_objectweb_asm_tree_analysis_Frame : NSObject

+ (org_objectweb_asm_tree_analysis_Frame*)valueWithInt:(int)arg0 withInt:(int)arg1;
+ (org_objectweb_asm_tree_analysis_Frame*)valueWithFrame:(org_objectweb_asm_tree_analysis_Frame*)arg0;
- (org_objectweb_asm_tree_analysis_Frame*)initWithFrame:(org_objectweb_asm_tree_analysis_Frame*)arg0;
- (void)setReturnWithValue:(id)arg0;
- (int)getLocals;
- (int)getMaxStackSize;
- (id)getLocalWithInt:(int)arg0;
- (void)setLocalWithInt:(int)arg0 withValue:(id)arg1;
- (int)getStackSize;
- (id)getStackWithInt:(int)arg0;
- (void)clearStack;
- (id)pop;
- (void)pushWithValue:(id)arg0;
- (bool)mergeWithFrame:(org_objectweb_asm_tree_analysis_Frame*)arg0 withBoolean:(id)arg1;
- (NSString*)toString;

@end